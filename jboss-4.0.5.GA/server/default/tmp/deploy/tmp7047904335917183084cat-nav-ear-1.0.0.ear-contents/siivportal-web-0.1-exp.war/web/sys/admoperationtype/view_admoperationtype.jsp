<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.waf.common.Commands" %>
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
        <bean:message bundle="admoperationtype" key="adm_operation_type.title.view"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admoperationtype" key="adm_operation_type.label.closeWindow"/>' src="images/close_off.gif" />
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
    <!-- Cimpul 'opp_name' field. -->
    <!-- Cimpul 'opp_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.opp_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="opp_name" name="<%=Constants.ADM_OPERATION_TYPE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'description' field. -->
    <!-- Cimpul 'description' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.description"/>
        :
      </td>
      <td class="text">
        <bean:write  property="description" name="<%=Constants.ADM_OPERATION_TYPE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'fk_operation_type' field. -->
    <!-- Cimpul 'fk_operation_type' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.fk_operation_type"/>
        :
      </td>
      <td class="text">
        <bean:write  property="fk_operation_type" name="<%=Constants.ADM_OPERATION_TYPE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'opp_name' field. -->
    <!-- Cimpul 'opp_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.opp_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="opp_name" name="<%=Constants.ADM_OPERATION_TYPE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'description' field. -->
    <!-- Cimpul 'description' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.description"/>
        :
      </td>
      <td class="text">
        <bean:write  property="description" name="<%=Constants.ADM_OPERATION_TYPE_KEY%>"/>
      </td>
    </tr>
  </table>
</div>
<form name="closeForm" method="post" action="sys/admoperationtype.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
