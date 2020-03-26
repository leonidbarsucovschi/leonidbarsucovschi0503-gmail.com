<%@ page import="java.util.Map,
                 java.util.Set,
                 ro.uti.waf.components.selectionComponent.selectionPopup.*,
                 ro.uti.waf.components.selectionComponent.selectionPopup.ejb.*,
                 ro.uti.waf.components.selectionComponent.selectionPopup.type.*,
                 ro.uti.waf.components.selectionComponent.selectionPopup.web.*,
                 org.apache.struts.Globals"%>
<%@ page contentType="text/html; charset=iso-8859-2"%>
<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<%
    try {
%>

<!-- Tabela filtre -->
<table border="1" bordercolor="white" cellspacing="0" cellpadding="2" width="80%">
  <tr>
    <td class="button-row" style="background-color: #0066CC; color:#FFFFFF; border-bottom-width: 0px;" colspan="4">
     &nbsp;<bean:message bundle="<%=Constants.MESSAGE_BUNDLE%>" key="gs.filters.title"/>
    </td>
  </tr>
<bean:define id="selectionCase" name="<%=Constants.SELECTION_PARAMS%>" property="selectionCase"  type="SelectionCase"/>

<logic:iterate id="searchColumnData" name="<%=Constants.SELECTION_FORM%>" property="searchColumns" indexId="idx" type="SearchColumnData">

<%
    String idxProp = "searchColumnData[" + idx +"]";
    String id = "filter" + idx;
    boolean disabled = !searchColumnData.isSelected();
    String visibility1 = searchColumnData.getOperator().endsWith(SearchColumn.op_is_null) ? "hidden" : "visible";
    String visibility2 = searchColumnData.getOperator().endsWith(SearchColumn.op_between) ? "visible" : "hidden";
%>
<logic:messagesPresent property="<%=idxProp%>">
  <tr>
    <td valign="middle" nowrap="nowrap" colspan="4" class="errormsg" align="left">
      <html:errors property="<%=idxProp%>" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>
<%--      <img src="<html:rewrite page="/resources/warn.gif"/>" border="0" align="absmiddle">--%>
    </td>
  </tr>
</logic:messagesPresent>

  <tr>
    <td class="button-row" style="border-bottom-width: 0px; background-color:#E1DBD1">
      <html:checkbox property='<%=idxProp+".selected"%>' styleId="<%=String.valueOf(idx)%>"
            onclick='<%=(searchColumnData.getSearchColumn().isMandatory() ? "return false;" : "filterCheck(this);")%>'/>
    </td>
    <td nowrap class="button-row" style="border-bottom-width: 0px; background-color:#E1DBD1">
       &nbsp;
<%--   <%=Util.getMessage(pageContext, searchColumnData.getSearchColumn().getLabel(),selectionCase.getBundle(), selectionCase.getModule())%>--%>
       <bean:message bundle="<%=selectionCase.getBundle()%>" key="<%=searchColumnData.getSearchColumn().getLabel()%>"/>
       &nbsp;
    </td>
    <td align="left" nowrap class="button-row" style="border-bottom-width: 0px; background-color:#E1DBD1">
      <logic:notEqual name="searchColumnData" property="searchColumn.type.name" value="<%=BaseType.BOOLEAN.getName()%>">
      <%String onChangeString = "operationChanged(this,'tbl_"+idx.toString()+"')";%>
        <html:select property='<%=idxProp+".operator"%>' styleId="<%=id%>" styleClass="text" style="width:75" onchange='<%=onChangeString%>' disabled="<%=disabled%>">
          <logic:iterate id="operator" name="searchColumnData" property="searchColumn.operators" type="java.lang.String">
                <html:option value="<%=operator%>">
<%--                   <%=Util.getMessage(pageContext, "gs.filter.operator."+operator, Constants.MESSAGES_KEY, Constants.MODULE_PREFIX)%>--%>
                   <bean:message bundle="<%=Constants.MESSAGES_KEY%>" key="<%="gs.filter.operator."+operator%>"/>  
                 </html:option>
          </logic:iterate>
        </html:select>
      </logic:notEqual>
      <logic:equal name="searchColumnData" property="searchColumn.type.name" value="<%=BaseType.BOOLEAN.getName()%>">
        &nbsp;
      </logic:equal>
    </td>
    <td align="left" nowrap class="button-row" style="border-bottom-width: 0px; background-color:#E1DBD1">
       <table id="tbl_<%=idx.toString()%>" cellspacing="0" cellpadding="0" border="0">
        <tr>
         <td style="visibility: <%=visibility1%>;">
          &nbsp;

<%  // FILTRE AVAND UN TIP DE BAZA
    if (searchColumnData.getSearchColumn().getType().isBaseType()) {
%>

  <logic:equal name="searchColumnData" property="searchColumn.type.name" value="<%=BaseType.STRING.getName()%>">
          <html:text  property='<%=idxProp+".val1"%>' styleId="<%=id%>" size="30" maxlength="100" styleClass="inputtext" disabled="<%=disabled%>"/>
         </td>
         <td style="visibility: <%=visibility2%>;">
          <html:hidden property='<%=idxProp+".val2"%>' value=""/>
  </logic:equal>

  <logic:equal name="searchColumnData" property="searchColumn.type.name" value="<%=BaseType.INTEGER.getName()%>">
          <html:text  property='<%=idxProp+".val1"%>' styleId="<%=id%>" size="10" maxlength="100" styleClass="inputtext" disabled="<%=disabled%>" style="text-align:right;"/>
         </td>
         <td style="visibility: <%=visibility2%>;">
          &nbsp;<bean:message bundle="<%=Constants.MESSAGE_BUNDLE%>" key="gs.filter.and"/>&nbsp;
          <html:text  property='<%=idxProp+".val2"%>' styleId="<%=id%>" size="10" maxlength="100" styleClass="inputtext" disabled="<%=disabled%>" style="text-align:right;"/>
  </logic:equal>

  <logic:equal name="searchColumnData" property="searchColumn.type.name" value="<%=BaseType.NUMBER.getName()%>">
          <html:text  property='<%=idxProp+".val1"%>' styleId="<%=id%>" size="10" maxlength="100" styleClass="inputtext" disabled="<%=disabled%>" style="text-align:right;"/>
         </td>
         <td style="visibility: <%=visibility2%>;">
          &nbsp;<bean:message bundle="<%=Constants.MESSAGE_BUNDLE%>" key="gs.filter.and"/>&nbsp;
          <html:text  property='<%=idxProp+".val2"%>' styleId="<%=id%>" size="10" maxlength="100" styleClass="inputtext" disabled="<%=disabled%>" style="text-align:right;"/>
  </logic:equal>

  <logic:equal name="searchColumnData" property="searchColumn.type.name" value="<%=BaseType.DATE.getName()%>">
 <script type="text/javascript">
    shortDateFormat = "<bean:message bundle='<%=Constants.MESSAGE_BUNDLE%>' key='format.date.short'/>";
 </script>

          <html:text styleClass="inputtext" property='<%=idxProp+".val1"%>' styleId="<%=id%>" disabled="<%=disabled%>" readonly="false" size="10"/>
          <img type="image" src="../resources/images/cal.gif" align="absmiddle" id="<%=id%>" <%=disabled?"disabled='disabled'":""%>
                 onclick="popUpCalendar(this, document.<%=Constants.SELECTION_FORM%>.<%=id%>[1], shortDateFormat ,0);return false;"
                 style="font-size:11px;cursor:pointer;"/>
         </td>
         <td style="visibility: <%=visibility2%>;">
          &nbsp;<bean:message bundle="<%=Constants.MESSAGE_BUNDLE%>" key="gs.filter.and"/>&nbsp;
          <html:text styleClass="inputtext" property='<%=idxProp+".val2"%>' styleId="<%=id%>" disabled="<%=disabled%>" readonly="false" size="10"/>
          <img type="image" src="../resources/images/cal.gif" align="absmiddle" id="<%=id%>" <%=disabled?"disabled='disabled'":""%>
                 onclick="popUpCalendar(this, document.<%=Constants.SELECTION_FORM%>.<%=id%>[2], shortDateFormat,0);return false;"
                 style="font-size:11px;cursor:pointer;"/>
  </logic:equal>

  <logic:equal name="searchColumnData" property="searchColumn.type.name" value="<%=BaseType.TIMESTAMP.getName()%>">
          <html:text styleClass="inputtext" property='<%=idxProp+".val1"%>' styleId="<%=id%>" disabled="<%=disabled%>" readonly="false" size="20"/>
          <img type="image" src="../resources/images/cal.gif" align="absmiddle" id="<%=id%>" <%=disabled?"disabled='disabled'":""%>
                 onclick="popUpCalendar(this, document.<%=Constants.SELECTION_FORM%>.<%=id%>[1], '<bean:message bundle="<%=Constants.MESSAGE_BUNDLE%>" key="format.timestamp"/>',1);return false;"
                 style="font-size:11px;cursor:pointer;"/>
         </td>
         <td style="visibility: <%=visibility2%>;">
          &nbsp;<bean:message bundle="<%=Constants.MESSAGE_BUNDLE%>" key="gs.filter.and"/>&nbsp;
          <html:text styleClass="inputtext" property='<%=idxProp+".val2"%>' styleId="<%=id%>" disabled="<%=disabled%>" readonly="false" size="20"/>
          <img type="image" src="../resources/images/cal.gif" align="absmiddle" id="<%=id%>" <%=disabled?"disabled='disabled'":""%>
                 onclick="popUpCalendar(this, document.<%=Constants.SELECTION_FORM%>.<%=id%>[2], '<bean:message bundle="<%=Constants.MESSAGE_BUNDLE%>" key="format.timestamp"/>',1);return false;"
                 style="font-size:11px;cursor:pointer;"/>
  </logic:equal>

  <logic:equal name="searchColumnData" property="searchColumn.type.name" value="<%=BaseType.BOOLEAN.getName()%>">
          <html:radio value="true" property='<%=idxProp+".val1"%>' styleId="<%=id%>" styleClass="radio" disabled="<%=disabled%>">
              <bean:message bundle="<%=Constants.MESSAGE_BUNDLE%>" key="gs.value.yes"/>
          </html:radio>
          &nbsp;
          <html:radio value="false" property='<%=idxProp+".val1"%>' styleId="<%=id%>" styleClass="radio" disabled="<%=disabled%>">
              <bean:message bundle="<%=Constants.MESSAGE_BUNDLE%>" key="gs.value.no"/>
          </html:radio>
         </td>
         <td style="visibility: <%=visibility2%>;">
          &nbsp;
          <html:hidden property='<%=idxProp+".val2"%>' value=""/>
   </td>
  </logic:equal>

<%  // PARAMETRI AVAND UN TIP DERIVAT
    } else {
        String multiple = searchColumnData.getOperator().endsWith(SearchColumn.op_in) ? "yes" : null;
        String selectSize = multiple != null ? "4" : "1";
%>
         <html:select property='<%=idxProp+".val"%>' disabled="<%=disabled%>" styleId="<%=id%>" multiple="<%=multiple%>" size="<%=selectSize%>" styleClass="inputtext">
             <html:optionsCollection  name="searchColumnData" property="searchColumn.type.values" value="key" label="value"/>
         </html:select>
        </td>
        <td style="visibility: hidden;">
         &nbsp;
         <html:hidden property='<%=idxProp+".val2"%>' value=""/>
<%
    }
%>
         </td>
        </tr>
       </table>
    </td>
  </tr>
</logic:iterate>

  <tr>
    <td colspan="4" class="button-row" align="center" style="background-color: #FFCC00;">&nbsp;
      
    </td>
  </tr>

    <tr>
      <td colspan=4 class="tableHeader" style="background-color:#FFFFFF ">
        <center>
          <input value="Rezultate"
                 class="button" type="button" onclick="parent.selectionWindow=myWindow;document.getElementById('theForm').submit();">
        </center>
      </td>
    </tr>

</table>
<%
    } catch (Throwable thr) {
        System.err.println("#### filters.jsp ####" );
        thr.printStackTrace();
    }
%>
