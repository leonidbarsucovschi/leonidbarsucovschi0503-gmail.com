<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jportal.tld" prefix="us" %>

<html:form action="admuserinreg.do" styleId="addForm">
    <input type="hidden" name="method" value="showAdd"/>
</html:form>

<div class="table">
    <table width="100%" cellspacing="0" cellpadding="0" border="0">
        <tr class="page-title-header">
            <td width="71%">
                <!-- Titlul ferestrei de listare. -->
                <bean:message bundle="admuserinreg" key="adm_user_inreg.title.list"/>
                <!-- END Sectiune de Titlu pagina. -->
            </td>
            <td valign="middle" nowrap="true" align="right">
                <input type="image" src="images/search.gif" onMouseOut="this.src='images/search.gif'"
                       onMouseOver="this.src='images/search_over.gif'" onClick="javascript:showLayer('search')"
                       class="arrow" border="0" title="<bean:message bundle="admrole" key="adm_role.button.search"/>">
                <input type="image" onClick="javascript:refresh();" name="reload_btn" src="images/refresh.gif"
                       onMouseOut="this.src='images/refresh.gif'" onMouseOver="this.src='images/refresh_over.gif'"
                       border="0" title='<bean:message  bundle="app" key="message.button.tooltip.refresh"/>'/>
            </td>
        </tr>
    </table>
    <table width="100%">
        <!-- Sectiune de Afisare Erori. -->
        <tr>
            <td colspan="2" class="msg_error">
                <html:errors/>
            </td>
        </tr>
        <!-- END Sectiune de Afisare Erori. -->
        <!-- #########################3 -->
        <!-- Start Sectiune de SEARCH. -->
        <!-- #############################-->
        <tr>
            <td colspan="2">
                <jsp:include page="search_admuserinreg.jsp" flush="true"/>
            </td>
        </tr>
        <!-- #############################-->
        <!-- END Sectiune de SEARCH. -->
        <logic:messagesPresent message="true">
            <tr>
                <td colspan="2" class="msg_success" align="center">
                    <html:messages id="mesaje" bundle="app" message="true">
                        <bean:write name="mesaje" ignore="true"/>
                    </html:messages>
                </td>
            </tr>
        </logic:messagesPresent>
    </table>
    <jsp:include page="list_lista_admuserinreg.jsp" flush="true"/>
</div>
<form name="actionForm" method="post" action="sys/admuserinreg.do">
    <input type="hidden" name="method"/>
    <input type="hidden" name="page"/>
    <input type="hidden" name="prefix" value="/"/>
    <input type="hidden" name="id_user_inreg"/>
</form>
