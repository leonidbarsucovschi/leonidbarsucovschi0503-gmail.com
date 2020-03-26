<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jportal.tld" prefix="us" %>

<html:form action="company.do" styleId="newForm">
    <input type="hidden" name="method" value="showAdd"/>
</html:form>

<div class="table">
    <table width="100%" cellspacing="0" cellpadding="0" border="0">
        <tr class="page-title-header">
            <td width="71%">
                <!-- Titlul ferestrei de listare. -->
                <bean:message bundle="company" key="company.admin.title.list"/>
            </td>
            <td valign="middle" nowrap="true" align="right">
                <us:checkAccess command="company.do" action="showAdd">
                    <input type="image" src="images/add.gif"
                           onMouseOut="this.src='images/add.gif'"
                           onMouseOver="this.src='images/add4_over.gif'"
                           onClick="javascript:document.getElementById('newForm').submit()"
                           title='<bean:message bundle="company" key="company.button.new"/>'/>
                </us:checkAccess>
                <input type="image" src="images/search.gif" onMouseOut="this.src='images/search.gif'"
                       onMouseOver="this.src='images/search_over.gif'" onClick="javascript:showLayer('search')"
                       class="arrow" border="0" title="<bean:message bundle="company" key="company.button.search"/>">
                <input type="image" onClick="javascript:refresh();" name="reload_btn" src="images/refresh.gif"
                       onMouseOut="this.src='images/refresh.gif'" onMouseOver="this.src='images/refresh_over.gif'"
                       border="0" title='<bean:message  bundle="app" key="message.button.tooltip.refresh"/>'/>
            </td>
        </tr>
    </table>

    <table width="100%">
        <!-- Sectiune de Afisare Erori -->
        <tr>
            <td colspan="2" class="msg_error">
                <html:errors bundle="app"/>
            </td>
        </tr>

        <!-- Sectiune de SEARCH -->
        <tr>
            <td colspan="2">
                <jsp:include page="search_company.jsp" flush="true"/>
            </td>
        </tr>

        <!-- Sectiune de mesaje -->
        <logic:messagesPresent message="true">
            <tr>
                <td colspan="2" class="msg_success" align="center">
                    <html:messages id="mesaje" bundle="app" message="true">
                        <bean:write name="mesaje" ignore="true"/>
                    </html:messages>
                </td>
            </tr>
        </logic:messagesPresent>

        <!-- Lista de fisiere incarcate -->
        <tr>
            <td colspan="2">
                <jsp:include page="list_lista_company.jsp" flush="true"/>
            </td>
        </tr>
    </table>
</div>

<!-- Validare cimpuri forma. -->
<form name="actionForm" method="post" action="contrapositions/company.do">
    <input type="hidden" name="method"/>
    <input type="hidden" name="page"/>
    <input type="hidden" name="prefix" value="/"/>
    <input type="hidden" name="id"/>
</form>