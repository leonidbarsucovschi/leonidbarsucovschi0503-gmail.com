<%--
* @version 0.1
* @author Edward.Moraru@uti.ro
--%>

<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page import="ro.uti.waf.components.audit.model.AuditVO"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="ro.uti.waf.components.audit.config.Entity"%>
<%@ page import="ro.uti.settings.util.ThreadSafeSDFs" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<div class="table">

<html:form action="audit.do" method="post">
    <input type="hidden" name="index"/>
    <html:hidden name="<%=Constants.TBL_AUDIT_KEY%>" property="method"/>
    <input type="hidden"
           name="values.id_scenariu"
           value='<bean:write property="id_scenariu" name="<%=Constants.TBL_AUDIT_KEY%>"/>'/>
    <input type="hidden"
           name="values.pk_entitate"
           value='<bean:write property="pk_entitate" name="<%=Constants.TBL_AUDIT_KEY%>"/>'/>
</html:form>

    <table width="100%" border="0" cellpadding="0" cellspacing="1">
        <tr>
            <td class="page-subtitle" width="90%">
                <%-- Titlul ferestrei pentru stergere. --%>
                <bean:message bundle="audit" key="audit.title.view"/>
                <%-- END Sectiune de Titlu pagina. --%>
            </td>
            <td class="bottom" width="9%" align="center">
                <img src="images/shift_left.gif" style="cursor:pointer;"
                     title='<bean:message bundle="audit" key="audit.label.record.previous"/>'
                     onClick="viewAudit('<bean:write property="id_auditPrev" name="<%=Constants.TBL_AUDIT_KEY%>"/>');"/>
                <img src="images/shift_right.gif" style="cursor:pointer;"
                     title='<bean:message bundle="audit" key="audit.label.record.next"/>'
                     onClick="viewAudit('<bean:write property="id_auditNext" name="<%=Constants.TBL_AUDIT_KEY%>"/>');"/>
            </td>
            <td class="bottom" width="1%" align="right">
                <img border="0" style="cursor:pointer;" onClick="closeWindow();"
                     title='<bean:message bundle="audit" key="audit.label.closeWindow"/>' src="images/close_off.gif"/>
            </td>
        </tr>
    </table>

    <table width="100%" border="0" cellpadding="1" align="center" class="lightrow" cellspacing="1">
        <%-- Sectiune de Afisare Erori. --%>
        <tr>
            <td valign="middle" nowrap="nowrap" colspan="4" class="errormsg" align="center"><html:errors/></td>
        </tr>
        <%-- END Sectiune de Afisare Erori. --%>

        <%-- Cimpul 'id_scenariu' --%>
        <tr>
            <td class="label" width="25%" align="right">
                <bean:message bundle="audit" key="audit.prompt.id_scenariu"/>:
            </td>
            <td class="field_text" colspan="3">
                <bean:write property="id_scenariu" name="<%=Constants.TBL_AUDIT_KEY%>"/>
            </td>
        </tr>

        <%-- Cimpul 'pk_entitate'
        <tr>
            <td width="40%" valign="top" class="label" align="right">
                <bean:message bundle="audit" key="audit.prompt.pk_entitate"/>:
            </td>
            <td class="field_text">
                <bean:write property="pk_entitate" name="<%=Constants.TBL_AUDIT_KEY%>"/>
            </td>
        </tr> --%>

        <tr>
            <%-- Cimpul 'fk_user' --%>
            <td class="label" align="right">
                <bean:message bundle="audit" key="audit.prompt.fk_user"/>:
            </td>
            <td class="field_text" width="25%">
                <%--<bean:write property="fk_user" name="<%=Constants.TBL_AUDIT_KEY%>"/>--%>
                <bean:write property="user_login" name="<%=Constants.TBL_AUDIT_KEY%>"/>
            </td>

            <%-- Cimpul 'data_operatie' --%>
            <td class="label" width="25%" align="right">
                <bean:message bundle="audit" key="audit.prompt.data_operatie"/>:
            </td>
            <td class="field_text" width="25%">
                <bean:define id="data_operatieString" property="data_operatie" name="<%=Constants.TBL_AUDIT_KEY%>" type="java.util.Date" />
                <%=ThreadSafeSDFs.getSdtf().format(data_operatieString)%>
            </td>
        </tr>

        <tr>
            <%-- Cimpul 'ip' --%>
            <td class="label" align="right">
                <bean:message bundle="audit" key="audit.prompt.ip"/>:
            </td>
            <td class="field_text">
                <bean:write property="ip" name="<%=Constants.TBL_AUDIT_KEY%>"/>
            </td>

            <%-- Cimpul 'cod_operatie' --%>
            <td class="label" align="right">
                <bean:message bundle="audit" key="audit.prompt.cod_operatie"/>:
            </td>
            <td class="field_text">
                <bean:write property="cod_operatie" name="<%=Constants.TBL_AUDIT_KEY%>"/>
            </td>
        </tr>

        <tr>
            <%-- Cimpul 'atribut1' --%>
            <td class="label" id="atribut1Label" align="right">
                <bean:message bundle="audit" key="audit.prompt.atribut1"/>:
            </td>
            <td class="field_text" id="atribut1Value">
                <bean:write property="atribut1" name="<%=Constants.TBL_AUDIT_KEY%>"/>
            </td>

            <%-- Cimpul 'atribut2' --%>
            <td class="label" id="atribut2Label" align="right">
                <bean:message bundle="audit" key="audit.prompt.atribut2"/>:
            </td>
            <td class="field_text" id="atribut2Value">
                <bean:write property="atribut2" name="<%=Constants.TBL_AUDIT_KEY%>"/>
            </td>
        </tr>

        <tr>
            <%-- Cimpul 'atribut3' --%>
            <td class="label" id="atribut3Label" align="right">
                <bean:message bundle="audit" key="audit.prompt.atribut3"/>:
            </td>
            <td class="field_text" id="atribut3Value">
                <bean:write property="atribut3" name="<%=Constants.TBL_AUDIT_KEY%>"/>
            </td>

            <%-- Cimpul 'atribut4' --%>
            <td class="label" id="atribut4Label" align="right">
                <bean:message bundle="audit" key="audit.prompt.atribut4"/>:
            </td>
            <td class="field_text" id="atribut4Value">
                <bean:write property="atribut4" name="<%=Constants.TBL_AUDIT_KEY%>"/>
            </td>
        </tr>

        <tr>
            <%-- Cimpul 'atribut5' --%>
            <td class="label" id="atribut5Label" align="right">
                <bean:message bundle="audit" key="audit.prompt.atribut5"/>:
            </td>
            <td class="field_text" id="atribut5Value">
                <bean:write property="atribut5" name="<%=Constants.TBL_AUDIT_KEY%>"/>
            </td>
        </tr>

        <%-- Cimpul 'xml_description'
        <tr>
            <td class="label" align="right">
                <bean:message bundle="audit" key="audit.prompt.xml_description"/>:
            </td>
            <td class="field_text">
                <bean:write property="xml_description" name="<%=Constants.TBL_AUDIT_KEY%>"/>
            </td>
        </tr> --%>
        <tr>
            <td colspan="4" align="center" valign="middle">
<%
    HashMap m = (HashMap)request.getAttribute(Constants.TBL_AUDIT_KEY);
    //System.out.println(m.get("xml_description"));
    out.write((String)m.get("xml_description"));
%>
            </td>
        </tr>
    </table>
</div>

<form name="closeForm" method="post" action="audit/audit.do">
    <html:hidden property="method" value="list"/>
</form>

<script>
    function closeWindow() {
        document.closeForm.submit();
    }

    function viewAudit(indexVal) {
        document.form_AuditForm.index.value = indexVal;
        document.form_AuditForm.submit();
    }

    function changeLabels() {
<%
    Entity e = (Entity)request.getAttribute("entitate");
    //System.out.println("\n\n\n\n\n");
    //System.out.println(e);
%>
        atr1Label = document.getElementById("atribut1Label");
        atr1Val = document.getElementById("atribut1Value");
        setInner(atr1Label, atr1Val, '<%=e.getAttribute1()%>');

        atr2Label = document.getElementById("atribut2Label");
        atr2Val = document.getElementById("atribut2Value");
        setInner(atr2Label, atr2Val, '<%=e.getAttribute2()%>');

        atr3Label = document.getElementById("atribut3Label");
        atr3Val = document.getElementById("atribut3Value");
        setInner(atr3Label, atr3Val, '<%=e.getAttribute3()%>');

        atr4Label = document.getElementById("atribut4Label");
        atr4Val = document.getElementById("atribut4Value");
        setInner(atr4Label, atr4Val, '<%=e.getAttribute4()%>');

        atr5Label = document.getElementById("atribut5Label");
        atr5Val = document.getElementById("atribut5Value");
        setInner(atr5Label, atr5Val, '<%=e.getAttribute5()%>');
    }

    function setInner(atrLabel, atrVal, labelVal) {
        if(labelVal == "") {
            atrLabel.innerHTML = "";
            atrVal.innerHTML = "";
        } else {
            atrLabel.innerHTML = labelVal+ ' :';
        }
    }

    changeLabels();
</script>
