<%@ page import="ro.uti.apmc.sys.util.SystemParameters"%>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style type="text/css">

.act {
background-color:#ff7100;color:#FFFFFF;padding:2px 1px 2px 2px;font-family:Arial, Helvetica, sans-serif;font-size:12px;font-weight:bold;
}

/*.act:a {
background-color:#ff7100;color:#FFFFFF;padding:2px 1px 2px 2px;font-family:Arial, Helvetica, sans-serif;font-size:12px;font-weight:bold;
} */

</style>
<link href="css/global_styles.css" rel="stylesheet" type="text/css">

<P class="pageheader"><bean:message bundle="adm" key="adm.title" /></P>

<P class="smallbodylite" width="80%"><bean:message bundle="adm" key="adm.body"/></P>

<P align="center" class="pageheader1"><bean:message bundle="adm" key="adm.subtitle"/></P>

<%

	ro.uti.waf.security.User user = (ro.uti.waf.security.User)session.getAttribute(ro.uti.waf.base.simple.util.Constants.USER_KEY);
	if (user != null) {

%>


<table width="100%"  border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="10%">&nbsp;</td>
    <td width="20%">&nbsp;</td>
    <td width="10%">&nbsp;</td>
    <td width="20%">&nbsp;</td>
    <td width="10%">&nbsp;</td>
    <td width="20%">&nbsp;</td>
    <td width="10%">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td valign="top">
    <%
    	if (user.hasRole(SystemParameters.ROLE_ADMINISTRATOR_USER)) {
    %>
    <table width="100%"  border="0" cellspacing="0" cellpadding="0" style="border:1px solid silver;">
      <tr>
        <td class="act"><a href="<%=request.getContextPath() %>/sys/admuser.do?method=list" class="act" title="Utilizatori"><bean:message bundle="adm" key="adm.users" /></a></td>
        </tr>
      <tr>
        <td class="smallbodylite" style="padding:2px 2px 2px 2px;"><bean:message bundle="adm" key="adm.users.detail" /></td>
      </tr>
    </table>
    <%
    	}
    %>
    </td>
    <td>&nbsp;</td>
    <td valign="top">
    <%
    	if (user.hasRole(SystemParameters.ROLE_ADMINISTRATOR_ROLE)) {
    %>
    <table width="100%"  border="0" cellspacing="0" cellpadding="0" style="border:1px solid silver;">
      <tr>
        <td class="act"><a href="<%=request.getContextPath() %>/sys/admrole.do?method=list" class="act" title="Roluri"><bean:message bundle="adm" key="adm.roles"/></a></td>
      </tr>
      <tr>
        <td class="smallbodylite" style="padding:2px 2px 2px 2px;"><bean:message bundle="adm" key="adm.roles.detail" /></td>
      </tr>
    </table>
    <%
    	}
    %>
    </td>
    <td>&nbsp;</td>
    <td valign="top">
    <%
    	if (user.hasRole(SystemParameters.ROLE_ADMINISTRATOR_MENU)) {
    %>
    <table width="100%"  border="0" cellspacing="0" cellpadding="0" style="border:1px solid silver;">
      <tr>
        <td class="act"><a href="<%=request.getContextPath() %>/sys/admmenuentry.do?method=list" class="act" title="Meniuri"><bean:message bundle="adm" key="adm.menus" /></a></td>
      </tr>
      <tr>
        <td class="smallbodylite" style="padding:2px 2px 2px 2px;"><bean:message bundle="adm" key="adm.menus.detail" /></td>
      </tr>
    </table>
    <%
    	}
    %>
    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>

<%
	}
%>

<P>&nbsp;</P>
<P>&nbsp;</P>


