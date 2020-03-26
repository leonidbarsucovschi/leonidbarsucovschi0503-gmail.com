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
<%@ taglib uri="selectionComponent" prefix="selection" %>

<!-- #########################3 -->
<!-- -->
<!-- Start Sectiune de SEARCH. -->
<!-- #############################-->
<logic:equal name="viewObject" property="search" value="<%=String.valueOf(1)%>"><div id="search"
    class="show"></logic:equal><logic:notEqual name="viewObject" property="search" value="<%=String.valueOf(1)%>"><div
    id="search" class="noshow"></logic:notEqual><html:form action="/admmessagetemplate.do" styleId="searchForm"><p
        width="100%" class="button-row" align="right"><img border="0" style="cursor:pointer"
                                                           onClick="javascript:hideLayer('search');"
                                                           title='<bean:message bundle="admmessagetemplate" key="adm_message_template.label.closeWindow"/>'
                                                           name="closeEditFrame" id="closeEdit"
                                                           src="images/close_off.gif"/></p>
    <table width="100%" class="news-table-content" border="0">
    <!-- Cimpul 'fk_limba' field. -->

    <tr>
        <td valign="middle" width="40%" class="textbold" align="right"><bean:message bundle="admmessagetemplate"
                                                                      key="adm_message_template.prompt.fk_limba"/>:
        </td>
        <td class="text" align="left">
            <selection:selectionComponent property="values.fk_limba" detailsFieldName="denumire" idTableName="lmb.ID_Limba"
                                      multiple="false">
            <selection:genericSelection searchCaseId="nomLimba" knownFieldName="cod" showCodeInsert="true" styleClass="field_input_small">
            </selection:genericSelection>
        </selection:selectionComponent>
        </td>
    </tr>

    <!-- Cimpul 'message' field. -->

    <tr>
        <td valign="middle" width="40%" class="textbold" align="right"><bean:message bundle="admmessagetemplate"
                                                                      key="adm_message_template.prompt.message"/>:
        </td>
        <td class="text" align="left">


            <html:text styleClass="inputtext" property="values.message" size="30"/><img src="images/quest.gif"
                                                                                        width="15" height="15"
                                                                                        style="cursor:pointer;"
                                                                                        title="<bean:message bundle="admmessagetemplate" key="adm_message_template.searchlabel.tooltip.message"/>"/>
        </td>
    </tr><input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>"/><tr>
    <td colspan="2" class="button-row" align="center"><input type="hidden" name="method" value="search"/><input
            type="hidden" name="search" value="1"/><html:submit styleClass="button"><bean:message
                                                                                                  bundle="admmessagetemplate"
                                                                                                  key="adm_message_template.button.search"/>
    </html:submit></td>
</tr></html:form></table><!-- #############################-->
<!-- END Sectiune de SEARCH. -->
