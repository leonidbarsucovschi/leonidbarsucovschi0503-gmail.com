package org.apache.jsp.web.sys.admrole;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.settings.util.Constants;

public final class list_005flista_005fadmrole_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tld/jportal/jpdisplaytag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_params;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_params = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle.release();
    _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody.release();
    _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.release();
    _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody.release();
    _jspx_tagPool_display_params.release();
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

  String type = request.getParameter("type");

      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("  ");
      //  display:table
      ro.uti.waf.taglib.table.TableTag _jspx_th_display_table_0 = (ro.uti.waf.taglib.table.TableTag) _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle.get(ro.uti.waf.taglib.table.TableTag.class);
      _jspx_th_display_table_0.setPageContext(_jspx_page_context);
      _jspx_th_display_table_0.setParent(null);
      _jspx_th_display_table_0.setList(Constants.ADM_ROLE_KEY_LIST);
      _jspx_th_display_table_0.setCrt("yes");
      _jspx_th_display_table_0.setBundle("app");
      _jspx_th_display_table_0.setStyle("report");
      _jspx_th_display_table_0.setPagesize(50);
      _jspx_th_display_table_0.setMethod("list");
      _jspx_th_display_table_0.setRequestURI("sys/admrole.do");
      _jspx_th_display_table_0.setDecorator("ro.uti.apmc.sys.util.RoleListDecorator");
      int _jspx_eval_display_table_0 = _jspx_th_display_table_0.doStartTag();
      if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_table_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_table_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_display_column_0(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_display_column_1(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_display_column_2(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_display_column_3(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_display_column_4(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
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
              out.write("\r\n");
              out.write("      <input type=\"hidden\" name=\"type\" value=\"");
              out.print(type);
              out.write("\"/>\r\n");
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
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_display_table_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_display_table_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle.reuse(_jspx_th_display_table_0);
        return;
      }
      _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle.reuse(_jspx_th_display_table_0);
      out.write("\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_display_column_0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_0 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_0.setPageContext(_jspx_page_context);
    _jspx_th_display_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_0.setProperty("role_name");
    _jspx_th_display_column_0.setBundle("admrole");
    _jspx_th_display_column_0.setTitle("adm_role.prompt.role_name");
    _jspx_th_display_column_0.setSortable("role_name");
    _jspx_th_display_column_0.setStyle("sortable");
    int _jspx_eval_display_column_0 = _jspx_th_display_column_0.doStartTag();
    if (_jspx_th_display_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody.reuse(_jspx_th_display_column_0);
      return true;
    }
    _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody.reuse(_jspx_th_display_column_0);
    return false;
  }

  private boolean _jspx_meth_display_column_1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_1 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_1.setPageContext(_jspx_page_context);
    _jspx_th_display_column_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_1.setProperty("role_description");
    _jspx_th_display_column_1.setBundle("admrole");
    _jspx_th_display_column_1.setTitle("adm_role.prompt.role_description");
    _jspx_th_display_column_1.setSortable("role_description");
    _jspx_th_display_column_1.setStyle("sortable");
    int _jspx_eval_display_column_1 = _jspx_th_display_column_1.doStartTag();
    if (_jspx_th_display_column_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody.reuse(_jspx_th_display_column_1);
      return true;
    }
    _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody.reuse(_jspx_th_display_column_1);
    return false;
  }

  private boolean _jspx_meth_display_column_2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_2 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_2.setPageContext(_jspx_page_context);
    _jspx_th_display_column_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_2.setProperty("roleType");
    _jspx_th_display_column_2.setBundle("admrole");
    _jspx_th_display_column_2.setTitle("adm_role.prompt.role_type");
    _jspx_th_display_column_2.setSortable("role_type");
    _jspx_th_display_column_2.setStyle("sortable");
    _jspx_th_display_column_2.setDecorator("table");
    int _jspx_eval_display_column_2 = _jspx_th_display_column_2.doStartTag();
    if (_jspx_th_display_column_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_2);
      return true;
    }
    _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_2);
    return false;
  }

  private boolean _jspx_meth_display_column_3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_3 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_3.setPageContext(_jspx_page_context);
    _jspx_th_display_column_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_3.setProperty("role_code");
    _jspx_th_display_column_3.setBundle("admrole");
    _jspx_th_display_column_3.setTitle("adm_role.prompt.role_code");
    _jspx_th_display_column_3.setSortable("role_code");
    _jspx_th_display_column_3.setStyle("sortable");
    int _jspx_eval_display_column_3 = _jspx_th_display_column_3.doStartTag();
    if (_jspx_th_display_column_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody.reuse(_jspx_th_display_column_3);
      return true;
    }
    _jspx_tagPool_display_column_title_style_sortable_property_bundle_nobody.reuse(_jspx_th_display_column_3);
    return false;
  }

  private boolean _jspx_meth_display_column_4(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_4 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_4.setPageContext(_jspx_page_context);
    _jspx_th_display_column_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_4.setProperty("noPrint");
    _jspx_th_display_column_4.setBundle("admrole");
    _jspx_th_display_column_4.setWidth("80");
    _jspx_th_display_column_4.setKeyprefix("adm_role");
    _jspx_th_display_column_4.setDecorator("table");
    _jspx_th_display_column_4.setPkName("id_role");
    int _jspx_eval_display_column_4 = _jspx_th_display_column_4.doStartTag();
    if (_jspx_th_display_column_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody.reuse(_jspx_th_display_column_4);
      return true;
    }
    _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody.reuse(_jspx_th_display_column_4);
    return false;
  }
}