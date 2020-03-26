<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Aug 21, 2006
  Time: 3:33:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
 <tr class="page-subtitle">
  <td width="100%" valign="top" align="left">&nbsp;
    <!-- Titlu recuperare parola. -->
	  <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.schimbare_parola"/>
	<!-- END Sectiune de Titlu pagina. -->
  </td>
 </tr>
</table>
<logic:messagesPresent>
<table width="100%" border="0" cellpadding="0" cellspacing="1">
 <tr>
  <td valign="top" colspan="2" class="msg_error" align="center">
     <ul>
      <html:messages id="error">
       <li><bean:write name="error"/></li>
      </html:messages>
     </ul>
  </td>
 </tr>
</table>
</logic:messagesPresent>
<table width="100%" border="0" cellpadding="0" cellspacing="1">
<!-- START Sectiune de FORM. -->
<html:form action="/login.do">
 <!--campul useCert-->
  <html:hidden property="useCert"/>
 <!-- Cimpul 'username' field. -->
  <html:hidden property="username"/>
  <html:hidden property="password"/>
 <tr>
  <td valign="top" class="label" align="right" width="50%">
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_login"/> *:
  </td>
  <td class="text" align="left" width="50%">
   <bean:write name="form_LoginForm" property="username"/>
  </td>
 </tr>
  <!-- Cimpul 'n_user_password' field. -->
 <input type="hidden" name="label_password" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/>'/>
 <input type="hidden" name="label_c_password" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/>'/>
 <tr>
  <td valign="top" class="label" align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/> *:
  </td>
  <td class="text" align="left">
   <html:password styleClass="field_input" property="n_user_password" maxlength="25"/>
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_password"/>" />
  </td>
</tr>
 <!-- Cimpul 'c_user_password' confirmare field. -->
 <tr>
  <td valign="top" class="label" align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/> *:
  </td>
  <td class="text" align="left">
    <html:password styleClass="field_input" property="c_user_password" maxlength="25"/>
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
  </td>
</tr>
<!-- START Sectiune de BUTOANE. -->
 <tr>
  <td colspan="2" class="button-row" align="center">
   <html:submit styleClass="button">
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.schimbare_parola"/>
   </html:submit>
   <html:hidden property="method"  value="changePwd"/>
  </td>
 </tr>
 <!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
</div>