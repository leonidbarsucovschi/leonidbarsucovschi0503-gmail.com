<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jportal.tld" prefix="us"%>
<html:form action="stire.do" styleId="addForm">
  <input type="hidden" name="method" value="showAdd" />
</html:form>
<div class="table">
  <table width="100%" cellspacing="0" cellpadding="0" border="0">
    <tr>
      <td width="100%" valign="top" align="left" class="page-subtitle">
        <!-- Titlul ferestrei de listare. -->
        <bean:message bundle="stire" key="stire.title.list" />
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="middle" nowrap="true" align="right">
        <us:checkAccess command="stire.do" action="showAdd">
           <a href="javascript:document.getElementById('addForm').submit()"><img border="0" src="images/add.gif"  title="<bean:message bundle="stire" key="stire.button.add"/>" /></a>
        </us:checkAccess>
        <!--<img src="images/search.gif"  onClick="javascript:showLayer('search')" class="arrow" border="0">-->
           <img style="cursor:pointer;" src="images/search.gif"  onClick="javascript:showLayer('search')" class="arrow" border="0" title='<bean:message  bundle="app" key="message.button.tooltip.cauta"/>' />
        <img style="cursor:pointer;" onClick="javascript:refresh();" name="reload_btn" src="images/refresh.gif"  border="0" title='<bean:message  bundle="app" key="message.button.tooltip.refresh"/>' />
      </td>
    </tr>
  </table>
  <table width="100%">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td colspan="2" class="msg_error" align="center">
        <html:errors />
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- #########################3 -->
    <!-- Start Sectiune de SEARCH. -->
    <!-- #############################-->
    <tr>
      <td colspan="2">
        <jsp:include page="search_stire.jsp" flush="true" />
      </td>
    </tr>
    <!-- #############################-->
    <!-- END Sectiune de SEARCH. -->
    <logic:messagesPresent message="true">
      <tr>
        <td colspan="2" class="msg_success" align="center">
          <html:messages id="mesaje" bundle="app" message="true">
            <bean:write name="mesaje" ignore="true" />
          </html:messages>
        </td>
      </tr>
    </logic:messagesPresent>
  </table>
  <jsp:include page="list_lista_stire.jsp" flush="true" />
</div>
<form name="actionForm" method="post" action="portal/stire.do">
  <input type="hidden" name="method" />
  <input type="hidden" name="page" />
  <input type="hidden" name="prefix" value="/" />
  <input type="hidden" name="id_stire" />
</form>
