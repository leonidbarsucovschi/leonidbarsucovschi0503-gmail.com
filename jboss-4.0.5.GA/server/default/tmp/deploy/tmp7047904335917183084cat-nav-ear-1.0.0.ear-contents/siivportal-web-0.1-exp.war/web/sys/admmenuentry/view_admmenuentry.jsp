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
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr class="page-title-header">
      <td width="100%" valign="top" class="bottom" align="left">
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="admmenuentry" key="adm_menu_entry.title.view"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <table width="100%" border="0" cellpadding="1" align="center" class="report" cellspacing="1">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error " align="center">
        <html:errors/>
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- Cimpul 'menu_key' field. -->
    <!-- Cimpul 'menu_key' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_key"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_key" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_url' field. -->
    <!-- Cimpul 'menu_url' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_url"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_url" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'link_menu_name' field. -->
    <!-- Cimpul 'link_menu_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.link_menu_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="link_menu_name" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_type' field. -->
    <!-- Cimpul 'menu_type' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_type"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_type" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_state' field. -->
    <!-- Cimpul 'menu_state' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_state"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_state" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_order' field. -->
    <!-- Cimpul 'menu_order' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_order"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_order" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_description' field. -->
    <!-- Cimpul 'menu_description' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_description"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_description" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_icon' field. -->
    <!-- Cimpul 'menu_icon' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_icon"/>
        :
      </td>
      <td class="text">
        <bean:write property="menu_iconFile" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'fk_menu_entry' field. -->
    <!-- Cimpul 'fk_menu_entry' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.fk_menu_entry"/>
        :
      </td>
      <td class="text">
        <bean:write  property="fk_menu_entry" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_key' field. -->
    <!-- Cimpul 'menu_key' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_key"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_key" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_url' field. -->
    <!-- Cimpul 'menu_url' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_url"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_url" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'link_menu_name' field. -->
    <!-- Cimpul 'link_menu_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.link_menu_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="link_menu_name" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_type' field. -->
    <!-- Cimpul 'menu_type' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_type"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_type" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_state' field. -->
    <!-- Cimpul 'menu_state' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_state"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_state" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_order' field. -->
    <!-- Cimpul 'menu_order' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_order"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_order" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_description' field. -->
    <!-- Cimpul 'menu_description' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_description"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_description" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_icon' field. -->
    <!-- Cimpul 'menu_icon' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_icon"/>
        :
      </td>
      <td class="text">
        <bean:write property="menu_iconFile" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
  </table>
</div>
<form name="closeForm" method="post" action="sys/admmenuentry.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
