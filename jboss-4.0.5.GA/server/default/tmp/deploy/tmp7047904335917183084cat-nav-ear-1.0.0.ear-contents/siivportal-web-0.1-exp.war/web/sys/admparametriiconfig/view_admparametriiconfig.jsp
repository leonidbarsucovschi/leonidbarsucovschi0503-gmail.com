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
        <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.title.view"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admparametriiconfig" key="adm_parametrii_config.label.closeWindow"/>' src="images/close_off.gif" />
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
    <!-- Cimpul 'denumire' field. -->
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
  </table>
</div>
<form name="closeForm" method="post" action="sys/admparametriiconfig.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
