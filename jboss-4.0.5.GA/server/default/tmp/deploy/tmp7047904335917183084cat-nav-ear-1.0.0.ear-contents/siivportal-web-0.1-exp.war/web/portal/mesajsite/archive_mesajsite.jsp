<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<% String archiveType = (String)request.getAttribute("archiveType");
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
      <td width="100%" valign="top" class="bottom" align="left">
        &nbsp;
        <!-- Titlul ferestrei pentru modificare. -->
        <bean:message bundle="mesajsite" key="mesaj_site.title.archive" />
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right"><img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' src="images/close_off.gif" /></td>
    </tr>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="1" class="report">
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
    <html:form action="/mesajar.do"  onsubmit="return validateForm_MesajArForm(this);" enctype="multipart/form-data">
        <html:hidden property="values.id_mesaj_site" />
        <html:hidden property="checkedString" />

      <!-- Cimpul 'archive_text' field. -->
      <tr>
        <td valign="top" width="30%" align="right">
          <bean:message bundle="mesajsite" key="mesaj_site.prompt.archive_text" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td class="text" align="left">
          <html:textarea cols="50" rows="20" errorStyleClass="errorfield" styleClass="textarea" property="archive_text" />
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.archive_text"/>" />
        </td>
      </tr>
      <!-- START Sectiune de BUTOANE. -->
      <tr>
        <td align="center" colspan="2">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="mesajsite" key="mesaj_site.button.archive" />
          </html:submit>
          <html:hidden property="method" value="<%=archiveType%>" />
        </td>
        <%--<td class="button-row" align="left">
          <html:button styleClass="button" property="back" onclick="closeWindow();">
            <bean:message bundle="mesajsite" key="mesaj_site.button.back" />
          </html:button>
        </td>--%>

      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
    <!-- END Sectiune de FORM. -->
  </table>
</div>
<%--		<!-- Validare cimpuri forma. -->--%>
		<html:javascript formName="form_MesajArForm"
              dynamicJavascript="true"
              staticJavascript="false"/>
        <script language="Javascript1.1" src="staticJavascript.jsp" >
        </script>

