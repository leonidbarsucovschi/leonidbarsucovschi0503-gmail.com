<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm" method="post" action="
sys/
admrolehierarchy.do">
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
        <logic:empty  name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>"  property="values.primaryKey" scope="request">
          <bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.title.add"/>
        </logic:empty>
        <!-- Titlul ferestrei pentru adaugare. -->
        <logic:notEmpty  name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>" property="values.primaryKey" scope="request">
          <bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.title.save"/>
        </logic:notEmpty>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.label.closeWindow"/>' src="images/close_off.gif" />
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
    <html:form action="/admrolehierarchy.do" onsubmit="return validateForm_AdmRoleHierarchyForm(this);">
      <html:hidden property="values.id_role_hierarchy"/>
      <!-- Cimpul 'fk_role1' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.prompt.fk_role1"/>
          :
        </td>
        <td class="text" align="left">
						<html:select property="values.
							fk_role1" styleClass="selectbox"><option value="">
          <bean:message bundle="app" key="select.prompt"/>
          </option>
          <html:options collection="array_adm_role" property="values.id_role" labelProperty="values.dumpData"/>
        </html:select>
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.label.tooltip.fk_role1"/>" />
      </td>
    </tr>
    <!-- Cimpul 'tbl_id_appl_role' field. -->
    <tr>
      <td valign="top"  align="right">
        <bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.prompt.tbl_id_appl_role"/>
        :
      </td>
      <td class="text" align="left">
						<html:select property="values.
							tbl_id_appl_role" styleClass="selectbox"><option value="">
        <bean:message bundle="app" key="select.prompt"/>
        </option>
        <html:options collection="array_adm_role" property="values.id_role" labelProperty="values.dumpData"/>
      </html:select>
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.label.tooltip.tbl_id_appl_role"/>" />
    </td>
  </tr>
  <!-- START Sectiune de BUTOANE. -->
  <logic:empty  name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>"  property="values.primaryKey" scope="request">
  <!-- Buton adugare. -->
  <tr>
    <td colspan="2" class="button-row" align="center">
      <html:submit styleClass="btn-generic">
        <bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.button.add"/>
      </html:submit>
      <html:hidden property="method"  value="add"/>
    </td>
  </tr>
</logic:empty>
<logic:notEmpty  name="<%=Constants.ADM_ROLE_HIERARCHY_KEY%>" property="values.primaryKey" scope="request">
<!-- buton modificare. -->
<tr>
  <td colspan="2" class="button-row" align="center">
    <html:submit styleClass="btn-generic">
      <bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.button.save"/>
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
<html:javascript formName="form_AdmRoleHierarchyForm"
              dynamicJavascript="true"
               staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
