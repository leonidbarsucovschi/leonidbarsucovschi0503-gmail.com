<%@page import="java.util.Hashtable"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
  <head>
    <META http-equiv="Content-Type" content="text/html; charset=iso-8859-2">
    <html:base />
    <link rel="StyleSheet" href="css/dtree.css" type="text/css"/>
    <link rel="StyleSheet" href="css/displaytag.css" type="text/css"/>
    <link rel="StyleSheet" href="css/display.css" type="text/css"/>
    <link rel="StyleSheet" href="css/element_styles.css" type="text/css"/>
    <script type="text/javascript" src="script/dtree.js"></script>
    <script type="text/javascript" src="script/jportal.js"></script>
  </head>

  <body topmargin="0" marginwidth="0" marginheight="0" leftmargin="0" bgcolor="#ffffff">
    <table width="100%" cellspacing="2" cellpadding="0" border="0"  height="100%">
      <tr valign="top">
        <td>
<%

      String includePage = request.getParameter("page");
      try {
       if (includePage != null) {
        includePage+=".jsp";
        includePage="./"+includePage;
        %><jsp:include page="<%=includePage%>" flush="true" /><%
        } else { %><jsp:include page="index.jsp" flush="true" /><%
       }
      } catch (Exception e) {
      e.printStackTrace(); }%>

        </td>
      </tr>
    </table>
  </body>
</html>
