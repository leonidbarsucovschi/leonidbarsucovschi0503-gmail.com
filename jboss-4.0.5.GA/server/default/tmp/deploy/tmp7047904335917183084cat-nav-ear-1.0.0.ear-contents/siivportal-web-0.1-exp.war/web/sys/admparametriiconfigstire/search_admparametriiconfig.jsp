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
    <html:form action="/admparametriiconfigstire.do" styleId="searchForm" >
      <p width="100%" class="button-row" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="admparametriiconfig" key="adm_parametrii_config.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </p>
      <table width="100%" class="lightrow" border="0">
        <!-- Cimpul 'denumire' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.prompt.denumire"/>
            :
          </td>
          <td class="text" align="left">
            <html:text styleClass="text-small" property="values.denumire" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admparametriiconfig" key="adm_parametrii_config.searchlabel.tooltip.denumire"/>" />
          </td>
        </tr>
        <!-- Cimpul 'val_implicita' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.prompt.val_implicita"/>
            :
          </td>
          <td class="text" align="left">
            <html:text styleClass="text-small" property="values.val_implicita" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admparametriiconfig" key="adm_parametrii_config.searchlabel.tooltip.val_implicita"/>" />
          </td>
        </tr>
        <!-- Cimpul 'val_curenta' field. -->
        <tr>
          <td valign="top"  align="right">
            <bean:message bundle="admparametriiconfig" key="adm_parametrii_config.prompt.val_curenta"/>
            :
          </td>
          <td class="text" align="left">
            <html:text styleClass="text-small" property="values.val_curenta" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admparametriiconfig" key="adm_parametrii_config.searchlabel.tooltip.val_curenta"/>" />
          </td>
        </tr>
        <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>" />
        <tr>
          <td colspan="2" class="button-row" align="center">
            <input type="hidden" name="method" value="search" />
            <input type="hidden" name="search" value="1" />
            <html:submit styleClass="button">
              <bean:message  bundle="admparametriiconfig" key="adm_parametrii_config.button.search"/>
            </html:submit>
          </td>
        </tr>
      </html:form>
    </table>
    <!-- #############################-->
    <!-- END Sectiune de SEARCH. -->
