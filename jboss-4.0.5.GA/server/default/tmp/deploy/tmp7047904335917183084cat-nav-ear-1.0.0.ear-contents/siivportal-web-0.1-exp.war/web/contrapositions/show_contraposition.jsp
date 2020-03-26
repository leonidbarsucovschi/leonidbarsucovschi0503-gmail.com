<%@ page import="ro.uti.siiv.SIIVConstants" %>
<%@ page import="net.sf.jasperreports.engine.JRParameter" %>
<%@ page import="ro.uti.apmc.sys.util.DatabaseMetaData" %>
<%@ page import="ro.uti.settings.util.ThreadSafeSDFs" %>
<%@ page import="java.util.*" %>
<%@ page import="ro.uti.siiv.reports.ReportParameter" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<%@ taglib uri="/WEB-INF/pagination.tld" prefix="pagination" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="selectionComponent" prefix="selection" %>
<script src="selectionComponent/script/selectioncomponent.js"></script>
<script src="selectionComponent/script/hashtable.js"></script>

<script>

function printContraposition()
{
	document.getElementById("print").value = "true";
	document.form_ContrapositionForm.submit();
	document.getElementById("print").value = "false";
}

function getId(id)
{
	var select = document.getElementById("parametersValue1_" + id);
	switch (select.options[select.selectedIndex].value)
	{
		case "hs2": return "hs2.hs2_cod";
			break;
		case "hs4": return "hs4.hs4_cod";
			break;
		case "hs6": return "hs6.hs6_cod";
			break;
		case "hs8": return "CONCAT(hs8.hs6_cod,hs8.tar_pr1)";
			break;
	}
	return "hs2.hs2_cod";
}


function getCase(id)
{
	var select = document.getElementById("parametersValue1_" + id);
	switch (select.options[select.selectedIndex].value)
	{
		case "hs2": return "unhs2tab";
			break;
		case "hs4": return "unhs4tab";
			break;
		case "hs6": return "unhs6tab";
			break;
		case "hs8": return "untartab";
			break;
	}
	return "unhs2tab";
}

function clearSelects(id)
{
	var select1 = document.getElementById("parametersValue2_" + id);
	var select2 = document.getElementById("selComp" + id);
	var select3 = document.getElementById("textselComp"+id+"cod");

	while (select1.options.length > 0) select1.options[0] = null;
	select2.value = '';
	select3.value = '';
}


function onSubmit()
{
	for (i = 0; i < 50; i++)
	{
		if (document.getElementById("selComp" + i) != null)
		{
			if (document.getElementById("selComp" + i).options != null)
				for (q = 0; q < document.getElementById("selComp" + i).options.length; q++)
				{
					document.getElementById("parametersValue2_" + i).options[q] = new Option(document.getElementById("selComp" + i).options[q].text, document.getElementById("selComp" + i).options[q].value);
					document.getElementById("parametersValue2_" + i).options[q].selected = true;
				}
			else
				if (document.getElementById("selComp" + i).value != "")
				{
					document.getElementById("parametersValue2_" + i).options[0] = new Option(document.getElementById("selComp" + i).value, document.getElementById("selComp" + i).value);
					document.getElementById("parametersValue2_" + i).options[0].selected = true;
				}
		}
	}

<%
	{
		JRParameter[] jrParameters = (JRParameter[] ) request.getAttribute("JRParameters");

		int i = 0;
		for (int j = 0; j < jrParameters.length; j++)
		{
			JRParameter param = jrParameters[j];
			String visible = param.getPropertiesMap().getProperty("visible");
			if (!param.isSystemDefined()
					&& !param.getName().equalsIgnoreCase("SUBREPORT_DIR")
					&& !param.getName().equalsIgnoreCase("options")
					&& !param.getName().equalsIgnoreCase("order_by")
					&& !param.getName().equalsIgnoreCase("start_item")
					&& !param.getName().equalsIgnoreCase("end_item")
					&& (visible == null || !visible.equalsIgnoreCase("false")))
			{
				String label = param.getDescription() != null && !param.getDescription().equals("") ? param.getDescription() : param.getName();
				String type = param.getPropertiesMap().getProperty("type");
				String multiple = param.getPropertiesMap().getProperty("multiple");
				String min = param.getPropertiesMap().getProperty("min");
				String max = param.getPropertiesMap().getProperty("max");
				String difference = param.getPropertiesMap().getProperty("difference");

				if (type != null && (type.equals(String.valueOf(java.sql.Types.DATE)) || type.equals(String.valueOf(java.sql.Types.TIMESTAMP))))
				{
					if (min != null && min.indexOf("sysdate") > -1)
					{
						Calendar c = Calendar.getInstance();
						c.add(Calendar.DAY_OF_MONTH, Integer.valueOf(min.substring(7)).intValue());
						min = ThreadSafeSDFs.getMsdf().format(c.getTime());
	                }
					if (max != null && max.indexOf("sysdate") > -1)
					{
						Calendar c = Calendar.getInstance();
						c.add(Calendar.DAY_OF_MONTH, Integer.valueOf(max.substring(7)).intValue());
						max = ThreadSafeSDFs.getMsdf().format(c.getTime());
	                }


					%>
					if (document.getElementById("parametersEnabled" + <%=i%>) == null || document.getElementById("parametersEnabled" + <%=i%>).checked == true)
					{
						if (document.getElementById("parametersValue1_" + <%=i%>).value == "")
						{
							alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.val1"/>");
							return false;
						}
						if (!isDate(document.getElementById("parametersValue1_" + <%=i%>).value, "dd/MM/yyyy"))
						{
							alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.date.val1"/>");
							return false;
						}
						select = document.getElementById("parametersOperator" + <%=i%>);
						if (select.options[select.selectedIndex].value == "<%=SIIVConstants.OPERATOR_BETWEEN%>")
						{
							if (document.getElementById("parametersValue2_" + <%=i%>).value == "")
							{
								alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.val2"/>");
								return false;
							}
							if (!isDate(document.getElementById("parametersValue2_" + <%=i%>).value, "dd/MM/yyyy"))
							{
								alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.date.val2"/>");
								return false;
							}
							if (compareDates(document.getElementById("parametersValue1_" + <%=i%>).value, "dd/MM/yyyy", document.getElementById("parametersValue2_" + <%=i%>).value, "dd/MM/yyyy") == 1)
							{
								alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.invert"/>");
								return false;
							}
							<%
							if (difference != null)
							{
							%>
								date1 = getDateFromFormat(document.getElementById("parametersValue1_" + <%=i%>).value, "dd/MM/yyyy");
								date2 = getDateFromFormat(document.getElementById("parametersValue2_" + <%=i%>).value, "dd/MM/yyyy");
								if ((date2 - date1)/1000/60/60/24 > <%=difference%>)
								{
									alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.difference.date" arg0="<%=difference%>"/>");
									return false;
								}
							<%
							}
							%>
						}
						<%
						if (min != null)
						{
						%>
							if (compareDates("<%=min%>", "dd/MM/yyyy", document.getElementById("parametersValue1_" + <%=i%>).value, "dd/MM/yyyy") == 1)
							{
								alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.min" arg0="<%=min%>"/>");
								return false;
							}
						<%}%>
						<%
						if (max != null)
						{
						%>
							if (compareDates(document.getElementById("parametersValue1_" + <%=i%>).value, "dd/MM/yyyy", "<%=max%>", "dd/MM/yyyy") == 1)
							{
								alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.max" arg0="<%=max%>"/>");
								var d = new Date();
								return false;
							}
						<%}%>
					}
					<%
				}
				if (type != null && (type.equals(String.valueOf(java.sql.Types.NUMERIC)) || type.equals(String.valueOf(java.sql.Types.DECIMAL))  || type.equals(String.valueOf(java.sql.Types.DOUBLE))))
				{
					%>
					if (document.getElementById("parametersEnabled" + <%=i%>) == null || document.getElementById("parametersEnabled" + <%=i%>).checked == true)
					{
						if (document.getElementById("parametersValue1_" + <%=i%>).value == "")
						{
							alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.val1"/>");
							return false;
						}
						select = document.getElementById("parametersOperator" + <%=i%>);
						if (select.options[select.selectedIndex].value == "<%=SIIVConstants.OPERATOR_BETWEEN%>")
						{
							if (document.getElementById("parametersValue2_" + <%=i%>).value == "")
							{
								alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.val2"/>");
								return false;
							}
							if (document.getElementById("parametersValue1_" + <%=i%>).value > document.getElementById("parametersValue2_" + <%=i%>).value)
							{
								alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.invert"/>");
								return false;
							}
							<%
							if (difference != null)
							{
							%>
								data1 = document.getElementById("parametersValue1_" + <%=i%>).value;
								data2 = document.getElementById("parametersValue2_" + <%=i%>).value;
								if ((date2 - date1) > <%=difference%>)
								{
									alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.difference.numeric" arg0="<%=difference%>"/>");
									return false;
								}
							<%
							}
							%>
						}
						<%
						if (min != null)
						{
						%>
							if (document.getElementById("parametersValue1_" + <%=i%>).value < <%=min%>)
							{
								alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.min" arg0="<%=min%>"/>");
								return false;
							}
						<%}%>
						<%
						if (max != null)
						{
						%>
							if (document.getElementById("parametersValue1_" + <%=i%>).value > <%=max%>)
							{
								alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.max" arg0="<%=max%>"/>");
								return false;
							}
						<%}%>
					}
					<%
				}
				if (type != null && (type.equals(String.valueOf(java.sql.Types.VARCHAR))))
				{
					%>
					if (document.getElementById("parametersEnabled" + <%=i%>) == null || document.getElementById("parametersEnabled" + <%=i%>).checked == true)
					{
						select = document.getElementById("parametersOperator" + <%=i%>);
						if (select.options[select.selectedIndex].value != "<%=SIIVConstants.OPERATOR_IS_NOT_NULL%>" &&
							select.options[select.selectedIndex].value != "<%=SIIVConstants.OPERATOR_IS_NULL%>" &&
							document.getElementById("parametersValue1_" + <%=i%>).value == "")
						{
							alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.val1"/>");
							return false;
						}
						<%
						if (min != null)
						{
						%>
							if (document.getElementById("parametersValue1_" + <%=i%>).value.length < <%=min%>)
							{
								alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.string.min" arg0="<%=min%>"/>");
								return false;
							}
						<%}%>
						<%
						if (max != null)
						{
						%>
							if (document.getElementById("parametersValue1_" + <%=i%>).value.length > <%=max%>)
							{
								alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.string.max" arg0="<%=max%>"/>");
								return false;
							}
						<%}%>
					}
					<%
				}

				String nomenclator_table = param.getPropertiesMap().getProperty("nomenclator_table");
				if ((nomenclator_table != null && multiple != null) || (type != null && Integer.valueOf(type).intValue() <= -300))
				{
					%>
					if (document.getElementById("parametersEnabled" + <%=i%>) == null || document.getElementById("parametersEnabled" + <%=i%>).checked == true)
					{

						j = 0;
						for (q = 0; q < document.getElementById("parametersValue1_" + <%=i%>).options.length; q++)
							if (document.getElementById("parametersValue1_" + <%=i%>).options[q].selected == true)
								j ++;
						if (j > <%=multiple%>)
						{
							alert("<%=label%> - <bean:message bundle="report" key="report.parameters.error.multiselect" arg0="<%=multiple%>"/>");
							return false;
						}
					}
					<%
				}
				i++;
			}
		}
	}
%>
}

function toggleSecondValue(id)
{
	var select = document.getElementById("parametersOperator" + id);
	var value1 = document.getElementById("parametersValue1_" + id);
	var value2 = document.getElementById("parametersValue2_" + id);
	var dateButton1 = document.getElementById("trigger_parametersValue1_" + id);
	var dateButton2 = document.getElementById("trigger_parametersValue2_" + id);
	if (select.options[select.selectedIndex].value == "<%=SIIVConstants.OPERATOR_BETWEEN%>")
	{
		value1.disabled = false;
		if (value2 != null)
			value2.disabled = false;
		if (dateButton1 != null)
			dateButton1.disabled = false;
		if (dateButton2 != null)
			dateButton2.disabled = false;
	}
	else
	{
		value1.disabled = false;
		if (value2 != null)
			value2.disabled = true;
		if (dateButton1 != null)
			dateButton1.disabled = false;
		if (dateButton2 != null)
			dateButton2.disabled = true;
	}
}

function updateParameter(id)
{
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

	if (checkbox == null || checkbox.checked == true)
	{
		isDisabled = false;
		document.getElementById("rowId" + id).style.backgroundColor = id % 2 == 0 ? "#F9F9F9" : "#FFFFFF";
	}
	else
	{
		isDisabled = true;
		document.getElementById("rowId" + id).style.backgroundColor = "#E7E7E7";
	}

	if (operator != null) operator.disabled = isDisabled;
	if (value1 != null) value1.disabled = isDisabled;
	if (value2 != null) value2.disabled = isDisabled;
	if (dateButton1 != null) dateButton1.disabled = isDisabled;
	if (dateButton2 != null) dateButton2.disabled = isDisabled;
	if (orderBy1 != null) orderBy1.disabled = isDisabled;
	if (orderBy2 != null) orderBy2.disabled = isDisabled;
	if (selComp != null) selComp.disabled = isDisabled;
	if (selCompVis != null) selCompVis.disabled = isDisabled;
	if (scSearchButton != null) scSearchButton.disabled = isDisabled;
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
			<img border="0" style="cursor:pointer;" onClick="printContraposition();"
				 title='<bean:message bundle="report" key="report.label.print"/>' src="images/print_ro.gif"/>
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
<html:form action="/contraposition.do" method="get"  onsubmit="return onSubmit();">
<table width="100%" border="0" cellpadding="0" cellspacing="3" class="report">
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

<%
	JRParameter[] jrParameters = (JRParameter[] ) request.getAttribute("JRParameters");
	ArrayList formParameters = (ArrayList) request.getAttribute("formParameters");

	int i = 0;
	for (int j = 0; j < jrParameters.length; j++)
	{
		JRParameter param = jrParameters[j];

		String visible = param.getPropertiesMap().getProperty("visible");
		if (!param.isSystemDefined()
				&& !param.getName().equalsIgnoreCase("SUBREPORT_DIR")
				&& !param.getName().equalsIgnoreCase("options")
				&& !param.getName().equalsIgnoreCase("order_by")
				&& !param.getName().equalsIgnoreCase("start_item")
				&& !param.getName().equalsIgnoreCase("end_item")
				&& (visible == null || !visible.equalsIgnoreCase("false")))
		{
			ReportParameter formParameter = null;
			if (formParameters != null && formParameters.size() > i)
				formParameter = (ReportParameter) formParameters.get(i);

			String type = param.getPropertiesMap().getProperty("type");
			%>
			<tr id="<%="rowId"+i%>" style="backgroundColor:<%=(i % 2 == 0 ? "#F9F9F9" : "#FFFFFF")%>;">
			<td align="left">
			<%

			String required = param.getPropertiesMap().getProperty("required");
			if (required != null && required.equalsIgnoreCase("true"))
			{
				%>	<input type="hidden" name="p[<%=i%>].enabled" value="true"/><%
			}
			else
			{
				%>	<input type="checkbox" name="p[<%=i%>].enabled" id="<%= "parametersEnabled" + i %>" value="true" onclick="javascript:updateParameter(<%=i%>)" <%=(formParameter != null && formParameter.getEnabled()?"CHECKED":"")%>><%
			}

			%>
			</td>
			<td align="left">
				<%=param.getDescription() != null && !param.getDescription().equals("") ? param.getDescription() : param.getName()%>
			</td>
    		<td align="center">
			<%
			String tooltip = param.getPropertiesMap().getProperty("tooltip");
			String operators = param.getPropertiesMap().getProperty("operators");
			String min = param.getPropertiesMap().getProperty("min");
			String max = param.getPropertiesMap().getProperty("max");
			String difference = param.getPropertiesMap().getProperty("difference");
			String value1 = param.getPropertiesMap().getProperty("default");
			if (value1 != null && value1.equalsIgnoreCase("sysdate"))
				value1 = ThreadSafeSDFs.getMsdf().format(Calendar.getInstance().getTime());
			if (value1 == null)
				value1 = "";
			if (formParameter != null && formParameter.getValue1() != null && formParameter.getValue1().length() > 0)
				value1 = formParameter.getValue1();
			String value2 = "";
			if (formParameter != null && formParameter.getValue2() != null && formParameter.getValue2().length() > 0)
				value2 = formParameter.getValue2();

			if (type != null && (type.equals(String.valueOf(java.sql.Types.DATE)) || type.equals(String.valueOf(java.sql.Types.TIMESTAMP))))
			{
				if (min != null && min.indexOf("sysdate") > -1)
				{
					Calendar c = Calendar.getInstance();
					c.add(Calendar.DAY_OF_MONTH, Integer.valueOf(min.substring(7)).intValue());
					min = ThreadSafeSDFs.getMsdf().format(c.getTime());
				}
				if (max != null && max.indexOf("sysdate") > -1)
				{
					Calendar c = Calendar.getInstance();
					c.add(Calendar.DAY_OF_MONTH, Integer.valueOf(max.substring(7)).intValue());
					max = ThreadSafeSDFs.getMsdf().format(c.getTime());
				}

				%><select align="absmiddle" name="p[<%=i%>].operator" id="<%= "parametersOperator" + i%>" class="selectboxTag" onchange="javascript:toggleSecondValue(<%=i%>)"><%
				if (operators == null) operators = "0;1;2;3;4;5;";
				if (operators.indexOf("0;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_EQUAL_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_EQUAL_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
            		</option><%
				}
				if (operators.indexOf("1;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_GREATER_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_GREATER_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.greater"/>
            		</option><%
				}
				if (operators.indexOf("2;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_LESS_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_LESS_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.less"/>
            		</option><%
				}
				if (operators.indexOf("3;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_GREATER_OR_EQUAL_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_GREATER_OR_EQUAL_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.greaterOrEqual"/>
            		</option><%
				}
				if (operators.indexOf("4;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_LESS_OR_EQUAL_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_LESS_OR_EQUAL_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.lessOrEqual"/>
            		</option><%
				}
				if (operators.indexOf("5;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_BETWEEN_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_BETWEEN_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.between"/>
            		</option><%
				}
				%></select>
				</td>
				<td align="left">
					<input type="text" name="p[<%=i%>].value1" value="<%=value1%>" id="<%= "parametersValue1_" + i%>" class="field_input">
					<input align="absmiddle" type="image" src="images/cal.gif" id="<%= "trigger_parametersValue1_" + i%>"/>
					<script type="text/javascript">
						Calendar.setup(
						{
							inputField  : "p[<%=i%>].value1",// ID of the input field
							ifFormat    : "%d/%m/%Y",    // the date format
							button      : "<%= "trigger_parametersValue1_" + i%>"// ID of the button
						}
								);
					</script>
					<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="report" key="report.parameters.label.tooltip.date"/>
<%if (min != null){%><bean:message bundle="report" key="report.parameters.label.tooltip.date.min" arg0="<%=min%>"/><%}%>
<%if (max != null){%><bean:message bundle="report" key="report.parameters.label.tooltip.date.max" arg0="<%=max%>"/><%}%>
<%if (difference != null){%><bean:message bundle="report" key="report.parameters.label.tooltip.date.difference.date" arg0="<%=difference%>"/><%}%>
<%if (tooltip != null){%><bean:message bundle="report" key="report.parameters.label.tooltip" arg0="<%=tooltip%>"/><%}%>"/>
				</td>
				<td align="left">
				<%
					if (operators.indexOf("5;") > -1)
					{
				%>
					<input type="text" name="p[<%=i%>].value2" value="<%=value2%>" id="<%= "parametersValue2_" + i%>" class="field_input">
					<input align="absmiddle" type="image" src="images/cal.gif" id="<%= "trigger_parametersValue2_" + i%>"/>
					<script type="text/javascript">
						Calendar.setup(
						{
							inputField  : "p[<%=i%>].value2",// ID of the input field
							ifFormat    : "%d/%m/%Y",    // the date format
							button      : "<%= "trigger_parametersValue2_" + i%>"// ID of the button
						}
								);
					</script>
				<%
					}
			}
			if (type != null && (type.equals(String.valueOf(java.sql.Types.NUMERIC)) || type.equals(String.valueOf(java.sql.Types.DECIMAL))))
			{
			    %><select align="absmiddle" name="p[<%=i%>].operator" id="<%= "parametersOperator" + i%>" class="selectboxTag" onchange="javascript:toggleSecondValue(<%=i%>)"><%
				if (operators == null) operators = "0;1;2;3;4;5;";
				if (operators.indexOf("0;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_EQUAL_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_EQUAL_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
            		</option><%
				}
				if (operators.indexOf("1;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_GREATER_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_GREATER_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.greater"/>
            		</option><%
				}
				if (operators.indexOf("2;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_LESS_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_LESS_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.less"/>
            		</option><%
				}
				if (operators.indexOf("3;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_GREATER_OR_EQUAL_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_GREATER_OR_EQUAL_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.greaterOrEqual"/>
            		</option><%
				}
				if (operators.indexOf("4;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_LESS_OR_EQUAL_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_LESS_OR_EQUAL_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.lessOrEqual"/>
            		</option><%
				}
				if (operators.indexOf("5;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_BETWEEN_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_BETWEEN_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
                		<bean:message bundle="report" key="report.parameters.operators.numberOrDate.between"/>
            		</option><%
				}
				%></select>
				</td>
				<td align="left">
					<input type="text" name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" value="<%=value1%>" class="field_input">
					<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="report" key="report.parameters.label.tooltip.numeric"/>
<%if (min != null){%><bean:message bundle="report" key="report.parameters.label.tooltip.numeric.min" arg0="<%=min%>"/><%}%>
<%if (max != null){%><bean:message bundle="report" key="report.parameters.label.tooltip.numeric.max" arg0="<%=max%>"/><%}%>
<%if (difference != null){%><bean:message bundle="report" key="report.parameters.label.tooltip.date.difference.numeric" arg0="<%=difference%>"/><%}%>
<%if (tooltip != null){%><bean:message bundle="report" key="report.parameters.label.tooltip" arg0="<%=tooltip%>"/><%}%>"/>
				</td>
				<td align="left">
				<%
					if (operators.indexOf("5;") > -1)
					{
				%>
						<input type="text" name="p[<%=i%>].value2" id="<%= "parametersValue2_" + i%>" value="<%=value2%>" class="field_input">
				<%
					}
			}
			if (type != null && (type.equals(String.valueOf(java.sql.Types.VARCHAR))))
			{
				%><select align="absmiddle" name="p[<%=i%>].operator" id="<%= "parametersOperator" + i%>" class="selectboxTag" onchange="javascript:toggleSecondValue(<%=i%>)"><%
				if (operators == null) operators = "6;7;8;0;9;";
				if (operators.indexOf("6;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_BEGIN_WITH_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_BEGIN_WITH_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
						<bean:message bundle="report" key="report.parameters.operators.text.beginWith"/>
					</option><%
				}
				if (operators.indexOf("7;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_END_WITH_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_END_WITH_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
						<bean:message bundle="report" key="report.parameters.operators.text.endWith"/>
					</option><%
				}
				if (operators.indexOf("8;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_CONTAINS_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_CONTAINS_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
						<bean:message bundle="report" key="report.parameters.operators.text.contains"/>
					</option><%
				}
				if (operators.indexOf("0;") > -1)
				{
					%><option value="<%=SIIVConstants.OPERATOR_EQUAL_STR%>" <%=(formParameter != null && SIIVConstants.OPERATOR_EQUAL_STR.equals(formParameter.getOperator())?"SELECTED":"")%>>
						<bean:message bundle="report" key="report.parameters.operators.text.equal"/>
					</option><%
				}
				%></select>
				</td>
				<td align="left" colspan="2">
					<input type="text" name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" value="<%=value1%>" class="field_input">
					<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="report" key="report.parameters.label.tooltip.string"/>
<%if (min != null){%><bean:message bundle="report" key="report.parameters.label.tooltip.string.min" arg0="<%=min%>"/><%}%>
<%if (max != null){%><bean:message bundle="report" key="report.parameters.label.tooltip.string.max" arg0="<%=max%>"/><%}%>
<%if (tooltip != null){%><bean:message bundle="report" key="report.parameters.label.tooltip" arg0="<%=tooltip%>"/><%}%>"/>
				<%
			}

			String nomenclator_table = param.getPropertiesMap().getProperty("nomenclator_table");
			Map nomenclator = null;
			if (nomenclator_table != null)
			{
				String nomenclator_id = param.getPropertiesMap().getProperty("nomenclator_id");
				String nomenclator_code = param.getPropertiesMap().getProperty("nomenclator_code");
				String nomenclator_descr = param.getPropertiesMap().getProperty("nomenclator_descr");

				nomenclator = DatabaseMetaData.getInstance().getNomenclator(nomenclator_table, nomenclator_id, nomenclator_code, nomenclator_descr);
			}

			if (type != null && Integer.valueOf(type).intValue() <= -300)
			{
				nomenclator = SIIVConstants.getNomenclator(Integer.valueOf(type).intValue());
			}

			if (nomenclator != null)
			{
				String multiple = param.getPropertiesMap().getProperty("multiple");
				String[] values = value1.split(";");
				if (formParameter != null && formParameter.getNom() != null)
					values = formParameter.getNom();

				%><bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
				</td>
				<td align="left" colspan="2">
					<select align="absmiddle" name="p[<%=i%>].nom" id="<%= "parametersValue1_" + i%>" <%=(multiple != null && Integer.valueOf(multiple).intValue() == 1?"":"multiple=\"true\"")%> <%=(multiple != null && Integer.valueOf(multiple).intValue() == 1?"":"height=\"5\"")%> class="selectboxTag">
						<%
							for (Iterator iterator = nomenclator.keySet().iterator(); iterator.hasNext();)
							{
								String key = (String) iterator.next();
								String value = (String) nomenclator.get(key);
						%>
								<option value="<%=key%>"
								<%
									for (int cnt = 0; cnt < values.length; cnt++)
										if (key.equalsIgnoreCase(values[cnt]))
											out.print("selected");
								%>>
									<%=value%>
								</option>
						<%
							}
						%>
					</select>
					<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="report" key="report.parameters.label.tooltip.nomenclator"/>
<%if (multiple != null){%><bean:message bundle="report" key="report.parameters.label.tooltip.nomenclator.multiple" arg0="<%=multiple%>"/><%}%>
<%if (tooltip != null){%><bean:message bundle="report" key="report.parameters.label.tooltip" arg0="<%=tooltip%>"/><%}%>"/>
				<%
			}

			if (type != null && (type.equals("-100")))
			{
				String[] values = new String[0];
				if (formParameter != null && formParameter.getNom() != null)
					values = formParameter.getNom();

				%><bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
				</td>
				<td align="left">
					<select name="p[<%=i%>].nom" id="<%= "parametersValue2_" + i%>" multiple="true" style="visibility:hidden;width:1;height:1"></select>
					<select align="absmiddle" name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" class="selectboxTag" onchange="<%= "clearSelects(" + i + ")"%>">
						<option value="hs2" <%=(formParameter != null && "hs2".equals(value1)?"SELECTED":"")%>>
							Nomenclator 2 cifre
						</option>
						<option value="hs4" <%=(formParameter != null && "hs4".equals(value1)?"SELECTED":"")%>>
							Nomenclator 4 cifre
						</option>
						<option value="hs6" <%=(formParameter != null && "hs6".equals(value1)?"SELECTED":"")%>>
							Nomenclator 6 cifre
						</option>
						<option value="hs8" <%=(formParameter != null && "hs8".equals(value1)?"SELECTED":"")%>>
							Nomenclator 8 cifre
						</option>
					</select>
				</td>
				<td align="left">
					<selection:selectionComponent name="<%="selComp"+i%>" detailsFieldName="dsc" idTableName="<%="getId("+i+")"%>" multiple="false">
						<selection:genericSelection searchCaseId="<%="getCase("+i+")"%>" showCodeInsert="true" knownFieldName="cod" styleClass="field_input_small">
						</selection:genericSelection>
					</selection:selectionComponent>

					<script>
						<%
							for (int cnt = 0; cnt < values.length; cnt++)
							{
						%>
								document.getElementById("<%="selComp"+i%>").value = "<%=values[cnt]%>";
								document.getElementById("<%="textselComp"+i+"cod"%>").value = "<%=values[cnt]%>";
						<%
							}
						%>
					</script>
				<%
			}
			if (type != null && (type.equals("-101")))
			{
				String[] values = new String[0];
				if (formParameter != null && formParameter.getNom() != null)
					values = formParameter.getNom();

				%><bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
				</td>
				<td align="left" colspan="2">
					<select name="p[<%=i%>].nom" id="<%= "parametersValue2_" + i%>" multiple="true" style="visibility:hidden;width:1;height:1"></select>
					<selection:selectionComponent name="<%="selComp"+i%>" detailsFieldName="dsc" idTableName="uncpptab.cpp_cod" multiple="false">
						<selection:genericSelection searchCaseId="uncpptabA" showCodeInsert="true" knownFieldName="cod" styleClass="field_input_small">
						</selection:genericSelection>
					</selection:selectionComponent>
					<select name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" style="visibility:hidden;width:1;height:1"></select>
					<script>
						<%
							for (int cnt = 0; cnt < values.length; cnt++)
							{
						%>
								document.getElementById("<%="selComp"+i%>").value = "<%=values[cnt]%>";
								document.getElementById("<%="textselComp"+i+"cod"%>").value = "<%=values[cnt]%>";
						<%
							}
						%>
					</script>
				<%
			}
			if (type != null && (type.equals("-102")))
			{
				String[] values = new String[0];
				if (formParameter != null && formParameter.getNom() != null)
					values = formParameter.getNom();

				%><bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
				</td>
				<td align="left" colspan="2">
					<select name="p[<%=i%>].nom" id="<%= "parametersValue2_" + i%>" multiple="true" style="visibility:hidden;width:1;height:1"></select>
					<selection:selectionComponent name="<%="selComp"+i%>" detailsFieldName="dsc" idTableName="uncpptab.cpp_cod" multiple="false">
						<selection:genericSelection searchCaseId="uncpptabB" showCodeInsert="true" knownFieldName="cod" styleClass="field_input_small">
						</selection:genericSelection>
					</selection:selectionComponent>
					<select name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" style="visibility:hidden;width:1;height:1"></select>
					<script>
						<%
							for (int cnt = 0; cnt < values.length; cnt++)
							{
						%>
								document.getElementById("<%="selComp"+i%>").value = "<%=values[cnt]%>";
								document.getElementById("<%="textselComp"+i+"cod"%>").value = "<%=values[cnt]%>";
						<%
							}
						%>
					</script>
				<%
			}
			if (type != null && (type.equals("-103")))
			{
				String[] values = new String[0];
				if (formParameter != null && formParameter.getNom() != null)
					values = formParameter.getNom();

				%><bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
				</td>
				<td align="left" colspan="2">
					<select name="p[<%=i%>].nom" id="<%= "parametersValue2_" + i%>" multiple="true" style="visibility:hidden;width:1;height:1"></select>
					<selection:selectionComponent name="<%="selComp"+i%>" detailsFieldName="dsc" idTableName="uncp3tab.cp3_cod" multiple="false">
						<selection:genericSelection searchCaseId="uncp3tab" showCodeInsert="true" knownFieldName="cod" styleClass="field_input_small">
						</selection:genericSelection>
					</selection:selectionComponent>
					<select name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" style="visibility:hidden;width:1;height:1"></select>
					<script>
						<%
							for (int cnt = 0; cnt < values.length; cnt++)
							{
						%>
								document.getElementById("<%="selComp"+i%>").value = "<%=values[cnt]%>";
								document.getElementById("<%="textselComp"+i+"cod"%>").value = "<%=values[cnt]%>";
						<%
							}
						%>
					</script>
				<%
			}
			if (type != null && (type.equals("-104")))
			{
				String[] values = new String[0];
				if (formParameter != null && formParameter.getNom() != null)
					values = formParameter.getNom();

				%><bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
				</td>
				<td align="left" colspan="2">
					<select name="p[<%=i%>].nom" id="<%= "parametersValue2_" + i%>" multiple="true" style="visibility:hidden;width:1;height:1"></select>
					<selection:selectionComponent name="<%="selComp"+i%>" detailsFieldName="dsc" idTableName="uncuotab.cuo_cod" multiple="false">
						<selection:genericSelection searchCaseId="uncuotab" showCodeInsert="true" knownFieldName="cod" styleClass="field_input_small">
						</selection:genericSelection>
					</selection:selectionComponent>
					<select name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" style="visibility:hidden;width:1;height:1"></select>
					<script>
						<%
							for (int cnt = 0; cnt < values.length; cnt++)
							{
						%>
								document.getElementById("<%="selComp"+i%>").value = "<%=values[cnt]%>";
								document.getElementById("<%="textselComp"+i+"cod"%>").value = "<%=values[cnt]%>";
						<%
							}
						%>
					</script>
				<%
			}
			if (type != null && (type.equals("-105")))
			{
				String[] values = new String[0];
				if (formParameter != null && formParameter.getNom() != null)
					values = formParameter.getNom();

				%><bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
				</td>
				<td align="left" colspan="2">
					<select name="p[<%=i%>].nom" id="<%= "parametersValue2_" + i%>" multiple="true" style="visibility:hidden;width:1;height:1"></select>
					<selection:selectionComponent name="<%="selComp"+i%>" detailsFieldName="dsc" idTableName="nom_country.country_alpha_2" multiple="false">
						<selection:genericSelection searchCaseId="nom_countryA2" showCodeInsert="true" knownFieldName="cod" styleClass="field_input_small">
						</selection:genericSelection>
					</selection:selectionComponent>
					<select name="p[<%=i%>].value1" id="<%= "parametersValue1_" + i%>" style="visibility:hidden;width:1;height:1"></select>

					<script>
						<%
							for (int cnt = 0; cnt < values.length; cnt++)
							{
						%>
								document.getElementById("<%="selComp"+i%>").value = "<%=values[cnt]%>";
								document.getElementById("<%="textselComp"+i+"cod"%>").value = "<%=values[cnt]%>";
						<%
							}
						%>
					</script>
				<%
			}

			%></td>
			</tr>
			<script>
				updateParameter(<%=i%>);
			</script><%
			i++;
		}
		else
			if (param.getName().equalsIgnoreCase("options"))
			{
				String order = param.getPropertiesMap().getProperty("order");
				String order_labels = param.getPropertiesMap().getProperty("order_labels");
				if (order != null)
				{
					String order1 = (String) request.getAttribute("order1");
					String order2 = (String) request.getAttribute("order2");

					String[] columns = order.split(";");
					String[] labels = order_labels != null ? order_labels.split(";") : null;
					if (columns.length > 0)
					{
						%>
							<tr>
							<td align="left"></td>
							<td align="left">
								<bean:message bundle="report" key="report.parameters.label.order"/>
							</td>
							<td align="center">
								<bean:message bundle="report" key="report.parameters.operators.numberOrDate.equal"/>
							</td>
							<td align="left" colspan="2">
								<select align="absmiddle" name="order1" id="order1" class="selectboxTag">
									<%
										for (int w = 0; w < columns.length; w ++)
										{
											%>
												<option value="<%=columns[w]%>" <%=(order1 != null && columns[w].equals(order1)?"SELECTED":"")%>>
													<%=labels != null && w <= labels.length  - 1 ? labels[w] : columns[w]%>
												</option>
										    <%
										}
									%>
								</select>
								&nbsp;
								<select align="absmiddle" name="order2" id="order2" class="selectboxTag">
									<option value="<%=SIIVConstants.SORT_ORDER_ASCENDING_STR%>" <%=(order2 != null && SIIVConstants.SORT_ORDER_ASCENDING_STR.equals(order2)?"SELECTED":"")%>>
										<bean:message bundle="report" key="report.parameters.operators.text.Asc"/>
									</option>
									<option value="<%=SIIVConstants.SORT_ORDER_DESCENDING_STR%>" <%=(order2 != null && SIIVConstants.SORT_ORDER_DESCENDING_STR.equals(order2)?"SELECTED":"")%>>
										<bean:message bundle="report" key="report.parameters.operators.text.Desc"/>
									</option>
								</select>
							</td>
							</tr>
						<%
					}
				}
			}
	}
%>

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
        <html:hidden property="method" value="showContraposition"/>
		<html:hidden property="print" value="false"/>
	</td>
</tr>

</table>

<logic:notEmpty name="http_report_content">
	<pagination:pager list="<%=SIIVConstants.TBL_CONTRAPOSITION_KEY_FORM%>" bundle="app" pagesize="50" method="showContraposition" requestURI="contrapositions/contraposition.do"/>
	<table width="100%" border="0" cellpadding="0" cellspacing="1">
	<tr>
		<td valign="top" align="center">
			<bean:write name="http_report_content" filter="false"/>
		</td>
	</tr>
	</table>
</logic:notEmpty>
</html:form>

</div>

