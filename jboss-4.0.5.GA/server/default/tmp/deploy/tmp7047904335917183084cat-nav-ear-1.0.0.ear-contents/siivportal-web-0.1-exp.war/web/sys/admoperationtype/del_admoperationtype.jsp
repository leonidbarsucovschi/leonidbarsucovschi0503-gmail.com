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
        <bean:message bundle="admoperationtype" key="adm_operation_type.title.delete"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="top" class="bottom" align="right">
        <img border="0"   style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admoperationtype" key="adm_operation_type.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
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
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.description"/>
        :
      </td>
      <td class="text">
        <bean:write  property="description" name="<%=Constants.ADM_OPERATION_TYPE_KEY%>"/>
      </td>
    </tr>
    <html:form action="/admoperationtype.do"  >
      <input type="hidden" name="values.id_operation_type" value="<bean:write property="id_operation_type" name="<%=Constants.ADM_OPERATION_TYPE_KEY%>"/>">
      <!-- START Sectiune de BUTOANE. -->
      <!-- buton modificare. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="admoperationtype" key="adm_operation_type.button.delete"/>
          </html:submit>
          <html:hidden property="method"  value="delete"/>
        </td>
      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
  </table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="sys/admoperationtype.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
