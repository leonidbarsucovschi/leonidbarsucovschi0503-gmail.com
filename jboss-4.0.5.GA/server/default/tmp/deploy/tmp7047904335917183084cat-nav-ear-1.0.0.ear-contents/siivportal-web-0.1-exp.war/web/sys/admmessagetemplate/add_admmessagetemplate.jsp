<%@ page import="java.util.*,ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm" method="post" action="sys/admmessagetemplate.do"><html:hidden property="method"
                                                                                     value="list"/></form>
<script>
    function closeWindow() {
        document.closeForm.submit();
    }
</script>

<div class="table">
    <table width="100%" border="0" cellpadding="0" cellspacing="1">
         <tr class="page-title-header">
            <td width="100%" valign="top" class="bottom" align="left">&nbsp;
                <!-- Titlul ferestrei pentru modificare. -->
                <logic:empty name="<%=Constants.ADM_MESSAGE_TEMPLATE_KEY%>" property="values.primaryKey"
                             scope="request">
                    <bean:message bundle="admmessagetemplate" key="adm_message_template.title.add"/>
                </logic:empty>
                <!-- Titlul ferestrei pentru adaugare. -->
                <logic:notEmpty name="<%=Constants.ADM_MESSAGE_TEMPLATE_KEY%>" property="values.primaryKey"
                                scope="request">
                    <bean:message bundle="admmessagetemplate" key="adm_message_template.title.save"/>
                </logic:notEmpty>
                <!-- END Sectiune de Titlu pagina. -->
            </td>
            <td class="bottom" align="right">
                <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();"
                     title='<bean:message bundle="admmessagetemplate" key="adm_message_template.label.closeWindow"/>'
                     src="images/close_off.gif"/>
            </td>
        </tr></table>
    <table width="100%" border="0" cellpadding="0" cellspacing="1" class="bottom"><logic:messagesPresent><tr>
        <td valign="top" colspan="2" class="errormsg" align="center"><ul><html:messages id="error"><li><bean:write
                name="error"/></li></html:messages></ul></td>
    </tr></logic:messagesPresent><!-- START Sectiune de FORM. -->
        <html:form action="/admmessagetemplate.do" onsubmit="return validateForm_AdmMessageTemplateForm(this);">
            <html:hidden property="values.id_message_template"/>
            <html:hidden property="values.fk_limba"/>
            <html:hidden property="values.mkey"/>




            <!-- Cimpul 'message' field. -->
            <tr >
                <td valign="top" class="text-label-bkwhite" align="right"><bean:message bundle="admmessagetemplate"
                                                                              key="adm_message_template.prompt.message"/>
                    <font color="#336600">*</font> :
                </td>
                <td class="text" align="left">

                    <html:textarea rows="10" cols="50" errorStyleClass="errorfield" styleClass="inputtext"
                                   property="values.message"/>


                    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                         title="<bean:message bundle="admmessagetemplate" key="adm_message_template.label.tooltip.message"/>"/>
                </td>
            </tr>
            <!-- START Sectiune de BUTOANE. -->
            <logic:empty name="<%=Constants.ADM_MESSAGE_TEMPLATE_KEY%>" property="values.primaryKey" scope="request">
                <!-- Buton adugare. -->
                <tr>
                    <td colspan="2" class="button-row" align="center"><html:submit styleClass="button"><bean:message
                            bundle="admmessagetemplate" key="adm_message_template.button.add"/></html:submit>
                        <html:hidden property="method" value="add"/></td>
                </tr>
            </logic:empty>
            <logic:notEmpty name="<%=Constants.ADM_MESSAGE_TEMPLATE_KEY%>" property="values.primaryKey" scope="request">
                <!-- buton modificare. -->
                <tr>
                    <td colspan="2" class="button-row" align="center"><html:submit styleClass="button"><bean:message
                            bundle="admmessagetemplate" key="adm_message_template.button.save"/></html:submit>
                        <html:hidden property="method" value="update"/></td>
                </tr>
            </logic:notEmpty>
            <!-- END Sectiune de BUTOANE. -->
        </html:form>
        <!-- END Sectiune de FORM. -->
    </table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_AdmMessageTemplateForm"
                 dynamicJavascript="true"
                 staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>