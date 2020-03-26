<!--
*
*
* @version
* @author
*/
-->
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">

    <table width="100%" border="0" cellpadding="0" cellspacing="1">
        <tr>
            <td width="100%" valign="top" class="bottom" align="left">
                <!-- Sectiune de Titlu pagina. -->
                <!-- Titlul ferestrei pentru stergere. -->
                <bean:message bundle="admmessagetemplate" key="adm_message_template.title.delete"/>
                <!-- END Sectiune de Titlu pagina. -->
            </td>
            <td valign="top" class="bottom" align="right">
                <img border="0" onMouseOver="swapImage('closeEditFrame','images/close_on.gif');" style="cursor:pointer"
                     onClick="javascript:closeWindow();"
                     title='<bean:message bundle="admmessagetemplate" key="adm_message_template.label.closeWindow"/>'
                     name="closeEditFrame" id="closeEdit" src="images/close_off.gif"/>
            </td>
        </tr></table>
    <!-- Sectiune de Afisare Erori. -->
    <table width="100%" border="0" cellpadding="1" align="center" class="lightrow" cellspacing="1">
        <logic:messagesPresent><tr>
            <td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center"><html:errors/></td>
        </tr></logic:messagesPresent>
        <!-- END Sectiune de Afisare Erori. -->
        <!-- START Sectiune de FORM. -->

        <!-- Cimpul 'mkey' field. -->
        <!--<tr>-->
            <!--<td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admmessagetemplate"-->
                                                                                      <%--key="adm_message_template.prompt.mkey"/>--%>
                <!--:-->
            <!--</td><td class="text"><bean:write property="mkey" name="<%=Constants.ADM_MESSAGE_TEMPLATE_KEY%>"/>-->
        <!--</td></tr>-->
        <!-- Cimpul 'message' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admmessagetemplate"
                                                                                      key="adm_message_template.prompt.message"/>
                :
            </td><td class="text"><bean:write property="message" name="<%=Constants.ADM_MESSAGE_TEMPLATE_KEY%>"/>
        </td></tr><html:form action="/admmessagetemplate.do">
        <input type="hidden" name="values.id_message_template"
               value="<bean:write property="id_message_template" name="<%=Constants.ADM_MESSAGE_TEMPLATE_KEY%>"/>">
        <!-- START Sectiune de BUTOANE. -->
        <!-- buton modificare. -->
        <tr>
            <td colspan="2" class="button-row" align="center"><html:submit styleClass="button"><bean:message
                    bundle="admmessagetemplate" key="adm_message_template.button.delete"/></html:submit><html:hidden
                    property="method" value="delete"/></td>
        </tr>
        <!-- END Sectiune de BUTOANE. -->
    </html:form>
    </table>
</div><!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="sys/admmessagetemplate.do"><html:hidden property="method"
                                                                                     value="list"/></form>
<script>
    function closeWindow() {
        document.closeForm.submit();
    }
</script>
