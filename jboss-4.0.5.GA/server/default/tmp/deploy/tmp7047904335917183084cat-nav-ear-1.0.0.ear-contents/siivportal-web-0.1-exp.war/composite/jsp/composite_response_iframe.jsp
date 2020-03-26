<%--
 *
 * composite_response_iframe.jsp
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
    The template to be used for server responses that are loaded into
    the hidden IFRAME.

    Expects an optionally request parameter, named "responsePage", which
    specifies the URL of a resource that will included at runtime. The included
    page may define a JavaScript function, named "compositeResponsePageLoaded",
    which will be called after the response is completely loaded by client.

    --------------------------
    Notes:
    --------------------------

    1) The encoding must be "UTF-8" because Internet Explorer doesn't support
    a different encoding for "responseText" property of "IXMLHTTPRequest"
    interface:

        IXMLHTTP attempts to decode the response into a Unicode string. It
        assumes the default encoding is UTF-8, but can decode any
        type of UCS-2 (big or little endian) or UCS-4 encoding as long as the
        server sends the appropriate Unicode byte-order mark.

    2) No JavaScript code that is executed by browser immediately after
    parsing should be used. This because the response may be loaded into IFRAME
    directly by browser (if the form is submitted with iframe's name as
    target), or using document's open/write/close methods if the response is
    received using "XMLHttpRequest". In the last case, the code may be
    executed before SCRIPT elements with SRC attribute (usually declared in
    HEAD) are processed, which will generate JavaScript errors.
------------------------------------------------------------------------------%>

<%-- imports --%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositeConstants" %>
<%@ page import="org.apache.commons.lang.StringUtils" %>

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
  <title>Composite Entities IFRAME response</title>

  <composite:base hrefPath="dummy.jsp"/>
  <script type="text/javascript" src="composite/script/composite_iframe_utils_js.jsp" defer="false"></script>
</head>

<body onload="pageLoaded();">

  <%-- --%>
  <composite:form formId="compositeResponseForm">
    <html:form styleId="compositeResponseForm" action="<%=actionPath%>" method="POST">

        <%-- response page --%>
        <% String includePage = request.getParameter("responsePage"); %>
        <% if (includePage != null) { %>
          <jsp:include page="<%=includePage%>"/>
        <% } %>

        <%-- compositeReloadComponents --%>
        <jsp:include page="composite_reload_components.jsp"/>
        <%-- end --%>

    </html:form>
  </composite:form>
  <%-- --%>

  <%-- compositeSetComponentsErrorFlag --%>
  <jsp:include page="composite_set_components_error_flag.jsp">
    <jsp:param name="fromFrame" value="true"/>
  </jsp:include>
  <%-- end --%>

  <%-- compositeSetComponentsMessages --%>
  <jsp:include page="composite_set_components_messages.jsp">
    <jsp:param name="fromFrame" value="true"/>
  </jsp:include>
  <%-- end --%>

  <%-- javascript code called when the page is completely loaded --%>
  <script type="text/javascript">
  function pageLoaded() {
      if (typeof(compositeResponsePageLoaded) == "function") {
          compositeResponsePageLoaded();
      }

      compositeUpdateParentTransactionalTokenFromIFrame();
      compositeReloadComponents();
      compositeSetComponentsErrorFlag();
      compositeSetComponentsMessages();

	  <%String callbackFunctionName=request.getParameter(CompositeConstants.PARAM_CALLBACK_FUNCTION_NAME);
	    String trimCallback = StringUtils.trimToNull(callbackFunctionName);
	  %>
      <%if (trimCallback != null) { 
		  String onlyFName = "parent." + callbackFunctionName.substring(0, 
			  callbackFunctionName.indexOf("(") >= 0 ? callbackFunctionName.indexOf("(") :
			  callbackFunctionName.length());
		  %>
	  if (typeof(<%=onlyFName%>) != "function") {
          alert("Invalid callback function: <%=onlyFName%>");
      } else {		  
		  if ("<%=callbackFunctionName%>".indexOf('(') > 0)  {
			  if (window.frames.length == 0 )  {
				  parent.<%=callbackFunctionName%>;
			  }			
		  } else {
			  parent.<%=callbackFunctionName%>();
		  }
      }
      <%}%>
      if (RESET_IFRAME_CONTENT) {
          compositeClearIFrameContent();
      }
  }
  </script>
  <%-- end javascript code --%>

</body>

</html>