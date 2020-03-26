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
        <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.title.delete"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="top" class="bottom" align="right">
        <img border="0"   style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admparametriiconfig" key="adm_parametrii_config.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
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
    <!-- Cimpul 'denumire' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.prompt.denumire"/>
        :
      </td>
      <td class="text">
        <bean:write  property="denumire" name="<%=Constants.ADM_PARAMETRII_CONFIG_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'val_implicita' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.prompt.val_implicita"/>
        :
      </td>
      <td class="text">
        <bean:write  property="val_implicita" name="<%=Constants.ADM_PARAMETRII_CONFIG_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'val_curenta' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.prompt.val_curenta"/>
        :
      </td>
      <td class="text">
        <bean:write  property="val_curenta" name="<%=Constants.ADM_PARAMETRII_CONFIG_KEY%>"/>
      </td>
    </tr>
    <html:form action="/admparametriiconfig.do"  >
      <input type="hidden" name="values.id_parametrii_config" value="<bean:write property="id_parametrii_config" name="<%=Constants.ADM_PARAMETRII_CONFIG_KEY%>"/>">
      <!-- START Sectiune de BUTOANE. -->
      <!-- buton modificare. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.button.delete"/>
          </html:submit>
          <html:hidden property="method"  value="delete"/>
        </td>
      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
  </table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="sys/admparametriiconfig.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
