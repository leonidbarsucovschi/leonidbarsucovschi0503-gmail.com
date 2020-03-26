package org.apache.jsp.selectionComponent.popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.ejb.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.type.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.web.*;
import org.apache.struts.Globals;
import java.util.*;

public final class selected_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_scope_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_size_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_name_indexId_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_property_name_indexId_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_name;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_define_type_scope_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_size_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_type_name_indexId_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_type_property_name_indexId_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_define_type_scope_name_id_nobody.release();
    _jspx_tagPool_bean_size_property_name_id_nobody.release();
    _jspx_tagPool_logic_notEmpty_name.release();
    _jspx_tagPool_logic_iterate_type_name_indexId_id.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
    _jspx_tagPool_logic_iterate_type_property_name_indexId_id.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_logic_empty_name.release();
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

    ro.uti.waf.components.selectionComponent.selectionPopup.Column _jspx_column_1 = null;
    java.lang.Integer _jspx_idx1_1 = null;

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

    try {

      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_scope_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_0.setParent(null);
      _jspx_th_bean_define_0.setId("selParams");
      _jspx_th_bean_define_0.setName(Constants.SELECTION_PARAMS);
      _jspx_th_bean_define_0.setScope("session");
      _jspx_th_bean_define_0.setType("SelectionCaseParams");
      int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
      if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_define_type_scope_name_id_nobody.reuse(_jspx_th_bean_define_0);
        return;
      }
      _jspx_tagPool_bean_define_type_scope_name_id_nobody.reuse(_jspx_th_bean_define_0);
      SelectionCaseParams selParams = null;
      selParams = (SelectionCaseParams) _jspx_page_context.findAttribute("selParams");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_scope_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_1.setParent(null);
      _jspx_th_bean_define_1.setId("rows");
      _jspx_th_bean_define_1.setName(Constants.SELECTED_ROWS_DETAILS);
      _jspx_th_bean_define_1.setScope("session");
      _jspx_th_bean_define_1.setType("java.util.List");
      int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
      if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_define_type_scope_name_id_nobody.reuse(_jspx_th_bean_define_1);
        return;
      }
      _jspx_tagPool_bean_define_type_scope_name_id_nobody.reuse(_jspx_th_bean_define_1);
      java.util.List rows = null;
      rows = (java.util.List) _jspx_page_context.findAttribute("rows");
      out.write('\r');
      out.write('\n');
      //  bean:size
      java.lang.Integer columnsNr = null;
      org.apache.struts.taglib.bean.SizeTag _jspx_th_bean_size_0 = (org.apache.struts.taglib.bean.SizeTag) _jspx_tagPool_bean_size_property_name_id_nobody.get(org.apache.struts.taglib.bean.SizeTag.class);
      _jspx_th_bean_size_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_size_0.setParent(null);
      _jspx_th_bean_size_0.setId("columnsNr");
      _jspx_th_bean_size_0.setName(Constants.SELECTION_PARAMS);
      _jspx_th_bean_size_0.setProperty("detailColumns");
      int _jspx_eval_bean_size_0 = _jspx_th_bean_size_0.doStartTag();
      columnsNr = (java.lang.Integer) _jspx_page_context.findAttribute("columnsNr");
      if (_jspx_th_bean_size_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_size_property_name_id_nobody.reuse(_jspx_th_bean_size_0);
        return;
      }
      columnsNr = (java.lang.Integer) _jspx_page_context.findAttribute("columnsNr");
      _jspx_tagPool_bean_size_property_name_id_nobody.reuse(_jspx_th_bean_size_0);
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <table id=\"sel_table\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\" class=\"table\">\r\n");
      out.write("\r\n");
      out.write("            <!-- BODY -->\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_0.setParent(null);
      _jspx_th_logic_notEmpty_0.setName(Constants.SELECTED_ROWS_DETAILS);
      int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
      if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_indexId_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_logic_iterate_0.setId("row");
          _jspx_th_logic_iterate_0.setIndexId("idx");
          _jspx_th_logic_iterate_0.setName("rows");
          _jspx_th_logic_iterate_0.setType("java.util.Map");
          int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
          if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.util.Map row = null;
            java.lang.Integer idx = null;
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_0.doInitBody();
            }
            row = (java.util.Map) _jspx_page_context.findAttribute("row");
            idx = (java.lang.Integer) _jspx_page_context.findAttribute("idx");
            do {
              out.write("\r\n");
              out.write("            <tr id = \"selrow");
              out.print(idx);
              out.write("\" bgcolor=\"#ffffff\">\r\n");
              out.write("\r\n");
              out.write("             <script>\r\n");
              out.write("                document.getElementById(\"selrow");
              out.print(idx);
              out.write("\").pk='");
              if (_jspx_meth_bean_write_0(_jspx_th_logic_iterate_0, _jspx_page_context))
                return;
              out.write("';\r\n");
              out.write("                columnProperties.push('pk');\r\n");
              out.write("             </script>\r\n");
              out.write("\r\n");
              out.write("                ");
              out.write("\r\n");
              out.write("                <td align=\"left\" class=\"button-row\" style=\"border-bottom-width: 0px;\"><img src=\"../resources/images/delete_selected.gif\" height=\"9\" width=\"10\" style=\"cursor: pointer;\" onclick=\"removeItem(this)\"></td>\r\n");
              out.write("                ");
              out.write("\r\n");
              out.write("              ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_property_name_indexId_id.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
              _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
              _jspx_th_logic_iterate_1.setId("column");
              _jspx_th_logic_iterate_1.setIndexId("idx1");
              _jspx_th_logic_iterate_1.setName("selParams");
              _jspx_th_logic_iterate_1.setProperty("detailColumns");
              _jspx_th_logic_iterate_1.setType("ro.uti.waf.components.selectionComponent.selectionPopup.Column");
              int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
              if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                ro.uti.waf.components.selectionComponent.selectionPopup.Column column = null;
                java.lang.Integer idx1 = null;
                if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_iterate_1.doInitBody();
                }
                column = (ro.uti.waf.components.selectionComponent.selectionPopup.Column) _jspx_page_context.findAttribute("column");
                idx1 = (java.lang.Integer) _jspx_page_context.findAttribute("idx1");
                do {
                  out.write('\r');
                  out.write('\n');
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
                  _jspx_th_logic_equal_0.setValue("true");
                  _jspx_th_logic_equal_0.setName("column");
                  _jspx_th_logic_equal_0.setProperty("visible");
                  int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
                  if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("                    <td id=\"");
                      out.print(column.getAlias());
                      out.write("\" align=\"");
                      out.print(Util.getAlignment(column.getType().getBaseType()));
                      out.write("\" class=\"button-row\"  style=\"border-bottom-width: 0px;\">");
                      out.print(Util.decodeColumnValue(request, column, row));
                      out.write("</td>\r\n");
                      out.write("                ");
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
                  out.write("\r\n");
                  out.write("                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
                  _jspx_th_logic_equal_1.setValue("false");
                  _jspx_th_logic_equal_1.setName("column");
                  _jspx_th_logic_equal_1.setProperty("visible");
                  int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
                  if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("                    <input disabled=\"true\" type=\"hidden\" id=\"");
                      out.print(column.getAlias());
                      out.write("\" name=\"");
                      out.print(column.getAlias());
                      out.write("\" value=\"");
                      out.print(Util.decodeColumnValue(request, column, row));
                      out.write("\"/>\r\n");
                      out.write("                ");
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
                  out.write("\r\n");
                  out.write("              ");
                  int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
                  column = (ro.uti.waf.components.selectionComponent.selectionPopup.Column) _jspx_page_context.findAttribute("column");
                  idx1 = (java.lang.Integer) _jspx_page_context.findAttribute("idx1");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_iterate_type_property_name_indexId_id.reuse(_jspx_th_logic_iterate_1);
                return;
              }
              _jspx_tagPool_logic_iterate_type_property_name_indexId_id.reuse(_jspx_th_logic_iterate_1);
              out.write('\r');
              out.write('\n');
              out.write("\r\n");
              out.write("\r\n");
              out.write("          <input type=\"hidden\" id=\"pk\" name=\"pks\" value=\"");
              if (_jspx_meth_bean_write_1(_jspx_th_logic_iterate_0, _jspx_page_context))
                return;
              out.write("\"/>\r\n");
              out.write("\r\n");
              out.write("            </tr>\r\n");
              out.write("          ");
              int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
              row = (java.util.Map) _jspx_page_context.findAttribute("row");
              idx = (java.lang.Integer) _jspx_page_context.findAttribute("idx");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_iterate_type_name_indexId_id.reuse(_jspx_th_logic_iterate_0);
            return;
          }
          _jspx_tagPool_logic_iterate_type_name_indexId_id.reuse(_jspx_th_logic_iterate_0);
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_logic_notEmpty_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_notEmpty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_notEmpty_name.reuse(_jspx_th_logic_notEmpty_0);
        return;
      }
      _jspx_tagPool_logic_notEmpty_name.reuse(_jspx_th_logic_notEmpty_0);
      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      //  logic:empty
      org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_0 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
      _jspx_th_logic_empty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_empty_0.setParent(null);
      _jspx_th_logic_empty_0.setName(Constants.SELECTED_ROWS_DETAILS);
      int _jspx_eval_logic_empty_0 = _jspx_th_logic_empty_0.doStartTag();
      if (_jspx_eval_logic_empty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <tr><td>&nbsp;</td></tr>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_logic_empty_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_empty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_empty_name.reuse(_jspx_th_logic_empty_0);
        return;
      }
      _jspx_tagPool_logic_empty_name.reuse(_jspx_th_logic_empty_0);
      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </table>\r\n");

    } catch (Throwable thr) {
        System.err.println("#### selected.jsp ####" );
        thr.printStackTrace();
    }

      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_0.setName("row");
    _jspx_th_bean_write_0.setProperty("pk");
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
    _jspx_th_bean_write_1.setName("row");
    _jspx_th_bean_write_1.setProperty("pk");
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
    return false;
  }
}
