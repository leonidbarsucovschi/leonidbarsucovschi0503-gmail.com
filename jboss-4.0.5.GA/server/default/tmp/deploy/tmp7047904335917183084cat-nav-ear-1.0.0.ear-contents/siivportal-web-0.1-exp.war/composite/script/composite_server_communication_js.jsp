<%--
 *
 * composite_server_communication_js.jsp
 *
 * Copyright (c) 2005 UTI Systems. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of UTI Systems.
 *
--%>

<%@ page language="java" %>
<%@ page contentType="text/javascript; charset=iso-8859-2"%>

<%-- imports --%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositePresentationConst" %>
<%@ page import="ro.uti.jpf.base.composite.util.CompositeConstants" %>

<%-- taglibs --%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<%------------------------------------------------------------------------------
    A boolean flag specifying if AJAX concept should be used for communication
    with server (only if this is possible).
------------------------------------------------------------------------------%>
var COMPOSITE_USE_AJAX_IF_POSSIBLE = true;

<%------------------------------------------------------------------------------
    The XMLHttpRequest function to be used for sending requests to server (only
    if usage of AJAX concept is enabled).
------------------------------------------------------------------------------%>
if (typeof(XMLHttpRequest) == "undefined") {
    XMLHttpRequest = function() {
        return new ActiveXObject("Microsoft.XMLHTTP");
    };
}

<%------------------------------------------------------------------------------
    Checks to see if form's elements can be encoded.

    Returns TRUE if form's elements can be encoded, FALSE otherwise.
------------------------------------------------------------------------------%>
function compositeFormElementsCanBeEncoded(form) {
    if (typeof(form) != "object") {
        alert("compositeFormElementsCanBeEncoded: invalid form argument");
        return;
    }

    <%-- theoretically all form's elements can be encoded if there're no FILEs
         with a value--%>
    return !compositeFormContainsFiles(form);
}

<%------------------------------------------------------------------------------
    Checks to see if the form contains FILE elements.

    Returns TRUE or FALSE.
------------------------------------------------------------------------------%>
function compositeFormContainsFiles(form) {
    if (typeof(form) != "object") {
        alert("compositeFormContainsFiles: invalid form argument");
    }

    for (var i = 0; i < form.elements.length; i++) {
        if (form.elements[i].type == "file") {
            if (compositeTrim(form.elements[i].value).length > 0) {
                return true;
            }
        }
    }

    return false;
}

<%------------------------------------------------------------------------------
    Creates an encoded string with all form's elements. The result can be used
    as content in a HTTP POST request.

    The function tries to create the same content as browser does, but it
    has some limitations. For example, it is impossible to encode FILE elements,
    because there's no way to access user's local file system to retrieve
    files content.

    Returns a string with form's encoded data if succeeds, NULL otherwise.
------------------------------------------------------------------------------%>
function compositeEncodeFormData(form) {
    if (typeof(form) != "object") {
        alert("compositeEncodeFormData: invalid form argument");
        return;
    }

    var result = new String();

    for (var i = 0; i < form.elements.length; i++) {
        var name = form.elements[i].name;

          var isDisabled = typeof(form.elements[i].disabled) == "boolean"
                ? form.elements[i].disabled : true;

        if ((name.length == 0) || isDisabled) {
            continue;
        }

        var values = compositeGetFormElementValues(form.elements[i]);

        if (values == null) {
            return null;
        }

		    while (values.length > 0) {
	            result = result + ((result.length > 0) ? "&" : "")
					            + encodeURIComponent(name) + "="
                      + encodeURIComponent(values.pop());
		    }
    }

    return result;
}

<%------------------------------------------------------------------------------
    Getter for the values of a form element.

    @element          the element for which to retrieve the values

    Returns an array with element's values if succeeds, NULL otherwise. If
    the element has no values, an empty array will be returned.
------------------------------------------------------------------------------%>
function compositeGetFormElementValues(element) {
    <%-- simple FORM elements --%>
    if ((element.type == "hidden") || (element.type == "text")
            || (element.type == "password") || (element.type == "textarea")) {
        return [element.value];
    }

    <%-- radio & checkbox buttons --%>
    if ((element.type == "checkbox") || (element.type == "radio")) {
		return !element.checked ? new Array() : [element.value];
    }

    <%-- select FORM elements --%>
    if ((element.type == "select-one") || (element.type == "select-multiple")) {
        return compositeGetSelectFormElementValues(element);
    }

    <%-- submit buttons or simple buttons --%>
    if ((element.type == "submit") || (element.type == "button")) {
		    return "";
	  }

    <%-- unsported/unknown elements --%>
    if (element.type == "file") {
        if (compositeTrim(element.value).length == 0) {
            return "";
        }
    }

    return null;
}

<%------------------------------------------------------------------------------
    Getter for the values for a SELECT form element.

    @element          the select element for which to retrieve the values

    Returns an array with element's values if succeeds, NULL otherwise. If the
    element has no values, an empty array will be returned instead.
------------------------------------------------------------------------------%>
function compositeGetSelectFormElementValues(element) {
    if (typeof(element) == "unknown") {
        alert("compositeGetSelectFormElementValues: missing element argument!");
        return null;
    }

	  var result = new Array();

	  if (element.type == "select-multiple") {
		    for (var i = 0; i < element.options.length; i++) {
		      	if (element.options[i].selected) {
				        result.push(element.options[i].value);
			      }
		    }
	  } else {
		    if (element.selectedIndex >= 0) {
			      result.push(element.options[element.selectedIndex].value);
		    }
	  }

	  return result;
}

<%------------------------------------------------------------------------------
    Generic function for submitting a FORM for a composite entity.
------------------------------------------------------------------------------%>
function compositeSubmitFormToHiddenFrame(form) {
    if (typeof(form) != "object") {
        alert("compositeSubmitFormToHiddenFrame: invalid form argument");
        return;
    }

    var useAJAX = COMPOSITE_USE_AJAX_IF_POSSIBLE
            ? compositeFormElementsCanBeEncoded(form) : false;

    if (useAJAX) {
        compositeSubmitFormUsingAJAX(form);
    } else {
        compositeSubmitFormUsingStandardWay(form);
    }
}

<%------------------------------------------------------------------------------
    Submits the FORM for a composite entity using AJAX concept (XMLHttpRequest
    function).
------------------------------------------------------------------------------%>
function compositeSubmitFormUsingAJAX(form) {
    if (typeof(form) != "object") {
        alert("compositeSubmitFormUsingAJAX: invalid form argument");
        return;
    }

    var postData = compositeEncodeFormData(form);

    if (postData == null) {
        alert("compositeSubmitFormUsingAJAX: form data cannot be encoded!");
        return;
    }

    var xmlhttp = new XMLHttpRequest();

    xmlhttp.open("POST", form.action, false);
    xmlhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xmlhttp.setRequestHeader("Accept-Charset",'UTF-8');

    <%-- The last header seems to cause problems for IE, which freezes. But
    it is required for an old version of Mozilla...
    xmlhttp.setRequestHeader("Content-length", postData.length);
    xmlhttp.setRequestHeader("Connection", "close");
    --%>

    try {
        xmlhttp.send(postData);
    } catch (e) {
        alert("compositeSubmitFormUsingAJAX failed: " + e);
        return;
    }

    if (xmlhttp.status != 200) {
        alert("<bean:message key="composite.error.communication" bundle="<%=CompositeConstants.COMPOSITE_MESSAGES_BUNDLE%>"/>");
        return;
    }

    var frame = window.frames["<%=CompositePresentationConst.HIDDEN_IFRAME_NAME%>"];

    frame.document.open();
    frame.document.write(xmlhttp.responseText);
    frame.document.close();
}

<%------------------------------------------------------------------------------
    Submits the FORM for a composite entity using standard way.

    @form             the form
------------------------------------------------------------------------------%>

function compositeSubmitFormUsingStandardWay(form) {
    if (typeof(form) != "object") {
        alert("compositeSubmitFormUsingStandardWay: invalid form argument");
        return;
    }

    var frame = document.getElementById(
        "<%=CompositePresentationConst.HIDDEN_IFRAME_ID%>");

    form.encoding = compositeGetFormEncoding(form);
    form.target = frame.name;
    form.submit();
}

<%------------------------------------------------------------------------------
    Getter for the encoding to be used when the form is submitted
    using standard way.

    @form             the form

    Returns the encoding.
------------------------------------------------------------------------------%>

function compositeGetFormEncoding(form) {
    if (typeof(form) != "object") {
        alert("compostieGetFormEncoding: invalid form argument");
        return;
    }

    return compositeFormContainsFiles(form) ? "multipart/form-data"
            : "application/x-www-form-urlencoded";
}
