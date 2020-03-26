package org.apache.jsp.web.sys.admuser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.settings.util.Constants;

public final class add_005froles_005fadmuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_arg0_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent_message;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_messages_message_id_bundle;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_property_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_arg0_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent_message = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_messages_message_id_bundle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_property_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_bean_message_key_bundle_arg0_nobody.release();
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_logic_messagesPresent_message.release();
    _jspx_tagPool_html_messages_message_id_bundle.release();
    _jspx_tagPool_bean_write_name_nobody.release();
    _jspx_tagPool_logic_iterate_property_name_id.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
    _jspx_tagPool_logic_empty_property_name.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
    _jspx_tagPool_html_form_styleId_action.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
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

    java.lang.Object _jspx_r_1 = null;

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<form name=\"closeForm\" method=\"get\" action=\"sys/admuser.do\">\r\n");
      out.write("  ");
      if (_jspx_meth_html_hidden_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script language=\"Javascript\">\r\n");
      out.write("  function closeWindow() {\r\n");
      out.write("    document.closeForm.submit();\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  ");
 String userLogin = ((ro.uti.apmc.sys.model.AdmUserVO)((ro.uti.apmc.sys.command.AdmUserForm)request.getAttribute("form_AdmUserForm")).getValues()).getUser_login(); 
      out.write("\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t<td colspan=\"4\">\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\"><tr\r\n");
      out.write("\t\t    class=\"page-title-header\"><td width=\"100%\" valign=\"top\" align=\"left\">\r\n");
      out.write("\t\t  ");
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_0.setParent(null);
      _jspx_th_bean_message_0.setBundle("admuser");
      _jspx_th_bean_message_0.setKey("adm_user.roles.title");
      _jspx_th_bean_message_0.setArg0(userLogin);
      int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
      if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_0);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_0);
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t  <td class=\"bottom\" align=\"right\">\r\n");
      out.write("\t\t    <img border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:closeWindow();\"\r\n");
      out.write("\t\t         title='");
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write("'\r\n");
      out.write("\t\t         src=\"images/close_off.gif\"/>\r\n");
      out.write("\t\t  </td>\r\n");
      out.write("\t\t</tr></table>\r\n");
      out.write("  \t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t<td colspan=\"4\" class=\"text-label\">\r\n");
      out.write("  \t\t");
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  \t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"20%\" height=\"22\">&nbsp;</td>\r\n");
      out.write("    <td width=\"30%\">&nbsp;</td>\r\n");
      out.write("    <td width=\"10%\">&nbsp;</td>\r\n");
      out.write("    <td width=\"40%\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_messagesPresent_0.setParent(null);
      _jspx_th_logic_messagesPresent_0.setMessage("true");
      int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
      if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
          //  html:messages
          org.apache.struts.taglib.html.MessagesTag _jspx_th_html_messages_0 = (org.apache.struts.taglib.html.MessagesTag) _jspx_tagPool_html_messages_message_id_bundle.get(org.apache.struts.taglib.html.MessagesTag.class);
          _jspx_th_html_messages_0.setPageContext(_jspx_page_context);
          _jspx_th_html_messages_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
          _jspx_th_html_messages_0.setId("meslogin");
          _jspx_th_html_messages_0.setMessage("true");
          _jspx_th_html_messages_0.setBundle("admuser");
          int _jspx_eval_html_messages_0 = _jspx_th_html_messages_0.doStartTag();
          if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String meslogin = null;
            if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_messages_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_messages_0.doInitBody();
            }
            meslogin = (java.lang.String) _jspx_page_context.findAttribute("meslogin");
            do {
              out.write("\r\n");
              out.write("      <tr>\r\n");
              out.write("        <td valign=\"top\" colspan=\"4\" class=\"msg_error\" align=\"center\">\r\n");
              out.write("          ");
              if (_jspx_meth_bean_write_0(_jspx_th_html_messages_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("        </td>\r\n");
              out.write("      </tr>\r\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_html_messages_0.doAfterBody();
              meslogin = (java.lang.String) _jspx_page_context.findAttribute("meslogin");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_messages_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_messages_message_id_bundle.reuse(_jspx_th_html_messages_0);
            return;
          }
          _jspx_tagPool_html_messages_message_id_bundle.reuse(_jspx_th_html_messages_0);
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_messagesPresent_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_messagesPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_messagesPresent_message.reuse(_jspx_th_logic_messagesPresent_0);
        return;
      }
      _jspx_tagPool_logic_messagesPresent_message.reuse(_jspx_th_logic_messagesPresent_0);
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td class=\"page-title-header\">");
      if (_jspx_meth_bean_message_3(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td class=\"page-title-header\">");
      if (_jspx_meth_bean_message_4(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><table width=\"100%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\r\n");
      out.write("    \t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setName("form_AdmUserForm");
      _jspx_th_logic_iterate_0.setProperty("selectedRoles");
      _jspx_th_logic_iterate_0.setId("sr");
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object sr = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        sr = (java.lang.Object) _jspx_page_context.findAttribute("sr");
        do {
          out.write("\r\n");
          out.write("\t      <tr>\r\n");
          out.write("\t        <td valign=\"top\">\r\n");
          out.write("\t        \t<div>&nbsp;</div>\r\n");
          out.write("\t        \t<div class=\"text-label\">\r\n");
          out.write("\t\t        \t");
          if (_jspx_meth_bean_write_1(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t        \t&nbsp;\r\n");
          out.write("\t\t        \t<a href=\"javascript:removeRoleNode(");
          if (_jspx_meth_bean_write_2(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write(")\">\r\n");
          out.write("\t\t        \t\t");
          if (_jspx_meth_bean_message_5(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t        \t</a>\r\n");
          out.write("\t        \t</div>\r\n");
          out.write("\t        \t<div id=\"sr_");
          if (_jspx_meth_bean_write_3(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("\">##</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\tvar selRole_");
          if (_jspx_meth_bean_write_4(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write(" = new dTree('selRole_");
          if (_jspx_meth_bean_write_5(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("', null, false);\r\n");
          out.write("\t\t\t\t\tselRole_");
          if (_jspx_meth_bean_write_6(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write(".add(");
          if (_jspx_meth_bean_write_7(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write(", -1, '");
          if (_jspx_meth_bean_write_8(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("', 'javascript:nothing()', '");
          if (_jspx_meth_bean_write_9(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("');\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_iterate_1.setName("sr");
          _jspx_th_logic_iterate_1.setId("r");
          _jspx_th_logic_iterate_1.setProperty("children");
          int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
          if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object r = null;
            if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_1.doInitBody();
            }
            r = (java.lang.Object) _jspx_page_context.findAttribute("r");
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\tvar roleId = '");
              if (_jspx_meth_bean_write_10(_jspx_th_logic_iterate_1, _jspx_page_context))
                return;
              out.write("';\r\n");
              out.write("\t\t\t\t\t\tselRole_");
              if (_jspx_meth_bean_write_11(_jspx_th_logic_iterate_1, _jspx_page_context))
                return;
              out.write(".add(roleId,");
              if (_jspx_meth_logic_empty_0(_jspx_th_logic_iterate_1, _jspx_page_context))
                return;
              if (_jspx_meth_logic_notEmpty_0(_jspx_th_logic_iterate_1, _jspx_page_context))
                return;
              out.write(',');
              out.write('\'');
              if (_jspx_meth_bean_write_13(_jspx_th_logic_iterate_1, _jspx_page_context))
                return;
              out.write("','javascript:nothing()','");
              if (_jspx_meth_bean_write_14(_jspx_th_logic_iterate_1, _jspx_page_context))
                return;
              out.write("','_self', '");
              out.print(request.getContextPath());
              out.write("/images/role.gif', '");
              out.print(request.getContextPath());
              out.write("/images/role.gif');\r\n");
              out.write("\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
              r = (java.lang.Object) _jspx_page_context.findAttribute("r");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_1);
            return;
          }
          _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_1);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\tselRole_");
          if (_jspx_meth_bean_write_15(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write(".closeAll();\r\n");
          out.write("\t\t\t\t\tdocument.getElementById('sr_");
          if (_jspx_meth_bean_write_16(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("').innerHTML = selRole_");
          if (_jspx_meth_bean_write_17(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write(";\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t</script>\r\n");
          out.write("\r\n");
          out.write("\t        </td>\r\n");
          out.write("\t      </tr>\r\n");
          out.write("    \t");
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          sr = (java.lang.Object) _jspx_page_context.findAttribute("sr");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_0);
        return;
      }
      _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </table></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td valign=\"top\">\r\n");
      out.write("           <table width=\"100%\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                           <td class=\"label\">\r\n");
      out.write("                              <input type=\"radio\" name=\"tipRol\" id=\"selectRol\" value=\"0\" checked=\"true\" onclick=\"showDiv(0);\" />");
      if (_jspx_meth_bean_message_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                              <input type=\"radio\" name=\"tipRol\" id=\"selectRol\" value=\"1\" onclick=\"showDiv(1);\"/>");
      if (_jspx_meth_bean_message_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                           </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                           <td style=\"vertical-align:top\"  >\r\n");
      out.write("                           <table id=\"tr1\" style=\"display:block\" width=\"100%\" >\r\n");
      out.write("                           <tr><td> <div id=\"rls\">#Browser not supported#</div></td></tr>\r\n");
      out.write("                           </table><table  width=\"100%\" id=\"tr2\" style=\"display:none\" ><tr><td><div id=\"user\" >#Browser not supported#</div></td></tr></table>\r\n");
      out.write("                           </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                     </table>\r\n");
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t\tvar selRoles = new dTree('selRoles', null, false);\r\n");
      out.write("\t\tselRoles.add(0, -1, '");
      if (_jspx_meth_bean_message_8(_jspx_page_context))
        return;
      out.write("', '', '");
      if (_jspx_meth_bean_message_9(_jspx_page_context))
        return;
      out.write("');\r\n");
      out.write("\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_2 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_2.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_2.setParent(null);
      _jspx_th_logic_iterate_2.setName("form_AdmUserForm");
      _jspx_th_logic_iterate_2.setId("r");
      _jspx_th_logic_iterate_2.setProperty("rolesSystem");
      int _jspx_eval_logic_iterate_2 = _jspx_th_logic_iterate_2.doStartTag();
      if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object r = null;
        if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_2.doInitBody();
        }
        r = (java.lang.Object) _jspx_page_context.findAttribute("r");
        do {
          out.write("\r\n");
          out.write("\t\t\tvar roleId = '");
          if (_jspx_meth_bean_write_18(_jspx_th_logic_iterate_2, _jspx_page_context))
            return;
          out.write("';\r\n");
          out.write("\t\t\tselRoles.add(roleId,");
          if (_jspx_meth_logic_empty_1(_jspx_th_logic_iterate_2, _jspx_page_context))
            return;
          if (_jspx_meth_logic_notEmpty_1(_jspx_th_logic_iterate_2, _jspx_page_context))
            return;
          out.write(',');
          out.write('\'');
          if (_jspx_meth_bean_write_20(_jspx_th_logic_iterate_2, _jspx_page_context))
            return;
          out.write("','javascript:addRoleNode('+roleId+')','");
          if (_jspx_meth_bean_write_21(_jspx_th_logic_iterate_2, _jspx_page_context))
            return;
          out.write("','_self', '");
          out.print(request.getContextPath());
          out.write("/images/role.gif', '");
          out.print(request.getContextPath());
          out.write("/images/role.gif');\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_2.doAfterBody();
          r = (java.lang.Object) _jspx_page_context.findAttribute("r");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_iterate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_2);
        return;
      }
      _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_2);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\tselRoles.closeAll();\r\n");
      out.write("\t\tdocument.getElementById('rls').innerHTML = selRoles;\r\n");
      out.write("\r\n");
      out.write("        var selRolesUser = new dTree('selRolesUser', null, false);\r\n");
      out.write("\t\tselRolesUser.add(0, -1, '");
      if (_jspx_meth_bean_message_10(_jspx_page_context))
        return;
      out.write("', '', '");
      if (_jspx_meth_bean_message_11(_jspx_page_context))
        return;
      out.write("');\r\n");
      out.write("\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_3 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_3.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_3.setParent(null);
      _jspx_th_logic_iterate_3.setName("form_AdmUserForm");
      _jspx_th_logic_iterate_3.setId("r");
      _jspx_th_logic_iterate_3.setProperty("rolesUser");
      int _jspx_eval_logic_iterate_3 = _jspx_th_logic_iterate_3.doStartTag();
      if (_jspx_eval_logic_iterate_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object r = null;
        if (_jspx_eval_logic_iterate_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_3.doInitBody();
        }
        r = (java.lang.Object) _jspx_page_context.findAttribute("r");
        do {
          out.write("\r\n");
          out.write("\t\t\tvar roleId = '");
          if (_jspx_meth_bean_write_22(_jspx_th_logic_iterate_3, _jspx_page_context))
            return;
          out.write("';\r\n");
          out.write("\t\t\tselRolesUser.add(roleId,");
          if (_jspx_meth_logic_empty_2(_jspx_th_logic_iterate_3, _jspx_page_context))
            return;
          if (_jspx_meth_logic_notEmpty_2(_jspx_th_logic_iterate_3, _jspx_page_context))
            return;
          out.write(',');
          out.write('\'');
          if (_jspx_meth_bean_write_24(_jspx_th_logic_iterate_3, _jspx_page_context))
            return;
          out.write("','javascript:addRoleNode('+roleId+')','");
          if (_jspx_meth_bean_write_25(_jspx_th_logic_iterate_3, _jspx_page_context))
            return;
          out.write("','_self', '");
          out.print(request.getContextPath());
          out.write("/images/role.gif', '");
          out.print(request.getContextPath());
          out.write("/images/role.gif');\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_3.doAfterBody();
          r = (java.lang.Object) _jspx_page_context.findAttribute("r");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_iterate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_3);
        return;
      }
      _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_3);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\tselRolesUser.closeAll();\r\n");
      out.write("\t\tdocument.getElementById('user').innerHTML = selRolesUser;\r\n");
      out.write("\r\n");
      out.write("\t\tfunction addRoleNode(roleId) {\r\n");
      out.write("\t\t\tvar urlStr = \"");
      out.print(request.getContextPath());
      out.write("/sys/admuser.do;jsessionid=");
      out.print(request.getSession().getId());
      out.write("?method=addRole&roleId=\"+roleId+\"&values.user_login=");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_26 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_26.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_26.setParent(null);
      _jspx_th_bean_write_26.setProperty("values.user_login");
      _jspx_th_bean_write_26.setName(Constants.ADM_USER_KEY);
      int _jspx_eval_bean_write_26 = _jspx_th_bean_write_26.doStartTag();
      if (_jspx_th_bean_write_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_26);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_26);
      out.write("\";\r\n");
      out.write("\t\t\twindow.location = urlStr;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction removeRoleNode(roleId) {\r\n");
      out.write("\t\t\tvar urlStr = \"");
      out.print(request.getContextPath());
      out.write("/sys/admuser.do;jsessionid=");
      out.print(request.getSession().getId());
      out.write("?method=removeRole&roleId=\"+roleId+\"&values.user_login=");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_27 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_27.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_27.setParent(null);
      _jspx_th_bean_write_27.setProperty("values.user_login");
      _jspx_th_bean_write_27.setName(Constants.ADM_USER_KEY);
      int _jspx_eval_bean_write_27 = _jspx_th_bean_write_27.doStartTag();
      if (_jspx_th_bean_write_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_27);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_27);
      out.write("\";\r\n");
      out.write("\t\t\twindow.location = urlStr;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("        function showDiv(id){\r\n");
      out.write("            if(id == 0){\r\n");
      out.write("                document.getElementById(\"tr1\").style.display='inline';\r\n");
      out.write("                document.getElementById(\"tr2\").style.display='none';\r\n");
      out.write("            }else{\r\n");
      out.write("                document.getElementById(\"tr1\").style.display='none';\r\n");
      out.write("                document.getElementById(\"tr2\").style.display='inline';\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\">\r\n");
      out.write("    <td colspan=\"4\">\r\n");
      out.write("    \t<button class=\"btn-generic\" onclick=\"document.getElementById('frm_save').submit();\">");
      if (_jspx_meth_bean_message_12(_jspx_page_context))
        return;
      out.write("</button>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_bean_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_2.setParent(null);
    _jspx_th_bean_message_2.setBundle("admuser");
    _jspx_th_bean_message_2.setKey("adm_user.subtitle.addRoles");
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
    _jspx_th_bean_write_0.setName("meslogin");
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
    _jspx_th_bean_message_3.setKey("adm_user.roles.selected_roles");
    int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
    if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_4.setParent(null);
    _jspx_th_bean_message_4.setBundle("admuser");
    _jspx_th_bean_message_4.setKey("adm_user.roles.roles_tree");
    int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
    if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
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
    _jspx_th_bean_write_1.setName("sr");
    _jspx_th_bean_write_1.setProperty("roleVO.role_name");
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
    _jspx_th_bean_write_2.setName("sr");
    _jspx_th_bean_write_2.setProperty("id");
    int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
    if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_message_5.setBundle("admuser");
    _jspx_th_bean_message_5.setKey("adm_user.label.remove");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
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
    _jspx_th_bean_write_3.setName("sr");
    _jspx_th_bean_write_3.setProperty("id");
    int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
    if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
    return false;
  }

  private boolean _jspx_meth_bean_write_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_4.setName("sr");
    _jspx_th_bean_write_4.setProperty("id");
    int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
    if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
    return false;
  }

  private boolean _jspx_meth_bean_write_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_5 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_5.setName("sr");
    _jspx_th_bean_write_5.setProperty("id");
    int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
    if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
    return false;
  }

  private boolean _jspx_meth_bean_write_6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_6 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_6.setName("sr");
    _jspx_th_bean_write_6.setProperty("id");
    int _jspx_eval_bean_write_6 = _jspx_th_bean_write_6.doStartTag();
    if (_jspx_th_bean_write_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
    return false;
  }

  private boolean _jspx_meth_bean_write_7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_7 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_7.setName("sr");
    _jspx_th_bean_write_7.setProperty("id");
    int _jspx_eval_bean_write_7 = _jspx_th_bean_write_7.doStartTag();
    if (_jspx_th_bean_write_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_7);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_7);
    return false;
  }

  private boolean _jspx_meth_bean_write_8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_8 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_8.setName("sr");
    _jspx_th_bean_write_8.setProperty("roleVO.role_name");
    int _jspx_eval_bean_write_8 = _jspx_th_bean_write_8.doStartTag();
    if (_jspx_th_bean_write_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_8);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_8);
    return false;
  }

  private boolean _jspx_meth_bean_write_9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_9 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_9.setName("sr");
    _jspx_th_bean_write_9.setProperty("roleVO.role_name");
    int _jspx_eval_bean_write_9 = _jspx_th_bean_write_9.doStartTag();
    if (_jspx_th_bean_write_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_9);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_9);
    return false;
  }

  private boolean _jspx_meth_bean_write_10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_10 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_10.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_10.setName("r");
    _jspx_th_bean_write_10.setProperty("id");
    int _jspx_eval_bean_write_10 = _jspx_th_bean_write_10.doStartTag();
    if (_jspx_th_bean_write_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_10);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_10);
    return false;
  }

  private boolean _jspx_meth_bean_write_11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_11 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_11.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_11.setName("sr");
    _jspx_th_bean_write_11.setProperty("id");
    int _jspx_eval_bean_write_11 = _jspx_th_bean_write_11.doStartTag();
    if (_jspx_th_bean_write_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_11);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_11);
    return false;
  }

  private boolean _jspx_meth_logic_empty_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:empty
    org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_0 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
    _jspx_th_logic_empty_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_empty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_logic_empty_0.setName("r");
    _jspx_th_logic_empty_0.setProperty("parentId");
    int _jspx_eval_logic_empty_0 = _jspx_th_logic_empty_0.doStartTag();
    if (_jspx_eval_logic_empty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('0');
        int evalDoAfterBody = _jspx_th_logic_empty_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_empty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_0);
      return true;
    }
    _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_0);
    return false;
  }

  private boolean _jspx_meth_logic_notEmpty_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_notEmpty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_logic_notEmpty_0.setName("r");
    _jspx_th_logic_notEmpty_0.setProperty("parentId");
    int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
    if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_bean_write_12(_jspx_th_logic_notEmpty_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_logic_notEmpty_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_notEmpty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_0);
      return true;
    }
    _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_12 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_12.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
    _jspx_th_bean_write_12.setName("r");
    _jspx_th_bean_write_12.setProperty("parentId");
    int _jspx_eval_bean_write_12 = _jspx_th_bean_write_12.doStartTag();
    if (_jspx_th_bean_write_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_12);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_12);
    return false;
  }

  private boolean _jspx_meth_bean_write_13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_13 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_13.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_13.setName("r");
    _jspx_th_bean_write_13.setProperty("roleVO.role_name");
    int _jspx_eval_bean_write_13 = _jspx_th_bean_write_13.doStartTag();
    if (_jspx_th_bean_write_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_13);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_13);
    return false;
  }

  private boolean _jspx_meth_bean_write_14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_14 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_14.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_14.setName("r");
    _jspx_th_bean_write_14.setProperty("roleVO.role_name");
    int _jspx_eval_bean_write_14 = _jspx_th_bean_write_14.doStartTag();
    if (_jspx_th_bean_write_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_14);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_14);
    return false;
  }

  private boolean _jspx_meth_bean_write_15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_15 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_15.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_15.setName("sr");
    _jspx_th_bean_write_15.setProperty("id");
    int _jspx_eval_bean_write_15 = _jspx_th_bean_write_15.doStartTag();
    if (_jspx_th_bean_write_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_15);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_15);
    return false;
  }

  private boolean _jspx_meth_bean_write_16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_16 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_16.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_16.setName("sr");
    _jspx_th_bean_write_16.setProperty("id");
    int _jspx_eval_bean_write_16 = _jspx_th_bean_write_16.doStartTag();
    if (_jspx_th_bean_write_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_16);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_16);
    return false;
  }

  private boolean _jspx_meth_bean_write_17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_17 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_17.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_17.setName("sr");
    _jspx_th_bean_write_17.setProperty("id");
    int _jspx_eval_bean_write_17 = _jspx_th_bean_write_17.doStartTag();
    if (_jspx_th_bean_write_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_17);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_17);
    return false;
  }

  private boolean _jspx_meth_bean_message_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_6.setParent(null);
    _jspx_th_bean_message_6.setBundle("admuser");
    _jspx_th_bean_message_6.setKey("adm_user.roles.system");
    int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
    if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
    return false;
  }

  private boolean _jspx_meth_bean_message_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_7 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_7.setParent(null);
    _jspx_th_bean_message_7.setBundle("admuser");
    _jspx_th_bean_message_7.setKey("adm_user.roles.user");
    int _jspx_eval_bean_message_7 = _jspx_th_bean_message_7.doStartTag();
    if (_jspx_th_bean_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
    return false;
  }

  private boolean _jspx_meth_bean_message_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_8 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_8.setParent(null);
    _jspx_th_bean_message_8.setBundle("admuser");
    _jspx_th_bean_message_8.setKey("adm_user.roles.system");
    int _jspx_eval_bean_message_8 = _jspx_th_bean_message_8.doStartTag();
    if (_jspx_th_bean_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
    return false;
  }

  private boolean _jspx_meth_bean_message_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_9 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_9.setParent(null);
    _jspx_th_bean_message_9.setBundle("admuser");
    _jspx_th_bean_message_9.setKey("adm_user.roles.system");
    int _jspx_eval_bean_message_9 = _jspx_th_bean_message_9.doStartTag();
    if (_jspx_th_bean_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
    return false;
  }

  private boolean _jspx_meth_bean_write_18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_18 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_18.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
    _jspx_th_bean_write_18.setName("r");
    _jspx_th_bean_write_18.setProperty("id");
    int _jspx_eval_bean_write_18 = _jspx_th_bean_write_18.doStartTag();
    if (_jspx_th_bean_write_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_18);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_18);
    return false;
  }

  private boolean _jspx_meth_logic_empty_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:empty
    org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_1 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
    _jspx_th_logic_empty_1.setPageContext(_jspx_page_context);
    _jspx_th_logic_empty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
    _jspx_th_logic_empty_1.setName("r");
    _jspx_th_logic_empty_1.setProperty("parentId");
    int _jspx_eval_logic_empty_1 = _jspx_th_logic_empty_1.doStartTag();
    if (_jspx_eval_logic_empty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('0');
        int evalDoAfterBody = _jspx_th_logic_empty_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_empty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_1);
      return true;
    }
    _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_1);
    return false;
  }

  private boolean _jspx_meth_logic_notEmpty_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
    _jspx_th_logic_notEmpty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
    _jspx_th_logic_notEmpty_1.setName("r");
    _jspx_th_logic_notEmpty_1.setProperty("parentId");
    int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
    if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_bean_write_19(_jspx_th_logic_notEmpty_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_logic_notEmpty_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_notEmpty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_1);
      return true;
    }
    _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_19 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_19.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
    _jspx_th_bean_write_19.setName("r");
    _jspx_th_bean_write_19.setProperty("parentId");
    int _jspx_eval_bean_write_19 = _jspx_th_bean_write_19.doStartTag();
    if (_jspx_th_bean_write_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_19);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_19);
    return false;
  }

  private boolean _jspx_meth_bean_write_20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_20 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_20.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
    _jspx_th_bean_write_20.setName("r");
    _jspx_th_bean_write_20.setProperty("roleVO.role_name");
    int _jspx_eval_bean_write_20 = _jspx_th_bean_write_20.doStartTag();
    if (_jspx_th_bean_write_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_20);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_20);
    return false;
  }

  private boolean _jspx_meth_bean_write_21(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_21 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_21.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
    _jspx_th_bean_write_21.setName("r");
    _jspx_th_bean_write_21.setProperty("roleVO.role_name");
    int _jspx_eval_bean_write_21 = _jspx_th_bean_write_21.doStartTag();
    if (_jspx_th_bean_write_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_21);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_21);
    return false;
  }

  private boolean _jspx_meth_bean_message_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_10 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_10.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_10.setParent(null);
    _jspx_th_bean_message_10.setBundle("admuser");
    _jspx_th_bean_message_10.setKey("adm_user.roles.user");
    int _jspx_eval_bean_message_10 = _jspx_th_bean_message_10.doStartTag();
    if (_jspx_th_bean_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
    return false;
  }

  private boolean _jspx_meth_bean_message_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_11 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_11.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_11.setParent(null);
    _jspx_th_bean_message_11.setBundle("admuser");
    _jspx_th_bean_message_11.setKey("adm_user.roles.user");
    int _jspx_eval_bean_message_11 = _jspx_th_bean_message_11.doStartTag();
    if (_jspx_th_bean_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
    return false;
  }

  private boolean _jspx_meth_bean_write_22(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_22 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_22.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_3);
    _jspx_th_bean_write_22.setName("r");
    _jspx_th_bean_write_22.setProperty("id");
    int _jspx_eval_bean_write_22 = _jspx_th_bean_write_22.doStartTag();
    if (_jspx_th_bean_write_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_22);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_22);
    return false;
  }

  private boolean _jspx_meth_logic_empty_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:empty
    org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_2 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
    _jspx_th_logic_empty_2.setPageContext(_jspx_page_context);
    _jspx_th_logic_empty_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_3);
    _jspx_th_logic_empty_2.setName("r");
    _jspx_th_logic_empty_2.setProperty("parentId");
    int _jspx_eval_logic_empty_2 = _jspx_th_logic_empty_2.doStartTag();
    if (_jspx_eval_logic_empty_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('0');
        int evalDoAfterBody = _jspx_th_logic_empty_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_empty_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_2);
      return true;
    }
    _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_2);
    return false;
  }

  private boolean _jspx_meth_logic_notEmpty_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_2 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_notEmpty_2.setPageContext(_jspx_page_context);
    _jspx_th_logic_notEmpty_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_3);
    _jspx_th_logic_notEmpty_2.setName("r");
    _jspx_th_logic_notEmpty_2.setProperty("parentId");
    int _jspx_eval_logic_notEmpty_2 = _jspx_th_logic_notEmpty_2.doStartTag();
    if (_jspx_eval_logic_notEmpty_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_bean_write_23(_jspx_th_logic_notEmpty_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_logic_notEmpty_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_notEmpty_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_2);
      return true;
    }
    _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_23(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_23 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_23.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_2);
    _jspx_th_bean_write_23.setName("r");
    _jspx_th_bean_write_23.setProperty("parentId");
    int _jspx_eval_bean_write_23 = _jspx_th_bean_write_23.doStartTag();
    if (_jspx_th_bean_write_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_23);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_23);
    return false;
  }

  private boolean _jspx_meth_bean_write_24(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_24 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_24.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_3);
    _jspx_th_bean_write_24.setName("r");
    _jspx_th_bean_write_24.setProperty("roleVO.role_name");
    int _jspx_eval_bean_write_24 = _jspx_th_bean_write_24.doStartTag();
    if (_jspx_th_bean_write_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_24);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_24);
    return false;
  }

  private boolean _jspx_meth_bean_write_25(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_25 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_25.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_3);
    _jspx_th_bean_write_25.setName("r");
    _jspx_th_bean_write_25.setProperty("roleVO.role_name");
    int _jspx_eval_bean_write_25 = _jspx_th_bean_write_25.doStartTag();
    if (_jspx_th_bean_write_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_25);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_25);
    return false;
  }

  private boolean _jspx_meth_bean_message_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_12 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_12.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_12.setParent(null);
    _jspx_th_bean_message_12.setBundle("admuser");
    _jspx_th_bean_message_12.setKey("adm_user.button.save");
    int _jspx_eval_bean_message_12 = _jspx_th_bean_message_12.doStartTag();
    if (_jspx_th_bean_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
    return false;
  }

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/admuser.do");
    _jspx_th_html_form_0.setStyleId("frm_save");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("   ");
        if (_jspx_meth_html_hidden_1(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("   ");
        if (_jspx_meth_html_hidden_2(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("   ");
        if (_jspx_meth_html_hidden_3(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_styleId_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_styleId_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_1.setProperty("method");
    _jspx_th_html_hidden_1.setValue("save");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
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
    _jspx_th_html_hidden_2.setProperty("values.id_user");
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
    _jspx_th_html_hidden_3.setProperty("values.user_login");
    int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
    if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_3);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_3);
    return false;
  }
}
