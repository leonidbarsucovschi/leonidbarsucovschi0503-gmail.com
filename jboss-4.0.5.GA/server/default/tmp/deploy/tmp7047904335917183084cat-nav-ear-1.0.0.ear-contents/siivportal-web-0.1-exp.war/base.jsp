<%@ page import="ro.uti.waf.config.SystemConfig" %>
<%@ page import="ro.uti.apmc.sys.util.DatabaseSysConfig" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>

<%
  SystemConfig dbSysCfg = DatabaseSysConfig.getInstance();
  String gsUrl = dbSysCfg.getParameter("gateSafe.url");

  if (request.getRemoteHost().equals(dbSysCfg.getParameter("gateSafe.host"))) {
%>
<base href="<%=gsUrl%>"/>
<% } else { %>
<html:base/>
<% } %>