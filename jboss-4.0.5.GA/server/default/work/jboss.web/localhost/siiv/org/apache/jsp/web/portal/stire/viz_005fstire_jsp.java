package org.apache.jsp.web.portal.stire;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.settings.util.Constants;

public final class viz_005fstire_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_filter_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_scope_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_scope_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_styleId_property_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_write_property_name_filter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_scope_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_scope_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_write_property_name_filter_nobody.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
    _jspx_tagPool_logic_empty_property_name.release();
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_logic_empty_scope_name.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_logic_notEmpty_scope_name.release();
    _jspx_tagPool_html_hidden_value_styleId_property_nobody.release();
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
      out.write("<table class=\"news-table\" cellpadding=\"0\" cellspacing=\"5\" width=\"100%\">\r\n");
      out.write("    <tr class=\"news-table-title-tr\">\r\n");
      out.write("        <td class=\"news-table-title\" width=\"80%\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_0.setParent(null);
      _jspx_th_bean_write_0.setName(Constants.TBL_STIRE_VIZ_KEY);
      _jspx_th_bean_write_0.setProperty("traducere_titlu");
      _jspx_th_bean_write_0.setFilter(false);
      int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
      if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_0);
        return;
      }
      _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_0);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_0.setParent(null);
      _jspx_th_logic_equal_0.setValue("1");
      _jspx_th_logic_equal_0.setProperty("tip_stire");
      _jspx_th_logic_equal_0.setName(Constants.TBL_STIRE_VIZ_KEY);
      int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
      if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <td class=\"news-table-title2\" width=\"20%\">\r\n");
          out.write("                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
          _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
          _jspx_th_bean_write_1.setName(Constants.TBL_STIRE_VIZ_KEY);
          _jspx_th_bean_write_1.setProperty("data_publicarii");
          _jspx_th_bean_write_1.setFilter(false);
          int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
          if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_1);
            return;
          }
          _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_1);
          out.write("\r\n");
          out.write("            </td>\r\n");
          out.write("        ");
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
      out.write("      ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_1.setParent(null);
      _jspx_th_logic_equal_1.setValue("4");
      _jspx_th_logic_equal_1.setProperty("tip_stire");
      _jspx_th_logic_equal_1.setName(Constants.TBL_STIRE_VIZ_KEY);
      int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
      if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <td class=\"news-table-title2\" width=\"20%\">\r\n");
          out.write("                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
          _jspx_th_bean_write_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_write_2.setName(Constants.TBL_STIRE_VIZ_KEY);
          _jspx_th_bean_write_2.setProperty("data_publicarii");
          _jspx_th_bean_write_2.setFilter(false);
          int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
          if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_2);
            return;
          }
          _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_2);
          out.write("\r\n");
          out.write("            </td>\r\n");
          out.write("        ");
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
      out.write("    </tr>\r\n");
      out.write("    <tr valign=\"top\">\r\n");
      out.write("        ");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_0.setParent(null);
      _jspx_th_logic_notEmpty_0.setName(Constants.TBL_STIRE_VIZ_KEY);
      _jspx_th_logic_notEmpty_0.setProperty("traducere_img");
      int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
      if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <td class=\"field_text\">\r\n");
          out.write("                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
          _jspx_th_bean_write_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_bean_write_3.setName(Constants.TBL_STIRE_VIZ_KEY);
          _jspx_th_bean_write_3.setProperty("traducere_continut");
          _jspx_th_bean_write_3.setFilter(false);
          int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
          if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_3);
            return;
          }
          _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_3);
          out.write("\r\n");
          out.write("\r\n");
          out.write("            </td>\r\n");
          out.write("            <td valign=\"top\" align=\"center\">\r\n");
          out.write("                <img src=\"");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
          _jspx_th_bean_write_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_bean_write_4.setName(Constants.TBL_STIRE_VIZ_KEY);
          _jspx_th_bean_write_4.setProperty("traducere_img");
          _jspx_th_bean_write_4.setFilter(false);
          int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
          if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_4);
            return;
          }
          _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_4);
          out.write("\"\r\n");
          out.write("                     width=\"120\" height=\"90\" border=\"0\"\r\n");
          out.write("                     style=\"border-bottom:3px; border-right:3px; border-color:#E5E5E5\">\r\n");
          out.write("            </td>\r\n");
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
      out.write("        ");
      //  logic:empty
      org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_0 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
      _jspx_th_logic_empty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_empty_0.setParent(null);
      _jspx_th_logic_empty_0.setName(Constants.TBL_STIRE_VIZ_KEY);
      _jspx_th_logic_empty_0.setProperty("traducere_img");
      int _jspx_eval_logic_empty_0 = _jspx_th_logic_empty_0.doStartTag();
      if (_jspx_eval_logic_empty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <td class=\"field_text\" colspan=\"2\">\r\n");
          out.write("                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_5 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_write_5.setPageContext(_jspx_page_context);
          _jspx_th_bean_write_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_0);
          _jspx_th_bean_write_5.setName(Constants.TBL_STIRE_VIZ_KEY);
          _jspx_th_bean_write_5.setProperty("traducere_continut");
          _jspx_th_bean_write_5.setFilter(false);
          int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
          if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_5);
            return;
          }
          _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_5);
          out.write("\r\n");
          out.write("            </td>\r\n");
          out.write("        ");
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
      out.write("    </tr>\r\n");
      out.write("    <tr><td align=\"left\">\r\n");
      out.write("        <img border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:closeWindow();\"\r\n");
      out.write("             title='");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("'\r\n");
      out.write("             src='");
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write("'/>\r\n");
      out.write("\r\n");
      out.write("    </td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<form name=\"closeForm\" method=\"post\" action=\"portal/vizstire.do\">\r\n");
      out.write("  ");
      if (_jspx_meth_logic_empty_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  ");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_1.setParent(null);
      _jspx_th_logic_notEmpty_1.setName("old_method");
      _jspx_th_logic_notEmpty_1.setScope("request");
      int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
      if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
          _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_html_hidden_1.setProperty("method");
          _jspx_th_html_hidden_1.setValue( request.getAttribute("old_method").toString());
          int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
          if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
            return;
          }
          _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
          out.write("\r\n");
          out.write("  ");
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
      out.write("    ");
      if (_jspx_meth_html_hidden_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_html_hidden_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("    function closeWindow() {\r\n");
      out.write("        document.closeForm.submit();\r\n");
      out.write("    }\r\n");
      out.write("    document.getElementById('tip_stire').value = '");
      out.print(request.getParameter("tip_stire"));
      out.write("';\r\n");
      out.write("    document.getElementById('bifa').value = '");
      out.print(request.getParameter("bifa"));
      out.write("';\r\n");
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
    _jspx_th_bean_message_0.setBundle("stire");
    _jspx_th_bean_message_0.setKey("stire.label.back");
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
    _jspx_th_bean_message_1.setBundle("stire");
    _jspx_th_bean_message_1.setKey("stire.label.back.img");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_logic_empty_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:empty
    org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_1 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_scope_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
    _jspx_th_logic_empty_1.setPageContext(_jspx_page_context);
    _jspx_th_logic_empty_1.setParent(null);
    _jspx_th_logic_empty_1.setName("old_method");
    _jspx_th_logic_empty_1.setScope("request");
    int _jspx_eval_logic_empty_1 = _jspx_th_logic_empty_1.doStartTag();
    if (_jspx_eval_logic_empty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_html_hidden_0(_jspx_th_logic_empty_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_logic_empty_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_empty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_empty_scope_name.reuse(_jspx_th_logic_empty_1);
      return true;
    }
    _jspx_tagPool_logic_empty_scope_name.reuse(_jspx_th_logic_empty_1);
    return false;
  }

  private boolean _jspx_meth_html_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_html_hidden_0.setProperty("method");
    _jspx_th_html_hidden_0.setValue("showNewsDetailList");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_2.setParent(null);
    _jspx_th_html_hidden_2.setProperty("tip_stire");
    _jspx_th_html_hidden_2.setValue("");
    _jspx_th_html_hidden_2.setStyleId("tip_stire");
    int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
    if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_2);
      return true;
    }
    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_2);
    return false;
  }

  private boolean _jspx_meth_html_hidden_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_3 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_3.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_3.setParent(null);
    _jspx_th_html_hidden_3.setProperty("bifa");
    _jspx_th_html_hidden_3.setValue("");
    _jspx_th_html_hidden_3.setStyleId("bifa");
    int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
    if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
      return true;
    }
    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
    return false;
  }
}
