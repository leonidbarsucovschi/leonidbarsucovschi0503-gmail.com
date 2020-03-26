 <%--
 *
 * composite_iframe_utils_js.jsp
 *
 * Copyright (c) 2005 UTI Systems. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of UTI Systems.
 *
--%>

<%@ page language="java" %>
<%@ page contentType="text/javascript; charset=iso-8859-2" %>

<%@ page import="ro.uti.jpf.base.composite.util.CompositePresentationConst"%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositeConstants"%>

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
var RESET_IFRAME_CONTENT = true;
var IFRAME_BLANK_CONTENT = "<html><body><!-- NO CONTENT --></body></html>";

<%------------------------------------------------------------------------------
    Copies the content of a component to parent window.

    @componentID      the ID of the component
------------------------------------------------------------------------------%>

function compositeCopyComponentContentToParent(componentID) {
    if (typeof(componentID) != "string") {
        alert("compositeCopyComponentContentToParent: invalid function arguments");
        return;
    }

    var elementID = "<%=CompositePresentationConst.COMPONENT_ELEMENT_ID_PREFIX%>"
            + componentID;

    var parentElement = parent.document.getElementById(elementID);

    if (parentElement == null) {
        alert("compositeCopyComponentContentToParent: missing element in "
                + "parent window: " + elementID);
        return;
    }

    var localElement = document.getElementById(elementID);

    if (localElement == null) {
        alert("compositeCopyComponentContentToParent: missing local element "
                + "with id=" + elementID);
        return;
    }

    compositeCopyElements(parentElement, localElement);
}

<%------------------------------------------------------------------------------
    Copies the content of one element to another element.

    @destElement      destination element
    @srcElement       source element
------------------------------------------------------------------------------%>
function compositeCopyElements(destElement, srcElement) {
    if (arguments.length != 2) {
        alert("compositeCopyElementContent: invalid number of arguments");
    }

    destElement.innerHTML = srcElement.innerHTML;
    compositeCopyJavaScriptElements(destElement, srcElement);
}

<%------------------------------------------------------------------------------
    Copies JavaScript elements (SCRIPT tags) from one DOM element to
    another element.

    @destElement      destination element
    @srcElement       source element
------------------------------------------------------------------------------%>
function compositeCopyJavaScriptElements(destElement, srcElement) {
    var elements = srcElement.getElementsByTagName("SCRIPT");

    for (var i = 0; i < elements.length; i++) {
        var localElm = elements.item(i);
        var elm = destElement.ownerDocument.createElement("SCRIPT");

        elm.type = compositeRestoreJavaScriptAttribute(localElm.type);
        elm.language = compositeRestoreJavaScriptAttribute(localElm.language);

        <%-- the SCRIPT node must be appended to destination element
        before setting it's content, otherwise it may be executed twice (Opera
        v8) or the browser may crash (Internet Explorer v6). --%>

        destElement.appendChild(elm);
        elm.text = localElm.text;
    }
}

<%------------------------------------------------------------------------------
    Restores the original value for a SCRIPT attribute that was filtered by
    server when the response including the SCRIPT element was generated.

    @attrValue        filtered value

    Returns the original value of the attribute.
------------------------------------------------------------------------------%>
function compositeRestoreJavaScriptAttribute(attrValue) {
    if (attrValue == null) {
        return null;
    }

    var prefix = "<%=CompositeConstants.JSSCRIPT_FILTERED_ATTR_PREFIX%>";

    if (attrValue.indexOf(prefix) == 0) {
        return attrValue.substring(prefix.length, attrValue.length);
    } else {
        return attrValue;
    }
}

<%------------------------------------------------------------------------------
    Updates the transactional token of the FORM(s) from the parent of
    an IFRAME.

    @tokenValue       token's value; if not specified, the first value from
                      IFRAME's forms will be used
------------------------------------------------------------------------------%>
function compositeUpdateParentTransactionalTokenFromIFrame(tokenValue) {
    var tokenElementName = "<%=org.apache.struts.taglib.html.Constants.TOKEN_KEY%>";

    if (typeof(tokenValue) == "undefined") {
        tokenValue = document.getElementsByName(tokenElementName).item(0).value;
    }

    var parentElements = parent.document.getElementsByName(tokenElementName);

    for (var i = 0; i < parentElements.length; i++) {
        parentElements.item(i).value = tokenValue;
    }
}

<%------------------------------------------------------------------------------
    Resets the content of current document. Used to clear the content of the
    IFRAME element, to prevent strange bugs when the user uses BACK
    button.

    @since v2.0.1
------------------------------------------------------------------------------%>
function compositeClearIFrameContent() {
    document.open();
    document.write(IFRAME_BLANK_CONTENT);
    document.close();
}
