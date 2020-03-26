<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr>
      <td width="100%" valign="top" class="bottom" align="left">
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="admusersession" key="adm_user_session.title.view"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admusersession" key="adm_user_session.label.closeWindow"/>' src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <table width="100%" border="0" cellpadding="1" align="center" class="lightrow" cellspacing="1">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center">
        <html:errors/>
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- Cimpul 'fk_http_session' field. -->
    <!-- Cimpul 'fk_http_session' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user_session.prompt.fk_http_session"/>
        :
      </td>
      <td class="text">
        <bean:write  property="fk_http_session" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'ip_address' field. -->
    <!-- Cimpul 'ip_address' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user_session.prompt.ip_address"/>
        :
      </td>
      <td class="text">
        <bean:write  property="ip_address" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'login_date' field. -->
    <!-- Cimpul 'login_date' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user_session.prompt.login_date"/>
        :
      </td>
      <td class="text">
        <bean:write  property="login_dateString" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'logout_date' field. -->
    <!-- Cimpul 'logout_date' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user_session.prompt.logout_date"/>
        :
      </td>
      <td class="text">
        <bean:write  property="logout_dateString" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'user_login' field. -->
    <!-- Cimpul 'user_login' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user.prompt.user_login"/>
        :
      </td>
      <td class="text">
        <bean:write  property="user_login" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'user_passwd' field. -->
    <!-- Cimpul 'user_passwd' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user.prompt.user_passwd"/>
        :
      </td>
      <td class="text">
        <bean:write  property="user_passwd" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'logged' field. -->
    <!-- Cimpul 'logged' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user.prompt.logged"/>
        :
      </td>
      <td class="text">
        <bean:write  property="logged" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'account_status' field. -->
    <!-- Cimpul 'account_status' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user.prompt.account_status"/>
        :
      </td>
      <td class="text">
        <bean:write  property="account_status" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'account_creation_date' field. -->
    <!-- Cimpul 'account_creation_date' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user.prompt.account_creation_date"/>
        :
      </td>
      <td class="text">
        <bean:write  property="account_creation_dateString" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'account_deletion_date' field. -->
    <!-- Cimpul 'account_deletion_date' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user.prompt.account_deletion_date"/>
        :
      </td>
      <td class="text">
        <bean:write  property="account_deletion_dateString" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'serial_number' field. -->
    <!-- Cimpul 'serial_number' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user.prompt.serial_number"/>
        :
      </td>
      <td class="text">
        <bean:write  property="serial_number" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'issuer_name' field. -->
    <!-- Cimpul 'issuer_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user.prompt.issuer_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="issuer_name" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'digital_certificate' field. -->
    <!-- Cimpul 'digital_certificate' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user.prompt.digital_certificate"/>
        :
      </td>
      <td class="text">
        <bean:write property="digital_certificateFile" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'user_type' field. -->
    <!-- Cimpul 'user_type' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user.prompt.user_type"/>
        :
      </td>
      <td class="text">
        <bean:write  property="user_type" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'email' field. -->
    <!-- Cimpul 'email' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admusersession" key="adm_user.prompt.email"/>
        :
      </td>
      <td class="text">
        <bean:write  property="email" name="<%=Constants.ADM_USER_SESSION_KEY%>"/>
      </td>
    </tr>
  </table>
</div>
<form name="closeForm" method="post" action="sys/admusersession.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
