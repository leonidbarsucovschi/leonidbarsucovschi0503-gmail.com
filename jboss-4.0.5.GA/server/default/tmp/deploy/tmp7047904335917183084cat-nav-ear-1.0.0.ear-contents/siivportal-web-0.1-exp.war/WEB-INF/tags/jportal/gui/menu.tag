<%@ tag import="ro.uti.apmc.sys.util.SystemUtil"%>
<%@ tag import="org.apache.struts.action.ActionMapping"%>
<%@ tag import="org.apache.struts.Globals"%>
<%@ attribute name="method"%>
<%@ attribute name="parentMenu"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="/WEB-INF/sys.tld" prefix="sys"%>

<%@ tag isELIgnored="false" %>

<c:set var="cprefix" scope="request" value="<%=SystemUtil.getModulePrefix(request)%>"/>
<%
ActionMapping mapp =  (ActionMapping) request.getAttribute(Globals.MAPPING_KEY);
%>

<sys:cmodule prefix=""/>

<c:if test="${empty parentMenu}">
  <jsp:include flush="true" page="menu.do">
    <jsp:param name="method" value="${method}"/>
    <jsp:param name="xinclude" value="true"/>
  </jsp:include>
</c:if>
<c:if test="${!empty parentMenu}">
  <jsp:include flush="true" page="menu.do">
  <jsp:param name="method" value="${method}"/>
  <jsp:param name="parentMenuId" value="${parentMenu}"/>
  <jsp:param name="xinclude" value="true"/>
  </jsp:include>
</c:if>

<sys:cmodule prefix="${cprefix}"/>
<%
request.setAttribute(Globals.MAPPING_KEY,mapp);
%>
