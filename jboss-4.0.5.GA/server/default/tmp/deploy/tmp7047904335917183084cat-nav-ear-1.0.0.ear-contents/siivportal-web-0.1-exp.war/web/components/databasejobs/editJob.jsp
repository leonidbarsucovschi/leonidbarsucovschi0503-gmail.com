<%@ page import="java.util.*,ro.uti.settings.util.Constants" %>
<%@ page import="ro.uti.waf.components.databasejobs.util.ConstantsJobImport"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm" method="post" action="components/databasejobs/jobimport.do">
    <html:hidden property="method" value="list"/>
</form>
<script>
    function closeWindow() {
        document.closeForm.submit();
    }
</script>

<div class="table">
    <table width="100%" border="0" cellpadding="0" cellspacing="1">
        <tr>
            <td width="100%" valign="top" class="bottom" align="left">&nbsp;
                <!-- Titlul ferestrei pentru modificare. -->

                <bean:message bundle="miscare" key="miscare.title.save"/>

                <!-- END Sectiune de Titlu pagina. -->
            </td>
            <td class="bottom" align="right">
                <img border="0" style="cursor:pointer" onClick="closeWindow();"
                     title='<bean:message bundle="jobimport" key="job_import.label.closeWindow"/>'
                     src="images/close_off.gif"/>
            </td>
        </tr>
    </table>
    <table width="100%" border="0" cellpadding="0" cellspacing="1" class="report"><logic:messagesPresent><tr>

        <td valign="top" colspan="2" class="errormsg" align="center">
            <ul>
                <html:messages id="error">
                    <li><bean:write name="error"/></li>
                </html:messages>
            </ul>
        </td>

    </tr>
    </logic:messagesPresent>
        <!-- START Sectiune de FORM. -->

        <html:form action="/jobimport.do" onsubmit="return validateForm_MiscareForm(this);">
            <html:hidden property="values.id_job_import"/><!-- Cimpul 'fk_escala' field. -->
            <tr>
                <td valign="top" class="textsmall" align="right"><bean:message bundle="jobimport" key="job_import.prompt.id_job_import"/>
                </td>
                <td class="text" align="left">
                    <bean:write name="<%=Constants.JOB_IMPORT_KEY%>" property="values.id_job_import"/>
                </td>
            </tr>
            <tr>
                <td valign="top" class="textsmall" align="right"><bean:message bundle="jobimport" key="job_import.prompt.job_description"/>
                </td>
                <td class="text" align="left">
                    <bean:write name="<%=Constants.JOB_IMPORT_KEY%>" property="values.job_description"/>
                </td>
            </tr>
            <tr>
                <td valign="top" class="textsmall" align="right"><bean:message bundle="jobimport" key="job_import.prompt.first_date"/>
                </td>
                <td class="text" align="left">
                    <bean:write name="<%=Constants.JOB_IMPORT_KEY%>" property="values.first_date"/>
                </td>
            </tr>
            <tr>
                <td valign="top" class="textsmall" align="right"><bean:message bundle="jobimport" key="job_import.prompt.last_date"/>
                </td>
                <td class="text" align="left">
                    <bean:write name="<%=Constants.JOB_IMPORT_KEY%>" property="values.last_date"/>
                </td>
            </tr>
            <!-- START Sectiune de BUTOANE. -->
             <tr>
                 <td>
                      <html:radio property="values.periodicity" value="0" /> Orar
                      <html:radio property="values.periodicity" value="1"/> Zilnic
                      <html:radio property="values.periodicity" value="2"/> Saptamanal
                      <html:radio property="values.periodicity" value="3"/> Lunar
                      <html:radio property="values.periodicity" value="4"/> Anual
                 </td>
             </tr>
            <%--<logic:equal value="<%=ConstantsJobImport.ORAR%>" property="values.periodicity" name="<%=Constants.JOB_IMPORT_KEY%>">--%>
            <logic:equal value="0" property="values.periodicity" name="<%=Constants.JOB_IMPORT_KEY%>">
            <div id ="div_Orar" >
                <tr>
                    <td>
                           <html:text property="values.minute"/>
                    </td>
                </tr>
                <tr>
                    <td>
                           <html:text property="values.hour"/>
                    </td>
                </tr>
            </div>
            </logic:equal>
            <%--<logic:equal value="<%=ConstantsJobImport.ZILNIC%>" property="values.periodicity" name="<%=Constants.JOB_IMPORT_KEY%>">--%>
            <logic:equal value="1" property="values.periodicity" name="<%=Constants.JOB_IMPORT_KEY%>">
            <div id ="div_Zilnic" >
                <tr>
                    <td>
                           <html:text property="values.minute"/>
                    </td>
                </tr>
                <tr>
                    <td>
                           <html:text property="values.hour"/>
                    </td>
                </tr>
            </div>
            </logic:equal>
            <logic:equal value="2" property="values.periodicity" name="<%=Constants.JOB_IMPORT_KEY%>">
            <%--<logic:equal value="<%=ConstantsJobImport.SAPTAMANAL%>" property="values.periodicity" name="<%=Constants.JOB_IMPORT_KEY%>">--%>
            <div id ="div_Saptamanal" >
                <tr>
                    <td>
                           <html:text property="values.minute"/>
                    </td>
                </tr>
                <tr>
                    <td>
                           <html:text property="values.hour"/>
                    </td>
                </tr>
                <tr>
                    <td>
                           <html:select property="values.day" name="<%=Constants.JOB_IMPORT_KEY%>">
                                      <html:options collection="weekDaysList" property="zi_indx"  labelProperty="zi_val"/>
                           </html:select>
                    </td>
                </tr>
            </div>
            </logic:equal>
            <tr>
                <td colspan="2" class="button-row" align="center"><html:submit styleClass="button">
                    <bean:message bundle="jobimport" key="job_import.button.save"/></html:submit>
                    <html:hidden property="method" value="update"/></td>
            </tr>

            <!-- END Sectiune de BUTOANE. -->
        </html:form>
        <!-- END Sectiune de FORM. -->
    </table>
</div>
<!-- Validare cimpuri forma. -->
<%--<html:javascript formName="form_JobImportForm" dynamicJavascript="true" staticJavascript="false"/>--%>
<!--<script language="Javascript1.1" src="staticJavascript.jsp" ></script>-->
