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
<!-- #########################3 -->
<!--                            -->
<!-- Start Sectiune de SEARCH. -->
<!-- #############################-->
<logic:equal name="viewObject" property="search" value="<%=String.valueOf(1)%>">
  <div id="search" class="show">
  </logic:equal>
  <logic:notEqual name="viewObject" property="search" value="<%=String.valueOf(1)%>">
    <div id="search" class="noshow">
    </logic:notEqual>
    <html:form action="/admoperationtype.do" styleId="searchForm" >
      <p width="100%" class="button-row" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="admoperationtype" key="adm_operation_type.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </p>
      <table width="100%" class="lightrow" border="0">
        <!-- Cimpul 'fk_operation_type' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.fk_operation_type"/>
            :
          </td>
          <td class="text" align="left">
                                        <html:select property="values.fk_operation_type" styleClass="selectbox"><option value="">
            <bean:message bundle="app" key="select.prompt"/>
            </option>
            <html:options collection="array_adm_operation_type" property="id_operation_type" labelProperty="dumpData"/>
          </html:select>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admoperationtype" key="adm_operation_type.searchlabel.tooltip.fk_operation_type"/>" />
        </td>
      </tr>
      <!-- Cimpul 'opp_name' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.opp_name"/>
          :
        </td>
        <td class="text" align="left">
          <html:text styleClass="text-small" property="values.opp_name" size="30"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admoperationtype" key="adm_operation_type.searchlabel.tooltip.opp_name"/>" />
        </td>
      </tr>
      <!-- Cimpul 'description' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admoperationtype" key="adm_operation_type.prompt.description"/>
          :
        </td>
        <td class="text" align="left">
          <html:text styleClass="text-small" property="values.description" size="30"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admoperationtype" key="adm_operation_type.searchlabel.tooltip.description"/>" />
        </td>
      </tr>
      <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>" />
      <tr>
        <td colspan="2" class="button-row" align="center">
          <input type="hidden" name="method" value="search" />
          <input type="hidden" name="search" value="1" />
          <html:submit styleClass="btn-generic">
            <bean:message  bundle="admoperationtype" key="adm_operation_type.button.search"/>
          </html:submit>
        </td>
      </tr>
    </html:form>
  </table>
  <!-- #############################-->
  <!-- END Sectiune de SEARCH. -->
