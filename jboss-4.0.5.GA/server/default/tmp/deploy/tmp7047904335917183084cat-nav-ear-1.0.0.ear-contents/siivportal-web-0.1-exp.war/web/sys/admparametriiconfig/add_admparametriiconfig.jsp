<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm" method="post" action="
sys/
admparametriiconfig.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
<div class="table">
  <table width="100%" border="0" cellpadding="2" cellspacing="0"><tr class="page-title-header">  <td width="100%" valign="top" align="left">
        &nbsp;
        <!-- Titlul ferestrei pentru modificare. -->
        <logic:notEmpty  name="<%=Constants.ADM_PARAMETRII_CONFIG_KEY%>" property="values.primaryKey" scope="request">
          <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.title.save"/>
        </logic:notEmpty>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admparametriiconfig" key="adm_parametrii_config.label.closeWindow"/>' src="images/close_off.gif" />
      </td>
    </tr>
  </table>
   <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <logic:messagesPresent>
      <tr>
        <td valign="top" colspan="2" class="errormsg" align="center">
          <ul>
            <html:messages id="error">
              <li>
                <bean:write name="error"/>
              </li>
            </html:messages>
          </ul>
        </td>
      </tr>
    </logic:messagesPresent>
     </table>
    <table width="100%" border="0" cellpadding="0" cellspacing="1" class="report_nofixed">
    <!-- START Sectiune de FORM. -->
    <html:form method="get"  action="/admparametriiconfig.do" onsubmit="return validateForm_AdmParametriiConfigForm(this);">
      <html:hidden property="values.id_parametrii_config"/>
      <!-- Cimpul 'denumire' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.prompt.denumire"/>
          <font color="#336600">
            *
          </font>
          :
        </td>
        <html:hidden property="values.denumire"/>
        <td class="text" align="left">
            <%--<html:hidden property="values.denumire"/>--%>
          <bean:write name="<%=Constants.ADM_PARAMETRII_CONFIG_KEY%>" property="values.denumire"/>
        </td>
      </tr>
      <!-- Cimpul 'val_implicita' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.prompt.val_implicita"/>
          <font color="#336600">
            *
          </font>
          :
        </td>
        <html:hidden property="values.val_implicita"/>
        <td class="text" align="left">
        <bean:write name="<%=Constants.ADM_PARAMETRII_CONFIG_KEY%>" property="values.val_implicita"/>
        </td>
      </tr>
      <!-- Cimpul 'val_curenta' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.prompt.val_curenta"/>
          :
        </td>
        <td class="text" align="left">
          <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.val_curenta" size="100"/>

          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admparametriiconfig" key="adm_parametrii_config.label.tooltip.val_curenta"/>" />
        </td>
      </tr>
        <input type="hidden" name="oldCurrentValue"/>
        <input type="hidden" name="procParam"/>
      <!-- START Sectiune de BUTOANE. -->
    <logic:notEmpty  name="<%=Constants.ADM_PARAMETRII_CONFIG_KEY%>" property="values.primaryKey" scope="request">
    <!-- buton modificare. -->
    <tr>
       <td colspan="2" class="button-row" align="center">
        <html:submit styleClass="btn-generic">
          <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.button.save"/>
        </html:submit>
        <html:hidden property="method"  value="update"/>
      </td>
    </tr>
  </logic:notEmpty>
  <!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_AdmParametriiConfigForm"
              dynamicJavascript="true"
               staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
