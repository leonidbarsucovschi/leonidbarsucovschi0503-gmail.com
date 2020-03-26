<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%
    String tip = request.getParameter("tip_stire");
    String bifa = request.getParameter("bifa");
%>
<table width="100%" cellspacing="0" cellpadding="0" border="0">
    <tr class="page-subtitle">
        <td width="60%">
            <!-- Titlul ferestrei de listare. -->
            <%
                if (tip.compareTo("1") == 0) {
                    if (bifa != null && bifa.equals("false")) {
            %>
            <bean:message bundle="portal" key="portal.stire_general"/>
            <% } else { %>
            <bean:message bundle="portal" key="portal.astazi"/>
            <% }%>
            <%} else if (tip.compareTo("2") == 0) {%>
            <bean:message bundle="portal" key="portal.protectia_mediului"/>
            <%} else if (tip.compareTo("3") == 0) {%>
            <bean:message bundle="portal" key="portal.svm"/>
            <%} else if (tip.compareTo("4") == 0) {%>
            <bean:message bundle="portal" key="portal.politica_ue"/>
            <%} else if (tip.compareTo("5") == 0) {%>
            <bean:message bundle="portal" key="portal.evenimente"/>
            <%}%>

            <!-- END Sectiune de Titlu pagina. -->
        </td>
    </tr>
</table>
<display:table list="<%= Constants.TBL_STIRE_KEY_VIZ_LIST %>" bundle="app" style="report" pagesize="50"
               method="showNewsDetailList" requestURI="portal/vizstire.do">
    <display:params>
        <input type="hidden" name="tip_stire" value="<%=tip%>"/>
        <input type="hidden" name="bifa" value="<%=bifa%>"/>
    </display:params>
    <display:column property="newsRow" bundle="stire" decorator="ro.uti.apmc.portal.components.util.StirePortletDecorator"/>
</display:table>
<!-- sfarsit tabelul cu STIRI -->
