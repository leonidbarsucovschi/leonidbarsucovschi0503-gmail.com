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
                <bean:message bundle="audit" key="audit.title.delete"/>
                <!-- END Sectiune de Titlu pagina. -->
            </td>
            <td valign="top" class="bottom" align="right">
                <img border="0" onMouseOver="swapImage('closeEditFrame','images/close_on.gif');" style="cursor:pointer"
                     onClick="closeWindow();"
                     title='<bean:message bundle="audit" key="audit.label.closeWindow"/>' name="closeEditFrame"
                     id="closeEdit" src="images/close_off.gif"/>
            </td>
        </tr></table>
    <!-- Sectiune de Afisare Erori. -->
    <table width="100%" border="0" cellpadding="1" align="center" class="lightrow" cellspacing="1">
        <logic:messagesPresent><tr>
            <td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center"><html:errors/></td>
        </tr></logic:messagesPresent>
        <!-- END Sectiune de Afisare Erori. -->
        <!-- START Sectiune de FORM. -->

        <!-- Cimpul 'id_scenariu' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.id_scenariu"/>:
            </td><td class="text"><bean:write property="id_scenariu" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr>
        <!-- Cimpul 'pk_entitate' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.pk_entitate"/>:
            </td><td class="text"><bean:write property="pk_entitate" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr>
        <!-- Cimpul 'fk_user' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.fk_user"/>:
            </td><td class="text"><bean:write property="fk_user" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr>
        <!-- Cimpul 'ip' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.ip"/>:
            </td><td class="text"><bean:write property="ip" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr>
        <!-- Cimpul 'cod_operatie' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.cod_operatie"/>:
            </td><td class="text"><bean:write property="cod_operatie" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr>
        <!-- Cimpul 'data_operatie' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.data_operatie"/>
                :
            </td><td class="text"><bean:write property="data_operatieString" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr>
        <!-- Cimpul 'xml_description' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.xml_description"/>
                :
            </td><td class="text"><bean:write property="xml_description" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr>
        <!-- Cimpul 'atribut1' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.atribut1"/>:
            </td><td class="text"><bean:write property="atribut1" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr>
        <!-- Cimpul 'atribut2' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.atribut2"/>:
            </td><td class="text"><bean:write property="atribut2" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr>
        <!-- Cimpul 'atribut3' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.atribut3"/>:
            </td><td class="text"><bean:write property="atribut3" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr>
        <!-- Cimpul 'atribut4' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.atribut4"/>:
            </td><td class="text"><bean:write property="atribut4" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr>
        <!-- Cimpul 'atribut5' field. -->
        <tr>
            <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="audit"
                                                                                      key="audit.prompt.atribut5"/>:
            </td><td class="text"><bean:write property="atribut5" name="<%=Constants.TBL_AUDIT_KEY%>"/>
        </td></tr><html:form action="/audit.do">
        <input type="hidden" name="values.id_audit"
               value="<bean:write property="id_audit" name="<%=Constants.TBL_AUDIT_KEY%>"/>">
        <!-- START Sectiune de BUTOANE. -->
        <!-- buton modificare. -->
        <tr>
            <td colspan="2" class="button-row" align="center"><html:submit styleClass="button"><bean:message
                    bundle="audit" key="audit.button.delete"/></html:submit><html:hidden property="method"
                                                                                         value="delete"/></td>
        </tr>
        <!-- END Sectiune de BUTOANE. -->
    </html:form>
    </table>
</div><!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="audit/audit.do"><html:hidden property="method" value="list"/></form>
<script>
    function closeWindow() {
        document.closeForm.submit();
    }
</script>
