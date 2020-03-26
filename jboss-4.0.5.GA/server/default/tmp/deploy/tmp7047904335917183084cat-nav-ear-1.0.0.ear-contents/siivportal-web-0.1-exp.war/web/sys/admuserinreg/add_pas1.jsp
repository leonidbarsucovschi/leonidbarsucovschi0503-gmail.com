<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.waf.web.action.JPortalActionContext,
                 java.math.BigDecimal"%>
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
function pass() {
       var pw = document.getElementById('pw');
       var cpw = document.getElementById('cpw');
       var rvo = document.getElementById('rv0');
       if (rvo.checked) {
          showLayer("pss")
       }else {
           pw.value = null;
           cpw.value = null;
           hideLayer("pss");
       }
 }
 function send(method) {
    var el = document.getElementById('fdata');
    var m = document.getElementById('m');
    if  (method=="next") {
     m.value="next";
     el.submit();
    }
 }
 function showTr(){
    var pw = document.getElementById('pw');
    var cpw = document.getElementById('cpw');
    var cd_boo_0 = document.getElementById('cd_boo_0');
    var cd_boo_1 = document.getElementById('cd_boo_1');
    var field = document.getElementById('cd');
    if(cd_boo_0.checked) {
      document.getElementById("div_pw_1").style.display="inline";
      document.getElementById("div_pw_2").style.display="inline";
      document.getElementById("div_cpw_1").style.display="inline";
      document.getElementById("div_cpw_2").style.display="inline";
      field.value="0";
    }
     if (cd_boo_1.checked) {
      document.getElementById("div_pw_1").style.display="none";
      document.getElementById("div_pw_2").style.display="none";
      document.getElementById("div_cpw_1").style.display="none";
      document.getElementById("div_cpw_2").style.display="none";
      pw.value = "";
      cpw.value = "";
      field.value="1";
    }
}
</script>
<div class="table">

<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr class="page-subtitle">
  <td width="100%" valign="top" align="left">&nbsp;
    <!-- Titlu pas 1. -->
	  <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_utilizator_p"/>
	<!-- END Sectiune de Titlu pagina. -->
  </td>
  <td class="bottom" align="right">
    <img border="0" style="cursor:pointer" onClick="closeWindow();" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' src="<bean:message bundle="mesajsite" key="mesaj_site.button.closeWindow.path"/>" />
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

    <!-- Cimpul 'method' field. -->
    <html:hidden property="method" styleId="m" />
    <!--Camp nr pas-->
    <html:hidden property="pas" value="1"/>
    <!--celelalte campuri din forma care nu sunt aici completate-->
    <html:hidden property="values.id_user_inreg"/>

    <!--pas 3-->
    <html:hidden property="values.is_oaf"/>
    <html:hidden property="values.obs_oaf"/>
    <html:hidden property="values.is_cat_com"/>
    <html:hidden property="values.obs_cat_com"/>
    <html:hidden property="values.is_cat_naval"/>
    <html:hidden property="values.obs_cat_naval"/>
    <html:hidden property="values.is_nom"/>
    <html:hidden property="values.obs_nom"/>
    <html:hidden property="values.bi"/>
    <html:hidden property="values.stiri"/>
    <html:hidden property="values.anunturi_opa"/>
    <html:hidden property="values.sig_port"/>
    <html:hidden property="values.prot_med"/>
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
   <html:text styleClass="field_input" property="values.email_user" maxlength="100" />
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.email_user"/>" />
  </td>
 </tr>
 <!-- Cimpul 'user_login' field. -->
 <tr>
  <td valign="top" class="label" align="right">
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_login"/> *:
  </td>
  <td class="text" align="left">
   <html:text styleClass="field_input" property="values.user_login" maxlength="25"  styleId="ul"/>
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_login"/>" />
  </td>
 </tr>
 <!-- Cimpul 'cd' field. -->
 <html:hidden property="values.cd" styleId="cd"/>
 <tr>
  <td valign="top" class="label" align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.mod_autentificare"/> *:
  </td>
  <td class="text" align="left">
   <input type="radio"  name="cd_boo" id="cd_boo_1" value="1" onClick=" showTr('1');"/>
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.cd"/>
   <br>
   <input type="radio" name="cd_boo" id="cd_boo_0" value="0" onClick=" showTr('0');"/>
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
     <logic:equal value="<%=String.valueOf(0)%>" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>">
       <div  style="display: inline" id="div_pw_1">
     </logic:equal>
     <logic:equal value="<%=String.valueOf(1)%>" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>">
       <div style="display: none" id="div_pw_1" >
     </logic:equal>
          <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/> *:
       </div>
  </td>
  <td class="text" align="left">
    <logic:equal value="<%=String.valueOf(0)%>" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>">
       <div  style="display: inline" id="div_pw_2">
     </logic:equal>
     <logic:equal value="<%=String.valueOf(1)%>" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>">
       <div style="display: none" id="div_pw_2">
     </logic:equal>
          <html:password styleClass="field_input" property="values.user_password" size="30" styleId="pw"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_password"/>" />
       </div>
  </td>
 </tr>
 <!-- Cimpul 'c_user_password' confirmare field. -->
 <tr>
  <td valign="top" class="label" align="right">
    <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>">
      <div style="display: inline" id="div_cpw_1">
    </logic:equal>
    <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>">
      <div style="display: none" id="div_cpw_1">
    </logic:equal>
         <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/> *:
      </div>
  </td>
  <td class="text" align="left">
    <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>">
      <div style="display: inline" id="div_cpw_2">
    </logic:equal>
    <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>">
      <div style="display: none" id="div_cpw_2">
    </logic:equal>
       <html:password styleClass="field_input" property="c_user_password" size="30" styleId="cpw"/>
       <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
      </div>
  </td>
 </tr>
  <tr>
    <td colspan="2" class="info-text" align="left">
     <bean:message bundle="app" key="grad_clasificare.label.fieldInfo"/>
    </td>
  </tr>

  <!-- START Sectiune de BUTOANE. -->
  <tr>
  <td colspan="2" class="button-row" align="center">
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.next"/>' onClick=' send("next");'/>
  </td>
 </tr>
  <!-- END Sectiune de BUTOANE. -->
 </html:form>
 <!-- END Sectiune de FORM. -->
</table>
</div>