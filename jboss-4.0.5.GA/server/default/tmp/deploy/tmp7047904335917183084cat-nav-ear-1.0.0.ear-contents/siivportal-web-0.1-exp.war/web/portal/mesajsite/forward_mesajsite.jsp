<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<% String forwardType = (String)request.getAttribute("forwardType");
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
    <tr>
      <td width="100%" valign="top" class="page-title-header" align="left">
        <!-- Titlul ferestrei pentru modificare. -->
        <bean:message bundle="mesajsite" key="mesaj_site.title.forward" />
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
    <html:form action="/mesajfw.do" onsubmit="return validateForm_MesajFwForm(this);" enctype="multipart/form-data">
      <html:hidden property="values.id_mesaj_site" />
      <html:hidden property="checkedString" />

      <!-- Cimpul 'lista_adrese_forward' field. -->
      <tr>
        <td valign="top"  align="right" width="30%">
          <bean:message bundle="mesajsite" key="mesaj_site.prompt.lista_adrese_forward" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td class="text" align="left">
          <html:text size="200"  errorStyleClass="errorfield" styleClass="text-small" property="lista_adrese_forward" />
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.lista_adrese_forward"/>" />
        </td>
      </tr>

       <tr colspan="2">
        <td valign="top" align="center">
            <font color="#336600" size="1" >
                <bean:message bundle="mesajsite" key="mesaj_site.mesaj.separator_adrese" />
            </font>
        </td>
      </tr>
      <!-- Cimpul 'forward_text' field. -->
      <tr>
        <td valign="top"  align="right">
          <bean:message bundle="mesajsite" key="mesaj_site.prompt.forward_text" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td class="text" align="left">
          <html:textarea cols="50" rows="20" errorStyleClass="errorfield" styleClass="textarea" property="forward_text" />
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.forward_text"/>" />
        </td>
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
          <html:hidden property="method" value="<%=forwardType%>" />
        </td>

      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
    <!-- END Sectiune de FORM. -->
  </table>
</div>
<%--		<!-- Validare cimpuri forma. -->--%>
		<html:javascript formName="form_MesajFwForm"
               dynamicJavascript="true"
               staticJavascript="false"/>
        <script language="Javascript1.1" src="staticJavascript.jsp" >
        </script>
