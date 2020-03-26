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
    <tr>
      <td width="100%" valign="top" class="bottom" align="left">
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.title.view"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.label.closeWindow"/>' src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <table width="100%" border="0" cellpadding="1" align="center" class="lightrow" cellspacing="1">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center">
        <html:errors/>
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- Cimpul 'role_name' field. -->
    <!-- Cimpul 'role_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrolehierarchy" key="adm_role.prompt.role_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_name" name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_description' field. -->
    <!-- Cimpul 'role_description' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrolehierarchy" key="adm_role.prompt.role_description"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_description" name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_type' field. -->
    <!-- Cimpul 'role_type' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrolehierarchy" key="adm_role.prompt.role_type"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_type" name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_code' field. -->
    <!-- Cimpul 'role_code' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrolehierarchy" key="adm_role.prompt.role_code"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_code" name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_name' field. -->
    <!-- Cimpul 'role_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrolehierarchy" key="adm_role.prompt.role_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_name" name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_description' field. -->
    <!-- Cimpul 'role_description' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrolehierarchy" key="adm_role.prompt.role_description"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_description" name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_type' field. -->
    <!-- Cimpul 'role_type' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrolehierarchy" key="adm_role.prompt.role_type"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_type" name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_code' field. -->
    <!-- Cimpul 'role_code' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrolehierarchy" key="adm_role.prompt.role_code"/>
        :
      </td>
      <td class="text">
        <bean:write  property="role_code" name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>"/>
      </td>
    </tr>
  </table>
</div>
<form name="closeForm" method="post" action="sys/admrolehierarchy.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
