<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page import="ro.uti.settings.util.ThreadSafeSDFs" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
</script>

<div class="table">
    <!-- Titlul ferestrei -->
    <table width="100%" border="0" cellpadding="0" cellspacing="1">
        <tr>
            <td width="100%" valign="top" align="left" class="page-subtitle">
                <bean:message bundle="company" key="company.admin.title.view"/>
            </td>
            <td class="bottom" align="right">
                <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();"
                     title='<bean:message bundle="company" key="company.label.closeWindow"/>'
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
                <bean:write property="idno" name="<%=Constants.TBL_COMPANY_KEY%>"/>
            </td>
        </tr>

        <!-- Campul name -->
        <tr>
            <td class="label" width="25%" align="right">
                <bean:message bundle="company" key="company.prompt.name"/>
                :
            </td>
            <td class="field_text" width="25%" align="left">
                <bean:write property="name" name="<%=Constants.TBL_COMPANY_KEY%>"/>
            </td>
        </tr>

        <!-- Campul address -->
        <tr>
            <td class="label" width="25%" align="right">
                <bean:message bundle="company" key="company.prompt.address"/>
                :
            </td>
            <td class="field_text" width="25%" align="left">
                <bean:write property="address" filter="false" name="<%=Constants.TBL_COMPANY_KEY%>"/>
            </td>
        </tr>

        <!-- Campul items -->
        <tr>
            <td class="label" width="25%" align="right">
                <bean:message bundle="company" key="company.prompt.items"/>
                :
            </td>
            <td class="field_text" width="25%" align="left">
				<bean:write property="items" filter="false" name="<%=Constants.TBL_COMPANY_KEY%>"/>
            </td>
        </tr>

        <!-- Campul periods -->
        <tr>
            <td class="label" width="25%" align="right">
                <bean:message bundle="company" key="company.prompt.periods"/>
                :
            </td>
            <td class="field_text" width="25%" align="left">
				<bean:write property="periods" filter="false" name="<%=Constants.TBL_COMPANY_KEY%>"/>
            </td>
        </tr>

        <!-- Campul comments -->
        <tr>
            <td class="label" width="25%" align="right">
                <bean:message bundle="company" key="company.prompt.comments"/>
                :
            </td>
            <td class="field_text" width="25%" align="left">
				<bean:write property="comments" filter="false" name="<%=Constants.TBL_COMPANY_KEY%>"/>
            </td>
        </tr>

		<tr>
            <td colspan="2" height="10"></td>
        </tr>
    </table>
</div>
