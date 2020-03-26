<%--
*
* composite_set_components_messages.jsp
*
* Copyright (c) 2005 UTI Systems. All Rights Reserved.
*
* This source file may not be copied, modified or redistributed,
* in whole or in part, in any form or for any reason, without the express
* written consent of UTI Systems.
*
--%>

<%@ page language="java" %>
<%@ page contentType="text/html;charset=UTF-8"%>

<%------------------------------------------------------------------------------
    Generates a JavaScript function, named "compositeSetComponentsMessages",
    for setting messages for all current visible components. It may be included
    from pages that are loaded in main window orfrom pages loaded into
    an IFRAME.

    Expects two request parameters:

    @fromFrame        specifies if the JSP page is included by a page that is
                      loaded into an IFRAME
    @execute          specifies if the page should generate JS code that
                      executes the function which sets messages
------------------------------------------------------------------------------%>

<%-- imports --%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositeConstants" %>

<%-- taglibs --%>
<%@ taglib uri="/WEB-INF/composite.tld" prefix="composite" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ taglib uri="/WEB-INF/taglibs-string.tld" prefix="string" %>

<%
  String fromFrameParam = request.getParameter("fromFrame");
  boolean fromFrame = fromFrameParam != null && Boolean.valueOf(fromFrameParam).booleanValue();
  String fctPrefix = fromFrame ? "parent." : " ";

  String executeParam = request.getParameter("execute");
  boolean execute = executeParam != null && Boolean.valueOf(executeParam).booleanValue();
%>

<script type="text/javascript">
function compositeSetComponentsMessages() {
    <%=fctPrefix%>compositeSetComponentMessages(null, "<composite:messages renderErrors="false" escapeJavaScript="true" />", false);
    <%=fctPrefix%>compositeSetComponentMessages(null, "<composite:messages renderErrors="true" escapeJavaScript="true" />", true);

    <logic:iterate id="componentID" name="<%=CompositeConstants.ATTR_VISIBLE_COMPONENT_IDS%>" type="java.lang.String">
        <%=fctPrefix%>compositeSetComponentMessages("<%=componentID%>",
            "<composite:messages componentID="<%=componentID%>" renderErrors="false" escapeJavaScript="true" />", false);
        <%=fctPrefix%>compositeSetComponentMessages("<%=componentID%>",
            "<composite:messages componentID="<%=componentID%>" renderErrors="true" escapeJavaScript="true" />", true);
    </logic:iterate>
}
<% if (execute) { %>
compositeSetComponentsMessages();
<% } %>
</script>
