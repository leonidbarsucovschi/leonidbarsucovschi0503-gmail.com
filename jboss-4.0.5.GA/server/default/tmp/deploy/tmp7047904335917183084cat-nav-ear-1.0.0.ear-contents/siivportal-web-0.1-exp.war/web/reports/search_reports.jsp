<%--
  Created by IntelliJ IDEA.
  User: Sandu Mihai
  Date: 15-Jun-2007
  Time: 12:40:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<logic:equal name="viewObject" property="search" value="<%=String.valueOf(1)%>">
    <div id="search" class="show">
</logic:equal>

<logic:notEqual name="viewObject" property="search" value="<%=String.valueOf(1)%>">
    <div id="search" class="noshow">
</logic:notEqual>

<html:form action="/report.do" styleId="searchForm">
    <p width="100%" class="button-row" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');"
             title='<bean:message bundle="report" key="report.label.closeWindow"/>' name="closeEditFrame"
             id="closeEdit" src="images/close_off.gif"/>
    </p>

    <table width="100%" border="0">
    <!-- Nume raport -->
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="report" key="report.prompt.name"/>
            :
        </td>
        <td class="text" align="left">
            <html:text styleClass="field_input" property="values.name" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="report" key="report.prompt.name.tooltip"/>"/>
        </td>
    </tr>

    <!-- Descriere raport -->
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="report" key="report.prompt.description"/>
            :
        </td>
        <td class="text" align="left">
            <html:text styleClass="field_input" property="values.description" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="report" key="report.prompt.description.tooltip"/>"/>
        </td>
    </tr>

    <!-- Data crearii raportului -->
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="report" key="report.prompt.creation_date"/>
            :
        </td>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="report" key="report.prompt.date.from"/>
        </td>
        <td class="text" align="left">
            <html:text styleClass="field_input" styleId="creation_dateFromString"
                       property="values.creation_dateFromString"/>
            <input align="absmiddle" type="image" src="images/cal.gif" id="trigger_creation_dateFromString"/>
            <script type="text/javascript">
                Calendar.setup(
                {
                    inputField  : "creation_dateFromString",// ID of the input field
                    ifFormat    : "%d/%m/%Y",    // the date format
                    button      : "trigger_creation_dateFromString"// ID of the button
                }
                        );
            </script>
            <bean:message bundle="report" key="report.label.date_format"/>
        </td>
    </tr>
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="report" key="report.prompt.date.to"/>
        </td>
        <td class="text" align="left">
            <html:text styleClass="field_input" styleId="creation_dateToString"
                       property="values.creation_dateToString"/>
            <input align="absmiddle" type="image" src="images/cal.gif" id="trigger_creation_dateToString"/>
            <script type="text/javascript">
                Calendar.setup(
                {
                    inputField  : "creation_dateToString",// ID of the input field
                    ifFormat    : "%d/%m/%Y",    // the date format
                    button      : "trigger_creation_dateToString"// ID of the button
                }
                        );
            </script>
            <bean:message bundle="report" key="report.label.date_format"/>
        </td>
    </tr>

    <!-- Data ultimei editari a raportului -->
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="report" key="report.prompt.last_edit_date"/>
            :
        </td>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="report" key="report.prompt.date.from"/>
        </td>
        <td class="text" align="left">
            <html:text styleClass="field_input" styleId="last_edit_dateFromString" property="values.last_edit_dateFromString"/>
            <input align="absmiddle" type="image" src="images/cal.gif" id="trigger_last_edit_dateFromString"/>
            <script type="text/javascript">
                Calendar.setup(
                {
                    inputField  : "last_edit_dateFromString",// ID of the input field
                    ifFormat    : "%d/%m/%Y",    // the date format
                    button      : "trigger_last_edit_dateFromString"// ID of the button
                }
                        );
            </script>
            <bean:message bundle="report" key="report.label.date_format"/>
        </td>
    </tr>
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="report" key="report.prompt.date.to"/>
        </td>
        <td class="text" align="left">
            <html:text styleClass="field_input" styleId="last_edit_dateToString" property="values.last_edit_dateToString"/>
            <input align="absmiddle" type="image" src="images/cal.gif" id="trigger_last_edit_dateToString"/>
            <script type="text/javascript">
                Calendar.setup(
                {
                    inputField  : "last_edit_dateToString",// ID of the input field
                    ifFormat    : "%d/%m/%Y",    // the date format
                    button      : "trigger_last_edit_dateToString"// ID of the button
                }
                        );
            </script>
            <bean:message bundle="report" key="report.label.date_format"/>
        </td>
    </tr>

    <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>"/>

    <tr>
        <td colspan="2" class="button-row" align="center">
            <input type="hidden" name="method" value="search"/>
            <input type="hidden" name="search" value="1"/>
            <html:submit styleClass="button">
                <bean:message bundle="report" key="report.button.search"/>
            </html:submit>
        </td>
    </tr>
</html:form>
</table>