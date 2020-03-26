<%--
 *
 * composite_list_js.jsp
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

------------------------------------------------------------------------------%>
function compositeChangeFilterElementsVisibility(visible) {
    var elm = document.getElementById("<%=CompositePresentationConst.COMPOSITE_FILTER_ELEMENT_ID%>");

    if (elm == null) {
        return;
    }

    elm.className = visible ? "" : "composite-hidden";

    if (typeof(document.navigationForm) != "undefined") {
		    document.navigationForm.search.value = visible ? "1" : "0";
    }
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
function compositeExecuteFilter() {
    var elm = document.getElementById("<%=CompositePresentationConst.FORM_ID%>");

    if (elm == null) {
        return;
    }

    if (typeof(elm.onsubmit) == "function") {
        if (!elm.onsubmit()) {
            return;
        }
    }

    elm.submit();
}