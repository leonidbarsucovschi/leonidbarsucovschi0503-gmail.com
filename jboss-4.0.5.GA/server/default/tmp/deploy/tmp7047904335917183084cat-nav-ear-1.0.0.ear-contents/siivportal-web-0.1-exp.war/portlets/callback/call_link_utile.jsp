<%@ page import="ro.uti.apmc.sys.util.SystemUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="/WEB-INF/sys.tld" prefix="sys"%>
<%@ page isELIgnored="false" %>

<c:set var="cprefix" scope="request" value="<%=SystemUtil.getModulePrefix(request)%>"/>

<sys:cmodule prefix="${cprefix}"/>

