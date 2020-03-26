<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/tree/tree.tld" prefix="tree" %>

<script type="text/javascript" src="<%=request.getContextPath()%>/script/sniffer.js" language="JavaScript"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/init.js" language="JavaScript"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/menu.js" language="JavaScript"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/util.js" language="JavaScript"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/admmenu.js" language="JavaScript"></script>

<script>
 var popup;
 function init(id_menu_entry)
 {
   document.getElementById("id").value = id_menu_entry;
   document.getElementById("ids").value = id_menu_entry;
 }

function setParinte(id,denumire)
{
      document.getElementById("fk_menu_entry").value=id;
      if(popup) popup.close();
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
 <table width="100%" border="0" cellpadding="2" cellspacing="0">
  <tr class="page-title-header">
   <td width="100%" valign="top" align="left">
        &nbsp;
        <!-- Titlul ferestrei pentru modificare. -->
        <logic:empty  name="<%=Constants.REPORT_MENUS_KEY%>"  property="values.primaryKey" scope="request">
          <bean:message bundle="reportmenu" key="report_menu.title.add"/>
        </logic:empty>
        <!-- Titlul ferestrei pentru adaugare. -->
        <logic:notEmpty  name="<%=Constants.REPORT_MENUS_KEY%>" property="values.primaryKey" scope="request">
          <bean:message bundle="reportmenu" key="report_menu.title.save"/>
        </logic:notEmpty>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer;" onClick="closeWindow();" title='<bean:message bundle="reportmenu" key="report_menu.label.closeWindow"/>' src="images/close_off.gif" />
      </td>
    </tr>
  </table>
<table width="100%" border="0" >
<tr>
<td valign="top" align="left" width="50%" >
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
  <table width="100%" border="0" cellpadding="0" cellspacing="1" align="left" >
    <tr><td width="20%" ></td><td width="80%" ></td></tr>
    <logic:messagesPresent>
      <tr>
        <td valign="top" colspan="2" class="msg_error " align="center">
          <ul>
            <html:messages id="error">
              <li>
                <bean:write name="error"/>
              </li>
            </html:messages>
          </ul>
        </td>
      </tr>
    </logic:messagesPresent>
    <!-- START Sectiune de FORM. -->
    <html:form action="/reportmenu.do"  styleId="form_ReportMenuForm" enctype="multipart/form-data">
      <input type="hidden" id="ids" name="ids">
      <html:hidden property="values.report_menu_id"/>
       <html:hidden property="values.fk_parent_id"/>

    <!-- Cimpul 'report_menu_name' field. -->
     <tr>
      <td valign="top" class="label" align="right">
        <bean:message bundle="reportmenu" key="report_menu.prompt.report_menu_name"/>
        <font color="#336600">
          *
        </font>
        :
      </td>
      <td class="text" align="left">
        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.report_menu_name" size="22" styleId="menu_name" />
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="reportmenu" key="report_menu.label.tooltip.report_menu_name"/>" />
      </td>
    </tr>

	<!-- START Sectiune de BUTOANE. -->
	<logic:empty  name="<%=Constants.REPORT_MENUS_KEY%>"  property="values.primaryKey" scope="request">
		<!-- Buton adugare. -->
		<tr>
			<td colspan="2" class="button-row" align="center">
				<html:submit styleClass="btn-generic">
					<bean:message bundle="reportmenu" key="report_menu.button.add"/>
				</html:submit>
				<html:hidden property="method"  value="add"/>
			</td>
		</tr>
	</logic:empty>

	<logic:notEmpty  name="<%=Constants.REPORT_MENUS_KEY%>" property="values.primaryKey" scope="request">
		<!-- buton modificare. -->
		<tr>
			<td colspan="2" class="button-row" align="center">
				<html:submit styleClass="btn-generic">
					<bean:message bundle="reportmenu" key="report_menu.button.save"/>
				</html:submit>
				<html:hidden property="method"  value="update"/>
			</td>
		</tr>
	</logic:notEmpty>
	<!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
</td>
</tr>
</table>
</div>

<!-- Validare cimpuri forma. -->
<html:javascript formName="<%=Constants.REPORT_MENUS_KEY%>" dynamicJavascript="false" staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>

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