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
    <html:form action="/admmenuentry.do" styleId="searchForm" >
      <p width="100%" class="button-row" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </p>
      <table width="100%" class="lightrow" border="0">
        <!-- Cimpul 'fk_menu_entry' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.fk_menu_entry"/>
            :
          </td>
          <td class="text" align="left">
                                        <html:select property="values.fk_menu_entry" styleClass="selectbox"><option value="">
            <bean:message bundle="app" key="select.prompt"/>
            </option>
            <html:options collection="array_adm_menu_entry" property="id_menu_entry" labelProperty="traducere"/>
          </html:select>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.searchlabel.tooltip.fk_menu_entry"/>" />
        </td>
      </tr>
      <!-- Cimpul 'menu_key' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_key"/>
          :
        </td>
        <td class="text" align="left">
          <html:text styleClass="text-small" property="values.menu_key" size="30"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.searchlabel.tooltip.menu_key"/>" />
        </td>
      </tr>
      <!-- Cimpul 'menu_url' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_url"/>
          :
        </td>
        <td class="text" align="left">
          <html:text styleClass="text-small" property="values.menu_url" size="30"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.searchlabel.tooltip.menu_url"/>" />
        </td>
      </tr>
      <!-- Cimpul 'link_menu_name' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.link_menu_name"/>
          :
        </td>
        <td class="text" align="left">
          <html:text styleClass="text-small" property="values.link_menu_name" size="22"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.searchlabel.tooltip.link_menu_name"/>" />
        </td>
      </tr>
      <!-- Cimpul 'menu_type' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_type"/>
          :
        </td>
        <td class="text" align="left">
          <html:text styleClass="text-small" property="values.menu_type" size="22"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.searchlabel.tooltip.menu_type"/>" />
        </td>
      </tr>
      <!-- Cimpul 'menu_state' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_state"/>
          :
        </td>
        <td class="text" align="left">
          <html:text styleClass="text-small" property="values.menu_state" size="22"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.searchlabel.tooltip.menu_state"/>" />
        </td>
      </tr>
      <!-- Cimpul 'menu_order' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_order"/>
          :
        </td>
        <td class="text" align="left">
          <html:text styleClass="text-small" property="values.menu_order" size="22"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.searchlabel.tooltip.menu_order"/>" />
        </td>
      </tr>
      <!-- Cimpul 'menu_description' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_description"/>
          :
        </td>
        <td class="text" align="left">
          <html:text styleClass="text-small" property="values.menu_description" size="30"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.searchlabel.tooltip.menu_description"/>" />
        </td>
      </tr>
      <!-- Cimpul 'menu_icon' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_icon"/>
          :
        </td>
        <td class="text" align="left">
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.searchlabel.tooltip.menu_icon"/>" />
        </td>
      </tr>
      <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>" />
      <tr>
        <td colspan="2" class="button-row" align="center">
          <input type="hidden" name="method" value="search" />
          <input type="hidden" name="search" value="1" />
          <html:submit styleClass="btn-generic">
            <bean:message  bundle="admmenuentry" key="adm_menu_entry.button.search"/>
          </html:submit>
        </td>
      </tr>
    </html:form>
  </table>
  <!-- #############################-->
  <!-- END Sectiune de SEARCH. -->
