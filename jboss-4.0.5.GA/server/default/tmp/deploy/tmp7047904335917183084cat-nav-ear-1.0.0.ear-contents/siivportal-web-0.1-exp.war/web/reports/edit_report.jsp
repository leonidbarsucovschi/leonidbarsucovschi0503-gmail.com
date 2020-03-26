<%--
  Created by IntelliJ IDEA.
  User: Sandu Mihai
  Date: 02-Jul-2007
  Time: 17:31:53
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<form name="closeForm" method="post" action="reports/report.do">
    <html:hidden property="method" value="list"/>
</form>

<script>

	function init(id_menu_entry)
	{
		document.getElementById("values.fk_report_menu_id").value = id_menu_entry;
	}
	
	function closeWindow() {
        document.closeForm.submit();
    }

	function validate() {
        var doSubmit = false;
        var name = document.getElementById("reportName").value;
        var description = document.getElementById("reportDescription").value;
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
    <!-- Titlul ferestrei -->
    <table width="100%" border="0" cellpadding="0" cellspacing="1">
        <tr>
            <td width="100%" valign="top" align="left" class="page-subtitle">
                <bean:message bundle="report" key="report.title.update"/>
            </td>
            <td class="bottom" align="right">
                <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();"
                     title='<bean:message bundle="report" key="report.label.closeWindow"/>'
                     src="images/close_off.gif"/>
            </td>
        </tr>
    </table>

    <!-- Sectiune de Afisare Erori. -->
    <logic:messagesPresent>
        <table width="100%" border="0" cellpadding="1" align="center" cellspacing="1">
            <tr>
                <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error" align="center">
                    <html:errors/>
                </td>
            </tr>
        </table>
    </logic:messagesPresent>

    <table width="100%" border="0" cellpadding="0" cellspacing="1">
		<html:form action="/report.do" enctype="multipart/form-data" onsubmit="return validate();">
			<html:hidden property="values.report_id"/>
			<html:hidden property="values.report_file"/>
			<html:hidden property="values.fk_report_menu_id"/>
			<html:hidden property="tempFolder"/>
			<html:hidden property="method" value="edit"/>
			<tr>
                <td colspan="2" height="10"></td>
            </tr>

            <!-- Campul nume -->
            <tr>
                <td class="label" width="25%" align="right">
                    <bean:message bundle="report" key="report.prompt.name"/>
                    :
                </td>
                <td class="field_text" width="25%" align="left">
                    <input type="text" name="values.name" id="reportName" 
                           value="<bean:write property="values.name" name="<%=Constants.TBL_REPORT_KEY%>"/>">
                </td>
            </tr>

            <!-- Campul descriere -->
            <tr>
                <td class="label" width="25%" align="right">
                    <bean:message bundle="report" key="report.prompt.description"/>
                    :
                </td>
                <td class="field_text" width="25%" align="left">
                    <input type="text" name="values.description" id="reportDescription"
                           value="<bean:write property="values.description" name="<%=Constants.TBL_REPORT_KEY%>"/>">
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
							<logic:notEmpty  name="report_menu_dtree_id" scope="request">
								d.s(<bean:write name="report_menu_dtree_id"/>);
							</logic:notEmpty>
						</script>
					</div>
				</td>
			</tr>
			<tr>
                <td colspan="2" height="10"></td>
            </tr>
            <tr>
                <td colspan="2" class="button-row" align="center">
                    <%--<input type="submit" name="<bean:message bundle="report" key="report.button.save"/>"
                            onclick="return validate();">--%>
                    <html:submit styleClass="btn-generic">
                        <bean:message bundle="report" key="report.button.save"/>
                    </html:submit>
                </td>
            </tr>
        </html:form>
    </table>
</div>