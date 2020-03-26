<%@ page import="ro.uti.waf.components.selectionComponent.selectionPopup.*,
                 ro.uti.waf.components.selectionComponent.selectionPopup.ejb.*,
                 ro.uti.waf.components.selectionComponent.selectionPopup.type.*,
                 ro.uti.waf.components.selectionComponent.selectionPopup.web.*,
                 java.util.*"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
System.out.println("!!!!!!!!!!!records");
    try {
%>
<bean:define id="selectionCase" name="<%=Constants.SELECTION_PARAMS%>" property="selectionCase"  type="SelectionCase"/>
<bean:define id="selParams" name="<%=Constants.SELECTION_PARAMS%>" scope="session" type="SelectionCaseParams"/>
<bean:define id="rows" name="<%=Constants.DISPLAY_ROWS_DETAILS%>" scope="request" type="java.util.List"/>
<bean:define id="firstRec" name="<%=Constants.VIEW_OBJECT%>" property="startItem" type="java.lang.Integer"/>
<bean:size id="columnsNr" name="<%=Constants.SELECTION_PARAMS%>" property="detailColumns"/>
    <logic:empty name="rows">
        <table align=center width="100%" border="0" cellspacing="0" cellpadding="2">
          <tr>
            <td style="height: 350px;" align="center" valign="middle">
              <b><bean:message bundle="<%=Constants.MESSAGE_BUNDLE%>" key="gs.records.result.empty"/></b>
            </td>
          </tr>
        </table>
    </logic:empty>

    <logic:notEmpty name="<%=Constants.DISPLAY_ROWS_DETAILS%>">
            <!-- PAGINARE (row) -->
            <jsp:include page="navigateBar.jsp" flush="true">
               <jsp:param name="search" value="false"/>
            </jsp:include>

        <table align=center width="100%" border="0" cellspacing="0" cellpadding="2" class="table">
            <!-- HEADER -->
            <tr style="background-color: #0066CC;">
                <%-- ROW NUMBER --%>
                <td class="button-row" style="background-color: #E1DBD1; color:#444444" align="left" width="5%" >
                    &nbsp;<bean:message key="gs.records.rownum.title" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>&nbsp;
                </td>

                <%-- COLUMNS NAMES --%>
            <logic:iterate id="column" indexId="idx" name="selParams" property="detailColumns" type="Column" scope="page">
                <logic:equal value="true" name="column" property="visible">
              <logic:notEmpty name="column" property="width">
                <td class="button-row" style="background-color: #E1DBD1; color:#444444" onclick="setSort(<%=idx%>)" style="cursor: pointer;" width="<bean:write name="column" property="width"/>">
              </logic:notEmpty>

              <logic:empty name="column" property="width">
                <td class="button-row"  style="background-color: #E1DBD1; color:#444444" onclick="setSort(<%=idx%>)" style="cursor: pointer;">
              </logic:empty>
                  &nbsp;

                  <logic:equal value="<%=idx.toString()%>" name="<%=Constants.SELECTION_FORM%>" property="sortColumn" ><u></logic:equal>
<%--                  <%=Util.getMessage(pageContext, column.getLabel(),selectionCase.getBundle(), selectionCase.getModule())%></u>&nbsp;--%>
                   <bean:message bundle="<%=selectionCase.getBundle()%>" key="<%=column.getLabel()%>"/></u>&nbsp; 
                </td>
                </logic:equal>

            </logic:iterate>

                <html:hidden property="caseId"/>
                <html:hidden property="sortColumn" styleId="sortColumn"/>
                <html:hidden property="sortAsc" styleId="sortAsc"/>

            </tr>

            <!-- BODY -->
            <%-- iterate through page's rows --%>
          <logic:iterate id="row" indexId="idx1" name="rows" type="java.util.Map">
            <tr style="cursor: pointer;"
                onmouseover="set_children_bgColor('#FFCC00',this);"
                onmouseout="set_children_bgColor('',this);"
                onclick="addRowToSelection(this);"
                id = "row<%=idx1%>"
                <logic:equal value="false" name="<%=Constants.SELECTION_FORM%>" property="multiple">
                    ondblclick="addRowToSelection(this);sendValues();"
                </logic:equal>
            >
                <input disabled="disabled" type="hidden" id="pk" name="pks" value="<bean:write name="row" property="pk"/>"/>
             <script>
                document.getElementById("row<%=idx1%>").pk='<bean:write name="row" property="pk"/>';
                columnProperties.push('pk');
             </script>
                <%-- row number --%>
                <td align="right" class="button-row" style="border-bottom-width: 0px;"><%=firstRec.intValue() + idx1.intValue()%>.&nbsp;</td>
                <%-- iterate through rows' columns --%>
              <logic:iterate id="column" indexId="idx2" name="selParams" property="detailColumns" type="Column" scope="page">

                <logic:equal value="true" name="column" property="visible">
                    <td id="<%=column.getAlias()%>" align="<%=Util.getAlignment(column.getType().getBaseType())%>" class="button-row"   style="border-bottom-width: 0px;"><%=Util.decodeColumnValue(request, column, row)%></td>
                </logic:equal>
                <logic:equal value="false" name="column" property="visible">
                  <script>
                    document.getElementById("row<%=idx1%>").<%=column.getAlias()%> = "<%=Util.decodeColumnValue(request, column, row)%>";
                    columnProperties.push('<%=column.getAlias()%>');
                  </script>
                    <!--                    <input disabled="disabled" type="hidden" id="<%=column.getAlias()%>" name="<%=column.getAlias()%>" value="<%=Util.decodeColumnValue(request, column, row)%>"/> -->
                    </logic:equal>
              </logic:iterate>
<%--                <td id="pk" style="display: none"><bean:write name="row" property="pk"/></td>--%>
            </tr>
          </logic:iterate>

            <tr>
              <td colspan="<%=(1 + columnsNr.intValue())%>" class="button-row" style="background-color: #E1DBD1;" align="center">
                &nbsp;&nbsp;&nbsp;
              </td>
            </tr>
        </table>
    </logic:notEmpty> <%-- end no rows --%>

<%
    } catch (Throwable e) {
        System.err.println("####ERROR records.jsp ####" );
    e.printStackTrace();
    if(e.getCause() != null){
        System.out.println("!!!!!CAUSE:");
        e.getCause().printStackTrace();
    }
    if(e instanceof ServletException){
        Throwable t = ((ServletException)e).getRootCause();
        if(t!=null){
            System.out.println("!!!!!ServletException ROOTCAUSE:");
            t.printStackTrace();
        }
    }
    }
%>
