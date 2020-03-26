package org.apache.jsp.web.sys.admmenuentry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import ro.uti.settings.util.Constants;
import ro.uti.apmc.sys.util.AdmMenuConstants;
import ro.uti.apmc.portal.staticcontent.publishing.edhtml.util.EdhtmlConstants;

public final class add_005fadmmenuentry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/tld/tree/tree.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_scope_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_scope_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_messages_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_onsubmit_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_styleId_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tree_tree_tag_method_labelField_idField_id_functie_formId_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_errorStyleClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_radio_value_styleId_property_onfocus;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_size_property_errorStyleClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_styleId_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_checkbox_value_styleId_property_errorStyleClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_form_styleId_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_scope_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_scope_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_messages_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_onsubmit_enctype_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_type_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tree_tree_tag_method_labelField_idField_id_functie_formId_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_errorStyleClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_radio_value_styleId_property_onfocus = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_size_property_errorStyleClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_checkbox_value_styleId_property_errorStyleClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_styleId_method_action.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_logic_empty_scope_property_name.release();
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_logic_notEmpty_scope_property_name.release();
    _jspx_tagPool_logic_iterate_name_id.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
    _jspx_tagPool_logic_messagesPresent.release();
    _jspx_tagPool_html_messages_id.release();
    _jspx_tagPool_bean_write_name_nobody.release();
    _jspx_tagPool_html_form_styleId_onsubmit_enctype_action.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_html_hidden_styleId_property_nobody.release();
    _jspx_tagPool_bean_define_type_id.release();
    _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_nobody.release();
    _jspx_tagPool_tree_tree_tag_method_labelField_idField_id_functie_formId_action_nobody.release();
    _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_errorStyleClass_nobody.release();
    _jspx_tagPool_html_radio_value_styleId_property_onfocus.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_html_text_styleId_styleClass_size_property_errorStyleClass_nobody.release();
    _jspx_tagPool_html_hidden_value_styleId_property_nobody.release();
    _jspx_tagPool_html_checkbox_value_styleId_property_errorStyleClass_nobody.release();
    _jspx_tagPool_html_submit_styleClass.release();
    _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=iso-8859-2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/sniffer.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/init.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/menu.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/util.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/admmenu.js\" language=\"JavaScript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write(" var popup;\r\n");
      out.write(" function init(id_menu_entry) {\r\n");
      out.write("   idMenu = id_menu_entry;\r\n");
      out.write("   var el = document.getElementById(\"id\");\r\n");
      out.write("   el.value = idMenu;\r\n");
      out.write("   document.getElementById(\"ids\").value = idMenu;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("function showMap(id){\r\n");
      out.write("  popup=window.open(\"/siiv/sys/admmenuentry.do?method=showTree&id=\"+id,\"wmtree\",\"height=400,width=500,status=no,toolbar=no,menubar=no,location=no,scrollbars=yes\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function setParinte(id,denumire){\r\n");
      out.write("\r\n");
      out.write("      document.getElementById(\"fk_menu_entry\").value=id;\r\n");
      out.write("      document.getElementById(\"menu_parent_name\").value=denumire;\r\n");
      out.write("      if(popup) popup.close();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"closeForm\" method=\"post\" action=\"sys/admmenuentry.do\">\r\n");
      out.write("  ");
      if (_jspx_meth_html_hidden_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("  function closeWindow() {\r\n");
      out.write("    document.closeForm.submit();\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"table\">\r\n");
      out.write(" <table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\r\n");
      out.write("  <tr class=\"page-title-header\">\r\n");
      out.write("   <td width=\"100%\" valign=\"top\" align=\"left\">\r\n");
      out.write("        &nbsp;\r\n");
      out.write("        <!-- Titlul ferestrei pentru modificare. -->\r\n");
      out.write("        ");
      //  logic:empty
      org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_0 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_scope_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
      _jspx_th_logic_empty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_empty_0.setParent(null);
      _jspx_th_logic_empty_0.setName(Constants.ADM_MENU_ENTRY_KEY);
      _jspx_th_logic_empty_0.setProperty("values.primaryKey");
      _jspx_th_logic_empty_0.setScope("request");
      int _jspx_eval_logic_empty_0 = _jspx_th_logic_empty_0.doStartTag();
      if (_jspx_eval_logic_empty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_bean_message_0(_jspx_th_logic_empty_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_logic_empty_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_empty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_0);
        return;
      }
      _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_0);
      out.write("\r\n");
      out.write("        <!-- Titlul ferestrei pentru adaugare. -->\r\n");
      out.write("        ");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_0.setParent(null);
      _jspx_th_logic_notEmpty_0.setName(Constants.ADM_MENU_ENTRY_KEY);
      _jspx_th_logic_notEmpty_0.setProperty("values.primaryKey");
      _jspx_th_logic_notEmpty_0.setScope("request");
      int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
      if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_bean_message_1(_jspx_th_logic_notEmpty_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_logic_notEmpty_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_notEmpty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_0);
        return;
      }
      _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_0);
      out.write("\r\n");
      out.write("        <!-- END Sectiune de Titlu pagina. -->\r\n");
      out.write("      </td>\r\n");
      out.write("      <td class=\"bottom\" align=\"right\">\r\n");
      out.write("        <img border=\"0\" style=\"cursor:pointer;\" onClick=\"closeWindow();\" title='");
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write("' src=\"images/close_off.gif\" />\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("<table width=\"100%\" border=\"0\" >\r\n");
      out.write("<tr>\r\n");
      out.write("<td valign=\"top\" align=\"left\" width=\"50%\" >\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("     d = new dTree('d');\r\n");
      out.write("     d.add(1,-1,'");
      if (_jspx_meth_bean_message_3(_jspx_page_context))
        return;
      out.write("','javascript: init(1);showPopUpRoot();');\r\n");
      out.write("     ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setId("elementLista");
      _jspx_th_logic_iterate_0.setName( AdmMenuConstants.KEY_LIST_MENU_TREE );
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object elementLista = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        elementLista = (java.lang.Object) _jspx_page_context.findAttribute("elementLista");
        do {
          out.write("\r\n");
          out.write("       d.add(");
          if (_jspx_meth_bean_write_0(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write(',');
          if (_jspx_meth_bean_write_1(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write(',');
          out.write('\'');
          if (_jspx_meth_bean_write_2(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("','javascript: init(");
          if (_jspx_meth_bean_write_3(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write(");showPopUp();');\r\n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          elementLista = (java.lang.Object) _jspx_page_context.findAttribute("elementLista");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
        return;
      }
      _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
      out.write("\r\n");
      out.write("     document.write(d);\r\n");
      out.write("     d.openAll();\r\n");
      out.write("  </script>\r\n");
      out.write("</td>\r\n");
      out.write("<td valign=\"top\" align=\"left\">\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" align=\"left\" >\r\n");
      out.write("    <tr><td width=\"20%\" ></td><td width=\"80%\" ></td></tr>\r\n");
      out.write("    ");
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_messagesPresent_0.setParent(null);
      int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
      if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <tr>\r\n");
          out.write("        <td valign=\"top\" colspan=\"2\" class=\"msg_error \" align=\"center\">\r\n");
          out.write("          <ul>\r\n");
          out.write("            ");
          //  html:messages
          org.apache.struts.taglib.html.MessagesTag _jspx_th_html_messages_0 = (org.apache.struts.taglib.html.MessagesTag) _jspx_tagPool_html_messages_id.get(org.apache.struts.taglib.html.MessagesTag.class);
          _jspx_th_html_messages_0.setPageContext(_jspx_page_context);
          _jspx_th_html_messages_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
          _jspx_th_html_messages_0.setId("error");
          int _jspx_eval_html_messages_0 = _jspx_th_html_messages_0.doStartTag();
          if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String error = null;
            if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_messages_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_messages_0.doInitBody();
            }
            error = (java.lang.String) _jspx_page_context.findAttribute("error");
            do {
              out.write("\r\n");
              out.write("              <li>\r\n");
              out.write("                ");
              if (_jspx_meth_bean_write_4(_jspx_th_html_messages_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("              </li>\r\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_html_messages_0.doAfterBody();
              error = (java.lang.String) _jspx_page_context.findAttribute("error");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_messages_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_messages_id.reuse(_jspx_th_html_messages_0);
            return;
          }
          _jspx_tagPool_html_messages_id.reuse(_jspx_th_html_messages_0);
          out.write("\r\n");
          out.write("          </ul>\r\n");
          out.write("        </td>\r\n");
          out.write("      </tr>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_logic_messagesPresent_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_messagesPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_messagesPresent.reuse(_jspx_th_logic_messagesPresent_0);
        return;
      }
      _jspx_tagPool_logic_messagesPresent.reuse(_jspx_th_logic_messagesPresent_0);
      out.write("\r\n");
      out.write("    <!-- START Sectiune de FORM. -->\r\n");
      out.write("    ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_onsubmit_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_1.setPageContext(_jspx_page_context);
      _jspx_th_html_form_1.setParent(null);
      _jspx_th_html_form_1.setAction("/admmenuentry.do");
      _jspx_th_html_form_1.setStyleId("form_AdmMenuEntryForm1");
      _jspx_th_html_form_1.setOnsubmit("return validateForm_AdmMenuEntryForm(this);");
      _jspx_th_html_form_1.setEnctype("multipart/form-data");
      int _jspx_eval_html_form_1 = _jspx_th_html_form_1.doStartTag();
      if (_jspx_eval_html_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <input type=\"hidden\" id=\"ids\" name=\"ids\">\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_1(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <!-- Cimpul 'fk_menu_entry' field. -->\r\n");
          out.write("       ");
          if (_jspx_meth_html_hidden_2(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("      ");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
          _jspx_th_logic_notEmpty_1.setName(Constants.ADM_MENU_ENTRY_KEY);
          _jspx_th_logic_notEmpty_1.setProperty("values.primaryKey");
          _jspx_th_logic_notEmpty_1.setScope("request");
          int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
          if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("      <tr>\r\n");
              out.write("        <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
              out.write("          ");
              if (_jspx_meth_bean_message_4(_jspx_th_logic_notEmpty_1, _jspx_page_context))
                return;
              out.write(":\r\n");
              out.write("        </td>\r\n");
              out.write("        <td class=\"text\" align=\"left\">\r\n");
              out.write("            <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
              out.write("            <tr>\r\n");
              out.write("                <td class=\"text\" align=\"left\">\r\n");
              out.write('\r');
              out.write('\n');
              out.write('\r');
              out.write('\n');
              out.write("\r\n");
              out.write("         ");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_id.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
              _jspx_th_bean_define_0.setId("id_menu");
              _jspx_th_bean_define_0.setType("java.lang.String");
              int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
              if (_jspx_eval_bean_define_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_bean_define_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_bean_define_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_bean_define_0.doInitBody();
                }
                do {
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_5 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_write_5.setPageContext(_jspx_page_context);
                  _jspx_th_bean_write_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_bean_define_0);
                  _jspx_th_bean_write_5.setName(Constants.ADM_MENU_ENTRY_KEY);
                  _jspx_th_bean_write_5.setProperty("values.id_menu_entry");
                  int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
                  if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
                    return;
                  }
                  _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
                  int evalDoAfterBody = _jspx_th_bean_define_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_bean_define_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_define_type_id.reuse(_jspx_th_bean_define_0);
                return;
              }
              _jspx_tagPool_bean_define_type_id.reuse(_jspx_th_bean_define_0);
              java.lang.String id_menu = null;
              id_menu = (java.lang.String) _jspx_page_context.findAttribute("id_menu");
              out.write("\r\n");
              out.write("         ");
              if (_jspx_meth_html_text_0(_jspx_th_logic_notEmpty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("          ");
              //  tree:tree
              ro.uti.apmc.tree.TreeTag _jspx_th_tree_tree_0 = (ro.uti.apmc.tree.TreeTag) _jspx_tagPool_tree_tree_tag_method_labelField_idField_id_functie_formId_action_nobody.get(ro.uti.apmc.tree.TreeTag.class);
              _jspx_th_tree_tree_0.setPageContext(_jspx_page_context);
              _jspx_th_tree_tree_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
              _jspx_th_tree_tree_0.setAction(request.getContextPath()+"/sys/admmenuentry.do");
              _jspx_th_tree_tree_0.setMethod("showTree");
              _jspx_th_tree_tree_0.setFunctie("chooseCategorie()");
              _jspx_th_tree_tree_0.setFormId("form_AdmMenuEntryForm1");
              _jspx_th_tree_tree_0.setIdField("fk_menu_entry");
              _jspx_th_tree_tree_0.setId(id_menu );
              _jspx_th_tree_tree_0.setLabelField("menu_parent_name");
              _jspx_th_tree_tree_0.setTag("menu_url_label");
              int _jspx_eval_tree_tree_0 = _jspx_th_tree_tree_0.doStartTag();
              if (_jspx_th_tree_tree_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_tree_tree_tag_method_labelField_idField_id_functie_formId_action_nobody.reuse(_jspx_th_tree_tree_0);
                return;
              }
              _jspx_tagPool_tree_tree_tag_method_labelField_idField_id_functie_formId_action_nobody.reuse(_jspx_th_tree_tree_0);
              out.write("\r\n");
              out.write("           </td>\r\n");
              out.write("            </tr>\r\n");
              out.write("        </table>\r\n");
              out.write("      </td>\r\n");
              out.write("    </tr>\r\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_logic_notEmpty_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_1);
            return;
          }
          _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_1);
          out.write("\r\n");
          out.write("    <!-- Cimpul 'menu_key' field. -->\r\n");
          out.write("     ");
          if (_jspx_meth_html_hidden_3(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    <!-- Cimpul 'menu_url' field. -->\r\n");
          out.write("   <tr valign=\"top\" >\r\n");
          out.write("      <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("        ");
          if (_jspx_meth_bean_message_5(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        <font color=\"#336600\">\r\n");
          out.write("          *\r\n");
          out.write("        </font>\r\n");
          out.write("        :\r\n");
          out.write("      </td>\r\n");
          out.write("      <td class=\"text\" align=\"left\" valign=\"top\" >\r\n");
          out.write("        ");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_html_hidden_4(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td>&nbsp;</td>\r\n");
          out.write("      <td class=\"label\">");
          if (_jspx_meth_html_radio_0(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_html_radio_1(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    <tr>\r\n");
          out.write("\r\n");
          out.write("     <td valign=\"top\" align=\"right\">\r\n");
          out.write("     </td>\r\n");
          out.write("     <td align=\"left\" >\r\n");
          out.write("          <table  id=\"divStatic\" ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
          _jspx_th_logic_equal_0.setValue("S");
          _jspx_th_logic_equal_0.setName(Constants.ADM_MENU_ENTRY_KEY);
          _jspx_th_logic_equal_0.setProperty("tip_url");
          int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
          if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" style=\"display:block\" ");
              int evalDoAfterBody = _jspx_th_logic_equal_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_equal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_0);
            return;
          }
          _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_0);
          out.write(' ');
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
          _jspx_th_logic_equal_1.setValue("D");
          _jspx_th_logic_equal_1.setName(Constants.ADM_MENU_ENTRY_KEY);
          _jspx_th_logic_equal_1.setProperty("tip_url");
          int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
          if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" style=\"display:none\" ");
              int evalDoAfterBody = _jspx_th_logic_equal_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_equal_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_1);
            return;
          }
          _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_1);
          out.write(" >\r\n");
          out.write("             <tr><td>\r\n");
          out.write("               <select onchange=\"composeurl(this)\" size=\"10\">\r\n");
          out.write("                 ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
          _jspx_th_logic_iterate_1.setId("listItem");
          _jspx_th_logic_iterate_1.setName( EdhtmlConstants.DIR_LIST_KEY );
          int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
          if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object listItem = null;
            if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_1.doInitBody();
            }
            listItem = (java.lang.Object) _jspx_page_context.findAttribute("listItem");
            do {
              out.write("\r\n");
              out.write("                  <option value='");
              if (_jspx_meth_bean_write_6(_jspx_th_logic_iterate_1, _jspx_page_context))
                return;
              out.write('\'');
              out.write('>');
              if (_jspx_meth_bean_write_7(_jspx_th_logic_iterate_1, _jspx_page_context))
                return;
              out.write("</option>\r\n");
              out.write("                 ");
              int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
              listItem = (java.lang.Object) _jspx_page_context.findAttribute("listItem");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_1);
            return;
          }
          _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_1);
          out.write("\r\n");
          out.write("               </select>\r\n");
          out.write("             </td></tr>\r\n");
          out.write("          </table>\r\n");
          out.write("          <table  id=\"divDinamic\" ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_2 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_2.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
          _jspx_th_logic_equal_2.setValue("D");
          _jspx_th_logic_equal_2.setName(Constants.ADM_MENU_ENTRY_KEY);
          _jspx_th_logic_equal_2.setProperty("tip_url");
          int _jspx_eval_logic_equal_2 = _jspx_th_logic_equal_2.doStartTag();
          if (_jspx_eval_logic_equal_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" style=\"display:block\" ");
              int evalDoAfterBody = _jspx_th_logic_equal_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_equal_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_2);
            return;
          }
          _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_2);
          out.write(' ');
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_3 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_3.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
          _jspx_th_logic_equal_3.setValue("S");
          _jspx_th_logic_equal_3.setName(Constants.ADM_MENU_ENTRY_KEY);
          _jspx_th_logic_equal_3.setProperty("tip_url");
          int _jspx_eval_logic_equal_3 = _jspx_th_logic_equal_3.doStartTag();
          if (_jspx_eval_logic_equal_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" style=\"display:none\" ");
              int evalDoAfterBody = _jspx_th_logic_equal_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_equal_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_3);
            return;
          }
          _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_3);
          out.write(" >\r\n");
          out.write("             <tr><td>\r\n");
          out.write("               <select onchange=\"composeurl(this)\" size=\"10\">\r\n");
          out.write("                 ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_2 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_2.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
          _jspx_th_logic_iterate_2.setId("listItemDin");
          _jspx_th_logic_iterate_2.setName("listaDirDinamice");
          int _jspx_eval_logic_iterate_2 = _jspx_th_logic_iterate_2.doStartTag();
          if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object listItemDin = null;
            if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_2.doInitBody();
            }
            listItemDin = (java.lang.Object) _jspx_page_context.findAttribute("listItemDin");
            do {
              out.write("\r\n");
              out.write("                  <option value='");
              if (_jspx_meth_bean_write_8(_jspx_th_logic_iterate_2, _jspx_page_context))
                return;
              out.write('\'');
              out.write('>');
              if (_jspx_meth_bean_write_9(_jspx_th_logic_iterate_2, _jspx_page_context))
                return;
              out.write("</option>\r\n");
              out.write("                 ");
              int evalDoAfterBody = _jspx_th_logic_iterate_2.doAfterBody();
              listItemDin = (java.lang.Object) _jspx_page_context.findAttribute("listItemDin");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_iterate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_2);
            return;
          }
          _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_2);
          out.write("\r\n");
          out.write("               </select>\r\n");
          out.write("             </td></tr>\r\n");
          out.write("          </table>\r\n");
          out.write("     </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    <script>\r\n");
          out.write("\r\n");
          out.write("      function showDiv(divName){\r\n");
          out.write("         document.getElementById(\"divStatic\").style.display='none';\r\n");
          out.write("         document.getElementById(\"divDinamic\").style.display='none';\r\n");
          out.write("         document.getElementById(divName).style.display='block';\r\n");
          out.write("      }\r\n");
          out.write("\r\n");
          out.write("      if(document.getElementById(\"radioDiv1\").checked){\r\n");
          out.write("        showDiv(\"divStatic\");\r\n");
          out.write("      }\r\n");
          out.write("      else{\r\n");
          out.write("        showDiv(\"divDinamic\");\r\n");
          out.write("      }\r\n");
          out.write("    </script>\r\n");
          out.write("    <!-- Cimpul 'link_menu_name' field. -->\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("        ");
          if (_jspx_meth_bean_message_6(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        <font color=\"#336600\">\r\n");
          out.write("          *\r\n");
          out.write("        </font>\r\n");
          out.write("        :\r\n");
          out.write("      </td>\r\n");
          out.write("      <td class=\"text\" align=\"left\">\r\n");
          out.write("        ");
          if (_jspx_meth_html_hidden_5(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_html_text_2(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_7(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("      </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    <!-- Cimpul 'menu_type' field. -->\r\n");
          out.write("     ");
          if (_jspx_meth_html_hidden_6(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    <!-- Cimpul 'menu_state' field. -->\r\n");
          out.write("     <tr>\r\n");
          out.write("      <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("        ");
          if (_jspx_meth_bean_message_8(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        :\r\n");
          out.write("      </td>\r\n");
          out.write("      <td class=\"text\" align=\"left\">\r\n");
          out.write("        ");
          if (_jspx_meth_html_checkbox_0(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    <!-- Cimpul 'menu_order' field. -->\r\n");
          out.write("     <tr>\r\n");
          out.write("      <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("        ");
          if (_jspx_meth_bean_message_9(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        <font color=\"#336600\">\r\n");
          out.write("          *\r\n");
          out.write("        </font>\r\n");
          out.write("        :\r\n");
          out.write("      </td>\r\n");
          out.write("      <td class=\"text\" align=\"left\">\r\n");
          out.write("        ");
          if (_jspx_meth_html_text_3(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_10(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("      </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    <!-- Cimpul 'menu_description' field. -->\r\n");
          out.write("     ");
          if (_jspx_meth_html_hidden_7(_jspx_th_html_form_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    <!--Campul id_limba-->\r\n");
          out.write("      ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_8 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_hidden_8.setPageContext(_jspx_page_context);
          _jspx_th_html_hidden_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
          _jspx_th_html_hidden_8.setProperty("values.id_limba");
          _jspx_th_html_hidden_8.setValue( Constants.DEFAULT_LANGUAGE);
          int _jspx_eval_html_hidden_8 = _jspx_th_html_hidden_8.doStartTag();
          if (_jspx_th_html_hidden_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_8);
            return;
          }
          _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_8);
          out.write("\r\n");
          out.write("    <!-- START Sectiune de BUTOANE. -->\r\n");
          out.write("    ");
          //  logic:empty
          org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_1 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_scope_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
          _jspx_th_logic_empty_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_empty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
          _jspx_th_logic_empty_1.setName(Constants.ADM_MENU_ENTRY_KEY);
          _jspx_th_logic_empty_1.setProperty("values.primaryKey");
          _jspx_th_logic_empty_1.setScope("request");
          int _jspx_eval_logic_empty_1 = _jspx_th_logic_empty_1.doStartTag();
          if (_jspx_eval_logic_empty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("    <!-- Buton adugare. -->\r\n");
              out.write("    <tr>\r\n");
              out.write("      <td colspan=\"2\" class=\"button-row\" align=\"center\">\r\n");
              out.write("        ");
              if (_jspx_meth_html_submit_0(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("        ");
              if (_jspx_meth_html_hidden_9(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("      </td>\r\n");
              out.write("    </tr>\r\n");
              out.write("  ");
              int evalDoAfterBody = _jspx_th_logic_empty_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_empty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_1);
            return;
          }
          _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_1);
          out.write("\r\n");
          out.write("  ");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_2 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_2.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
          _jspx_th_logic_notEmpty_2.setName(Constants.ADM_MENU_ENTRY_KEY);
          _jspx_th_logic_notEmpty_2.setProperty("values.primaryKey");
          _jspx_th_logic_notEmpty_2.setScope("request");
          int _jspx_eval_logic_notEmpty_2 = _jspx_th_logic_notEmpty_2.doStartTag();
          if (_jspx_eval_logic_notEmpty_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("  <!-- buton modificare. -->\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td colspan=\"2\" class=\"button-row\" align=\"center\">\r\n");
              out.write("      ");
              if (_jspx_meth_html_submit_1(_jspx_th_logic_notEmpty_2, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("      ");
              if (_jspx_meth_html_hidden_10(_jspx_th_logic_notEmpty_2, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    </td>\r\n");
              out.write("  </tr>\r\n");
              int evalDoAfterBody = _jspx_th_logic_notEmpty_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_2);
            return;
          }
          _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_2);
          out.write("\r\n");
          out.write("<!-- END Sectiune de BUTOANE. -->\r\n");
          int evalDoAfterBody = _jspx_th_html_form_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_styleId_onsubmit_enctype_action.reuse(_jspx_th_html_form_1);
        return;
      }
      _jspx_tagPool_html_form_styleId_onsubmit_enctype_action.reuse(_jspx_th_html_form_1);
      out.write("\r\n");
      out.write("<!-- END Sectiune de FORM. -->\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Validare cimpuri forma. -->\r\n");
      //  html:javascript
      org.apache.struts.taglib.html.JavascriptValidatorTag _jspx_th_html_javascript_0 = (org.apache.struts.taglib.html.JavascriptValidatorTag) _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody.get(org.apache.struts.taglib.html.JavascriptValidatorTag.class);
      _jspx_th_html_javascript_0.setPageContext(_jspx_page_context);
      _jspx_th_html_javascript_0.setParent(null);
      _jspx_th_html_javascript_0.setFormName(Constants.ADM_MENU_ENTRY_KEY);
      _jspx_th_html_javascript_0.setDynamicJavascript("true");
      _jspx_th_html_javascript_0.setStaticJavascript("false");
      int _jspx_eval_html_javascript_0 = _jspx_th_html_javascript_0.doStartTag();
      if (_jspx_th_html_javascript_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody.reuse(_jspx_th_html_javascript_0);
        return;
      }
      _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody.reuse(_jspx_th_html_javascript_0);
      out.write("\r\n");
      out.write("<script language=\"Javascript1.1\" src=\"staticJavascript.jsp\"></script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"select\"  style=\"background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;\">\r\n");
      out.write("   <a href=\"javascript: document.getElementById('method_id').value='showAdd';document.getElementById('selectForm').submit()\"><img align=\"middle\"  border=\"0\" src=\"images/add.gif\"  title='");
      if (_jspx_meth_bean_message_13(_jspx_page_context))
        return;
      out.write("'/></a>&nbsp;&nbsp;\r\n");
      out.write("   <a href=\"javascript: document.getElementById('method_id').value='showEdit';document.getElementById('selectForm').submit()\"><img border=\"0\" src=\"images/edit.gif\"  title='");
      if (_jspx_meth_bean_message_14(_jspx_page_context))
        return;
      out.write("'/></a>&nbsp;&nbsp;\r\n");
      out.write("   <a href=\"javascript: document.getElementById('method_id').value='showTranslate';document.getElementById('selectForm').submit()\"><img border=\"0\" src=\"images/translate.gif\"  title='");
      if (_jspx_meth_bean_message_15(_jspx_page_context))
        return;
      out.write("'/></a>&nbsp;&nbsp;\r\n");
      out.write("   <a href=\"javascript: document.getElementById('method_id').value='showDelete';document.getElementById('selectForm').submit()\"><img border=\"0\" src=\"images/delete.gif\"  title='");
      if (_jspx_meth_bean_message_16(_jspx_page_context))
        return;
      out.write("'/></a>&nbsp;&nbsp;\r\n");
      out.write("   <img border=\"0\"  style=\"cursor:pointer;\" onClick=\"hidePopUp();\" title='");
      if (_jspx_meth_bean_message_17(_jspx_page_context))
        return;
      out.write("' src=\"images/x.gif\" />\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"selectR\"  style=\"background-color: #c8c8c1; border: 2px Outset White; layer-background-color: LightGrey; padding: 1; position: absolute; visibility: hidden;\">\r\n");
      out.write("   <a href=\"javascript: document.getElementById('method_id').value='showAdd';document.getElementById('selectForm').submit()\"><img align=\"middle\"  border=\"0\" src=\"images/add.gif\"  title='");
      if (_jspx_meth_bean_message_18(_jspx_page_context))
        return;
      out.write("'/></a>&nbsp;&nbsp;\r\n");
      out.write("   <img border=\"0\"  style=\"cursor:pointer;\" onClick=\"hidePopUp();\" title='");
      if (_jspx_meth_bean_message_19(_jspx_page_context))
        return;
      out.write("' src=\"images/x.gif\" />\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("admmenuentry.do");
    _jspx_th_html_form_0.setStyleId("selectForm");
    _jspx_th_html_form_0.setMethod("post");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("  <input type=\"hidden\" id =\"method_id\" name=\"method\"/>\r\n");
        out.write("  <input type=\"hidden\" id=\"id\" name=\"id\"/>\r\n");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_styleId_method_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_styleId_method_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_0.setParent(null);
    _jspx_th_html_hidden_0.setProperty("method");
    _jspx_th_html_hidden_0.setValue("list");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_0);
    _jspx_th_bean_message_0.setBundle("admmenuentry");
    _jspx_th_bean_message_0.setKey("adm_menu_entry.title.add");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
    _jspx_th_bean_message_1.setBundle("admmenuentry");
    _jspx_th_bean_message_1.setKey("adm_menu_entry.title.save");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_2.setParent(null);
    _jspx_th_bean_message_2.setBundle("admmenuentry");
    _jspx_th_bean_message_2.setKey("adm_menu_entry.label.closeWindow");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_3.setParent(null);
    _jspx_th_bean_message_3.setBundle("portal");
    _jspx_th_bean_message_3.setKey("portal.menu.harta_site");
    int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
    if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_0.setName("elementLista");
    _jspx_th_bean_write_0.setProperty("id_menu_entry");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_1.setName("elementLista");
    _jspx_th_bean_write_1.setProperty("fk_menu_entry");
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_2.setName("elementLista");
    _jspx_th_bean_write_2.setProperty("traducere");
    int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
    if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_3.setName("elementLista");
    _jspx_th_bean_write_3.setProperty("id_menu_entry");
    int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
    if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
    return false;
  }

  private boolean _jspx_meth_bean_write_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_messages_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_messages_0);
    _jspx_th_bean_write_4.setName("error");
    int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
    if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_4);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_4);
    return false;
  }

  private boolean _jspx_meth_html_hidden_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_hidden_1.setProperty("values.id_menu_entry");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_1);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_1);
    return false;
  }

  private boolean _jspx_meth_html_hidden_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_hidden_2.setStyleId("fk_menu_entry");
    _jspx_th_html_hidden_2.setProperty("values.fk_menu_entry");
    int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
    if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_2);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
    _jspx_th_bean_message_4.setBundle("admmenuentry");
    _jspx_th_bean_message_4.setKey("adm_menu_entry.prompt.fk_menu_entry");
    int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
    if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
    _jspx_th_html_text_0.setStyleId("menu_parent_name");
    _jspx_th_html_text_0.setProperty("menu_parent_name");
    _jspx_th_html_text_0.setStyleClass("text_medium");
    _jspx_th_html_text_0.setReadonly(true);
    _jspx_th_html_text_0.setSize("30");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_3 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_3.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_hidden_3.setProperty("values.menu_key");
    _jspx_th_html_hidden_3.setStyleId("menu_key");
    int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
    if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_bean_message_5.setBundle("admmenuentry");
    _jspx_th_bean_message_5.setKey("adm_menu_entry.prompt.menu_url");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_1.setErrorStyleClass("errorfield");
    _jspx_th_html_text_1.setStyleClass("inputtext");
    _jspx_th_html_text_1.setProperty("menu_url_label");
    _jspx_th_html_text_1.setSize("22");
    _jspx_th_html_text_1.setReadonly(true);
    _jspx_th_html_text_1.setStyleId("menu_url_label");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_hidden_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_4 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_4.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_hidden_4.setProperty("values.menu_url_dir");
    _jspx_th_html_hidden_4.setStyleId("menu_url_dir");
    int _jspx_eval_html_hidden_4 = _jspx_th_html_hidden_4.doStartTag();
    if (_jspx_th_html_hidden_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_4);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_4);
    return false;
  }

  private boolean _jspx_meth_html_radio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_0 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_styleId_property_onfocus.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_radio_0.setProperty("tip_url");
    _jspx_th_html_radio_0.setOnfocus("showDiv('divStatic')");
    _jspx_th_html_radio_0.setStyleId("radioDiv1");
    _jspx_th_html_radio_0.setValue("S");
    int _jspx_eval_html_radio_0 = _jspx_th_html_radio_0.doStartTag();
    if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_radio_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_radio_0.doInitBody();
      }
      do {
        out.write("Static");
        int evalDoAfterBody = _jspx_th_html_radio_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_styleId_property_onfocus.reuse(_jspx_th_html_radio_0);
      return true;
    }
    _jspx_tagPool_html_radio_value_styleId_property_onfocus.reuse(_jspx_th_html_radio_0);
    return false;
  }

  private boolean _jspx_meth_html_radio_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_1 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_styleId_property_onfocus.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_1.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_radio_1.setProperty("tip_url");
    _jspx_th_html_radio_1.setOnfocus("showDiv('divDinamic')");
    _jspx_th_html_radio_1.setStyleId("radioDiv2");
    _jspx_th_html_radio_1.setValue("D");
    int _jspx_eval_html_radio_1 = _jspx_th_html_radio_1.doStartTag();
    if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_radio_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_radio_1.doInitBody();
      }
      do {
        out.write("Dinamic");
        int evalDoAfterBody = _jspx_th_html_radio_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_radio_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_styleId_property_onfocus.reuse(_jspx_th_html_radio_1);
      return true;
    }
    _jspx_tagPool_html_radio_value_styleId_property_onfocus.reuse(_jspx_th_html_radio_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_6 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_6.setName("listItem");
    int _jspx_eval_bean_write_6 = _jspx_th_bean_write_6.doStartTag();
    if (_jspx_th_bean_write_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_6);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_6);
    return false;
  }

  private boolean _jspx_meth_bean_write_7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_7 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_7.setName("listItem");
    int _jspx_eval_bean_write_7 = _jspx_th_bean_write_7.doStartTag();
    if (_jspx_th_bean_write_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_7);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_7);
    return false;
  }

  private boolean _jspx_meth_bean_write_8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_8 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
    _jspx_th_bean_write_8.setProperty("MENU_URL");
    _jspx_th_bean_write_8.setName("listItemDin");
    int _jspx_eval_bean_write_8 = _jspx_th_bean_write_8.doStartTag();
    if (_jspx_th_bean_write_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_8);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_8);
    return false;
  }

  private boolean _jspx_meth_bean_write_9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_9 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
    _jspx_th_bean_write_9.setName("listItemDin");
    _jspx_th_bean_write_9.setProperty("MENU_DESCR");
    int _jspx_eval_bean_write_9 = _jspx_th_bean_write_9.doStartTag();
    if (_jspx_th_bean_write_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_9);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_9);
    return false;
  }

  private boolean _jspx_meth_bean_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_bean_message_6.setBundle("admmenuentry");
    _jspx_th_bean_message_6.setKey("adm_menu_entry.prompt.link_menu_name");
    int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
    if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
    return false;
  }

  private boolean _jspx_meth_html_hidden_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_5 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_5.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_hidden_5.setProperty("values.link_menu_name");
    _jspx_th_html_hidden_5.setStyleId("link_menu_name");
    int _jspx_eval_html_hidden_5 = _jspx_th_html_hidden_5.doStartTag();
    if (_jspx_th_html_hidden_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_5);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_5);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_2.setErrorStyleClass("errorfield");
    _jspx_th_html_text_2.setStyleClass("inputtext");
    _jspx_th_html_text_2.setProperty("values.menu_name");
    _jspx_th_html_text_2.setSize("22");
    _jspx_th_html_text_2.setStyleId("menu_name");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_size_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_size_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_7 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_bean_message_7.setBundle("admmenuentry");
    _jspx_th_bean_message_7.setKey("adm_menu_entry.label.tooltip.link_menu_name");
    int _jspx_eval_bean_message_7 = _jspx_th_bean_message_7.doStartTag();
    if (_jspx_th_bean_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
    return false;
  }

  private boolean _jspx_meth_html_hidden_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_6 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_6.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_hidden_6.setProperty("values.menu_type");
    _jspx_th_html_hidden_6.setStyleId("menu_type");
    _jspx_th_html_hidden_6.setValue("1");
    int _jspx_eval_html_hidden_6 = _jspx_th_html_hidden_6.doStartTag();
    if (_jspx_th_html_hidden_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_6);
      return true;
    }
    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_6);
    return false;
  }

  private boolean _jspx_meth_bean_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_8 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_bean_message_8.setBundle("admmenuentry");
    _jspx_th_bean_message_8.setKey("adm_menu_entry.prompt.menu_state");
    int _jspx_eval_bean_message_8 = _jspx_th_bean_message_8.doStartTag();
    if (_jspx_th_bean_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_0 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_value_styleId_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_checkbox_0.setErrorStyleClass("errorfield");
    _jspx_th_html_checkbox_0.setProperty("values.menu_state_boo");
    _jspx_th_html_checkbox_0.setValue("true");
    _jspx_th_html_checkbox_0.setStyleId("menu_state_boo");
    int _jspx_eval_html_checkbox_0 = _jspx_th_html_checkbox_0.doStartTag();
    if (_jspx_th_html_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_checkbox_value_styleId_property_errorStyleClass_nobody.reuse(_jspx_th_html_checkbox_0);
      return true;
    }
    _jspx_tagPool_html_checkbox_value_styleId_property_errorStyleClass_nobody.reuse(_jspx_th_html_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_9 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_bean_message_9.setBundle("admmenuentry");
    _jspx_th_bean_message_9.setKey("adm_menu_entry.prompt.menu_order");
    int _jspx_eval_bean_message_9 = _jspx_th_bean_message_9.doStartTag();
    if (_jspx_th_bean_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_3.setErrorStyleClass("errorfield");
    _jspx_th_html_text_3.setStyleClass("inputtext");
    _jspx_th_html_text_3.setProperty("values.menu_order");
    _jspx_th_html_text_3.setSize("22");
    _jspx_th_html_text_3.setStyleId("menu_order");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_size_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_3);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_size_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_10 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_10.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_bean_message_10.setBundle("admmenuentry");
    _jspx_th_bean_message_10.setKey("adm_menu_entry.label.tooltip.menu_order");
    int _jspx_eval_bean_message_10 = _jspx_th_bean_message_10.doStartTag();
    if (_jspx_th_bean_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
    return false;
  }

  private boolean _jspx_meth_html_hidden_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_7 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_7.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_hidden_7.setProperty("values.menu_description");
    _jspx_th_html_hidden_7.setStyleId("menu_description");
    int _jspx_eval_html_hidden_7 = _jspx_th_html_hidden_7.doStartTag();
    if (_jspx_th_html_hidden_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_7);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_7);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_html_submit_0.setStyleClass("btn-generic");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("          ");
        if (_jspx_meth_bean_message_11(_jspx_th_html_submit_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_html_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_styleClass.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_styleClass.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_11 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_11.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_0);
    _jspx_th_bean_message_11.setBundle("admmenuentry");
    _jspx_th_bean_message_11.setKey("adm_menu_entry.button.add");
    int _jspx_eval_bean_message_11 = _jspx_th_bean_message_11.doStartTag();
    if (_jspx_th_bean_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
    return false;
  }

  private boolean _jspx_meth_html_hidden_9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_9 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_9.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_html_hidden_9.setProperty("method");
    _jspx_th_html_hidden_9.setValue("add");
    int _jspx_eval_html_hidden_9 = _jspx_th_html_hidden_9.doStartTag();
    if (_jspx_th_html_hidden_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_9);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_9);
    return false;
  }

  private boolean _jspx_meth_html_submit_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_1 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_2);
    _jspx_th_html_submit_1.setStyleClass("btn-generic");
    int _jspx_eval_html_submit_1 = _jspx_th_html_submit_1.doStartTag();
    if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_bean_message_12(_jspx_th_html_submit_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_html_submit_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_styleClass.reuse(_jspx_th_html_submit_1);
      return true;
    }
    _jspx_tagPool_html_submit_styleClass.reuse(_jspx_th_html_submit_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_12 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_12.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_1);
    _jspx_th_bean_message_12.setBundle("admmenuentry");
    _jspx_th_bean_message_12.setKey("adm_menu_entry.button.save");
    int _jspx_eval_bean_message_12 = _jspx_th_bean_message_12.doStartTag();
    if (_jspx_th_bean_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
    return false;
  }

  private boolean _jspx_meth_html_hidden_10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_10 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_10.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_2);
    _jspx_th_html_hidden_10.setProperty("method");
    _jspx_th_html_hidden_10.setValue("update");
    int _jspx_eval_html_hidden_10 = _jspx_th_html_hidden_10.doStartTag();
    if (_jspx_th_html_hidden_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_10);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_10);
    return false;
  }

  private boolean _jspx_meth_bean_message_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_13 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_13.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_13.setParent(null);
    _jspx_th_bean_message_13.setBundle("admmenuentry");
    _jspx_th_bean_message_13.setKey("adm_menu_entry.label.record.add");
    int _jspx_eval_bean_message_13 = _jspx_th_bean_message_13.doStartTag();
    if (_jspx_th_bean_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_13);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_13);
    return false;
  }

  private boolean _jspx_meth_bean_message_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_14 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_14.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_14.setParent(null);
    _jspx_th_bean_message_14.setBundle("admmenuentry");
    _jspx_th_bean_message_14.setKey("adm_menu_entry.label.record.update");
    int _jspx_eval_bean_message_14 = _jspx_th_bean_message_14.doStartTag();
    if (_jspx_th_bean_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_14);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_14);
    return false;
  }

  private boolean _jspx_meth_bean_message_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_15 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_15.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_15.setParent(null);
    _jspx_th_bean_message_15.setBundle("admmenuentry");
    _jspx_th_bean_message_15.setKey("adm_menu_entry.label.record.translate");
    int _jspx_eval_bean_message_15 = _jspx_th_bean_message_15.doStartTag();
    if (_jspx_th_bean_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_15);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_15);
    return false;
  }

  private boolean _jspx_meth_bean_message_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_16 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_16.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_16.setParent(null);
    _jspx_th_bean_message_16.setBundle("admmenuentry");
    _jspx_th_bean_message_16.setKey("adm_menu_entry.label.record.delete");
    int _jspx_eval_bean_message_16 = _jspx_th_bean_message_16.doStartTag();
    if (_jspx_th_bean_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_16);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_16);
    return false;
  }

  private boolean _jspx_meth_bean_message_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_17 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_17.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_17.setParent(null);
    _jspx_th_bean_message_17.setBundle("admmenuentry");
    _jspx_th_bean_message_17.setKey("adm_menu_entry.label.closeWindow");
    int _jspx_eval_bean_message_17 = _jspx_th_bean_message_17.doStartTag();
    if (_jspx_th_bean_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_17);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_17);
    return false;
  }

  private boolean _jspx_meth_bean_message_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_18 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_18.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_18.setParent(null);
    _jspx_th_bean_message_18.setBundle("admmenuentry");
    _jspx_th_bean_message_18.setKey("adm_menu_entry.label.record.add");
    int _jspx_eval_bean_message_18 = _jspx_th_bean_message_18.doStartTag();
    if (_jspx_th_bean_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
    return false;
  }

  private boolean _jspx_meth_bean_message_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_19 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_19.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_19.setParent(null);
    _jspx_th_bean_message_19.setBundle("admmenuentry");
    _jspx_th_bean_message_19.setKey("adm_menu_entry.label.closeWindow");
    int _jspx_eval_bean_message_19 = _jspx_th_bean_message_19.doStartTag();
    if (_jspx_th_bean_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
    return false;
  }
}
