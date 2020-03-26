<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Mar 8, 2006
  Time: 2:34:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.waf.web.action.JPortalActionContext,
                 ro.uti.apmc.sys.util.AdmUserInregConstants"%>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/sniffer.js" language="JavaScript"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/init.js" language="JavaScript"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/menu.js" language="JavaScript"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/util.js" language="JavaScript"></script>
<form name="closeForm"  method="post" action="sys/admuserext.do">
 <html:hidden property="method"  value="list"/>
</form>
<script>
var popup;
function closeWindow(){
        document.closeForm.submit();
 }
 function send(method) {
      var el = document.getElementById('fdata');
      var m = document.getElementById('m');
      if  (method=="addRoles") {
        m.value="addRoles";
        el.submit();
      }
      if  (method == "addRol") {
        m.value="addRol";
        el.submit();
      }
      if  (method == "delRol") {
        m.value="delRol";
        el.submit();
      }

 }
function init(idaf,paf,tip,idp,id) {
   var el_idaf = document.getElementById("idaf");
   var el_paf = document.getElementById("paf");
   var el_tip = document.getElementById("tip");
   var el_idp = document.getElementById("idp");
   var el_id = document.getElementById("id");
   el_idaf.value = idaf;
   el_paf.value = paf;
   el_tip.value = tip;
   el_idp.value = idp
   el_id.value = id;
}
function close() {
 if(popup) popup.close();
}
</script>
<div class="table">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr class="page-subtitle">
  <td width="100%" valign="top" align="left">&nbsp;
    <!-- Titlu roluri. -->
	  <bean:message bundle="admuserext" key="adm_user_ext.prompt.roluri"/>
	<!-- END Sectiune de Titlu pagina. -->
  </td>
  <td class="bottom" align="right">
    <img border="0" style="cursor:pointer" onClick="closeWindow();" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' src="<bean:message bundle="mesajsite" key="mesaj_site.button.closeWindow.path"/>" />
  </td>
 </tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="1">
  <logic:messagesPresent>
   <tr>
     <td valign="top" colspan="2" class="msg_error " align="center">
       <ul><html:messages id="error"><li><bean:write name="error"/></li></html:messages></ul>
     </td>
   </tr>
 </logic:messagesPresent>
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
<table width="100%" border="0" cellpadding="0" cellspacing="1">
 <!-- START Sectiune de FORM. -->
 <html:form action="/admuserext.do"  styleId="fdata">
 <!--Campurile hidden -->

   <!--id rol-->
    <input type="hidden" id="id" name="id"/>
    <!--id-ul de afisare-->
    <input type="hidden" id="idaf" name="idaf"/>
    <!--id-ul parintelui la afisare in sys si user-->
    <input type="hidden" id="paf" name="paf"/>
    <!--id-ul parintelui la afisare in sel-->
    <input type="hidden" id="idp" name="idp"/>
    <!--tipul de rol-->
    <input type="hidden" id="tip" name="tip"/>

    <!-- Cimpul 'method' field. -->
    <html:hidden property="method" styleId="m" />

    <html:hidden property="values.id_user_ext"/>

    <html:hidden property="values.fk_user"/>
    <html:hidden property="values.fk_limba"/>
    <html:hidden property="values.nume"/>
    <html:hidden property="values.prenume"/>
    <html:hidden property="values.cd"/>
    <html:hidden property="values.email"/>
    <html:hidden property="values.user_login"/>
  <!-- Cimpul 'nume' field. -->
  <tr>
   <td valign="top" class="label" align="right" width="50%" >
     <bean:message bundle="admuserext" key="adm_user_ext.prompt.nume"/>:
   </td>
   <td class="field_text" align="left" width="50%" >
    <bean:write  property="values.nume" name="<%=Constants.ADM_USER_EXT_KEY%>"/>
   </td>
  </tr>
  <!-- Cimpul 'prenume' field. -->
  <tr>
   <td valign="top" class="label" align="right">
     <bean:message bundle="admuserext" key="adm_user_ext.prompt.prenume"/> :
   </td>
     <td class="field_text" align="left" >
       <bean:write  property="values.prenume" name="<%=Constants.ADM_USER_EXT_KEY%>"/>
     </td>
  </tr>
  <!--campul user_login-->
  <tr>
    <td valign="top" class="label" align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_login"/> :
    </td>
    <td class="field_text" align="left">
      <bean:write  property="values.user_login" name="<%=Constants.ADM_USER_EXT_KEY%>"/>
    </td>
  </tr>
  <!-- START Sectiune de BUTOANE. -->
  <tr>
  <td colspan="2" class="button-row" align="center">
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserext" key="adm_user_ext.button.addroles"/>' onClick=' send("addRoles");'/>
  </td>
 </tr>
  <!-- END Sectiune de BUTOANE. -->
 </html:form>
 <!-- END Sectiune de FORM. -->
</table>
<table width="100%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="20%" height="22">&nbsp;</td>
    <td width="30%">&nbsp;</td>
    <td width="10%">&nbsp;</td>
    <td width="40%">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td class="page-subtitle"><bean:message bundle="admuser" key="adm_user.roles.selected_roles" /></td>
    <td>&nbsp;</td>
    <td class="page-subtitle"><bean:message bundle="admuser" key="adm_user.roles.roles_tree" /></td>
  </tr>
  <tr>
   <td>&nbsp;</td>
   <td valign="top" >
    <!--Aici este arborele cu rolurile selectate-->
      <script type="text/javascript">
         var rolSel = new dTree('rolSel');
         rolSel.add(1,-1,'<bean:message bundle="admuserinreg" key="adm_user_inreg.menu.harta_rol"/>','javascript: nothing();');
         <logic:iterate id="elementLista" name="<%= AdmUserInregConstants.KEY_LIST_ROL_SEL_TREE_EXT%>">
            rolSel.add(<bean:write name="elementLista" property="IDAF"/>,<bean:write name="elementLista" property="IDP"/>,'<bean:write name="elementLista" property="ROLE_NAME"/>','javascript: init(<bean:write name="elementLista" property="IDAF"/>,<bean:write name="elementLista" property="PAF"/>,<bean:write name="elementLista" property="ROLE_TYPE"/>,<bean:write name="elementLista" property="IDP"/>,<bean:write name="elementLista" property="ID_ROLE"/>);showPopUpRoot();','<bean:write name="elementLista" property="ROLE_DESCRIPTION"/>','', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif')
         </logic:iterate>
         document.write(rolSel);
         rolSel.closeAll();
      </script>
    <!--End arbore cu rolurile selectate-->
   </td>
   <td>&nbsp;</td>
   <td valign="top">
     <!--Aici este arborele cu rolurile din baza de date-->
      <table width="100%">
        <tr valign="top">
         <td class="label" valign="top" >
           <input type="radio" name="tipRol" id="selectRol" value="0" checked="true" onclick="showDiv(0);" /><bean:message bundle="admuser" key="adm_user.roles.system"/>
           <input type="radio" name="tipRol" id="selectRol" value="1" onclick="showDiv(1);"/><bean:message bundle="admuser" key="adm_user.roles.user"/>
         </td>
        </tr>
        <tr valign="top">
          <td style="vertical-align:top" valign="top" >
            <!--Aici este arborele cu roluri system-->
            <table id="tr1" style="display:block" width="100%">
              <tr><td>
                <div>
      <script type="text/javascript">
         var rolSys = new dTree('rolSys');
         rolSys.add(1,-1,'<bean:message bundle="admuser" key="adm_user.roles.system"/>','javascript: nothing();');
         <logic:iterate id="elementLista" name="<%= AdmUserInregConstants.KEY_LIST_ROL_SYS_TREE_EXT%>" scope="session">
            rolSys.add(<bean:write name="elementLista" property="IDAF"/>,<bean:write name="elementLista" property="PAF"/>,'<bean:write name="elementLista" property="ROLE_NAME"/>','javascript: init(<bean:write name="elementLista" property="IDAF"/>,<bean:write name="elementLista" property="PAF"/>,<bean:write name="elementLista" property="ROLE_TYPE"/>,<bean:write name="elementLista" property="IDP"/>,<bean:write name="elementLista" property="ID_ROLE"/>);showPopUp();','<bean:write name="elementLista" property="ROLE_DESCRIPTION"/>','', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif')
         </logic:iterate>
         document.write(rolSys);
         rolSys.closeAll();
      </script>
                </div>
              </td></tr>
            </table>
            <!--End arbore cu roluri system-->
            <!--Aici este arborele cu roluri definite de utilizatori-->
            <table  width="100%" id="tr2" style="display:none" >
              <tr><td>
               <div>
      <script type="text/javascript">
         var rolUser = new dTree('rolUser');
         rolUser.add(1,-1,'<bean:message bundle="admuser" key="adm_user.roles.user"/>','javascript: nothing();');
         <logic:iterate id="elementLista" name="<%= AdmUserInregConstants.KEY_LIST_ROL_USER_TREE_EXT%>">
            rolUser.add(<bean:write name="elementLista" property="IDAF"/>,<bean:write name="elementLista" property="PAF"/>,'<bean:write name="elementLista" property="ROLE_NAME"/>','javascript: init(<bean:write name="elementLista" property="IDAF"/>,<bean:write name="elementLista" property="PAF"/>,<bean:write name="elementLista" property="ROLE_TYPE"/>,<bean:write name="elementLista" property="IDP"/>,<bean:write name="elementLista" property="ID_ROLE"/>);showPopUpRolUser();','<bean:write name="elementLista" property="ROLE_DESCRIPTION"/>','', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif')
         </logic:iterate>
         document.write(rolUser);
         rolUser.closeAll();
      </script>
               </div>
              </td></tr>
            </table>
            <!--End arbore cu roluri definite de utilizatori-->
          </td>
        </tr>
      </table>
<script type="text/javascript">
function showDiv(id){
    if(id == 0) {
      document.getElementById("tr1").style.display='inline';
      document.getElementById("tr2").style.display='none';
    }else{
      document.getElementById("tr1").style.display='none';
      document.getElementById("tr2").style.display='inline';
    }
}
</script>
     <!--End arbore c uroluri din sistem-->
   </td>
  </tr>
</table>
</div>
<div id="selectR"  style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href='javascript: send("delRol");'><img align="middle"  border="0" src="composite/image/btn_delete_composite_record.gif"  title='<bean:message bundle="admuserinreg" key="adm_user_inreg.label.del_rol"/>'/></a>
   <img align="middle" border="0"  style="cursor:pointer;" onClick="hidePopUp();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="composite/image/btn_close_viewedit.gif" />
</div>
<div id="select"  style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href='javascript: send("addRol");'><img align="middle"  border="0" src="composite/image/btn_add_composite_record.gif"  title='<bean:message bundle="admuserinreg" key="adm_user_inreg.label.add_rol"/>'/></a>
   <img align="middle"  border="0"  style="cursor:pointer;" onClick="hidePopUp();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="composite/image/btn_close_viewedit.gif" />
</div>