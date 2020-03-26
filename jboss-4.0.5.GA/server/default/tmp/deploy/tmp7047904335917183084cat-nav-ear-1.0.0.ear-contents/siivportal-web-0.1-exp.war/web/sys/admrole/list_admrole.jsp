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
<%@ taglib uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<div class="table">
  <%
          String type = request.getParameter("type");
  %>
  <table width="100%" cellspacing="0" cellpadding="0" border="0">
    <tr class="bottom">
      <td width="71%" class="page-subtitle" align="left">
        <!-- Titlul ferestrei de listare. -->
        <% if ("int".equals(type)) {%>
            <bean:message bundle="admrole" key="adm_role.title.list_int"/>
         <%}%>
         <% if ("ext".equals(type)) {%>
            <bean:message bundle="admrole" key="adm_role.title.list_ext"/>
         <%}%>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td>
        <html:form action="admrole.do" styleId="addForm" method="post" >
          <input type="hidden" name="method" value="showAdd" />
          <input type="hidden" name="type" value="<%=type%>"/>
        </html:form>
      </td>
      <td valign="middle" nowrap="true" align="right">
        <input type="image" src="images/add.gif" onClick="javascript:document.getElementById('addForm').submit()" title="<bean:message bundle="admrole" key="adm_role.button.add"/>"/>
        <input type="image" src="images/search.gif"  onClick="javascript:showLayer('search')" class="arrow" border="0" title="<bean:message bundle="admrole" key="adm_role.button.search"/>">
        <input type="image" src="images/refresh.gif" onClick="javascript:refresh();" name="reload_btn" border="0" title='<bean:message  bundle="app" key="message.button.tooltip.refresh"/>'/>
      </td>
    </tr>
  </table>
  <table width="100%">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td colspan="2"  class="msg_error" align="center">
        <html:errors/>
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- #########################3 -->
    <!-- Start Sectiune de SEARCH. -->
    <!-- #############################-->
    <tr>
      <td colspan="2">
<%
        try { 
%>
          <jsp:include page="search_admrole.jsp" flush="true"/>
<%
        } catch (Exception e) {
          e.printStackTrace();
        }
%>
      </td>
    </tr>
    <!-- #############################-->
    <!-- END Sectiune de SEARCH. -->
    <logic:messagesPresent message="true">
      <tr>
        <td colspan="2" class="msg_success" align="center">
          <html:messages id="mesaje" bundle="app" message="true">
            <bean:write name="mesaje" filter="false" ignore="true"/>
          </html:messages>
        </td>
      </tr>
    </logic:messagesPresent>
  </table>
<%
  try { 
%>
    <jsp:include page="list_lista_admrole.jsp" flush="true"/>
<%
  } catch (Exception e) {
    e.printStackTrace();
  }
%>
</div>
<form name="actionForm" method="post" action="sys/admrole.do">
  <input type="hidden" name="method" />
  <input type="hidden" name="page" />
  <input type="hidden" name="prefix" value="/" />
  <input type="hidden" name="id_role" />
</form>
<script>
  function showPrint(name, id) {
    link = "<html:rewrite page="/admrole.do"/>";
    popup = window.open(link + "?method=showPrint&" + name + "=" + id, "_blank", 
            "height=500,width=600,status=no,toolbar=no,menubar=no,location=yes,scrollbars=yes");
  }
</script>
