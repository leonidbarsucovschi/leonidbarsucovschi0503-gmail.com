<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmUserInregConstants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<style type="text/css">
<!--
img {
	border: 0px none #000000;
}
-->
</style>

<form name="closeForm" method="post" action="sys/admuser.do">
  <html:hidden property="method" value="list"/>
</form>
<script language="Javascript">
   var popupldap;
   function showMapLDAP() {
     popupldap = window.open("/siiv/sys/admuser.do?method=showListLDAP","w1list","height=400,width=600,status=no,toolbar=no,menubar=no,location=no,scrollbars=yes");
   }
   function setLDAP(issuer_name,serial_number) {
        document.getElementById("issuer_name").value=issuer_name;
        document.getElementById("issuer_name_t").value=issuer_name;
        document.getElementById("serial_number").value=serial_number;
        document.getElementById("serial_number_t").value=serial_number;
        if(popupldap) popupldap.close();
   }

   function chcd() {
      var el = document.getElementById('fdata');
      var m = document.getElementById('m');
      m.value="cd";
      el.submit();
   }
   function chcdm() {
      var el = document.getElementById('fdata');
      var m = document.getElementById('m');
      m.value="cdm";
      el.submit();
   }
   function send(method) {
      var el = document.getElementById('fdata');
      var m = document.getElementById('m');
      if  (method=="add") {
        m.value="add";
        el.submit();
      }
      if  (method=="update") {
        m.value="update";
        el.submit();
      }
      if  (method=="cautLDAP") {
        m.value="cautLDAP";
        el.submit();
      }
      if  (method=="cautLDAPm") {
        m.value="cautLDAPm";
        el.submit();
      }
   }

  function closeWindow() {
    document.closeForm.submit();
  }
  function togglePass() {
  	document.getElementById('newpass').disabled = !(document.getElementById('chpass').checked);
  }
</script>

<div class="table">
<table width="100%" border="0" cellpadding="2" cellspacing="0"><tr
    class="page-title-header"><td width="100%" valign="top" align="left">
  <!-- Titlul ferestrei pentru modificare. -->
  <logic:empty name="<%=Constants.ADM_USER_KEY%>"
               property="values.primaryKey" scope="request">
    <bean:message bundle="admuser" key="adm_user.title.add"/>
  </logic:empty>
  <!-- Titlul ferestrei pentru adaugare. -->
  <logic:notEmpty name="<%=Constants.ADM_USER_KEY%>"
                  property="values.primaryKey" scope="request">
    <bean:message bundle="admuser" key="adm_user.title.save"/>
  </logic:notEmpty>
  <!-- END Sectiune de Titlu pagina. -->
</td>
  <td class="bottom" align="right">
    <img border="0" style="cursor:pointer" onclick="closeWindow();"
         title='<bean:message bundle="admuser" key="adm_user.label.closeWindow"/>'
         src="images/close_off.gif"/>
  </td>
</tr></table>
<table width="100%">
   <logic:messagesPresent><tr>
  <td valign="top" colspan="2" class="msg_error" align="center"><ul>
    <html:messages id="error"><li><bean:write name="error"/></li>
    </html:messages></ul></td>
</tr></logic:messagesPresent>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="1"  class="report">
<tr>
  <td colspan="2" class="text-label"><bean:message bundle="admuser" key="adm_user.subtitle.add"/></td>
</tr>

<!-- START Sectiune de FORM. -->
<html:form action="/admuser.do" onsubmit="return validateForm_AdmUserForm(this);" enctype="multipart/form-data;" styleId="fdata">
<html:hidden property="values.id_user"/>

<!--Label pentru user parola si rescriere parola-->
<input type="hidden" name="label_password" value=' <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/>'/>
<input type="hidden" name="label_c_password" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/>'/>

<!-- Cimpul 'user_login' field. -->
<input type="hidden" name="rolesArray" />
<tr>
  <td valign="top"  align="right"><bean:message bundle="admuser"  key="adm_user.prompt.user_login"/>
    <font color="#336600">*</font> :
  </td>
  <td class="text" align="left">
    <html:text errorStyleClass="errorfield" styleClass="field_input" property="values.user_login" />
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.user_login"/>"/>
  </td>
</tr>
<!-- Cimpul 'email' field. -->
<tr>
  <td valign="top"  align="right" width="40%"><bean:message bundle="admuser" key="adm_user.prompt.email"/>
    <font color="#336600">*</font> :
  </td>
  <td class="text" align="left"  width="60%">
    <html:text errorStyleClass="errorfield" styleClass="field_input"  property="values.email" />
    <img src="images/quest.gif" width="15" height="15"  style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.email"/>"/>
  </td>
</tr>
<logic:empty name="<%=Constants.ADM_USER_KEY%>" property="values.primaryKey" scope="request">
     <!-- Cimpul 'mod de autentificare dorit' CD field. -->
<tr>
  <td valign="top" class="textbold" align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.mod_autentificare"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left">
   <input type="hidden" name="cd_label" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.mod_autentificare"/>'/>
   <html:radio property="cd" value="1" onclick=" chcd();" ><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.cd"/></html:radio>
   <br>
   <html:radio property="cd" value="0"  onclick=" chcd();" ><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.up"/></html:radio>
  </td>
</tr>
<logic:notEmpty property="cd" name="<%=Constants.ADM_USER_KEY%>">
    <logic:equal value="0" property="cd" name="<%=Constants.ADM_USER_KEY%>">
        <!-- Cimpul 'user_passwd' field. -->
    <tr>
      <td valign="top"  align="right"><bean:message bundle="admuser" key="adm_user.prompt.user_passwd"/><font color="#336600">*</font> :
      </td>
      <td class="text" align="left">
        <html:password errorStyleClass="errorfield" styleClass="field_input" property="values.user_passwd" />
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.user_passwd"/>"/>
      </td>
    </tr>
<!-- Cimpul 'c_user_password' confirmare field. -->
  <tr>
   <td valign="top" class="textbold" align="right"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/><font color="#336600">*</font> :
   </td>
   <td class="text" align="left">
    <html:password errorStyleClass="errorfield" styleClass="field_input" property="c_user_password"  styleId="cpw"/>
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



</logic:empty>

<logic:notEmpty name="<%=Constants.ADM_USER_KEY%>" property="values.primaryKey" scope="request">
<!--Campul utilizator activ-->
	<tr>
	  <td valign="top" class="textbold" align="right" width="40%"><bean:message bundle="admuser" key="adm_user.label.active_user"/>
	    <font color="#336600"></font> :
	  </td>
	  <td class="text" align="left"  width="60%">
	    <html:checkbox property="active"/>
	    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.active_user"/>"/>
	  </td>
	</tr>

<!-- Cimpul 'cd' field. -->
<tr>
  <td valign="top" class="textbold" align="right">
       <bean:message bundle="admuserext" key="adm_user_ext.prompt.mod_autentificare"/> :
  </td>
  <td class="text">
         <logic:empty property="values.user_passwd" name="<%=Constants.ADM_USER_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.cd"/></logic:empty>
         <logic:notEmpty property="values.user_passwd" name="<%=Constants.ADM_USER_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.up"/></logic:notEmpty>
  </td>
</tr>

<!--Utilizatorul are ca mod de logare  CD -->
<logic:empty  property="values.user_passwd" name="<%=Constants.ADM_USER_KEY%>">
 <!--campul 'issuer_name' -->
 <html:hidden property="values.issuer_name" styleId="issuer_name"/>
 <tr>
  <td align="right">
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.issuer_name"/>:
  </td>
  <td align="left" >
    <html:text errorStyleClass="errorfield" styleClass="field_input" property="values.issuer_name"  styleId="issuer_name_t" disabled="true"/>
  </td>
 </tr>
  <!--campul 'serial_number' -->
  <html:hidden property="values.serial_number" styleId="serial_number"/>
 <tr>
   <td align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.serial_number"/>:
   </td>
   <td align="left" >
     <html:text errorStyleClass="errorfield" styleClass="field_input" property="values.serial_number" styleId="serial_number_t" disabled="true"/>
   </td>
 </tr>

<!-- campul dupa care caut in ldap -->
 <tr>
  <td valign="top"  align="right" width="40%"><bean:message bundle="admuser" key="adm_user.prompt.numeldap"/>
  <font color="#336600">*</font> :
  </td>
  <td class="text" align="left"  width="60%">
    <html:text errorStyleClass="errorfield" styleClass="field_input"  property="numeSearchLdap"/>
    <img src="images/quest.gif" width="15" height="15"  style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.numeldap"/>"/>
     <!--Buton cauta in LDAP-->
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.cauta_ldap"/>'   onclick=' send("cautLDAPm");'/>
  </td>
</tr>


  <!--Rezultate cautare in LDAP-->

    <html:hidden property="amRezultateCautareLdap"/>

    <!--valoarea da =  am un singur resultat; nu = nu am resultate; dam = am resultate multiple-->
     <logic:equal value="nu" property="amRezultateCautareLdap" name="<%=Constants.ADM_USER_KEY%>" >
      <tr>
        <td colspan="3" class="msg_error" align="center" >
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
         <td class="msg_error" colspan="3" align="center" >
           <font color="red">
             <bean:message bundle="admuserinreg" key="adm_user_inreg.label.rezultate.ldap"/>:
             <img title='<bean:message bundle="admuserinreg" key="adm_user_inreg.label.rezultate.ldap"/>'  src="images/view_over.gif" style="cursor:pointer" onclick=' showMapLDAP();' />
           </font>
         </td>
       </tr>
       </logic:notEmpty>
      </logic:present>
     </logic:equal>

   <!--Schimbare mod de autentificare-->
    <tr>
        <td valign="top" class="textbold" align="right">
           <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.change_aut"/> :
        </td>
       <td class="text" align="left">
       <html:checkbox property="chaut" styleId="chaut" onclick=" chcdm();" />
      <!-- <input type="checkbox" id="chaut" name="chaut"/>-->
   </td>
</tr>
<logic:equal value="true" property="chaut" name="<%=Constants.ADM_USER_KEY%>">
    <!-- Cimpul 'user_password' field. -->
   <tr>
     <td valign="top" class="textbold" align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/><font color="#336600">*</font> :
     </td>
     <td class="text" align="left">
      <html:password errorStyleClass="errorfield" styleClass="field_input" property="user_password_n" />
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_password"/>" />
     </td>
  </tr>
 <!-- Cimpul 'c_user_password' confirmare field. -->
  <tr>
   <td valign="top" class="textbold" align="right"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/><font color="#336600">*</font> :
   </td>
   <td class="text" align="left">
    <html:password errorStyleClass="errorfield" styleClass="field_input" property="c_user_password" />
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
   </td>
  </tr>
</logic:equal>

</logic:empty>
<!--End utilizator are ca mod de logare CD-->


<!--Utilizator are ca mod de logare user/parola-->

<logic:notEmpty property="values.user_passwd" name="<%=Constants.ADM_USER_KEY%>">
<html:hidden property="values.user_passwd"/>
    <tr>
      <td valign="top" class="textbold" align="right">
       <bean:message bundle="admuser" key="adm_user.prompt.nochange"/> :
      </td>
      <td class="text" align="left">
      <!--// ch 1 pentur schimbare mod de autentificare si 0 pentru schimbare parola 2 nu schimb nimic-->
      <html:radio property="ch" value="2" onclick=" chcdm();"/>
      </td>
    </tr>
    <tr>
      <td valign="top" class="textbold" align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.change_password"/> :
      </td>
      <td class="text" align="left">
      <!--// ch 1 pentur schimbare mod de autentificare si 0 pentru schimbare parola-->
      <html:radio property="ch" value="0" onclick=" chcdm();" />
      <%--<html:checkbox property="chpass" styleId="chpass" onclick=" chcdm();"/>--%>
      <!-- <input type="checkbox" id="chpass" onclick="togglePass()" name="chpass" />-->
      </td>
    </tr>
<logic:equal value="0" property="ch" name="<%=Constants.ADM_USER_KEY%>">
      <!-- Cimpul 'user_passwd' field. -->
    <tr>
      <td valign="top" class="textbold" align="right">
           <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/> <font color="#336600">*</font> :
      </td>
      <td class="text" align="left">
       <input type="hidden" name="label_password" value=' <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/>'/>
       <html:password errorStyleClass="errorfield" styleClass="field_input" property="user_password_n"  styleId="newpass"/>
       <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_password"/>" />
      </td>
    </tr>
    <tr>
       <td valign="top" class="textbold" align="right"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/><font color="#336600">*</font> :
       </td>
       <td class="text" align="left">
        <html:password errorStyleClass="errorfield" styleClass="field_input" property="c_user_password"  styleId="cnewpass"/>
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
       </td>
    </tr>
</logic:equal>

    <!--Schimbare mod de autentificare-->
    <tr>
        <td valign="top" class="textbold" align="right">
           <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.change_aut"/> :
        </td>
       <td class="text" align="left">
       <!--// ch 1 pentur schimbare mod de autentificare si 0 pentru schimbare parola-->
      <html:radio property="ch" value="1" onclick=" chcdm();" />
       <%--<html:checkbox property="chaut" styleId="chaut" onclick=" chcdm();" />--%>
     </td>
    </tr>
<logic:equal value="1" property="ch" name="<%=Constants.ADM_USER_KEY%>" >
    <!-- campul dupa care caut in ldap -->
 <tr>
  <td valign="top"  align="right" width="40%"><bean:message bundle="admuser" key="adm_user.prompt.numeldap"/>
  <font color="#336600">*</font> :
  </td>
  <td class="text" align="left"  width="60%">
    <html:text errorStyleClass="errorfield" styleClass="field_input"  property="numeSearchLdap" />
    <img src="images/quest.gif" width="15" height="15"  style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.label.tooltip.numeldap"/>"/>
    <!--Buton cauta in LDAP-->
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.cauta_ldap"/>'   onclick=' send("cautLDAPm");'/>
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
         <td class="msg_error" colspan="2" align="center"  >
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
 <tr>
   <td align="right">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.serial_number"/>:
 </td>
 <td align="left" >
  <html:text errorStyleClass="errorfield" styleClass="field_input" property="values.serial_number"  styleId="serial_number_t" disabled="true"/>
 </td>
 </tr>
</logic:equal>


</logic:notEmpty>
<!-- END Utilizator are ca mod de logare user/parola-->

</logic:notEmpty>
<tr>
		  <td colspan="2" class="button-row" align="center">&nbsp;</td>
    </tr>
		<%--tr>
		  <td colspan="2" class="button-row" align="center">&nbsp;</td>
	    </tr--%>
		<%--tr>
		  <td colspan="2" class="button-row" align="center">
		  	<table width="100%">
		  		<tr>
		  			<td colspan="3" align="center"><bean:message bundle="admuser" key="adm_user.roles.title"/></td>
		  		</tr>
		  		<tr>
		  			<td width="33%"></td>
		  			<td width="34%" align="left"><span id="rls" align="left">err</span></td>
		  			<td width="33%"></td>
		  		</tr>
		  	</table>
		  </td>
	    </tr>
		<tr>

		<script type="text/javascript">

			var selRoles = new dTree('selRoles', null, false);
			selRoles.add(0, -1, '<bean:message bundle="admuser" key="adm_user.roles"/>', '', '<bean:message bundle="admuser" key="adm_user.roles"/>');

			<logic:iterate name="form_AdmUserForm" id="r" property="roles">
				selRoles.add(<bean:write name="r" property="id" />,<log ic:empty name="r" property="parentId">0</logic:empty><logic:notEmpty name="r" property="parentId"><bean:write name="r" property="parentId" /></logic:notEmpty>,'<bean:write name="r" property="roleVO.role_name" />','','<bean:write name="r" property="roleVO.role_name" />','_self', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif');
			</logic:iterate>

			selRoles.closeAll();
			document.getElementById('rls').innerHTML = selRoles;

		</script--%>

<!-- START Sectiune de BUTOANE. -->

<!-- Cimpul 'method' field. -->
<html:hidden property="method" styleId="m" />

<logic:empty name="<%=Constants.ADM_USER_KEY%>" property="values.primaryKey" scope="request">
<!-- Buton adugare. -->
  <tr>
    <td colspan="2" align="center">
      <input type="button" class="btn-generic" value='<bean:message bundle="admuser" key="adm_user.button.add"/>'   onclick=' send("add");'/>
    </td>
  </tr>
</logic:empty>
<logic:notEmpty name="<%=Constants.ADM_USER_KEY%>" property="values.primaryKey" scope="request">
<!-- buton modificare. -->
  <tr>
    <td colspan="2" align="center">
      <input type="button" class="btn-generic" value='<bean:message bundle="admuser" key="adm_user.button.save"/>'   onclick=' send("update");'/>
      <%--button name="addUpdateButton" style="btn-generic" onclick="submitUserForm()"><bean:message bundle="admuser" key="adm_user.button.save"/></button--%>
    </td>
  </tr>
</logic:notEmpty>
<!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_AdmUserForm"
                 dynamicJavascript="true"
                 staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>