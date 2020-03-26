<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>


<table class="news-table" cellpadding="0" cellspacing="5" width="100%">
    <tr class="news-table-title-tr">
        <td class="news-table-title" width="80%">
            <%--      <bean:write name="<%=Constants.TBL_STIRE_VIZ_KEY%>" property="traducere_obs" filter="false" />--%>
            <%--        &nbsp;--%>
            <bean:write name="<%=Constants.TBL_STIRE_VIZ_KEY%>" property="traducere_titlu" filter="false"/>
        </td>
        <logic:equal value="1" property="tip_stire" name="<%=Constants.TBL_STIRE_VIZ_KEY%>">
            <td class="news-table-title2" width="20%">
                <bean:write name="<%=Constants.TBL_STIRE_VIZ_KEY%>" property="data_publicarii" filter="false"/>
            </td>
        </logic:equal>
      <logic:equal value="4" property="tip_stire" name="<%=Constants.TBL_STIRE_VIZ_KEY%>">
            <td class="news-table-title2" width="20%">
                <bean:write name="<%=Constants.TBL_STIRE_VIZ_KEY%>" property="data_publicarii" filter="false"/>
            </td>
        </logic:equal>
    </tr>
    <tr valign="top">
        <logic:notEmpty name="<%=Constants.TBL_STIRE_VIZ_KEY%>" property="traducere_img">
            <td class="field_text">
                <bean:write name="<%=Constants.TBL_STIRE_VIZ_KEY%>" property="traducere_continut" filter="false"/>

            </td>
            <td valign="top" align="center">
                <img src="<bean:write name="<%=Constants.TBL_STIRE_VIZ_KEY%>" property="traducere_img" filter="false"/>"
                     width="120" height="90" border="0"
                     style="border-bottom:3px; border-right:3px; border-color:#E5E5E5">
            </td>
        </logic:notEmpty>
        <logic:empty name="<%=Constants.TBL_STIRE_VIZ_KEY%>" property="traducere_img">
            <td class="field_text" colspan="2">
                <bean:write name="<%=Constants.TBL_STIRE_VIZ_KEY%>" property="traducere_continut" filter="false"/>
            </td>
        </logic:empty>
    </tr>
    <tr><td align="left">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();"
             title='<bean:message bundle="stire" key="stire.label.back"/>'
             src='<bean:message bundle="stire" key="stire.label.back.img"/>'/>

    </td></tr>
</table>
<form name="closeForm" method="post" action="portal/vizstire.do">
  <logic:empty name="old_method" scope="request">
    <html:hidden property="method" value="showNewsDetailList"/>
  </logic:empty>
  <logic:notEmpty name="old_method" scope="request">
    <html:hidden property="method" value="<%= request.getAttribute("old_method").toString()%>"/>
  </logic:notEmpty>
    <html:hidden property="tip_stire" value="" styleId="tip_stire"/>
    <html:hidden property="bifa" value="" styleId="bifa"/>
</form>
<script>
    function closeWindow() {
        document.closeForm.submit();
    }
    document.getElementById('tip_stire').value = '<%=request.getParameter("tip_stire")%>';
    document.getElementById('bifa').value = '<%=request.getParameter("bifa")%>';
</script>
