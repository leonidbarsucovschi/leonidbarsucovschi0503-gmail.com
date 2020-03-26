package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import ro.uti.apmc.portal.search.action.SearchDocumentType;
import ro.uti.waf.util.MessageResourceUtil;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleId_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_indexId_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_filter_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleId_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_name_indexId_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_filter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_html_form_styleId_method_action.release();
    _jspx_tagPool_html_text_styleId_property_nobody.release();
    _jspx_tagPool_html_select_styleId_property.release();
    _jspx_tagPool_html_option_value_key_bundle_nobody.release();
    _jspx_tagPool_html_submit_styleClass_onclick.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_logic_iterate_name_indexId_id.release();
    _jspx_tagPool_bean_write_property_name_filter_nobody.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
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
      response.setContentType("text/html");
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/display.css\">\r\n");
      out.write("\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("<TR bgcolor=\"#FFCC00\">\r\n");
      out.write("    <TD style=\"padding:3px \" class=\"smallbodywhitebold\" align=\"center\">\r\n");
      out.write("        ");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        :\r\n");
      out.write("    </TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td align=\"center\">\r\n");
      out.write("        ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_method_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/s.do");
      _jspx_th_html_form_0.setMethod("get");
      _jspx_th_html_form_0.setStyleId("searchForm");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <table cellspacing=\"3\" cellpadding=\"2\" border=\"0\">\r\n");
          out.write("                <tr height=\"10\">\r\n");
          out.write("                    <td></td>\r\n");
          out.write("                </tr>\r\n");
          out.write("                <tr>\r\n");
          out.write("                    <td align=\"center\">\r\n");
          out.write("                        ");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                        ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleId_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_0.setPageContext(_jspx_page_context);
          _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_0.setProperty("type");
          _jspx_th_html_select_0.setStyleId("modulCautat");
          int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
          if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_0.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("                            ");
              if (_jspx_meth_html_option_0(_jspx_th_html_select_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                            ");
              //  html:option
              org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_1 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_key_bundle_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
              _jspx_th_html_option_1.setPageContext(_jspx_page_context);
              _jspx_th_html_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
              _jspx_th_html_option_1.setBundle("search");
              _jspx_th_html_option_1.setKey("search.label.paginistatice");
              _jspx_th_html_option_1.setValue(String.valueOf(SearchDocumentType.DOCUMENT_TYPE_STATIC));
              int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
              if (_jspx_th_html_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_option_value_key_bundle_nobody.reuse(_jspx_th_html_option_1);
                return;
              }
              _jspx_tagPool_html_option_value_key_bundle_nobody.reuse(_jspx_th_html_option_1);
              out.write("\r\n");
              out.write("                            ");
              //  html:option
              org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_2 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_key_bundle_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
              _jspx_th_html_option_2.setPageContext(_jspx_page_context);
              _jspx_th_html_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
              _jspx_th_html_option_2.setBundle("search");
              _jspx_th_html_option_2.setKey("search.label.stiri");
              _jspx_th_html_option_2.setValue(String.valueOf(SearchDocumentType.DOCUMENT_TYPE_STIRI));
              int _jspx_eval_html_option_2 = _jspx_th_html_option_2.doStartTag();
              if (_jspx_th_html_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_option_value_key_bundle_nobody.reuse(_jspx_th_html_option_2);
                return;
              }
              _jspx_tagPool_html_option_value_key_bundle_nobody.reuse(_jspx_th_html_option_2);
              out.write("\r\n");
              out.write("                        ");
              int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_select_styleId_property.reuse(_jspx_th_html_select_0);
            return;
          }
          _jspx_tagPool_html_select_styleId_property.reuse(_jspx_th_html_select_0);
          out.write("\r\n");
          out.write("                        ");
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                        ");
          if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                        <input type=\"hidden\" name=\"page\"/>\r\n");
          out.write("                        <img src=\"images/quest.gif\" align=\"absmiddle\" onmouseover=\"javascript:onHelpMouseOver();\"\r\n");
          out.write("                             onmouseout=\"javascript:onHelpMouseOut();\"/>\r\n");
          out.write("\r\n");
          out.write("                        <div id=\"reference4tips\"\r\n");
          out.write("                             style=\"visibility:hidden; position:relative; top:0px; left:0px;\"></div>\r\n");
          out.write("                    </td>\r\n");
          out.write("                </tr>\r\n");
          out.write("                <tr height=\"10\">\r\n");
          out.write("                    <td>\r\n");
          out.write("                        <div id=\"helptips\"\r\n");
          out.write("                             style=\"z-index:100; width:340px; position:absolute; top:0px; left:0px; visibility:hidden; border-style:solid; border-color:#999999; border-width:1px;\">\r\n");
          out.write("                            <table width=\"100%\" cellspacing=\"0\" cellpadding=\"3\" border=\"0\" bgcolor=\"#FFFCE4\">\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td class=\"label\">\r\n");
          out.write("                                        ");
          out.print(MessageResourceUtil.getMessage("search.label.tips1", "search", "", request));
          out.write("\r\n");
          out.write("                                        <br>\r\n");
          out.write("                                        ");
          out.print(MessageResourceUtil.getMessage("search.label.tips2", "search", "", request));
          out.write("\r\n");
          out.write("                                        <br>\r\n");
          out.write("                                        ");
          out.print(MessageResourceUtil.getMessage("search.label.tips3", "search", "", request));
          out.write("\r\n");
          out.write("                                        <br>\r\n");
          out.write("                                        ");
          out.print(MessageResourceUtil.getMessage("search.label.tips4", "search", "", request));
          out.write("\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            </table>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </td>\r\n");
          out.write("                </tr>\r\n");
          out.write("            </table>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_styleId_method_action.reuse(_jspx_th_html_form_0);
        return;
      }
      _jspx_tagPool_html_form_styleId_method_action.reuse(_jspx_th_html_form_0);
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td align=\"center\" width=\"100%\">\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");

                    int pages = ((Integer) request.getAttribute("list_size")).intValue();
                    int currentPage = ((Integer) request.getAttribute("page")).intValue();
                    int split = ((Integer) request.getAttribute("split")).intValue();
                    for (int i = 0; i < pages; i++) {
                        if (currentPage == i) {
                
      out.write("\r\n");
      out.write("                <td>\r\n");
      out.write("                    <div style=\"cursor:pointer;\" class=\"smallbodybold\" onclick=\"getPage(");
      out.print(i);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print((i + 1));
      out.write("\r\n");
      out.write("                        &nbsp;</div>\r\n");
      out.write("                </td>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                <td>\r\n");
      out.write("                    <div style=\"cursor:pointer;\" class=\"smallbodylite\" onclick=\"getPage(");
      out.print(i);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print((i + 1));
      out.write("\r\n");
      out.write("                        &nbsp;</div>\r\n");
      out.write("                </td>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td width=\"100%\" align=\"center\">\r\n");
      out.write("        <table width=\"100%\">\r\n");
      out.write("            ");
if (((List) request.getAttribute("list_result")).size() != 0) {
      out.write("\r\n");
      out.write("            ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_indexId_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setId("results");
      _jspx_th_logic_iterate_0.setName("list_result");
      _jspx_th_logic_iterate_0.setIndexId("index");
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object results = null;
        java.lang.Integer index = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        results = (java.lang.Object) _jspx_page_context.findAttribute("results");
        index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
        do {
          out.write("\r\n");
          out.write("                <tr align=\"left\">\r\n");
          out.write("                    <td>\r\n");
          out.write("                        <table width=\"100%\" class=\"lightrow\" cellspacing=\"1\">\r\n");
          out.write("                            <tr class=\"smallbodybold\">\r\n");
          out.write("                                <td>");
          out.print(currentPage * split + index.intValue() + 1);
          out.write(")&nbsp;<a\r\n");
          out.write("                                        href='");
          if (_jspx_meth_bean_write_0(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("'>\r\n");
          out.write("                                    ");
          if (_jspx_meth_bean_write_1(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                                </a></td>\r\n");
          out.write("                                <td align=\"right\">\r\n");
          out.write("                                    ");
          if (_jspx_meth_bean_write_2(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                                </td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("                            <tr class=\"smallbodylite\">\r\n");
          out.write("                                <td colspan=\"2\" width=\"100%\">\r\n");
          out.write("                                    ");
          if (_jspx_meth_bean_write_3(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                                </td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("                        </table>\r\n");
          out.write("                    </td>\r\n");
          out.write("                </tr>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          results = (java.lang.Object) _jspx_page_context.findAttribute("results");
          index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_iterate_name_indexId_id.reuse(_jspx_th_logic_iterate_0);
        return;
      }
      _jspx_tagPool_logic_iterate_name_indexId_id.reuse(_jspx_th_logic_iterate_0);
      out.write("\r\n");
      out.write("            ");
} else {
      out.write("\r\n");
      out.write("            <tr class=\"msg_success\" align=\"center\">\r\n");
      out.write("                <td>\r\n");
      out.write("                    ");
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<script>\r\n");
      out.write("    function getPage(numar) {\r\n");
      out.write("        document.getElementById('searchForm').page.value = numar;\r\n");
      out.write("        document.getElementById('searchForm').submit();\r\n");
      out.write("    }\r\n");
      out.write("    function checkIfOk() {\r\n");
      out.write("        if (document.getElementById(\"modulCautat\").value == \"-1\") {\r\n");
      out.write("        ");
String message = MessageResourceUtil.getMessage("search.label.selectmodul", "search", "", request);
      out.write("\r\n");
      out.write("            alert(\"");
      out.print(message);
      out.write("\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if (document.getElementById(\"tomsijerry\").value.substring(0, 1) == '*' || document.getElementById(\"tomsijerry\").value.substring(0, 1) == '?') {\r\n");
      out.write("        ");
message = MessageResourceUtil.getMessage("search.label.farasteluta", "search", "", request);
      out.write("\r\n");
      out.write("            alert(\"");
      out.print(message);
      out.write("\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        return true;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function onHelpMouseOver() {\r\n");
      out.write("        var x = document.getElementById('reference4tips').offsetLeft;\r\n");
      out.write("        var y = document.getElementById('reference4tips').offsetTop;\r\n");
      out.write("\r\n");
      out.write("        document.getElementById('helptips').style.left = x;\r\n");
      out.write("        document.getElementById('helptips').style.top = 190;\r\n");
      out.write("        document.getElementById('helptips').style.visibility = 'visible';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function onHelpMouseOut() {\r\n");
      out.write("        document.getElementById(\"helptips\").style.visibility = \"hidden\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_bean_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent(null);
    _jspx_th_bean_message_0.setBundle("search");
    _jspx_th_bean_message_0.setKey("search.title.search");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("query");
    _jspx_th_html_text_0.setStyleId("tomsijerry");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_property_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_styleId_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_0 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_key_bundle_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_0.setPageContext(_jspx_page_context);
    _jspx_th_html_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_option_0.setBundle("search");
    _jspx_th_html_option_0.setKey("search.label.selectati");
    _jspx_th_html_option_0.setValue("-1");
    int _jspx_eval_html_option_0 = _jspx_th_html_option_0.doStartTag();
    if (_jspx_th_html_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_key_bundle_nobody.reuse(_jspx_th_html_option_0);
      return true;
    }
    _jspx_tagPool_html_option_value_key_bundle_nobody.reuse(_jspx_th_html_option_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass_onclick.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setStyleClass("btn-trimite");
    _jspx_th_html_submit_0.setOnclick("return checkIfOk()");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_bean_message_1(_jspx_th_html_submit_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_html_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_styleClass_onclick.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_styleClass_onclick.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_0);
    _jspx_th_bean_message_1.setBundle("search");
    _jspx_th_bean_message_1.setKey("search.label.cauta");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
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
    _jspx_th_html_hidden_0.setValue("show");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_0.setName("results");
    _jspx_th_bean_write_0.setFilter(false);
    _jspx_th_bean_write_0.setProperty("document.href");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_0);
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
    _jspx_th_bean_write_1.setName("results");
    _jspx_th_bean_write_1.setProperty("document.title");
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
    _jspx_th_bean_write_2.setName("results");
    _jspx_th_bean_write_2.setProperty("formatedScore");
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
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_3.setName("results");
    _jspx_th_bean_write_3.setFilter(false);
    _jspx_th_bean_write_3.setProperty("document.summary");
    int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
    if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_3);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_3);
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
    _jspx_th_bean_message_2.setBundle("search");
    _jspx_th_bean_message_2.setKey("search.label.noresults");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
    return false;
  }
}
