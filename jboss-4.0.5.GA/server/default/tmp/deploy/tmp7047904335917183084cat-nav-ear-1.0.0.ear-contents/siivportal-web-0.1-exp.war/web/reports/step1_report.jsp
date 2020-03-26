<%@ page import="ro.uti.settings.util.Constants,
				ro.uti.waf.web.action.JPortalActionContext"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<form name="closeForm" method="post" action="reports/report.do">
  <html:hidden property="method" value="list"/>
</form>

<script>
	function init(id_menu_entry)
	{
		document.getElementById("values.fk_report_menu_id").value = id_menu_entry;
	}

	function closeWindow()
	{
		document.closeForm.submit();
	}

	function validate()
	{
        var doSubmit = false;
        var name = document.getElementById("values.name").value;
        var description = document.getElementById("values.description").value;
        if (name == "") {
            alert("<bean:message bundle="report" key="report.alert.nameIsEmpty"/>");
        } else if (description == "") {
            alert("<bean:message bundle="report" key="report.alert.descriptionIsEmpty"/>");
        } else {
            doSubmit = true;
        }
        return doSubmit;
    }

</script>

<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
      <tr>
          <td width="100%" valign="top" align="left" class="page-subtitle">
    <!-- Titlul ferestrei pentru modificare. -->
    <logic:empty name="<%=Constants.TBL_REPORT_KEY%>" property="values.primaryKey" scope="request">
      <bean:message bundle="report" key="report.title.new"/>
    </logic:empty>
    <!-- Titlul ferestrei pentru adaugare. -->
    <logic:notEmpty name="<%=Constants.TBL_REPORT_KEY%>" property="values.primaryKey" scope="request">
      <bean:message bundle="report" key="report.title.edit"/>
    </logic:notEmpty>
    <!-- END Sectiune de Titlu pagina. -->
  </td>
    <td class="bottom" align="right">
      <img border="0" style="cursor:pointer;" onClick="javascript:closeWindow();"
           title='<bean:message bundle="report" key="report.label.closeWindow"/>' src="images/close_off.gif"
           onMouseOver="this.src='images/close_on.gif'" onmouseout="this.src='images/close_off.gif'"/>
    </td>
  </tr>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <logic:messagesPresent>
      <tr>
        <td valign="top" colspan="2" align="center" class="msg_error">
            <html:messages id="error" bundle="report">
                <bean:write name="error"/><br>
            </html:messages>
        </td>
      </tr>
    </logic:messagesPresent>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="1" class="report">
    <!-- START Sectiune de FORM. -->
    <html:form action="/report.do" enctype="multipart/form-data" onsubmit="return validate();">
		<html:hidden property="values.report_id"/>
		<html:hidden property="values.report_file"/>
		<html:hidden property="values.fk_report_menu_id" value="0"/>
		<html:hidden property="step" value="1"/>
		<html:hidden property="tempFolder"/>
		<html:hidden property="values.fk_user" value="<%=JPortalActionContext.getActionContext().getUser().getId().toString()%>"/>
	  <!-- Cimpul 'nume raport' field. -->
      <tr>
        <td valign="top" class="label" align="right" width="50%">
          <bean:message bundle="report" key="report.prompt.name"/>
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td align="left">
          <html:text errorStyleClass="msg_error" styleClass="field_input" property="values.name" size="40" maxlength="64"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
               title="<bean:message bundle="report" key="report.prompt.name.tooltip"/>"/>
        </td>
      </tr>
		<!-- Cimpul 'descriere raport' field. -->
		<tr>
		  <td valign="top" class="label" align="right" width="50%">
			<bean:message bundle="report" key="report.prompt.description"/>
			<font color="#336600">
			  *
			</font>
			:
		  </td>
		  <td align="left">
			<html:text errorStyleClass="msg_error" styleClass="field_input" property="values.description" size="40" maxlength="512"/>
			<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
				 title="<bean:message bundle="report" key="report.prompt.description.tooltip"/>"/>
		  </td>
		</tr>
		<tr>
			<td colspan="2">
				<div>
					<script type="text/javascript">
						d = new dTree('d');
						<logic:iterate id="menuList" name="<%= Constants.REPORT_MENUS_LIST %>">
							d.add(<bean:write name="menuList" property="report_menu_id"/>,<bean:write name="menuList" property="fk_parent_id"/>,'<bean:write name="menuList" property="report_menu_name"/>','javascript: init(<bean:write name="menuList" property="report_menu_id"/>);');
						</logic:iterate>
						document.write(d);
						d.openAll();
						d.s(0);
					</script>
				</div>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				&nbsp;
			</td>
		</tr>
		<!-- Buton incarcare. -->
		<tr>
		  <td colspan="2" class="button-row" align="center">
			<html:submit styleClass="btn-generic">
			  <bean:message bundle="report" key="report.button.upload"/>
			</html:submit>
			<html:hidden property="method" value="update"/>
		  </td>
		</tr>
    </html:form>
    <!-- END Sectiune de FORM. -->
  </table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_ReportForm"
                 dynamicJavascript="false"
                 staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
