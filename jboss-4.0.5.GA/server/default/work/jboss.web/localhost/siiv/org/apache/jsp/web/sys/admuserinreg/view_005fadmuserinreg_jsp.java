package org.apache.jsp.web.sys.admuserinreg;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.settings.util.Constants;
import ro.uti.apmc.sys.util.AdmUserInregConstants;
import ro.uti.waf.web.action.JPortalActionContext;
import ro.uti.settings.util.ThreadSafeSDFs;

public final class view_005fadmuserinreg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_type_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_html_errors_nobody.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
    _jspx_tagPool_bean_define_type_property_name_id_nobody.release();
    _jspx_tagPool_logic_empty_property_name.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_submit_styleClass.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
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

      out.write("<!--\r\n");
      out.write("      *\r\n");
      out.write("      *\r\n");
      out.write("      * @version\r\n");
      out.write("      * @author\r\n");
      out.write("      */\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"table\">\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("    <tr >\r\n");
      out.write("      <td width=\"100%\" valign=\"top\" align=\"left\" class=\"page-subtitle\">\r\n");
      out.write("        <!-- Titlul ferestrei. -->\r\n");
      out.write("        ");
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
      out.write("  </table>\r\n");
      out.write("   <table width=\"100%\" border=\"0\" cellpadding=\"1\" align=\"center\" cellspacing=\"1\">\r\n");
      out.write("  <!-- Sectiune de Afisare Erori. -->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td valign=\"middle\" nowrap=\"nowrap\" colspan=\"2\" class=\"msg_error\" align=\"center\">");
      if (_jspx_meth_html_errors_0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <!-- END Sectiune de Afisare Erori. -->\r\n");
      out.write(" </table>\r\n");
      out.write("\r\n");
      out.write(" <table width=\"100%\" border=\"0\" cellpadding=\"1\" align=\"center\" cellspacing=\"1\">\r\n");
      out.write("    <tr class=\"even\" >\r\n");
      out.write("       <td class=\"label\" colspan=\"2\">\r\n");
      out.write("         <b>");
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write("</b>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <!-- Cimpul 'nume_user' field. -->\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td valign=\"top\" class=\"label\" align=\"right\" width=\"50%\" >\r\n");
      out.write("        ");
      if (_jspx_meth_bean_message_3(_jspx_page_context))
        return;
      out.write(" :\r\n");
      out.write("      </td>\r\n");
      out.write("      <td class=\"field_text\" align=\"left\" width=\"50%\" >\r\n");
      out.write("        ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_0.setParent(null);
      _jspx_th_bean_write_0.setProperty("nume_user");
      _jspx_th_bean_write_0.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
      if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <!-- Cimpul 'prenume_user' field. -->\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td  valign=\"top\" class=\"label\" align=\"right\">\r\n");
      out.write("        ");
      if (_jspx_meth_bean_message_4(_jspx_page_context))
        return;
      out.write(" :\r\n");
      out.write("      </td>\r\n");
      out.write("      <td class=\"field_text\" align=\"left\">\r\n");
      out.write("        ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_1.setParent(null);
      _jspx_th_bean_write_1.setProperty("prenume_user");
      _jspx_th_bean_write_1.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
      if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <!-- Cimpul 'email_user' field. -->\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td  valign=\"top\" class=\"label\" align=\"right\">\r\n");
      out.write("        ");
      if (_jspx_meth_bean_message_5(_jspx_page_context))
        return;
      out.write(" :\r\n");
      out.write("      </td>\r\n");
      out.write("      <td class=\"field_text\" align=\"left\">\r\n");
      out.write("        ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_2.setParent(null);
      _jspx_th_bean_write_2.setProperty("email_user");
      _jspx_th_bean_write_2.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
      if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <!-- Cimpul 'cd' field. -->\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
      out.write("       ");
      if (_jspx_meth_bean_message_6(_jspx_page_context))
        return;
      out.write(" :\r\n");
      out.write("      </td>\r\n");
      out.write("      <td class=\"field_text\" align=\"left\">\r\n");
      out.write("         ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_0.setParent(null);
      _jspx_th_logic_equal_0.setValue("1");
      _jspx_th_logic_equal_0.setProperty("cd");
      _jspx_th_logic_equal_0.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
      if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_bean_message_7(_jspx_th_logic_equal_0, _jspx_page_context))
            return;
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
      out.write("         ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_1.setParent(null);
      _jspx_th_logic_equal_1.setValue("0");
      _jspx_th_logic_equal_1.setProperty("cd");
      _jspx_th_logic_equal_1.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
      if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_bean_message_8(_jspx_th_logic_equal_1, _jspx_page_context))
            return;
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
      out.write("\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <!-- Cimpul 'user_login' field. -->\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td  valign=\"top\" class=\"label\" align=\"right\">\r\n");
      out.write("        ");
      if (_jspx_meth_bean_message_9(_jspx_page_context))
        return;
      out.write(" :\r\n");
      out.write("      </td>\r\n");
      out.write("      <td class=\"field_text\" align=\"left\">\r\n");
      out.write("        ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_3.setParent(null);
      _jspx_th_bean_write_3.setProperty("user_login");
      _jspx_th_bean_write_3.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
      if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <!-- Cimpul 'data_cerere' field. -->\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
      out.write("        ");
      if (_jspx_meth_bean_message_10(_jspx_page_context))
        return;
      out.write(" :\r\n");
      out.write("      </td>\r\n");
      out.write("      <td class=\"field_text\" align=\"left\">\r\n");
      out.write("        ");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_0.setParent(null);
      _jspx_th_logic_notEmpty_0.setProperty("data_cerere");
      _jspx_th_logic_notEmpty_0.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
      if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("           ");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_bean_define_0.setId("cerereDate");
          _jspx_th_bean_define_0.setProperty("data_cerere");
          _jspx_th_bean_define_0.setName(Constants.ADM_USER_INREG_KEY);
          _jspx_th_bean_define_0.setType("java.util.Date");
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
            return;
          }
          _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
          java.util.Date cerereDate = null;
          cerereDate = (java.util.Date) _jspx_page_context.findAttribute("cerereDate");
          out.write("\r\n");
          out.write("           ");
          out.print(ThreadSafeSDFs.getSdf().format(cerereDate));
          out.write("\r\n");
          out.write("        ");
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
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write(" <tr>\r\n");
      out.write("  <td valign=\"top\">\r\n");
      out.write("   <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("    <tr class=\"even\" >\r\n");
      out.write("     <td class=\"label\" colspan=\"2\" ><b>");
      if (_jspx_meth_bean_message_11(_jspx_page_context))
        return;
      out.write("</b></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <!--campul is_nom-->\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
      out.write("       ");
      if (_jspx_meth_bean_message_12(_jspx_page_context))
        return;
      out.write(" :\r\n");
      out.write("       ");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_1.setParent(null);
      _jspx_th_logic_notEmpty_1.setProperty("is_nom");
      _jspx_th_logic_notEmpty_1.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
      if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_2 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_2.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_logic_equal_2.setValue("1");
          _jspx_th_logic_equal_2.setProperty("is_nom");
          _jspx_th_logic_equal_2.setName(Constants.ADM_USER_INREG_KEY);
          int _jspx_eval_logic_equal_2 = _jspx_th_logic_equal_2.doStartTag();
          if (_jspx_eval_logic_equal_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("            <input type=\"checkbox\" checked=\"true\" disabled=\"true\"/>\r\n");
              out.write("          ");
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
          out.write("       ");
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
      out.write("       ");
      //  logic:empty
      org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_0 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
      _jspx_th_logic_empty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_empty_0.setParent(null);
      _jspx_th_logic_empty_0.setProperty("is_nom");
      _jspx_th_logic_empty_0.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_empty_0 = _jspx_th_logic_empty_0.doStartTag();
      if (_jspx_eval_logic_empty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <input type=\"checkbox\" disabled=\"true\"/>\r\n");
          out.write("       ");
          int evalDoAfterBody = _jspx_th_logic_empty_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_empty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_0);
        return;
      }
      _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_0);
      out.write("\r\n");
      out.write("     </td>\r\n");
      out.write("     <td class=\"field_text\" align=\"left\"  >\r\n");
      out.write("       ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_4.setParent(null);
      _jspx_th_bean_write_4.setProperty("obs_nom");
      _jspx_th_bean_write_4.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
      if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
      out.write("\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("  </td>\r\n");
      out.write("  <td valign=\"top\">\r\n");
      out.write("    <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("      <tr class=\"even\" >\r\n");
      out.write("        <td class=\"label\" colspan=\"2\" ><b>");
      if (_jspx_meth_bean_message_13(_jspx_page_context))
        return;
      out.write("</b></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <!-- Cimpul 'bi' buletin informativ field. -->\r\n");
      out.write("      <tr>\r\n");
      out.write("       <td valign=\"top\" class=\"label\" align=\"right\" width=\"50%\" >\r\n");
      out.write("         ");
      if (_jspx_meth_bean_message_14(_jspx_page_context))
        return;
      out.write(" :\r\n");
      out.write("       </td>\r\n");
      out.write("       <td class=\"text\" align=\"left\" valign=\"top\" width=\"50%\" >\r\n");
      out.write("        ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_3 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_3.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_3.setParent(null);
      _jspx_th_logic_equal_3.setValue("1");
      _jspx_th_logic_equal_3.setProperty("bi");
      _jspx_th_logic_equal_3.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_equal_3 = _jspx_th_logic_equal_3.doStartTag();
      if (_jspx_eval_logic_equal_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <input type=\"checkbox\" checked=\"true\" disabled=\"true\"/>\r\n");
          out.write("       ");
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
      out.write("       ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_4 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_4.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_4.setParent(null);
      _jspx_th_logic_equal_4.setValue("0");
      _jspx_th_logic_equal_4.setProperty("bi");
      _jspx_th_logic_equal_4.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_equal_4 = _jspx_th_logic_equal_4.doStartTag();
      if (_jspx_eval_logic_equal_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <input type=\"checkbox\" disabled=\"true\"/>\r\n");
          out.write("       ");
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
      out.write("       </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr class=\"even\" >\r\n");
      out.write("       <td class=\"label\" colspan=\"2\" ><b>");
      if (_jspx_meth_bean_message_15(_jspx_page_context))
        return;
      out.write("</b></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <!-- Cimpul 'stiri' field. -->\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
      out.write("         ");
      if (_jspx_meth_bean_message_16(_jspx_page_context))
        return;
      out.write(" :\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"text\" align=\"left\" valign=\"top\">\r\n");
      out.write("        ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_5 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_5.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_5.setParent(null);
      _jspx_th_logic_equal_5.setValue("1");
      _jspx_th_logic_equal_5.setProperty("stiri");
      _jspx_th_logic_equal_5.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_equal_5 = _jspx_th_logic_equal_5.doStartTag();
      if (_jspx_eval_logic_equal_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <input type=\"checkbox\" checked=\"true\" disabled=\"true\"/>\r\n");
          out.write("       ");
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
      out.write("       ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_6 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_6.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_6.setParent(null);
      _jspx_th_logic_equal_6.setValue("0");
      _jspx_th_logic_equal_6.setProperty("stiri");
      _jspx_th_logic_equal_6.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_equal_6 = _jspx_th_logic_equal_6.doStartTag();
      if (_jspx_eval_logic_equal_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <input type=\"checkbox\" disabled=\"true\"/>\r\n");
          out.write("       ");
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
      out.write("       </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <!-- Cimpul 'sig_port' field. -->\r\n");
      out.write("      <tr>\r\n");
      out.write("       <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
      out.write("        ");
      if (_jspx_meth_bean_message_17(_jspx_page_context))
        return;
      out.write(" :\r\n");
      out.write("       </td>\r\n");
      out.write("       <td class=\"text\" align=\"left\" valign=\"top\">\r\n");
      out.write("        ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_7 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_7.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_7.setParent(null);
      _jspx_th_logic_equal_7.setValue("1");
      _jspx_th_logic_equal_7.setProperty("sig_port");
      _jspx_th_logic_equal_7.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_equal_7 = _jspx_th_logic_equal_7.doStartTag();
      if (_jspx_eval_logic_equal_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <input type=\"checkbox\" checked=\"true\" disabled=\"true\"/>\r\n");
          out.write("       ");
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
      out.write("       ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_8 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_8.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_8.setParent(null);
      _jspx_th_logic_equal_8.setValue("0");
      _jspx_th_logic_equal_8.setProperty("sig_port");
      _jspx_th_logic_equal_8.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_equal_8 = _jspx_th_logic_equal_8.doStartTag();
      if (_jspx_eval_logic_equal_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <input type=\"checkbox\" disabled=\"true\"/>\r\n");
          out.write("       ");
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
      out.write("       </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <!-- Cimpul 'prot_med' field. -->\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
      out.write("          ");
      if (_jspx_meth_bean_message_18(_jspx_page_context))
        return;
      out.write(" :\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"text\" align=\"left\" valign=\"top\">\r\n");
      out.write("        ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_9 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_9.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_9.setParent(null);
      _jspx_th_logic_equal_9.setValue("1");
      _jspx_th_logic_equal_9.setProperty("prot_med");
      _jspx_th_logic_equal_9.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_equal_9 = _jspx_th_logic_equal_9.doStartTag();
      if (_jspx_eval_logic_equal_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <input type=\"checkbox\" checked=\"true\" disabled=\"true\"/>\r\n");
          out.write("       ");
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
      out.write("       ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_10 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_10.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_10.setParent(null);
      _jspx_th_logic_equal_10.setValue("0");
      _jspx_th_logic_equal_10.setProperty("prot_med");
      _jspx_th_logic_equal_10.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_logic_equal_10 = _jspx_th_logic_equal_10.doStartTag();
      if (_jspx_eval_logic_equal_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <input type=\"checkbox\" disabled=\"true\"/>\r\n");
          out.write("       ");
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
      out.write("       </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" ");
 if (JPortalActionContext.getActionContext().getUser().hasRole(new Long(AdmUserInregConstants.ROL_STERGERE_UTILIZATORI_EXT_ID))) {
      out.write('\r');
      out.write('\n');
      out.write(' ');
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/admuserinreg.do");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <input type=\"hidden\" name=\"values.id_user_inreg\" value=\"");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_5 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_write_5.setPageContext(_jspx_page_context);
          _jspx_th_bean_write_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_write_5.setProperty("id_user_inreg");
          _jspx_th_bean_write_5.setName(Constants.ADM_USER_INREG_KEY);
          int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
          if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
            return;
          }
          _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
          out.write("\">\r\n");
          out.write("      <!-- START Sectiune de BUTOANE. -->\r\n");
          out.write("      <!-- buton delete. -->\r\n");
          out.write("      <tr>\r\n");
          out.write("        <td colspan=\"2\" class=\"button-row\" align=\"center\">\r\n");
          out.write("          ");
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        </td>\r\n");
          out.write("      </tr>\r\n");
          out.write("      <!-- END Sectiune de BUTOANE. -->\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
        return;
      }
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      out.write('\r');
      out.write('\n');
      out.write(' ');
 } 
      out.write("\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("<form name=\"closeForm\" method=\"post\" action=\"sys/admuserinreg.do\">\r\n");
      out.write("\r\n");
      out.write("  ");
      if (_jspx_meth_html_hidden_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  <input type=\"hidden\" name=\"email_user\" value='");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_6 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_6.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_6.setParent(null);
      _jspx_th_bean_write_6.setProperty("email_user");
      _jspx_th_bean_write_6.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_bean_write_6 = _jspx_th_bean_write_6.doStartTag();
      if (_jspx_th_bean_write_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
      out.write("'/>\r\n");
      out.write("  <input type=\"hidden\" name=\"fk_limba\" value='");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_7 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_7.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_7.setParent(null);
      _jspx_th_bean_write_7.setProperty("fk_limba_stiri");
      _jspx_th_bean_write_7.setName(Constants.ADM_USER_INREG_KEY);
      int _jspx_eval_bean_write_7 = _jspx_th_bean_write_7.doStartTag();
      if (_jspx_th_bean_write_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_7);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_7);
      out.write("'/>\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("  function closeWindow() {\r\n");
      out.write("    document.closeForm.submit();\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_bean_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent(null);
    _jspx_th_bean_message_0.setBundle("admuserinreg");
    _jspx_th_bean_message_0.setKey("adm_user_inreg.title.view");
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
    _jspx_th_bean_message_1.setBundle("admuserinreg");
    _jspx_th_bean_message_1.setKey("adm_user_inreg.label.closeWindow");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_html_errors_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent(null);
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_nobody.reuse(_jspx_th_html_errors_0);
      return true;
    }
    _jspx_tagPool_html_errors_nobody.reuse(_jspx_th_html_errors_0);
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

  private boolean _jspx_meth_bean_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_3.setParent(null);
    _jspx_th_bean_message_3.setBundle("admuserinreg");
    _jspx_th_bean_message_3.setKey("adm_user_inreg.prompt.nume_user");
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
    _jspx_th_bean_message_4.setBundle("admuserinreg");
    _jspx_th_bean_message_4.setKey("adm_user_inreg.prompt.prenume_user");
    int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
    if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_5.setParent(null);
    _jspx_th_bean_message_5.setBundle("admuserinreg");
    _jspx_th_bean_message_5.setKey("adm_user_inreg.prompt.email_user");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
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
    _jspx_th_bean_message_6.setBundle("admuserinreg");
    _jspx_th_bean_message_6.setKey("adm_user_inreg.prompt.mod_autentificare");
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
    _jspx_th_bean_message_7.setBundle("admuserinreg");
    _jspx_th_bean_message_7.setKey("adm_user_inreg.prompt.cd");
    int _jspx_eval_bean_message_7 = _jspx_th_bean_message_7.doStartTag();
    if (_jspx_th_bean_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
    return false;
  }

  private boolean _jspx_meth_bean_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_8 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
    _jspx_th_bean_message_8.setBundle("admuserinreg");
    _jspx_th_bean_message_8.setKey("adm_user_inreg.prompt.up");
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
    _jspx_th_bean_message_9.setBundle("admuserinreg");
    _jspx_th_bean_message_9.setKey("adm_user_inreg.prompt.user_login");
    int _jspx_eval_bean_message_9 = _jspx_th_bean_message_9.doStartTag();
    if (_jspx_th_bean_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
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
    _jspx_th_bean_message_10.setBundle("admuserinreg");
    _jspx_th_bean_message_10.setKey("adm_user_inreg.prompt.data_cerere");
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
    _jspx_th_bean_message_11.setBundle("admuserinreg");
    _jspx_th_bean_message_11.setKey("adm_user_inreg.prompt.aplicatii");
    int _jspx_eval_bean_message_11 = _jspx_th_bean_message_11.doStartTag();
    if (_jspx_th_bean_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
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
    _jspx_th_bean_message_12.setBundle("admuserinreg");
    _jspx_th_bean_message_12.setKey("adm_user_inreg.prompt.is_nom");
    int _jspx_eval_bean_message_12 = _jspx_th_bean_message_12.doStartTag();
    if (_jspx_th_bean_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
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
    _jspx_th_bean_message_13.setBundle("admuserinreg");
    _jspx_th_bean_message_13.setKey("adm_user_inreg.prompt.informatii");
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
    _jspx_th_bean_message_14.setBundle("admuserinreg");
    _jspx_th_bean_message_14.setKey("adm_user_inreg.prompt.bi");
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
    _jspx_th_bean_message_15.setBundle("admuserinreg");
    _jspx_th_bean_message_15.setKey("adm_user_inreg.prompt.anunturi");
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
    _jspx_th_bean_message_16.setBundle("admuserinreg");
    _jspx_th_bean_message_16.setKey("adm_user_inreg.prompt.stiri");
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
    _jspx_th_bean_message_17.setBundle("admuserinreg");
    _jspx_th_bean_message_17.setKey("adm_user_inreg.prompt.sig_port");
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
    _jspx_th_bean_message_18.setBundle("admuserinreg");
    _jspx_th_bean_message_18.setKey("adm_user_inreg.prompt.prot_med");
    int _jspx_eval_bean_message_18 = _jspx_th_bean_message_18.doStartTag();
    if (_jspx_th_bean_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
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
        out.write("            ");
        if (_jspx_meth_bean_message_19(_jspx_th_html_submit_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("          ");
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

  private boolean _jspx_meth_bean_message_19(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_19 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_19.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_0);
    _jspx_th_bean_message_19.setBundle("admuserinreg");
    _jspx_th_bean_message_19.setKey("adm_user_inreg.button.delete");
    int _jspx_eval_bean_message_19 = _jspx_th_bean_message_19.doStartTag();
    if (_jspx_th_bean_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
    return false;
  }

  private boolean _jspx_meth_html_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_0.setProperty("method");
    _jspx_th_html_hidden_0.setValue("delete");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_1.setParent(null);
    _jspx_th_html_hidden_1.setProperty("method");
    _jspx_th_html_hidden_1.setValue("closeView");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
    return false;
  }
}
