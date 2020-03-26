<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Aug 8, 2005
  Time: 3:57:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*,ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmMenuConstants"%>
<%@ page import="ro.uti.apmc.portal.components.util.StireConstants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
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

<form name="closeForm"  method="post" action="sys/admmenuentry.do"><html:hidden property="method"  value="list"/></form>
<script>
  function closeWindow(){
    document.closeForm.submit();
}
</script>
<div class="table">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr class="page-title-header">
  <td width="100%" valign="top" align="left">&nbsp;
        <!-- Titlul ferestrei pentru adaugare traducere. -->
				<!--m=0 am adauga-->
                <% if ("0".equals((String)request.getAttribute("m"))) {%>
				   <bean:message bundle="admmenuentry" key="adm_menu_entry.title.addtranslate"/>
               <%}else {%>
				<!-- Titlul ferestrei pentru modificare traducere. -->
				   <bean:message bundle="admmenuentry" key="adm_menu_entry.title.edittranslate"/>
                <%}%>
				<!-- END Sectiune de Titlu pagina. -->
				</td>
			<td class="bottom" align="right">
				<img border="0"  style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="stire" key="stire.label.closeWindow"/>' src="images/close_off.gif" />
				</td>
</tr></table>
<table width="100%" border="0">
 <tr>
  <td valign="top" align="left" >
    <script type="text/javascript">
     d = new dTree('d');
     d.add(1,-1,'<bean:message bundle="portal" key="portal.menu.harta_site"/>','javascript: init(1);showPopUpRoot();');
     <logic:iterate id="elementLista" name="<%= AdmMenuConstants.KEY_LIST_MENU_TREE %>">
       d.add(<bean:write name="elementLista" property="id_menu_entry"/>,<bean:write name="elementLista" property="fk_menu_entry"/>,'<bean:write name="elementLista" property="traducere"/>','javascript: init(<bean:write name="elementLista" property="id_menu_entry"/>);showPopUp();');
     </logic:iterate>
     document.write(d);
     d.openAll();
  </script>
  </td>
  <td valign="top" align="left">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
  <logic:messagesPresent>
    <tr>
     <td valign="top" colspan="2" class="msg_error " align="center">
       <ul><html:messages id="error"><li><bean:write name="error"/></li></html:messages></ul>
     </td>
    </tr>
  </logic:messagesPresent>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="1">
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
<table width="100%" border="0" cellpadding="0" cellspacing="1" class="report">
<!-- START Sectiune de FORM. -->
<html:form  action="/admmenuentry.do" onsubmit="return validateForm_AdmMenuEntryForm(this);" method="post" enctype="multipart/form-data">
<html:hidden property="values.id_menu_entry"/>
<html:hidden property="values.fk_menu_entry"/>
<html:hidden property="values.menu_key"/>
<html:hidden property="values.menu_url_dir"/>
<html:hidden property="values.menu_type"/>
<html:hidden property="values.id_menu_entry"/>
<html:hidden property="values.menu_order"/>
<html:hidden property="values.menu_description"/>
<html:hidden property="den_limba"/>
 <!-- Cimpul id_limba field. -->
<tr>
   <td valign="top"  align="right"><bean:message bundle="admmenuentry" key="admmenuentry.prompt.nom_limba"/><font color="#336600">*</font> :
   </td>
   <td class="text" align="left">
   <!--m=0 am adauga-->
    <% if ("0".equals((String)request.getAttribute("m"))) {%>
      <% if ("1".equals((String)request.getAttribute("am"))) {%>
       <html:select property="values.id_limba" styleClass="selectbox">
         <option value=""><bean:message key="select.prompt" bundle="app" /></option>
         <logic:iterate id="listItem" name='<%= StireConstants.KEY_STIRE_NOM_LIMBA %>'>
           <option value='<bean:write name="listItem" property="id_limba" />'><bean:write name='listItem' property="den_limba" /></option>
         </logic:iterate>
       </html:select>
      <% }else {%>
        <bean:message bundle="stire" key="stire.label.romana"/>
      <% }%>
    <%}else {%>
        <html:hidden property="values.id_limba"/>
        <bean:write name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="den_limba" />
    <%}%>
   </td>
</tr>
<!-- Cimpul 'link_titlu' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.link_menu_name"/><font color="#336600">*</font> :
  </td>
<td class="text" align="left">
    <html:hidden property="values.link_menu_name"/>
    <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.menu_name" size="22"/>
    <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.label.tooltip.link_menu_name"/>" />
  </td>
</tr>

<!-- START Sectiune de BUTOANE. -->
		<!--m=0 am adauga-->
       <% if ("0".equals((String)request.getAttribute("m"))) {%>
          <!-- Buton adugare. -->
        <% if ("1".equals((String)request.getAttribute("am"))) {%>
             <tr>
              <td colspan="2" class="button-row" align="center"><html:submit styleClass="btn-generic"><bean:message bundle="stire" key="stire.button.add"/></html:submit><html:hidden property="method"  value="addTranslate"/></td>
             </tr>
         <% }%>
		 <%}else {%>
		   <!-- buton modificare. -->
		   <tr>
           <td colspan="2" class="button-row" align="center"><html:submit styleClass="btn-generic"><bean:message bundle="stire" key="stire.button.save"/></html:submit><html:hidden property="method"  value="updateTranslate"/></td>
        </tr>
		<%}%>
		<!-- END Sectiune de BUTOANE. -->
		</html:form>
		<!-- END Sectiune de FORM. -->
		</table>
        <jsp:include page="list_translate_menu.jsp" flush="true" />
  </td>
 </tr>
</table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="<%=Constants.ADM_MENU_ENTRY_KEY%>" dynamicJavascript="true" staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp" ></script>

<div id="select" style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href="javascript: document.getElementById('method_id').value='showAdd';document.getElementById('selectForm').submit()"><img align="middle"  border="0" src="images/add.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.add"/>'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showEdit';document.getElementById('selectForm').submit()"><img border="0" src="images/edit.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.update" />'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showTranslate';document.getElementById('selectForm').submit()"><img border="0" src="images/translate.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.translate" />'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showDelete';document.getElementById('selectForm').submit()"><img border="0" src="images/delete.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.delete" />'/></a>&nbsp;&nbsp;
   <img border="0"  style="cursor:pointer" onClick="javascript:hidePopUp();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="images/x.gif" />
</div>

<div id="selectR"  style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href="javascript: document.getElementById('method_id').value='showAdd';document.getElementById('selectForm').submit()"><img align="middle"  border="0" src="images/add.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.add"/>'/></a>&nbsp;&nbsp;
   <img border="0"  style="cursor:pointer" onClick="javascript:hidePopUp();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="images/x.gif" />
</div>