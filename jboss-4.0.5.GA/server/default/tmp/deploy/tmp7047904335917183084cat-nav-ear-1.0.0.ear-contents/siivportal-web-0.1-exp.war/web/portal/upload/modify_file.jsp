<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!--java script -->

<script type="text/javascript">
  _editor_url = "/siiv/htmlarea";
  _editor_lang = "en";

  function testClickHtml(slct) {
    indx = slct.selectedIndex;
    val = slct.value;
    file = document.getElementById("theFile");
    file.value = val;
    document.getElementById("folder_name").value
        = document.getElementById("dir").value.toString().concat("/html/").concat(val);
  }
  function testClickImg(slct) {
    indx = slct.selectedIndex;
    val = slct.value;
    file = document.getElementById("theFile");
    file.value = val;
    document.getElementById("folder_name").value
        = document.getElementById("dir").value.toString().concat("/images/").concat(val);
  }
  function testClickDld(slct) {
    indx = slct.selectedIndex;
    val = slct.value;
    file = document.getElementById("theFile");
    file.value = val;
    document.getElementById("folder_name").value
        = document.getElementById("dir").value.toString().concat("/download/").concat(val);
  }
  function addDir() {
    document.getElementById("folder_name").value
        = document.getElementById("dir").value;
  }
  function mouseoverDelete() {
    hideLayer("add");
    showLayer("delete");
    document.getElementById("method1").value = "deleteFile";
  }
  function mouseoverAdd() {
    hideLayer("delete");
    showLayer("add");
    document.getElementById("method1").value = "modifyupload";
  }
  function showOptions(layer,slct) {
    document.getElementById("index_selectat").value = slct.selectedIndex;
    hideLayer(layer);
    showLayer(layer);
  }


</script>
<script type="text/javascript" src="/siiv/htmlarea/htmlarea.js"></script>
<script type="text/javascript" src="/siiv/htmlarea/config-uti.js"></script>

<script type="text/javascript" src="/siiv/script/edhtml.js"></script>
<table width="100%" border="0" cellpadding="0" cellspacing="1">
  <tr class="page-title-header">
    <td width="100%" valign="top" class="bottom" align="left">
      <!-- Titlul ferestrei pentru vizualizare. -->
      <bean:message bundle="upload" key="upload_modify_file.title"/>
      <!-- END Sectiune de Titlu pagina. -->
    </td>
  </tr>
  <tr>
    <td>
      &nbsp;
    </td>
  </tr>
</table>
<html:form method="POST" action="upload.do"
           enctype="multipart/form-data">
  <table width="100%">
  <tr>
    <td colspan="3" align="left" width="100%" class="text-label-bkwhite">
      <bean:message bundle="upload" key="upload.label.directoare"/>:
      <select class="text-label-bkwhite" styleId="dir" id="dir"
              onChange="loadXMLDoc('/siiv/publishing/edit_static_content.do?method=load&root_dir='+this.value,'load');showOptions('delete',this)">
        <option value=""><bean:message key="select.prompt"
                                       bundle="app"/></option>
        <logic:iterate id="listItem" name="listaDirStatice">
          <option value='<bean:write name="listItem"/>'><bean:write
              name="listItem"/></option>
        </logic:iterate>
      </select>
    </td>
  </tr>
  <tr>
    <td align="left" width="33%" class="text-label-bkwhite">
      <bean:message bundle="upload" key="upload.label.pagini"/>:
      <select id="html" size="5" style="width:100%"
              onclick="testClickHtml(this)">
      </select>

    </td>
    <td align="left" width="33%" class="text-label-bkwhite">
      <bean:message bundle="upload" key="upload.label.fisiere_img"/>:
      <select id="img" size="5" style="width:100%" onclick="testClickImg(this)">
      </select>

    </td>
    <td align="left" width="33%" class="text-label-bkwhite">
      <bean:message bundle="upload" key="upload.label.fisiere_download"/>:
      <select id="dld" size="5" style="width:100%" onclick="testClickDld(this)">
      </select>

    </td>
  </tr>
  <html:hidden property="folder_name" styleId="folder_name"/>
  <html:hidden property="index_selectat" styleId="index_selectat"/>
  <html:hidden property="method" styleId="method1" value=""/>
  </table>
  <logic:equal name="viewObject" property="delete" value="<%=String.valueOf(1)%>">
    <div id="delete" class="show">
  </logic:equal>
  <logic:notEqual name="viewObject" property="delete" value="<%=String.valueOf(1)%>">
    <div id="delete" class="noshow">
  </logic:notEqual>


  <table width="100%" id="idTable" >
    <tr>
      <td width="50%" bgcolor="lightgrey"  onclick="mouseoverDelete()">
        <table>
          <tr>
            <td class="text-label-bkwhite">
              <bean:message bundle="upload" key="upload.deleteTitle"/>
            </td>
          </tr>
          <tr>
            <td class="text-label-bkwhite" align="right" width="50%">
              <bean:message bundle="upload" key="upload.fisier"/>:&nbsp;
            </td>
            <td>
              <html:text errorStyleClass="errorfield" styleClass="inputtext"
                         property="theFile" size="22"
                         styleId="theFile"/>
              <html:submit styleClass="btn-generic">
                <bean:message bundle="upload" key="upload.buton.delete"/>
              </html:submit>
            </td>
          </tr>
        </table>
      </td>
      <td width="50%"  onclick="mouseoverAdd()">
        <table>
          <tr>
           <td class="text-label-bkwhite">
             <bean:message bundle="upload" key="upload.addTitle"/>
           </td>
          </tr>
          <tr>
            <td class="text-label-bkwhite" align="right" width="40%">
              <bean:message bundle="upload" key="upload.fisier"/>:&nbsp;
            </td>
            <td align="left" width="60%">
              <html:file styleClass="btn-generic" property="theFile"
                         styleId="theFile"/>
              <img src="images/quest.gif" width="15" height="15"
                   style="cursor:pointer;"
                   title="<bean:message bundle="upload" key="upload.label.fisier"/>"/>
            </td>
          </tr>
          <tr>
            <td align="center" colspan="2" width="50%">
              <html:submit styleClass="btn-generic" disabled="true" onclick="addDir()">
                <bean:message bundle="upload" key="upload.buton.save"/>
              </html:submit>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</div>
  <logic:equal name="viewObject" property="add" value="<%=String.valueOf(1)%>">
    <div id="add" class="show">
  </logic:equal>
  <logic:notEqual name="viewObject" property="add" value="<%=String.valueOf(1)%>">
    <div id="add" class="noshow">
  </logic:notEqual>


  <table width="100%" id="idTable" >
    <tr>
      <td width="50%" onclick="mouseoverDelete()">
        <table>
          <tr>
            <td class="text-label-bkwhite" valign="center">
              <bean:message bundle="upload" key="upload.deleteTitle"/>
            </td>
          </tr>
          <tr>
            <td class="text-label-bkwhite" align="right" width="50%">
              <bean:message bundle="upload" key="upload.fisier"/>:&nbsp;
            </td>
            <td>
              <html:text errorStyleClass="errorfield" styleClass="inputtext"
                         property="theFile" size="22"
                         styleId="theFile"/>
              <html:submit  styleClass="btn-generic" disabled="true">
                <bean:message bundle="upload" key="upload.buton.delete"/>
              </html:submit>
            </td>
          </tr>
        </table>
      </td>
      <td width="50%"   bgcolor="lightgrey"  onclick="mouseoverAdd()">
        <table>
          <tr>
           <td class="text-label-bkwhite" valign="center">
             <bean:message bundle="upload" key="upload.addTitle"/>
           </td>
          </tr>
          <tr>
            <td class="text-label-bkwhite" align="right" width="40%">
              <bean:message bundle="upload" key="upload.fisier"/>:&nbsp;
            </td>
            <td align="left" width="60%">
              <html:file styleClass="btn-generic" property="theFile"
                         styleId="theFile"/>
              <img src="images/quest.gif" width="15" height="15"
                   style="cursor:pointer;"
                   title="<bean:message bundle="upload" key="upload.label.tooltip.fisier"/>"/>
            </td>
          </tr>
          <tr>
            <td align="center" colspan="2" width="50%">
              <html:submit styleClass="btn-generic" onclick="addDir()">
                <bean:message bundle="upload" key="upload.buton.save"/>
              </html:submit>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</div>
</html:form>
<script type="text/javascript">
  document.getElementById("dir").selectedIndex=document.getElementById("index_selectat").value;
  slct = document.getElementById("dir");
  loadXMLDoc('/siiv/publishing/edit_static_content.do?method=load&root_dir='+slct.value,'load');
  if (slct.selectedIndex > 0){
    showOptions('delete',slct);
  }
</script>
