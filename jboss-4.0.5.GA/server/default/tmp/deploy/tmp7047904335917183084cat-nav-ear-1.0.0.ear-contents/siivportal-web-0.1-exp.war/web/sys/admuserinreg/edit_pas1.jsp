<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.waf.web.action.JPortalActionContext"%>
<%@ page import="ro.uti.settings.util.ThreadSafeSDFs" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm"  method="post" action="sys/admuserinreg.do">
 <html:hidden property="method"  value="list"/>
</form>
<script>
var popupldap;
function closeWindow(){
  document.closeForm.submit();
}
//din acesta pagina se pot face mai multe cereri catre server
function send(method) {
      var el = document.getElementById('fdata');
      var m = document.getElementById('m');
      if  (method=="nextEdit") {
        m.value="nextEdit";
        el.submit();
      }
}
//caut in ldap si afisez rezultatele
function showListLDAP() {
  var numeLdap = document.getElementById('numeSearchLdap').value;
  popupldap = window.open("/siiv/sys/admuserinreg.do?method=showListLDAP&numeLdap="+numeLdap,"w1list","height=300,width=500,status=no,toolbar=no,menubar=no,location=no,scrollbars=yes");
}
function setLDAP(issuer_name,serial_number) {
     document.getElementById("issuer_name").value=issuer_name;
     document.getElementById("serial_number").value=serial_number;

     var el_1 = document.getElementById('div_triss_2');
     while(el_1.hasChildNodes()) {
        el_1.removeChild(el_1.firstChild);
     }
     var txtNod = document.createTextNode(issuer_name);
     el_1.appendChild(txtNod);

     var el_2 = document.getElementById('div_trsn_2');
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
//se schimba sau nu modul de autentificare
function chAut() {
 var trup = document.getElementById('trup');
 var trcup = document.getElementById('trcup');
 var trbtn = document.getElementById('trbtn');
 var triss = document.getElementById('triss');
 var trsn = document.getElementById('trsn');
 var ch = document.getElementById('ch1');
 if (ch.checked) {
   reset();
   trup.style.display="inline";
   trcup.style.display="inline";
   trbtn.style.display="none";
   triss.style.display="none";
   trsn.style.display="none";
 }else {
   reset();
   trup.style.display="none";
   trcup.style.display="none";
   trbtn.style.display="inline";
   triss.style.display="inline";
   trsn.style.display="inline";
 }
}
function reset() {
 document.getElementById('pw').value='';
 document.getElementById('cpw').value='';
 document.getElementById('numeSearchLdap').value='';
 document.getElementById('issuer_name').value='';
 document.getElementById('serial_number').value='';
 var el_1 = document.getElementById('div_triss_2');
 while(el_1.hasChildNodes()) {
  el_1.removeChild(el_1.firstChild);
 }
 var el_2 = document.getElementById('div_trsn_2');
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
</script>
<div class="table">

<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr class="page-subtitle">
  <td width="100%" valign="top" align="left">&nbsp;
    <!-- Titlu pas 1. -->
	  <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prelucrare_date_utilizator"/>
	<!-- END Sectiune de Titlu pagina. -->
  </td>
  <td class="bottom" align="right">
    <img border="0" style="cursor:pointer" onclick="closeWindow();" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' src="<bean:message bundle="mesajsite" key="mesaj_site.button.closeWindow.path"/>" />
  </td>
 </tr>
</table>

<table width="100%" border="0" cellpadding="0" cellspacing="1">
  <logic:messagesPresent>
   <tr>
     <td valign="top" colspan="2" class="msg_error " align="center">
       <ul><html:messages id="error"><li><bean:write name="error"/></li></html:messages></ul>
     </td>
   </tr>
 </logic:messagesPresent>
</table>

<table width="100%" border="0" cellpadding="0" cellspacing="1">

 <!-- START Sectiune de FORM. -->
 <html:form action="/admuserinreg.do" styleId="fdata">

    <!--Campurile hidden -->
    <html:hidden property="values.id_user_inreg"/>
    <!-- Cimpul 'method' field. -->
    <html:hidden property="method" styleId="m"/>
    <!--Camp nr pas-->
    <html:hidden property="pas" value="1"/>

    <!--celelalte campuri din forma care nu sunt aici completate-->
    <html:hidden property="values.fk_limba_stiri"/>

    <html:hidden property="t0"/>
    <html:hidden property="t1"/>
    <html:hidden property="t2"/>
    <html:hidden property="t3"/>
    <html:hidden property="t4"/>
    <html:hidden property="t5"/>
    <html:hidden property="t6"/>
    <html:hidden property="t7"/>
    <html:hidden property="t8"/>
    <html:hidden property="t9"/>

    <!--pas 3-->
    <html:hidden property="values.is_oaf"/>
    <html:hidden property="values.obs_oaf"/>
    <html:hidden property="values.is_cat_com"/>
    <html:hidden property="values.obs_cat_com"/>
    <html:hidden property="values.is_cat_naval"/>
    <html:hidden property="values.obs_cat_naval"/>
    <html:hidden property="values.is_nom"/>
    <html:hidden property="values.obs_nom"/>


 <tr class="even">
    <td class="label" colspan="2" >
       <b><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_utilizator"/></b>
    </td>
 </tr>
 <!-- Cimpul 'nume_user' field. -->
 <tr>
  <td valign="top" class="label" align="right" width="40%" >
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.nume_user"/> *:
  </td>
  <td class="text" align="left" width="60%" >
     <html:text styleClass="field_input" property="values.nume_user" maxlength="100"/>
     <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.nume_user"/>" />
  </td>
 </tr>
 <!-- Cimpul 'prenume_user' field. -->
 <tr>
  <td valign="top" class="label" align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prenume_user"/> *:
  </td>
  <td class="text" align="left">
    <html:text styleClass="field_input" property="values.prenume_user" maxlength="100" />
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.prenume_user"/>" />
  </td>
 </tr>
 <!-- Cimpul 'email_user' field. -->
 <tr>
  <td valign="top" class="label" align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.email_user"/> *:
  </td>
  <td class="text" align="left">
   <html:text styleClass="field_input" property="values.email_user" size="30"/>
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.email_user"/>" />
  </td>
 </tr>
 <!-- Cimpul 'user_login' field. -->
 <html:hidden property="values.user_login"/>
 <tr>
  <td valign="top" class="label" align="right">
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_login"/> *:
  </td>
  <td class="field_text" align="left">
    <bean:write  property="values.user_login" name="<%=Constants.ADM_USER_INREG_KEY%>"/>
<%--   <html:text styleClass="field_input" property="values.user_login" size="30" styleId="ul"/>--%>
<%--   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_login"/>" />--%>
  </td>
 </tr>
  <!-- Cimpul 'data_cerere' field. -->
  <html:hidden property="values.data_cerere"/>
    <tr>
      <td valign="top" class="label" align="right">
        <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.data_cerere"/> :
      </td>
      <td class="field_text" align="left">
        <logic:notEmpty property="values.data_cerere" name="<%=Constants.ADM_USER_INREG_KEY%>" >
           <bean:define id="cerereDate" property="values.data_cerere" name="<%=Constants.ADM_USER_INREG_KEY%>" type="java.util.Date" />
           <%=ThreadSafeSDFs.getSdf().format(cerereDate)%>
        </logic:notEmpty>
      </td>
    </tr>
 <!-- Cimpul 'cd' field. -->
 <html:hidden property="valuesadd_admuser.cd" />
 <tr>
  <td valign="top" class="label" align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.mod_autentificare"/> :
  </td>
  <td class="text" align="left">
   <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.cd"/></logic:equal>
   <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.up"/></logic:equal>
  </td>
 </tr>

<!--Daca a ales ca mod de autentificare CD-ul -->
  <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>">
   <!--Campul changeAut-->
   <tr>
    <td align="right" class="label" >
      <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.nochange"/> :
    </td>
    <td align="left">
      <html:radio property="changeAut" value="0" onclick=" chAut();"/>
    </td>
   </tr>
   <tr>
    <td align="right" class="label" >
      <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.change"/> :
    </td>
    <td align="left">
      <html:radio property="changeAut" value="1" styleId="ch1" onclick=" chAut();"/>
    </td>
   </tr>
  <!-- campul dupa care caut in ldap -->
<tr>
 <td align="right" class="label">
  <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
    <div id="div_trbtn_1" style="display: inline">
  </logic:equal>
  <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
    <div id="div_trbtn_1" style="display: none">
  </logic:equal>
      <bean:message bundle="admuser" key="adm_user.prompt.numeldap"/> *:
    </div>
 </td>
 <td class="text" align="left">
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
    <div id="div_trbtn_2" style="display: inline">
  </logic:equal>
  <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
    <div id="div_trbtn_2" style="display: none">
  </logic:equal>
      <html:text errorStyleClass="errorfield" styleClass="field_input"  property="numeSearchLdap" styleId="numeSearchLdap"/>
      <img src="images/quest.gif" width="15" height="15"  style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.numeldap"/>"/>
      <!--Buton cauta in LDAP-->
      <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.cauta_ldap"/>'   onclick=" showListLDAP();"/>
   </div>
 </td>
</tr>
   <!--campul 'issuer_name' -->
   <html:hidden property="values.issuer_name" styleId="issuer_name"/>
 <tr>
  <td align="right" class="label">
   <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
     <div id="div_triss_1" style="display: inline">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
     <div id="div_triss_1" style="display: none">
   </logic:equal>
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.issuer_name"/>:
     </div>
  </td>
  <td align="left" class="text" id="el_1" >
    <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
     <div id="div_triss_2" style="display: inline">
   </logic:equal>
   <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
     <div id="div_triss_2" style="display: none">
   </logic:equal>
       <bean:write name="<%=Constants.ADM_USER_INREG_KEY%>" property="values.issuer_name"/>
     </div>
  </td>
</tr>
   <!--campul 'serial_number' -->
   <html:hidden property="values.serial_number" styleId="serial_number"/>
 <tr>
  <td align="right" class="label">
    <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
      <div id="div_trsn_1" style="display: inline">
    </logic:equal>
    <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
      <div id="div_trsn_1" style="display: none">
    </logic:equal>
      <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.serial_number"/>:
      </div>
  </td>
  <td align="left" class="text" id="el_2" >
     <logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
      <div id="div_trsn_2" style="display: inline">
    </logic:equal>
    <logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
      <div id="div_trsn_2" style="display: none">
    </logic:equal>
     <bean:write name="<%=Constants.ADM_USER_INREG_KEY%>" property="values.serial_number"/>
    </div>
  </td>
</tr>
 <!-- Cimpul 'user_password' field. -->
 <input type="hidden" name="label_password" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/>'/>
 <input type="hidden" name="label_c_password" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/>'/>
<tr>
  <td valign="top" class="label" align="right">
<logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
   <div id="div_trup_1" style="display: none">
</logic:equal>
<logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
   <div id="div_trup_1" style="display: inline">
</logic:equal>
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/> *:
  </div>
 </td>
  <td class="text" align="left">
<logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
   <div id="div_trup_2" style="display: none">
</logic:equal>
<logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
   <div id="div_trup_2" style="display: inline">
</logic:equal>
      <html:password styleClass="field_input" property="values.user_password" maxlength="25" styleId="pw"/>
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_password"/>" />
    </div>
  </td>
</tr>
 <!-- Cimpul 'c_user_password' confirmare field. -->
 <tr>
  <td valign="top" class="label" align="right">
<logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
   <div id="div_trcup_1" style="display: none">
</logic:equal>
<logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
  <div id="div_trcup_1" style="display: inline">
</logic:equal>
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/> *:
  </div>
 </td>
   <td class="text" align="left">
<logic:equal value="0" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
   <div id="div_trcup_2" style="display: none">
</logic:equal>
<logic:equal value="1" property="changeAut" name="<%=Constants.ADM_USER_INREG_KEY%>">
  <div id="div_trcup_2" style="display: inline">
</logic:equal>
    <html:password styleClass="field_input" property="c_user_password" maxlength="25" styleId="cpw"/>
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
  </div>
 </td>
</tr>
  <script>
    var trup_1 = document.getElementById('div_trup_1');
    var trup_2 = document.getElementById('div_trup_2');
    var trcup_1 = document.getElementById('div_trcup_1');
    var trcup_2 = document.getElementById('div_trcup_2');
    var ch = document.getElementById('ch1');
    if (ch.checked) {
      trup_1.style.display="inline";
      trup_2.style.display="inline";
      trcup_1.style.display="inline";
      trcup_2.style.display="inline";
     }else {
       trup_1.style.display="none";
       trup_2.style.display="none";
       trcup_1.style.display="none";
       trcup_2.style.display="none";
     }
  </script>
</logic:equal>
<!--End daca ales ca mod de autentificare CD-ul-->
<!--Daca modul de autentificare este parola si user-->
 <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>">
   <html:hidden property="values.user_password"/>
   <html:hidden property="c_user_password" value="12345678"/>
 </logic:equal>
<!--End mod user/parola-->

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
        <input type="checkbox" id="bi_boo" onclick=" initChb('bi_boo','bi');"/>
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
        <input type="checkbox" id="stiri_boo" onclick=" initChb('stiri_boo','stiri');"/>
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
        <input type="checkbox" id="sig_port_boo" onclick=" initChb('sig_port_boo','sig_port');"/>
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
        <input type="checkbox" id="prot_med_boo" onclick=" initChb('prot_med_boo','prot_med');"/>
       <script type="text/javascript">
          if (document.getElementById("prot_med").value == "1") {
              document.getElementById("prot_med_boo").checked = true;
          }
        </script>
         <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.prot_med"/>" />
       </td>
      </tr>
  <!-- START Sectiune de BUTOANE. -->
  <tr>
  <td colspan="2" class="button-row" align="center">
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.next"/>' onclick=' send("nextEdit");'/>
  </td>
 </tr>
  <!-- END Sectiune de BUTOANE. -->
 </html:form>
 <!-- END Sectiune de FORM. -->
</table>
</div>