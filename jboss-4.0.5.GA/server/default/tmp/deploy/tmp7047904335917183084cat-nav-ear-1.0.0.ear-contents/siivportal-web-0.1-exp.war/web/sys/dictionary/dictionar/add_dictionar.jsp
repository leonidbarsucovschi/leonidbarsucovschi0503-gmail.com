<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm" method="post" action="
sys/
dictionar.do">
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
        <logic:empty  name="<%=Constants.TBL_DICTIONAR_KEY%>"  property="values.primaryKey" scope="request">
          <bean:message bundle="dictionar" key="dictionar.title.add"/>
        </logic:empty>
        <!-- Titlul ferestrei pentru adaugare. -->
        <logic:notEmpty  name="<%=Constants.TBL_DICTIONAR_KEY%>" property="values.primaryKey" scope="request">
          <bean:message bundle="dictionar" key="dictionar.title.save"/>
        </logic:notEmpty>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="dictionar" key="dictionar.label.closeWindow"/>' src="images/close_off.gif" />
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
    <html:form action="/dictionar.do" onsubmit="return validateForm_DictionarForm(this);">
      <html:hidden property="values.id_dictionar"/>
      <!-- Cimpul 'fk_limba' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="dictionar" key="dictionar.prompt.fk_limba"/>
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td class="text" align="left">
          <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.fk_limba" size="22"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="dictionar" key="dictionar.label.tooltip.fk_limba"/>" />
        </td>
      </tr>
      <!-- Cimpul 'traducere' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="dictionar" key="dictionar.prompt.traducere"/>
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td class="text" align="left">
          <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.traducere" size="30"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="dictionar" key="dictionar.label.tooltip.traducere"/>" />
        </td>
      </tr>
      <!-- Cimpul 'camp_id' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="dictionar" key="dictionar.prompt.camp_id"/>
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td class="text" align="left">
          <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.camp_id" size="22"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="dictionar" key="dictionar.label.tooltip.camp_id"/>" />
        </td>
      </tr>
      <!-- START Sectiune de BUTOANE. -->
      <logic:empty  name="<%=Constants.TBL_DICTIONAR_KEY%>"  property="values.primaryKey" scope="request">
      <!-- Buton adugare. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="dictionar" key="dictionar.button.add"/>
          </html:submit>
          <html:hidden property="method"  value="add"/>
        </td>
      </tr>
    </logic:empty>
    <logic:notEmpty  name="<%=Constants.TBL_DICTIONAR_KEY%>" property="values.primaryKey" scope="request">
    <!-- buton modificare. -->
    <tr>
      <td colspan="2" class="button-row" align="center">
        <html:submit styleClass="btn-generic">
          <bean:message bundle="dictionar" key="dictionar.button.save"/>
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
<html:javascript formName="form_DictionarForm"
              dynamicJavascript="true"
               staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
