<%@ page import="org.apache.struts.action.ActionMessages,
                 org.apache.struts.action.ActionMessage,
                 ro.uti.waf.base.simple.action.ActionConstants" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
    <TBODY>
        <TR bgcolor="#FFCC00">

            <TD style="padding:3px " class="smallbodywhitebold" align="center">
                <bean:message bundle="search" key="search.title.search_admin"/>
            </TD>
        </TR>
        <tr>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="msg_success" align="center">
                <!--<ul>-->
                <html:messages bundle="search" id="error" message="true">
                    <bean:write name="error"/>
                </html:messages>
                <!--</ul>-->
            </td>
        </tr>
        <tr>
            <td align="center">
                <html:form action="/s.do">
                    <table cellspacing="3" cellpadding="2" border="0">
                        <tr>
                            <td align="center">
                                <table class="lightrow" cellspacing="1">
                                    <tr class="smallbodybold">
                                        <td align="center">
                                            <bean:message bundle="search" key="search.label.tipfisiere"/>
                                        </td>
                                        <td align="center">
                                            <bean:message bundle="search" key="search.label.fisiere_indexate"/>
                                        </td>
                                        <td align="center">
                                            <bean:message bundle="search" key="search.label.fisiere_curente"/>
                                        </td>
                                        <td align="center">
                                            <bean:message bundle="search" key="search.label.reindexare"/>
                                        </td>
                                        <td>&nbsp;</td>
                                    </tr>

                                    <tr class="smallbodylite">
                                        <td>
                                            <bean:message bundle="search" key="search.label.paginistatice"/>
                                        </td>
                                        <td align="center">
                                            <bean:write name="indexed_static_file" scope="request"/>
                                        </td>
                                        <td align="center">
                                            <bean:write name="number_static_file" scope="request"/>
                                        </td>
                                        <td align="right">
                                            <html:submit styleClass="btn-trimite"
                                                         onclick="fillField('add_all_static');">
                                                <bean:message bundle="search" key="search.label.reindexare"/>
                                            </html:submit>
                                        </td>
                                        <logic:present name="static" scope="session">
                                            <td align="center">
                                                <bean:message bundle="search" key="search.label.message"/>
                                            </td>
                                        </logic:present>
                                        <logic:notPresent name="static" scope="session">
                                            <td>&nbsp;</td>
                                        </logic:notPresent>
                                    </tr>

                                    <tr class="smallbodylite">
                                        <td>
                                            <bean:message bundle="search" key="search.label.stiri"/>
                                        </td>
                                        <td align="center">
                                            <bean:write name="indexed_stiri_file" scope="request"/>
                                        </td>
                                        <td align="center">
                                            <bean:write name="number_stiri" scope="request"/>
                                        </td>
                                        <td align="right">
                                            <html:submit styleClass="btn-trimite" onclick="fillField('add_all_stiri');">
                                                <bean:message bundle="search" key="search.label.reindexare"/>
                                            </html:submit>
                                        </td>
                                        <logic:present name="stiri" scope="session">
                                            <td align="center">
                                                <bean:message bundle="search" key="search.label.message"/>
                                            </td>
                                        </logic:present>
                                        <logic:notPresent name="stiri" scope="session">
                                            <td>&nbsp;</td>
                                        </logic:notPresent>
                                    </tr>
                                </table>

                                <input type="hidden" name="method" id="method_id"/>
                            </td>
                        </tr>

                        <tr height="10" class="msg_success" align="center">
                            <td>
                                <bean:message bundle="search" key="search.nota.pagini_statice"/>
                            </td>
                        </tr>
                    </table>
                </html:form>
            </td>
        </tr>
    </TBODY>
</TABLE>
<script>
    function fillField(name) {
        document.getElementById("method_id").value = name;
    }
</script>