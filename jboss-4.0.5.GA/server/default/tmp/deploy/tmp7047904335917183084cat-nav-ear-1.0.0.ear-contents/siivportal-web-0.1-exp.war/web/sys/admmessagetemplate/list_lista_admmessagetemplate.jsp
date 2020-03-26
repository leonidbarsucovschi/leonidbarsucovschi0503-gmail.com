<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
    <display:table list="<%=Constants.ADM_MESSAGE_TEMPLATE_KEY_LIST%>" crt="yes" bundle="app" style="report"   pagesize="50" method="list" requestURI="sys/admmessagetemplate.do"
                   decorator="ro.uti.waf.taglib.table.DefaultTableDecorator">
        <%--<display:column  width="0px" property="mkey" bundle="admmessagetemplate" title="adm_message_template.prompt.mkey"  sortable="mkey" style="sortable"/>--%>
        <display:column property="message" bundle="admmessagetemplate" title="adm_message_template.prompt.message"     decorator="ro.uti.apmc.sys.util.AdmMessageTemplateDecorator"/>
        <display:column property="codLimba" width="100px" bundle="admmessagetemplate" title="adm_message_template.prompt.fk_limba" decorator="ro.uti.apmc.sys.util.AdmMessageTemplateDecorator" pkName="id_message_template"/>
        <display:column property="noPrint" bundle="admmessagetemplate" width="80" keyprefix="adm_message_template"     decorator="ro.uti.apmc.sys.util.AdmMessageTemplateDecorator" pkName="id_message_template"/>
    </display:table>
</div>
