package org.apache.jsp.web.sys.admuser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import ro.uti.settings.util.Constants;
import ro.uti.apmc.sys.util.AdmUserInregConstants;

public final class edituser_005fadmuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_messages_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_onsubmit_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_property_maxlength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_value_styleClass_property_errorStyleClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_value_styleId_styleClass_property_errorStyleClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_scope_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_scope_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_styleId_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_messages_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_onsubmit_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_property_maxlength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_value_styleClass_property_errorStyleClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_value_styleId_styleClass_property_errorStyleClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_present_scope_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_scope_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_logic_messagesPresent.release();
    _jspx_tagPool_html_messages_id.release();
    _jspx_tagPool_bean_write_name_nobody.release();
    _jspx_tagPool_html_form_onsubmit_action.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_html_password_value_styleClass_property_errorStyleClass_nobody.release();
    _jspx_tagPool_html_password_value_styleId_styleClass_property_errorStyleClass_nobody.release();
    _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.release();
    _jspx_tagPool_logic_present_scope_name.release();
    _jspx_tagPool_logic_notEmpty_scope_name.release();
    _jspx_tagPool_html_hidden_styleId_property_nobody.release();
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.release();
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
      out.write("<form name=\"closeForm\"  method=\"post\" action=\"sys/admuser.do\">\r\n");
      out.write(" ");
      if (_jspx_meth_html_hidden_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write(" function closeWindow() {\r\n");
      out.write("   document.closeForm.submit();\r\n");
      out.write(" }\r\n");
      out.write(" //la check boxuri\r\n");
      out.write("function initChb(id_boo,id) {\r\n");
      out.write(" var chb = document.getElementById(id_boo);\r\n");
      out.write(" var field = document.getElementById(id);\r\n");
      out.write(" if (chb.checked) {\r\n");
      out.write("   field.value=\"1\";\r\n");
      out.write(" }else {\r\n");
      out.write("   field.value=\"0\";\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("function chAutP() {\r\n");
      out.write("  var el  = document.getElementById('changeAut_boo');\r\n");
      out.write("  if (el.checked) {\r\n");
      out.write("    document.getElementById(\"div_tr_pw_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_pw_2\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_2\").style.display=\"inline\";\r\n");
      out.write("  }else {\r\n");
      out.write("    document.getElementById(\"div_tr_pw_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_pw_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_2\").style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"table\">\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"100%\" valign=\"top\" align=\"left\" class=\"page-subtitle\">\r\n");
      out.write("        &nbsp;\r\n");
      out.write("        <!-- Titlul ferestrei pentru modificare. -->\r\n");
      out.write("          ");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <!-- END Sectiune de Titlu pagina. -->\r\n");
      out.write("      </td>\r\n");
      out.write("      <td class=\"bottom\" align=\"right\">\r\n");
      out.write("        <img border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:closeWindow();\" title='");
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write("' src=\"images/close_off.gif\" />\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write(" </table>\r\n");
      out.write("   <table  width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("           ");
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_messagesPresent_0.setParent(null);
      int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
      if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("             <tr>\r\n");
          out.write("               <td valign=\"top\" colspan=\"2\" class=\"msg_error \" align=\"center\">\r\n");
          out.write("                 <ul>\r\n");
          out.write("                   ");
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
              out.write("                     <li>\r\n");
              out.write("                       ");
              if (_jspx_meth_bean_write_0(_jspx_th_html_messages_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                     </li>\r\n");
              out.write("                   ");
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
          out.write("                 </ul>\r\n");
          out.write("               </td>\r\n");
          out.write("             </tr>\r\n");
          out.write("           ");
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
      out.write("  </table>\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("    <!-- START Sectiune de FORM. -->\r\n");
      out.write("    ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_onsubmit_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/admuser.do");
      _jspx_th_html_form_0.setOnsubmit("return validateForm_AdmUserForm(this);");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <!--Campul id_user-->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <!-- Cimpul 'fk_limba' field. -->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <!--campul account_deletion_date-->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <!--Campul account_status-->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <!--campul issuer_name-->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <!--campul logged-->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_6(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <!--campul serial_number-->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_7(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <!--campul user_login-->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_8(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <!--campul user_type-->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_9(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <!--campul cd-->\r\n");
          out.write("\t  ");
          if (_jspx_meth_html_hidden_10(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t <!--DATE UTILIZATOR-->\r\n");
          out.write("   <tr class=\"even\" >\r\n");
          out.write("       <td class=\"label\" colspan=\"2\">\r\n");
          out.write("         <b>");
          if (_jspx_meth_bean_message_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</b>\r\n");
          out.write("       </td>\r\n");
          out.write("  </tr>\r\n");
          out.write("<!-- Cimpul 'email' field. -->\r\n");
          out.write(" <tr>\r\n");
          out.write("  <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("   ");
          if (_jspx_meth_bean_message_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" *:\r\n");
          out.write("  </td>\r\n");
          out.write("  <td class=\"text\" align=\"left\">\r\n");
          out.write("   ");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("   <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("  </td>\r\n");
          out.write(" </tr>\r\n");
          out.write("\r\n");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEmpty_0.setProperty("cd");
          _jspx_th_logic_notEmpty_0.setName(Constants.ADM_USER_KEY);
          int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
          if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
              _jspx_th_logic_equal_0.setValue("0");
              _jspx_th_logic_equal_0.setProperty("cd");
              _jspx_th_logic_equal_0.setName(Constants.ADM_USER_KEY);
              int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
              if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t<!-- Cimpul 'user_password_o' field. -->\r\n");
                  out.write("\t<tr>\r\n");
                  out.write("\t  <td valign=\"top\" class=\"label\" align=\"right\">");
                  if (_jspx_meth_bean_message_5(_jspx_th_logic_equal_0, _jspx_page_context))
                    return;
                  out.write("<font color=\"#336600\">*</font> :\r\n");
                  out.write("\t  </td>\r\n");
                  out.write("\t  <td class=\"text\" align=\"left\">\r\n");
                  out.write("\t\t");
                  if (_jspx_meth_html_password_0(_jspx_th_logic_equal_0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t<img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                  if (_jspx_meth_bean_message_6(_jspx_th_logic_equal_0, _jspx_page_context))
                    return;
                  out.write("\"/>\r\n");
                  out.write("\t  </td>\r\n");
                  out.write("\t</tr>\r\n");
                  out.write("\t<!-- Cimpul 'user_passwd' field. -->\r\n");
                  out.write("    <tr>\r\n");
                  out.write("      <td valign=\"top\" class=\"label\" align=\"right\">");
                  if (_jspx_meth_bean_message_7(_jspx_th_logic_equal_0, _jspx_page_context))
                    return;
                  out.write("<font color=\"#336600\">*</font> :\r\n");
                  out.write("      </td>\r\n");
                  out.write("      <td class=\"text\" align=\"left\">\r\n");
                  out.write("        ");
                  if (_jspx_meth_html_password_1(_jspx_th_logic_equal_0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("        <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                  if (_jspx_meth_bean_message_8(_jspx_th_logic_equal_0, _jspx_page_context))
                    return;
                  out.write("\"/>\r\n");
                  out.write("      </td>\r\n");
                  out.write("    </tr>\r\n");
                  out.write("<!-- Cimpul 'c_user_password' confirmare field. -->\r\n");
                  out.write("  <tr>\r\n");
                  out.write("   <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
                  out.write("\t   ");
                  if (_jspx_meth_bean_message_9(_jspx_th_logic_equal_0, _jspx_page_context))
                    return;
                  out.write("<font color=\"#336600\">*</font> :\r\n");
                  out.write("   </td>\r\n");
                  out.write("   <td class=\"text\" align=\"left\">\r\n");
                  out.write("    ");
                  if (_jspx_meth_html_password_2(_jspx_th_logic_equal_0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("    <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                  if (_jspx_meth_bean_message_10(_jspx_th_logic_equal_0, _jspx_page_context))
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
              _jspx_th_logic_equal_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
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
                  if (_jspx_meth_bean_message_11(_jspx_th_logic_equal_1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("  <font color=\"#336600\">*</font> :\r\n");
                  out.write("  </td>\r\n");
                  out.write("  <td class=\"text\" align=\"left\"  width=\"60%\">\r\n");
                  out.write("    ");
                  if (_jspx_meth_html_text_1(_jspx_th_logic_equal_1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("    <img src=\"images/quest.gif\" width=\"15\" height=\"15\"  style=\"cursor:pointer;\" title=\"");
                  if (_jspx_meth_bean_message_12(_jspx_th_logic_equal_1, _jspx_page_context))
                    return;
                  out.write("\"/>\r\n");
                  out.write("    <!--Buton cauta in LDAP-->\r\n");
                  out.write("    <input type=\"button\" class=\"btn-generic\" value='");
                  if (_jspx_meth_bean_message_13(_jspx_th_logic_equal_1, _jspx_page_context))
                    return;
                  out.write("'   onclick=' send(\"cautLDAP\");'/>\r\n");
                  out.write("  </td>\r\n");
                  out.write("</tr>\r\n");
                  out.write("\r\n");
                  out.write(" <!--Rezultate cautare in LDAP-->\r\n");
                  out.write("    ");
                  if (_jspx_meth_html_hidden_11(_jspx_th_logic_equal_1, _jspx_page_context))
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
                      if (_jspx_meth_bean_message_14(_jspx_th_logic_equal_2, _jspx_page_context))
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
                          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
                          _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
                          _jspx_th_logic_notEmpty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_0);
                          _jspx_th_logic_notEmpty_1.setName( AdmUserInregConstants.LIST_CAUT_CERTIFICATE_ADMUSERINREG);
                          _jspx_th_logic_notEmpty_1.setScope("session");
                          int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
                          if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n");
                              out.write("        <tr>\r\n");
                              out.write("         <td class=\"msg_error\" colspan=\"2\" align=\"center\">\r\n");
                              out.write("           <font color=\"red\">\r\n");
                              out.write("             ");
                              if (_jspx_meth_bean_message_15(_jspx_th_logic_notEmpty_1, _jspx_page_context))
                              return;
                              out.write(":\r\n");
                              out.write("             <img title='");
                              if (_jspx_meth_bean_message_16(_jspx_th_logic_notEmpty_1, _jspx_page_context))
                              return;
                              out.write("'  src=\"images/view_over.gif\" style=\"cursor:pointer\" onclick=' showMapLDAP();' />\r\n");
                              out.write("           </font>\r\n");
                              out.write("         </td>\r\n");
                              out.write("       </tr>\r\n");
                              out.write("       ");
                              int evalDoAfterBody = _jspx_th_logic_notEmpty_1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_notEmpty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _jspx_tagPool_logic_notEmpty_scope_name.reuse(_jspx_th_logic_notEmpty_1);
                            return;
                          }
                          _jspx_tagPool_logic_notEmpty_scope_name.reuse(_jspx_th_logic_notEmpty_1);
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
                  if (_jspx_meth_html_hidden_12(_jspx_th_logic_equal_1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write(" <tr>\r\n");
                  out.write("   <td align=\"right\" >\r\n");
                  out.write("    ");
                  if (_jspx_meth_bean_message_17(_jspx_th_logic_equal_1, _jspx_page_context))
                    return;
                  out.write(":\r\n");
                  out.write("   </td>\r\n");
                  out.write("   <td align=\"left\">\r\n");
                  out.write("    ");
                  if (_jspx_meth_html_text_2(_jspx_th_logic_equal_1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write(" </td>\r\n");
                  out.write(" </tr>\r\n");
                  out.write("  <!--campul 'serial_number' -->\r\n");
                  out.write("  ");
                  if (_jspx_meth_html_hidden_13(_jspx_th_logic_equal_1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write(" <tr align=\"right\">\r\n");
                  out.write("  <td>\r\n");
                  out.write("    ");
                  if (_jspx_meth_bean_message_18(_jspx_th_logic_equal_1, _jspx_page_context))
                    return;
                  out.write(":\r\n");
                  out.write("  </td>\r\n");
                  out.write("  <td align=\"left\" >\r\n");
                  out.write("    ");
                  if (_jspx_meth_html_text_3(_jspx_th_logic_equal_1, _jspx_page_context))
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
              int evalDoAfterBody = _jspx_th_logic_notEmpty_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_0);
            return;
          }
          _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_0);
          out.write("\r\n");
          out.write("\r\n");
          out.write(" <tr><td colspan=\"2\" class=\"info-text\" align=\"left\">");
          if (_jspx_meth_bean_message_19(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</td></tr>\r\n");
          out.write(" <!-- START Sectiune de BUTOANE. -->\r\n");
          out.write("<!-- buton modificare. -->\r\n");
          out.write("<tr>\r\n");
          out.write("  <td colspan=\"2\" class=\"button-row\" align=\"center\">\r\n");
          out.write("    ");
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_html_hidden_14(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  </td>\r\n");
          out.write("</tr>\r\n");
          out.write("<!-- END Sectiune de BUTOANE. -->\r\n");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_onsubmit_action.reuse(_jspx_th_html_form_0);
        return;
      }
      _jspx_tagPool_html_form_onsubmit_action.reuse(_jspx_th_html_form_0);
      out.write("\r\n");
      out.write("<!-- END Sectiune de FORM. -->\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Validare cimpuri forma. -->\r\n");
      if (_jspx_meth_html_javascript_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script language=\"Javascript1.1\" src=\"staticJavascript.jsp\"></script>\r\n");
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
    _jspx_th_html_hidden_0.setValue("showMessage");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent(null);
    _jspx_th_bean_message_0.setBundle("admuserinreg");
    _jspx_th_bean_message_0.setKey("adm_user_inreg.title.save");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent(null);
    _jspx_th_bean_message_1.setBundle("admuser");
    _jspx_th_bean_message_1.setKey("adm_user.label.closeWindow");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
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

  private boolean _jspx_meth_html_hidden_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_2.setProperty("values.account_creation_dateString");
    int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
    if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_2);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_2);
    return false;
  }

  private boolean _jspx_meth_html_hidden_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_3 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_3.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_3.setProperty("values.account_deletion_dateString");
    int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
    if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_3);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_3);
    return false;
  }

  private boolean _jspx_meth_html_hidden_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_4 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_4.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_4.setProperty("values.account_status");
    int _jspx_eval_html_hidden_4 = _jspx_th_html_hidden_4.doStartTag();
    if (_jspx_th_html_hidden_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_4);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_4);
    return false;
  }

  private boolean _jspx_meth_html_hidden_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_5 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_5.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_5.setProperty("values.issuer_name");
    int _jspx_eval_html_hidden_5 = _jspx_th_html_hidden_5.doStartTag();
    if (_jspx_th_html_hidden_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_5);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_5);
    return false;
  }

  private boolean _jspx_meth_html_hidden_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_6 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_6.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_6.setProperty("values.logged");
    int _jspx_eval_html_hidden_6 = _jspx_th_html_hidden_6.doStartTag();
    if (_jspx_th_html_hidden_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_6);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_6);
    return false;
  }

  private boolean _jspx_meth_html_hidden_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_7 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_7.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_7.setProperty("values.serial_number");
    int _jspx_eval_html_hidden_7 = _jspx_th_html_hidden_7.doStartTag();
    if (_jspx_th_html_hidden_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_7);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_7);
    return false;
  }

  private boolean _jspx_meth_html_hidden_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_8 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_8.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_8.setProperty("values.user_login");
    int _jspx_eval_html_hidden_8 = _jspx_th_html_hidden_8.doStartTag();
    if (_jspx_th_html_hidden_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_8);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_8);
    return false;
  }

  private boolean _jspx_meth_html_hidden_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_9 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_9.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_9.setProperty("values.user_type");
    int _jspx_eval_html_hidden_9 = _jspx_th_html_hidden_9.doStartTag();
    if (_jspx_th_html_hidden_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_9);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_9);
    return false;
  }

  private boolean _jspx_meth_html_hidden_10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_10 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_10.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_10.setProperty("cd");
    int _jspx_eval_html_hidden_10 = _jspx_th_html_hidden_10.doStartTag();
    if (_jspx_th_html_hidden_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_10);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_10);
    return false;
  }

  private boolean _jspx_meth_bean_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_2.setBundle("admuserinreg");
    _jspx_th_bean_message_2.setKey("adm_user_inreg.prompt.date_utilizator");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_3.setBundle("admuserinreg");
    _jspx_th_bean_message_3.setKey("adm_user_inreg.prompt.email_user");
    int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
    if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setStyleClass("field_input");
    _jspx_th_html_text_0.setProperty("values.email");
    _jspx_th_html_text_0.setMaxlength("100");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_text_0);
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
    _jspx_th_bean_message_4.setKey("adm_user_inreg.label.tooltip.email_user");
    int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
    if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_bean_message_5.setBundle("admuser");
    _jspx_th_bean_message_5.setKey("adm_user.prompt.user_password_o");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_value_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(_jspx_page_context);
    _jspx_th_html_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_html_password_0.setErrorStyleClass("errorfield");
    _jspx_th_html_password_0.setStyleClass("field_input");
    _jspx_th_html_password_0.setProperty("user_password_o");
    _jspx_th_html_password_0.setValue("");
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_value_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_0);
      return true;
    }
    _jspx_tagPool_html_password_value_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_bean_message_6.setBundle("admuser");
    _jspx_th_bean_message_6.setKey("adm_user.label.tooltip.user_password_o");
    int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
    if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
    return false;
  }

  private boolean _jspx_meth_bean_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_7 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_bean_message_7.setBundle("admuser");
    _jspx_th_bean_message_7.setKey("adm_user.prompt.user_passwd");
    int _jspx_eval_bean_message_7 = _jspx_th_bean_message_7.doStartTag();
    if (_jspx_th_bean_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
    return false;
  }

  private boolean _jspx_meth_html_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_1 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_value_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_1.setPageContext(_jspx_page_context);
    _jspx_th_html_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_html_password_1.setErrorStyleClass("errorfield");
    _jspx_th_html_password_1.setStyleClass("field_input");
    _jspx_th_html_password_1.setProperty("values.user_passwd");
    _jspx_th_html_password_1.setValue("");
    int _jspx_eval_html_password_1 = _jspx_th_html_password_1.doStartTag();
    if (_jspx_th_html_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_value_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_1);
      return true;
    }
    _jspx_tagPool_html_password_value_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_8 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_bean_message_8.setBundle("admuser");
    _jspx_th_bean_message_8.setKey("adm_user.label.tooltip.user_passwd");
    int _jspx_eval_bean_message_8 = _jspx_th_bean_message_8.doStartTag();
    if (_jspx_th_bean_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
    return false;
  }

  private boolean _jspx_meth_bean_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_9 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_bean_message_9.setBundle("admuserinreg");
    _jspx_th_bean_message_9.setKey("adm_user_inreg.prompt.c_user_password");
    int _jspx_eval_bean_message_9 = _jspx_th_bean_message_9.doStartTag();
    if (_jspx_th_bean_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
    return false;
  }

  private boolean _jspx_meth_html_password_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_2 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_value_styleId_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_2.setPageContext(_jspx_page_context);
    _jspx_th_html_password_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_html_password_2.setErrorStyleClass("errorfield");
    _jspx_th_html_password_2.setStyleClass("field_input");
    _jspx_th_html_password_2.setProperty("c_user_password");
    _jspx_th_html_password_2.setStyleId("cpw");
    _jspx_th_html_password_2.setValue("");
    int _jspx_eval_html_password_2 = _jspx_th_html_password_2.doStartTag();
    if (_jspx_th_html_password_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_value_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_2);
      return true;
    }
    _jspx_tagPool_html_password_value_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_password_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_10 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_10.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_bean_message_10.setBundle("admuserinreg");
    _jspx_th_bean_message_10.setKey("adm_user_inreg.label.tooltip.c_user_password");
    int _jspx_eval_bean_message_10 = _jspx_th_bean_message_10.doStartTag();
    if (_jspx_th_bean_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
    return false;
  }

  private boolean _jspx_meth_bean_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_11 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_11.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_bean_message_11.setBundle("admuser");
    _jspx_th_bean_message_11.setKey("adm_user.prompt.numeldap");
    int _jspx_eval_bean_message_11 = _jspx_th_bean_message_11.doStartTag();
    if (_jspx_th_bean_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_html_text_1.setErrorStyleClass("errorfield");
    _jspx_th_html_text_1.setStyleClass("field_input");
    _jspx_th_html_text_1.setProperty("numeSearchLdap");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_12 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_12.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_bean_message_12.setBundle("admuser");
    _jspx_th_bean_message_12.setKey("adm_user.label.tooltip.numeldap");
    int _jspx_eval_bean_message_12 = _jspx_th_bean_message_12.doStartTag();
    if (_jspx_th_bean_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
    return false;
  }

  private boolean _jspx_meth_bean_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_13 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_13.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_bean_message_13.setBundle("admuserinreg");
    _jspx_th_bean_message_13.setKey("adm_user_inreg.button.cauta_ldap");
    int _jspx_eval_bean_message_13 = _jspx_th_bean_message_13.doStartTag();
    if (_jspx_th_bean_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_13);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_13);
    return false;
  }

  private boolean _jspx_meth_html_hidden_11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_11 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_11.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_html_hidden_11.setProperty("amRezultateCautareLdap");
    int _jspx_eval_html_hidden_11 = _jspx_th_html_hidden_11.doStartTag();
    if (_jspx_th_html_hidden_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_11);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_11);
    return false;
  }

  private boolean _jspx_meth_bean_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_14 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_14.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_2);
    _jspx_th_bean_message_14.setBundle("admuserinreg");
    _jspx_th_bean_message_14.setKey("adm_user_inreg.label.nu_rezulate.ldap");
    int _jspx_eval_bean_message_14 = _jspx_th_bean_message_14.doStartTag();
    if (_jspx_th_bean_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_14);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_14);
    return false;
  }

  private boolean _jspx_meth_bean_message_15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_15 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_15.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
    _jspx_th_bean_message_15.setBundle("admuserinreg");
    _jspx_th_bean_message_15.setKey("adm_user_inreg.label.rezultate.ldap");
    int _jspx_eval_bean_message_15 = _jspx_th_bean_message_15.doStartTag();
    if (_jspx_th_bean_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_15);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_15);
    return false;
  }

  private boolean _jspx_meth_bean_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_16 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_16.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
    _jspx_th_bean_message_16.setBundle("admuserinreg");
    _jspx_th_bean_message_16.setKey("adm_user_inreg.label.rezultate.ldap");
    int _jspx_eval_bean_message_16 = _jspx_th_bean_message_16.doStartTag();
    if (_jspx_th_bean_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_16);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_16);
    return false;
  }

  private boolean _jspx_meth_html_hidden_12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_12 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_12.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_html_hidden_12.setProperty("values.issuer_name");
    _jspx_th_html_hidden_12.setStyleId("issuer_name");
    int _jspx_eval_html_hidden_12 = _jspx_th_html_hidden_12.doStartTag();
    if (_jspx_th_html_hidden_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_12);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_12);
    return false;
  }

  private boolean _jspx_meth_bean_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_17 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_17.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_bean_message_17.setBundle("admuserinreg");
    _jspx_th_bean_message_17.setKey("adm_user_inreg.prompt.issuer_name");
    int _jspx_eval_bean_message_17 = _jspx_th_bean_message_17.doStartTag();
    if (_jspx_th_bean_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_17);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_17);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_html_text_2.setErrorStyleClass("errorfield");
    _jspx_th_html_text_2.setStyleClass("field_input");
    _jspx_th_html_text_2.setProperty("values.issuer_name");
    _jspx_th_html_text_2.setStyleId("issuer_name_t");
    _jspx_th_html_text_2.setDisabled(true);
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_hidden_13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_13 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_13.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_html_hidden_13.setProperty("values.serial_number");
    _jspx_th_html_hidden_13.setStyleId("serial_number");
    int _jspx_eval_html_hidden_13 = _jspx_th_html_hidden_13.doStartTag();
    if (_jspx_th_html_hidden_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_13);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_13);
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
    _jspx_th_bean_message_18.setBundle("admuserinreg");
    _jspx_th_bean_message_18.setKey("adm_user_inreg.prompt.serial_number");
    int _jspx_eval_bean_message_18 = _jspx_th_bean_message_18.doStartTag();
    if (_jspx_th_bean_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
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
    _jspx_th_html_text_3.setProperty("values.serial_number");
    _jspx_th_html_text_3.setStyleId("serial_number_t");
    _jspx_th_html_text_3.setDisabled(true);
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_3);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_disabled_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_19(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_19 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_19.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_19.setBundle("app");
    _jspx_th_bean_message_19.setKey("grad_clasificare.label.fieldInfo");
    int _jspx_eval_bean_message_19 = _jspx_th_bean_message_19.doStartTag();
    if (_jspx_th_bean_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setStyleClass("button");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_bean_message_20(_jspx_th_html_submit_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
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

  private boolean _jspx_meth_bean_message_20(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_20 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_20.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_0);
    _jspx_th_bean_message_20.setBundle("admuser");
    _jspx_th_bean_message_20.setKey("adm_user.button.save");
    int _jspx_eval_bean_message_20 = _jspx_th_bean_message_20.doStartTag();
    if (_jspx_th_bean_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_20);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_20);
    return false;
  }

  private boolean _jspx_meth_html_hidden_14(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_14 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_14.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_14.setProperty("method");
    _jspx_th_html_hidden_14.setValue("updateEditUser");
    int _jspx_eval_html_hidden_14 = _jspx_th_html_hidden_14.doStartTag();
    if (_jspx_th_html_hidden_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_14);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_14);
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
