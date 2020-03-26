<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm" method="post" action="
sys/
admoperationtype.do">
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
        <logic:empty  name="<%=Constants.ADM_OPERATION_TYPE_KEY%>"  property="values.primaryKey" scope="request">
          <bean:message bundle="admoperationtype" key="adm_operation_type.title.add"/>
        </logic:empty>
        <!-- Titlul ferestrei pentru adaugare. -->
        <logic:notEmpty  name="<%=Constants.ADM_OPERATION_TYPE_KEY%>" property="values.primaryKey" scope="request">
          <bean:message bundle="admoperationtype" key="adm_operation_type.title.save"/>
        </logic:notEmpty>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admoperationtype" key="adm_operation_type.label.closeWindow"/>' src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="1" class="report">
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
    <!-- START Sectiune de FORM. -->
    <html:form action="/admoperationtype.do" onsubmit="return validateForm_AdmOperationTypeForm(this);">
      <html:hidden property="values.id_operation_type"/>
      <!-- Cimpul 'fk_operation_type' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.fk_operation_type"/>
          :
        </td>
        <td class="text" align="left">
						<html:select property="values.fk_operation_type" styleClass="selectbox"><option value="">
          <bean:message bundle="app" key="select.prompt"/>
          </option>
          <html:options collection="array_adm_operation_type" property="values.id_operation_type" labelProperty="values.dumpData"/>
        </html:select>
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admoperationtype" key="adm_operation_type.label.tooltip.fk_operation_type"/>" />
      </td>
    </tr>
    <!-- Cimpul 'opp_name' field. -->
    <tr>
      <td valign="top"  align="right">
        <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.opp_name"/>
        <font color="#336600">
          *
        </font>
        :
      </td>
      <td class="text" align="left">
        <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.opp_name" size="30"/>
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admoperationtype" key="adm_operation_type.label.tooltip.opp_name"/>" />
      </td>
    </tr>
    <!-- Cimpul 'description' field. -->
    <tr>
      <td valign="top"  align="right">
        <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.description"/>
        :
      </td>
      <td class="text" align="left">
        <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.description" size="30"/>
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admoperationtype" key="adm_operation_type.label.tooltip.description"/>" />
      </td>
    </tr>
    <!-- START Sectiune de BUTOANE. -->
    <logic:empty  name="<%=Constants.ADM_OPERATION_TYPE_KEY%>"  property="values.primaryKey" scope="request">
    <!-- Buton adugare. -->
    <tr>
      <td colspan="2" class="button-row" align="center">
        <html:submit styleClass="btn-generic">
          <bean:message bundle="admoperationtype" key="adm_operation_type.button.add"/>
        </html:submit>
        <html:hidden property="method"  value="add"/>
      </td>
    </tr>
  </logic:empty>
  <logic:notEmpty  name="<%=Constants.ADM_OPERATION_TYPE_KEY%>" property="values.primaryKey" scope="request">
  <!-- buton modificare. -->
  <tr>
    <td colspan="2" class="button-row" align="center">
      <html:submit styleClass="btn-generic">
        <bean:message bundle="admoperationtype" key="adm_operation_type.button.save"/>
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
<html:javascript formName="form_AdmOperationTypeForm"
              dynamicJavascript="true"
               staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
