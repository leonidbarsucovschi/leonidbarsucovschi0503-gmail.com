<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmUserInregConstants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="selectionComponent" prefix="selection" %>
<form name="closeForm" method="post" action="sys/admuserext.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
var popupldap;
//caut in ldap si afisez rezultatele
function showListLDAP() {
  var numeLdap = document.getElementById('numeSearchLdap').value;
  popupldap = window.open("/siiv/sys/admuserext.do?method=showListLDAP&numeLdap="+numeLdap,"w1list","height=300,width=500,status=no,toolbar=no,menubar=no,location=no,scrollbars=yes");
}
function setLDAP(issuer_name,serial_number) {
     document.getElementById("issuer_name").value=issuer_name;
     document.getElementById("serial_number").value=serial_number;

     var el_1 = document.getElementById('div_tr_iss_2');
     while(el_1.hasChildNodes()) {
        el_1.removeChild(el_1.firstChild);
     }
     var txtNod = document.createTextNode(issuer_name);
     el_1.appendChild(txtNod);

     var el_2 = document.getElementById('div_tr_sn_2');
     while(el_2.hasChildNodes()) {
        el_2.removeChild(el_2.firstChild);
     }
     var txtNod = document.createTextNode(serial_number);
     el_2.appendChild(txtNod);

     if(popupldap) popupldap.close();
}
function close() {
 if(popupldap) popupldap.close();
}
function closeWindow() {
    document.closeForm.submit();
}
function showTrAdd() {
    var cd_boo_0 = document.getElementById('cd_boo_0');
    var cd_boo_1 = document.getElementById('cd_boo_1');
    var field = document.getElementById('cd');

    if (cd_boo_0.checked) {
      document.getElementById("div_tr_pw_1").style.display="inline";
      document.getElementById("div_tr_pw_2").style.display="inline";
      document.getElementById("div_tr_cpw_1").style.display="inline";
      document.getElementById("div_tr_cpw_2").style.display="inline";
      document.getElementById("div_tr_btn_1").style.display="none";
      document.getElementById("div_tr_btn_2").style.display="none";
      document.getElementById("div_tr_iss_1").style.display="none";
      document.getElementById("div_tr_iss_2").style.display="none";
      document.getElementById("div_tr_sn_1").style.display="none";
      document.getElementById("div_tr_sn_2").style.display="none";
      field.value="0";
      reset();
    }

    if (cd_boo_1.checked) {
      document.getElementById("div_tr_pw_1").style.display="none";
      document.getElementById("div_tr_pw_2").style.display="none";
      document.getElementById("div_tr_cpw_1").style.display="none";
      document.getElementById("div_tr_cpw_2").style.display="none";
      document.getElementById("div_tr_btn_1").style.display="inline";
      document.getElementById("div_tr_btn_2").style.display="inline";
      document.getElementById("div_tr_iss_1").style.display="inline";
      document.getElementById("div_tr_iss_2").style.display="inline";
      document.getElementById("div_tr_sn_1").style.display="inline";
      document.getElementById("div_tr_sn_2").style.display="inline";
      field.value="1";
      reset();
    }
}
function chAutP() {
  var ch_0  = document.getElementById('ch_0');
  var ch_1  = document.getElementById('ch_1');
  var ch_2  = document.getElementById('ch_2');
  if (ch_0.checked) {
    document.getElementById("div_tr_pw_1").style.display="inline";
    document.getElementById("div_tr_pw_2").style.display="inline";
    document.getElementById("div_tr_cpw_1").style.display="inline";
    document.getElementById("div_tr_cpw_2").style.display="inline";
    document.getElementById("div_tr_btn_1").style.display="none";
    document.getElementById("div_tr_btn_2").style.display="none";
    document.getElementById("div_tr_iss_1").style.display="none";
    document.getElementById("div_tr_iss_2").style.display="none";
    document.getElementById("div_tr_sn_1").style.display="none";
    document.getElementById("div_tr_sn_2").style.display="none";
    reset();
  }
  if (ch_1.checked) {
    document.getElementById("div_tr_pw_1").style.display="none";
    document.getElementById("div_tr_pw_2").style.display="none";
    document.getElementById("div_tr_cpw_1").style.display="none";
    document.getElementById("div_tr_cpw_2").style.display="none";
    document.getElementById("div_tr_btn_1").style.display="inline";
    document.getElementById("div_tr_btn_2").style.display="inline";
    document.getElementById("div_tr_iss_1").style.display="inline";
    document.getElementById("div_tr_iss_2").style.display="inline";
    document.getElementById("div_tr_sn_1").style.display="inline";
    document.getElementById("div_tr_sn_2").style.display="inline";
    reset();
  }
  if (ch_2.checked) {
    document.getElementById("div_tr_pw_1").style.display="none";
    document.getElementById("div_tr_pw_2").style.display="none";
    document.getElementById("div_tr_cpw_1").style.display="none";
    document.getElementById("div_tr_cpw_2").style.display="none";
    document.getElementById("div_tr_btn_1").style.display="none";
    document.getElementById("div_tr_btn_2").style.display="none";
    document.getElementById("div_tr_iss_1").style.display="none";
    document.getElementById("div_tr_iss_2").style.display="none";
    document.getElementById("div_tr_sn_1").style.display="none";
    document.getElementById("div_tr_sn_2").style.display="none";
    reset();
  }
}
function chAut() {
  var ch_0  = document.getElementById('ch_0');
  var ch_1  = document.getElementById('ch_1');
  var ch_2  = document.getElementById('ch_2');
  if (ch_0.checked) {
    document.getElementById("div_tr_pw_1").style.display="none";
    document.getElementById("div_tr_pw_2").style.display="none";
    document.getElementById("div_tr_cpw_1").style.display="none";
    document.getElementById("div_tr_cpw_2").style.display="none";
    document.getElementById("div_tr_btn_1").style.display="inline";
    document.getElementById("div_tr_btn_2").style.display="inline";
    document.getElementById("div_tr_iss_1").style.display="inline";
    document.getElementById("div_tr_iss_2").style.display="inline";
    document.getElementById("div_tr_sn_1").style.display="inline";
    document.getElementById("div_tr_sn_2").style.display="inline";
    reset();
  }
  if (ch_1.checked) {
    document.getElementById("div_tr_pw_1").style.display="inline";
    document.getElementById("div_tr_pw_2").style.display="inline";
    document.getElementById("div_tr_cpw_1").style.display="inline";
    document.getElementById("div_tr_cpw_2").style.display="inline";
    document.getElementById("div_tr_btn_1").style.display="none";
    document.getElementById("div_tr_btn_2").style.display="none";
    document.getElementById("div_tr_iss_1").style.display="none";
    document.getElementById("div_tr_iss_2").style.display="none";
    document.getElementById("div_tr_sn_1").style.display="none";
    document.getElementById("div_tr_sn_2").style.display="none";
    reset();
  }
  if (ch_2.checked) {
    document.getElementById("div_tr_pw_1").style.display="none";
    document.getElementById("div_tr_pw_2").style.display="none";
    document.getElementById("div_tr_cpw_1").style.display="none";
    document.getElementById("div_tr_cpw_2").style.display="none";
    document.getElementById("div_tr_btn_1").style.display="none";
    document.getElementById("div_tr_btn_2").style.display="none";
    document.getElementById("div_tr_iss_1").style.display="none";
    document.getElementById("div_tr_iss_2").style.display="none";
    document.getElementById("div_tr_sn_1").style.display="none";
    document.getElementById("div_tr_sn_2").style.display="none";
    reset();
  }
}
function reset() {
 document.getElementById('pw').value='';
 document.getElementById('cpw').value='';
 document.getElementById('numeSearchLdap').value='';
 document.getElementById('issuer_name').value='';
 document.getElementById('serial_number').value='';
 var el_1 = document.getElementById('div_tr_iss_2');
 while(el_1.hasChildNodes()) {
  el_1.removeChild(el_1.firstChild);
 }
 var el_2 = document.getElementById('div_tr_sn_2');
 while(el_2.hasChildNodes()) {
  el_2.removeChild(el_2.firstChild);
 }
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
function initAcountStatus(id_boo,id) {
 var chb = document.getElementById(id_boo);
 var field = document.getElementById(id);
 if (chb.checked) {
   field.value="0";
 }else {
   field.value="1";
 }
}
</script>

<div class="table">

<table width="100%" border="0" cellpadding="0" cellspacing="1">
 <tr>
  <td width="100%" valign="top" align="left" class="page-subtitle">&nbsp;
  <!-- Titlul ferestrei pentru adaugare. -->
  <logic:empty  name="<%=Constants.ADM_USER_EXT_KEY%>"  property="values.primaryKey" scope="request">
   <bean:message bundle="admuserext" key="adm_user_ext.title.add"/>
  </logic:empty>
  <!-- Titlul ferestrei pentru modificare. -->
  <logic:notEmpty  name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.primaryKey" scope="request">
   <bean:message bundle="admuserext" key="adm_user_ext.title.save"/>
  </logic:notEmpty>
  <!-- END Sectiune de Titlu pagina. -->
  </td>
  <td class="bottom" align="right">
   <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuserext" key="adm_user_ext.label.closeWindow"/>' src="images/close_off.gif" />
  </td>
 </tr>
</table>

<table width="100%" border="0" cellpadding="0" cellspacing="1">
<logic:messagesPresent>
 <tr>
  <td valign="top" colspan="2" class="msg_error" align="center">
     <ul>
      <html:messages id="error">
       <li><bean:write name="error"/></li>
      </html:messages>
     </ul>
  </td>
 </tr>
</logic:messagesPresent>
</table>

<table width="100%" border="0" cellpadding="0" cellspacing="1">
 <!-- START Sectiune de FORM. -->
 <html:form action="/admuserext.do" onsubmit="return validateForm_AdmUserExtForm(this);">

 <!--campuri hidden-->

 <html:hidden property="values.id_user_ext"/>
 <!-- Cimpul 'fk_user' field. -->
 <html:hidden property="values.fk_user"/>
 <!--Campul account_creration_date-->
 <html:hidden property="values.account_creation_dateString"/>
 <!--campul account_deletion_date-->
 <html:hidden property="values.account_deletion_dateString"/>
 <!--campul logged-->
 <html:hidden property="values.logged"/>
 <!--campul user_type-->
 <html:hidden property="values.user_type"/>

 <!--campul user_login-->
  <tr>
    <td valign="top" class="label" align="right" width="40%">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_login"/> *:
    </td>
    <td class="field_text" align="left" width="60%">
     <html:text property="values.user_login" styleClass="field_input" maxlength="25"/>
     <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_login"/>" />
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
<!--Campul account_status-->
<html:hidden property="values.account_status" styleId="account_status"/>
<tr>
 <td valign="top" class="label" align="right">
   <bean:message bundle="admuserext" key="adm_user_ext.label.active_user"/> :
  </td>
  <td class="text" align="left">
    <input type="checkbox" id="account_status_boo" onclick="javascript: initAcountStatus('account_status_boo','account_status');"/>
    <script type="text/javascript">
      if (document.getElementById("account_status").value == "0") {
          document.getElementById("account_status_boo").checked = true;
      }
    </script>
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserext" key="adm_user_ext.label.tooltip.active_user"/>" />
  </td>
</tr>
<!-##################################################################################-->
<!--Start adaugare  mod de autentificare-->
<!-##################################################################################-->
<logic:empty  name="<%=Constants.ADM_USER_EXT_KEY%>"  property="values.primaryKey" scope="request">
 <!--Campul CD -->
 <html:hidden property="values.cd" styleId="cd"/>
 <tr>
  <td valign="top" class="label" align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.mod_autentificare"/> *:
  </td>
  <td class="text" align="left">
   <input type="radio" name="cd_boo" id="cd_boo_1" value="1" onclick="javascript: showTrAdd();"/>
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.cd"/>
   <br>
   <input type="radio" name="cd_boo" id="cd_boo_0" value="0" onclick="javascript: showTrAdd();"/>
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.up"/>
  </td>
 </tr>
 <script type="text/javascript">
  if (document.getElementById("cd").value == "1") {
    document.getElementById("cd_boo_1").checked = true;
  }
  if (document.getElementById("cd").value == "0") {
    document.getElementById("cd_boo_0").checked = true;
  }
 </script>
 <!-- Cimpul 'user_password' field. -->
 <tr>
  <td valign="top" class="label" align="right">
    <logic:equal value="<%=String.valueOf(0)%>" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: inline" id="div_tr_pw_1" >
    </logic:equal>
    <logic:equal value="<%=String.valueOf(1)%>" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: none" id="div_tr_pw_1" >
    </logic:equal>
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/> *:
      </div>
  </td>
  <td class="text" align="left">
    <logic:equal value="<%=String.valueOf(0)%>" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: inline" id="div_tr_pw_2" >
    </logic:equal>
    <logic:equal value="<%=String.valueOf(1)%>" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: none" id="div_tr_pw_2" >
    </logic:equal>
      <html:password styleClass="field_input" property="values.user_passwd" size="30" styleId="pw"/>
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_password"/>" />
     </div>
  </td>
 </tr>
 <!-- Cimpul 'c_user_password' confirmare field. -->
<tr>
 <td valign="top" class="label" align="right">
   <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: inline" id="div_tr_cpw_1">
   </logic:equal>
   <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: none" id="div_tr_cpw_1">
   </logic:equal>
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/> *:
    </div>
   </td>
   <td class="text" align="left">
     <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
       <div style="display: inline" id="div_tr_cpw_2">
     </logic:equal>
     <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
       <div style="display: none" id="div_tr_cpw_2">
     </logic:equal>
       <html:password styleClass="field_input" property="c_user_password" size="30" styleId="cpw"/>
       <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
      </div>
   </td>
 </tr>
<!-- campul dupa care caut in ldap -->
<tr>
 <td align="right" class="label">
   <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div style="display: inline" id="div_tr_btn_1">
   </logic:equal>
   <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div style="display: none" id="div_tr_btn_1">
   </logic:equal>
      <bean:message bundle="admuser" key="adm_user.prompt.numeldap"/> *:
    </div>
 </td>
 <td class="text" align="left">
   <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div style="display: inline" id="div_tr_btn_2">
   </logic:equal>
   <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div style="display: none" id="div_tr_btn_2">
   </logic:equal>
      <html:text errorStyleClass="errorfield" styleClass="field_input"  property="numeSearchLdap" styleId="numeSearchLdap"/>
      <img src="images/quest.gif" width="15" height="15"  style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.numeldap"/>"/>
      <!--Buton cauta in LDAP-->
      <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.cauta_ldap"/>'   onclick="javascript: showListLDAP();"/>
    </div>
 </td>
</tr>
 <!--campul 'issuer_name' -->
 <html:hidden property="values.issuer_name" styleId="issuer_name"/>
 <tr>
  <td align="right" class="label">
    <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: inline" id="div_tr_iss_1">
    </logic:equal>
    <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: none" id="div_tr_iss_1">
    </logic:equal>
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.issuer_name"/> *:
      </div>
  </td>
  <td align="left" class="text" id="el_1" >
     <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: inline" id="div_tr_iss_2">
    </logic:equal>
    <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: none" id="div_tr_iss_2">
    </logic:equal>
       <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.issuer_name"/>
      </div>
  </td>
</tr>
<!--campul 'serial_number' -->
<html:hidden property="values.serial_number" styleId="serial_number"/>
<tr>
 <td align="right" class="label">
   <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: inline" id="div_tr_sn_1">
   </logic:equal>
   <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: none" id="div_tr_sn_1">
   </logic:equal>
      <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.serial_number"/> *:
     </div>
 </td>
 <td align="left" class="text" id="el_2" >
    <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: inline" id="div_tr_sn_2">
   </logic:equal>
   <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div style="display: none" id="div_tr_sn_2">
   </logic:equal>
       <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.serial_number"/>
     </div>
 </td>
</tr>
</logic:empty>
<!-##################################################################################-->
<!--End adaugare mod de autentificare-->
<!-##################################################################################-->


<!-##################################################################################-->
<!--Start editare mod de autentificare-->
<!-##################################################################################-->
<logic:notEmpty  name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.primaryKey" scope="request">

<!-- Cimpul 'cd' field. -->
<html:hidden property="values.cd"/>
<tr>
  <td valign="top" class="label" align="right">
       <bean:message bundle="admuserext" key="adm_user_ext.prompt.mod_autentificare"/> :
  </td>
  <td class="text">
         <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.cd"/></logic:equal>
         <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.up"/></logic:equal>
  </td>
</tr>

<!--##################  Start editare  mod de autentificare CD  ######################-->
<logic:equal value="1" name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.cd">
<!--campul 'issuer_name' -->
 <html:hidden property="values.issuer_name"/>
 <tr>
  <td align="right" class="label">
    <bean:message bundle="admuserext" key="adm_user_ext.prompt.issuer_name_e"/> :
  </td>
  <td align="left" class="field_text">
    <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.issuer_name"/>
  </td>
 </tr>
 <!--campul 'serial_number' -->
  <html:hidden property="values.serial_number"/>
  <tr>
   <td align="right" class="label">
      <bean:message bundle="admuserext" key="adm_user_ext.prompt.serial_number_e"/> :
   </td>
   <td align="left" class="field_text">
       <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.serial_number"/>
   </td>
  </tr>
<!--Campul changeAut-->
   <tr>
    <td align="right" class="label" >
      <bean:message bundle="admuserext" key="adm_user_ext.prompt.nochange"/> :
    </td>
    <td align="left">
      <html:radio property="changeAut" value="2" onclick="javascript: chAut();" styleId="ch_2" />
    </td>
   </tr>
   <tr>
    <td align="right" class="label" >
      <bean:message bundle="admuserext" key="adm_user_ext.prompt.changecd"/> :
    </td>
    <td align="left">
      <html:radio property="changeAut" value="0" onclick="javascript: chAut();"  styleId="ch_0"/>
    </td>
   </tr>
   <tr>
    <td align="right" class="label" >
      <bean:message bundle="admuserext" key="adm_user_ext.prompt.changeaut" /> :
    </td>
    <td align="left">
      <html:radio property="changeAut" value="1"  onclick="javascript: chAut();"  styleId="ch_1"/>
    </td>
   </tr>
<!-- campul dupa care caut in ldap -->
<tr>
  <td align="right" class="label">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_1" style="display: none">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_1" style="display: inline">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_1" style="display: none">
   </logic:equal>
      <bean:message bundle="admuser" key="adm_user.prompt.numeldap"/> *:
     </div>
  </td>
  <td class="text" align="left">
    <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_2" style="display: none">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_2" style="display: inline">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_2" style="display: none">
   </logic:equal>
      <html:text errorStyleClass="errorfield" styleClass="field_input"  property="numeSearchLdap" styleId="numeSearchLdap"/>
      <img src="images/quest.gif" width="15" height="15"  style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.numeldap"/>"/>
      <!--Buton cauta in LDAP-->
      <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.cauta_ldap"/>'   onclick="javascript: showListLDAP();"/>
     </div>
   </td>
</tr>
<!--campul 'issuer_name' -->
 <html:hidden property="issuer_name_n" styleId="issuer_name"/>
<tr>
 <td align="right" class="label">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div style="display: none" id="div_tr_iss_1">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div style="display: inline" id="div_tr_iss_1">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div style="display: none" id="div_tr_iss_1">
   </logic:equal>
        <bean:message bundle="admuserext" key="adm_user_ext.prompt.issuer_name_n"/> *:
     </div>
  </td>
  <td align="left" class="text" id="el_1" >
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div style="display: none" id="div_tr_iss_2">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div style="display: inline" id="div_tr_iss_2">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div style="display: none" id="div_tr_iss_2">
   </logic:equal>
       <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="issuer_name_n"/>
     </div>
  </td>
</tr>
<!--campul 'serial_number' -->
   <html:hidden property="serial_number_n" styleId="serial_number"/>
<tr>
 <td align="right" class="label">
  <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: none" id="div_tr_sn_1">
  </logic:equal>
  <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: inline" id="div_tr_sn_1">
  </logic:equal>
  <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: none" id="div_tr_sn_1">
  </logic:equal>
      <bean:message bundle="admuserext" key="adm_user_ext.prompt.serial_number_n"/> *:
    </div>
 </td>
 <td align="left" class="text" id="el_2" >
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: none" id="div_tr_sn_2">
  </logic:equal>
  <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: inline" id="div_tr_sn_2">
  </logic:equal>
  <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: none" id="div_tr_sn_2">
  </logic:equal>
       <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="serial_number_n"/>
  </td>
</tr>
<!-- Cimpul 'user_passwd' field. -->
<input type="hidden" name="label_password" value=' <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/>'/>
<input type="hidden" name="label_c_password" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/>'/>
<tr>
 <td valign="top" class="label" align="right">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: none" id="div_tr_pw_1" >
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: none" id="div_tr_pw_1" >
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: inline" id="div_tr_pw_1" >
   </logic:equal>
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/> *:
    </div>
 </td>
 <td class="text" align="left">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: none" id="div_tr_pw_2" >
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: none" id="div_tr_pw_2" >
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
    <div style="display: inline" id="div_tr_pw_2" >
   </logic:equal>
      <html:password errorStyleClass="errorfield" styleClass="field_input" property="values.user_passwd" maxlength="25" styleId="pw"/>
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_password"/>" />
    </div>
 </td>
</tr>
<!-- Cimpul 'c_user_password' confirmare field. -->
<tr>
  <td valign="top" class="label" align="right">
    <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: none" id="div_tr_cpw_1" >
    </logic:equal>
    <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: none" id="div_tr_cpw_1" >
    </logic:equal>
    <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: inline" id="div_tr_cpw_1" >
    </logic:equal>
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/> *:
    </div>
 </td>
 <td class="text" align="left">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: none" id="div_tr_cpw_1" >
    </logic:equal>
    <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: none" id="div_tr_cpw_1" >
    </logic:equal>
    <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div style="display: inline" id="div_tr_cpw_1" >
    </logic:equal>
       <html:password errorStyleClass="errorfield" styleClass="field_input" property="c_user_password" maxlength="25" styleId="cpw"/>
       <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
     </div>
  </td>
 </tr>
</logic:equal>


<!--############# Start editare  mod de autentificare PW ################################-->

<logic:equal value="0" name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.cd">
<!--Campul user_passwd-->
<html:hidden property="values.user_passwd"/>

<!--Campul changeAut-->
   <tr>
    <td align="right" class="label" >
      <bean:message bundle="admuserext" key="adm_user_ext.prompt.nochange"/> :
    </td>
    <td align="left">
      <html:radio property="changeAut" value="2" onclick="javascript: chAutP();" styleId="ch_2"/>
    </td>
   </tr>
   <tr>
    <td align="right" class="label" >
      <bean:message bundle="admuserext" key="adm_user_ext.prompt.changepw" /> :
    </td>
    <td align="left">
      <html:radio property="changeAut" value="0" onclick="javascript: chAutP();" styleId="ch_0"/>
    </td>
   </tr>
   <tr>
    <td align="right" class="label" >
      <bean:message bundle="admuserext" key="adm_user_ext.prompt.changeaut"/> :
    </td>
    <td align="left">
      <html:radio property="changeAut" value="1"  onclick="javascript: chAutP();" styleId="ch_1"/>
    </td>
   </tr>

<!-- campul dupa care caut in ldap -->
<tr>
 <td align="right" class="label">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_1" style="display: none">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_1" style="display: none">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_1" style="display: inline">
    </logic:equal>
      <bean:message bundle="admuser" key="adm_user.prompt.numeldap"/> *:
     </div>
 </td>
 <td class="text" align="left">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_2" style="display: none">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_2" style="display: none">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_btn_2" style="display: inline">
    </logic:equal>
      <html:text errorStyleClass="errorfield" styleClass="field_input"  property="numeSearchLdap" styleId="numeSearchLdap"/>
      <img src="images/quest.gif" width="15" height="15"  style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.numeldap"/>"/>
<!--Buton cauta in LDAP-->
      <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.cauta_ldap"/>'   onclick="javascript: showListLDAP();"/>
    </div>
 </td>
</tr>
<!--campul 'issuer_name' -->
<html:hidden property="values.issuer_name" styleId="issuer_name"/>
<tr>
 <td align="right" class="label">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_iss_1" style="display: none">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_iss_1" style="display: none">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_iss_1" style="display: inline">
   </logic:equal>
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.issuer_name"/> *:
    </div>
 </td>
 <td align="left" class="text" id="el_1" >
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_iss_2" style="display: none">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_iss_2" style="display: none">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_iss_2" style="display: inline">
   </logic:equal>
      <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.issuer_name"/>
    </div>
 </td>
</tr>
<!--campul 'serial_number' -->
   <html:hidden property="values.serial_number" styleId="serial_number"/>
<tr>
 <td align="right" class="label">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_sn_1" style="display: none">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_sn_1" style="display: none">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_sn_1" style="display: inline">
   </logic:equal>
      <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.serial_number"/> *:
    </div>
  </td>
  <td align="left" class="text" id="el_2" >
     <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_sn_2" style="display: none">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_sn_2" style="display: none">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
     <div id="div_tr_sn_2" style="display: inline">
   </logic:equal>
       <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.serial_number"/>
     </div>
  </td>
</tr>
<!-- Cimpul 'user_password_n' field. -->
<input type="hidden" name="label_password" value=' <bean:message bundle="admuserext" key="adm_user_ext.prompt.user_password_n"/>'/>
<input type="hidden" name="label_c_password" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/>'/>
<tr>
 <td valign="top" class="label" align="right">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div id="div_tr_pw_1" style="display: none">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div id="div_tr_pw_1" style="display: inline">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div id="div_tr_pw_1" style="display: none">
   </logic:equal>
       <bean:message bundle="admuserext" key="adm_user_ext.prompt.user_password_n"/> *:
      </div>
 </td>
 <td class="text" align="left">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div id="div_tr_pw_2" style="display: none">
   </logic:equal>
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div id="div_tr_pw_2" style="display: inline">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
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
    <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div id="div_tr_cpw_1" style="display: none">
    </logic:equal>
    <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div id="div_tr_cpw_1" style="display: inline">
    </logic:equal>
    <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div id="div_tr_cpw_1" style="display: none">
    </logic:equal>
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/> *:
     </div>
 </td>
 <td class="text" align="left">
   <logic:equal value="2" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div id="div_tr_cpw_2" style="display: none">
    </logic:equal>
    <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div id="div_tr_cpw_2" style="display: inline">
    </logic:equal>
    <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_EXT_KEY%>">
      <div id="div_tr_cpw_2" style="display: none">
    </logic:equal>
      <html:password errorStyleClass="errorfield" styleClass="field_input" property="c_user_password" maxlength="25" styleId="cpw" />
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
    </div>
  </td>
 </tr>
</logic:equal>

</logic:notEmpty>
<!--############## End editare mod de autentificare ##########################-->


<tr class="even">
  <td class="label" colspan="2" >
    <b><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.informatii"/></b>
   </td>
</tr>
      <!-- Cimpul 'bi' buletin informativ field. -->
      <html:hidden property="values.bi" styleId="bi"/>
      <tr>
       <td valign="top" class="label" align="right">
         <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.bi"/> :
       </td>
       <td class="text" align="left" valign="top">
        <input type="checkbox" id="bi_boo" onclick="javascript: initChb('bi_boo','bi');"/>
       <script type="text/javascript">
          if (document.getElementById("bi").value == "1") {
              document.getElementById("bi_boo").checked = true;
          }
        </script>
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.bi"/>" />
       </td>
      </tr>
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
      <!-- Cimpul 'fk_limba' field. -->
 <tr>
   <td valign="top" class="label" align="right">
    <bean:message bundle="admuserext" key="adm_user_ext.prompt.fk_limba"/> *:
   </td>
   <td class="text" align="left">
		 <selection:selectionComponent property="values.fk_limba" detailsFieldName="denumire" idTableName="lmb.ID_LIMBA" multiple="false">
       <selection:genericSelection searchCaseId="nomLimba" knownFieldName="cod" showCodeInsert="true" styleClass="field_input_small">
       </selection:genericSelection>
    </selection:selectionComponent>
   </td>
 </tr>
<%-- <tr>--%>
<%--    <td colspan="2" class="info-text" align="left">--%>
<%--     <bean:message bundle="app" key="grad_clasificare.label.fieldInfo"/>--%>
<%--    </td>--%>
<%-- </tr>--%>
  <!-- START Sectiune de BUTOANE. -->
  <logic:empty  name="<%=Constants.ADM_USER_EXT_KEY%>"  property="values.primaryKey" scope="request">
  <!-- Buton adugare. -->
  <tr>
    <td colspan="2" class="button-row" align="center">
      <html:submit styleClass="button">
        <bean:message bundle="admuserext" key="adm_user_ext.button.add"/>
      </html:submit>
      <html:hidden property="method"  value="add"/>
    </td>
  </tr>
</logic:empty>
<logic:notEmpty  name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.primaryKey" scope="request">
<!-- buton modificare. -->
<tr>
  <td colspan="2" class="button-row" align="center">
    <html:submit styleClass="button">
      <bean:message bundle="admuserext" key="adm_user_ext.button.save"/>
    </html:submit>
    <html:hidden property="method"  value="update"/>
  </td>
</tr>
</logic:notEmpty>
<!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_AdmUserExtForm" dynamicJavascript="true" staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
