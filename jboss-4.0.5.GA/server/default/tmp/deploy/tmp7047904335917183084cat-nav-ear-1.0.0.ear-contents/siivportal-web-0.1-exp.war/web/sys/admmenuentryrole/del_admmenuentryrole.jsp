<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1"><tr class="page-title-header">  <td WIDTH="100%" valign="top" align="left">
        <!-- Sectiune de Titlu pagina. -->
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry_role.title.delete"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="top" class="bottom" align="right">
        <img border="0"   style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admmenuentryrole" key="adm_menu_entry_role.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <!-- Sectiune de Afisare Erori. -->
  <table width="100%" border="0" cellpadding="1" align="center" class="news-table-content" cellspacing="1">
    <logic:messagesPresent>
      <tr>
        <td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center">
          <html:errors/>
        </td>
      </tr>
    </logic:messagesPresent>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- START Sectiune de FORM. -->
    <!-- Cimpul 'tbl_id_appl_menu_entry' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry.prompt.tbl_id_appl_menu_entry"/>
        :
      </td>
      <td class="text">
        <bean:write  property="tbl_id_appl_menu_entry" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'tbl_id_menu_entry' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry.prompt.tbl_id_menu_entry"/>
        :
      </td>
      <td class="text">
        <bean:write  property="tbl_id_menu_entry" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'id_limba' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry.prompt.id_limba"/>
        :
      </td>
      <td class="text">
        <bean:write  property="id_limba" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_key' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry.prompt.menu_key"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_key" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_url' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry.prompt.menu_url"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_url" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry.prompt.menu_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_name" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_type' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry.prompt.menu_type"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_type" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_state' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry.prompt.menu_state"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_state" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_order' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry.prompt.menu_order"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_order" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_description' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry.prompt.menu_description"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_description" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_icon' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_menu_entry.prompt.menu_icon"/>
        :
      </td>
      <td class="text">
        <bean:write property="menu_iconFile" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_role.prompt.role_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_name" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_description' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_role.prompt.role_description"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_description" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_type' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_role.prompt.role_type"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_type" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_code' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentryrole" key="adm_role.prompt.role_code"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_code" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>
      </td>
    </tr>
    <html:form action="/admmenuentryrole.do"  >
      <input type="hidden" name="values.id_menu_entry_role" value="<bean:write property="id_menu_entry_role" name="<%=Constants.ADM_MENU_ENTRY_ROLE_KEY%>"/>">
      <!-- START Sectiune de BUTOANE. -->
      <!-- buton modificare. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="admmenuentryrole" key="adm_menu_entry_role.button.delete"/>
          </html:submit>
          <html:hidden property="method"  value="delete"/>
        </td>
      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
  </table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="sys/admmenuentryrole.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
