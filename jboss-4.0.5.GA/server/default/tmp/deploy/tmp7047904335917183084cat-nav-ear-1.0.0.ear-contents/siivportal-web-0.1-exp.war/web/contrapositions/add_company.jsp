<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<form name="closeForm" method="post" action="contrapositions/company.do">
    <html:hidden property="method" value="list"/>
</form>

<script>

	function closeWindow() {
        document.closeForm.submit();
    }

	function validate() {
        var doSubmit = false;
        var idno = document.getElementById("idno").value;
        var name = document.getElementById("name").value;
        if (idno == "") {
            alert("<bean:message bundle="company" key="company.alert.idnoIsEmpty"/>");
        } else if (name == "") {
            alert("<bean:message bundle="company" key="company.alert.nameIsEmpty"/>");
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
		<html:form action="/company.do" enctype="multipart/form-data" onsubmit="return validate();">
			<html:hidden property="method" value="add"/>
			<tr>
                <td colspan="2" height="10"></td>
            </tr>


			<!-- Campul IDNO -->
			<tr>
				<td class="label" width="25%" align="right">
					<bean:message bundle="company" key="company.prompt.idno"/>
					:
				</td>
				<td class="field_text" width="25%" align="left">
					<input type="text" name="values.idno" id="idno"
						   value="<bean:write property="values.idno" name="<%=Constants.TBL_COMPANY_KEY%>"/>">
				</td>
			</tr>

			<!-- Campul name -->
			<tr>
				<td class="label" width="25%" align="right">
					<bean:message bundle="company" key="company.prompt.name"/>
					:
				</td>
				<td class="field_text" width="25%" align="left">
					<input type="text" name="values.name" id="name"
						   value="<bean:write property="values.name" name="<%=Constants.TBL_COMPANY_KEY%>"/>">
				</td>
			</tr>

			<!-- Campul address -->
			<tr>
				<td class="label" width="25%" align="right">
					<bean:message bundle="company" key="company.prompt.address"/>
					:
				</td>
				<td class="field_text" width="25%" align="left">
<textarea rows="3" cols="30" name="values.address"><bean:write property="values.address" name="<%=Constants.TBL_COMPANY_KEY%>"/></textarea>
				</td>
			</tr>

			<!-- Campul items -->
			<tr>
				<td class="label" width="25%" align="right">
					<bean:message bundle="company" key="company.prompt.items"/>
					:
				</td>
				<td class="field_text" width="25%" align="left">
<textarea rows="3" cols="30" name="values.items"><bean:write property="values.items" name="<%=Constants.TBL_COMPANY_KEY%>"/></textarea>
				</td>
			</tr>

			<!-- Campul periods -->
			<tr>
				<td class="label" width="25%" align="right">
					<bean:message bundle="company" key="company.prompt.periods"/>
					:
				</td>
				<td class="field_text" width="25%" align="left">
<textarea rows="3" cols="30" name="values.periods"><bean:write property="values.periods" name="<%=Constants.TBL_COMPANY_KEY%>"/></textarea>
				</td>
			</tr>

			<!-- Campul comments -->
			<tr>
				<td class="label" width="25%" align="right">
					<bean:message bundle="company" key="company.prompt.comments"/>
					:
				</td>
				<td class="field_text" width="25%" align="left">
<textarea rows="3" cols="30" name="values.comments"><bean:write property="values.comments" name="<%=Constants.TBL_COMPANY_KEY%>"/></textarea>                             d
				</td>
			</tr>


			<tr>
                <td colspan="2" height="10"></td>
            </tr>
            <tr>
                <td colspan="2" class="button-row" align="center">
                    <html:submit styleClass="btn-generic">
                        <bean:message bundle="company" key="company.button.new"/>
                    </html:submit>
                </td>
            </tr>
        </html:form>
    </table>
</div>