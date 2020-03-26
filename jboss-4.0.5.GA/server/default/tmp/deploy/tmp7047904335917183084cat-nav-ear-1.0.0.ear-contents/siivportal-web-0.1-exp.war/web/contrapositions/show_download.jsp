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
			<bean:message bundle="fileexport" key="fileexport.admin.title.download"/>
			<!-- END Sectiune de Titlu pagina. -->
        </td>
        <td valign="top" class="bottom" align="right">
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

<html:form action="/fileexport.do">
	<table width="100%" border="0" cellpadding="1" align="center" cellspacing="1">
		<tr>
			<td colspan="2" height="10"></td>
		</tr>

		<!-- START Sectiune de FORM. -->
		<!-- Campul fo_country -->
		<tr>
			<td class="label" width="25%" align="right">
				<bean:message bundle="fileexport" key="fileexport.prompt.fo_country"/>
				:
			</td>
			<td class="field_text" width="25%" align="left">
				<select align="absmiddle" name="fo_country" id="fo_country" class="selectboxTag">
					<option value="031">Azerbaidjan</option>
					<option value="112">Bielorusia</option>
					<option value="398">Kazahstan</option>
					<option value="643">Rusia</option>
					<option value="804">Ucraina</option>
					<option value="860">Uzbekistan</option>
				</select>
			</td>
		</tr>

		<!-- Campul fo_type -->
		<tr>
			<td class="label" width="25%" align="right">
				<bean:message bundle="fileexport" key="fileexport.prompt.fo_type"/>
				:
			</td>
			<td class="field_text" width="25%" align="left">
				<select align="absmiddle" name="fo_type" id="fo_type" class="selectboxTag">
					<option value="IM"><bean:message bundle="fileexport" key="fileexport.label.record.import"/></option>
					<option value="EX"><bean:message bundle="fileexport" key="fileexport.label.record.export"/></option>
					<option value="MIXED"><bean:message bundle="fileexport" key="fileexport.label.record.mixed"/></option>
				</select>
			</td>
		</tr>

		<!-- Campul fo_length -->
		<tr>
			<td class="label" width="25%" align="right">
				<bean:message bundle="fileexport" key="fileexport.prompt.fo_length"/>
				:
			</td>
			<td class="field_text" width="25%" align="left">
				<select align="absmiddle" name="fo_length" id="fo_length" class="selectboxTag">
					<option value="4"><bean:message bundle="fileexport" key="fileexport.label.fo_length" arg0="4"/></option>
					<option value="6"><bean:message bundle="fileexport" key="fileexport.label.fo_length" arg0="6"/></option>
					<option value="8"><bean:message bundle="fileexport" key="fileexport.label.fo_length" arg0="8"/></option>
					<!--option value="9">bean:message bundle="fileexport" key="fileexport.label.fo_length" arg0="9"/></option-->
					<option value="10"><bean:message bundle="fileexport" key="fileexport.label.fo_length" arg0="10"/></option>
				</select>
			</td>
		</tr>

		<!-- Campul fo_period_type -->
		<tr>
			<td class="label" width="25%" align="right">
				<bean:message bundle="fileexport" key="fileexport.prompt.fo_period_type"/>
				:
			</td>
			<td class="field_text" width="25%" align="left">
				<select align="absmiddle" name="fo_period_type" id="fo_period_type" class="selectboxTag">
					<option value="2"><bean:message bundle="fileexport" key="fileexport.label.fo_period_type.quarterly"/></option>
					<option value="1"><bean:message bundle="fileexport" key="fileexport.label.fo_period_type.monthly"/></option>
				</select>
			</td>
		</tr>

		<!-- Campul fo_year -->
		<tr>
			<td class="label" width="25%" align="right">
				<bean:message bundle="fileexport" key="fileexport.prompt.fo_year"/>
				:
			</td>
			<td class="field_text" width="25%" align="left">
				<select align="absmiddle" name="fo_year" id="fo_year" class="selectboxTag">
					<option value="2004">2004</option>
					<option value="2005">2005</option>
					<option value="2006">2006</option>
					<option value="2007">2007</option>
					<option value="2008">2008</option>
					<option value="2009">2009</option>
					<option value="2010">2010</option>
					<option value="2011">2011</option>
					<option value="2012">2012</option>
					<option value="2013">2013</option>
					<option value="2014">2014</option>
					<option value="2015">2015</option>
					<option value="2016">2016</option>
				</select>
			</td>
		</tr>

		<!-- Campul fo_quarter -->
		<tr>
			<td class="label" width="25%" align="right">
				<bean:message bundle="fileexport" key="fileexport.prompt.fo_quarter"/>
				:
			</td>
			<td class="field_text" width="25%" align="left">
				<select align="absmiddle" name="fo_quarter" id="fo_quarter" class="selectboxTag">
					<option value="-1">-----</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
				</select>
			</td>
		</tr>

		<!-- Campul fo_month -->
		<tr>
			<td class="label" width="25%" align="right">
				<bean:message bundle="fileexport" key="fileexport.prompt.fo_month"/>
				:
			</td>
			<td class="field_text" width="25%" align="left">
				<select align="absmiddle" name="fo_month" id="fo_month" class="selectboxTag">
					<option value="-1">-----</option>
					<option value="01">1 - Ianuarie</option>
					<option value="02">2 - Februarie</option>
					<option value="03">3 - Martie</option>
					<option value="04">4 - Aprilie</option>
					<option value="05">5 - Mai</option>
					<option value="06">6 - Iunie</option>
					<option value="07">7 - Iulie</option>
					<option value="08">8 - August</option>
					<option value="09">9 - Septembrie</option>
					<option value="10">10 - Octombrie</option>
					<option value="11">11 - Noiembrie</option>
					<option value="12">12 - Decembrie</option>
				</select>
			</td>
		</tr>

		<!-- Campul fo_code -->
		<tr>
			<td class="label" width="25%" align="right">
				<bean:message bundle="fileexport" key="fileexport.prompt.fo_code"/>
				:
			</td>
			<td class="field_text" width="25%" align="left">
				<input type="text" name="fo_code" id="fo_code" class="field_input">
			</td>
		</tr>

		<tr>
			<td colspan="2" height="10"></td>
		</tr>

        <!-- START Sectiune de BUTOANE. -->
        <!-- buton modificare. -->
        <tr>
            <td colspan="2" class="button-row" align="center">
                <html:submit styleClass="btn-generic">
					<bean:message bundle="fileexport" key="fileexport.button.download"/>
				</html:submit>
                <html:hidden property="method" value="download"/>
            </td>
        </tr>
        <!-- END Sectiune de BUTOANE. -->
	</table>
</html:form>
</div>
<!-- END Sectiune de FORM. -->
