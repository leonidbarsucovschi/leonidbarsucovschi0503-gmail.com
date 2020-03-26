<%--
* @version 0.1
* @author Edward.Moraru@uti.ro
--%>

<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>

<div>
    <display:table list="<%= Constants.TBL_AUDIT_KEY_LIST %>" crt="yes" bundle="app" style="report" pagesize="50"
                   method="list" requestURI="audit/audit.do" decorator="ro.uti.waf.taglib.table.DefaultTableDecorator">
        <display:column property="id_scenariu" bundle="audit" title="audit.prompt.id_scenariu" sortable="id_scenariu"
                        style="sortable"/>
        <%-- display:column property="pk_entitate" bundle="audit" title="audit.prompt.pk_entitate"
                        sortable="pk_entitate" style="sortable"/ --%>
        <%-- display:column property="fk_user" bundle="audit" title="audit.prompt.fk_user"
                        sortable="fk_user" style="sortable"/ --%>
        <display:column property="user_login" bundle="audit" title="audit.prompt.fk_user"
                        sortable="user_login" style="sortable"/>
        <display:column property="ip" bundle="audit" title="audit.prompt.ip"
                        sortable="ip" style="sortable"/>
        <display:column property="cod_operatie" bundle="audit" title="audit.prompt.cod_operatie"
                        sortable="cod_operatie" style="sortable"/>
        <display:column property="data_operatie" bundle="audit" title="audit.prompt.data_operatie"
                        sortable="data_operatie" style="sortable"/>
        <%-- display:column property="xml_description" bundle="audit" title="audit.prompt.xml_description"
                        sortable="xml_description" style="sortable"/ --%>
        <display:column property="atribut1" bundle="audit" title="audit.prompt.atribut1"
                        sortable="atribut1" style="sortable"/>
        <display:column property="atribut2" bundle="audit" title="audit.prompt.atribut2"
                        sortable="atribut2" style="sortable"/>
        <display:column property="atribut3" bundle="audit" title="audit.prompt.atribut3"
                        sortable="atribut3" style="sortable"/>
        <display:column property="atribut4" bundle="audit" title="audit.prompt.atribut4"
                        sortable="atribut4" style="sortable"/>
        <display:column property="atribut5" bundle="audit" title="audit.prompt.atribut5"
                        sortable="atribut5" style="sortable"/>
        <display:column property="view" bundle="audit" width="80" keyprefix="audit"
                        decorator="ro.uti.jpf.waf.components.audit.command.AuditTableDecorator"
                        pkName="id_audit"/>
    </display:table>

    <div id="dwindow"
         style="position:absolute;background-color:#EBEBEB;cursor:pointer;left:120px;top:120px;display:none"
         onMousedown="initializedrag(event)"
         onMouseup="stopdrag()"
         onSelectStart="return false">
        <div align="right" style="background-color:navy">
            <img src="<%=request.getContextPath()%>/images/dragIFrame/max.gif" id="maxname" onClick="maximize()">
            <img src="<%=request.getContextPath()%>/images/dragIFrame/close.gif" onClick="closeit()">
        </div>

        <div id="dwindowcontent" style="height:100%">
            <iframe id="cframe" src="" width=100% height=100%></iframe>
        </div>
    </div>
</div>
