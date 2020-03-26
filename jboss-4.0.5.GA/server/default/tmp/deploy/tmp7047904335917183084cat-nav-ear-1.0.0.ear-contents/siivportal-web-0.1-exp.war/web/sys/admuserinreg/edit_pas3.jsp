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
<form name="closeForm"  method="post" action="sys/admuserinreg.do">
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
      if  (method=="prevEdit") {
        m.value="prevEdit";
        el.submit();
      }
      if  (method=="addUser") {
        m.value="addUser";
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
function initChb(id_boo,id) {
 var chb = document.getElementById(id_boo);
 var field = document.getElementById(id);
 if (chb.checked) {
   field.value="1";
 }else {
   field.value="0";
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
    <!-- Titlu pas 3. -->
	  <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prelucrare_roluri"/>
	<!-- END Sectiune de Titlu pagina. -->
  </td>
  <td class="bottom" align="right">
    <img border="0" style="cursor:pointer" onclick="closeWindow();" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' src="<bean:message bundle="mesajsite" key="mesaj_site.button.closeWindow.path"/>" />
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
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="1">
 <!-- START Sectiune de FORM. -->
 <html:form action="/admuserinreg.do"  styleId="fdata">
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

    <html:hidden property="values.id_user_inreg"/>
    <!-- Cimpul 'method' field. -->
    <html:hidden property="method" styleId="m" />
    <!--Camp nr pas-->
    <html:hidden property="pas" value="3"/>
    <!--celelalte campuri din forma care nu sunt aici completate-->
    <!--pas 1-->
    <html:hidden property="values.nume_user"/>
    <html:hidden property="values.prenume_user"/>
    <html:hidden property="values.email_user"/>
    <html:hidden property="values.cd"/>
    <html:hidden property="values.user_login"/>
    <html:hidden property="values.data_cerere"/>
    <html:hidden property="values.user_password"/>
    <html:hidden property="c_user_password"/>
    <html:hidden property="values.serial_number"/>
    <html:hidden property="values.issuer_name"/>
    <html:hidden property="numeSearchLdap"/>
    <html:hidden property="changeAut"/>


    <html:hidden property="values.bi"/>
    <html:hidden property="values.stiri"/>
    <html:hidden property="values.anunturi_opa"/>
    <html:hidden property="values.sig_port"/>
    <html:hidden property="values.prot_med"/>
    <html:hidden property="values.fk_limba_stiri"/>
    <!--pas2-->
    <html:hidden property="t0"/>
    <html:hidden property="t1"/>
    <html:hidden property="t2"/>
    <html:hidden property="t3"/>
    <html:hidden property="t4"/>
    <html:hidden property="t5"/>
    <html:hidden property="t6"/>
    <html:hidden property="t7"/>
    <html:hidden property="t8"/>
    <html:hidden property="t9"/>
  <tr>
    <!--campul is_nom-->
    <html:hidden property="values.is_nom" styleId="is_nom"/>
    <html:hidden property="values.obs_nom"/>
    <td valign="top" class="label" align="right" width="15%" >
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.is_nom"/> :
       <input type="checkbox" id="is_nom_boo" onclick=" initChb('is_nom_boo','is_nom');" disabled="true"/>
       <script type="text/javascript">
          if (document.getElementById("is_nom").value == "1") {
              document.getElementById("is_nom_boo").checked = true;
          }
        </script>
     </td>
     <td width="35%" class="field_text">
       <bean:write  property="values.obs_nom" name="<%=Constants.ADM_USER_INREG_KEY%>"/>
     </td>
  </tr>
  <!-- START Sectiune de BUTOANE. -->
  <tr>
  <td colspan="4" class="button-row" align="center">
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.prev"/>' onclick=' send("prevEdit");'/>&nbsp;&nbsp;
    <input type="button" class="btn-generic" value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.adduser"/>' onclick=' send("addUser");'/>
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
         <logic:iterate id="elementLista" name="<%= AdmUserInregConstants.KEY_LIST_ROL_SEL_TREE%>">
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
         <logic:iterate id="elementLista" name="<%= AdmUserInregConstants.KEY_LIST_ROL_SYS_TREE%>" scope="session">
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
         <logic:iterate id="elementLista" name="<%= AdmUserInregConstants.KEY_LIST_ROL_USER_TREE%>">
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
   <img align="middle" border="0"  style="cursor:pointer;" onclick="hidePopUp();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="composite/image/btn_close_viewedit.gif" />
</div>
<div id="select"  style="background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;">
   <a href='javascript: send("addRol");'><img align="middle"  border="0" src="composite/image/btn_add_composite_record.gif"  title='<bean:message bundle="admuserinreg" key="adm_user_inreg.label.add_rol"/>'/></a>
   <img align="middle"  border="0"  style="cursor:pointer;" onclick="hidePopUp();" title='<bean:message bundle="admmenuentry" key="adm_menu_entry.label.closeWindow"/>' src="composite/image/btn_close_viewedit.gif" />
</div>