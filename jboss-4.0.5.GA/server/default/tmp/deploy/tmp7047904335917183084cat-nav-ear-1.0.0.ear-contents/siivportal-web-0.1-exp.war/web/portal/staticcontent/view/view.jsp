<%@ page language="java" contentType="text/html; charset=iso-8859-2" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%
    String package_id = (String)request.getAttribute("package_id");
    String resource = (String)request.getAttribute("resource");
    String pagePath = "/portal/static.do?x=get&package_id="+package_id+"&resource="+resource;
%>
<div>
<jsp:include page="<%=pagePath%>" flush="true"/>
</div>