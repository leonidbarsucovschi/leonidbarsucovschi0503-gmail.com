<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<% String replyType = (String)request.getAttribute("replyType");
%>
<form name="closeForm" method="post" action="portal/mesajsite.do">
  <input type="hidden" name="method" value="list" />
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr class="page-title-header">
      <td width="100%" valign="top" class="page-title-header" align="left">
        <!-- Titlul ferestrei pentru modificare. -->
        <bean:message bundle="mesajsite" key="mesaj_site.title.reply" />
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right"><img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' src="images/close_off.gif" /></td>
    </tr>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="1"  class="news-table-content">
    <logic:messagesPresent>
      <tr>
        <td valign="top" colspan="2" class="errormsg" align="center">
          <ul>
            <html:messages id="error">
              <li>
                <bean:write name="error" />
              </li>
            </html:messages>
          </ul>
        </td>
      </tr>
    </logic:messagesPresent>
    <!-- START Sectiune de FORM. -->
    <html:form action="/mesajre.do" onsubmit="return validateForm_MesajReForm(this);" enctype="multipart/form-data">
      <html:hidden property="values.id_mesaj_site" />
      <html:hidden property="checkedString" />

      <!-- Cimpul 'reply_text' field. -->
      <tr>
        <td valign="top"  width="30%" align="right">
          <bean:message bundle="mesajsite" key="mesaj_site.prompt.reply_text" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td class="text" align="left">
          <html:textarea cols="50" rows="20" errorStyleClass="errorfield" styleClass="textarea" property="reply_text" /><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.reply_text"/>" /></td>
      </tr>
      <!-- START Sectiune de BUTOANE. -->
      <tr>
        <td align="center" colspan="2">
          <%--<html:button styleClass="btn-generic" property="back" onclick="closeWindow();">
            <bean:message bundle="mesajsite" key="mesaj_site.button.back" />
          </html:button>--%>
          <html:submit styleClass="btn-generic">
            <bean:message bundle="mesajsite" key="mesaj_site.button.send" />
          </html:submit>
          <html:hidden property="method" value="<%=replyType%>" />
        </td>
      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
    <!-- END Sectiune de FORM. -->
  </table>
</div>
<%--		<!-- Validare cimpuri forma. -->--%>
		<html:javascript formName="form_MesajReForm"
              dynamicJavascript="true"
              staticJavascript="false"/>
        <script language="Javascript1.1" src="staticJavascript.jsp" >
        </script>

