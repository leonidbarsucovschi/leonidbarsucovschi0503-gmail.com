<%--
 *
 * jportal_form_submit_js.jsp
 *
 * Copyright (c) 2006 UTI Systems. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of UTI Systems.
 *
--%>

<%@ page language="java" %>
<%@ page contentType="text/javascript; charset=iso-8859-2"%>

<%------------------------------------------------------------------------------

    Submitter for a HTML form.

    It supports two modes: standard submits or submitting using AJAX
    technology. The latest mode is not supported if form's data cannot be
    encoded (contains a FILE element that have a value for example).

    Usage is very simple:

      var submitter = new JpfFormSubmit(formElm);
      submitter.submit();

------------------------------------------------------------------------------%>


<%------------------------------------------------------------------------------
    Specifies how the form will be submited to server.
------------------------------------------------------------------------------%>

var JPF_FORM_SUBMIT_BEST      = 0x00; /* AJAX if possible */
var JPF_FORM_SUBMIT_NORMAL    = 0x01; /* standard way, using submit() method */
var JPF_FORM_SUBMIT_AJAX      = 0x02; /* always AJAX, failes otherwise */

<%------------------------------------------------------------------------------
    Constructs a new "JpfFormSubmit" instance.

    formElmOrId
------------------------------------------------------------------------------%>

function JpfFormSubmit(formElmOrId) {
    this.formElm = (typeof(formElmOrId) == "string")
            ? document.getElementById(formElmOrId) : formElmOrId;

    this.submitMode = JPF_FORM_SUBMIT_BEST;

    this.submitFunction = this.formElm.submit;
    this.callOnSubmit = true;
    this.formAction = this.formElm.action;
    this.formEncoding = this.getFormBestEncoding();
    this.formTarget = this.formElm.target;
}

<%------------------------------------------------------------------------------
    Setter for the function to be used for submitting the form using
    standard way. By default form's "submit()" function is
    used.

    value   the function
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.setSubmitFunction = function(value) {
    this.submitFunction = value;
}

<%------------------------------------------------------------------------------
    Setter for the flag that specifies if form's "onsubmit" function should
    be called before submitting. If TRUE, the form will be submitted
    only if form's "onsubmit" returns TRUE.

    value   the value
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.setCallOnSubmit = function(value) {
    this.callOnSubmit = value;
}

<%------------------------------------------------------------------------------
    Setter for form's action attribute (the URL of the server side resource
    which handles the request).

    value   the value
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.setAction = function(value) {
    this.formAction = value;
}

<%------------------------------------------------------------------------------
    Setter for form's target.

    value   the value
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.setTarget = function(value) {
    this.formTarget = value;
}

<%------------------------------------------------------------------------------
    Setter for form's submit mode.

    value   the value
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.setSubmitMode = function(value) {
    this.submitMode = value;
}

<%------------------------------------------------------------------------------
    Submits the form.

    Returns TRUE if succeeds, FALSE otherwise.
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.submit = function() {
    var normalSubmit = (this.submitMode == JPF_FORM_SUBMIT_NORMAL);
    var canUseAjax = this.formElementsCanBeEncoded();

    if (this.submitMode == JPF_FORM_SUBMIT_AJAX) {
        if (!canUseAjax) {
            throw new "form cannot be submitted using AJAX technology";
        }
    }

    if (this.submitMode == JPF_FORM_SUBMIT_BEST) {
        normalSubmit = !canUseAjax;
    }

    if (this.callOnSubmit) {
        if (typeof(this.formElm.onsubmit) == "function") {
            if (!this.formElm.onsubmit()) {
                return true;
            }
        }
    }

    return normalSubmit ? this.submitFormUsingNormalWay()
            : this.submitFormUsingAjax();
}

<%------------------------------------------------------------------------------
    Submits the form using normal way. The function should not be called
    directly by developers.

    Returns TRUE if succeeds, FALSE otherwise.
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.submitFormUsingNormalWay = function() {
    this.formElm.action = this.formAction;
    this.formElm.encoding = this.formEncoding;
    this.formElm.target = this.formTarget;

    <%-- calling the "this.submitFunction" directly causes a JavaScript error
    under Firefox v1.0.4 --%>

    this.formElm.jpfFormSubmit = this.submitFunction;
    this.formElm.jpfFormSubmit();

    return true;
}

<%------------------------------------------------------------------------------
    Submits the form using AJAX technology. The function should not be called
    directly by developers. The response received back from server will
    be written into form's target window.

    Returns TRUE if succeeds, FALSE otherwise.
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.submitFormUsingAjax = function() {
    var postData = this.encodeFormData();

    if (postData == null) {
        throw new "form data cannot be encoded";
    }

    var httpRequest = new JpfHttpRequest(this.formAction, postData);
    var response = httpRequest.send();

    if (response == null) {
        return false;
    }

    if (this.formTarget.length > 0) {
        var wnd = window.frames[this.formTarget];
    } else {
        var wnd = window;
    }

    wnd.document.open();
    wnd.document.write(response);
    wnd.document.close();

    return true;
}

<%------------------------------------------------------------------------------
    Verifies if form's elements can be encoded.

    Returns TRUE if form's elements can be encoded, FALSE otherwise.
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.formElementsCanBeEncoded = function() {
    <%-- theoretically all form's elements can be encoded if there're no FILEs
         with a value--%>
    return !this.formContainsFiles();
}

<%------------------------------------------------------------------------------
    Verifies if the form contains at least one FILE element that have
    a value specified.

    Returns TRUE if there's a FILE element with a value
    specified, FALSE otherwise.
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.formContainsFiles = function() {
    for (var i = 0; i < this.formElm.elements.length; i++) {
        if (this.formElm.elements[i].type == "file") {
            if (JpfUtils.trim(this.formElm.elements[i].value).length > 0) {
                return true;
            }
        }
    }

    return false;
}

<%------------------------------------------------------------------------------
    Creates an encoded string with all form's elements. The result can be used
    as content in a HTTP request.

    The function tries to create the same content as browser does, but it
    has some limitations. For example, it is impossible to encode FILE elements,
    because there's no way to access user's local file system to retrieve
    files content.

    Returns a string with form's encoded data if succeeds, NULL otherwise.
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.encodeFormData = function() {
    var result = new String();

    for (var i = 0; i < this.formElm.elements.length; i++) {
        var name = this.formElm.elements[i].name;

        var isDisabled = typeof(this.formElm.elements[i].disabled) == "boolean"
                ? this.formElm.elements[i].disabled : true;

        if ((name.length == 0) || isDisabled) {
            continue;
        }

        var values = this.getFormElementValues(this.formElm.elements[i]);

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

    element   the element for which to retrieve the values

    Returns an array with element's values if succeeds, NULL otherwise. If
    the element has no values, an empty array will be returned.
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.getFormElementValues = function(element) {
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
        return this.getSelectFormElementValues(element);
    }

    <%-- submit buttons or simple buttons --%>
    if ((element.type == "submit") || (element.type == "button")) {
        return "";
    }

    <%-- unsported/unknown elements --%>
    if (element.type == "file") {
        if (JpfUtils.trim(element.value).length == 0) {
            return "";
        }
    }

    return null;
}

<%------------------------------------------------------------------------------
    Getter for the values for a SELECT form element.

    element   the select element for which to retrieve the values

    Returns an array with element's values if succeeds, NULL otherwise. If the
    element has no values, an empty array will be returned instead.
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.getSelectFormElementValues = function(element) {
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
    Getter for the recommended (best) encoding to be used when the form is
    submitted using standard (normal) way.

    Returns the encoding.
------------------------------------------------------------------------------%>

JpfFormSubmit.prototype.getFormBestEncoding = function() {
    return this.formContainsFiles(this.formElm) ? "multipart/form-data"
            : "application/x-www-form-urlencoded";
}
