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
        <tr class="page-title-header">
            <td width="100%" valign="top"  align="left">
                <!-- Titlul ferestrei pentru stergere. -->
                <bean:message bundle="admmessagetemplate" key="adm_message_template.title.view"/>
                <!-- END Sectiune de Titlu pagina. -->
            </td>
            <td class="bottom" align="right">
                <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();"
                     title='<bean:message bundle="admmessagetemplate" key="adm_message_template.label.closeWindow"/>'
                     src="images/close_off.gif"/>
            </td>
        </tr></table>
    <table width="100%" border="0" cellpadding="1" align="center" class="news-table-content" cellspacing="1">
        <!-- Sectiune de Afisare Erori. -->
        <tr>
            <td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center"><html:errors/></td>
        </tr>
        <!-- END Sectiune de Afisare Erori. -->


        <!-- Cimpul 'message' field. -->
        <tr>
            <td width="20%" valign="top" class="textbold" align="right"><bean:message bundle="admmessagetemplate"
                                                                                      key="adm_message_template.prompt.message"/>
                :
            </td><td class="text"><bean:write property="message" name="<%=Constants.ADM_MESSAGE_TEMPLATE_KEY%>"/>
        </td></tr>
    </table>
</div>

<form name="closeForm" method="post" action="sys/admmessagetemplate.do"><html:hidden property="method"
                                                                                     value="list"/></form>
<script>
    function closeWindow() {
        document.closeForm.submit();
    }
</script>