package org.apache.jsp.web.portal.mesajsite;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.settings.util.Constants;

public final class list_005flista_005farhiva_005fmesajsite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/tld/jportal/jpdisplaytag.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_property_keyprefix_decorator_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_property_decorator_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_property_keyprefix_decorator_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_property_decorator_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle.release();
    _jspx_tagPool_display_column_title_property_keyprefix_decorator_bundle_nobody.release();
    _jspx_tagPool_display_column_title_property_decorator_bundle_nobody.release();
    _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.release();
    _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody.release();
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
      out.write("<div>\r\n");
      out.write("  ");
      //  display:table
      ro.uti.waf.taglib.table.TableTag _jspx_th_display_table_0 = (ro.uti.waf.taglib.table.TableTag) _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle.get(ro.uti.waf.taglib.table.TableTag.class);
      _jspx_th_display_table_0.setPageContext(_jspx_page_context);
      _jspx_th_display_table_0.setParent(null);
      _jspx_th_display_table_0.setList( Constants.TBL_MESAJ_SITE_KEY_LIST );
      _jspx_th_display_table_0.setCrt("yes");
      _jspx_th_display_table_0.setBundle("app");
      _jspx_th_display_table_0.setStyle("report");
      _jspx_th_display_table_0.setPagesize(50);
      _jspx_th_display_table_0.setMethod("listArchive");
      _jspx_th_display_table_0.setRequestURI("portal/mesajsite.do");
      _jspx_th_display_table_0.setDecorator("ro.uti.waf.taglib.table.DefaultTableDecorator");
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
          if (_jspx_meth_display_column_5(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_display_column_6(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_display_column_7(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write('\r');
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
        _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle.reuse(_jspx_th_display_table_0);
        return;
      }
      _jspx_tagPool_display_table_style_requestURI_pagesize_method_list_decorator_crt_bundle.reuse(_jspx_th_display_table_0);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    function addChecked(id) {\r\n");
      out.write("        index = checkedButtons.indexOf(id);\r\n");
      out.write("        buttonsString = checkedButtons;\r\n");
      out.write("        if (index == -1) {\r\n");
      out.write("            checkedButtons += id + \"|\";\r\n");
      out.write("        }\r\n");
      out.write("        else {\r\n");
      out.write("            checkedButtons = buttonsString.substring(0,index)+buttonsString.substring(index+id.toString().length+1,buttonsString.length);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    function setCheckedString() {\r\n");
      out.write("        document.multipleActions.checkedString.value = checkedButtons;\r\n");
      out.write("    }\r\n");
      out.write("    function deleteItems(){\r\n");
      out.write("        var mes = confirm('Mesajele selectate vor fi sterse definitiv din baza de date.');\r\n");
      out.write("        if (mes) {\r\n");
      out.write("            setCheckedString();\r\n");
      out.write("            document.multipleActions.method.value='multipleDeleteArh';\r\n");
      out.write("        } else {\r\n");
      out.write("            document.multipleActions.method.value='listArchive';\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>");
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
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_0 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_title_property_keyprefix_decorator_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_0.setPageContext(_jspx_page_context);
    _jspx_th_display_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_0.setProperty("userIcon");
    _jspx_th_display_column_0.setBundle("mesajsite");
    _jspx_th_display_column_0.setKeyprefix("mesaj_site");
    _jspx_th_display_column_0.setTitle("mesaj_site.prompt.tip_utilizator");
    _jspx_th_display_column_0.setDecorator("ro.uti.apmc.portal.components.util.MesajSiteDecorator");
    int _jspx_eval_display_column_0 = _jspx_th_display_column_0.doStartTag();
    if (_jspx_th_display_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_property_keyprefix_decorator_bundle_nobody.reuse(_jspx_th_display_column_0);
      return true;
    }
    _jspx_tagPool_display_column_title_property_keyprefix_decorator_bundle_nobody.reuse(_jspx_th_display_column_0);
    return false;
  }

  private boolean _jspx_meth_display_column_1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_1 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_title_property_decorator_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_1.setPageContext(_jspx_page_context);
    _jspx_th_display_column_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_1.setProperty("checkedMsg");
    _jspx_th_display_column_1.setBundle("mesajsite");
    _jspx_th_display_column_1.setTitle("mesaj_site.prompt.selected");
    _jspx_th_display_column_1.setDecorator("ro.uti.apmc.portal.components.util.MesajSiteDecorator");
    int _jspx_eval_display_column_1 = _jspx_th_display_column_1.doStartTag();
    if (_jspx_th_display_column_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_1);
      return true;
    }
    _jspx_tagPool_display_column_title_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_1);
    return false;
  }

  private boolean _jspx_meth_display_column_2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_2 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_title_property_decorator_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_2.setPageContext(_jspx_page_context);
    _jspx_th_display_column_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_2.setProperty("operationIcon");
    _jspx_th_display_column_2.setBundle("mesajsite");
    _jspx_th_display_column_2.setTitle("mesaj_site.prompt.tip_operatie");
    _jspx_th_display_column_2.setDecorator("ro.uti.apmc.portal.components.util.MesajSiteDecorator");
    int _jspx_eval_display_column_2 = _jspx_th_display_column_2.doStartTag();
    if (_jspx_th_display_column_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_2);
      return true;
    }
    _jspx_tagPool_display_column_title_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_2);
    return false;
  }

  private boolean _jspx_meth_display_column_3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_3 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_3.setPageContext(_jspx_page_context);
    _jspx_th_display_column_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_3.setProperty("titlu_mesaj");
    _jspx_th_display_column_3.setBundle("mesajsite");
    _jspx_th_display_column_3.setTitle("mesaj_site.prompt.titlu_mesaj");
    _jspx_th_display_column_3.setSortable("titlu_mesaj");
    _jspx_th_display_column_3.setStyle("sortable");
    _jspx_th_display_column_3.setDecorator("ro.uti.apmc.portal.components.util.MesajSiteDecorator");
    int _jspx_eval_display_column_3 = _jspx_th_display_column_3.doStartTag();
    if (_jspx_th_display_column_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_3);
      return true;
    }
    _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_3);
    return false;
  }

  private boolean _jspx_meth_display_column_4(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_4 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_4.setPageContext(_jspx_page_context);
    _jspx_th_display_column_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_4.setProperty("data_introducere");
    _jspx_th_display_column_4.setBundle("mesajsite");
    _jspx_th_display_column_4.setTitle("mesaj_site.prompt.data_introducere");
    _jspx_th_display_column_4.setSortable("data_introducere");
    _jspx_th_display_column_4.setStyle("sortable");
    _jspx_th_display_column_4.setDecorator("ro.uti.apmc.portal.components.util.MesajSiteDecorator");
    int _jspx_eval_display_column_4 = _jspx_th_display_column_4.doStartTag();
    if (_jspx_th_display_column_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_4);
      return true;
    }
    _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_4);
    return false;
  }

  private boolean _jspx_meth_display_column_5(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_5 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_5.setPageContext(_jspx_page_context);
    _jspx_th_display_column_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_5.setProperty("data_arhivare");
    _jspx_th_display_column_5.setBundle("mesajsite");
    _jspx_th_display_column_5.setTitle("mesaj_site.prompt.data_arhivare");
    _jspx_th_display_column_5.setSortable("data_arhivare");
    _jspx_th_display_column_5.setStyle("sortable");
    _jspx_th_display_column_5.setDecorator("ro.uti.apmc.portal.components.util.MesajSiteDecorator");
    int _jspx_eval_display_column_5 = _jspx_th_display_column_5.doStartTag();
    if (_jspx_th_display_column_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_5);
      return true;
    }
    _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_5);
    return false;
  }

  private boolean _jspx_meth_display_column_6(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_6 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_6.setPageContext(_jspx_page_context);
    _jspx_th_display_column_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_6.setProperty("nume_prenume");
    _jspx_th_display_column_6.setBundle("mesajsite");
    _jspx_th_display_column_6.setTitle("mesaj_site.prompt.nume_prenume");
    _jspx_th_display_column_6.setSortable("nume");
    _jspx_th_display_column_6.setStyle("sortable");
    _jspx_th_display_column_6.setDecorator("ro.uti.apmc.portal.components.util.MesajSiteDecorator");
    int _jspx_eval_display_column_6 = _jspx_th_display_column_6.doStartTag();
    if (_jspx_th_display_column_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_6);
      return true;
    }
    _jspx_tagPool_display_column_title_style_sortable_property_decorator_bundle_nobody.reuse(_jspx_th_display_column_6);
    return false;
  }

  private boolean _jspx_meth_display_column_7(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    ro.uti.waf.taglib.table.ColumnTag _jspx_th_display_column_7 = (ro.uti.waf.taglib.table.ColumnTag) _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody.get(ro.uti.waf.taglib.table.ColumnTag.class);
    _jspx_th_display_column_7.setPageContext(_jspx_page_context);
    _jspx_th_display_column_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_7.setProperty("allButtonsArchiveList");
    _jspx_th_display_column_7.setBundle("mesajsite");
    _jspx_th_display_column_7.setWidth("30");
    _jspx_th_display_column_7.setKeyprefix("mesaj_site");
    _jspx_th_display_column_7.setDecorator("ro.uti.apmc.portal.components.util.MesajSiteDecorator");
    _jspx_th_display_column_7.setPkName("id_mesaj_site");
    int _jspx_eval_display_column_7 = _jspx_th_display_column_7.doStartTag();
    if (_jspx_th_display_column_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody.reuse(_jspx_th_display_column_7);
      return true;
    }
    _jspx_tagPool_display_column_width_property_pkName_keyprefix_decorator_bundle_nobody.reuse(_jspx_th_display_column_7);
    return false;
  }
}
