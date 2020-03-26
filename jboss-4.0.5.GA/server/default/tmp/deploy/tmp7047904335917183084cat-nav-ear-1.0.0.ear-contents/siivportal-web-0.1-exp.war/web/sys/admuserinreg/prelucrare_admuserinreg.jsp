<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Aug 25, 2005
  Time: 2:13:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*,ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmUserInregConstants,
                 ro.uti.waf.web.action.JPortalActionContext,
                 ro.uti.jpf.base.composite.util.CompositeConstants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="selectionComponent" prefix="selection" %>
<form name="closeForm"  method="post" action="sys/admuserinreg.do">
 <html:hidden property="method"  value="list"/>
</form>
<script>
 var popup;
 var popupldap;

 function showMap() {
   popup = window.open("/siiv/sys/admuserinreg.do?method=showListFirme","wlist","height=400,width=500,status=no,toolbar=no,menubar=no,location=no,scrollbars=yes");
 }
 function showMapLDAP() {
  popupldap = window.open("/siiv/sys/admuserinreg.do?method=showListLDAP","w1list","height=400,width=500,status=no,toolbar=no,menubar=no,location=no,scrollbars=yes");
 }
 function setFirma(id_firma,den_firma,adresa_principala,cui,telefon,fax,email,statut){
      document.getElementById("fk_firma").value=id_firma;
      document.getElementById("den_firma").value=den_firma;
      document.getElementById("den_firma_t").value=den_firma;
      document.getElementById("adresa_principala").value=adresa_principala;
      document.getElementById("adresa_principala_t").value=adresa_principala;
      document.getElementById("cui").value=cui;
      document.getElementById("cui_t").value=cui;
      document.getElementById("telefon").value=telefon;
      document.getElementById("telefon_t").value=telefon;
      document.getElementById("fax").value=fax;
      document.getElementById("fax_t").value=fax;
      document.getElementById("email").value=email;
      document.getElementById("email_t").value=email;
      document.getElementById("statut").value=statut;
      document.getElementById("statut_t").value=statut;
      if(popup) popup.close();
 }

 function setLDAP(issuer_name,serial_number) {
     document.getElementById("issuer_name").value=issuer_name;
     document.getElementById("issuer_name_t").value=issuer_name;
     document.getElementById("serial_number").value=serial_number;
     document.getElementById("serial_number_t").value=serial_number;
     if(popupldap) popupldap.close();
 }



    function closeWindow(){
        document.closeForm.submit();
    }

    function send(method) {
      var el = document.getElementById('fdata');
      var m = document.getElementById('m');
      if  (method=="save") {
        m.value="save";
        el.submit();
      }
      if  (method=="delete") {
        m.value="delete";
        el.submit();
      }
      if  (method=="cautFirma") {
        m.value="cautFirma";
        el.submit();
      }
      if  (method=="addFirma") {
        m.value="addFirma";
        el.submit();
      }
      if  (method=="cautLDAP") {
        m.value="cautLDAP";
        el.submit();
      }
      if  (method=="editFirma") {
        m.value="editFirma";
        el.submit();
      }
    }

</script>
<div class="table">

<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr class="page-title-header">
  <td width="100%" valign="top" align="left">&nbsp;
    <!-- Titlul ferestrei pentru adaugare. -->
	  <bean:message bundle="admuserinreg" key="adm_user_inreg.title.prelucrare"/>
	<!-- END Sectiune de Titlu pagina. -->
  </td>
  <td class="bottom" align="right">
    <img border="0"  style="cursor:pointer" onClick="closeWindow();" title='<bean:message bundle="admuserinreg" key="adm_user_inreg.label.closeWindow"/>' src="images/close_off.gif" />
  </td>
 </tr>
</table>
<table width="100%" >
  <logic:messagesPresent>
   <tr>
     <td valign="top" colspan="3" class="msg_error " align="center">
       <ul><html:messages id="error"><li><bean:write name="error"/></li></html:messages></ul>
     </td>
   </tr>
 </logic:messagesPresent>
 <logic:messagesPresent message="true">
   <tr>
    <td colspan="3" class="msg_success" align="center">
      <html:messages id="mesaje" bundle="app" message="true">
       <bean:write name="mesaje" ignore="true" />
      </html:messages>
    </td>
   <tr>
</logic:messagesPresent>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="1" class="label">

<!-- START Sectiune de FORM. -->
 <html:form action="/admuserinreg.do" onsubmit="return validateForm_AdmUserInregForm(this);" styleId="fdata">

<!-- Cimpul 'id_user_inreg' field. -->
 <html:hidden property="values.id_user_inreg"/>

 <!-- Cimpul 'stare' field. -->
 <html:hidden property="values.stare"/>

 <tr>
  <td class="text-label" colspan="3" >
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_utilizator"/>
  </td>
 </tr>
    <!-- Cimpul 'nume_user' field. -->
 <tr>
  <td valign="top" class="label" align="left">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.nume_user"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left" colspan="2" >
     <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.nume_user" size="30"/>
     <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.nume_user"/>" />
  </td>
 </tr>
    <!-- Cimpul 'prenume_user' field. -->
 <tr>
  <td valign="top" class="label" align="left">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prenume_user"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left" colspan="2" >
      <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.prenume_user" size="30"/>
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.prenume_user"/>" />
  </td>
 </tr>
    <!-- Cimpul 'email_user' field. -->
 <tr>
  <td valign="top" class="label" align="left">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.email_user"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left" colspan="2" >
   <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.email_user" size="30"/><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.email_user"/>" />
  </td>
 </tr>

  <!-- Cimpul 'data_cerere' field. -->
    <tr>
      <td valign="top" class="label" align="left">
        <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.data_cerere"/>:
      </td>
      <td class="text" align="left"  colspan="2">
        <bean:write  property="values.data_cerereString" name="<%=Constants.ADM_USER_INREG_KEY%>"/>
        <html:hidden property="values.data_cerere"/>
      </td>
    </tr>
    <!-- Cimpul 'cd' field. -->
 <html:hidden property="values.cd"/>
 <tr>
  <td valign="top" class="label" align="left">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.mod_autentificare"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left" colspan="2">
   <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.cd"/></logic:equal>
   <logic:equal value="0" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.up"/></logic:equal>
  </td>
</tr>
    <!-- Cimpul 'user_login' field. -->

 <tr>
  <td valign="top" class="label" align="left"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_login"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left" colspan="2" >
       <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.user_login" size="25" styleId="ul"/><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_login"/>" />
  </td>
 </tr>

 <!-- Cimpul 'user_password' field. -->
   <html:hidden property="values.user_password"/>

 <!--cauta in LDAP-->

 <logic:equal value="1" property="values.cd" name="<%=Constants.ADM_USER_INREG_KEY%>">
 <!-- campul dupa care caut in ldap -->
 <tr>
  <td align="left" class="label">
     <bean:message bundle="admuser" key="adm_user.prompt.numeldap"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left" colspan="2" >
    <html:text errorStyleClass="errorfield" styleClass="field_input"  property="numeSearchLdap" styleId="numeSearchLdap"/>
    <img src="images/quest.gif" width="15" height="15"  style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.numeldap"/>"/>
    <!--Buton cauta in LDAP-->
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.cauta_ldap"/>'   onClick=' send("cautLDAP");'/>
  </td>
</tr>
<!--campul 'issuer_name' -->
<html:hidden property="values.issuer_name" styleId="issuer_name"/>
<tr>
 <td align="left" class="label">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.issuer_name"/>:
 </td>
 <td align="left" colspan="2">
   <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.issuer_name" size="50" styleId="issuer_name_t" disabled="true"/>
   <%--<bean:write  property="values.issuer_name" name="<%=Constants.ADM_USER_INREG_KEY%>"/>--%>
 </td>
</tr>
<!--campul 'serial_number' -->
<html:hidden property="values.serial_number" styleId="serial_number"/>
<tr>
 <td align="left" class="label">
  <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.serial_number"/>:
 </td>
 <td align="left" colspan="2"  >
   <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.serial_number" size="25" styleId="serial_number_t" disabled="true"/>
   <%--<bean:write  property="values.serial_number" name="<%=Constants.ADM_USER_INREG_KEY%>"/>--%>
 </td>
</tr>
 <!--Rezultate cautare in LDAP-->
<html:hidden property="amRezultateCautareLdap"/>

<!--valoarea da =  am un singur resultat; nu = nu am resultate; dam = am resultate multiple-->
 <logic:equal value="nu" property="amRezultateCautareLdap" name="<%=Constants.ADM_USER_INREG_KEY%>" >
  <tr>
    <td colspan="3" class="msg_error ">
    <font color="red">
      <bean:message bundle="admuserinreg" key="adm_user_inreg.label.nu_rezulate.ldap"/>
    </font>
    </td>
   </tr>
 </logic:equal>

 <logic:equal value="dam" property="amRezultateCautareLdap" name="<%=Constants.ADM_USER_INREG_KEY%>" >
  <logic:present  name="<%= AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG%>" scope="session">
   <logic:notEmpty name="<%= AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG%>" scope="session">
    <tr>
     <td class="msg_error " colspan="3" >
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

<tr><td colspan="3" class="info-text" align="left">*<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_obligatorii"/></td></tr>



 <tr>
  <td  class="label" align="left">
     <bean:message bundle="admuserinreg" key="adm_user_inreg.label.cuvant_cheie"/>:
     <html:text errorStyleClass="errorfield" styleClass="inputtext" property="cuvant_cheie" size="30"/><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.cuvant_cheie"/>" />
  </td>
  <td align="left" colspan="2" >
    <!--Cauta firma-->
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.cauta_firma"/>'   onClick=' send("cautFirma");'/>&nbsp;&nbsp;
    <!--Adauga firma-->
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.add_firma"/>'   onClick=' send("addFirma");'/>
    <!--Modific firma-->
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.edit_firma"/>'   onClick=' send("editFirma");'/>
  </td>
 </tr>
 <!--Rezultate cautare firma-->
 <html:hidden property="amRezultateCautareFirma"/>
 <!--valoarea da =  am un singur resultat; nu = nu am resultate; dam = am resultate multiple-->
 <logic:equal value="nu" property="amRezultateCautareFirma" name="<%=Constants.ADM_USER_INREG_KEY%>" >
    <tr>
    <td colspan="3" class="msg_error ">
     <font color="red" >
      <bean:message bundle="admuserinreg" key="adm_user_inreg.label.nu_rezulate"/>
    </font>
    </td>
   </tr>
 </logic:equal>
 <logic:equal value="dam" property="amRezultateCautareFirma" name="<%=Constants.ADM_USER_INREG_KEY%>" >
   <logic:present name="<%= AdmUserInregConstants.LIST_CAUT_FIRMA_ADMUSERINREG%>" scope="session">
    <logic:notEmpty name="<%= AdmUserInregConstants.LIST_CAUT_FIRMA_ADMUSERINREG%>" scope="session">
   <tr>
    <td colspan="3" class="msg_error ">
       <font color="red">
         <bean:message  bundle="admuserinreg" key="adm_user_inreg.label.rezultate"/>:
         <img title='<bean:message  bundle="admuserinreg" key="adm_user_inreg.label.rezultate"/>'  src="images/view_over.gif" style="cursor:pointer" onClick=' showMap();' />
       </font>
    </td>
   </tr>
  </logic:notEmpty>
 </logic:present>
 </logic:equal>
 <tr>
  <td colspan="3" class="text-label" align="left">
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_optiuni"/>
  </td>
 </tr>
 <tr>
  <td colspan="3" align="left">
    <!--Tabel cu optiuni -->
<table class="report" width="100%" border="0">
 <tr>
  <td class="label-title" colspan="2" ><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.aplicatii"/>:</td>
  <td class="label-title" colspan="2" ><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.informatii"/>:</td>
  <td class="label-title" colspan="2" ><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.anunturi"/>:</td>
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
 <%--  <html:checkbox errorStyleClass="errorfield" property="values.evenimente_boo" value="true" />
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.evenimente"/>" />
   --%>
  </td>
 </tr>
</table>
<!--END tabel cu optiuni -->
  </td>
 </tr>
    <!-- Cimpul 'fk_limba' field. -->
 <tr>
  <td valign="top" class="label" align="left"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.fk_limba"/> :
  </td>
  <td class="text" align="left" colspan="2" >
   <html:select property="values.fk_limba_stiri" styleClass="selectbox">
     <option value="<%= Constants.DEFAULT_LANGUAGE %>"><bean:message bundle="app" key="select.prompt"/></option>
     <html:options collection="<%= AdmUserInregConstants.LIST_NOM_LIMBA_ADMUSERINREG%>" property="id_limba" labelProperty="den_limba"/>
   </html:select>
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.fk_limba"/>" />
  </td>
</tr>
		<!-- START Sectiune de BUTOANE. -->
        <!-- Cimpul 'method' field. -->
        <html:hidden property="method" styleId="m" />
		<tr>
          <!-- buton modificare. -->
        <td colspan="3" align="center">
          <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.save"/>'   onClick=' send("save");'/>&nbsp;&nbsp;
          <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.delete"/>' onClick=' send("delete");'/>
        </td>
        </tr>
		<!-- END Sectiune de BUTOANE. -->
		</html:form>
		<!-- END Sectiune de FORM. -->
		</table>
		</div>
		<!-- Validare cimpuri forma. -->
		<html:javascript formName="form_AdmUserInregForm"
              dynamicJavascript="true"
               staticJavascript="false"/><script language="Javascript1.1" src="staticJavascript.jsp" ></script>