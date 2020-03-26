<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:form action="nomlimba.do" styleId="addForm">
  <input type="hidden" name="method" value="showAdd"/>
</html:form>
<div class="table">
  <table width="100%" cellspacing="0" cellpadding="0" border="0">
    <tr>
      <td width="71%" class="page-title-header" align="left">
        <!-- Titlul ferestrei de listare. -->
       <bean:message bundle="nomlimba" key="nom_limba.title.list"/>
       <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="middle" nowrap="true" align="right">

        <input type="image" src="images/add.gif" onMouseOut="this.src='images/add.gif'"
               onMouseOver="this.src='images/add4_over.gif'"
               onClick="javascript:document.getElementById('addForm').submit()"
               title="<bean:message bundle="nomgrupadepozit" key="nom_grupa_depozit.button.add"/>"/>
        <img border="0" style="cursor:pointer;" onMouseOut="this.src='images/search.gif'"
             onMouseOver="this.src='images/search_over.gif'" src="images/search.gif"
             onClick="javascript:showLayer('search')" class="arrow" border="0"
             title="<bean:message bundle="nomgrupadepozit" key="nom_grupa_depozit.button.search"/>"/>
        <input type="image" onMouseOut="this.src='images/refresh.gif'" onMouseOver="this.src='images/refresh_over.gif'"
               border="0" src="images/refresh.gif" onClick="javascript:refresh();" name="reload_btn" border="0"
               title='<bean:message  bundle="app" key="message.button.tooltip.refresh"/>'/>
      </td>
    </tr>
  </table>
  <table width="100%" class="msg_error">
    <tr>
      <td>
        <html:errors/>
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- #########################3 -->
    <!-- Start Sectiune de SEARCH. -->
    <!-- #############################-->
    <tr>
      <td>
        <jsp:include page="search_nomlimba.jsp" flush="true"/>
      </td>
    </tr>
    <!-- #############################-->
    <!-- END Sectiune de SEARCH. -->
    <logic:messagesPresent message="true">
      <tr>

        <td colspan="2" class="msg_success" align="center">
          <html:messages id="mesaje" bundle="app" message="true">
            <bean:write name="mesaje" ignore="true"/>
          </html:messages>
        </td>
      </tr></logic:messagesPresent>
  </table>
  <jsp:include page="list_lista_nomlimba.jsp" flush="true"/>
</div>

<form name="actionForm" method="post" action="nom/nomlimba.do">
  <input type="hidden" name="method"/>
  <input type="hidden" name="id_limba"/>
</form>
