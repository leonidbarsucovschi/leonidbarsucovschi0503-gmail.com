<%--
*
* composite_set_components_error_flag.jsp
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
    Generates a JavaScript function, named "compositeSetComponentsErrorFlag",
    for updating the error flag for all visible components. It may be
    included from pages that are loaded in main window or from pages loaded
    into an IFRAME.

    Expects two request parameters:

    @fromFrame        specifies if the JSP page is included by a page that is
                      loaded into an IFRAME
    @execute          specifies if the page should generate JS code that
                      executes the function which sets messages
------------------------------------------------------------------------------%>

<%-- imports --%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositeConstants" %>
<%@ page import="ro.uti.jpf.base.composite.util.CompositePresentationConst" %>

<%-- taglibs --%>
<%@ taglib uri="/WEB-INF/composite.tld" prefix="composite" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ taglib uri="/WEB-INF/taglibs-string.tld" prefix="string" %>

<%
  String fromFrameParam = request.getParameter("fromFrame");
  boolean fromFrame = (fromFrameParam != null) && Boolean.valueOf(fromFrameParam).booleanValue();
  String fctPrefix = fromFrame ? "parent." : " ";

  String executeParam = request.getParameter("execute");
  boolean execute = (executeParam != null) && Boolean.valueOf(executeParam).booleanValue();
%>

<script type="text/javascript">
function compositeSetComponentsErrorFlag() {
  <logic:iterate indexId="idx" id="componentID" name="<%=CompositeConstants.ATTR_COMPONENT_IDS%>" scope="request" type="java.lang.String" >
    <composite:isDetail componentID="<%=componentID%>">
      <%=fctPrefix%><%=CompositePresentationConst.DETAILS_JSVAR_NAME%>.setDetailErrorFlag("<%=componentID%>",
          <composite:hasFlags componentID="<%=componentID%>" flags="<%=CompositeConstants.COMPONENT_FLAG_ERROR%>">true</composite:hasFlags>
          <composite:hasFlags componentID="<%=componentID%>" flags="<%=CompositeConstants.COMPONENT_FLAG_ERROR%>" negate="true">false</composite:hasFlags>
      );
    </composite:isDetail>
    
    <composite:isDetail componentID="<%=componentID%>" negate="true">
    if (typeof(<%=fctPrefix%><%=componentID%><%=CompositePresentationConst.COMPONENT_SET_ERROR_FLAG_JSFCT_SUFFIX%>) == "function") {
      <%=fctPrefix%><%=componentID%><%=CompositePresentationConst.COMPONENT_SET_ERROR_FLAG_JSFCT_SUFFIX%>();
    }
    </composite:isDetail>

  </logic:iterate>
}

<% if (execute) { %>
compositeSetComponentsErrorFlag();
<% } %>

</script>
