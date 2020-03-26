package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.settings.util.Constants;

public final class lista_005fdetaliata_005farhiva_005fstiri_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/tld/jportal/jpdisplaytag.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_bundle;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_params;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_property_decorator_bundle_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_bundle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_params = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_property_decorator_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_bundle.release();
    _jspx_tagPool_display_params.release();
    _jspx_tagPool_display_column_property_decorator_bundle_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String tip = request.getParameter("tip_stire");
    String bifa = request.getParameter("bifa");

      out.write("\n");
      out.write("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n");
      out.write("    <tr class=\"page-subtitle\">\n");
      out.write("        <td width=\"60%\">\n");
      out.write("            <!-- Titlul ferestrei de listare. -->\n");
      out.write("            ");

                if (tip.compareTo("1") == 0) {
                    if (bifa != null && bifa.equals("false")) {
            
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            ");
} else if (tip.compareTo("2") == 0) {
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
} else if (tip.compareTo("3") == 0) {
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_bean_message_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
} else if (tip.compareTo("4") == 0) {
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_bean_message_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
} else if (tip.compareTo("5") == 0) {
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_bean_message_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("            <!-- END Sectiune de Titlu pagina. -->\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      //  display:table
      ro.uti.waf.taglib.table.TableTag _jspx_th_display_table_0 = (ro.uti.waf.taglib.table.TableTag) _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_bundle.get(ro.uti.waf.taglib.table.TableTag.class);
      _jspx_th_display_table_0.setPageContext(_jspx_page_context);
      _jspx_th_display_table_0.setParent(null);
      _jspx_th_display_table_0.setList( Constants.TBL_STIRE_KEY_VIZ_LIST );
      _jspx_th_display_table_0.setBundle("app");
      _jspx_th_display_table_0.setStyle("report");
      _jspx_th_display_table_0.setPagesize(50);
      _jspx_th_display_table_0.setMethod("showNewsArchiveList");
      _jspx_th_display_table_0.setRequestURI("portal/vizstire.do");
      int _jspx_eval_display_table_0 = _jspx_th_display_table_0.doStartTag();
      if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_table_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_table_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    ");
          //  display:params
          ro.uti.waf.taglib.table.ParamTag _jspx_th_display_params_0 = (ro.uti.waf.taglib.table.ParamTag) _jspx_tagPool_display_params.get(ro.uti.waf.taglib.table.ParamTag.class);
          _jspx_th_display_params_0.setPageContext(_jspx_page_context);
          _jspx_th_display_params_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
          int _jspx_eval_display_params_0 = _jspx_th_display_params_0.doStartTag();
          if (_jspx_eval_display_params_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_display_params_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_display_params_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_display_params_0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("        <input type=\"hidden\" name=\"tip_stire\" value=\"");
              out.print(tip);
              out.write("\"/>\n");
              out.write("        <input type=\"hidden\" name=\"bifa\" value=\"");
              out.print(bifa);
              out.write("\"/>\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_display_params_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_display_params_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_display_params_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_display_params.reuse(_jspx_th_display_params_0);
            return;
          }
          _jspx_tagPool_display_params.reuse(_jspx_th_display_params_0);
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_display_column_0(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write('\n');
          int evalDoAfterBody = _jspx_th_display_table_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_display_table_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_bundle.reuse(_jspx_th_display_table_0);
        return;
      }
      _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_bundle.reuse(_jspx_th_display_table_0);
      out.write("\n");
      out.write("<!-- sfarsit tabelul cu STIRI -->\n");
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
    _jspx_th_bean_message_0.setBundle("portal");
    _jspx_th_bean_message_0.setKey("portal.stire_general");
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
    _jspx_th_bean_message_1.setBundle("portal");
    _jspx_th_bean_message_1.setKey("portal.astazi");
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
    _jspx_th_bean_message_2.setBundle("portal");
    _jspx_th_bean_message_2.setKey("portal.protectia_mediului");
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
    _jspx_th_bean_message_3.setKey("portal.svm");
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
    _jspx_th_bean_message_4.setBundle("portal");
    _jspx_th_bean_message_4.setKey("portal.politica_ue");
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
    _jspx_th_bean_message_5.setBundle("portal");
    _jspx_th_bean_message_5.setKey("portal.evenimente");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
    return false;
  }

  private boolean _jspx_meth_display_column_0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_0 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_property_decorator_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_0.setPageContext(_jspx_page_context);
    _jspx_th_display_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_0.setProperty("newsRow");
    _jspx_th_display_column_0.setBundle("stire");
    _jspx_th_display_column_0.setDecorator("ro.uti.apmc.portal.components.util.StirePortletDecorator");
    int _jspx_eval_display_column_0 = _jspx_th_display_column_0.doStartTag();
    if (_jspx_th_display_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_0);
      return true;
    }
    _jspx_tagPool_display_column_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_0);
    return false;
  }
}
