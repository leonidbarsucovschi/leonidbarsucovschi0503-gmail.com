<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmUserInregConstants" %>
<%@ page import="ro.uti.settings.util.ThreadSafeSDFs" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr>
      <td width="100%" valign="top"  class="page-subtitle" align="left">
        <!-- Sectiune de Titlu pagina. -->
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="admuserext" key="adm_user_ext.title.delete"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="top" class="bottom" align="right">
        <img border="0"   style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuserext" key="adm_user_ext.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <table width="100%">
    <logic:messagesPresent>
      <tr>
        <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error " align="center">
          <html:errors/>
        </td>
      </tr>
    </logic:messagesPresent>
  </table>
  <table width="100%" border="0" cellpadding="1" align="center" cellspacing="1">
  <!-- Sectiune de Afisare Erori. -->
  <tr>
    <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error" align="center"><html:errors/></td>
  </tr>
  <!-- END Sectiune de Afisare Erori. -->
 </table>
 <table width="100%" border="0" cellpadding="0" cellspacing="1">
  <tr class="even" >
       <td class="label" colspan="4">
         <b><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_utilizator"/></b>
       </td>
  </tr>
  <tr>
   <!--Campul user_login -->
   <td class="label" width="25%" align="right">
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_login"/> :
   </td>
   <td class="field_text" width="25%" align="left">
     <bean:write  property="user_login" name="<%=Constants.ADM_USER_EXT_KEY%>"/>
   </td>
  </tr>
  <tr>
   <!--Campul nume -->
   <td class="label" width="25%" align="right">
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.nume_user"/> :
   </td>
   <td class="field_text" width="25%" align="left">
     <bean:write  property="nume" name="<%=Constants.ADM_USER_EXT_KEY%>"/>
   </td>
   <!--Campul Data crearii-->
   <td class="label" width="25%" align="right">
     <bean:message bundle="admuserext" key="adm_user_ext.prompt.data_creare"/> :
   </td>
   <td class="field_text" width="25%" align="left">
     <logic:notEmpty property="account_creation_date" name="<%=Constants.ADM_USER_EXT_KEY%>" >
           <bean:define id="creareDate" property="account_creation_date" name="<%=Constants.ADM_USER_EXT_KEY%>" type="java.util.Date" />
           <%=ThreadSafeSDFs.getSdf().format(creareDate)%>
     </logic:notEmpty>
   </td>
  </tr>
  <tr>
   <!--Campul prenume -->
   <td class="label" width="25%" align="right">
     <bean:message bundle="admuserext" key="adm_user_ext.prompt.prenume"/> :
   </td>
   <td class="field_text" width="25%" align="left">
     <bean:write  property="prenume" name="<%=Constants.ADM_USER_EXT_KEY%>"/>
   </td>
   <!--Campul account_status-->
   <td class="label" width="25%" align="right">
     <bean:message bundle="admuserext" key="adm_user_ext.label.active_user"/> :
   </td>
   <td class="field_text" width="25%" align="left">
     <logic:equal value="0" name="<%=Constants.ADM_USER_EXT_KEY%>" property="account_status">
       <bean:message bundle="admuser" key="adm_user.account_status.active"/>
     </logic:equal>
     <logic:equal value="1" name="<%=Constants.ADM_USER_EXT_KEY%>" property="account_status">
       <bean:message bundle="admuser" key="adm_user.account_status.disabled"/>
     </logic:equal>
   </td>
  </tr>
  <tr>
   <!--Campul email -->
   <td class="label" width="25%" align="right">
     <bean:message bundle="admuser" key="adm_user.prompt.email"/> :
   </td>
   <td class="field_text" width="25%" align="left">
     <bean:write  property="email" name="<%=Constants.ADM_USER_EXT_KEY%>"/>
   </td>
   <!--Campul user_type-->
   <td class="label" width="25%" align="right">
     <bean:message bundle="admuser" key="adm_user.prompt.user_type"/> :
   </td>
   <td class="field_text" width="25%" align="left">
     <bean:message bundle="admuser" key="adm_user.user_type.external" />
   </td>
  </tr>
  <tr class="even" >
       <td class="label" colspan="4" ><b><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.anunturi"/></b></td>
  </tr>
  <tr>
    <!-- Cimpul 'bi' field. -->
    <td valign="top" class="label" align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.bi"/> :
   </td>
   <td class="text" align="left" valign="top">
        <logic:equal value="1" property="bi" name="<%=Constants.ADM_USER_EXT_KEY%>" >
          <input type="checkbox" checked="true" disabled="true"/>
       </logic:equal>
       <logic:equal value="0" property="bi" name="<%=Constants.ADM_USER_EXT_KEY%>" >
          <input type="checkbox" disabled="true"/>
       </logic:equal>
   </td>
   <!-- Cimpul 'stiri' field. -->
    <td valign="top" class="label" align="right">
         <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.stiri"/> :
   </td>
   <td class="text" align="left" valign="top">
        <logic:equal value="1" property="stiri" name="<%=Constants.ADM_USER_EXT_KEY%>" >
          <input type="checkbox" checked="true" disabled="true"/>
       </logic:equal>
       <logic:equal value="0" property="stiri" name="<%=Constants.ADM_USER_EXT_KEY%>" >
          <input type="checkbox" disabled="true"/>
       </logic:equal>
   </td>
  </tr>
  <tr>
   <!-- Cimpul 'sig_port' field. -->
    <td valign="top" class="label" align="right">
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.sig_port"/> :
   </td>
   <td class="text" align="left" valign="top">
        <logic:equal value="1" property="sig_port" name="<%=Constants.ADM_USER_EXT_KEY%>" >
          <input type="checkbox" checked="true" disabled="true"/>
       </logic:equal>
       <logic:equal value="0" property="sig_port" name="<%=Constants.ADM_USER_EXT_KEY%>" >
          <input type="checkbox" disabled="true"/>
       </logic:equal>
   </td>
  </tr>
  <tr>
   <!-- Cimpul 'prot_med' field. -->
    <td valign="top" class="label" align="right">
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prot_med"/> :
   </td>
   <td class="text" align="left" valign="top">
        <logic:equal value="1" property="prot_med" name="<%=Constants.ADM_USER_EXT_KEY%>" >
          <input type="checkbox" checked="true" disabled="true"/>
       </logic:equal>
       <logic:equal value="0" property="prot_med" name="<%=Constants.ADM_USER_EXT_KEY%>" >
          <input type="checkbox" disabled="true"/>
       </logic:equal>
   </td>
  </tr>
  <tr class="even" >
       <td class="label" colspan="4">
         <b><bean:message bundle="admuser" key="adm_user.roles.selected_roles" /></b>
       </td>
  </tr>
  <tr>
   <td colspan="4" valign="top">
      <!--Aici este arborele cu rolurile selectate-->
      <script type="text/javascript">
         var rolSel = new dTree('rolSel');
         rolSel.add(1,-1,'<bean:message bundle="admuserinreg" key="adm_user_inreg.menu.harta_rol"/>','javascript: nothing();');
         <logic:iterate id="elementLista" name="<%= AdmUserInregConstants.KEY_LIST_ROL_SEL_TREE_EXT%>">
            rolSel.add(<bean:write name="elementLista" property="IDAF"/>,<bean:write name="elementLista" property="PAF"/>,'<bean:write name="elementLista" property="ROLE_NAME"/>','javascript: nothing();','<bean:write name="elementLista" property="ROLE_DESCRIPTION"/>','', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif')
         </logic:iterate>
         document.write(rolSel);
         rolSel.closeAll();
      </script>
    <!--End arbore cu rolurile selectate-->
   </td>
  </tr>
  <html:form action="/admuserext.do"  >
      <input type="hidden" name="values.id_user_ext" value="<bean:write property="id_user_ext" name="<%=Constants.ADM_USER_EXT_KEY%>"/>">
      <input type="hidden" name="values.fk_user" value="<bean:write property="fk_user" name="<%=Constants.ADM_USER_EXT_KEY%>"/>">
      <!-- START Sectiune de BUTOANE. -->
      <!-- buton modificare. -->
      <tr>
        <td colspan="4" class="button-row" align="center">
          <html:submit styleClass="button">
            <bean:message bundle="admuserext" key="adm_user_ext.button.delete"/>
          </html:submit>
          <html:hidden property="method"  value="delete"/>
        </td>
      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
 </table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="sys/admuserext.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
