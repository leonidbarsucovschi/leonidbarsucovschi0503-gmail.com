<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page import="ro.uti.settings.util.ThreadSafeSDFs" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr>
        <td WIDTH="100%" valign="top" align="left" class="page-subtitle">
            <!-- Sectiune de Titlu pagina. -->
            <!-- Titlul ferestrei pentru stergere. -->
			<bean:message bundle="company" key="company.admin.title.delete"/>
			<!-- END Sectiune de Titlu pagina. -->
        </td>
        <td valign="top" class="bottom" align="right">
            <img border="0" style="cursor:pointer;" onClick="javascript:closeWindow();"
                 title='<bean:message bundle="company" key="company.label.closeWindow"/>' name="closeEditFrame"
                 id="closeEdit" src="images/close_off.gif"
                 onMouseOver="this.src='images/close_on.gif'" onmouseout="this.src='images/close_off.gif'"/>
        </td>
    </tr>
</table>
<!-- Sectiune de Afisare Erori. -->
<logic:messagesPresent>
    <table width="100%" border="0" cellpadding="1" align="center" cellspacing="1">
        <tr>
            <td valign="middle" nowrap="nowrap" colspan="2" align="center" class="msg_error">
                <html:errors/>
            </td>
        </tr>
    </table>
</logic:messagesPresent>
<table width="100%" border="0" cellpadding="1" align="center" cellspacing="1">
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

    <html:form action="/company.do">
        <input type="hidden" name="id"
               value="<bean:write property="id" name="<%=Constants.TBL_COMPANY_KEY%>"/>">
        <!-- START Sectiune de BUTOANE. -->
        <!-- buton modificare. -->
        <tr>
            <td colspan="2" class="button-row" align="center">
                <html:submit styleClass="btn-generic">
					<bean:message bundle="company" key="company.button.delete"/>
				</html:submit>
                <html:hidden property="method" value="delete"/>
            </td>
        </tr>
        <!-- END Sectiune de BUTOANE. -->
    </html:form>
</table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="contrapositions/company.do">
    <html:hidden property="method" value="list"/>
</form>
<script>
    function closeWindow() {
        document.closeForm.submit();
    }
</script>
