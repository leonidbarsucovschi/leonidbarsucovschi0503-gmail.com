package org.apache.jsp.web.reports;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.settings.util.Constants;

public final class edit_005freport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_onsubmit_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_scope_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_onsubmit_enctype_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_scope_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_logic_messagesPresent.release();
    _jspx_tagPool_html_errors_nobody.release();
    _jspx_tagPool_html_form_onsubmit_enctype_action.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
    _jspx_tagPool_logic_iterate_name_id.release();
    _jspx_tagPool_logic_notEmpty_scope_name.release();
    _jspx_tagPool_bean_write_name_nobody.release();
    _jspx_tagPool_html_submit_styleClass.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form name=\"closeForm\" method=\"post\" action=\"reports/report.do\">\n");
      out.write("    ");
      if (_jspx_meth_html_hidden_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\tfunction init(id_menu_entry)\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"values.fk_report_menu_id\").value = id_menu_entry;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction closeWindow() {\n");
      out.write("        document.closeForm.submit();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\tfunction validate() {\n");
      out.write("        var doSubmit = false;\n");
      out.write("        var name = document.getElementById(\"reportName\").value;\n");
      out.write("        var description = document.getElementById(\"reportDescription\").value;\n");
      out.write("        if (name == \"\") {\n");
      out.write("            alert(\"");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("\");\n");
      out.write("        } else if (description == \"\") {\n");
      out.write("            alert(\"");
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write("\");\n");
      out.write("        } else {\n");
      out.write("            doSubmit = true;\n");
      out.write("        }\n");
      out.write("        return doSubmit;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div class=\"table\">\n");
      out.write("    <!-- Titlul ferestrei -->\n");
      out.write("    <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <td width=\"100%\" valign=\"top\" align=\"left\" class=\"page-subtitle\">\n");
      out.write("                ");
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </td>\n");
      out.write("            <td class=\"bottom\" align=\"right\">\n");
      out.write("                <img border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:closeWindow();\"\n");
      out.write("                     title='");
      if (_jspx_meth_bean_message_3(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("                     src=\"images/close_off.gif\"/>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <!-- Sectiune de Afisare Erori. -->\n");
      out.write("    ");
      if (_jspx_meth_logic_messagesPresent_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\n");
      out.write("\t\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_onsubmit_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/report.do");
      _jspx_th_html_form_0.setEnctype("multipart/form-data");
      _jspx_th_html_form_0.setOnsubmit("return validate();");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_hidden_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_hidden_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_hidden_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_hidden_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_hidden_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t<tr>\n");
          out.write("                <td colspan=\"2\" height=\"10\"></td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("            <!-- Campul nume -->\n");
          out.write("            <tr>\n");
          out.write("                <td class=\"label\" width=\"25%\" align=\"right\">\n");
          out.write("                    ");
          if (_jspx_meth_bean_message_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    :\n");
          out.write("                </td>\n");
          out.write("                <td class=\"field_text\" width=\"25%\" align=\"left\">\n");
          out.write("                    <input type=\"text\" name=\"values.name\" id=\"reportName\" \n");
          out.write("                           value=\"");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_write_0.setProperty("values.name");
          _jspx_th_bean_write_0.setName(Constants.TBL_REPORT_KEY);
          int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
          if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
            return;
          }
          _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
          out.write("\">\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("            <!-- Campul descriere -->\n");
          out.write("            <tr>\n");
          out.write("                <td class=\"label\" width=\"25%\" align=\"right\">\n");
          out.write("                    ");
          if (_jspx_meth_bean_message_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    :\n");
          out.write("                </td>\n");
          out.write("                <td class=\"field_text\" width=\"25%\" align=\"left\">\n");
          out.write("                    <input type=\"text\" name=\"values.description\" id=\"reportDescription\"\n");
          out.write("                           value=\"");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
          _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_write_1.setProperty("values.description");
          _jspx_th_bean_write_1.setName(Constants.TBL_REPORT_KEY);
          int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
          if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
            return;
          }
          _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
          out.write("\">\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td colspan=\"2\">\n");
          out.write("\t\t\t\t\t<div>\n");
          out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\n");
          out.write("\t\t\t\t\t\t\td = new dTree('d');\n");
          out.write("\t\t\t\t\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_iterate_0.setId("menuList");
          _jspx_th_logic_iterate_0.setName( Constants.REPORT_MENUS_LIST );
          int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
          if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object menuList = null;
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_0.doInitBody();
            }
            menuList = (java.lang.Object) _jspx_page_context.findAttribute("menuList");
            do {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\td.add(");
              if (_jspx_meth_bean_write_2(_jspx_th_logic_iterate_0, _jspx_page_context))
                return;
              out.write(',');
              if (_jspx_meth_bean_write_3(_jspx_th_logic_iterate_0, _jspx_page_context))
                return;
              out.write(',');
              out.write('\'');
              if (_jspx_meth_bean_write_4(_jspx_th_logic_iterate_0, _jspx_page_context))
                return;
              out.write("','javascript: init(");
              if (_jspx_meth_bean_write_5(_jspx_th_logic_iterate_0, _jspx_page_context))
                return;
              out.write(");');\n");
              out.write("\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
              menuList = (java.lang.Object) _jspx_page_context.findAttribute("menuList");
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
          out.write("\n");
          out.write("\t\t\t\t\t\t\tdocument.write(d);\n");
          out.write("\t\t\t\t\t\t\td.openAll();\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_logic_notEmpty_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t</script>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("                <td colspan=\"2\" height=\"10\"></td>\n");
          out.write("            </tr>\n");
          out.write("            <tr>\n");
          out.write("                <td colspan=\"2\" class=\"button-row\" align=\"center\">\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_onsubmit_enctype_action.reuse(_jspx_th_html_form_0);
        return;
      }
      _jspx_tagPool_html_form_onsubmit_enctype_action.reuse(_jspx_th_html_form_0);
      out.write("\n");
      out.write("    </table>\n");
      out.write("</div>");
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

  private boolean _jspx_meth_bean_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent(null);
    _jspx_th_bean_message_0.setBundle("report");
    _jspx_th_bean_message_0.setKey("report.alert.nameIsEmpty");
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
    _jspx_th_bean_message_1.setBundle("report");
    _jspx_th_bean_message_1.setKey("report.alert.descriptionIsEmpty");
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
    _jspx_th_bean_message_2.setBundle("report");
    _jspx_th_bean_message_2.setKey("report.title.update");
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
    _jspx_th_bean_message_3.setBundle("report");
    _jspx_th_bean_message_3.setKey("report.label.closeWindow");
    int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
    if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
    return false;
  }

  private boolean _jspx_meth_logic_messagesPresent_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_0.setParent(null);
    int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
    if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <table width=\"100%\" border=\"0\" cellpadding=\"1\" align=\"center\" cellspacing=\"1\">\n");
        out.write("            <tr>\n");
        out.write("                <td valign=\"middle\" nowrap=\"nowrap\" colspan=\"2\" class=\"msg_error\" align=\"center\">\n");
        out.write("                    ");
        if (_jspx_meth_html_errors_0(_jspx_th_logic_messagesPresent_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                </td>\n");
        out.write("            </tr>\n");
        out.write("        </table>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent.reuse(_jspx_th_logic_messagesPresent_0);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent.reuse(_jspx_th_logic_messagesPresent_0);
    return false;
  }

  private boolean _jspx_meth_html_errors_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_messagesPresent_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_nobody.reuse(_jspx_th_html_errors_0);
      return true;
    }
    _jspx_tagPool_html_errors_nobody.reuse(_jspx_th_html_errors_0);
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
    _jspx_th_html_hidden_1.setProperty("values.report_id");
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
    _jspx_th_html_hidden_2.setProperty("values.report_file");
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
    _jspx_th_html_hidden_3.setProperty("values.fk_report_menu_id");
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
    _jspx_th_html_hidden_4.setProperty("tempFolder");
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
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_5 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_5.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_5.setProperty("method");
    _jspx_th_html_hidden_5.setValue("edit");
    int _jspx_eval_html_hidden_5 = _jspx_th_html_hidden_5.doStartTag();
    if (_jspx_th_html_hidden_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_5);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_5);
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
    _jspx_th_bean_message_4.setBundle("report");
    _jspx_th_bean_message_4.setKey("report.prompt.name");
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
    _jspx_th_bean_message_5.setBundle("report");
    _jspx_th_bean_message_5.setKey("report.prompt.description");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
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
    _jspx_th_bean_write_2.setName("menuList");
    _jspx_th_bean_write_2.setProperty("report_menu_id");
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
    _jspx_th_bean_write_3.setName("menuList");
    _jspx_th_bean_write_3.setProperty("fk_parent_id");
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
    _jspx_th_bean_write_4.setName("menuList");
    _jspx_th_bean_write_4.setProperty("report_menu_name");
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
    _jspx_th_bean_write_5.setName("menuList");
    _jspx_th_bean_write_5.setProperty("report_menu_id");
    int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
    if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
    return false;
  }

  private boolean _jspx_meth_logic_notEmpty_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_notEmpty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_logic_notEmpty_0.setName("report_menu_dtree_id");
    _jspx_th_logic_notEmpty_0.setScope("request");
    int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
    if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\td.s(");
        if (_jspx_meth_bean_write_6(_jspx_th_logic_notEmpty_0, _jspx_page_context))
          return true;
        out.write(");\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_notEmpty_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_notEmpty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_notEmpty_scope_name.reuse(_jspx_th_logic_notEmpty_0);
      return true;
    }
    _jspx_tagPool_logic_notEmpty_scope_name.reuse(_jspx_th_logic_notEmpty_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_6 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
    _jspx_th_bean_write_6.setName("report_menu_dtree_id");
    int _jspx_eval_bean_write_6 = _jspx_th_bean_write_6.doStartTag();
    if (_jspx_th_bean_write_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_6);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_6);
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
    _jspx_th_html_submit_0.setStyleClass("btn-generic");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_bean_message_6(_jspx_th_html_submit_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
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

  private boolean _jspx_meth_bean_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_0);
    _jspx_th_bean_message_6.setBundle("report");
    _jspx_th_bean_message_6.setKey("report.button.save");
    int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
    if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
    return false;
  }
}
