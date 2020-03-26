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

 function init(id_menu_entry) {
   idMenu = id_menu_entry;
   var el = document.getElementById("id");
   el.value = idMenu;
 }

</script>

<html:form action="/reportmenu.do" styleId="selectForm" method="post" >
  <input type="hidden" id ="method_id" name="method"/>
  <input type="hidden" id="id" name="id"/>
</html:form>

<div class="table">
  <table width="100%" cellspacing="0" cellpadding="0" border="0">
    <tr class="bottom">
      <td width="71%" class="page-title-header" align="left">
        <!-- Titlul ferestrei de listare. -->
        <b><bean:message bundle="reportmenu" key="report_menu.title.list"/>
        </b><!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="middle" nowrap="true" align="right">
        <!--butonae add,refresh,search-->
      </td>
    </tr>
  </table>
  <table width="100%">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
       <td colspan="2"  class="msg_error" align="center"><html:errors/></td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- #########################3 -->
    <logic:messagesPresent message="true">
      <tr>
        <td colspan="2" class="msg_success" align="center">
          <html:messages id="mesaje" bundle="app" message="true">
            <bean:write name="mesaje" ignore="true"/>
          </html:messages>
        </td>
      </tr>
    </logic:messagesPresent>
  </table>
  <div>
  <script type="text/javascript">
	 d = new dTree('d');
	 <logic:iterate id="menuList" name="<%= Constants.REPORT_MENUS_LIST %>">
		 d.add(<bean:write name="menuList" property="report_menu_id"/>,<bean:write name="menuList" property="fk_parent_id"/>,'<bean:write name="menuList" property="report_menu_name"/>','javascript: init(<bean:write name="menuList" property="report_menu_id"/>);showPopUp();');
	 </logic:iterate>
	 document.write(d);
	 d.openAll();
  </script>
</div>
</div>
<div id="select"  style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href="javascript: document.getElementById('method_id').value='showAdd';document.getElementById('selectForm').submit()"><img align="middle"  border="0" src="images/add.gif"  title='<bean:message bundle="reportmenu" key="report_menu.label.record.add"/>'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showEdit';document.getElementById('selectForm').submit()"><img border="0" src="images/edit.gif"  title='<bean:message bundle="reportmenu" key="report_menu.label.record.update" />'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showDelete';document.getElementById('selectForm').submit()"><img border="0" src="images/delete.gif"  title='<bean:message bundle="reportmenu" key="report_menu.label.record.delete" />'/></a>&nbsp;&nbsp;
   <img border="0"  style="cursor:pointer;" onClick="javascript:hidePopUp();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="images/x.gif" />
</div>

<div id="selectR"  style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href="javascript: document.getElementById('method_id').value='showAdd';document.getElementById('selectForm').submit()"><img align="middle"  border="0" src="images/add.gif"  title='<bean:message bundle="reportmenu" key="report_menu.label.record.add"/>'/></a>&nbsp;&nbsp;
   <img border="0"  style="cursor:pointer;" onClick="javascript:hidePopUp();" title='<bean:message bundle="reportmenu" key="report_menu.label.closeWindow"/>' src="images/x.gif" />
</div>