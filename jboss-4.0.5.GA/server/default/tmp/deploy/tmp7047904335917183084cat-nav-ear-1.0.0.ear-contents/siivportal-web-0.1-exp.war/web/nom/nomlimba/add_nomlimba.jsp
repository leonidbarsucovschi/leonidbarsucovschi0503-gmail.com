<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm" method="post" action="nom/nomlimba.do">
  <html:hidden property="method" value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>

<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
      <tr>
          <td width="100%" valign="top" align="left" class="page-subtitle">
    <!-- Titlul ferestrei pentru modificare. -->
    <logic:empty name="<%=Constants.NOM_LIMBA_KEY%>" property="values.primaryKey" scope="request">
      <bean:message bundle="nomlimba" key="nom_limba.title.add"/>
    </logic:empty>
    <!-- Titlul ferestrei pentru adaugare. -->
    <logic:notEmpty name="<%=Constants.NOM_LIMBA_KEY%>" property="values.primaryKey" scope="request">
      <bean:message bundle="nomlimba" key="nom_limba.title.save"/>
    </logic:notEmpty>
    <!-- END Sectiune de Titlu pagina. -->
  </td>
    <td class="bottom" align="right">
      <img border="0" style="cursor:pointer;" onClick="javascript:closeWindow();"
           title='<bean:message bundle="nomlimba" key="nom_limba.label.closeWindow"/>' src="images/close_off.gif"
           onMouseOver="this.src='images/close_on.gif'" onmouseout="this.src='images/close_off.gif'"/>
    </td>
  </tr>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <logic:messagesPresent>
      <tr>
        <td valign="top" colspan="2" align="center" class="msg_error">
            <html:messages id="error" bundle="nomlimba">
                <bean:write name="error"/><br>
            </html:messages>
        </td>
      </tr>
    </logic:messagesPresent>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="1" class="report">
    <!-- START Sectiune de FORM. -->
    <html:form action="/nomlimba.do" onsubmit="return validateForm_NomLimbaForm(this);">
      <html:hidden property="values.id_limba"/>
      <!-- Cimpul 'denumire' field. -->
      <tr>
        <td valign="top" class="label" align="right" width="50%">
          <bean:message bundle="nomlimba" key="nom_limba.prompt.denumire"/>
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td align="left">
          <html:text errorStyleClass="msg_error" styleClass="field_input" property="values.den_limba" size="40" maxlength="40"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
               title="<bean:message bundle="nomlimba" key="nom_limba.label.tooltip.denumire"/>"/>
        </td>
      </tr>
      <!-- Cimpul 'cod limba' field. -->
      <tr>
        <td valign="top" class="label" align="right" width="50%">
          <bean:message bundle="nomlimba" key="nom_limba.prompt.cod_limba"/>
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td align="left">
          <html:text errorStyleClass="msg_error" styleClass="field_input" property="values.cod_limba" size="5" maxlength="5"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
               title="<bean:message bundle="nomlimba" key="nom_limba.label.tooltip.cod_limba"/>"/>
        </td>
      </tr>
        <tr>
            <td colspan="2" height="10"></td>
        </tr>
      <!-- START Sectiune de BUTOANE. -->
      <logic:empty name="<%=Constants.NOM_LIMBA_KEY%>" property="values.primaryKey" scope="request">
        <!-- Buton adugare. -->
        <tr>
          <td colspan="2" class="button-row" align="center">
            <html:submit styleClass="btn-generic">
              <bean:message bundle="nomlimba" key="nom_limba.button.add"/>
            </html:submit>
            <html:hidden property="method" value="add"/>
          </td>
        </tr>
      </logic:empty>
      <logic:notEmpty name="<%=Constants.NOM_LIMBA_KEY%>" property="values.primaryKey" scope="request">
        <!-- buton modificare. -->
        <tr>
          <td colspan="2" class="button-row" align="center">
            <html:submit styleClass="btn-generic">
              <bean:message bundle="nomlimba" key="nom_limba.button.save"/>
            </html:submit>
            <html:hidden property="method" value="update"/>
          </td>
        </tr>
      </logic:notEmpty>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
    <!-- END Sectiune de FORM. -->
  </table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_NomLimbaForm"
                 dynamicJavascript="true"
                 staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
