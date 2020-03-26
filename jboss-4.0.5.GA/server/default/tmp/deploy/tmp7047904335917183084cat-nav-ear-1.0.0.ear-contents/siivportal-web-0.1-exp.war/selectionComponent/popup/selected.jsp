<%@ page import="ro.uti.waf.components.selectionComponent.selectionPopup.*,
                 ro.uti.waf.components.selectionComponent.selectionPopup.ejb.*,
                 ro.uti.waf.components.selectionComponent.selectionPopup.type.*,
                 ro.uti.waf.components.selectionComponent.selectionPopup.web.*,
                 org.apache.struts.Globals,
                 java.util.*"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
    try {
%>
<bean:define id="selParams" name="<%=Constants.SELECTION_PARAMS%>" scope="session" type="SelectionCaseParams"/>
<bean:define id="rows" name="<%=Constants.SELECTED_ROWS_DETAILS%>" scope="session" type="java.util.List"/>
<bean:size id="columnsNr" name="<%=Constants.SELECTION_PARAMS%>" property="detailColumns"/>

<%--    <logic:empty name="<%=Constants.SELECTED_ROWS_DETAILS%>">--%>
<%--      <logic:messagesNotPresent>--%>
<%--        <div align="center"><bean:message bundle="<%=Constants.MESSAGE_BUNDLE%>" key="gs.display.result.empty"/></div>--%>
<%--      </logic:messagesNotPresent>--%>
<%--    </logic:empty>--%>

      <table id="sel_table" width="100%" border="0" cellspacing="0" cellpadding="2" class="table">

            <!-- BODY -->
            <%-- iterate through page's rows --%>

        <logic:notEmpty name="<%=Constants.SELECTED_ROWS_DETAILS%>">
          <logic:iterate id="row" indexId="idx" name="rows" type="java.util.Map">
            <tr id = "selrow<%=idx%>" bgcolor="#ffffff">

             <script>
                document.getElementById("selrow<%=idx%>").pk='<bean:write name="row" property="pk"/>';
                columnProperties.push('pk');
             </script>

                <%-- delete row --%>
                <td align="left" class="button-row" style="border-bottom-width: 0px;"><img src="../resources/images/delete_selected.gif" height="9" width="10" style="cursor: pointer;" onclick="removeItem(this)"></td>
                <%-- iterate through rows' columns --%>
              <logic:iterate id="column" indexId="idx1" name="selParams" property="detailColumns" type="ro.uti.waf.components.selectionComponent.selectionPopup.Column">
<%--                <td id="<%=column.getAlias()%>" align="<%=Util.getAlignment(column.getType().getBaseType())%>" class="button-row" style="border-bottom-width: 0px;"><%=Util.decodeColumnValue(request, column, row)%></td>--%>

                <logic:equal value="true" name="column" property="visible">
                    <td id="<%=column.getAlias()%>" align="<%=Util.getAlignment(column.getType().getBaseType())%>" class="button-row"  style="border-bottom-width: 0px;"><%=Util.decodeColumnValue(request, column, row)%></td>
                </logic:equal>

                <logic:equal value="false" name="column" property="visible">
                    <input disabled="true" type="hidden" id="<%=column.getAlias()%>" name="<%=column.getAlias()%>" value="<%=Util.decodeColumnValue(request, column, row)%>"/>
                </logic:equal>

              </logic:iterate>
<%--                <td id="pk" style="display: none"><bean:write name="row" property="pk"/></td>--%>

          <input type="hidden" id="pk" name="pks" value="<bean:write name="row" property="pk"/>"/>

            </tr>
          </logic:iterate>
        </logic:notEmpty> <%-- end no rows --%>


        <logic:empty name="<%=Constants.SELECTED_ROWS_DETAILS%>">
            <tr><td>&nbsp;</td></tr>
        </logic:empty> <%-- end no rows --%>

        </table>
<%
    } catch (Throwable thr) {
        System.err.println("#### selected.jsp ####" );
        thr.printStackTrace();
    }
%>
