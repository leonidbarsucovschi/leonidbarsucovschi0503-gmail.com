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
    <html:form action="/admmenuentryrole.do" styleId="searchForm" >
      <p width="100%" class="button-row" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="admmenuentryrole" key="adm_menu_entry_role.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </p>
      <table width="100%" class="lightrow" border="0">
        <!-- Cimpul 'fk_role' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="admmenuentryrole" key="adm_menu_entry_role.prompt.fk_role"/>
            :
          </td>
          <td class="text" align="left">
                                        <html:select property="values.fk_role" styleClass="selectbox"><option value="">
            <bean:message bundle="app" key="select.prompt"/>
            </option>
            <html:options collection="array_adm_role" property="id_role" labelProperty="dumpData"/>
          </html:select>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentryrole" key="adm_menu_entry_role.searchlabel.tooltip.fk_role"/>" />
        </td>
      </tr>
      <!-- Cimpul 'fk_menu_entry' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admmenuentryrole" key="adm_menu_entry_role.prompt.fk_menu_entry"/>
          :
        </td>
        <td class="text" align="left">
                                        <html:select property="values.fk_menu_entry" styleClass="selectbox"><option value="">
          <bean:message bundle="app" key="select.prompt"/>
          </option>
          <html:options collection="array_adm_menu_entry" property="id_menu_entry" labelProperty="dumpData"/>
        </html:select>
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentryrole" key="adm_menu_entry_role.searchlabel.tooltip.fk_menu_entry"/>" />
      </td>
    </tr>
    <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>" />
    <tr>
      <td colspan="2" class="button-row" align="center">
        <input type="hidden" name="method" value="search" />
        <input type="hidden" name="search" value="1" />
        <html:submit styleClass="btn-generic">
          <bean:message  bundle="admmenuentryrole" key="adm_menu_entry_role.button.search"/>
        </html:submit>
      </td>
    </tr>
  </html:form>
</table>
<!-- #############################-->
<!-- END Sectiune de SEARCH. -->
