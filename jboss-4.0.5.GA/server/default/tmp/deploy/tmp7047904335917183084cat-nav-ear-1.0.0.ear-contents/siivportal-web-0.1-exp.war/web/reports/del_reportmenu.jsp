<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>


<script type="text/javascript" src="<%=request.getContextPath()%>/script/sniffer.js" language="JavaScript"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/init.js" language="JavaScript"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/menu.js" language="JavaScript"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/util.js" language="JavaScript"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/admmenu.js" language="JavaScript"></script>

<script>
 function init(id_menu_entry)
 {
   document.getElementById("id").value = id_menu_entry;
 }
</script>

<html:form action="/reportmenu.do" styleId="selectForm" method="post" >
  <input type="hidden" id ="method_id" name="method"/>
  <input type="hidden" id="id" name="id"/>
</html:form>

<form name="closeForm" method="post" action="reports/reportmenu.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>

<div class="table">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr class="page-title-header">  <td WIDTH="100%" valign="top" align="left">
        <!-- Sectiune de Titlu pagina. -->
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="reportmenu" key="report_menu.label.record.delete"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="top" class="bottom" align="right">
        <img border="0"   style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="reportmenu" key="report_menu.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </td>
    </tr>
</table>

<table width="100%" border="0">
 <tr>
  <td valign="top" align="left">
   <script type="text/javascript">
	 d = new dTree('d');
	 <logic:iterate id="menuList" name="<%= Constants.REPORT_MENUS_LIST %>">
		 d.add(<bean:write name="menuList" property="report_menu_id"/>,<bean:write name="menuList" property="fk_parent_id"/>,'<bean:write name="menuList" property="report_menu_name"/>','javascript: init(<bean:write name="menuList" property="report_menu_id"/>);showPopUp();');
	 </logic:iterate>
	 document.write(d);
	 d.openAll();
  </script>
  </td>
  <td valign="top" align="left">

  <!-- Sectiune de Afisare Erori. -->
  <table width="100%" border="0" cellpadding="1" align="center" class="report" cellspacing="1">
    <logic:messagesPresent>
      <tr>
        <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error " align="center">
          <html:errors/>
        </td>
      </tr>
    </logic:messagesPresent>
    <!-- END Sectiune de Afisare Erori. -->
	<tr>
		<td valign="middle" nowrap="nowrap" colspan="2" class="msg_error " align="center">
			<font color="red">
				<bean:message bundle="reportmenu" key="report_menu.label.delete_warning"/>
			</font>
		</td>
	</tr>
    <!-- START Sectiune de FORM. -->
    <!-- Cimpul 'report_menu_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="reportmenu" key="report_menu.prompt.report_menu_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="report_menu_name" name="<%=Constants.REPORT_MENUS_KEY%>"/>
      </td>
    </tr>

    <html:form action="/reportmenu.do"  >
      <input type="hidden" name="values.report_menu_id" value="<bean:write property="report_menu_id" name="<%=Constants.REPORT_MENUS_KEY%>"/>">
      <!-- START Sectiune de BUTOANE. -->
      <!-- buton modificare. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="reportmenu" key="report_menu.label.record.delete"/>
          </html:submit>
          <html:hidden property="method"  value="delete"/>
        </td>
      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
  </table>
  </td>
 </tr>
</table>
</div>
<!-- END Sectiune de FORM. -->


<div id="select"  style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href="javascript: document.getElementById('method_id').value='showAdd';document.getElementById('selectForm').submit()"><img align="middle"  border="0" src="images/add.gif"  title='<bean:message bundle="reportmenu" key="report_menu.label.record.add"/>'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showEdit';document.getElementById('selectForm').submit()"><img border="0" src="images/edit.gif"  title='<bean:message bundle="reportmenu" key="report_menu.label.record.update" />'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showDelete';document.getElementById('selectForm').submit()"><img border="0" src="images/delete.gif"  title='<bean:message bundle="reportmenu" key="report_menu.label.record.delete" />'/></a>&nbsp;&nbsp;
   <img border="0"  style="cursor:pointer;" onClick="javascript:hidePopUp();" title='<bean:message bundle="reportmenu" key="report_menu.label.closeWindow"/>' src="images/x.gif" />
</div>

<div id="selectR"  style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href="javascript: document.getElementById('method_id').value='showAdd';document.getElementById('selectForm').submit()"><img align="middle"  border="0" src="images/add.gif"  title='<bean:message bundle="reportmenu" key="report_menu.label.record.add"/>'/></a>&nbsp;&nbsp;
   <img border="0"  style="cursor:pointer;" onClick="javascript:hidePopUp();" title='<bean:message bundle="reportmenu" key="report_menu.label.closeWindow"/>' src="images/x.gif" />
</div>