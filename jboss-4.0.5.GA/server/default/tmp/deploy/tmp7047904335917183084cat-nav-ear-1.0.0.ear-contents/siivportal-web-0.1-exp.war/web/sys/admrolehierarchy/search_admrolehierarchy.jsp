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
    <html:form action="/admrolehierarchy.do" styleId="searchForm" >
      <p width="100%" class="button-row" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </p>
      <table width="100%" class="lightrow" border="0">
        <!-- Cimpul 'fk_role1' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.prompt.fk_role1"/>
            :
          </td>
          <td class="text" align="left">
                                        <html:select property="values.fk_role1" styleClass="selectbox"><option value="">
            <bean:message bundle="app" key="select.prompt"/>
            </option>
            <html:options collection="array_adm_role" property="id_role" labelProperty="dumpData"/>
          </html:select>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.searchlabel.tooltip.fk_role1"/>" />
        </td>
      </tr>
      <!-- Cimpul 'tbl_id_appl_role' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.prompt.tbl_id_appl_role"/>
          :
        </td>
        <td class="text" align="left">
                                        <html:select property="values.tbl_id_appl_role" styleClass="selectbox"><option value="">
          <bean:message bundle="app" key="select.prompt"/>
          </option>
          <html:options collection="array_adm_role" property="id_role" labelProperty="dumpData"/>
        </html:select>
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admrolehierarchy" key="adm_role_hierarchy.searchlabel.tooltip.tbl_id_appl_role"/>" />
      </td>
    </tr>
    <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>" />
    <tr>
      <td colspan="2" class="button-row" align="center">
        <input type="hidden" name="method" value="search" />
        <input type="hidden" name="search" value="1" />
        <html:submit styleClass="btn-generic">
          <bean:message  bundle="admrolehierarchy" key="adm_role_hierarchy.button.search"/>
        </html:submit>
      </td>
    </tr>
  </html:form>
</table>
<!-- #############################-->
<!-- END Sectiune de SEARCH. -->
