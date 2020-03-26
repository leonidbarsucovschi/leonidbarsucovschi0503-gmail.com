<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Aug 21, 2006
  Time: 9:48:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm"  method="post" action="sys/admuserinreg.do">
 <html:hidden property="method"  value="showMessage"/>
</form>
<script>
function closeWindow(){
  document.closeForm.submit();
}
</script>
<div class="table">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
 <tr class="page-subtitle">
  <td width="100%" valign="top" align="left">&nbsp;
    <!-- Titlu recuperare parola. -->
	  <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.recuperare_parola"/>
	<!-- END Sectiune de Titlu pagina. -->
  </td>
  <td class="bottom" align="right">
    <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' src="<bean:message bundle="mesajsite" key="mesaj_site.button.closeWindow.path"/>" />
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
<html:form action="/recuperareparola.do" onsubmit="return validateForm_RecuperareParolaForm(this);">
  <!-- Cimpul 'user_login' field. -->
 <tr>
  <td valign="top" class="label" align="right" width="50%">
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_login"/> *:
  </td>
  <td class="text" align="left" width="50%">
   <html:text styleClass="field_input" property="user_login" maxlength="25"/>
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_login"/>" />
  </td>
 </tr>
  <tr>
    <td colspan="2" align="center">
      <img src="Captcha.jpg">
    </td>
   </tr>
   <tr>
     <td class="label" align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.captcha"/> *:
     </td>
     <td class="text" align="left">
        <input type="text" class="field_input" name="captcha"/>
     </td>
   </tr>
  <!-- START Sectiune de BUTOANE. -->
 <tr>
  <td colspan="2" class="button-row" align="center">
   <html:submit styleClass="button">
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.recuperare_parola"/>
   </html:submit>
   <html:hidden property="method"  value="recuperareParola"/>
  </td>
 </tr>
 <!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_RecuperareParolaForm" dynamicJavascript="true" staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp" ></script>