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
<html:form action="admmessagetemplate.do" styleId="addForm"><input type="hidden" name="method"
                                                                   value="showAdd"/></html:form><div class="table">
    <table width="100%" cellspacing="0" cellpadding="0" border="0">
        <tr class="page-title-header">
            <td width="71%">
                <!-- Titlul ferestrei de listare. -->
                <bean:message bundle="admmessagetemplate" key="adm_message_template.title.list"/>
                <!-- END Sectiune de Titlu pagina. -->
            </td>
            <td valign="middle" nowrap="true" align="right">
           
            <%--<img src="images/search.gif" onMouseOut="this.src='images/search.gif'" onMouseOver="this.src='images/search_over.gif'" onClick="javascript:showLayer('search')" class="hand" border="0">--%>
            <input type="image" src="images/search.gif"  onClick="javascript:showLayer('search')" onMouseOut="this.src='images/search.gif'" onMouseOver="this.src='images/search_over.gif'" class="arrow" border="0" title='<bean:message  bundle="app" key="message.button.tooltip.cauta"/>' />
            <input type="image" onClick="javascript:refresh();" name="reload_btn" src="images/refresh.gif" onMouseOut="this.src='images/refresh.gif'" onMouseOver="this.src='images/refresh_over.gif'" border="0"   title='<bean:message  bundle="app" key="message.button.tooltip.refresh"/>' />
    </td>
        </tr>
    </table>
    <table width="100%"><!-- Sectiune de Afisare Erori. -->
         <tr>
          <td colspan="2"  class="msg_error" align="center"><html:errors/></td>
        </tr>

        <!-- END Sectiune de Afisare Erori. -->


        <!-- #########################3 -->
        <!-- Start Sectiune de SEARCH. -->
        <!-- #############################-->
        <tr>
            <td colspan="2">
                <jsp:include page="search_admmessagetemplate.jsp" flush="true"/>
            </td>
        </tr><!-- #############################-->
        <!-- END Sectiune de SEARCH. -->
        <logic:messagesPresent message="true"><tr>
            <td colspan="2"  class="msg_success" align="center"><html:messages id="mesaje" bundle="app" message="true">
                <bean:write name="mesaje" filter="false" ignore="true"/></html:messages></td>
        </tr></logic:messagesPresent></table>
    <jsp:include page="list_lista_admmessagetemplate.jsp" flush="true"/>
</div>

<form name="actionForm" method="post" action="admmessagetemplate/admmessagetemplate.do"><input type="hidden"
                                                                                               name="method"/><input
        type="hidden" name="page"/><input type="hidden" name="prefix" value="/"/><input type="hidden"
                                                                                        name="id_message_template"/>
</form>