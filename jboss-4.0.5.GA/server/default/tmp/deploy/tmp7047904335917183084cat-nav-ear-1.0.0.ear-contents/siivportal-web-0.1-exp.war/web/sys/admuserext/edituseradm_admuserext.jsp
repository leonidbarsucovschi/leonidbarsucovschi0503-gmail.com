<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Sep 9, 2005
  Time: 3:54:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*,ro.uti.settings.util.Constants,ro.uti.apmc.sys.util.AdmUserInregConstants" %>
       <%@ page contentType="text/html; charset=iso-8859-2" %>
       <%@ page language="java" %>
       <%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
       <%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
       <%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
       <form name="closeForm" method="post" action="sys/admuserext.do">
          <html:hidden property="method"  value="list"/>
       </form>
<script>
  var popupldap;
  function showMapLDAP() {
    popupldap = window.open("/siiv/sys/admuserext.do?method=showListLDAP","w1list","height=400,width=500,status=no,toolbar=no,menubar=no,location=no,scrollbars=yes");
  }
  function setLDAP(issuer_name,serial_number) {
     document.getElementById("issuer_name").value=issuer_name;
     document.getElementById("issuer_name_t").value=issuer_name;
     document.getElementById("serial_number").value=serial_number;
     document.getElementById("serial_number_t").value=serial_number;
     if(popupldap) popupldap.close();
 }
  function closeWindow() {
    document.closeForm.submit();
  }
  function send(method) {
      var el = document.getElementById('fdata');
      var m = document.getElementById('m');
      if  (method=="cautLDAP") {
        m.value="cautLDAP";
        el.submit();
      }
      if  (method=="updateEditUserAdm") {
        m.value="updateEditUserAdm";
        el.submit();
      }
    }
</script>
       <div class="table">
         <table width="100%" border="0" cellpadding="0" cellspacing="1">
           <tr class="page-title-header">
             <td width="100%" valign="top" align="left">
               &nbsp;
               <!-- Titlul ferestrei pentru modificare. -->
                 <bean:message bundle="admuserext" key="adm_user_ext.title.save"/>
               <!-- END Sectiune de Titlu pagina. -->
             </td>
             <td class="bottom" align="right">
               <img border="0" style="cursor:pointer" onClick="closeWindow();" title='<bean:message bundle="admuserext" key="adm_user_ext.label.closeWindow"/>' src="images/close_off.gif" />
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
<table width="100%" border="0" cellpadding="0" cellspacing="1" class="report" >
           <!-- START Sectiune de FORM. -->
           <html:form action="/admuserext.do" onsubmit="return validateForm_AdmUserExtForm(this);" styleId="fdata">

       <!--Campul id_user_ext-->
      <html:hidden property="values.id_user_ext"/>

      <!--Cimpul 'fk_limba' field -->
      <html:hidden property="values.fk_limba"/>
      <!-- Cimpul 'fk_user' field. -->
      <html:hidden property="values.fk_user"/>
      <!--Campul cd -->
      <html:hidden property="values.cd"/>


      <!--Campul account_creration_date-->
      <html:hidden property="values.account_creation_dateString"/>
      <!--campul account_deletion_date-->
      <html:hidden property="values.account_deletion_dateString"/>

      <!--campul logged-->
      <html:hidden property="values.logged"/>

      <!--campul user_passwd-->
       <html:hidden property="values.user_passwd"/>
      <!--campul user_type-->
      <html:hidden property="values.user_type"/>
      <!--campul email-->
      <html:hidden property="values.email"/>

   <input type="hidden" name="label_password" value=' <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/>'/>
   <input type="hidden" name="label_c_password" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/>'/>

 <tr>
  <td class="text-label" colspan="2" >
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_utilizator"/>
  </td>
 </tr>
   <!--campul user_login-->
   <html:hidden property="values.user_login"/>
    <tr>
     <td valign="top" class="label" align="right" width="50%" >
       <bean:message bundle="admuserext" key="adm_user_ext.prompt.user_login"/>:
    </td>
    <td class="text" align="left" width="50%" >
     <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.user_login"/>
    </td>
  </tr>
  <!-- Cimpul 'nume' field. -->
     <html:hidden property="values.nume" styleId="nume" />
    <tr>
     <td valign="top" class="label" align="right" width="50%" >
       <bean:message bundle="admuserext" key="adm_user_ext.prompt.nume"/>:
    </td>
    <td class="text" align="left" width="50%" >
     <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.nume"/>
    </td>
  </tr>
   <!-- Cimpul 'prenume' field. -->
 <html:hidden property="values.prenume"/>
 <tr>
    <td valign="top" class="label" align="right">
      <bean:message bundle="admuserext" key="adm_user_ext.prompt.prenume"/> :
    </td>
    <td class="text" align="left">
      <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.prenume"/>
    </td>
</tr>
<!-- Cimpul 'email' field. -->
   <tr>
    <td valign="top" class="label" align="right">
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.email_user"/> :
    </td>
     <td class="text" align="left">
      <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.email"/>
    </td>
   </tr>
 <!--Campul account_status-->
<tr>
 <td valign="top" class="label" align="right">
   <bean:message bundle="admuserext" key="adm_user_ext.label.active_user"/> :
  </td>
  <td class="text" align="left">
   <html:checkbox errorStyleClass="errorfield" property="values.account_status_boo" value="true" />
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserext" key="adm_user_ext.label.tooltip.active_user"/>" />
  </td>
</tr>
<!-- Cimpul 'cd' field. -->
<tr>
  <td valign="top" class="label" align="right">
       <bean:message bundle="admuserext" key="adm_user_ext.prompt.mod_autentificare"/> :
  </td>
  <td class="text">
         <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.cd"/></logic:equal>
         <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_EXT_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.up"/></logic:equal>
  </td>
</tr>
<logic:equal value="1" name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.cd">
 <!--campul issuer_name-->
 <html:hidden property="values.issuer_name" styleId="issuer_name"/>
<tr>
 <td align="right" valign="top" class="label">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.issuer_name"/>:
 </td>
 <td  class="text" align="left">
   <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.issuer_name" size="50" styleId="issuer_name_t" disabled="true"/>
 </td>
</tr>
<!--campul 'serial_number' -->
<html:hidden property="values.serial_number" styleId="serial_number"/>
<tr>
 <td align="right" valign="top" class="label">
  <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.serial_number"/>:
 </td>
 <td  class="text" align="left">
  <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.serial_number" size="25" styleId="serial_number_t" disabled="true"/>
 </td>
</tr>
<!-- campul dupa care caut in ldap -->
 <tr>
  <td align="right"><bean:message bundle="admuser" key="adm_user.prompt.numeldap"/> :
  </td>
  <td class="text" align="left"  width="60%">
    <html:text errorStyleClass="errorfield" styleClass="field_input"  property="numeSearchLdap" styleId="numeSearchLdap"/>
    <img src="images/quest.gif" width="15" height="15"  style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.numeldap"/>"/>
    <!--Buton cauta in LDAP-->
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.cauta_ldap"/>'   onClick=' send("cautLDAP");'/>
  </td>
</tr>
<!--Rezultate cautare in LDAP-->
<html:hidden property="amRezultateCautareLdap"/>

<!--valoarea da =  am un singur resultat; nu = nu am resultate; dam = am resultate multiple-->
 <logic:equal value="nu" property="amRezultateCautareLdap" name="<%=Constants.ADM_USER_EXT_KEY%>" >
  <tr>
    <td colspan="2" class="msg_error " align="center" >
    <font color="red">
      <bean:message bundle="admuserinreg" key="adm_user_inreg.label.nu_rezulate.ldap"/>
    </font>
    </td>
   </tr>
 </logic:equal>

 <logic:equal value="dam" property="amRezultateCautareLdap" name="<%=Constants.ADM_USER_EXT_KEY%>" >
  <logic:present  name="<%= AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG%>" scope="session">
   <logic:notEmpty name="<%= AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG%>" scope="session">
    <tr>
     <td class="msg_error " colspan="2" align="center">
       <font color="red">
         <bean:message bundle="admuserinreg" key="adm_user_inreg.label.rezultate.ldap"/>:
         <img title='<bean:message bundle="admuserinreg" key="adm_user_inreg.label.rezultate.ldap"/>'  src="images/view_over.gif" style="cursor:pointer" onClick=' showMapLDAP();' />
       </font>
     </td>
   </tr>
   </logic:notEmpty>
  </logic:present>
 </logic:equal>
</logic:equal>
<!-- Schimba modul de autentificare -->
<tr>
 <td valign="top" class="label" align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.change_aut"/> :
   </td>
      <td class="text" align="left">
      <html:checkbox property="chaut" styleId="chaut"/>
   </td>
</tr>
  <!--Utilizatorul are ca mod de logare  CD -->
<logic:equal value="1" name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.cd">
  <!-- Cimpul 'user_password' field. -->
   <tr>
     <td valign="top" class="label" align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/> :
     </td>
     <td class="text" align="left">
      <html:password errorStyleClass="errorfield" styleClass="inputtext" property="user_password_n" size="30"/>
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_password"/>" />
     </td>
  </tr>
 <!-- Cimpul 'c_user_password' confirmare field. -->
  <tr>
   <td valign="top" class="label" align="right"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/> :
   </td>
   <td class="text" align="left">
    <html:password errorStyleClass="errorfield" styleClass="inputtext" property="c_user_password" size="30"/>
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
   </td>
  </tr>
</logic:equal>
<logic:equal value="0" name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.cd">
<!-- campul dupa care caut in ldap -->
 <tr>
  <td align="right"><bean:message bundle="admuser" key="adm_user.prompt.numeldap"/> :
  </td>
  <td class="text" align="left"  width="60%">
    <html:text errorStyleClass="errorfield" styleClass="field_input"  property="numeSearchLdap" styleId="numeSearchLdap"/>
    <img src="images/quest.gif" width="15" height="15"  style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.numeldap"/>"/>
    <!--Buton cauta in LDAP-->
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.cauta_ldap"/>'   onClick=' send("cautLDAP");'/>
  </td>
</tr>
   <!--campul issuer_name-->
  <html:hidden property="values.issuer_name" styleId="issuer_name"/>
<tr>
 <td align="right" valign="top" class="label">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.issuer_name"/>:
 </td>
 <td  class="text" align="left">
   <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.issuer_name" size="50" styleId="issuer_name_t" disabled="true"/>
 </td>
</tr>
<!--campul 'serial_number' -->
<html:hidden property="values.serial_number" styleId="serial_number"/>
<tr>
 <td align="right" valign="top" class="label">
  <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.serial_number"/>:
 </td>
 <td  class="text" align="left">
  <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.serial_number" size="25" styleId="serial_number_t" disabled="true"/>
 </td>
</tr>
<!--Rezultate cautare in LDAP-->
<html:hidden property="amRezultateCautareLdap"/>

<!--valoarea da =  am un singur resultat; nu = nu am resultate; dam = am resultate multiple-->
 <logic:equal value="nu" property="amRezultateCautareLdap" name="<%=Constants.ADM_USER_EXT_KEY%>" >
  <tr>
    <td colspan="2" class="msg_error " align="center" >
    <font color="red">
      <bean:message bundle="admuserinreg" key="adm_user_inreg.label.nu_rezulate.ldap"/>
    </font>
    </td>
   </tr>
 </logic:equal>

 <logic:equal value="dam" property="amRezultateCautareLdap" name="<%=Constants.ADM_USER_EXT_KEY%>" >
  <logic:present  name="<%= AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG%>" scope="session">
   <logic:notEmpty name="<%= AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG%>" scope="session">
    <tr>
     <td class="msg_error " colspan="2" align="center" >
       <font color="red">
         <bean:message bundle="admuserinreg" key="adm_user_inreg.label.rezultate.ldap"/>:
         <img title='<bean:message bundle="admuserinreg" key="adm_user_inreg.label.rezultate.ldap"/>'  src="images/view_over.gif" style="cursor:pointer" onClick=' showMapLDAP();' />
       </font>
     </td>
   </tr>
   </logic:notEmpty>
  </logic:present>
 </logic:equal>
</logic:equal>
<tr>
  <td colspan="2"class="text-label" align="left" colspan="2" >
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_optiuni"/>
  </td>
</tr>
<tr>
  <td colspan="2" align="left">
    <!--Tabel cu optiuni -->
<table class="report" width="100%" border="0">
 <tr>
  <td class="label-title" colspan="2" ><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.aplicatii"/>:</td>
  <td class="label-title" colspan="2" ><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.informatii"/>:</td>
  <td class="label-title" colspan="2" ><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.anunturi"/>:</td>
 </tr>
 <tr>
   <!-- Cimpul 'bi' buletin informativ field. -->
  <td valign="top" class="label" align="left" width="25%">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.bi"/> :
  </td>
  <td class="text" align="left" width="8%" valign="top">
   <html:checkbox errorStyleClass="errorfield" property="values.bi_boo" value="true" />
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.bi"/>" />
  </td>
   <!-- Cimpul 'stiri' field. -->
  <td valign="top" class="label" align="left" width="25%">
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.stiri"/> :
  </td>
  <td class="text" align="left" width="8%" valign="top">
    <html:checkbox errorStyleClass="errorfield" property="values.stiri_boo" value="true" />
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.stiri"/>" />
  </td>
 </tr>
 <tr>
 <!-- Cimpul 'adm' administrare date firma field. -->
  <td valign="top" class="label" align="left">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.adm"/> :
  </td>
  <td class="text" align="left" valign="top">
   <html:checkbox errorStyleClass="errorfield" property="values.adm_boo" value="true" />
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.adm"/>" />
  </td>
  <td>&nbsp;</td>
  <td>&nbsp;</td>
 </tr>
  <tr>
 <td valign="top">&nbsp;</td>
 <td valign="top">&nbsp;</td>
 <td valign="top">&nbsp;</td>
 <td valign="top">&nbsp;</td>
   <!-- Cimpul 'sig_port' field. -->
  <td valign="top" class="label" align="left"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.sig_port"/> :
  </td>
  <td class="text" align="left" valign="top">
   <html:checkbox errorStyleClass="errorfield" property="values.sig_port_boo" value="true" />
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.sig_port"/>" />
  </td>
 </tr>
 <tr>
 <td valign="top">&nbsp;</td>
 <td valign="top">&nbsp;</td>
 <td valign="top">&nbsp;</td>
 <td valign="top">&nbsp;</td>
 <!-- Cimpul 'prot_med' field. -->
  <td valign="top" class="label" align="left"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prot_med"/> :
  </td>
  <td class="text" align="left" valign="top">
   <html:checkbox errorStyleClass="errorfield" property="values.prot_med_boo" value="true" />
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.prot_med"/>" />
  </td>
 </tr>
 <tr>
 <td valign="top">&nbsp;</td>
 <td valign="top">&nbsp;</td>
 <td valign="top">&nbsp;</td>
 <td valign="top">&nbsp;</td>
    <!-- Cimpul 'evenimente' field. -->
  <td valign="top" class="label" align="left">
   <%--<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.evenimente"/> :--%>
  </td>
  <td class="text" align="left" valign="top">
  <%-- <html:checkbox errorStyleClass="errorfield" property="values.evenimente_boo" value="true" />
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.evenimente"/>" />
   --%>
  </td>
 </tr>
</table>
<!--END tabel cu optiuni -->
  </td>
 </tr>
       <!-- START Sectiune de BUTOANE. -->
        <!-- Cimpul 'method' field. -->
        <html:hidden property="method" styleId="m" />
       <!-- buton modificare. -->
       <tr>
         <td colspan="2" class="button-row" align="center">
           <input type="button" class="btn-generic" value='<bean:message bundle="admuserext" key="adm_user_ext.button.save"/>'   onClick=' send("updateEditUserAdm");'/>
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