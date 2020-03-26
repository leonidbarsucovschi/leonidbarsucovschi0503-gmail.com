<%--
* @version 0.1
* @author Edward.Moraru@uti.ro
--%>

<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="selectionComponent" prefix="selection" %>

<%@ page import="ro.uti.waf.components.audit.config.Entity" %>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Iterator"%>

<%-- Start Sectiune de SEARCH. --%>
<html:form action="/audit.do" styleId="searchForm">
<table width="100%" class="lightrow" border="0">

    <%-- Cimpul 'fk_user' --%>
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="audit" key="audit.prompt.fk_user"/>:
        </td>
        <td class="field_text" align="left">
            <%-- html:text styleClass="field_input" property="values.fk_user" size="22"/ --%>
            <selection:selectionComponent property="values.fk_user" detailsFieldName="login_details"
                                          idTableName="usr.ID_USER" multiple="false">
                <selection:genericSelection searchCaseId="userPersoana" size="30" maxlength="20"
                                            knownFieldName="user_login" styleClass="field_input">
                </selection:genericSelection>
            </selection:selectionComponent>
            <img src="images/quest.gif" width="15"height="15" style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.fk_user"/>"/>
        </td>
    </tr>

    <%-- Cimpul 'ip' --%>
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="audit" key="audit.prompt.ip"/>:
        </td>
        <td class="field_text" align="left">
            <html:text styleClass="field_input" property="values.ip" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.ip"/>"/>
        </td>
    </tr>

    <%-- Cimpul 'data_operatie' --%>
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="audit" key="audit.prompt.data_operatie"/>:
        </td>
        <td class="field_text" align="left">
            <html:text styleClass="field_input" styleId="data_operatieString" property="values.data_operatieString"/>
            <img src="images/cal.gif" id="triggerdata_operatieString"/>
<script type="text/javascript">
            Calendar.setup({
                inputField  : "data_operatieString",// ID of the input field
                ifFormat    : "%d.%m.%Y",    // the date format
                button      : "triggerdata_operatieString"// ID of the button
            });
</script>
            <font size="-1">[dd/MM/yyyy]</font>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.data_operatie"/>"/>
        </td>
    </tr>

    <%-- Cimpul 'cod_operatie' --%>
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="audit" key="audit.prompt.cod_operatie"/>:
        </td>
        <td class="field_text" align="left">
            <html:text styleClass="field_input" property="values.cod_operatie" size="22"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.cod_operatie"/>"/>
        </td>
    </tr>

    <%-- Cimpul 'id_scenariu' --%>
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="audit" key="audit.prompt.id_scenariu"/>:
        </td>
        <td class="field_text" align="left">
            <html:select property="values.id_scenariu" styleClass="field_input"
                         onchange="changeLabels()"
                         styleId="entitySelect">
                <option value="">
                    <bean:message bundle="app" key="select.prompt"/>
                </option>
                <html:options collection="nume_entitati" property="name" labelProperty="name"/>
            </html:select>
            <%-- html:text styleClass="field_input" property="values.id_scenariu" size="30"/ --%>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.id_scenariu"/>"/>
        </td>
    </tr>

    <%-- Cimpul 'pk_entitate'
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="audit" key="audit.prompt.pk_entitate"/>:
        </td>
        <td class="field_text" align="left">
            <html:text styleClass="field_input" property="values.pk_entitate" size="22"/>
            <img src="images/quest.gif" width="15" height="15"style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.pk_entitate"/>"/>
        </td>
    </tr> --%>

    <%-- Cimpul 'xml_description'
    <tr>
        <td valign="top" class="label" align="right">
            <bean:message bundle="audit" key="audit.prompt.xml_description"/>:
        </td>
        <td class="field_text" align="left">
            <html:text styleClass="field_input" property="values.xml_description" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.xml_description"/>"/>
        </td>
    </tr> --%>

    <%-- Cimpul 'atribut1' --%>
    <tr id="atrib1Row">
        <td valign="top" class="label" align="right" id="atribut1">
            <bean:message bundle="audit" key="audit.prompt.atribut1"/>:
        </td>
        <td class="field_text" align="left">
            <html:text styleClass="field_input" property="values.atribut1" size="30" styleId="atrib1Txt"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.atribut1"/>"/>
        </td>
    </tr>

    <%-- Cimpul 'atribut2' --%>
    <tr id="atrib2Row">
        <td valign="top" class="label" align="right" id="atribut2">
            <bean:message bundle="audit" key="audit.prompt.atribut2"/>:
        </td>
        <td class="field_text" align="left">
            <html:text styleClass="field_input" property="values.atribut2" size="30" styleId="atrib2Txt"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.atribut2"/>"/>
        </td>
    </tr>

    <%-- Cimpul 'atribut3' --%>
    <tr id="atrib3Row">
        <td valign="top" class="label" align="right" id="atribut3">
            <bean:message bundle="audit" key="audit.prompt.atribut3"/>:
        </td>
        <td class="field_text" align="left">
            <html:text styleClass="field_input" property="values.atribut3" size="30" styleId="atrib3Txt"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.atribut3"/>"/>
        </td>
    </tr>

    <%-- Cimpul 'atribut4' --%>
    <tr id="atrib4Row">
        <td valign="top" class="label" align="right" id="atribut4">
            <bean:message bundle="audit" key="audit.prompt.atribut4"/>:
        </td>
        <td class="field_text" align="left">
            <html:text styleClass="field_input" property="values.atribut4" size="30" styleId="atrib4Txt"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.atribut4"/>"/>
        </td>
    </tr>

    <%-- Cimpul 'atribut5' --%>
    <tr id="atrib5Row">
        <td valign="top" class="label" align="right" id="atribut5">
            <bean:message bundle="audit" key="audit.prompt.atribut5"/>:
        </td>
        <td class="field_text" align="left">
            <html:text styleClass="field_input" property="values.atribut5" size="30" styleId="atrib5Txt"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                 title="<bean:message bundle="audit" key="audit.searchlabel.tooltip.atribut5"/>"/>
        </td>
    </tr>

    <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>"/>
    <tr>
        <td colspan="2" class="button-row" align="center">
            <input type="hidden" name="method" value="search"/>
            <input type="hidden" name="search" value="1"/>
            <html:submit styleClass="button">
                <bean:message bundle="audit" key="audit.button.search"/>
            </html:submit>
        </td>
    </tr>
    </html:form>
</table>

<script type="text/javascript">

    function entity(name, atrib1, atrib2, atrib3, atrib4, atrib5) {
        this.name = name;
        this.atrib1 = atrib1;
        this.atrib2 = atrib2;
        this.atrib3 = atrib3;
        this.atrib4 = atrib4;
        this.atrib5 = atrib5;
    }

    // create array
    var labels = new Array();
    labels[""] = new entity("", "", "", "", "", "");
    // populate array with new entity objects
<%
    List entitiesList = (List)request.getAttribute("nume_entitati");
    Iterator it = entitiesList.iterator();
    while(it.hasNext()) {
        Entity e = (Entity)it.next();

%>
    labels["<%=e.getName()%>"] = new entity("<%=e.getName()%>",
                                            "<%=e.getAttribute1()%>",
                                            "<%=e.getAttribute2()%>",
                                            "<%=e.getAttribute3()%>",
                                            "<%=e.getAttribute4()%>",
                                            "<%=e.getAttribute5()%>");
<%
    }
%>
    function changeLabels() {
        entitySel = document.getElementById("entitySelect");
        i = entitySel.selectedIndex;
        entity = labels[entitySel.options[i].value];

        putLabel("atrib1Row", "atribut1", "atrib1Txt", entity.atrib1);
        putLabel("atrib2Row", "atribut2", "atrib2Txt", entity.atrib2);
        putLabel("atrib3Row", "atribut3", "atrib3Txt", entity.atrib3);
        putLabel("atrib4Row", "atribut4", "atrib4Txt", entity.atrib4);
        putLabel("atrib5Row", "atribut5", "atrib5Txt", entity.atrib5);
    }

    function putLabel(rowId, labelId, txtId, atributeValue) {
        row = document.getElementById(rowId);
        txt = document.getElementById(txtId);
        txt.value='';
        if(atributeValue != "") {
            label = document.getElementById(labelId);
            label.innerHTML = atributeValue;
            row.style.display = '';
        } else {
            row.style.display = 'none';
        }
    }

    changeLabels();//apelez functia ca sa setez labels cand intra prima oara pe pagina
</script>
<%-- END Sectiune de SEARCH. --%>
