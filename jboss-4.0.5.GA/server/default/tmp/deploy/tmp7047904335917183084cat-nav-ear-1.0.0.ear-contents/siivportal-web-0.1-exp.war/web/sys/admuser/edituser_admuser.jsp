<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmUserInregConstants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm"  method="post" action="sys/admuser.do">
 <html:hidden property="method"  value="showMessage"/>
</form>
<script>
 function closeWindow() {
   document.closeForm.submit();
 }
 //la check boxuri
function initChb(id_boo,id) {
 var chb = document.getElementById(id_boo);
 var field = document.getElementById(id);
 if (chb.checked) {
   field.value="1";
 }else {
   field.value="0";
 }
}
function chAutP() {
  var el  = document.getElementById('changeAut_boo');
  if (el.checked) {
    document.getElementById("div_tr_pw_1").style.display="inline";
    document.getElementById("div_tr_pw_2").style.display="inline";
    document.getElementById("div_tr_cpw_1").style.display="inline";
    document.getElementById("div_tr_cpw_2").style.display="inline";
  }else {
    document.getElementById("div_tr_pw_1").style.display="none";
    document.getElementById("div_tr_pw_2").style.display="none";
    document.getElementById("div_tr_cpw_1").style.display="none";
    document.getElementById("div_tr_cpw_2").style.display="none";
  }
}
</script>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr>
      <td width="100%" valign="top" align="left" class="page-subtitle">
        &nbsp;
        <!-- Titlul ferestrei pentru modificare. -->
          <bean:message bundle="admuserinreg" key="adm_user_inreg.title.save"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuser" key="adm_user.label.closeWindow"/>' src="images/close_off.gif" />
      </td>
    </tr>
 </table>
   <table  width="100%" border="0" cellpadding="0" cellspacing="1">
           <logic:messagesPresent>
             <tr>
               <td valign="top" colspan="2" class="msg_error " align="center">
                 <ul>
                   <html:messages id="error">
                     <li>
                       <bean:write name="error"/>
                     </li>
                   </html:messages>
                 </ul>
               </td>
             </tr>
           </logic:messagesPresent>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <!-- START Sectiune de FORM. -->
    <html:form action="/admuser.do" onsubmit="return validateForm_AdmUserForm(this);">
      <!--Campul id_user-->
      <html:hidden property="values.id_user"/>
      <!-- Cimpul 'fk_limba' field. -->
      <html:hidden property="values.account_creation_dateString"/>
      <!--campul account_deletion_date-->
      <html:hidden property="values.account_deletion_dateString"/>
      <!--Campul account_status-->
      <html:hidden property="values.account_status"/>
      <!--campul issuer_name-->
      <html:hidden property="values.issuer_name"/>
      <!--campul logged-->
      <html:hidden property="values.logged"/>
      <!--campul serial_number-->
      <html:hidden property="values.serial_number"/>
      <!--campul user_login-->
      <html:hidden property="values.user_login"/>
      <!--campul user_type-->
      <html:hidden property="values.user_type"/>
      <!--campul cd-->
	  <html:hidden property="cd"/>

	 <!--DATE UTILIZATOR-->
   <tr class="even" >
       <td class="label" colspan="2">
         <b><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_utilizator"/></b>
       </td>
  </tr>
<!-- Cimpul 'email' field. -->
 <tr>
  <td valign="top" class="label" align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.email_user"/> *:
  </td>
  <td class="text" align="left">
   <html:text styleClass="field_input" property="values.email" maxlength="100" />
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.email_user"/>" />
  </td>
 </tr>

<logic:notEmpty property="cd" name="<%=Constants.ADM_USER_KEY%>">
    <logic:equal value="0" property="cd" name="<%=Constants.ADM_USER_KEY%>">
	<!-- Cimpul 'user_password_o' field. -->
	<tr>
	  <td valign="top" class="label" align="right"><bean:message bundle="admuser" key="adm_user.prompt.user_password_o"/><font color="#336600">*</font> :
	  </td>
	  <td class="text" align="left">
		<html:password errorStyleClass="errorfield" styleClass="field_input" property="user_password_o" value=""/>
		<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.user_password_o"/>"/>
	  </td>
	</tr>
	<!-- Cimpul 'user_passwd' field. -->
    <tr>
      <td valign="top" class="label" align="right"><bean:message bundle="admuser" key="adm_user.prompt.user_passwd"/><font color="#336600">*</font> :
      </td>
      <td class="text" align="left">
        <html:password errorStyleClass="errorfield" styleClass="field_input" property="values.user_passwd" value=""/>
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.user_passwd"/>"/>
      </td>
    </tr>
<!-- Cimpul 'c_user_password' confirmare field. -->
  <tr>
   <td valign="top" class="label" align="right">
	   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/><font color="#336600">*</font> :
   </td>
   <td class="text" align="left">
    <html:password errorStyleClass="errorfield" styleClass="field_input" property="c_user_password"  styleId="cpw" value=""/>
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
   </td>
  </tr>
    </logic:equal>
    <logic:equal value="1"  property="cd" name="<%=Constants.ADM_USER_KEY%>">
       <!-- campul dupa care caut in ldap -->
 <tr>
  <td valign="top"  align="right" width="40%"><bean:message bundle="admuser" key="adm_user.prompt.numeldap"/>
  <font color="#336600">*</font> :
  </td>
  <td class="text" align="left"  width="60%">
    <html:text errorStyleClass="errorfield" styleClass="field_input"  property="numeSearchLdap" />
    <img src="images/quest.gif" width="15" height="15"  style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.numeldap"/>"/>
    <!--Buton cauta in LDAP-->
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.cauta_ldap"/>'   onclick=' send("cautLDAP");'/>
  </td>
</tr>

 <!--Rezultate cautare in LDAP-->
    <html:hidden property="amRezultateCautareLdap"/>

    <!--valoarea da =  am un singur resultat; nu = nu am resultate; dam = am resultate multiple-->
     <logic:equal value="nu" property="amRezultateCautareLdap" name="<%=Constants.ADM_USER_KEY%>" >
      <tr>
        <td colspan="2" class="msg_error" align="center" >
        <font color="red">
          <bean:message bundle="admuserinreg" key="adm_user_inreg.label.nu_rezulate.ldap"/>
        </font>
        </td>
       </tr>
     </logic:equal>

     <logic:equal value="dam" property="amRezultateCautareLdap" name="<%=Constants.ADM_USER_KEY%>" >
      <logic:present  name="<%= AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG%>" scope="session">
       <logic:notEmpty name="<%= AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG%>" scope="session">
        <tr>
         <td class="msg_error" colspan="2" align="center">
           <font color="red">
             <bean:message bundle="admuserinreg" key="adm_user_inreg.label.rezultate.ldap"/>:
             <img title='<bean:message bundle="admuserinreg" key="adm_user_inreg.label.rezultate.ldap"/>'  src="images/view_over.gif" style="cursor:pointer" onclick=' showMapLDAP();' />
           </font>
         </td>
       </tr>
       </logic:notEmpty>
      </logic:present>
  </logic:equal>
 <!--campul 'issuer_name' -->
 <html:hidden property="values.issuer_name" styleId="issuer_name"/>
 <tr>
   <td align="right" >
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.issuer_name"/>:
   </td>
   <td align="left">
    <html:text errorStyleClass="errorfield" styleClass="field_input" property="values.issuer_name"  styleId="issuer_name_t" disabled="true"/>
 </td>
 </tr>
  <!--campul 'serial_number' -->
  <html:hidden property="values.serial_number" styleId="serial_number"/>
 <tr align="right">
  <td>
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.serial_number"/>:
  </td>
  <td align="left" >
    <html:text errorStyleClass="errorfield" styleClass="field_input" property="values.serial_number"  styleId="serial_number_t" disabled="true"/>
  </td>
 </tr>

    </logic:equal>
</logic:notEmpty>

 <tr><td colspan="2" class="info-text" align="left"><bean:message bundle="app" key="grad_clasificare.label.fieldInfo"/></td></tr>
 <!-- START Sectiune de BUTOANE. -->
<!-- buton modificare. -->
<tr>
  <td colspan="2" class="button-row" align="center">
    <html:submit styleClass="button">
      <bean:message bundle="admuser" key="adm_user.button.save"/>
    </html:submit>
    <html:hidden property="method"  value="updateEditUser"/>
  </td>
</tr>
<!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_AdmUserForm" dynamicJavascript="true" staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
