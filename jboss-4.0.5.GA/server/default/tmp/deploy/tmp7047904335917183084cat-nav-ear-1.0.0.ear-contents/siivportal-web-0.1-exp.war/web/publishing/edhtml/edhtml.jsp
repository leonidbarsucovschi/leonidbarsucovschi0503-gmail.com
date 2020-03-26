<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!--java script -->

 <script type="text/javascript">
  _editor_url = "/siiv/htmlarea";
  _editor_lang = "en";
 </script>
 <script type="text/javascript" src="/siiv/htmlarea/htmlarea.js"></script>
 <script type="text/javascript" src="/siiv/htmlarea/config-uti.js"></script>

 <script language="javascript" type="text/javascript" src="/siiv/tinymce/jscripts/tiny_mce/tiny_mce_src.js"></script>
 <script type="text/javascript">
tinyMCE.init({
		mode : "textareas",
		theme : "advanced",
		plugins : "table,advimage,searchreplace,contextmenu,paste",
		theme_advanced_buttons1_add_before : "newdocument,separator",
		theme_advanced_buttons1_add : "fontselect,fontsizeselect",
		theme_advanced_buttons2_add : "separator,forecolor,backcolor",
		theme_advanced_buttons2_add_before: "cut,copy,paste,pastetext,pasteword,separator,search,replace,separator",
		theme_advanced_buttons3_add_before : "tablecontrols,separator",
		theme_advanced_toolbar_location : "top",
		theme_advanced_toolbar_align : "left",
		theme_advanced_statusbar_location : "bottom",
		paste_use_dialog : false,
		theme_advanced_resizing : true,
		theme_advanced_resize_horizontal : false,
		paste_auto_cleanup_on_paste : true,
		paste_convert_headers_to_strong : false,
		paste_strip_class_attributes : "all",
		paste_remove_spans : false,
		paste_remove_styles : false
	});
 </script>
 <script type="text/javascript" src="/siiv/script/edhtml.js"></script>
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr class="page-title-header">
      <td width="100%" valign="top" class="bottom" align="left">
        <!-- Titlul ferestrei pentru vizualizare. -->
        <bean:message bundle="edhtml" key="edhtml.title"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
    </tr>
    <tr>
        <td>
        &nbsp;
        </td>
    </tr>
  </table>
 <form>
  <table width="100%">
   <tr>
     <td colspan="3" align="left" width="100%" class="text-label-bkwhite" >
      <bean:message  bundle="edhtml" key="edhtml.label.directoare" />:
      <select class="text-label-bkwhite"  id="dir" onChange="loadXMLDoc('/siiv/publishing/edit_static_content.do?method=load&root_dir='+this.value,'load')">
        <option value=""><bean:message key="select.prompt" bundle="app" /></option>
        <logic:iterate id="listItem" name="listaDirStatice">
          <option value='<bean:write name="listItem"/>'><bean:write name="listItem"/></option>
        </logic:iterate>
      </select>
     </td>
   </tr>
   <tr>
    <td align="left" width="33%" class="text-label-bkwhite">
     <bean:message bundle="edhtml" key="edhtml.label.pagini"/>:<br/>
     <select id="html" size="5" style="width:100%">
     </select>
     <br/>
<%-- <button  class="btn-generic"  onclick="javascript:incarcaPagHtml();">
        <bean:message bundle="edhtml" key="edhtml.buton.edit" />
    </button>&nbsp; --%>
    <input type="button" class="btn-generic"  value='<bean:message bundle="edhtml" key="edhtml.buton.edit"/>' onclick="javascript:incarcaPagHtml();"/>&nbsp;

<%--<button class="btn-generic" onclick="javascript:inserareLinkHtml();">
        <bean:message bundle="edhtml" key="edhtml.buton.insert_link" />
    </button>&nbsp;--%>
   <input type="button" class="btn-generic" value='<bean:message bundle="edhtml" key="edhtml.buton.insert_link" />' onclick="javascript:inserareLinkHtml();"/>&nbsp;

<%--    <button class="btn-generic" onclick="javascript:nouaPagina();">
        <bean:message bundle="edhtml" key="edhtml.buton.pagina_noua" />
    </button>&nbsp; --%>
    <input type="button" class="btn-generic" name="new" value='<bean:message bundle="edhtml" key="edhtml.buton.pagina_noua" />' onclick="javascript:nouaPagina();"/>&nbsp;
    </td>
    <td align="left" width="33%" class="text-label-bkwhite">
     <bean:message bundle="edhtml" key="edhtml.label.fisiere_img"/>:<br/>
      <select id="img" size="5" style="width:100%">
      </select>
     <br/>
     <%--<button class="btn-generic" onclick="javascript:inserareImagine();">
        <bean:message bundle="edhtml" key="edhtml.buton.insert_img" />
    </button>--%>
    <input type="button" class="btn-generic" value='<bean:message bundle="edhtml" key="edhtml.buton.insert_img" />' onclick="javascript:inserareImagine();"/>
    </td>
    <td align="left" width="33%" class="text-label-bkwhite">
     <bean:message bundle="edhtml" key="edhtml.label.fisiere_download"/>:<br/>
      <select id="dld" size="5" style="width:100%">
      </select>
     <br/>
<%-- <button class="btn-generic" onclick="javascript:inserareLinkDld();">
        <bean:message bundle="edhtml" key="edhtml.buton.insert_link" />
    </button>--%>
   <input type="button" class="btn-generic" value='<bean:message bundle="edhtml" key="edhtml.buton.insert_link" />' onclick="javascript:inserareLinkDld();"/>
    </td>
   </tr>
   <tr>
    <td colspan="3" width="100%" bgcolor="black" align="center" id="tdta">
     <textarea id="content" name="content" style="width:100%" rows="20" cols="80">
    </textarea>
<%--<button class="btn-generic" onclick="javascript:salvare();" name="save">
        <bean:message bundle="edhtml" key="edhtml.buton.salveaza" />
    </button>--%>
    <input type="button" class="btn-generic" name="save" value='<bean:message bundle="edhtml" key="edhtml.buton.salveaza" />' onclick="javascript:salvare();"/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" class="btn-generic" name="save_as" value='<bean:message bundle="edhtml" key="edhtml.buton.salveaza_as" />' onclick="javascript:salvare_as();"/>
    </td>
   </tr>
  </table>
  </form>
 </body>
</html>
