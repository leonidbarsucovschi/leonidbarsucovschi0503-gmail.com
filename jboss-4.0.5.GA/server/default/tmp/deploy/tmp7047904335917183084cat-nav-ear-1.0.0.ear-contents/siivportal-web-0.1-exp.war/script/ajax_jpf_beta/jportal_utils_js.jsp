<%--
 *
 * jportal_utils_js.jsp
 *
 * Copyright (c) 2006 UTI Systems. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of UTI Systems.
 *
--%>

<%@ page language="java" %>
<%@ page contentType="text/javascript; charset=iso-8859-2" %>

<%------------------------------------------------------------------------------

    JpfUtils - implements various static util methods.

------------------------------------------------------------------------------%>

function JpfUtils() {
}

<%------------------------------------------------------------------------------
    Removes leading and trailing whitespace from a string.

    s   the string; may be NULL

    Returns the trimmed string, NULL is "s == null".
------------------------------------------------------------------------------%>

JpfUtils.trim = function(s) {
    return s == null ? null : s.replace( /^\s*/, "" ).replace( /\s*$/, "");
}

<%------------------------------------------------------------------------------
    Removes leading and trailing whitespace from a string. If the result is
    empty string, the function returns NULL.

    s   the string; may be NULL

    Returns the trimmed string, NULL if the result is "" or
    if "s == null".
------------------------------------------------------------------------------%>

JpfUtils.trimToNull = function(s) {
    var v = JpfUtils.trim(s);
    return v == "" ? null : v;
}

<%------------------------------------------------------------------------------
    Creates an "<input type='hidden'/>" DOM element. All arguments
    are optional.

    id      the ID of the element; can be NULL
    name    element's name; can be NULL
    value   element's value; can be NULL

    Returns the element.
------------------------------------------------------------------------------%>

JpfUtils.createInputHiddenElement = function(id, name, value) {
    var elm = document.createElement("INPUT");
    elm.type = "hidden";

    if (arguments.length > 0) {
        if (id != null) {
            elm.id = id;
        }
    }

    if (arguments.length > 1) {
        if (name != null) {
            elm.name = name;
        }
    }

    if (arguments.length > 2) {
        if (value != null) {
            elm.value = value;
        }
    }

    return elm;
}
