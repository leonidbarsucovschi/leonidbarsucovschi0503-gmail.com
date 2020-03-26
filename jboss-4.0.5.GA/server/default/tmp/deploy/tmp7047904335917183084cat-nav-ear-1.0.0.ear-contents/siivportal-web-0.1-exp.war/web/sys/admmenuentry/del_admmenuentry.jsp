<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmMenuConstants" %>
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

<html:form action="admmenuentry.do" styleId="selectForm" method="post" >
  <input type="hidden" id ="method_id" name="method"/>
  <input type="hidden" id="id" name="id"/>
</html:form>


<div class="table">

<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr class="page-title-header">  <td WIDTH="100%" valign="top" align="left">
        <!-- Sectiune de Titlu pagina. -->
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="admmenuentry" key="adm_menu_entry.title.delete"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="top" class="bottom" align="right">
        <img border="0"   style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </td>
    </tr>
</table>

<table width="100%" border="0">
 <tr>
  <td valign="top" align="left">
   <script type="text/javascript">
     d = new dTree('d');
     d.add(1,-1,'<bean:message bundle="portal" key="portal.menu.harta_site"/>');
     <logic:iterate id="elementLista" name="<%= AdmMenuConstants.KEY_LIST_MENU_TREE %>">
       d.add(<bean:write name="elementLista" property="id_menu_entry"/>,<bean:write name="elementLista" property="fk_menu_entry"/>,'<bean:write name="elementLista" property="traducere"/>','javascript: init(<bean:write name="elementLista" property="id_menu_entry"/>);showPopUp();');
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
    <!-- START Sectiune de FORM. -->
    <logic:empty property="id_limba" name="<%=Constants.ADM_MENU_ENTRY_KEY%>">
       <tr>
      <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error " align="center">
      <font color="red">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.label.delete_warning"/>
      </font>
      </td>
    </tr>
    </logic:empty>
    <!-- Cimpul 'menu_url' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_url"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_url" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'link_menu_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.link_menu_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_name" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_type' field. -->

    <!-- Cimpul 'menu_state' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_state"/>
        :
      </td>
      <td class="text">
        <logic:equal value="1" name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="menu_state" ><bean:message bundle="admmenuentry" key="adm_menu_entry.meniu.activ"/></logic:equal>
        <logic:equal value="0" name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="menu_state" ><bean:message bundle="admmenuentry" key="adm_menu_entry.meniu.inactiv"/></logic:equal>
      </td>
    </tr>
    <!-- Cimpul 'menu_order' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_order"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_order" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_description' field. -->

    <!-- Cimpul 'menu_icon' field. -->

    <!-- Cimpul 'fk_menu_entry' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.fk_menu_entry"/>
        :
      </td>
      <td class="text">
        <bean:write  property="menu_parent_name" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'menu_key' field. -->

    <html:form action="/admmenuentry.do"  >
      <input type="hidden" name="values.id_menu_entry" value="<bean:write property="id_menu_entry" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>">
      <input type="hidden" name="values.id_limba" value="<bean:write property="id_limba" name="<%=Constants.ADM_MENU_ENTRY_KEY%>"/>">
      <!-- START Sectiune de BUTOANE. -->
      <!-- buton modificare. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="admmenuentry" key="adm_menu_entry.button.delete"/>
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
<form name="closeForm" method="post" action="sys/admmenuentry.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>

<div id="select"  style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href="javascript: document.getElementById('method_id').value='showAdd';document.getElementById('selectForm').submit()"><img align="middle"  border="0" src="images/add.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.add"/>'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showEdit';document.getElementById('selectForm').submit()"><img border="0" src="images/edit.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.update" />'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showTranslate';document.getElementById('selectForm').submit()"><img border="0" src="images/translate.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.translate" />'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showDelete';document.getElementById('selectForm').submit()"><img border="0" src="images/delete.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.delete" />'/></a>&nbsp;&nbsp;
   <img border="0"  style="cursor:pointer" onClick="javascript:hidePopUp();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="images/x.gif" />
</div>