<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Sep 8, 2005
  Time: 9:39:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmUserInregConstants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm"  method="post" action="sys/admuserext.do">
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
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuserext" key="adm_user_ext.label.closeWindow"/>' src="images/close_off.gif" />
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
    <html:form action="/admuserext.do" onsubmit="return validateForm_AdmUserExtForm(this);">
      <!--Campul id_user_ext-->
      <html:hidden property="values.id_user_ext"/>
      <!--Campul cd-->
      <html:hidden property="values.cd"/>
      <!--Campul BI-->
      <html:hidden property="values.bi"/>
      <!-- Cimpul 'fk_user' field. -->
      <html:hidden property="values.fk_user"/>
      <!-- Cimpul 'fk_limba' field. -->
      <html:hidden property="values.fk_limba"/>
      <!--Campul account_creration_date-->
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

     <!--DATE UTILIZATOR-->
   <tr class="even" >
       <td class="label" colspan="2">
         <b><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_utilizator"/></b>
       </td>
  </tr>
  <!-- Cimpul 'nume' field. -->
  <tr>
    <td valign="top" class="label" align="right" >
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.nume_user"/> *:
    </td>
    <td class="text" align="left" >
      <html:text styleClass="field_input" property="values.nume" maxlength="100"/>
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.nume_user"/>" />
    </td>
  </tr>
 <!-- Cimpul 'prenume' field. -->
 <tr>
  <td valign="top" class="label" align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prenume_user"/> *:
  </td>
  <td class="text" align="left">
    <html:text styleClass="field_input" property="values.prenume" maxlength="100" />
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.prenume_user"/>" />
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
<!--Daca modul de autentificare este user parola se poate schimba parola-->
<logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
   <html:hidden property="values.user_passwd"/>
   <input type="hidden" name="label_password" value=' <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/>'/>
   <input type="hidden" name="label_c_password" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/>'/>
   <!--Schimbare parola-->
   <html:hidden property="changeAut" styleId="changeAut" />
   <tr>
      <td valign="top" class="label" align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.change_password"/> :
      </td>
      <td class="text" align="left">
       <input type="checkbox" id="changeAut_boo" onclick="javascript: initChb('changeAut_boo','changeAut');chAutP();"/>
       <script type="text/javascript">
          if (document.getElementById("changeAut").value == "1") {
              document.getElementById("changeAut_boo").checked = true;
          }
          if (document.getElementById("changeAut").value == "2") {
              document.getElementById("changeAut").value = "0";
          }
        </script>
      </td>
    </tr>
<!-- Cimpul 'user_password_n' field. -->
<tr>
 <td valign="top" class="label" align="right">
<logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_pw_1" style="display: none">
</logic:equal>
<logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_pw_1" style="display: inline">
</logic:equal>
<logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_pw_1" style="display: none">
</logic:equal>
       <bean:message bundle="admuserext" key="adm_user_ext.prompt.user_password_n"/> *:
    </div>
     </td>
     <td class="text" align="left">
<logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_pw_2" style="display: none">
</logic:equal>
<logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_pw_2" style="display: inline">
</logic:equal>
<logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_pw_2" style="display: none">
</logic:equal>
      <html:password styleClass="field_input" property="user_password_n" maxlength="25" styleId="pw"  />
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_password"/>" />
  </div>
     </td>
  </tr>
 <!-- Cimpul 'c_user_password' confirmare field. -->
<tr>
  <td valign="top" class="label" align="right">
<logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_cpw_1" style="display: none">
</logic:equal>
<logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_cpw_1" style="display: inline">
</logic:equal>
<logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_cpw_1" style="display: none">
</logic:equal>
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/> *:
</div>
   </td>
   <td class="text" align="left">
<logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_cpw_2" style="display: none">
</logic:equal>
<logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_cpw_2" style="display: inline">
</logic:equal>
<logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
  <div id="div_tr_cpw_2" style="display: none">
</logic:equal>
    <html:password errorStyleClass="errorfield" styleClass="field_input" property="c_user_password" maxlength="25" styleId="cpw" />
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
</div>
   </td>
 </tr>
</logic:equal>

 <tr><td colspan="2" class="info-text" align="left"><bean:message bundle="app" key="grad_clasificare.label.fieldInfo"/></td></tr>
      <tr class="even" >
       <td class="label" colspan="2" >
        <b><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.anunturi"/></b>
       </td>
      </tr>
      <!-- Cimpul 'stiri' field. -->
      <html:hidden property="values.stiri" styleId="stiri"/>
      <tr>
        <td valign="top" class="label" align="right">
         <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.stiri"/> :
        </td>
        <td class="text" align="left" valign="top">
        <input type="checkbox" id="stiri_boo" onclick="javascript: initChb('stiri_boo','stiri');"/>
       <script type="text/javascript">
          if (document.getElementById("stiri").value == "1") {
              document.getElementById("stiri_boo").checked = true;
          }
        </script>
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.stiri"/>" />
       </td>
      </tr>
      <!-- Cimpul 'sig_port' field. -->
      <html:hidden property="values.sig_port" styleId="sig_port"/>
      <tr>
       <td valign="top" class="label" align="right">
        <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.sig_port"/> :
       </td>
       <td class="text" align="left" valign="top">
        <input type="checkbox" id="sig_port_boo" onclick="javascript: initChb('sig_port_boo','sig_port');"/>
       <script type="text/javascript">
          if (document.getElementById("sig_port").value == "1") {
              document.getElementById("sig_port_boo").checked = true;
          }
        </script>
         <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.sig_port"/>" />
       </td>
      </tr>
      <!-- Cimpul 'prot_med' field. -->
      <html:hidden property="values.prot_med" styleId="prot_med"/>
      <tr>
        <td valign="top" class="label" align="right">
          <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prot_med"/> :
        </td>
        <td class="text" align="left" valign="top">
        <input type="checkbox" id="prot_med_boo" onclick="javascript: initChb('prot_med_boo','prot_med');"/>
       <script type="text/javascript">
          if (document.getElementById("prot_med").value == "1") {
              document.getElementById("prot_med_boo").checked = true;
          }
        </script>
         <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.prot_med"/>" />
       </td>
      </tr>
 <!-- START Sectiune de BUTOANE. -->
<!-- buton modificare. -->
<tr>
  <td colspan="2" class="button-row" align="center">
    <html:submit styleClass="button">
      <bean:message bundle="admuserext" key="adm_user_ext.button.save"/>
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
<html:javascript formName="form_AdmUserExtForm" dynamicJavascript="true" staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
