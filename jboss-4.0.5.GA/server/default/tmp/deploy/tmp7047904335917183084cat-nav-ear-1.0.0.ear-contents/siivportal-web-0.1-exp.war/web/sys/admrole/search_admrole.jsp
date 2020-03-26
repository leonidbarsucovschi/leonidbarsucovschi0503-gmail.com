<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmUserInregConstants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!-- #########################3 -->
<!--                            -->
<!-- Start Sectiune de SEARCH. -->
<!-- #############################-->
<%
  String type = request.getParameter("type");
%>
<logic:equal name="viewObject" property="search" value="<%=String.valueOf(1)%>">
  <div id="search" class="show">
  </logic:equal>
  <logic:notEqual name="viewObject" property="search" value="<%=String.valueOf(1)%>">
    <div id="search" class="noshow">
    </logic:notEqual>
    <html:form action="/admrole.do" styleId="searchForm" >
      <p width="100%" class="button-row" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="admrole" key="adm_role.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </p>
      <table width="100%" class="news-table-content" border="0">
        <!-- Cimpul 'role_name' field. -->
        <tr>
          <td valign="top"  align="right" width="40%">
            <bean:message bundle="admrole" key="adm_role.prompt.role_name"/>
            :
          </td>
          <td class="text" align="left"  width="60%">
            <html:text styleClass="text-small" property="values.role_name" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admrole" key="adm_role.searchlabel.tooltip.role_name"/>" />
          </td>
        </tr>
        <!-- Cimpul 'role_description' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="admrole" key="adm_role.prompt.role_description"/>
            :
          </td>
          <td class="text" align="left">
            <html:text styleClass="text-small" property="values.role_description" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admrole" key="adm_role.searchlabel.tooltip.role_description"/>" />
          </td>
        </tr>
        <!-- Cimpul 'role_type' field. -->
        <tr>
          <td valign="middle"  align="right">
            <bean:message bundle="admrole" key="adm_role.prompt.role_type"/>
            :
          </td>
          <%--<td class="text" align="left">
            <html:text styleClass="text-small" property="values.role_type" size="22"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admrole" key="adm_role.searchlabel.tooltip.role_type"/>" />
          </td>--%>
        <td class="text-label-bkwhite" align="left">
          <% if ("int".equals(type)) {%>
            <html:radio styleClass="radio" property="values.role_type" value='<%=AdmUserInregConstants.TIP_ROL_USER_INT + ""%>'/>
             <bean:message bundle="admrole" key="adm_role.type.user"/>
            <html:radio styleClass="radio" property="values.role_type" value='<%=AdmUserInregConstants.TIP_ROL_SISTEM_INT +""%>'/>
             <bean:message bundle="admrole" key="adm_role.type.system"/>
            <html:radio styleClass="radio" property="values.role_type" value='-1'/>
              <bean:message bundle="admrole" key="adm_role.type.ambele"/>
           <%}%>
         <% if ("ext".equals(type)) {%>
            <html:radio styleClass="radio" property="values.role_type" value='<%=AdmUserInregConstants.TIP_ROL_USER_EXT + ""%>'/>
             <bean:message bundle="admrole" key="adm_role.type.user"/>
            <html:radio styleClass="radio" property="values.role_type" value='<%=AdmUserInregConstants.TIP_ROL_SISTEM_EXT + ""%>'/>
             <bean:message bundle="admrole" key="adm_role.type.system"/>
            <html:radio styleClass="radio" property="values.role_type" value='-1'/>
              <bean:message bundle="admrole" key="adm_role.type.ambele"/>
           <%}%>
			</td>
        </tr>
        <!-- Cimpul 'role_code' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="admrole" key="adm_role.prompt.role_code"/>
            :
          </td>
          <td class="text" align="left">
            <html:text styleClass="text-small" property="values.role_code" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admrole" key="adm_role.searchlabel.tooltip.role_code"/>" />
          </td>
        </tr>
        <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>" />
        <tr>
          <td colspan="2" class="button-row" align="center">
            <input type="hidden" name="method" value="search" />
            <input type="hidden" name="search" value="1" />
             <input type="hidden" name="type" value="<%=type%>"/>
            <html:submit styleClass="btn-generic">
              <bean:message  bundle="admrole" key="adm_role.button.search"/>
            </html:submit>
          </td>
        </tr>
      </html:form>
    </table>
    <!-- #############################-->
    <!-- END Sectiune de SEARCH. -->
