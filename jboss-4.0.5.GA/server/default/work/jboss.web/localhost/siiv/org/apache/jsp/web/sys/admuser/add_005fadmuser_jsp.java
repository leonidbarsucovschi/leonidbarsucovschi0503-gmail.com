package org.apache.jsp.web.sys.admuser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.settings.util.Constants;
import ro.uti.apmc.sys.util.AdmUserInregConstants;

public final class add_005fadmuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_scope_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_scope_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_messages_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_onsubmit_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_radio_value_property_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_scope_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_scope_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_styleId_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_checkbox_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_radio_value_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_scope_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_scope_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_messages_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_onsubmit_enctype_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_radio_value_property_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_present_scope_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_scope_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_checkbox_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_radio_value_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_logic_empty_scope_property_name.release();
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_logic_notEmpty_scope_property_name.release();
    _jspx_tagPool_logic_messagesPresent.release();
    _jspx_tagPool_html_messages_id.release();
    _jspx_tagPool_bean_write_name_nobody.release();
    _jspx_tagPool_html_form_styleId_onsubmit_enctype_action.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.release();
    _jspx_tagPool_html_radio_value_property_onclick.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody.release();
    _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody.release();
    _jspx_tagPool_logic_present_scope_name.release();
    _jspx_tagPool_logic_notEmpty_scope_name.release();
    _jspx_tagPool_html_hidden_styleId_property_nobody.release();
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.release();
    _jspx_tagPool_html_checkbox_property_nobody.release();
    _jspx_tagPool_logic_empty_property_name.release();
    _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody.release();
    _jspx_tagPool_html_radio_value_property_onclick_nobody.release();
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("img {\r\n");
      out.write("\tborder: 0px none #000000;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<form name=\"closeForm\" method=\"post\" action=\"sys/admuser.do\">\r\n");
      out.write("  ");
      if (_jspx_meth_html_hidden_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script language=\"Javascript\">\r\n");
      out.write("   var popupldap;\r\n");
      out.write("   function showMapLDAP() {\r\n");
      out.write("     popupldap = window.open(\"/siiv/sys/admuser.do?method=showListLDAP\",\"w1list\",\"height=400,width=600,status=no,toolbar=no,menubar=no,location=no,scrollbars=yes\");\r\n");
      out.write("   }\r\n");
      out.write("   function setLDAP(issuer_name,serial_number) {\r\n");
      out.write("        document.getElementById(\"issuer_name\").value=issuer_name;\r\n");
      out.write("        document.getElementById(\"issuer_name_t\").value=issuer_name;\r\n");
      out.write("        document.getElementById(\"serial_number\").value=serial_number;\r\n");
      out.write("        document.getElementById(\"serial_number_t\").value=serial_number;\r\n");
      out.write("        if(popupldap) popupldap.close();\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   function chcd() {\r\n");
      out.write("      var el = document.getElementById('fdata');\r\n");
      out.write("      var m = document.getElementById('m');\r\n");
      out.write("      m.value=\"cd\";\r\n");
      out.write("      el.submit();\r\n");
      out.write("   }\r\n");
      out.write("   function chcdm() {\r\n");
      out.write("      var el = document.getElementById('fdata');\r\n");
      out.write("      var m = document.getElementById('m');\r\n");
      out.write("      m.value=\"cdm\";\r\n");
      out.write("      el.submit();\r\n");
      out.write("   }\r\n");
      out.write("   function send(method) {\r\n");
      out.write("      var el = document.getElementById('fdata');\r\n");
      out.write("      var m = document.getElementById('m');\r\n");
      out.write("      if  (method==\"add\") {\r\n");
      out.write("        m.value=\"add\";\r\n");
      out.write("        el.submit();\r\n");
      out.write("      }\r\n");
      out.write("      if  (method==\"update\") {\r\n");
      out.write("        m.value=\"update\";\r\n");
      out.write("        el.submit();\r\n");
      out.write("      }\r\n");
      out.write("      if  (method==\"cautLDAP\") {\r\n");
      out.write("        m.value=\"cautLDAP\";\r\n");
      out.write("        el.submit();\r\n");
      out.write("      }\r\n");
      out.write("      if  (method==\"cautLDAPm\") {\r\n");
      out.write("        m.value=\"cautLDAPm\";\r\n");
      out.write("        el.submit();\r\n");
      out.write("      }\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("  function closeWindow() {\r\n");
      out.write("    document.closeForm.submit();\r\n");
      out.write("  }\r\n");
      out.write("  function togglePass() {\r\n");
      out.write("  \tdocument.getElementById('newpass').disabled = !(document.getElementById('chpass').checked);\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"table\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\"><tr\r\n");
      out.write("    class=\"page-title-header\"><td width=\"100%\" valign=\"top\" align=\"left\">\r\n");
      out.write("  <!-- Titlul ferestrei pentru modificare. -->\r\n");
      out.write("  ");
      //  logic:empty
      org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_0 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_scope_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
      _jspx_th_logic_empty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_empty_0.setParent(null);
      _jspx_th_logic_empty_0.setName(Constants.ADM_USER_KEY);
      _jspx_th_logic_empty_0.setProperty("values.primaryKey");
      _jspx_th_logic_empty_0.setScope("request");
      int _jspx_eval_logic_empty_0 = _jspx_th_logic_empty_0.doStartTag();
      if (_jspx_eval_logic_empty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_bean_message_0(_jspx_th_logic_empty_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  ");
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
      out.write("  <!-- Titlul ferestrei pentru adaugare. -->\r\n");
      out.write("  ");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_0.setParent(null);
      _jspx_th_logic_notEmpty_0.setName(Constants.ADM_USER_KEY);
      _jspx_th_logic_notEmpty_0.setProperty("values.primaryKey");
      _jspx_th_logic_notEmpty_0.setScope("request");
      int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
      if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_bean_message_1(_jspx_th_logic_notEmpty_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  ");
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
      out.write("  <!-- END Sectiune de Titlu pagina. -->\r\n");
      out.write("</td>\r\n");
      out.write("  <td class=\"bottom\" align=\"right\">\r\n");
      out.write("    <img border=\"0\" style=\"cursor:pointer\" onclick=\"closeWindow();\"\r\n");
      out.write("         title='");
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write("'\r\n");
      out.write("         src=\"images/close_off.gif\"/>\r\n");
      out.write("  </td>\r\n");
      out.write("</tr></table>\r\n");
      out.write("<table width=\"100%\">\r\n");
      out.write("   ");
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_messagesPresent_0.setParent(null);
      int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
      if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<tr>\r\n");
          out.write("  <td valign=\"top\" colspan=\"2\" class=\"msg_error\" align=\"center\"><ul>\r\n");
          out.write("    ");
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
              out.write("<li>");
              if (_jspx_meth_bean_write_0(_jspx_th_html_messages_0, _jspx_page_context))
                return;
              out.write("</li>\r\n");
              out.write("    ");
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
          out.write("</ul></td>\r\n");
          out.write("</tr>");
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
      out.write("</table>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\"  class=\"report\">\r\n");
      out.write("<tr>\r\n");
      out.write("  <td colspan=\"2\" class=\"text-label\">");
      if (_jspx_meth_bean_message_3(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<!-- START Sectiune de FORM. -->\r\n");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_onsubmit_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/admuser.do");
      _jspx_th_html_form_0.setOnsubmit("return validateForm_AdmUserForm(this);");
      _jspx_th_html_form_0.setEnctype("multipart/form-data;");
      _jspx_th_html_form_0.setStyleId("fdata");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_html_hidden_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("<!--Label pentru user parola si rescriere parola-->\r\n");
          out.write("<input type=\"hidden\" name=\"label_password\" value=' ");
          if (_jspx_meth_bean_message_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("'/>\r\n");
          out.write("<input type=\"hidden\" name=\"label_c_password\" value='");
          if (_jspx_meth_bean_message_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("'/>\r\n");
          out.write("\r\n");
          out.write("<!-- Cimpul 'user_login' field. -->\r\n");
          out.write("<input type=\"hidden\" name=\"rolesArray\" />\r\n");
          out.write("<tr>\r\n");
          out.write("  <td valign=\"top\"  align=\"right\">");
          if (_jspx_meth_bean_message_6(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    <font color=\"#336600\">*</font> :\r\n");
          out.write("  </td>\r\n");
          out.write("  <td class=\"text\" align=\"left\">\r\n");
          out.write("    ");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_7(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\"/>\r\n");
          out.write("  </td>\r\n");
          out.write("</tr>\r\n");
          out.write("<!-- Cimpul 'email' field. -->\r\n");
          out.write("<tr>\r\n");
          out.write("  <td valign=\"top\"  align=\"right\" width=\"40%\">");
          if (_jspx_meth_bean_message_8(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    <font color=\"#336600\">*</font> :\r\n");
          out.write("  </td>\r\n");
          out.write("  <td class=\"text\" align=\"left\"  width=\"60%\">\r\n");
          out.write("    ");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    <img src=\"images/quest.gif\" width=\"15\" height=\"15\"  style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_9(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\"/>\r\n");
          out.write("  </td>\r\n");
          out.write("</tr>\r\n");
          //  logic:empty
          org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_1 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_scope_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
          _jspx_th_logic_empty_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_empty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_empty_1.setName(Constants.ADM_USER_KEY);
          _jspx_th_logic_empty_1.setProperty("values.primaryKey");
          _jspx_th_logic_empty_1.setScope("request");
          int _jspx_eval_logic_empty_1 = _jspx_th_logic_empty_1.doStartTag();
          if (_jspx_eval_logic_empty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("     <!-- Cimpul 'mod de autentificare dorit' CD field. -->\r\n");
              out.write("<tr>\r\n");
              out.write("  <td valign=\"top\" class=\"textbold\" align=\"right\">\r\n");
              out.write("   ");
              if (_jspx_meth_bean_message_10(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("<font color=\"#336600\">*</font> :\r\n");
              out.write("  </td>\r\n");
              out.write("  <td class=\"text\" align=\"left\">\r\n");
              out.write("   <input type=\"hidden\" name=\"cd_label\" value='");
              if (_jspx_meth_bean_message_11(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("'/>\r\n");
              out.write("   ");
              if (_jspx_meth_html_radio_0(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("   <br>\r\n");
              out.write("   ");
              if (_jspx_meth_html_radio_1(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("  </td>\r\n");
              out.write("</tr>\r\n");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_notEmpty_1.setProperty("cd");
              _jspx_th_logic_notEmpty_1.setName(Constants.ADM_USER_KEY);
              int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
              if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
                  _jspx_th_logic_equal_0.setValue("0");
                  _jspx_th_logic_equal_0.setProperty("cd");
                  _jspx_th_logic_equal_0.setName(Constants.ADM_USER_KEY);
                  int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
                  if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("        <!-- Cimpul 'user_passwd' field. -->\r\n");
                      out.write("    <tr>\r\n");
                      out.write("      <td valign=\"top\"  align=\"right\">");
                      if (_jspx_meth_bean_message_14(_jspx_th_logic_equal_0, _jspx_page_context))
                        return;
                      out.write("<font color=\"#336600\">*</font> :\r\n");
                      out.write("      </td>\r\n");
                      out.write("      <td class=\"text\" align=\"left\">\r\n");
                      out.write("        ");
                      if (_jspx_meth_html_password_0(_jspx_th_logic_equal_0, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("        <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                      if (_jspx_meth_bean_message_15(_jspx_th_logic_equal_0, _jspx_page_context))
                        return;
                      out.write("\"/>\r\n");
                      out.write("      </td>\r\n");
                      out.write("    </tr>\r\n");
                      out.write("<!-- Cimpul 'c_user_password' confirmare field. -->\r\n");
                      out.write("  <tr>\r\n");
                      out.write("   <td valign=\"top\" class=\"textbold\" align=\"right\">");
                      if (_jspx_meth_bean_message_16(_jspx_th_logic_equal_0, _jspx_page_context))
                        return;
                      out.write("<font color=\"#336600\">*</font> :\r\n");
                      out.write("   </td>\r\n");
                      out.write("   <td class=\"text\" align=\"left\">\r\n");
                      out.write("    ");
                      if (_jspx_meth_html_password_1(_jspx_th_logic_equal_0, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("    <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                      if (_jspx_meth_bean_message_17(_jspx_th_logic_equal_0, _jspx_page_context))
                        return;
                      out.write("\" />\r\n");
                      out.write("   </td>\r\n");
                      out.write("  </tr>\r\n");
                      out.write("    ");
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
                  out.write("\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
                  _jspx_th_logic_equal_1.setValue("1");
                  _jspx_th_logic_equal_1.setProperty("cd");
                  _jspx_th_logic_equal_1.setName(Constants.ADM_USER_KEY);
                  int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
                  if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("       <!-- campul dupa care caut in ldap -->\r\n");
                      out.write(" <tr>\r\n");
                      out.write("  <td valign=\"top\"  align=\"right\" width=\"40%\">");
                      if (_jspx_meth_bean_message_18(_jspx_th_logic_equal_1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("  <font color=\"#336600\">*</font> :\r\n");
                      out.write("  </td>\r\n");
                      out.write("  <td class=\"text\" align=\"left\"  width=\"60%\">\r\n");
                      out.write("    ");
                      if (_jspx_meth_html_text_2(_jspx_th_logic_equal_1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("    <img src=\"images/quest.gif\" width=\"15\" height=\"15\"  style=\"cursor:pointer;\" title=\"");
                      if (_jspx_meth_bean_message_19(_jspx_th_logic_equal_1, _jspx_page_context))
                        return;
                      out.write("\"/>\r\n");
                      out.write("    <!--Buton cauta in LDAP-->\r\n");
                      out.write("    <input type=\"button\" class=\"btn-generic\" value='");
                      if (_jspx_meth_bean_message_20(_jspx_th_logic_equal_1, _jspx_page_context))
                        return;
                      out.write("'   onclick=' send(\"cautLDAP\");'/>\r\n");
                      out.write("  </td>\r\n");
                      out.write("</tr>\r\n");
                      out.write("\r\n");
                      out.write(" <!--Rezultate cautare in LDAP-->\r\n");
                      out.write("    ");
                      if (_jspx_meth_html_hidden_2(_jspx_th_logic_equal_1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("\r\n");
                      out.write("    <!--valoarea da =  am un singur resultat; nu = nu am resultate; dam = am resultate multiple-->\r\n");
                      out.write("     ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_2 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_equal_2.setPageContext(_jspx_page_context);
                      _jspx_th_logic_equal_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
                      _jspx_th_logic_equal_2.setValue("nu");
                      _jspx_th_logic_equal_2.setProperty("amRezultateCautareLdap");
                      _jspx_th_logic_equal_2.setName(Constants.ADM_USER_KEY);
                      int _jspx_eval_logic_equal_2 = _jspx_th_logic_equal_2.doStartTag();
                      if (_jspx_eval_logic_equal_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("      <tr>\r\n");
                          out.write("        <td colspan=\"2\" class=\"msg_error\" align=\"center\" >\r\n");
                          out.write("        <font color=\"red\">\r\n");
                          out.write("          ");
                          if (_jspx_meth_bean_message_21(_jspx_th_logic_equal_2, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("        </font>\r\n");
                          out.write("        </td>\r\n");
                          out.write("       </tr>\r\n");
                          out.write("     ");
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
                      out.write("\r\n");
                      out.write("\r\n");
                      out.write("     ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_3 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_equal_3.setPageContext(_jspx_page_context);
                      _jspx_th_logic_equal_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
                      _jspx_th_logic_equal_3.setValue("dam");
                      _jspx_th_logic_equal_3.setProperty("amRezultateCautareLdap");
                      _jspx_th_logic_equal_3.setName(Constants.ADM_USER_KEY);
                      int _jspx_eval_logic_equal_3 = _jspx_th_logic_equal_3.doStartTag();
                      if (_jspx_eval_logic_equal_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("      ");
                          //  logic:present
                          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_0 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_scope_name.get(org.apache.struts.taglib.logic.PresentTag.class);
                          _jspx_th_logic_present_0.setPageContext(_jspx_page_context);
                          _jspx_th_logic_present_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_3);
                          _jspx_th_logic_present_0.setName( AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG);
                          _jspx_th_logic_present_0.setScope("session");
                          int _jspx_eval_logic_present_0 = _jspx_th_logic_present_0.doStartTag();
                          if (_jspx_eval_logic_present_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n");
                              out.write("       ");
                              //  logic:notEmpty
                              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_2 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
                              _jspx_th_logic_notEmpty_2.setPageContext(_jspx_page_context);
                              _jspx_th_logic_notEmpty_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_0);
                              _jspx_th_logic_notEmpty_2.setName( AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG);
                              _jspx_th_logic_notEmpty_2.setScope("session");
                              int _jspx_eval_logic_notEmpty_2 = _jspx_th_logic_notEmpty_2.doStartTag();
                              if (_jspx_eval_logic_notEmpty_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n");
                              out.write("        <tr>\r\n");
                              out.write("         <td class=\"msg_error\" colspan=\"2\" align=\"center\">\r\n");
                              out.write("           <font color=\"red\">\r\n");
                              out.write("             ");
                              if (_jspx_meth_bean_message_22(_jspx_th_logic_notEmpty_2, _jspx_page_context))
                              return;
                              out.write(":\r\n");
                              out.write("             <img title='");
                              if (_jspx_meth_bean_message_23(_jspx_th_logic_notEmpty_2, _jspx_page_context))
                              return;
                              out.write("'  src=\"images/view_over.gif\" style=\"cursor:pointer\" onclick=' showMapLDAP();' />\r\n");
                              out.write("           </font>\r\n");
                              out.write("         </td>\r\n");
                              out.write("       </tr>\r\n");
                              out.write("       ");
                              int evalDoAfterBody = _jspx_th_logic_notEmpty_2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_notEmpty_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_logic_notEmpty_scope_name.reuse(_jspx_th_logic_notEmpty_2);
                              return;
                              }
                              _jspx_tagPool_logic_notEmpty_scope_name.reuse(_jspx_th_logic_notEmpty_2);
                              out.write("\r\n");
                              out.write("      ");
                              int evalDoAfterBody = _jspx_th_logic_present_0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_present_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _jspx_tagPool_logic_present_scope_name.reuse(_jspx_th_logic_present_0);
                            return;
                          }
                          _jspx_tagPool_logic_present_scope_name.reuse(_jspx_th_logic_present_0);
                          out.write("\r\n");
                          out.write("  ");
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
                      out.write("\r\n");
                      out.write(" <!--campul 'issuer_name' -->\r\n");
                      out.write(" ");
                      if (_jspx_meth_html_hidden_3(_jspx_th_logic_equal_1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write(" <tr>\r\n");
                      out.write("   <td align=\"right\" >\r\n");
                      out.write("    ");
                      if (_jspx_meth_bean_message_24(_jspx_th_logic_equal_1, _jspx_page_context))
                        return;
                      out.write(":\r\n");
                      out.write("   </td>\r\n");
                      out.write("   <td align=\"left\">\r\n");
                      out.write("    ");
                      if (_jspx_meth_html_text_3(_jspx_th_logic_equal_1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write(" </td>\r\n");
                      out.write(" </tr>\r\n");
                      out.write("  <!--campul 'serial_number' -->\r\n");
                      out.write("  ");
                      if (_jspx_meth_html_hidden_4(_jspx_th_logic_equal_1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write(" <tr align=\"right\">\r\n");
                      out.write("  <td>\r\n");
                      out.write("    ");
                      if (_jspx_meth_bean_message_25(_jspx_th_logic_equal_1, _jspx_page_context))
                        return;
                      out.write(":\r\n");
                      out.write("  </td>\r\n");
                      out.write("  <td align=\"left\" >\r\n");
                      out.write("    ");
                      if (_jspx_meth_html_text_4(_jspx_th_logic_equal_1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("  </td>\r\n");
                      out.write(" </tr>\r\n");
                      out.write("\r\n");
                      out.write("    ");
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
                  out.write('\r');
                  out.write('\n');
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_1);
                return;
              }
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_1);
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
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
          out.write("\r\n");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_3 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_3.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEmpty_3.setName(Constants.ADM_USER_KEY);
          _jspx_th_logic_notEmpty_3.setProperty("values.primaryKey");
          _jspx_th_logic_notEmpty_3.setScope("request");
          int _jspx_eval_logic_notEmpty_3 = _jspx_th_logic_notEmpty_3.doStartTag();
          if (_jspx_eval_logic_notEmpty_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("<!--Campul utilizator activ-->\r\n");
              out.write("\t<tr>\r\n");
              out.write("\t  <td valign=\"top\" class=\"textbold\" align=\"right\" width=\"40%\">");
              if (_jspx_meth_bean_message_26(_jspx_th_logic_notEmpty_3, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t    <font color=\"#336600\"></font> :\r\n");
              out.write("\t  </td>\r\n");
              out.write("\t  <td class=\"text\" align=\"left\"  width=\"60%\">\r\n");
              out.write("\t    ");
              if (_jspx_meth_html_checkbox_0(_jspx_th_logic_notEmpty_3, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t    <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
              if (_jspx_meth_bean_message_27(_jspx_th_logic_notEmpty_3, _jspx_page_context))
                return;
              out.write("\"/>\r\n");
              out.write("\t  </td>\r\n");
              out.write("\t</tr>\r\n");
              out.write("\r\n");
              out.write("<!-- Cimpul 'cd' field. -->\r\n");
              out.write("<tr>\r\n");
              out.write("  <td valign=\"top\" class=\"textbold\" align=\"right\">\r\n");
              out.write("       ");
              if (_jspx_meth_bean_message_28(_jspx_th_logic_notEmpty_3, _jspx_page_context))
                return;
              out.write(" :\r\n");
              out.write("  </td>\r\n");
              out.write("  <td class=\"text\">\r\n");
              out.write("         ");
              //  logic:empty
              org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_2 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
              _jspx_th_logic_empty_2.setPageContext(_jspx_page_context);
              _jspx_th_logic_empty_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_3);
              _jspx_th_logic_empty_2.setProperty("values.user_passwd");
              _jspx_th_logic_empty_2.setName(Constants.ADM_USER_KEY);
              int _jspx_eval_logic_empty_2 = _jspx_th_logic_empty_2.doStartTag();
              if (_jspx_eval_logic_empty_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  if (_jspx_meth_bean_message_29(_jspx_th_logic_empty_2, _jspx_page_context))
                    return;
                  int evalDoAfterBody = _jspx_th_logic_empty_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_empty_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_2);
                return;
              }
              _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_2);
              out.write("\r\n");
              out.write("         ");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_4 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_4.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_3);
              _jspx_th_logic_notEmpty_4.setProperty("values.user_passwd");
              _jspx_th_logic_notEmpty_4.setName(Constants.ADM_USER_KEY);
              int _jspx_eval_logic_notEmpty_4 = _jspx_th_logic_notEmpty_4.doStartTag();
              if (_jspx_eval_logic_notEmpty_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  if (_jspx_meth_bean_message_30(_jspx_th_logic_notEmpty_4, _jspx_page_context))
                    return;
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_4);
                return;
              }
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_4);
              out.write("\r\n");
              out.write("  </td>\r\n");
              out.write("</tr>\r\n");
              out.write("\r\n");
              out.write("<!--Utilizatorul are ca mod de logare  CD -->\r\n");
              //  logic:empty
              org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_3 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
              _jspx_th_logic_empty_3.setPageContext(_jspx_page_context);
              _jspx_th_logic_empty_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_3);
              _jspx_th_logic_empty_3.setProperty("values.user_passwd");
              _jspx_th_logic_empty_3.setName(Constants.ADM_USER_KEY);
              int _jspx_eval_logic_empty_3 = _jspx_th_logic_empty_3.doStartTag();
              if (_jspx_eval_logic_empty_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write(" <!--campul 'issuer_name' -->\r\n");
                  out.write(" ");
                  if (_jspx_meth_html_hidden_5(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write(" <tr>\r\n");
                  out.write("  <td align=\"right\">\r\n");
                  out.write("    ");
                  if (_jspx_meth_bean_message_31(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write(":\r\n");
                  out.write("  </td>\r\n");
                  out.write("  <td align=\"left\" >\r\n");
                  out.write("    ");
                  if (_jspx_meth_html_text_5(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("  </td>\r\n");
                  out.write(" </tr>\r\n");
                  out.write("  <!--campul 'serial_number' -->\r\n");
                  out.write("  ");
                  if (_jspx_meth_html_hidden_6(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write(" <tr>\r\n");
                  out.write("   <td align=\"right\">\r\n");
                  out.write("       ");
                  if (_jspx_meth_bean_message_32(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write(":\r\n");
                  out.write("   </td>\r\n");
                  out.write("   <td align=\"left\" >\r\n");
                  out.write("     ");
                  if (_jspx_meth_html_text_6(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("   </td>\r\n");
                  out.write(" </tr>\r\n");
                  out.write("\r\n");
                  out.write("<!-- campul dupa care caut in ldap -->\r\n");
                  out.write(" <tr>\r\n");
                  out.write("  <td valign=\"top\"  align=\"right\" width=\"40%\">");
                  if (_jspx_meth_bean_message_33(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("  <font color=\"#336600\">*</font> :\r\n");
                  out.write("  </td>\r\n");
                  out.write("  <td class=\"text\" align=\"left\"  width=\"60%\">\r\n");
                  out.write("    ");
                  if (_jspx_meth_html_text_7(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("    <img src=\"images/quest.gif\" width=\"15\" height=\"15\"  style=\"cursor:pointer;\" title=\"");
                  if (_jspx_meth_bean_message_34(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write("\"/>\r\n");
                  out.write("     <!--Buton cauta in LDAP-->\r\n");
                  out.write("    <input type=\"button\" class=\"btn-generic\" value='");
                  if (_jspx_meth_bean_message_35(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write("'   onclick=' send(\"cautLDAPm\");'/>\r\n");
                  out.write("  </td>\r\n");
                  out.write("</tr>\r\n");
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("  <!--Rezultate cautare in LDAP-->\r\n");
                  out.write("\r\n");
                  out.write("    ");
                  if (_jspx_meth_html_hidden_7(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("    <!--valoarea da =  am un singur resultat; nu = nu am resultate; dam = am resultate multiple-->\r\n");
                  out.write("     ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_4 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_4.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
                  _jspx_th_logic_equal_4.setValue("nu");
                  _jspx_th_logic_equal_4.setProperty("amRezultateCautareLdap");
                  _jspx_th_logic_equal_4.setName(Constants.ADM_USER_KEY);
                  int _jspx_eval_logic_equal_4 = _jspx_th_logic_equal_4.doStartTag();
                  if (_jspx_eval_logic_equal_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <tr>\r\n");
                      out.write("        <td colspan=\"3\" class=\"msg_error\" align=\"center\" >\r\n");
                      out.write("        <font color=\"red\">\r\n");
                      out.write("          ");
                      if (_jspx_meth_bean_message_36(_jspx_th_logic_equal_4, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("        </font>\r\n");
                      out.write("        </td>\r\n");
                      out.write("       </tr>\r\n");
                      out.write("     ");
                      int evalDoAfterBody = _jspx_th_logic_equal_4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_4);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_4);
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("     ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_5 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_5.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
                  _jspx_th_logic_equal_5.setValue("dam");
                  _jspx_th_logic_equal_5.setProperty("amRezultateCautareLdap");
                  _jspx_th_logic_equal_5.setName(Constants.ADM_USER_KEY);
                  int _jspx_eval_logic_equal_5 = _jspx_th_logic_equal_5.doStartTag();
                  if (_jspx_eval_logic_equal_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      ");
                      //  logic:present
                      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_1 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_scope_name.get(org.apache.struts.taglib.logic.PresentTag.class);
                      _jspx_th_logic_present_1.setPageContext(_jspx_page_context);
                      _jspx_th_logic_present_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_5);
                      _jspx_th_logic_present_1.setName( AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG);
                      _jspx_th_logic_present_1.setScope("session");
                      int _jspx_eval_logic_present_1 = _jspx_th_logic_present_1.doStartTag();
                      if (_jspx_eval_logic_present_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("       ");
                          //  logic:notEmpty
                          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_5 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
                          _jspx_th_logic_notEmpty_5.setPageContext(_jspx_page_context);
                          _jspx_th_logic_notEmpty_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_1);
                          _jspx_th_logic_notEmpty_5.setName( AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG);
                          _jspx_th_logic_notEmpty_5.setScope("session");
                          int _jspx_eval_logic_notEmpty_5 = _jspx_th_logic_notEmpty_5.doStartTag();
                          if (_jspx_eval_logic_notEmpty_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n");
                              out.write("        <tr>\r\n");
                              out.write("         <td class=\"msg_error\" colspan=\"3\" align=\"center\" >\r\n");
                              out.write("           <font color=\"red\">\r\n");
                              out.write("             ");
                              if (_jspx_meth_bean_message_37(_jspx_th_logic_notEmpty_5, _jspx_page_context))
                              return;
                              out.write(":\r\n");
                              out.write("             <img title='");
                              if (_jspx_meth_bean_message_38(_jspx_th_logic_notEmpty_5, _jspx_page_context))
                              return;
                              out.write("'  src=\"images/view_over.gif\" style=\"cursor:pointer\" onclick=' showMapLDAP();' />\r\n");
                              out.write("           </font>\r\n");
                              out.write("         </td>\r\n");
                              out.write("       </tr>\r\n");
                              out.write("       ");
                              int evalDoAfterBody = _jspx_th_logic_notEmpty_5.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_notEmpty_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _jspx_tagPool_logic_notEmpty_scope_name.reuse(_jspx_th_logic_notEmpty_5);
                            return;
                          }
                          _jspx_tagPool_logic_notEmpty_scope_name.reuse(_jspx_th_logic_notEmpty_5);
                          out.write("\r\n");
                          out.write("      ");
                          int evalDoAfterBody = _jspx_th_logic_present_1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_present_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _jspx_tagPool_logic_present_scope_name.reuse(_jspx_th_logic_present_1);
                        return;
                      }
                      _jspx_tagPool_logic_present_scope_name.reuse(_jspx_th_logic_present_1);
                      out.write("\r\n");
                      out.write("     ");
                      int evalDoAfterBody = _jspx_th_logic_equal_5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_5);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_5);
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("   <!--Schimbare mod de autentificare-->\r\n");
                  out.write("    <tr>\r\n");
                  out.write("        <td valign=\"top\" class=\"textbold\" align=\"right\">\r\n");
                  out.write("           ");
                  if (_jspx_meth_bean_message_39(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("        </td>\r\n");
                  out.write("       <td class=\"text\" align=\"left\">\r\n");
                  out.write("       ");
                  if (_jspx_meth_html_checkbox_1(_jspx_th_logic_empty_3, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("      <!-- <input type=\"checkbox\" id=\"chaut\" name=\"chaut\"/>-->\r\n");
                  out.write("   </td>\r\n");
                  out.write("</tr>\r\n");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_6 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_6.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
                  _jspx_th_logic_equal_6.setValue("true");
                  _jspx_th_logic_equal_6.setProperty("chaut");
                  _jspx_th_logic_equal_6.setName(Constants.ADM_USER_KEY);
                  int _jspx_eval_logic_equal_6 = _jspx_th_logic_equal_6.doStartTag();
                  if (_jspx_eval_logic_equal_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <!-- Cimpul 'user_password' field. -->\r\n");
                      out.write("   <tr>\r\n");
                      out.write("     <td valign=\"top\" class=\"textbold\" align=\"right\">\r\n");
                      out.write("       ");
                      if (_jspx_meth_bean_message_40(_jspx_th_logic_equal_6, _jspx_page_context))
                        return;
                      out.write("<font color=\"#336600\">*</font> :\r\n");
                      out.write("     </td>\r\n");
                      out.write("     <td class=\"text\" align=\"left\">\r\n");
                      out.write("      ");
                      if (_jspx_meth_html_password_2(_jspx_th_logic_equal_6, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("      <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                      if (_jspx_meth_bean_message_41(_jspx_th_logic_equal_6, _jspx_page_context))
                        return;
                      out.write("\" />\r\n");
                      out.write("     </td>\r\n");
                      out.write("  </tr>\r\n");
                      out.write(" <!-- Cimpul 'c_user_password' confirmare field. -->\r\n");
                      out.write("  <tr>\r\n");
                      out.write("   <td valign=\"top\" class=\"textbold\" align=\"right\">");
                      if (_jspx_meth_bean_message_42(_jspx_th_logic_equal_6, _jspx_page_context))
                        return;
                      out.write("<font color=\"#336600\">*</font> :\r\n");
                      out.write("   </td>\r\n");
                      out.write("   <td class=\"text\" align=\"left\">\r\n");
                      out.write("    ");
                      if (_jspx_meth_html_password_3(_jspx_th_logic_equal_6, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("    <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                      if (_jspx_meth_bean_message_43(_jspx_th_logic_equal_6, _jspx_page_context))
                        return;
                      out.write("\" />\r\n");
                      out.write("   </td>\r\n");
                      out.write("  </tr>\r\n");
                      int evalDoAfterBody = _jspx_th_logic_equal_6.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_6);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_6);
                  out.write("\r\n");
                  out.write("\r\n");
                  int evalDoAfterBody = _jspx_th_logic_empty_3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_empty_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_3);
                return;
              }
              _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_3);
              out.write("\r\n");
              out.write("<!--End utilizator are ca mod de logare CD-->\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("<!--Utilizator are ca mod de logare user/parola-->\r\n");
              out.write("\r\n");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_6 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_6.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_3);
              _jspx_th_logic_notEmpty_6.setProperty("values.user_passwd");
              _jspx_th_logic_notEmpty_6.setName(Constants.ADM_USER_KEY);
              int _jspx_eval_logic_notEmpty_6 = _jspx_th_logic_notEmpty_6.doStartTag();
              if (_jspx_eval_logic_notEmpty_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write('\r');
                  out.write('\n');
                  if (_jspx_meth_html_hidden_8(_jspx_th_logic_notEmpty_6, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("    <tr>\r\n");
                  out.write("      <td valign=\"top\" class=\"textbold\" align=\"right\">\r\n");
                  out.write("       ");
                  if (_jspx_meth_bean_message_44(_jspx_th_logic_notEmpty_6, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("      </td>\r\n");
                  out.write("      <td class=\"text\" align=\"left\">\r\n");
                  out.write("      <!--// ch 1 pentur schimbare mod de autentificare si 0 pentru schimbare parola 2 nu schimb nimic-->\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_radio_2(_jspx_th_logic_notEmpty_6, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("      </td>\r\n");
                  out.write("    </tr>\r\n");
                  out.write("    <tr>\r\n");
                  out.write("      <td valign=\"top\" class=\"textbold\" align=\"right\">\r\n");
                  out.write("       ");
                  if (_jspx_meth_bean_message_45(_jspx_th_logic_notEmpty_6, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("      </td>\r\n");
                  out.write("      <td class=\"text\" align=\"left\">\r\n");
                  out.write("      <!--// ch 1 pentur schimbare mod de autentificare si 0 pentru schimbare parola-->\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_radio_3(_jspx_th_logic_notEmpty_6, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("      ");
                  out.write("\r\n");
                  out.write("      <!-- <input type=\"checkbox\" id=\"chpass\" onclick=\"togglePass()\" name=\"chpass\" />-->\r\n");
                  out.write("      </td>\r\n");
                  out.write("    </tr>\r\n");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_7 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_7.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_6);
                  _jspx_th_logic_equal_7.setValue("0");
                  _jspx_th_logic_equal_7.setProperty("ch");
                  _jspx_th_logic_equal_7.setName(Constants.ADM_USER_KEY);
                  int _jspx_eval_logic_equal_7 = _jspx_th_logic_equal_7.doStartTag();
                  if (_jspx_eval_logic_equal_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <!-- Cimpul 'user_passwd' field. -->\r\n");
                      out.write("    <tr>\r\n");
                      out.write("      <td valign=\"top\" class=\"textbold\" align=\"right\">\r\n");
                      out.write("           ");
                      if (_jspx_meth_bean_message_46(_jspx_th_logic_equal_7, _jspx_page_context))
                        return;
                      out.write(" <font color=\"#336600\">*</font> :\r\n");
                      out.write("      </td>\r\n");
                      out.write("      <td class=\"text\" align=\"left\">\r\n");
                      out.write("       <input type=\"hidden\" name=\"label_password\" value=' ");
                      if (_jspx_meth_bean_message_47(_jspx_th_logic_equal_7, _jspx_page_context))
                        return;
                      out.write("'/>\r\n");
                      out.write("       ");
                      if (_jspx_meth_html_password_4(_jspx_th_logic_equal_7, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("       <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                      if (_jspx_meth_bean_message_48(_jspx_th_logic_equal_7, _jspx_page_context))
                        return;
                      out.write("\" />\r\n");
                      out.write("      </td>\r\n");
                      out.write("    </tr>\r\n");
                      out.write("    <tr>\r\n");
                      out.write("       <td valign=\"top\" class=\"textbold\" align=\"right\">");
                      if (_jspx_meth_bean_message_49(_jspx_th_logic_equal_7, _jspx_page_context))
                        return;
                      out.write("<font color=\"#336600\">*</font> :\r\n");
                      out.write("       </td>\r\n");
                      out.write("       <td class=\"text\" align=\"left\">\r\n");
                      out.write("        ");
                      if (_jspx_meth_html_password_5(_jspx_th_logic_equal_7, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("        <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                      if (_jspx_meth_bean_message_50(_jspx_th_logic_equal_7, _jspx_page_context))
                        return;
                      out.write("\" />\r\n");
                      out.write("       </td>\r\n");
                      out.write("    </tr>\r\n");
                      int evalDoAfterBody = _jspx_th_logic_equal_7.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_7);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_7);
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("    <!--Schimbare mod de autentificare-->\r\n");
                  out.write("    <tr>\r\n");
                  out.write("        <td valign=\"top\" class=\"textbold\" align=\"right\">\r\n");
                  out.write("           ");
                  if (_jspx_meth_bean_message_51(_jspx_th_logic_notEmpty_6, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("        </td>\r\n");
                  out.write("       <td class=\"text\" align=\"left\">\r\n");
                  out.write("       <!--// ch 1 pentur schimbare mod de autentificare si 0 pentru schimbare parola-->\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_radio_4(_jspx_th_logic_notEmpty_6, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("       ");
                  out.write("\r\n");
                  out.write("     </td>\r\n");
                  out.write("    </tr>\r\n");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_8 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_8.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_6);
                  _jspx_th_logic_equal_8.setValue("1");
                  _jspx_th_logic_equal_8.setProperty("ch");
                  _jspx_th_logic_equal_8.setName(Constants.ADM_USER_KEY);
                  int _jspx_eval_logic_equal_8 = _jspx_th_logic_equal_8.doStartTag();
                  if (_jspx_eval_logic_equal_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <!-- campul dupa care caut in ldap -->\r\n");
                      out.write(" <tr>\r\n");
                      out.write("  <td valign=\"top\"  align=\"right\" width=\"40%\">");
                      if (_jspx_meth_bean_message_52(_jspx_th_logic_equal_8, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("  <font color=\"#336600\">*</font> :\r\n");
                      out.write("  </td>\r\n");
                      out.write("  <td class=\"text\" align=\"left\"  width=\"60%\">\r\n");
                      out.write("    ");
                      if (_jspx_meth_html_text_8(_jspx_th_logic_equal_8, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("    <img src=\"images/quest.gif\" width=\"15\" height=\"15\"  style=\"cursor:pointer;\" title=\"");
                      if (_jspx_meth_bean_message_53(_jspx_th_logic_equal_8, _jspx_page_context))
                        return;
                      out.write("\"/>\r\n");
                      out.write("    <!--Buton cauta in LDAP-->\r\n");
                      out.write("    <input type=\"button\" class=\"btn-generic\" value='");
                      if (_jspx_meth_bean_message_54(_jspx_th_logic_equal_8, _jspx_page_context))
                        return;
                      out.write("'   onclick=' send(\"cautLDAPm\");'/>\r\n");
                      out.write("  </td>\r\n");
                      out.write("</tr>\r\n");
                      out.write(" <!--Rezultate cautare in LDAP-->\r\n");
                      out.write("    ");
                      if (_jspx_meth_html_hidden_9(_jspx_th_logic_equal_8, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("\r\n");
                      out.write("    <!--valoarea da =  am un singur resultat; nu = nu am resultate; dam = am resultate multiple-->\r\n");
                      out.write("     ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_9 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_equal_9.setPageContext(_jspx_page_context);
                      _jspx_th_logic_equal_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
                      _jspx_th_logic_equal_9.setValue("nu");
                      _jspx_th_logic_equal_9.setProperty("amRezultateCautareLdap");
                      _jspx_th_logic_equal_9.setName(Constants.ADM_USER_KEY);
                      int _jspx_eval_logic_equal_9 = _jspx_th_logic_equal_9.doStartTag();
                      if (_jspx_eval_logic_equal_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("      <tr>\r\n");
                          out.write("        <td colspan=\"2\" class=\"msg_error\" align=\"center\" >\r\n");
                          out.write("        <font color=\"red\">\r\n");
                          out.write("          ");
                          if (_jspx_meth_bean_message_55(_jspx_th_logic_equal_9, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("        </font>\r\n");
                          out.write("        </td>\r\n");
                          out.write("       </tr>\r\n");
                          out.write("     ");
                          int evalDoAfterBody = _jspx_th_logic_equal_9.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_equal_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_9);
                        return;
                      }
                      _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_9);
                      out.write("\r\n");
                      out.write("\r\n");
                      out.write("     ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_10 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_equal_10.setPageContext(_jspx_page_context);
                      _jspx_th_logic_equal_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
                      _jspx_th_logic_equal_10.setValue("dam");
                      _jspx_th_logic_equal_10.setProperty("amRezultateCautareLdap");
                      _jspx_th_logic_equal_10.setName(Constants.ADM_USER_KEY);
                      int _jspx_eval_logic_equal_10 = _jspx_th_logic_equal_10.doStartTag();
                      if (_jspx_eval_logic_equal_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("      ");
                          //  logic:present
                          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_2 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_scope_name.get(org.apache.struts.taglib.logic.PresentTag.class);
                          _jspx_th_logic_present_2.setPageContext(_jspx_page_context);
                          _jspx_th_logic_present_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_10);
                          _jspx_th_logic_present_2.setName( AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG);
                          _jspx_th_logic_present_2.setScope("session");
                          int _jspx_eval_logic_present_2 = _jspx_th_logic_present_2.doStartTag();
                          if (_jspx_eval_logic_present_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n");
                              out.write("       ");
                              //  logic:notEmpty
                              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_7 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
                              _jspx_th_logic_notEmpty_7.setPageContext(_jspx_page_context);
                              _jspx_th_logic_notEmpty_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_2);
                              _jspx_th_logic_notEmpty_7.setName( AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG);
                              _jspx_th_logic_notEmpty_7.setScope("session");
                              int _jspx_eval_logic_notEmpty_7 = _jspx_th_logic_notEmpty_7.doStartTag();
                              if (_jspx_eval_logic_notEmpty_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n");
                              out.write("        <tr>\r\n");
                              out.write("         <td class=\"msg_error\" colspan=\"2\" align=\"center\"  >\r\n");
                              out.write("           <font color=\"red\">\r\n");
                              out.write("             ");
                              if (_jspx_meth_bean_message_56(_jspx_th_logic_notEmpty_7, _jspx_page_context))
                              return;
                              out.write(":\r\n");
                              out.write("             <img title='");
                              if (_jspx_meth_bean_message_57(_jspx_th_logic_notEmpty_7, _jspx_page_context))
                              return;
                              out.write("'  src=\"images/view_over.gif\" style=\"cursor:pointer\" onclick=' showMapLDAP();' />\r\n");
                              out.write("           </font>\r\n");
                              out.write("         </td>\r\n");
                              out.write("       </tr>\r\n");
                              out.write("       ");
                              int evalDoAfterBody = _jspx_th_logic_notEmpty_7.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_notEmpty_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_logic_notEmpty_scope_name.reuse(_jspx_th_logic_notEmpty_7);
                              return;
                              }
                              _jspx_tagPool_logic_notEmpty_scope_name.reuse(_jspx_th_logic_notEmpty_7);
                              out.write("\r\n");
                              out.write("      ");
                              int evalDoAfterBody = _jspx_th_logic_present_2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_present_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _jspx_tagPool_logic_present_scope_name.reuse(_jspx_th_logic_present_2);
                            return;
                          }
                          _jspx_tagPool_logic_present_scope_name.reuse(_jspx_th_logic_present_2);
                          out.write("\r\n");
                          out.write("     ");
                          int evalDoAfterBody = _jspx_th_logic_equal_10.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_equal_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_10);
                        return;
                      }
                      _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_10);
                      out.write("\r\n");
                      out.write("  <!--campul 'issuer_name' -->\r\n");
                      out.write(" ");
                      if (_jspx_meth_html_hidden_10(_jspx_th_logic_equal_8, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write(" <tr>\r\n");
                      out.write("  <td align=\"right\" >\r\n");
                      out.write("    ");
                      if (_jspx_meth_bean_message_58(_jspx_th_logic_equal_8, _jspx_page_context))
                        return;
                      out.write(":\r\n");
                      out.write("  </td>\r\n");
                      out.write("  <td align=\"left\">\r\n");
                      out.write("    ");
                      if (_jspx_meth_html_text_9(_jspx_th_logic_equal_8, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("  </td>\r\n");
                      out.write(" </tr>\r\n");
                      out.write("  <!--campul 'serial_number' -->\r\n");
                      out.write(" ");
                      if (_jspx_meth_html_hidden_11(_jspx_th_logic_equal_8, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write(" <tr>\r\n");
                      out.write("   <td align=\"right\">\r\n");
                      out.write("   ");
                      if (_jspx_meth_bean_message_59(_jspx_th_logic_equal_8, _jspx_page_context))
                        return;
                      out.write(":\r\n");
                      out.write(" </td>\r\n");
                      out.write(" <td align=\"left\" >\r\n");
                      out.write("  ");
                      if (_jspx_meth_html_text_10(_jspx_th_logic_equal_8, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write(" </td>\r\n");
                      out.write(" </tr>\r\n");
                      int evalDoAfterBody = _jspx_th_logic_equal_8.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_8);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_8);
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("\r\n");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_6);
                return;
              }
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_6);
              out.write("\r\n");
              out.write("<!-- END Utilizator are ca mod de logare user/parola-->\r\n");
              out.write("\r\n");
              int evalDoAfterBody = _jspx_th_logic_notEmpty_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_3);
            return;
          }
          _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_3);
          out.write("\r\n");
          out.write("<tr>\r\n");
          out.write("\t\t  <td colspan=\"2\" class=\"button-row\" align=\"center\">&nbsp;</td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\t\t");
          out.write("\r\n");
          out.write("\t\t");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<!-- START Sectiune de BUTOANE. -->\r\n");
          out.write("\r\n");
          out.write("<!-- Cimpul 'method' field. -->\r\n");
          if (_jspx_meth_html_hidden_12(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          //  logic:empty
          org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_4 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_scope_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
          _jspx_th_logic_empty_4.setPageContext(_jspx_page_context);
          _jspx_th_logic_empty_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_empty_4.setName(Constants.ADM_USER_KEY);
          _jspx_th_logic_empty_4.setProperty("values.primaryKey");
          _jspx_th_logic_empty_4.setScope("request");
          int _jspx_eval_logic_empty_4 = _jspx_th_logic_empty_4.doStartTag();
          if (_jspx_eval_logic_empty_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("<!-- Buton adugare. -->\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td colspan=\"2\" align=\"center\">\r\n");
              out.write("      <input type=\"button\" class=\"btn-generic\" value='");
              if (_jspx_meth_bean_message_60(_jspx_th_logic_empty_4, _jspx_page_context))
                return;
              out.write("'   onclick=' send(\"add\");'/>\r\n");
              out.write("    </td>\r\n");
              out.write("  </tr>\r\n");
              int evalDoAfterBody = _jspx_th_logic_empty_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_empty_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_4);
            return;
          }
          _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_4);
          out.write('\r');
          out.write('\n');
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_8 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_8.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEmpty_8.setName(Constants.ADM_USER_KEY);
          _jspx_th_logic_notEmpty_8.setProperty("values.primaryKey");
          _jspx_th_logic_notEmpty_8.setScope("request");
          int _jspx_eval_logic_notEmpty_8 = _jspx_th_logic_notEmpty_8.doStartTag();
          if (_jspx_eval_logic_notEmpty_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("<!-- buton modificare. -->\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td colspan=\"2\" align=\"center\">\r\n");
              out.write("      <input type=\"button\" class=\"btn-generic\" value='");
              if (_jspx_meth_bean_message_61(_jspx_th_logic_notEmpty_8, _jspx_page_context))
                return;
              out.write("'   onclick=' send(\"update\");'/>\r\n");
              out.write("      ");
              out.write("\r\n");
              out.write("    </td>\r\n");
              out.write("  </tr>\r\n");
              int evalDoAfterBody = _jspx_th_logic_notEmpty_8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_8);
            return;
          }
          _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_8);
          out.write("\r\n");
          out.write("<!-- END Sectiune de BUTOANE. -->\r\n");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_styleId_onsubmit_enctype_action.reuse(_jspx_th_html_form_0);
        return;
      }
      _jspx_tagPool_html_form_styleId_onsubmit_enctype_action.reuse(_jspx_th_html_form_0);
      out.write("\r\n");
      out.write("<!-- END Sectiune de FORM. -->\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Validare cimpuri forma. -->\r\n");
      if (_jspx_meth_html_javascript_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script language=\"Javascript1.1\" src=\"staticJavascript.jsp\"></script>");
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
    _jspx_th_bean_message_0.setBundle("admuser");
    _jspx_th_bean_message_0.setKey("adm_user.title.add");
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
    _jspx_th_bean_message_1.setBundle("admuser");
    _jspx_th_bean_message_1.setKey("adm_user.title.save");
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
    _jspx_th_bean_message_2.setBundle("admuser");
    _jspx_th_bean_message_2.setKey("adm_user.label.closeWindow");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_messages_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_messages_0);
    _jspx_th_bean_write_0.setName("error");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_0);
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
    _jspx_th_bean_message_3.setBundle("admuser");
    _jspx_th_bean_message_3.setKey("adm_user.subtitle.add");
    int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
    if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
    return false;
  }

  private boolean _jspx_meth_html_hidden_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_1.setProperty("values.id_user");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_1);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_4.setBundle("admuserinreg");
    _jspx_th_bean_message_4.setKey("adm_user_inreg.prompt.user_password");
    int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
    if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_5.setBundle("admuserinreg");
    _jspx_th_bean_message_5.setKey("adm_user_inreg.prompt.c_user_password");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
    return false;
  }

  private boolean _jspx_meth_bean_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_6.setBundle("admuser");
    _jspx_th_bean_message_6.setKey("adm_user.prompt.user_login");
    int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
    if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setErrorStyleClass("errorfield");
    _jspx_th_html_text_0.setStyleClass("field_input");
    _jspx_th_html_text_0.setProperty("values.user_login");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_7 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_7.setBundle("admuser");
    _jspx_th_bean_message_7.setKey("adm_user.label.tooltip.user_login");
    int _jspx_eval_bean_message_7 = _jspx_th_bean_message_7.doStartTag();
    if (_jspx_th_bean_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
    return false;
  }

  private boolean _jspx_meth_bean_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_8 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_8.setBundle("admuser");
    _jspx_th_bean_message_8.setKey("adm_user.prompt.email");
    int _jspx_eval_bean_message_8 = _jspx_th_bean_message_8.doStartTag();
    if (_jspx_th_bean_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setErrorStyleClass("errorfield");
    _jspx_th_html_text_1.setStyleClass("field_input");
    _jspx_th_html_text_1.setProperty("values.email");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_9 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_9.setBundle("admuser");
    _jspx_th_bean_message_9.setKey("adm_user.label.tooltip.email");
    int _jspx_eval_bean_message_9 = _jspx_th_bean_message_9.doStartTag();
    if (_jspx_th_bean_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
    return false;
  }

  private boolean _jspx_meth_bean_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_10 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_10.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_10.setBundle("admuserinreg");
    _jspx_th_bean_message_10.setKey("adm_user_inreg.prompt.mod_autentificare");
    int _jspx_eval_bean_message_10 = _jspx_th_bean_message_10.doStartTag();
    if (_jspx_th_bean_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
    return false;
  }

  private boolean _jspx_meth_bean_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_11 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_11.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_11.setBundle("admuserinreg");
    _jspx_th_bean_message_11.setKey("adm_user_inreg.prompt.mod_autentificare");
    int _jspx_eval_bean_message_11 = _jspx_th_bean_message_11.doStartTag();
    if (_jspx_th_bean_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
    return false;
  }

  private boolean _jspx_meth_html_radio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_0 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_property_onclick.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_html_radio_0.setProperty("cd");
    _jspx_th_html_radio_0.setValue("1");
    _jspx_th_html_radio_0.setOnclick(" chcd();");
    int _jspx_eval_html_radio_0 = _jspx_th_html_radio_0.doStartTag();
    if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_radio_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_radio_0.doInitBody();
      }
      do {
        if (_jspx_meth_bean_message_12(_jspx_th_html_radio_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_html_radio_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_property_onclick.reuse(_jspx_th_html_radio_0);
      return true;
    }
    _jspx_tagPool_html_radio_value_property_onclick.reuse(_jspx_th_html_radio_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_radio_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_12 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_12.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_radio_0);
    _jspx_th_bean_message_12.setBundle("admuserinreg");
    _jspx_th_bean_message_12.setKey("adm_user_inreg.prompt.cd");
    int _jspx_eval_bean_message_12 = _jspx_th_bean_message_12.doStartTag();
    if (_jspx_th_bean_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
    return false;
  }

  private boolean _jspx_meth_html_radio_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_1 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_property_onclick.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_1.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_html_radio_1.setProperty("cd");
    _jspx_th_html_radio_1.setValue("0");
    _jspx_th_html_radio_1.setOnclick(" chcd();");
    int _jspx_eval_html_radio_1 = _jspx_th_html_radio_1.doStartTag();
    if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_radio_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_radio_1.doInitBody();
      }
      do {
        if (_jspx_meth_bean_message_13(_jspx_th_html_radio_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_html_radio_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_radio_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_property_onclick.reuse(_jspx_th_html_radio_1);
      return true;
    }
    _jspx_tagPool_html_radio_value_property_onclick.reuse(_jspx_th_html_radio_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_radio_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_13 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_13.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_radio_1);
    _jspx_th_bean_message_13.setBundle("admuserinreg");
    _jspx_th_bean_message_13.setKey("adm_user_inreg.prompt.up");
    int _jspx_eval_bean_message_13 = _jspx_th_bean_message_13.doStartTag();
    if (_jspx_th_bean_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_13);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_13);
    return false;
  }

  private boolean _jspx_meth_bean_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_14 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_14.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_bean_message_14.setBundle("admuser");
    _jspx_th_bean_message_14.setKey("adm_user.prompt.user_passwd");
    int _jspx_eval_bean_message_14 = _jspx_th_bean_message_14.doStartTag();
    if (_jspx_th_bean_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_14);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_14);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(_jspx_page_context);
    _jspx_th_html_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_html_password_0.setErrorStyleClass("errorfield");
    _jspx_th_html_password_0.setStyleClass("field_input");
    _jspx_th_html_password_0.setProperty("values.user_passwd");
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_0);
      return true;
    }
    _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_15 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_15.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_bean_message_15.setBundle("admuser");
    _jspx_th_bean_message_15.setKey("adm_user.label.tooltip.user_passwd");
    int _jspx_eval_bean_message_15 = _jspx_th_bean_message_15.doStartTag();
    if (_jspx_th_bean_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_15);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_15);
    return false;
  }

  private boolean _jspx_meth_bean_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_16 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_16.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_bean_message_16.setBundle("admuserinreg");
    _jspx_th_bean_message_16.setKey("adm_user_inreg.prompt.c_user_password");
    int _jspx_eval_bean_message_16 = _jspx_th_bean_message_16.doStartTag();
    if (_jspx_th_bean_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_16);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_16);
    return false;
  }

  private boolean _jspx_meth_html_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_1 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_1.setPageContext(_jspx_page_context);
    _jspx_th_html_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_html_password_1.setErrorStyleClass("errorfield");
    _jspx_th_html_password_1.setStyleClass("field_input");
    _jspx_th_html_password_1.setProperty("c_user_password");
    _jspx_th_html_password_1.setStyleId("cpw");
    int _jspx_eval_html_password_1 = _jspx_th_html_password_1.doStartTag();
    if (_jspx_th_html_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_1);
      return true;
    }
    _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_17 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_17.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_bean_message_17.setBundle("admuserinreg");
    _jspx_th_bean_message_17.setKey("adm_user_inreg.label.tooltip.c_user_password");
    int _jspx_eval_bean_message_17 = _jspx_th_bean_message_17.doStartTag();
    if (_jspx_th_bean_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_17);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_17);
    return false;
  }

  private boolean _jspx_meth_bean_message_18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_18 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_18.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_bean_message_18.setBundle("admuser");
    _jspx_th_bean_message_18.setKey("adm_user.prompt.numeldap");
    int _jspx_eval_bean_message_18 = _jspx_th_bean_message_18.doStartTag();
    if (_jspx_th_bean_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_html_text_2.setErrorStyleClass("errorfield");
    _jspx_th_html_text_2.setStyleClass("field_input");
    _jspx_th_html_text_2.setProperty("numeSearchLdap");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_19 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_19.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_bean_message_19.setBundle("admuser");
    _jspx_th_bean_message_19.setKey("adm_user.label.tooltip.numeldap");
    int _jspx_eval_bean_message_19 = _jspx_th_bean_message_19.doStartTag();
    if (_jspx_th_bean_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
    return false;
  }

  private boolean _jspx_meth_bean_message_20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_20 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_20.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_bean_message_20.setBundle("admuserinreg");
    _jspx_th_bean_message_20.setKey("adm_user_inreg.button.cauta_ldap");
    int _jspx_eval_bean_message_20 = _jspx_th_bean_message_20.doStartTag();
    if (_jspx_th_bean_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_20);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_20);
    return false;
  }

  private boolean _jspx_meth_html_hidden_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_html_hidden_2.setProperty("amRezultateCautareLdap");
    int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
    if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_2);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_21(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_21 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_21.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_2);
    _jspx_th_bean_message_21.setBundle("admuserinreg");
    _jspx_th_bean_message_21.setKey("adm_user_inreg.label.nu_rezulate.ldap");
    int _jspx_eval_bean_message_21 = _jspx_th_bean_message_21.doStartTag();
    if (_jspx_th_bean_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_21);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_21);
    return false;
  }

  private boolean _jspx_meth_bean_message_22(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_22 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_22.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_2);
    _jspx_th_bean_message_22.setBundle("admuserinreg");
    _jspx_th_bean_message_22.setKey("adm_user_inreg.label.rezultate.ldap");
    int _jspx_eval_bean_message_22 = _jspx_th_bean_message_22.doStartTag();
    if (_jspx_th_bean_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_22);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_22);
    return false;
  }

  private boolean _jspx_meth_bean_message_23(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_23 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_23.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_2);
    _jspx_th_bean_message_23.setBundle("admuserinreg");
    _jspx_th_bean_message_23.setKey("adm_user_inreg.label.rezultate.ldap");
    int _jspx_eval_bean_message_23 = _jspx_th_bean_message_23.doStartTag();
    if (_jspx_th_bean_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_23);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_23);
    return false;
  }

  private boolean _jspx_meth_html_hidden_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_3 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_3.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_html_hidden_3.setProperty("values.issuer_name");
    _jspx_th_html_hidden_3.setStyleId("issuer_name");
    int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
    if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_24(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_24 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_24.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_bean_message_24.setBundle("admuserinreg");
    _jspx_th_bean_message_24.setKey("adm_user_inreg.prompt.issuer_name");
    int _jspx_eval_bean_message_24 = _jspx_th_bean_message_24.doStartTag();
    if (_jspx_th_bean_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_24);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_24);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_html_text_3.setErrorStyleClass("errorfield");
    _jspx_th_html_text_3.setStyleClass("field_input");
    _jspx_th_html_text_3.setProperty("values.issuer_name");
    _jspx_th_html_text_3.setStyleId("issuer_name_t");
    _jspx_th_html_text_3.setDisabled(true);
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_3);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_html_hidden_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_4 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_4.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_html_hidden_4.setProperty("values.serial_number");
    _jspx_th_html_hidden_4.setStyleId("serial_number");
    int _jspx_eval_html_hidden_4 = _jspx_th_html_hidden_4.doStartTag();
    if (_jspx_th_html_hidden_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_4);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_25(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_25 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_25.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_bean_message_25.setBundle("admuserinreg");
    _jspx_th_bean_message_25.setKey("adm_user_inreg.prompt.serial_number");
    int _jspx_eval_bean_message_25 = _jspx_th_bean_message_25.doStartTag();
    if (_jspx_th_bean_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_25);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_25);
    return false;
  }

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(_jspx_page_context);
    _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_html_text_4.setErrorStyleClass("errorfield");
    _jspx_th_html_text_4.setStyleClass("field_input");
    _jspx_th_html_text_4.setProperty("values.serial_number");
    _jspx_th_html_text_4.setStyleId("serial_number_t");
    _jspx_th_html_text_4.setDisabled(true);
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_4);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_26(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_26 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_26.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_3);
    _jspx_th_bean_message_26.setBundle("admuser");
    _jspx_th_bean_message_26.setKey("adm_user.label.active_user");
    int _jspx_eval_bean_message_26 = _jspx_th_bean_message_26.doStartTag();
    if (_jspx_th_bean_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_26);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_26);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_0 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_3);
    _jspx_th_html_checkbox_0.setProperty("active");
    int _jspx_eval_html_checkbox_0 = _jspx_th_html_checkbox_0.doStartTag();
    if (_jspx_th_html_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_checkbox_property_nobody.reuse(_jspx_th_html_checkbox_0);
      return true;
    }
    _jspx_tagPool_html_checkbox_property_nobody.reuse(_jspx_th_html_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_27(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_27 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_27.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_3);
    _jspx_th_bean_message_27.setBundle("admuser");
    _jspx_th_bean_message_27.setKey("adm_user.label.tooltip.active_user");
    int _jspx_eval_bean_message_27 = _jspx_th_bean_message_27.doStartTag();
    if (_jspx_th_bean_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_27);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_27);
    return false;
  }

  private boolean _jspx_meth_bean_message_28(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_28 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_28.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_3);
    _jspx_th_bean_message_28.setBundle("admuserext");
    _jspx_th_bean_message_28.setKey("adm_user_ext.prompt.mod_autentificare");
    int _jspx_eval_bean_message_28 = _jspx_th_bean_message_28.doStartTag();
    if (_jspx_th_bean_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_28);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_28);
    return false;
  }

  private boolean _jspx_meth_bean_message_29(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_29 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_29.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_2);
    _jspx_th_bean_message_29.setBundle("admuserinreg");
    _jspx_th_bean_message_29.setKey("adm_user_inreg.prompt.cd");
    int _jspx_eval_bean_message_29 = _jspx_th_bean_message_29.doStartTag();
    if (_jspx_th_bean_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_29);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_29);
    return false;
  }

  private boolean _jspx_meth_bean_message_30(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_30 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_30.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_4);
    _jspx_th_bean_message_30.setBundle("admuserinreg");
    _jspx_th_bean_message_30.setKey("adm_user_inreg.prompt.up");
    int _jspx_eval_bean_message_30 = _jspx_th_bean_message_30.doStartTag();
    if (_jspx_th_bean_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_30);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_30);
    return false;
  }

  private boolean _jspx_meth_html_hidden_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_5 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_5.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_html_hidden_5.setProperty("values.issuer_name");
    _jspx_th_html_hidden_5.setStyleId("issuer_name");
    int _jspx_eval_html_hidden_5 = _jspx_th_html_hidden_5.doStartTag();
    if (_jspx_th_html_hidden_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_5);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_5);
    return false;
  }

  private boolean _jspx_meth_bean_message_31(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_31 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_31.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_bean_message_31.setBundle("admuserinreg");
    _jspx_th_bean_message_31.setKey("adm_user_inreg.prompt.issuer_name");
    int _jspx_eval_bean_message_31 = _jspx_th_bean_message_31.doStartTag();
    if (_jspx_th_bean_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_31);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_31);
    return false;
  }

  private boolean _jspx_meth_html_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_5 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_5.setPageContext(_jspx_page_context);
    _jspx_th_html_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_html_text_5.setErrorStyleClass("errorfield");
    _jspx_th_html_text_5.setStyleClass("field_input");
    _jspx_th_html_text_5.setProperty("values.issuer_name");
    _jspx_th_html_text_5.setStyleId("issuer_name_t");
    _jspx_th_html_text_5.setDisabled(true);
    int _jspx_eval_html_text_5 = _jspx_th_html_text_5.doStartTag();
    if (_jspx_th_html_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_5);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_5);
    return false;
  }

  private boolean _jspx_meth_html_hidden_6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_6 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_6.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_html_hidden_6.setProperty("values.serial_number");
    _jspx_th_html_hidden_6.setStyleId("serial_number");
    int _jspx_eval_html_hidden_6 = _jspx_th_html_hidden_6.doStartTag();
    if (_jspx_th_html_hidden_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_6);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_6);
    return false;
  }

  private boolean _jspx_meth_bean_message_32(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_32 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_32.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_bean_message_32.setBundle("admuserinreg");
    _jspx_th_bean_message_32.setKey("adm_user_inreg.prompt.serial_number");
    int _jspx_eval_bean_message_32 = _jspx_th_bean_message_32.doStartTag();
    if (_jspx_th_bean_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_32);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_32);
    return false;
  }

  private boolean _jspx_meth_html_text_6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_6 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_6.setPageContext(_jspx_page_context);
    _jspx_th_html_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_html_text_6.setErrorStyleClass("errorfield");
    _jspx_th_html_text_6.setStyleClass("field_input");
    _jspx_th_html_text_6.setProperty("values.serial_number");
    _jspx_th_html_text_6.setStyleId("serial_number_t");
    _jspx_th_html_text_6.setDisabled(true);
    int _jspx_eval_html_text_6 = _jspx_th_html_text_6.doStartTag();
    if (_jspx_th_html_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_6);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_6);
    return false;
  }

  private boolean _jspx_meth_bean_message_33(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_33 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_33.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_bean_message_33.setBundle("admuser");
    _jspx_th_bean_message_33.setKey("adm_user.prompt.numeldap");
    int _jspx_eval_bean_message_33 = _jspx_th_bean_message_33.doStartTag();
    if (_jspx_th_bean_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_33);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_33);
    return false;
  }

  private boolean _jspx_meth_html_text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_7 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_7.setPageContext(_jspx_page_context);
    _jspx_th_html_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_html_text_7.setErrorStyleClass("errorfield");
    _jspx_th_html_text_7.setStyleClass("field_input");
    _jspx_th_html_text_7.setProperty("numeSearchLdap");
    int _jspx_eval_html_text_7 = _jspx_th_html_text_7.doStartTag();
    if (_jspx_th_html_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_7);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_7);
    return false;
  }

  private boolean _jspx_meth_bean_message_34(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_34 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_34.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_bean_message_34.setBundle("admuser");
    _jspx_th_bean_message_34.setKey("adm_user.label.tooltip.numeldap");
    int _jspx_eval_bean_message_34 = _jspx_th_bean_message_34.doStartTag();
    if (_jspx_th_bean_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_34);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_34);
    return false;
  }

  private boolean _jspx_meth_bean_message_35(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_35 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_35.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_bean_message_35.setBundle("admuserinreg");
    _jspx_th_bean_message_35.setKey("adm_user_inreg.button.cauta_ldap");
    int _jspx_eval_bean_message_35 = _jspx_th_bean_message_35.doStartTag();
    if (_jspx_th_bean_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_35);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_35);
    return false;
  }

  private boolean _jspx_meth_html_hidden_7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_7 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_7.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_html_hidden_7.setProperty("amRezultateCautareLdap");
    int _jspx_eval_html_hidden_7 = _jspx_th_html_hidden_7.doStartTag();
    if (_jspx_th_html_hidden_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_7);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_7);
    return false;
  }

  private boolean _jspx_meth_bean_message_36(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_36 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_36.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_4);
    _jspx_th_bean_message_36.setBundle("admuserinreg");
    _jspx_th_bean_message_36.setKey("adm_user_inreg.label.nu_rezulate.ldap");
    int _jspx_eval_bean_message_36 = _jspx_th_bean_message_36.doStartTag();
    if (_jspx_th_bean_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_36);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_36);
    return false;
  }

  private boolean _jspx_meth_bean_message_37(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_37 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_37.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_5);
    _jspx_th_bean_message_37.setBundle("admuserinreg");
    _jspx_th_bean_message_37.setKey("adm_user_inreg.label.rezultate.ldap");
    int _jspx_eval_bean_message_37 = _jspx_th_bean_message_37.doStartTag();
    if (_jspx_th_bean_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_37);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_37);
    return false;
  }

  private boolean _jspx_meth_bean_message_38(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_38 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_38.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_5);
    _jspx_th_bean_message_38.setBundle("admuserinreg");
    _jspx_th_bean_message_38.setKey("adm_user_inreg.label.rezultate.ldap");
    int _jspx_eval_bean_message_38 = _jspx_th_bean_message_38.doStartTag();
    if (_jspx_th_bean_message_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_38);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_38);
    return false;
  }

  private boolean _jspx_meth_bean_message_39(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_39 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_39.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_bean_message_39.setBundle("admuserinreg");
    _jspx_th_bean_message_39.setKey("adm_user_inreg.prompt.change_aut");
    int _jspx_eval_bean_message_39 = _jspx_th_bean_message_39.doStartTag();
    if (_jspx_th_bean_message_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_39);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_39);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_1 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_3);
    _jspx_th_html_checkbox_1.setProperty("chaut");
    _jspx_th_html_checkbox_1.setStyleId("chaut");
    _jspx_th_html_checkbox_1.setOnclick(" chcdm();");
    int _jspx_eval_html_checkbox_1 = _jspx_th_html_checkbox_1.doStartTag();
    if (_jspx_th_html_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody.reuse(_jspx_th_html_checkbox_1);
      return true;
    }
    _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody.reuse(_jspx_th_html_checkbox_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_40(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_40 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_40.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_6);
    _jspx_th_bean_message_40.setBundle("admuserinreg");
    _jspx_th_bean_message_40.setKey("adm_user_inreg.prompt.user_password");
    int _jspx_eval_bean_message_40 = _jspx_th_bean_message_40.doStartTag();
    if (_jspx_th_bean_message_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_40);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_40);
    return false;
  }

  private boolean _jspx_meth_html_password_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_2 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_2.setPageContext(_jspx_page_context);
    _jspx_th_html_password_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_6);
    _jspx_th_html_password_2.setErrorStyleClass("errorfield");
    _jspx_th_html_password_2.setStyleClass("field_input");
    _jspx_th_html_password_2.setProperty("user_password_n");
    int _jspx_eval_html_password_2 = _jspx_th_html_password_2.doStartTag();
    if (_jspx_th_html_password_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_2);
      return true;
    }
    _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_41(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_41 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_41.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_6);
    _jspx_th_bean_message_41.setBundle("admuserinreg");
    _jspx_th_bean_message_41.setKey("adm_user_inreg.label.tooltip.user_password");
    int _jspx_eval_bean_message_41 = _jspx_th_bean_message_41.doStartTag();
    if (_jspx_th_bean_message_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_41);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_41);
    return false;
  }

  private boolean _jspx_meth_bean_message_42(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_42 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_42.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_6);
    _jspx_th_bean_message_42.setBundle("admuserinreg");
    _jspx_th_bean_message_42.setKey("adm_user_inreg.prompt.c_user_password");
    int _jspx_eval_bean_message_42 = _jspx_th_bean_message_42.doStartTag();
    if (_jspx_th_bean_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_42);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_42);
    return false;
  }

  private boolean _jspx_meth_html_password_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_3 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_3.setPageContext(_jspx_page_context);
    _jspx_th_html_password_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_6);
    _jspx_th_html_password_3.setErrorStyleClass("errorfield");
    _jspx_th_html_password_3.setStyleClass("field_input");
    _jspx_th_html_password_3.setProperty("c_user_password");
    int _jspx_eval_html_password_3 = _jspx_th_html_password_3.doStartTag();
    if (_jspx_th_html_password_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_3);
      return true;
    }
    _jspx_tagPool_html_password_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_43(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_43 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_43.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_6);
    _jspx_th_bean_message_43.setBundle("admuserinreg");
    _jspx_th_bean_message_43.setKey("adm_user_inreg.label.tooltip.c_user_password");
    int _jspx_eval_bean_message_43 = _jspx_th_bean_message_43.doStartTag();
    if (_jspx_th_bean_message_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_43);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_43);
    return false;
  }

  private boolean _jspx_meth_html_hidden_8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_8 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_8.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_6);
    _jspx_th_html_hidden_8.setProperty("values.user_passwd");
    int _jspx_eval_html_hidden_8 = _jspx_th_html_hidden_8.doStartTag();
    if (_jspx_th_html_hidden_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_8);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_8);
    return false;
  }

  private boolean _jspx_meth_bean_message_44(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_44 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_44.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_6);
    _jspx_th_bean_message_44.setBundle("admuser");
    _jspx_th_bean_message_44.setKey("adm_user.prompt.nochange");
    int _jspx_eval_bean_message_44 = _jspx_th_bean_message_44.doStartTag();
    if (_jspx_th_bean_message_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_44);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_44);
    return false;
  }

  private boolean _jspx_meth_html_radio_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_2 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_property_onclick_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_2.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_6);
    _jspx_th_html_radio_2.setProperty("ch");
    _jspx_th_html_radio_2.setValue("2");
    _jspx_th_html_radio_2.setOnclick(" chcdm();");
    int _jspx_eval_html_radio_2 = _jspx_th_html_radio_2.doStartTag();
    if (_jspx_th_html_radio_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_property_onclick_nobody.reuse(_jspx_th_html_radio_2);
      return true;
    }
    _jspx_tagPool_html_radio_value_property_onclick_nobody.reuse(_jspx_th_html_radio_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_45(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_45 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_45.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_6);
    _jspx_th_bean_message_45.setBundle("admuserinreg");
    _jspx_th_bean_message_45.setKey("adm_user_inreg.prompt.change_password");
    int _jspx_eval_bean_message_45 = _jspx_th_bean_message_45.doStartTag();
    if (_jspx_th_bean_message_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_45);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_45);
    return false;
  }

  private boolean _jspx_meth_html_radio_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_3 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_property_onclick_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_3.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_6);
    _jspx_th_html_radio_3.setProperty("ch");
    _jspx_th_html_radio_3.setValue("0");
    _jspx_th_html_radio_3.setOnclick(" chcdm();");
    int _jspx_eval_html_radio_3 = _jspx_th_html_radio_3.doStartTag();
    if (_jspx_th_html_radio_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_property_onclick_nobody.reuse(_jspx_th_html_radio_3);
      return true;
    }
    _jspx_tagPool_html_radio_value_property_onclick_nobody.reuse(_jspx_th_html_radio_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_46(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_46 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_46.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_7);
    _jspx_th_bean_message_46.setBundle("admuserinreg");
    _jspx_th_bean_message_46.setKey("adm_user_inreg.prompt.user_password");
    int _jspx_eval_bean_message_46 = _jspx_th_bean_message_46.doStartTag();
    if (_jspx_th_bean_message_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_46);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_46);
    return false;
  }

  private boolean _jspx_meth_bean_message_47(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_47 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_47.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_7);
    _jspx_th_bean_message_47.setBundle("admuserinreg");
    _jspx_th_bean_message_47.setKey("adm_user_inreg.prompt.user_password");
    int _jspx_eval_bean_message_47 = _jspx_th_bean_message_47.doStartTag();
    if (_jspx_th_bean_message_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_47);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_47);
    return false;
  }

  private boolean _jspx_meth_html_password_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_4 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_4.setPageContext(_jspx_page_context);
    _jspx_th_html_password_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_7);
    _jspx_th_html_password_4.setErrorStyleClass("errorfield");
    _jspx_th_html_password_4.setStyleClass("field_input");
    _jspx_th_html_password_4.setProperty("user_password_n");
    _jspx_th_html_password_4.setStyleId("newpass");
    int _jspx_eval_html_password_4 = _jspx_th_html_password_4.doStartTag();
    if (_jspx_th_html_password_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_4);
      return true;
    }
    _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_48(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_48 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_48.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_7);
    _jspx_th_bean_message_48.setBundle("admuserinreg");
    _jspx_th_bean_message_48.setKey("adm_user_inreg.label.tooltip.user_password");
    int _jspx_eval_bean_message_48 = _jspx_th_bean_message_48.doStartTag();
    if (_jspx_th_bean_message_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_48);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_48);
    return false;
  }

  private boolean _jspx_meth_bean_message_49(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_49 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_49.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_7);
    _jspx_th_bean_message_49.setBundle("admuserinreg");
    _jspx_th_bean_message_49.setKey("adm_user_inreg.prompt.c_user_password");
    int _jspx_eval_bean_message_49 = _jspx_th_bean_message_49.doStartTag();
    if (_jspx_th_bean_message_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_49);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_49);
    return false;
  }

  private boolean _jspx_meth_html_password_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_5 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_5.setPageContext(_jspx_page_context);
    _jspx_th_html_password_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_7);
    _jspx_th_html_password_5.setErrorStyleClass("errorfield");
    _jspx_th_html_password_5.setStyleClass("field_input");
    _jspx_th_html_password_5.setProperty("c_user_password");
    _jspx_th_html_password_5.setStyleId("cnewpass");
    int _jspx_eval_html_password_5 = _jspx_th_html_password_5.doStartTag();
    if (_jspx_th_html_password_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_5);
      return true;
    }
    _jspx_tagPool_html_password_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_5);
    return false;
  }

  private boolean _jspx_meth_bean_message_50(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_50 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_50.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_7);
    _jspx_th_bean_message_50.setBundle("admuserinreg");
    _jspx_th_bean_message_50.setKey("adm_user_inreg.label.tooltip.c_user_password");
    int _jspx_eval_bean_message_50 = _jspx_th_bean_message_50.doStartTag();
    if (_jspx_th_bean_message_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_50);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_50);
    return false;
  }

  private boolean _jspx_meth_bean_message_51(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_51 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_51.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_6);
    _jspx_th_bean_message_51.setBundle("admuserinreg");
    _jspx_th_bean_message_51.setKey("adm_user_inreg.prompt.change_aut");
    int _jspx_eval_bean_message_51 = _jspx_th_bean_message_51.doStartTag();
    if (_jspx_th_bean_message_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_51);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_51);
    return false;
  }

  private boolean _jspx_meth_html_radio_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_4 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_property_onclick_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_4.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_6);
    _jspx_th_html_radio_4.setProperty("ch");
    _jspx_th_html_radio_4.setValue("1");
    _jspx_th_html_radio_4.setOnclick(" chcdm();");
    int _jspx_eval_html_radio_4 = _jspx_th_html_radio_4.doStartTag();
    if (_jspx_th_html_radio_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_property_onclick_nobody.reuse(_jspx_th_html_radio_4);
      return true;
    }
    _jspx_tagPool_html_radio_value_property_onclick_nobody.reuse(_jspx_th_html_radio_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_52(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_52 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_52.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
    _jspx_th_bean_message_52.setBundle("admuser");
    _jspx_th_bean_message_52.setKey("adm_user.prompt.numeldap");
    int _jspx_eval_bean_message_52 = _jspx_th_bean_message_52.doStartTag();
    if (_jspx_th_bean_message_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_52);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_52);
    return false;
  }

  private boolean _jspx_meth_html_text_8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_8 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_8.setPageContext(_jspx_page_context);
    _jspx_th_html_text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
    _jspx_th_html_text_8.setErrorStyleClass("errorfield");
    _jspx_th_html_text_8.setStyleClass("field_input");
    _jspx_th_html_text_8.setProperty("numeSearchLdap");
    int _jspx_eval_html_text_8 = _jspx_th_html_text_8.doStartTag();
    if (_jspx_th_html_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_8);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_8);
    return false;
  }

  private boolean _jspx_meth_bean_message_53(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_53 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_53.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
    _jspx_th_bean_message_53.setBundle("admuser");
    _jspx_th_bean_message_53.setKey("adm_user.label.tooltip.numeldap");
    int _jspx_eval_bean_message_53 = _jspx_th_bean_message_53.doStartTag();
    if (_jspx_th_bean_message_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_53);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_53);
    return false;
  }

  private boolean _jspx_meth_bean_message_54(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_54 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_54.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
    _jspx_th_bean_message_54.setBundle("admuserinreg");
    _jspx_th_bean_message_54.setKey("adm_user_inreg.button.cauta_ldap");
    int _jspx_eval_bean_message_54 = _jspx_th_bean_message_54.doStartTag();
    if (_jspx_th_bean_message_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_54);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_54);
    return false;
  }

  private boolean _jspx_meth_html_hidden_9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_9 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_9.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
    _jspx_th_html_hidden_9.setProperty("amRezultateCautareLdap");
    int _jspx_eval_html_hidden_9 = _jspx_th_html_hidden_9.doStartTag();
    if (_jspx_th_html_hidden_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_9);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_9);
    return false;
  }

  private boolean _jspx_meth_bean_message_55(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_55 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_55.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_9);
    _jspx_th_bean_message_55.setBundle("admuserinreg");
    _jspx_th_bean_message_55.setKey("adm_user_inreg.label.nu_rezulate.ldap");
    int _jspx_eval_bean_message_55 = _jspx_th_bean_message_55.doStartTag();
    if (_jspx_th_bean_message_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_55);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_55);
    return false;
  }

  private boolean _jspx_meth_bean_message_56(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_56 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_56.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_7);
    _jspx_th_bean_message_56.setBundle("admuserinreg");
    _jspx_th_bean_message_56.setKey("adm_user_inreg.label.rezultate.ldap");
    int _jspx_eval_bean_message_56 = _jspx_th_bean_message_56.doStartTag();
    if (_jspx_th_bean_message_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_56);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_56);
    return false;
  }

  private boolean _jspx_meth_bean_message_57(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_57 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_57.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_7);
    _jspx_th_bean_message_57.setBundle("admuserinreg");
    _jspx_th_bean_message_57.setKey("adm_user_inreg.label.rezultate.ldap");
    int _jspx_eval_bean_message_57 = _jspx_th_bean_message_57.doStartTag();
    if (_jspx_th_bean_message_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_57);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_57);
    return false;
  }

  private boolean _jspx_meth_html_hidden_10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_10 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_10.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
    _jspx_th_html_hidden_10.setProperty("values.issuer_name");
    _jspx_th_html_hidden_10.setStyleId("issuer_name");
    int _jspx_eval_html_hidden_10 = _jspx_th_html_hidden_10.doStartTag();
    if (_jspx_th_html_hidden_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_10);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_10);
    return false;
  }

  private boolean _jspx_meth_bean_message_58(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_58 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_58.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
    _jspx_th_bean_message_58.setBundle("admuserinreg");
    _jspx_th_bean_message_58.setKey("adm_user_inreg.prompt.issuer_name");
    int _jspx_eval_bean_message_58 = _jspx_th_bean_message_58.doStartTag();
    if (_jspx_th_bean_message_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_58);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_58);
    return false;
  }

  private boolean _jspx_meth_html_text_9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_9 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_9.setPageContext(_jspx_page_context);
    _jspx_th_html_text_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
    _jspx_th_html_text_9.setErrorStyleClass("errorfield");
    _jspx_th_html_text_9.setStyleClass("field_input");
    _jspx_th_html_text_9.setProperty("values.issuer_name");
    _jspx_th_html_text_9.setStyleId("issuer_name_t");
    _jspx_th_html_text_9.setDisabled(true);
    int _jspx_eval_html_text_9 = _jspx_th_html_text_9.doStartTag();
    if (_jspx_th_html_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_9);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_9);
    return false;
  }

  private boolean _jspx_meth_html_hidden_11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_11 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_11.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
    _jspx_th_html_hidden_11.setProperty("values.serial_number");
    _jspx_th_html_hidden_11.setStyleId("serial_number");
    int _jspx_eval_html_hidden_11 = _jspx_th_html_hidden_11.doStartTag();
    if (_jspx_th_html_hidden_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_11);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_11);
    return false;
  }

  private boolean _jspx_meth_bean_message_59(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_59 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_59.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
    _jspx_th_bean_message_59.setBundle("admuserinreg");
    _jspx_th_bean_message_59.setKey("adm_user_inreg.prompt.serial_number");
    int _jspx_eval_bean_message_59 = _jspx_th_bean_message_59.doStartTag();
    if (_jspx_th_bean_message_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_59);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_59);
    return false;
  }

  private boolean _jspx_meth_html_text_10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_10 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_10.setPageContext(_jspx_page_context);
    _jspx_th_html_text_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_8);
    _jspx_th_html_text_10.setErrorStyleClass("errorfield");
    _jspx_th_html_text_10.setStyleClass("field_input");
    _jspx_th_html_text_10.setProperty("values.serial_number");
    _jspx_th_html_text_10.setStyleId("serial_number_t");
    _jspx_th_html_text_10.setDisabled(true);
    int _jspx_eval_html_text_10 = _jspx_th_html_text_10.doStartTag();
    if (_jspx_th_html_text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_10);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_10);
    return false;
  }

  private boolean _jspx_meth_html_hidden_12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_12 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_12.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_12.setProperty("method");
    _jspx_th_html_hidden_12.setStyleId("m");
    int _jspx_eval_html_hidden_12 = _jspx_th_html_hidden_12.doStartTag();
    if (_jspx_th_html_hidden_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_12);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_12);
    return false;
  }

  private boolean _jspx_meth_bean_message_60(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_60 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_60.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_4);
    _jspx_th_bean_message_60.setBundle("admuser");
    _jspx_th_bean_message_60.setKey("adm_user.button.add");
    int _jspx_eval_bean_message_60 = _jspx_th_bean_message_60.doStartTag();
    if (_jspx_th_bean_message_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_60);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_60);
    return false;
  }

  private boolean _jspx_meth_bean_message_61(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_61 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_61.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_8);
    _jspx_th_bean_message_61.setBundle("admuser");
    _jspx_th_bean_message_61.setKey("adm_user.button.save");
    int _jspx_eval_bean_message_61 = _jspx_th_bean_message_61.doStartTag();
    if (_jspx_th_bean_message_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_61);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_61);
    return false;
  }

  private boolean _jspx_meth_html_javascript_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:javascript
    org.apache.struts.taglib.html.JavascriptValidatorTag _jspx_th_html_javascript_0 = (org.apache.struts.taglib.html.JavascriptValidatorTag) _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody.get(org.apache.struts.taglib.html.JavascriptValidatorTag.class);
    _jspx_th_html_javascript_0.setPageContext(_jspx_page_context);
    _jspx_th_html_javascript_0.setParent(null);
    _jspx_th_html_javascript_0.setFormName("form_AdmUserForm");
    _jspx_th_html_javascript_0.setDynamicJavascript("true");
    _jspx_th_html_javascript_0.setStaticJavascript("false");
    int _jspx_eval_html_javascript_0 = _jspx_th_html_javascript_0.doStartTag();
    if (_jspx_th_html_javascript_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody.reuse(_jspx_th_html_javascript_0);
      return true;
    }
    _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody.reuse(_jspx_th_html_javascript_0);
    return false;
  }
}
