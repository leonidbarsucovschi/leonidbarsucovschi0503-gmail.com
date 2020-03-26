<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:form action="admmenuentryrole.do" styleId="addForm">
  <input type="hidden" name="method" value="showAdd" />
</html:form>
<div class="table">
  <table width="100%" cellspacing="0" cellpadding="0" border="0">
    <tr class="bottom">
      <td width="71%" class="page-title-header" align="left">
        <!-- Titlul ferestrei de listare. -->
        <b><bean:message bundle="admmenuentryrole" key="adm_menu_entry_role.title.list"/></b>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="middle" nowrap="true" align="right">
        <a href="javascript:document.getElementById('addForm').submit()">
          <img border="0" src="images/add.gif"  title="<bean:message bundle="admmenuentryrole" key="adm_menu_entry_role.button.add"/>" />
        </a>
        <img src="images/search.gif"  onClick="javascript:showLayer('search')" class="arrow" border="0">
        <input type="image" onClick="javascript:refresh();" name="reload_btn" src="images/refresh.gif"  border="0" title='<bean:message  bundle="app" key="message.button.tooltip.refresh"/>' />
      </td>
    </tr>
  </table>
  <table width="100%">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td colspan="2">
        <html:errors/>
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- #########################3 -->
    <!-- Start Sectiune de SEARCH. -->
    <!-- #############################-->
    <tr>
      <td colspan="2">
        <jsp:include page="search_admmenuentryrole.jsp" flush="true"/>
      </td>
    </tr>
    <!-- #############################-->
    <!-- END Sectiune de SEARCH. -->
    <logic:messagesPresent message="true">
      <tr>
        <td colspan="2" class="note" align="center">
          <html:messages id="mesaje" bundle="app" message="true">
            <bean:write name="mesaje" ignore="true"/>
          </html:messages>
        </td>
      </tr>
    </logic:messagesPresent>
  </table>
  <jsp:include page="list_lista_admmenuentryrole.jsp" flush="true"/>
</div>
<form name="actionForm" method="post" action="sys/admmenuentryrole.do">
  <input type="hidden" name="method" />
  <input type="hidden" name="page" />
  <input type="hidden" name="prefix" value="/" />
  <input type="hidden" name="id_menu_entry_role" />
</form>
