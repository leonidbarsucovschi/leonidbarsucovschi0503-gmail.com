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
			<bean:message bundle="fileoperation" key="fileoperation.admin.title.delete"/>
			<!-- END Sectiune de Titlu pagina. -->
        </td>
        <td valign="top" class="bottom" align="right">
            <img border="0" style="cursor:pointer;" onClick="javascript:closeWindow();"
                 title='<bean:message bundle="fileoperation" key="fileoperation.label.closeWindow"/>' name="closeEditFrame"
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

    <!-- START Sectiune de FORM. -->
	<!-- Campul fo_file_name -->
	<tr>
		<td class="label" width="25%" align="right">
			<bean:message bundle="fileoperation" key="fileoperation.prompt.fo_file_name"/>
			:
		</td>
		<td class="field_text" width="25%" align="left">
			<bean:write property="fo_file_name" name="<%=Constants.TBL_FILEOPERATION_KEY%>"/>
		</td>
	</tr>

	<!-- Campul fo_country -->
	<tr>
		<td class="label" width="25%" align="right">
			<bean:message bundle="fileoperation" key="fileoperation.prompt.fo_country"/>
			:
		</td>
		<td class="field_text" width="25%" align="left">
			<bean:write property="jsp_country" name="<%=Constants.TBL_FILEOPERATION_KEY%>"/>
		</td>
	</tr>

	<!-- Campul data fo_period_type -->
	<tr>
		<td class="label" width="25%" align="right">
			<bean:message bundle="fileoperation" key="fileoperation.prompt.fo_period_type"/>
			:
		</td>
		<td class="field_text" width="25%" align="left">
			<logic:equal property="fo_period_type" name="<%=Constants.TBL_FILEOPERATION_KEY%>" value="0">
				<bean:message bundle="fileoperation" key="fileoperation.label.record.monthly"/>
			</logic:equal>
			<logic:equal property="fo_period_type" name="<%=Constants.TBL_FILEOPERATION_KEY%>" value="1">
				<bean:message bundle="fileoperation" key="fileoperation.label.record.quarterly"/>
			</logic:equal>
		</td>
	</tr>

	<!-- Campul data fo_type -->
	<tr>
		<td class="label" width="25%" align="right">
			<bean:message bundle="fileoperation" key="fileoperation.prompt.fo_type"/>
			:
		</td>
		<td class="field_text" width="25%" align="left">
			<logic:equal property="fo_type" name="<%=Constants.TBL_FILEOPERATION_KEY%>" value="0">
				<bean:message bundle="fileoperation" key="fileoperation.label.record.import"/>
			</logic:equal>
			<logic:equal property="fo_type" name="<%=Constants.TBL_FILEOPERATION_KEY%>" value="1">
				<bean:message bundle="fileoperation" key="fileoperation.label.record.export"/>
			</logic:equal>
			<logic:equal property="fo_type" name="<%=Constants.TBL_FILEOPERATION_KEY%>" value="2">
				<bean:message bundle="fileoperation" key="fileoperation.label.record.mixed"/>
			</logic:equal>
		</td>
	</tr>

	<!-- Campul data fo_starting_date -->
	<tr>
		<td class="label" width="25%" align="right">
			<bean:message bundle="fileoperation" key="fileoperation.prompt.fo_starting_date"/>
			:
		</td>
		<td class="field_text" width="25%" align="left">
			<logic:notEmpty property="fo_starting_date" name="<%=Constants.TBL_FILEOPERATION_KEY%>">
				<bean:define id="startingDate" property="fo_starting_date" name="<%=Constants.TBL_FILEOPERATION_KEY%>"
							 type="java.util.Date"/>
				<%=ThreadSafeSDFs.getSdf().format(startingDate)%>
			</logic:notEmpty>
		</td>
	</tr>

	<!-- Campul data fo_ending_date -->
	<tr>
		<td class="label" width="25%" align="right">
			<bean:message bundle="fileoperation" key="fileoperation.prompt.fo_ending_date"/>
			:
		</td>
		<td class="field_text" width="25%" align="left">
			<logic:notEmpty property="fo_ending_date" name="<%=Constants.TBL_FILEOPERATION_KEY%>">
				<bean:define id="endingDate" property="fo_ending_date" name="<%=Constants.TBL_FILEOPERATION_KEY%>"
							 type="java.util.Date"/>
				<%=ThreadSafeSDFs.getSdf().format(endingDate)%>
			</logic:notEmpty>
		</td>
	</tr>

	<!-- Campul data crearii -->
	<tr>
		<td class="label" width="25%" align="right">
			<bean:message bundle="fileoperation" key="fileoperation.prompt.fo_upload_date"/>
			:
		</td>
		<td class="field_text" width="25%" align="left">
			<logic:notEmpty property="fo_upload_date" name="<%=Constants.TBL_FILEOPERATION_KEY%>">
				<bean:define id="uploadDate" property="fo_upload_date" name="<%=Constants.TBL_FILEOPERATION_KEY%>"
							 type="java.util.Date"/>
				<%=ThreadSafeSDFs.getSdf().format(uploadDate)%>
			</logic:notEmpty>
		</td>
	</tr>


	<tr>
        <td colspan="2" height="10"></td>
    </tr>

    <html:form action="/fileoperation.do">
        <input type="hidden" name="values.fo_id"
               value="<bean:write property="fo_id" name="<%=Constants.TBL_FILEOPERATION_KEY%>"/>">
        <!-- START Sectiune de BUTOANE. -->
        <!-- buton modificare. -->
        <tr>
            <td colspan="2" class="button-row" align="center">
                <html:submit styleClass="btn-generic">
					<bean:message bundle="fileoperation" key="fileoperation.button.delete"/>
				</html:submit>
                <html:hidden property="method" value="delete"/>
            </td>
        </tr>
        <!-- END Sectiune de BUTOANE. -->
    </html:form>
</table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="contrapositions/fileoperation.do">
    <html:hidden property="method" value="list"/>
</form>
<script>
    function closeWindow() {
        document.closeForm.submit();
    }
</script>
