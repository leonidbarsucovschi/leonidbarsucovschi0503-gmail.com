
<%@ page import="java.util.*,ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmUserInregConstants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
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
       //sunt la adaugare
       if (pw!=null) {
         if (rvo.checked) {
           pw.disabled = false;
           cpw.disabled = false;
         }else {
           pw.disabled = true;
           cpw.disabled = true;
           pw.value = "";
           cpw.value = "";
         }
       }
    }
</script>
<div class="table">

<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr class="page-title-header">
  <td width="100%" valign="top" align="left">&nbsp;
    <!-- Titlul ferestrei pentru adaugare. -->
	  <bean:message bundle="admuserinreg" key="adm_user_inreg.title.add"/>
	<!-- END Sectiune de Titlu pagina. -->
  </td>
  <td class="bottom" align="right">
    <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' src="<bean:message bundle="mesajsite" key="mesaj_site.button.closeWindow.path"/>" />
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
<table width="100%" border="0" cellpadding="0" cellspacing="1"  class="report">
<!-- START Sectiune de FORM. -->
 <html:form action="/admuserinreg.do" onsubmit="return validateForm_AdmUserInregForm(this);">
 <html:hidden property="values.id_user_inreg"/>
 <tr>
  <td class="text-label" colspan="2" >
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_utilizator"/>
  </td>
 </tr>
    <!-- Cimpul 'nume_user' field. -->
 <tr>
  <td valign="top" class="label" align="left" width="40%" >
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.nume_user"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left" width="60%" >
     <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.nume_user" size="30"/>
     <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.nume_user"/>" />
  </td>
 </tr>
    <!-- Cimpul 'prenume_user' field. -->
 <tr>
  <td valign="top" class="label" align="left">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prenume_user"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left">

      <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.prenume_user" size="30"/>
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.prenume_user"/>" />


  </td>
 </tr>
    <!-- Cimpul 'email_user' field. -->
 <tr>
  <td valign="top" class="label" align="left">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.email_user"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left">
   <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.email_user" size="30"/><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.email_user"/>" />
  </td>
 </tr>
    <!-- Cimpul 'cd' field. -->
 <tr>
  <td valign="top" class="label" align="left">
   <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.mod_autentificare"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left">
   <html:radio property="values.cd" value="1" onclick="javascript: pass()"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.cd"/></html:radio>
   <br>
   <html:radio property="values.cd" value="0" onclick="javascript: pass()" styleId="rv0" ><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.up"/></html:radio>
  </td>
</tr>
    <!-- Cimpul 'user_login' field. -->
 <tr>
  <td valign="top" class="label" align="left"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_login"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left">
   <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.user_login" size="30" styleId="ul"/><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_login"/>" />
  </td>
 </tr>

 <!-- Cimpul 'user_password' field. -->
  <input type="hidden" name="label_password" value=' <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/>'/>
  <input type="hidden" name="label_c_password" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/>'/>

   <tr>
     <td valign="top" class="label" align="left">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_password"/> :
     </td>
     <td class="text" align="left">
      <html:password errorStyleClass="errorfield" styleClass="inputtext" property="values.user_password" size="30" styleId="pw"/>
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.user_password"/>" />
     </td>
  </tr>

 <!-- Cimpul 'c_user_password' confirmare field. -->
  <tr>
   <td valign="top" class="label" align="left"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.c_user_password"/> :
   </td>
   <td class="text" align="left">
    <html:password errorStyleClass="errorfield" styleClass="inputtext" property="c_user_password" size="30" styleId="cpw"/>
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.c_user_password"/>" />
   </td>
  </tr>



 <tr><td colspan="2" class="info-text" align="left"><bean:message bundle="app" key="grad_clasificare.label.fieldInfo"/></td></tr>
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
   <%--<html:checkbox errorStyleClass="errorfield" property="values.evenimente_boo" value="true" />
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.evenimente"/>" />
   --%>
  </td>
 </tr>
</table>
<!--END tabel cu optiuni -->
  </td>
 </tr>
    <!-- Cimpul 'fk_limba_stiri' field. -->
 <tr>
  <td valign="top" class="label" align="left">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.fk_limba"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left">
   <html:select property="values.fk_limba_stiri" styleClass="selectbox">
     <option value=""><bean:message bundle="app" key="select.prompt"/></option>
     <html:options collection="<%= AdmUserInregConstants.LIST_NOM_LIMBA_ADMUSERINREG%>" property="id_limba" labelProperty="den_limba"/>
   </html:select>
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.fk_limba"/>" />
  </td>
</tr>
<tr>
    <td colspan="2">&nbsp;</td>
</tr>
		<!-- START Sectiune de BUTOANE. -->
		<!-- Buton adugare. -->
 <tr>
  <td colspan="2" class="button-row" align="center"><html:submit styleClass="btn-generic"><bean:message bundle="admuserinreg" key="adm_user_inreg.button.add"/></html:submit><html:hidden property="method"  value="add"/></td>
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