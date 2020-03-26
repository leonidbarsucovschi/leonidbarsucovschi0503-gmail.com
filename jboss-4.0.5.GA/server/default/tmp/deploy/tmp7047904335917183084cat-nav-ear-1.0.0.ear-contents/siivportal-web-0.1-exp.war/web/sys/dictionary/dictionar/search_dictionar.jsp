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
    <html:form action="/dictionar.do" styleId="searchForm" >
      <p width="100%" class="button-row" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="dictionar" key="dictionar.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </p>
      <table width="100%" class="lightrow" border="0">
        <!-- Cimpul 'fk_limba' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="dictionar" key="dictionar.prompt.fk_limba"/>
            :
          </td>
          <td class="text" align="left">
            <html:text styleClass="text-small" property="values.fk_limba" size="22"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="dictionar" key="dictionar.searchlabel.tooltip.fk_limba"/>" />
          </td>
        </tr>
        <!-- Cimpul 'traducere' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="dictionar" key="dictionar.prompt.traducere"/>
            :
          </td>
          <td class="text" align="left">
            <html:text styleClass="text-small" property="values.traducere" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="dictionar" key="dictionar.searchlabel.tooltip.traducere"/>" />
          </td>
        </tr>
        <!-- Cimpul 'camp_id' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="dictionar" key="dictionar.prompt.camp_id"/>
            :
          </td>
          <td class="text" align="left">
            <html:text styleClass="text-small" property="values.camp_id" size="22"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="dictionar" key="dictionar.searchlabel.tooltip.camp_id"/>" />
          </td>
        </tr>
        <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>" />
        <tr>
          <td colspan="2" class="button-row" align="center">
            <input type="hidden" name="method" value="search" />
            <input type="hidden" name="search" value="1" />
            <html:submit styleClass="btn-generic">
              <bean:message  bundle="dictionar" key="dictionar.button.search"/>
            </html:submit>
          </td>
        </tr>
      </html:form>
    </table>
    <!-- #############################-->
    <!-- END Sectiune de SEARCH. -->
