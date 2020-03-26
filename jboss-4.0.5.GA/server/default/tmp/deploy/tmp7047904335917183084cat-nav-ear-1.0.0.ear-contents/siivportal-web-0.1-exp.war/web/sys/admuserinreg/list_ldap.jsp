<%@ page import="ro.uti.apmc.sys.util.AdmUserInregConstants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<script>
function alegeLDAP(issuer_name,serial_number) {
 if(window.opener) {
   window.opener.setLDAP(issuer_name,serial_number);
 }
}
</script>
<div class="table">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
  <tr>
   <td width="100%" valign="top" class="page-subtitle" align="left">
    <!-- Titlul ferestrei pentru vizualizare. -->
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.lista_ldap"/>
    <!-- END Sectiune de Titlu pagina. -->
   </td>
   <td class="bottom" align="right">
    <img border="0" style="cursor:pointer" onClick="closeWindow();" title='<bean:message bundle="nava" key="nava.label.closeWindow"/>'  src="images/close_off.gif" />
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
<logic:notEmpty name="<%= AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG %>" scope="request">
<table width="100%" class="report">
 <thead>
  <tr>
   <th><bean:message bundle="nava" key="nava.prompt.crt"/></th>
   <th><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.issuer_name"/></th>
   <th><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.serial_number"/></th>
   <th><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.subjectdn"/></th>
   <th></th>
  </tr>
 </thead>
 <tbody>
 <logic:iterate id="listItem" name='<%= AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG %>' indexId="idx">
  <% if ( (idx.intValue()%2) != 0 ) { %>
   <tr class="even">
  <%}else { %>
    <tr class="odd">
  <%}%>
      <td class="label"><%=idx.intValue()+1%></td>
      <td class="label"><bean:write name="listItem" property="isuer" /></td>
      <td class="label"><bean:write name="listItem" property="serial" /></td>
      <td class="label"><bean:write name="listItem" property="subjectDN" /></td>
      <td class="label">
         <script type="text/javascript">
          <!--alegeLDAP(issuer_name,serial_number)-->
          var isuer_<bean:write name="listItem" property="serial"/>='<bean:write name="listItem" property="isuer"/>';
          var serial_<bean:write name="listItem" property="serial"/>='<bean:write name="listItem" property="serial"/>';
         </script>
         <img title='<bean:message  bundle="admuserinreg" key="adm_user_inreg.label.selecteaza"/>'  src="images/checked.gif" style="cursor:pointer" onClick=' alegeLDAP(isuer_<bean:write name="listItem" property="serial"/>,serial_<bean:write name="listItem" property="serial"/>)' />
      </td>
    </tr>
 </logic:iterate>
 </tbody>
</table>
</logic:notEmpty>
</div>
<script>
function closeWindow(){
  if(window.opener) {
     window.opener.close();
  }
}
</script>