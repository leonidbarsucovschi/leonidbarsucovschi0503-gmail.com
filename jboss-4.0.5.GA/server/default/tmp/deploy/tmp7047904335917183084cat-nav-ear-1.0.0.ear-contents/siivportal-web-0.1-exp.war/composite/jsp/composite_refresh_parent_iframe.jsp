<%--
 *
 * composite_synchronize.jsp
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
    Generates the response sent by server back to client when the the server
    wants to refresh the content of entire parent window.

    Expects one request parameter, with name specified by
    CompositeConstants.PARAM_METHOD_NAME constant, which stores the "method" to
    be executed on server when parent's window content is refreshed. 
------------------------------------------------------------------------------%>

<%-- imports --%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositePresentationConst,
                 org.apache.struts.Globals" %>
<%@ page import="ro.uti.jpf.base.composite.util.CompositeConstants" %>

<%-- taglibs --%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ taglib uri="/WEB-INF/composite.tld" prefix="composite" %>

<%-- defines --%>
<bean:define id="actionPath" name="<%=CompositeConstants.ATTR_ACTION_PATH%>"
        scope="request" type="java.lang.String"/>

<html>

<head>
  <composite:base hrefPath="dummy.jsp"/>
  <script type="text/javascript" src="composite/script/composite_iframe_utils_js.jsp"></script>
</head>

<body onload="pageLoaded()">

  <html:form styleId="<%=CompositePresentationConst.FORM_ID%>" action="<%=actionPath%>">
    <input type="hidden" name="<%=CompositeConstants.PARAM_METHOD_NAME%>" value="<%=request.getParameter(CompositeConstants.PARAM_METHOD_NAME)%>"/>
  </html:form>

  <script type="text/javascript">
      function pageLoaded() {
          var form = document.getElementById("<%=CompositePresentationConst.FORM_ID%>");
          var fromIFrame = (typeof(parent) != "undefined") && (parent != this);

          if (fromIFrame) {
              form.target = "_parent";
          }

          form.submit();

          if (fromIFrame && RESET_IFRAME_CONTENT) {
              compositeClearIFrameContent();
          }
      }
  </script>

</body>

</html>
