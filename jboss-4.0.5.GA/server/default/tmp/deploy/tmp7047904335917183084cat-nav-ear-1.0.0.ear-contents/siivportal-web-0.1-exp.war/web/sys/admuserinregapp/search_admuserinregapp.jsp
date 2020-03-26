<!--
                          *
                          *
                          * @version
                          * @author
                          */
                    -->
                    <%@ page import="ro.uti.settings.util.Constants"%>
                    <%@ page contentType="text/html; charset=iso-8859-2" %>
                    <%@ page language="java" %>
                    <%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
                    <%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
                    <%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

                    <!-- #########################3 -->
                    <!--                            -->
                    <!-- Start Sectiune de SEARCH. -->
                    <!-- #############################-->
                    <logic:equal name="viewObject" property="search" value="<%=String.valueOf(1)%>"><div id="search" class="show"></logic:equal><logic:notEqual name="viewObject" property="search" value="<%=String.valueOf(1)%>"><div id="search" class="noshow"></logic:notEqual><html:form action="/admuserinregapp.do" styleId="searchForm" ><p width="100%" class="button-row" align="right"><img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="admuserinregapp" key="adm_user_inreg_app.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" /></p>
<table width="100%" class="lightrow" border="0">
                                <!-- Cimpul 'fk_user_inreg' field. -->

                                <tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg_app.prompt.fk_user_inreg"/>:
                                  </td>
                                    <td class="text" align="left">
                                        <html:select property="values.fk_user_inreg" styleClass="selectbox"><option value=""><bean:message bundle="app" key="select.prompt"/></option><html:options collection="array_adm_user_inreg" property="id_user_inreg" labelProperty="dumpData"/></html:select><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="app" key="adm_user_inreg_app.searchlabel.tooltip.fk_user_inreg"/>" />
                                        </td>
  </tr>
                                <!-- Cimpul 'fk_application' field. -->

                                <tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg_app.prompt.fk_application"/>:
                                  </td>
                                    <td class="text" align="left">
                                        <html:select property="values.fk_application" styleClass="selectbox"><option value=""><bean:message bundle="app" key="select.prompt"/></option><html:options collection="array_adm_application" property="id_application" labelProperty="dumpData"/></html:select><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="app" key="adm_user_inreg_app.searchlabel.tooltip.fk_application"/>" />
                                        </td>
  </tr>
                                <!-- Cimpul 'descriere' field. -->

                                <tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg_app.prompt.descriere"/>:
                                  </td>
                                    <td class="text" align="left">


                                        <html:text styleClass="inputtext" property="values.descriere" size="30"/><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="app" key="adm_user_inreg_app.searchlabel.tooltip.descriere"/>" />
                                        </td>
  </tr><input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>"/><tr>
    <td colspan="2" class="button-row" align="center"><input type="hidden" name="method" value="search"/><input type="hidden" name="search" value="1"/><html:submit styleClass="button"><bean:message bundle="app" bundle="admuserinregapp" key="adm_user_inreg_app.button.search"/></html:submit></td>
  </tr></html:form></table><!-- #############################-->
                        <!-- END Sectiune de SEARCH. -->
