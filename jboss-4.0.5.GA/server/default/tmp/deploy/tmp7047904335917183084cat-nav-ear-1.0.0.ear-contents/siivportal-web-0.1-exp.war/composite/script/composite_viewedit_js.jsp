<%--
 *
 * composite_viewedit_js.jsp
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

<%-- imports --%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositePresentationConst"%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositeConstants"%>

<%-- taglibs --%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<%------------------------------------------------------------------------------
    A list with types for elements that belongs to a FORM.
------------------------------------------------------------------------------%>
var compositeFormElementTypes = ["hidden", "text", "password", "textarea",
    "select-one", "select-multiple", "radio", "checkbox",
    "file"];

<%------------------------------------------------------------------------------
    Calls the "component loaded" function for a component.

    Each component JSP page for a component must define a JavaScript function
    which will be called when the page is loaded. The name of the function must
    be:
        <COMPONENT ID> <COMPONENT_LOADED_JSFCT_SUFFIX>

    @componentID      the ID of the component
------------------------------------------------------------------------------%>
function compositeCallComponentPageLoadedFunction(componentID) {
    if (typeof(componentID) != "string") {
        alert("compositeCallComponentPageLoadedFunction: invalid component: "
                + componentID);
        return;
    }

    var fname = componentID + "<%=CompositePresentationConst.COMPONENT_LOADED_JSFCT_SUFFIX%>";

    if (eval("typeof(" + fname + ")") != "function") {
        alert("compositeCallComponentPageLoadedFunction: '" + fname
            + "' is missing or is not a function!");

        return;
    }

    eval(fname + "()");
}

<%------------------------------------------------------------------------------
    Checks to see if a component requires validation.

    Each JSP page for a component must define a JavaScript function
    which will be called before composite form is submitted to see if component
    requires validation. The name of the function must be:
        <COMPONENT ID><COMPONENT_REQUIRES_VALIDATION_JSFCT_SUFFIX>

    @componentID      the ID of the component

    Returns TRUE if the component requires validation, FALSE otherwise.
------------------------------------------------------------------------------%>
function compositeComponentRequiresValidation(componentID) {
    if (typeof(componentID) != "string") {
        alert("compositeComponentRequiresValidation: invalid component ID");
        return false;
    }

    var fname = componentID
        + "<%=CompositePresentationConst.COMPONENT_REQUIRES_VALIDATION_JSFCT_SUFFIX%>";

    if (eval("typeof(" + fname + ")") != "function") {
        alert("compositeComponentRequiresValidation: '" + fname
            + "' is missing or is not a function!");

        return false;
    }

    return eval(fname + "()");
}

<%------------------------------------------------------------------------------
    Changes the visibility of the HTML element that contains a component.

    If "visible" is not specified or is FALSE, the function simply toggles
    component's visibility.

    @componentID      the ID of the component
    @visible          component's visibility flag
------------------------------------------------------------------------------%>
function compositeChangeComponentVisibility(componentID, visible) {
    if (typeof(componentID) != "string") {
        alert("compositeChangeComponentVisibility: invalid component: " + componentID);
        return;
    }

    var elemID = "<%=CompositePresentationConst.COMPONENT_ELEMENT_ID_PREFIX%>"
        + componentID;

    var elem = document.getElementById(elemID);

    if (elem == null) {
        alert("compositeChangeComponentVisibility: element with ID=" + elemID + " is missing!");
        return;
    }

    visible = typeof(visible) == "boolean"
        ? visible : (elem.className == "composite-hidden");

    if (visible) {
        if (elem.className == "composite-hidden") {
            elem.className = typeof(elem.compositeSavedClassName) == "undefined"
                    ? "" : elem.compositeSavedClassName;
        }
    } else {
        if (elem.className != "composite-hidden") {
            elem.compositeSavedClassName = elem.className;
            elem.className = "composite-hidden";
        }
    }
}


<%------------------------------------------------------------------------------
    Setter for a component's messages.

    @componentID      the ID of the component; if NULL the method sets messags
                      as global messages/errors
    @messages         the list of messages (a simple string)
    @areErrors        if TRUE, specifies that the messages are errors
------------------------------------------------------------------------------%>
function compositeSetComponentMessages(componentID, messages, areErrors) {
    if (arguments.length != 3) {
        alert("compositeSetComponentMessages: invalid number of arguments");
        return;
    }

    if (componentID == null) {
        var elemID = areErrors? "<%=CompositePresentationConst.GLOBAL_ERRORS_ELEMENT_ID%>"
                : "<%=CompositePresentationConst.GLOBAL_MESSAGES_ELEMENT_ID%>";
    } else {
        var elemID = areErrors ? "<%=CompositePresentationConst.COMPONENT_ERRORS_ELEMENT_ID_PREFIX%>"
                : "<%=CompositePresentationConst.COMPONENT_MESSAGES_ELEMENT_ID_PREFIX%>";

        elemID = elemID + componentID;
    }

    var elem = document.getElementById(elemID);

    if (elem == null) {
        alert("compositeSetComponentMessages: element with ID=" + elemID + " is missing!");
        return;
    }

    compositeSetMessages(elem, messages, areErrors);

    if ((componentID != null) && (compositeTrim(messages).length > 0)) {
        compositeChangeComponentVisibility(componentID, true);
    }
}

<%------------------------------------------------------------------------------
    Helper function, that sets a list of messages.

    @elem             the HTML element (TD, DIV etc...) where to set the
                      messages
    @messages         the list of messages (a simple string)
    @areErrors        if TRUE, specifies that the messages are errors
------------------------------------------------------------------------------%>
function compositeSetMessages(elem, messages, areErrors) {
    if (arguments.length != 3) {
        alert("compositeSetMessages: invalid number of arguments");
        return;
    }

    var content = (messages == null) ? "" : messages;

    elem.innerHTML = content;
    elem.className = content.length == 0 ? "composite:hidden"
            : (areErrors ? "composite-errors-cell" : "composite-messages-cell");
}

<%------------------------------------------------------------------------------
    Replaces the "focus" function with "compositeElementFocus" for all FORM
    elements that belongs to a component. This because if the component
    is hidden and one of its elements is focused a JavaScript error occurs under
    some versions of Internet Explorer.

    @componentID      the ID of the component;
------------------------------------------------------------------------------%>
function compositeReplaceFocusFunction(componentID) {
    if (typeof(componentID) != "string") {
        alert("compositeReplaceFocusFunction: invalid component: " + componentID);
        return;
    }

    var elemID = "<%=CompositePresentationConst.COMPONENT_ELEMENT_ID_PREFIX%>"
            + componentID;

    var elem = document.getElementById(elemID);

    if (elem == null) {
        alert("compositeReplaceFocusFunction: element with ID=" + elemID + " is missing!");
        return;
    }

    compositeReplaceElementFocusFunction(elem, componentID);
}

<%------------------------------------------------------------------------------
    Helper for "compositeReplaceFocusFunction", which replaces the "focus"
    function for one DOM element and its children.

    @elem             the element
    @componentID      the ID of the component to which the element belongs
------------------------------------------------------------------------------%>
function compositeReplaceElementFocusFunction(elem, componentID) {
    if ((typeof(elem) != "object") || (typeof(componentID) != "string")) {
        alert("compositeReplaceElementFocusFunction: invalid function arguments!");
        return;
    }

    for (var i = 0; i < compositeFormElementTypes.length; i++) {
        if (elem.type == compositeFormElementTypes[i]) {
            elem.compositeOldFocusFunction = elem.focus;
            elem.focus = new Function("compositeElementFocus(this, \""
                + componentID + "\")");
            break;
        }
    }

    for (var i = 0; i < elem.childNodes.length; i++) {
        compositeReplaceElementFocusFunction(elem.childNodes.item(i),
                componentID);
    }
}

<%------------------------------------------------------------------------------
    The function used to replace "focus" functions of FORM elements.

    @elem             the DOM element
    @componentID      the ID of the component to which the element belongs
------------------------------------------------------------------------------%>
function compositeElementFocus(elem, componentID) {
    compositeChangeComponentVisibility(componentID, true);
    elem.compositeOldFocusFunction();
}

<%------------------------------------------------------------------------------
    Validates FORM data for a component.

    @component        the ID of the component for which to make validation
    @prefix
------------------------------------------------------------------------------%>
function compositeValidateComponentFormData(componentID, prefix) {
    if (typeof(componentID) != "string") {
        alert("compositeValidateComponentFormData: invalid component: " + componentID);
        return;
    }

    prefix = typeof(prefix) == "undefined" ? "" : prefix;

    var form = document.getElementById("<%=CompositePresentationConst.FORM_ID%>");
    var name = form.name;

    var fullFormName = ((prefix.length > 0) ? prefix + "_" : "") + name
            + "_" + componentID;

    var fname = "validate" + fullFormName.substr(0, 1).toUpperCase()
            + fullFormName.substring(1);

    form.name = fullFormName;

    var result = eval("typeof(" + fname + ") == \"undefined\" ? true : "
            + fname + "(form)");

    form.name = name;
    return result;
}

<%------------------------------------------------------------------------------
    Getter for the HTML form to be used for sending a request to server.
------------------------------------------------------------------------------%>
function compositeGetHTMLForm(fastRequest) {
    if (typeof(fastRequest) != "boolean") {
        alert("compositeGetHTMLForm: invalid fastRequest parameter");
        return null;
    }

    var formID = fastRequest ? "<%=CompositePresentationConst.FAST_FORM_ID%>"
            : "<%=CompositePresentationConst.FORM_ID%>";

    var form = document.getElementById(formID);

    if (form == null) {
        alert("compositeGetHTMLForm: missing form with id=" + formID);
        return null;
    }

    if (typeof(form.onsubmit) == "function") {
        if (!form.onsubmit()) {
            return null;
        }
    }

    compositePrepareFormForSubmission(form);
    return form;
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
function compositePrepareFormForSubmission(form) {
    form.<%=CompositeConstants.PARAM_METHOD_NAME%>.value = "unspecified";
    form.<%=CompositeConstants.PARAM_COMPONENT_ID%>.value = "";
    form.<%=CompositeConstants.PARAM_DETAILS_RENDER_MODE%>.value = "";
    form.<%=CompositeConstants.PARAM_OPERATION%>.value = "";
    form.<%=CompositeConstants.PARAM_CALLBACK_FUNCTION_NAME%>.value = "";

    form.target = "<%=CompositePresentationConst.HIDDEN_IFRAME_NAME%>";
}

<%------------------------------------------------------------------------------
    Changes current detail by submiting a request to server. Must be used
    only when details are rendered mode is TABS.

    @detailID         the ID of the detail
------------------------------------------------------------------------------%>
function compositeChangeCurrentDetail(detailID, fastRequest) {
    if (arguments.length != 2) {
        alert("compositeChangeCurrentDetail: invalid function arguments");
        return;
    }

    var form = compositeGetHTMLForm(fastRequest);

    if (form == null) {
        return;
    }

	if (!__invocationArray.run())
		return;

    form.target = "<%=CompositePresentationConst.HIDDEN_IFRAME_NAME%>";
    form.<%=CompositeConstants.PARAM_METHOD_NAME%>.value = "changeCurrentDetail";
    form.<%=CompositeConstants.PARAM_COMPONENT_ID%>.value = detailID;

    compositeSubmitFormToHiddenFrame(form);

	form.<%=CompositePresentationConst.EDIT_MODE_ID%>.value = false;
}

<%------------------------------------------------------------------------------
    Changes current details rendering mode by submiting a request to server.

    @mode             the new rendering mode
    @fastRequest      if TRUE a FAST request will be sent to server, otherwise
                      a normal one
------------------------------------------------------------------------------%>
function compositeChangeDetailsRenderMode(mode, fastRequest) {
    if (arguments.length != 2) {
        alert("compositeChangeDetailRenderMode: invalid function arguments");
        return;
    }

    var form = compositeGetHTMLForm(fastRequest);

    if (form == null) {
        return;
    }

    form.<%=CompositeConstants.PARAM_METHOD_NAME%>.value = "changeDetailsRenderMode";
    form.<%=CompositeConstants.PARAM_DETAILS_RENDER_MODE%>.value = "" + mode;

    compositeSubmitFormToHiddenFrame(form);
}

<%------------------------------------------------------------------------------
    Executes an operation for entire composite entity.

    @operation              the operation to execute on server side
    @componentID            the ID of the component for which the operation
                            will be executed; can be NULL
    @fastRequest            if TRUE a FAST request will be sent to server,
                            otherwise a normal one
    @callbackFunction       the JavaScript function that will be called when
                            server's response is received back; may be
                            NULL

    @since v2.0.1
------------------------------------------------------------------------------%>
function compositeExecuteOperation(operation, componentID,
        fastRequest, callbackFunction, submit) {
   
    var form = compositeGetHTMLForm(fastRequest);

    if (form == null) {
        return;
    }

    form.<%=CompositeConstants.PARAM_METHOD_NAME%>.value = "operation";
    form.<%=CompositeConstants.PARAM_OPERATION%>.value = operation;
    form.<%=CompositeConstants.PARAM_COMPONENT_ID%>.value =
            componentID == null ? "" : componentID;

    form.<%=CompositeConstants.PARAM_CALLBACK_FUNCTION_NAME%>.value =
            typeof(callbackFunction) == "string"
            ? callbackFunction : "";

    if (submit == null || submit == true ) {
	    compositeSubmitFormToHiddenFrame(form);
    }

	form.<%=CompositeConstants.PARAM_CALLBACK_FUNCTION_NAME%>.value = "";
}

<%------------------------------------------------------------------------------
    Executes an operation for a component.

    @componentID            the ID of the component
    @operation              the operation to execute
    @fastRequest            if TRUE a FAST request will be sent to server,
                            otherwise a normal one
    @callbackFunction       the JavaScript function that will be called when
                            server's response is received back; may be
                            NULL

    @deprecated Replaced by compositeExecuteOperation.
------------------------------------------------------------------------------%>
function compositeExecuteComponentOperation(componentID, operation,
            fastRequest, callbackFunction, submit) {
    compositeExecuteOperation(operation, componentID,
            fastRequest, callbackFunction, submit);
}

<%------------------------------------------------------------------------------
    Changes current details rendering mode by submiting a request to server.

    @components             an array with component IDs to reload
    @fastRequest            if TRUE a FAST request will be sent to server,
                            otherwise a normal one
    @callbackFunction       the NAME of the JavaScript function that will be
                            called when server's response is received
                            back; may be NULL
------------------------------------------------------------------------------%>
function compositeReloadComponents(components, fastRequest,
            callbackFunction) {
    if (arguments.length != 3) {
        alert("compositeReloadComponents: invalid function arguments");
        return;
    }

    var form = compositeGetHTMLForm(fastRequest);

    if (form == null) {
        return;
    }

    var componentsParam = new String();
    for (var i = 0; i < components.length; i++) {
        componentsParam = componentsParam + (i == 0 ? "" : ",") + components[i];
    }

    form.<%=CompositeConstants.PARAM_METHOD_NAME%>.value = "reloadComponents";
    form.<%=CompositeConstants.PARAM_COMPONENT_ID%>.value = componentsParam;

    form.<%=CompositeConstants.PARAM_CALLBACK_FUNCTION_NAME%>.value =
            typeof(callbackFunction) == "string" ? callbackFunction : "";

    compositeSubmitFormToHiddenFrame(form);
}

<%------------------------------------------------------------------------------
    Sends to server the request for saving composite entity.
------------------------------------------------------------------------------%>
function compositeSave() {
    if (!confirm("<bean:message key="composite.confirm.save_composite_record" bundle="composite"/>")) {
        return;
    }

    var form = compositeGetHTMLForm(false);

    if (form == null) {
        return;
    }

    form.<%=CompositeConstants.PARAM_METHOD_NAME%>.value = "save";
    compositeSubmitFormToHiddenFrame(form);
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
function compositeDelete() {
    if (!confirm("<bean:message key="composite.confirm.delete_composite_record" bundle="composite"/>")) {
        return;
    }

    var form = compositeGetHTMLForm(false);
    if (form == null) {
        return;
    }

    form.<%=CompositeConstants.PARAM_METHOD_NAME%>.value = "delete";
    compositeSubmitFormToHiddenFrame(form);
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
function compositeCloseViewEditPage(askConfirmation) {
    var ask = (typeof(askConfirmation) == "boolean") ? askConfirmation : true;

    if (ask) {
        if (!confirm("<bean:message key="composite.confirm.close_viewedit" bundle="composite"/>")) {
            return;
        }
    }

    var form = document.getElementById("<%=CompositePresentationConst.FAST_FORM_ID%>");
    compositePrepareFormForSubmission(form);

    form.target = "_self";
    form.<%=CompositeConstants.PARAM_METHOD_NAME%>.value = "closeViewEdit";
    form.submit();
}
