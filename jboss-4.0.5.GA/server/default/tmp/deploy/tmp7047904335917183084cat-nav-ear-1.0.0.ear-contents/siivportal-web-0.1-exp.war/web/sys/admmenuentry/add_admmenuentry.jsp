<%@ page import="java.util.*, ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmMenuConstants,
                 ro.uti.apmc.portal.staticcontent.publishing.edhtml.util.EdhtmlConstants" %>
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
 function init(id_menu_entry) {
   idMenu = id_menu_entry;
   var el = document.getElementById("id");
   el.value = idMenu;
   document.getElementById("ids").value = idMenu;
 }

function showMap(id){
  popup=window.open("/siiv/sys/admmenuentry.do?method=showTree&id="+id,"wmtree","height=400,width=500,status=no,toolbar=no,menubar=no,location=no,scrollbars=yes");
}

function setParinte(id,denumire){

      document.getElementById("fk_menu_entry").value=id;
      document.getElementById("menu_parent_name").value=denumire;
      if(popup) popup.close();
}
</script>

<html:form action="admmenuentry.do" styleId="selectForm" method="post" >
  <input type="hidden" id ="method_id" name="method"/>
  <input type="hidden" id="id" name="id"/>
</html:form>

<form name="closeForm" method="post" action="sys/admmenuentry.do">
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
        <logic:empty  name="<%=Constants.ADM_MENU_ENTRY_KEY%>"  property="values.primaryKey" scope="request">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.title.add"/>
        </logic:empty>
        <!-- Titlul ferestrei pentru adaugare. -->
        <logic:notEmpty  name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="values.primaryKey" scope="request">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.title.save"/>
        </logic:notEmpty>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer;" onClick="closeWindow();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="images/close_off.gif" />
      </td>
    </tr>
  </table>
<table width="100%" border="0" >
<tr>
<td valign="top" align="left" width="50%" >
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
    <html:form action="/admmenuentry.do"  styleId="form_AdmMenuEntryForm1" onsubmit="return validateForm_AdmMenuEntryForm(this);"enctype="multipart/form-data">
      <input type="hidden" id="ids" name="ids">
      <html:hidden property="values.id_menu_entry"/>
      <!-- Cimpul 'fk_menu_entry' field. -->
       <html:hidden styleId="fk_menu_entry" property="values.fk_menu_entry"/>

      <logic:notEmpty  name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="values.primaryKey" scope="request">
      <tr>
        <td valign="top" class="label" align="right">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.fk_menu_entry"/>:
        </td>
        <td class="text" align="left">
            <table cellspacing="0" cellpadding="0" border="0">
            <tr>
                <td class="text" align="left">
<%--          <html:hidden property="values.fk_menu_entry" styleId="fk_menu_entry" />--%>
<%--            <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.menu_parent_name" size="22" readonly="true" styleId="menu_parent_name" />--%>
<%--            <img title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.modparent"/>'  src="selectionComponent/resources/images/cauta.gif" style="cursor:pointer" onClick=' showMap(<bean:write name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="values.id_menu_entry" />)' />--%>
         <bean:define id="id_menu" type="java.lang.String"><bean:write name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="values.id_menu_entry" /></bean:define>
         <html:text styleId="menu_parent_name" property="menu_parent_name" styleClass="text_medium"
                     readonly="true" size="30"/>
          <tree:tree action="<%=request.getContextPath()+"/sys/admmenuentry.do"%>" method="showTree" functie="chooseCategorie()"
                     formId="form_AdmMenuEntryForm1" idField="fk_menu_entry" id="<%=id_menu %>" labelField="menu_parent_name" tag="menu_url_label"/>
           </td>
            </tr>
        </table>
      </td>
    </tr>
    </logic:notEmpty>
    <!-- Cimpul 'menu_key' field. -->
     <html:hidden property="values.menu_key" styleId="menu_key"/>
    <!-- Cimpul 'menu_url' field. -->
   <tr valign="top" >
      <td valign="top" class="label" align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_url"/>
        <font color="#336600">
          *
        </font>
        :
      </td>
      <td class="text" align="left" valign="top" >
        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="menu_url_label" size="22" readonly="true" styleId="menu_url_label"/>
        <html:hidden property="values.menu_url_dir" styleId="menu_url_dir" />
      </td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td class="label"><html:radio property="tip_url" onfocus="showDiv('divStatic')" styleId="radioDiv1"  value="S" >Static</html:radio>
           <html:radio property="tip_url" onfocus="showDiv('divDinamic')" styleId="radioDiv2" value="D">Dinamic</html:radio>
      </td>
    </tr>
    <tr>

     <td valign="top" align="right">
     </td>
     <td align="left" >
          <table  id="divStatic" <logic:equal value="S" name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="tip_url"> style="display:block" </logic:equal> <logic:equal value="D" name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="tip_url"> style="display:none" </logic:equal> >
             <tr><td>
               <select onchange="composeurl(this)" size="10">
                 <logic:iterate id="listItem" name="<%= EdhtmlConstants.DIR_LIST_KEY %>">
                  <option value='<bean:write name="listItem"/>'><bean:write name="listItem"/></option>
                 </logic:iterate>
               </select>
             </td></tr>
          </table>
          <table  id="divDinamic" <logic:equal value="D" name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="tip_url"> style="display:block" </logic:equal> <logic:equal value="S" name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="tip_url"> style="display:none" </logic:equal> >
             <tr><td>
               <select onchange="composeurl(this)" size="10">
                 <logic:iterate id="listItemDin" name="listaDirDinamice">
                  <option value='<bean:write property="MENU_URL"  name="listItemDin"/>'><bean:write name="listItemDin" property="MENU_DESCR" /></option>
                 </logic:iterate>
               </select>
             </td></tr>
          </table>
     </td>
    </tr>
    <script>

      function showDiv(divName){
         document.getElementById("divStatic").style.display='none';
         document.getElementById("divDinamic").style.display='none';
         document.getElementById(divName).style.display='block';
      }

      if(document.getElementById("radioDiv1").checked){
        showDiv("divStatic");
      }
      else{
        showDiv("divDinamic");
      }
    </script>
    <!-- Cimpul 'link_menu_name' field. -->
    <tr>
      <td valign="top" class="label" align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.link_menu_name"/>
        <font color="#336600">
          *
        </font>
        :
      </td>
      <td class="text" align="left">
        <html:hidden property="values.link_menu_name" styleId="link_menu_name"/>
        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.menu_name" size="22" styleId="menu_name"/>
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.label.tooltip.link_menu_name"/>" />
      </td>
    </tr>
    <!-- Cimpul 'menu_type' field. -->
     <html:hidden property="values.menu_type" styleId="menu_type" value="1"/>
    <!-- Cimpul 'menu_state' field. -->
     <tr>
      <td valign="top" class="label" align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_state"/>
        :
      </td>
      <td class="text" align="left">
        <html:checkbox errorStyleClass="errorfield" property="values.menu_state_boo" value="true" styleId="menu_state_boo" />
      </td>
    </tr>
    <!-- Cimpul 'menu_order' field. -->
     <tr>
      <td valign="top" class="label" align="right">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.prompt.menu_order"/>
        <font color="#336600">
          *
        </font>
        :
      </td>
      <td class="text" align="left">
        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.menu_order" size="22" styleId="menu_order" />
        <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmenuentry" key="adm_menu_entry.label.tooltip.menu_order"/>" />
      </td>
    </tr>
    <!-- Cimpul 'menu_description' field. -->
     <html:hidden property="values.menu_description" styleId="menu_description"/>
    <!--Campul id_limba-->
      <html:hidden property="values.id_limba" value="<%= Constants.DEFAULT_LANGUAGE%>"/>
    <!-- START Sectiune de BUTOANE. -->
    <logic:empty  name="<%=Constants.ADM_MENU_ENTRY_KEY%>"  property="values.primaryKey" scope="request">
    <!-- Buton adugare. -->
    <tr>
      <td colspan="2" class="button-row" align="center">
        <html:submit styleClass="btn-generic">
          <bean:message bundle="admmenuentry" key="adm_menu_entry.button.add"/>
        </html:submit>
        <html:hidden property="method"  value="add"/>
      </td>
    </tr>
  </logic:empty>
  <logic:notEmpty  name="<%=Constants.ADM_MENU_ENTRY_KEY%>" property="values.primaryKey" scope="request">
  <!-- buton modificare. -->
  <tr>
    <td colspan="2" class="button-row" align="center">
      <html:submit styleClass="btn-generic">
        <bean:message bundle="admmenuentry" key="adm_menu_entry.button.save"/>
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
<html:javascript formName="<%=Constants.ADM_MENU_ENTRY_KEY%>" dynamicJavascript="true" staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>

<div id="select"  style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href="javascript: document.getElementById('method_id').value='showAdd';document.getElementById('selectForm').submit()"><img align="middle"  border="0" src="images/add.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.add"/>'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showEdit';document.getElementById('selectForm').submit()"><img border="0" src="images/edit.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.update" />'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showTranslate';document.getElementById('selectForm').submit()"><img border="0" src="images/translate.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.translate" />'/></a>&nbsp;&nbsp;
   <a href="javascript: document.getElementById('method_id').value='showDelete';document.getElementById('selectForm').submit()"><img border="0" src="images/delete.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.delete" />'/></a>&nbsp;&nbsp;
   <img border="0"  style="cursor:pointer;" onClick="hidePopUp();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="images/x.gif" />
</div>

<div id="selectR"  style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href="javascript: document.getElementById('method_id').value='showAdd';document.getElementById('selectForm').submit()"><img align="middle"  border="0" src="images/add.gif"  title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.record.add"/>'/></a>&nbsp;&nbsp;
   <img border="0"  style="cursor:pointer;" onClick="hidePopUp();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="images/x.gif" />
</div>

