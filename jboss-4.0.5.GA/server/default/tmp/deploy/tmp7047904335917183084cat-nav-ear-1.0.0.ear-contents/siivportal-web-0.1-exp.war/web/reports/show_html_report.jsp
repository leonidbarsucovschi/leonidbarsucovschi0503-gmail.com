<%@ page import="ro.uti.siiv.reports.PrintAction" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="selectionComponent" prefix="selection" %>
<script src="selectionComponent/script/selectioncomponent.js"></script>
<script src="selectionComponent/script/hashtable.js"></script>

<form name="closeForm" method="post" action="reports/report.do">
    <html:hidden property="method" value="listMine"/>
</form>

<script>

function closeWindow()
{
    document.closeForm.submit();
}

function getId(id)
{
	var select = document.getElementById("parametersValue1_" + id);
	switch (select.options[select.selectedIndex].value)
	{
		case "1": return "hs1.hs1_cod";
			break;
		case "2": return "hs2.hs2_cod";
			break;
		case "4": return "hs4.hs4_cod";
			break;
		case "6": return "hs6.hs6_cod";
			break;
		case "8": return "rep.Report_ID";
			break;
	}
	return "lmb.ID_Limba";
}


function getCase(id)
{
	var select = document.getElementById("parametersValue1_" + id);
	switch (select.options[select.selectedIndex].value)
	{
		case "2": return "unhs2tab";
			break;
		case "4": return "unhs4tab";
			break;
		case "6": return "unhs6tab";
			break;
		case "8": return "untartab";
			break;
	}
	return "caseTest1";
}

function clearSelects(id)
{
	var select1 = document.getElementById("parametersValue2_" + id);
	var select2 = document.getElementById("selComp" + id);
	var select3 = document.getElementById("selectVizibilselComp" + id);

	while (select1.options.length > 0) select1.options[0] = null;
	while (select2.options.length > 0) select2.options[0] = null;
	while (select3.options.length > 0) select3.options[0] = null;
}




function onSubmit()
{
/*	for (i = 0; i < 50; i++)
	{
		if (document.getElementById("selComp" + i) != null)
		{
			for (q = 0; q < document.getElementById("selComp" + i).options.length; q++)
			{
				document.getElementById("parametersValue2_" + i).options[q] = new Option(document.getElementById("selComp" + i).options[q].text, document.getElementById("selComp" + i).options[q].value);
				document.getElementById("parametersValue2_" + i).options[q].selected = true;
			}
		}
	}*/

<logic:iterate id="parameter" name="parametersList" indexId="q" type="ro.uti.siiv.reports.ReportParameter">
{
	<!-- parameter is from nomen -->
	<logic:notEmpty name="parameter" property="nomenclator">
		if (<%=parameter.getRequired()%> == 1 || document.getElementById("parametersEnabled" + <%=q%>).checked == true)
		{
			// theoretically, nothing
		}
	</logic:notEmpty>

	<!-- parameter isn't from nomen, instead is of type Date, Numeric or String -->
	<logic:empty name="parameter" property="nomenclator">
		<!-- Type Date & Timestamp -->
		<% if (parameter.getType() != null && (parameter.getType().equals(String.valueOf(java.sql.Types.DATE)) || parameter.getType().equals(String.valueOf(java.sql.Types.TIMESTAMP)))) {%>
			if (<%=parameter.getRequired()%> == 1 || document.getElementById("parametersEnabled" + <%=q%>).checked == true)
			{
				if (document.getElementById("parametersValue1_" + <%=q%>).value == "")
				{
					alert("<%=parameter.getLabel()%> - <bean:message bundle="report" key="report.paremeters.error.val1"/>");
					return false;
				}
				select = document.getElementById("parametersOperator" + <%=q%>);
				if (select.options[select.selectedIndex].value == "<%=PrintAction.OPERATOR_BETWEEN%>")
					if (document.getElementById("parametersValue2_" + <%=q%>).value == "")
					{
						alert("<%=parameter.getLabel()%> - <bean:message bundle="report" key="report.paremeters.error.val2"/>");
						return false;
					}
			}
		<%}%>

		<!-- Type Numeric -->
		<logic:equal value="<%=String.valueOf(java.sql.Types.DECIMAL)%>" name="parameter" property="type">
			if (<%=parameter.getRequired()%> == 1 || document.getElementById("parametersEnabled" + <%=q%>).checked == true)
			{
				if (document.getElementById("parametersValue1_" + <%=q%>).value == "")
				{
					alert("<%=parameter.getLabel()%> - <bean:message bundle="report" key="report.paremeters.error.val1"/>");
					return false;
				}
				select = document.getElementById("parametersOperator" + <%=q%>);
				if (select.options[select.selectedIndex].value == "<%=PrintAction.OPERATOR_BETWEEN%>")
					if (document.getElementById("parametersValue2_" + <%=q%>).value == "")
					{
						alert("<%=parameter.getLabel()%> - <bean:message bundle="report" key="report.paremeters.error.val2"/>");
						return false;
					}
			}
		</logic:equal>

		<!-- Type String -->
		<logic:equal value="<%=String.valueOf(java.sql.Types.VARCHAR)%>" name="parameter" property="type">
			if (<%=parameter.getRequired()%> == 1 || document.getElementById("parametersEnabled" + <%=q%>).checked == true)
			{
				select = document.getElementById("parametersOperator" + <%=q%>);
				if (select.options[select.selectedIndex].value != "<%=PrintAction.OPERATOR_IS_NOT_NULL%>" &&
					select.options[select.selectedIndex].value != "<%=PrintAction.OPERATOR_IS_NULL%>" &&
					document.getElementById("parametersValue1_" + <%=q%>).value == "")
				{
					alert("<%=parameter.getLabel()%> - <bean:message bundle="report" key="report.paremeters.error.val1"/>");
					return false;
				}
			}
		</logic:equal>

		<!-- Type special nomenclators -->
		<logic:equal value="<%=String.valueOf(-99)%>" name="parameter" property="type">
		5
		</logic:equal>
	</logic:empty>
}
</logic:iterate>
}

function enableDateAndNumberSecondValue(id) {
    var select = document.getElementById("parametersOperator" + id);
    var value1 = document.getElementById("parametersValue1_" + id);
    var value2 = document.getElementById("parametersValue2_" + id);
    var dateButton1 = document.getElementById("trigger_parametersValue1_" + id);
    var dateButton2 = document.getElementById("trigger_parametersValue2_" + id);
    if (select.options[select.selectedIndex].value == "<%=PrintAction.OPERATOR_BETWEEN%>") {
        value1.disabled = false;
        value2.disabled = false;
        if (dateButton1 != null) {
            dateButton1.disabled = false;
        }
        if (dateButton2 != null) {
            dateButton2.disabled = false;
        }
    } else {
        value1.disabled = false;
        value2.disabled = true;
        if (dateButton1 != null) {
            dateButton1.disabled = false;
        }
        if (dateButton2 != null) {
            dateButton2.disabled = true;
        }
    }
}

function enableTextSecondValue(id) {
    var select = document.getElementById("parametersOperator" + id);
    var value1 = document.getElementById("parametersValue1_" + id);
    if (select.options[select.selectedIndex].value == "<%=PrintAction.OPERATOR_IS_NULL%>" ||
        select.options[select.selectedIndex].value == "<%=PrintAction.OPERATOR_IS_NOT_NULL%>") {
        value1.disabled = true;
    } else {
        value1.disabled = false;
    }
}

function enableParameter(id) {
    var checkbox = document.getElementById("parametersEnabled" + id);
    var operator = document.getElementById("parametersOperator" + id);
    var value1 = document.getElementById("parametersValue1_" + id);
    var value2 = document.getElementById("parametersValue2_" + id);
    var dateButton1 = document.getElementById("trigger_parametersValue1_" + id);
    var dateButton2 = document.getElementById("trigger_parametersValue2_" + id);
    var orderBy1 = document.getElementById("parametersOrderBy1_" + id);
    var orderBy2 = document.getElementById("parametersOrderBy2_" + id);
	var selComp = document.getElementById("selComp" + id);
	var selCompVis = document.getElementById("selectVizibilselComp" + id);
	var scSearchButton = document.getElementById("selComp" + id + "searchButton");

	// find parameter type
    var parameterType = null;
    if (orderBy1 != null)
	{
        parameterType = "ORDERBY";
    }
	else
		if (selComp != null)
		{
			parameterType = "SPECNOMEN"
		}
		else
			if (dateButton1 != null)
			{
				parameterType = "DATE";
			}
			else
				if (value2 != null)
				{
					parameterType = "NUMBER";
				}
				else
					if (operator != null)
					{
						parameterType = "TEXT";
					}
					else
					{
						parameterType = "NOMEN";
					}

    if (checkbox == null || checkbox.checked == true)	// no checkbox (required parameter) or checked
	{
        if (parameterType == "ORDERBY") {
            orderBy1.disabled = false;
            orderBy2.disabled = false;
        } else {
            value1.disabled = false;
            if (parameterType == "DATE" || parameterType == "NUMBER" || parameterType == "TEXT") {
                operator.disabled = false;
            }
            if (parameterType == "DATE" || parameterType == "NUMBER") {
                value2.disabled = false;
            }
			if (parameterType == "SPECNOMEN")
			{
				value2.disabled = false;
				scSearchButton.disabled = false;
				selCompVis.enabled = false;
			}
			if (parameterType == "DATE") {
                dateButton1.disabled = false;
                dateButton2.disabled = false;
            }
            // select first operator
            if (parameterType == "DATE" || parameterType == "NUMBER") {
                enableDateAndNumberSecondValue(id);
            }
            if (parameterType == "TEXT") {
                enableTextSecondValue(id);
            }
        }
    } else {
        if (parameterType == "ORDERBY") {
            orderBy1.disabled = true;
            orderBy2.disabled = true;
        } else {
            value1.disabled = true;
            if (parameterType == "DATE" || parameterType == "NUMBER" || parameterType == "TEXT") {
                operator.disabled = true;
            }
            if (parameterType == "DATE" || parameterType == "NUMBER") {
                value2.disabled = true;
            }
			if (parameterType == "SPECNOMEN")
			{
				value2.disabled = true;
				scSearchButton.disabled = true;
				selCompVis.enabled = true;
			}
			if (parameterType == "DATE") {
                dateButton1.disabled = true;
                dateButton2.disabled = true;
            }
        }
    }
}

</script>

<div class="table">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr>
        <td width="100%" valign="top" align="left" class="page-subtitle">
            <!-- Titlul ferestrei. -->
            <bean:message bundle="report" key="report.title.parameters"/>
			-
			<bean:write name="reportName"/>
		</td>
        <td class="bottom" align="right">
            <img border="0" style="cursor:pointer;" onClick="javascript:closeWindow();"
                 title='<bean:message bundle="report" key="report.label.closeWindow"/>' src="images/close_off.gif"
                 onMouseOver="this.src='images/close_on.gif'" onmouseout="this.src='images/close_off.gif'"/>
        </td>
    </tr>
</table>
<br>

<!-- Sectiune de erori -->
<table width="100%" border="0" cellpadding="0" cellspacing="1">
    <logic:messagesPresent>
        <tr>
            <td valign="top" colspan="2" align="center" class="msg_error">
                <html:messages id="error" bundle="report">
                    <bean:write name="error"/>
                    <br>
                </html:messages>
            </td>
        </tr>
    </logic:messagesPresent>
</table>

<!-- Sectiune de parametrii enctype="multipart/form-data" -->
<table width="100%" border="0" cellpadding="0" cellspacing="3" class="report">
<html:form action="/print.do" method="get"  onsubmit="return onSubmit();">
<html:hidden property="report_id"/>

<tr>
	<td align="center">
		&nbsp;
	</td>
	<td align="center">
        &nbsp;
        <bean:message bundle="report" key="report.parametersTable.parameter"/>
        &nbsp;
    </td>
    <td align="center">
        &nbsp;
        <bean:message bundle="report" key="report.parametersTable.operation"/>
        &nbsp;
    </td>
    <td align="center">
        &nbsp;
        <bean:message bundle="report" key="report.parametersTable.value1"/>
        &nbsp;
    </td>
    <td align="center">
        &nbsp;
        <bean:message bundle="report" key="report.parametersTable.value2"/>
        &nbsp;
    </td>
</tr>

<logic:iterate id="parameter" name="parametersList" indexId="i" type="ro.uti.siiv.reports.ReportParameter">
<tr>
    <td colspan="5" align="center">
        <hr align="center">
    </td>
</tr>

<tr>
<td align="left">
	<input type="hidden" name="p[<%=i%>].name"
           value="<bean:write name="parameter" property="name" filter="false"/>">
    <input type="hidden" name="p[<%=i%>].type"
           value="<bean:write name="parameter" property="type" filter="false"/>">
	<logic:equal name="parameter" property="required" value="0">
		<input type="checkbox" name="p[<%=i%>].enabled" id="<%= "parametersEnabled" + i %>"
			   value="true" onchange="javascript:enableParameter(<%=i%>)" <logic:equal name="parameter" property="enabled" value="true">CHECKED</logic:equal>>
	</logic:equal>
	<logic:equal name="parameter" property="required" value="1">
		<input type="hidden" name="p[<%=i%>].enabled" value="true"/>
	</logic:equal>
</td>
<td align="left">
	<bean:write name="parameter" property="label" filter="false"/>
</td>

<!-- parameter is from nomen -->
<logic:notEmpty name="parameter" property="nomenclator">
    <td align="center">
        <bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
    </td>
    <td align="left" colspan="2">
        <select align="absmiddle" name="p[<%=i%>].nom" id="<%= "parametersValue1_" + i%>" multiple="true" height="5"
                class="selectboxTag" disabled="true">
            <logic:iterate id="opt" name="parameter" property="nomenclator">
                <option value="<bean:write name="opt" property="key" filter="false"/>">
                    <bean:write name="opt" property="value" filter="false"/>
                </option>
            </logic:iterate>
        </select>
    </td>
</logic:notEmpty>

<!-- parameter isn't from nomen, instead is of type Date, Numeric or String -->
<logic:empty name="parameter" property="nomenclator">
<!-- Type Date & Timestamp -->
<% if (parameter.getType() != null && (parameter.getType().equals(String.valueOf(java.sql.Types.DATE)) || parameter.getType().equals(String.valueOf(java.sql.Types.TIMESTAMP)))) {%>
    <td align="center">
        <select align="absmiddle" name="p[<%=i%>].operator" id="<%= "parametersOperator" + i%>"
                class="selectboxTag" onchange="javascript:enableDateAndNumberSecondValue(<%=i%>)" disabled="true">
            <option value="<%=PrintAction.OPERATOR_EQUAL_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_EQUAL_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_GREATER_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_GREATER_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.greater"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_LESS_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_LESS_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.less"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_GREATER_OR_EQUAL_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_GREATER_OR_EQUAL_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.greaterOrEqual"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_LESS_OR_EQUAL_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_LESS_OR_EQUAL_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.lessOrEqual"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_BETWEEN_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_BETWEEN_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.between"/>
            </option>
        </select>
    </td>
    <td align="left">
        <input type="text" name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" value="<logic:notEmpty name="parameter" property="value1"><bean:write name="parameter" property="value1" filter="false"/></logic:notEmpty>" class="field_input" disabled="true">
        <input align="absmiddle" type="image" src="images/cal.gif" id="<%= "trigger_parametersValue1_" + i%>"
               disabled="true"/>
        <script type="text/javascript">
            Calendar.setup(
            {
                inputField  : "p[<%=i%>].value1",// ID of the input field
                ifFormat    : "%d/%m/%Y",    // the date format
                button      : "<%= "trigger_parametersValue1_" + i%>"// ID of the button
            }
                    );
        </script>
    </td>
    <td align="left">
        <input type="text" name="p[<%=i%>].value2" id="<%= "parametersValue2_" + i%>" value="<logic:notEmpty name="parameter" property="value2"><bean:write name="parameter" property="value2" filter="false"/></logic:notEmpty>" class="field_input" disabled="true">
        <input align="absmiddle" type="image" src="images/cal.gif" id="<%= "trigger_parametersValue2_" + i%>"
               disabled="true"/>
        <script type="text/javascript">
            Calendar.setup(
            {
                inputField  : "p[<%=i%>].value2",// ID of the input field
                ifFormat    : "%d/%m/%Y",    // the date format
                button      : "<%= "trigger_parametersValue2_" + i%>"// ID of the button
            }
                    );
        </script>
    </td>
<%}%>

<!-- Type Numeric -->
<logic:equal value="<%=String.valueOf(java.sql.Types.DECIMAL)%>" name="parameter" property="type">
    <td align="center">
        <select align="absmiddle" name="p[<%=i%>].operator" id="<%= "parametersOperator" + i%>"
                class="selectboxTag" onchange="javascript:enableDateAndNumberSecondValue(<%=i%>)" disabled="true">
            <option value="<%=PrintAction.OPERATOR_EQUAL_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_EQUAL_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_GREATER_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_GREATER_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.greater"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_LESS_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_LESS_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.less"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_GREATER_OR_EQUAL_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_GREATER_OR_EQUAL_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.greaterOrEqual"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_LESS_OR_EQUAL_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_LESS_OR_EQUAL_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.lessOrEqual"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_BETWEEN_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_BETWEEN_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.numberOrDate.between"/>
            </option>
        </select>
    </td>
    <td align="left">
        <input type="text" name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" value="<logic:notEmpty name="parameter" property="value1"><bean:write name="parameter" property="value1" filter="false"/></logic:notEmpty>" class="field_input" disabled="true">
    </td>
    <td align="left">
        <input type="text" name="p[<%=i%>].value2" id="<%= "parametersValue2_" + i%>" value="<logic:notEmpty name="parameter" property="value2"><bean:write name="parameter" property="value2" filter="false"/></logic:notEmpty>" class="field_input" disabled="true">
    </td>
</logic:equal>

<!-- Type String -->
<logic:equal value="<%=String.valueOf(java.sql.Types.VARCHAR)%>" name="parameter" property="type">
    <td align="center">
        <select align="absmiddle" name="p[<%=i%>].operator" id="<%= "parametersOperator" + i%>"
                class="selectboxTag" onchange="javascript:enableTextSecondValue(<%=i%>)" disabled="true">
            <option value="<%=PrintAction.OPERATOR_BEGIN_WITH_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_BEGIN_WITH_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.text.beginWith"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_END_WITH_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_END_WITH_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.text.endWith"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_CONTAINS_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_CONTAINS_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.text.contains"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_EQUAL_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_EQUAL_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.text.equal"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_IS_NULL_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_IS_NULL_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.text.isNull"/>
            </option>
            <option value="<%=PrintAction.OPERATOR_IS_NOT_NULL_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.OPERATOR_IS_NOT_NULL_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.text.isNotNull"/>
            </option>
        </select>
    </td>
    <td align="left" colspan="2">
        <input type="text" name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" value="<logic:notEmpty name="parameter" property="value1"><bean:write name="parameter" property="value1" filter="false"/></logic:notEmpty>" class="field_input" disabled="true">
    </td>
</logic:equal>

<!-- Type special nomenclators -->
<logic:equal value="<%=String.valueOf(-99)%>" name="parameter" property="type">
	<td align="center">
		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
	</td>
	<td align="left">
		<select name="p[<%=i%>].nom" id="<%= "parametersValue2_" + i%>" multiple="true" style="visibility:hidden;width:1;height:1"></select>
		<select align="absmiddle" name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" class="selectboxTag" onchange="<%= "clearSelects(" + i + ")"%>">
			<option value="2" SELECTED>
				UNHS2TAB
			</option>
			<option value="4">
				UNHS4TAB
			</option>
			<option value="6">
				UNHS6TAB
			</option>
			<option value="8">
				UNTARTAB
			</option>
		</select>
	</td>
	<td align="left">
		<selection:selectionComponent name="<%="selComp"+i%>" detailsFieldName="cod" idTableName="<%="getId("+i+")"%>" multiple="true">
			<selection:genericSelection searchCaseId="<%="getCase("+i+")"%>" showCodeInsert="true" knownFieldName="cod" styleClass="field_input_small">
			</selection:genericSelection>
		</selection:selectionComponent>
	</td>
</logic:equal>


<!-- Pentru ORDER BY -->
<logic:equal value="OrderClause" name="parameter" property="name">
    <td align="center">
        <bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
    </td>
    <td align="left" colspan="2">
        <select align="absmiddle" name="p[<%=i%>].value1" id="<%= "parametersOrderBy1_" + i %>"
                class="selectboxTag" disabled="true">
            <logic:iterate id="orderByElement" name="orderByList">
                <option value="<bean:write name="orderByElement" filter="false"/>">
                    <bean:write name="orderByElement" filter="false"/>
                </option>
            </logic:iterate>
        </select>
        &nbsp;
        <select align="absmiddle" name="p[<%=i%>].value2" id="<%= "parametersOrderBy2_" + i %>"
                class="selectboxTag" disabled="true">
            <option value="<%=PrintAction.SORT_ORDER_ASCENDING_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.SORT_ORDER_ASCENDING_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.text.Asc"/>
            </option>
            <option value="<%=PrintAction.SORT_ORDER_DESCENDING_STR%>" <logic:equal name="parameter" property="operator" value="<%=PrintAction.SORT_ORDER_DESCENDING_STR%>">SELECTED</logic:equal>>
                <bean:message bundle="report" key="report.parameters.operators.text.Desc"/>
            </option>
        </select>
    </td>
</logic:equal>

</logic:empty>
</tr>
<logic:equal name="parameter" property="required" value="1">
	<script>enableParameter(<%=i%>);</script>
</logic:equal>
<logic:equal name="parameter" property="enabled" value="true">
	<script>enableParameter(<%=i%>);</script>
</logic:equal>

</logic:iterate>

<!-- Buton incarcare. -->
<tr>
    <td colspan="5">
        &nbsp;
    </td>
</tr>
<tr>
    <td colspan="5" class="button-row" align="center">
        <html:submit styleClass="btn-generic">
            <bean:message bundle="report" key="report.button.report"/>
        </html:submit>
        <html:hidden property="method" value="showHTMLReport"/>
    </td>
</tr>

</html:form>
</table>

<logic:notEmpty name="http_report_content">
	<table width="100%" border="0" cellpadding="0" cellspacing="1">
	<tr>
		<td valign="top" align="center">
			<bean:write name="http_report_content" filter="false"/>
		</td>
	</tr>
	</table>
</logic:notEmpty>

</div>

