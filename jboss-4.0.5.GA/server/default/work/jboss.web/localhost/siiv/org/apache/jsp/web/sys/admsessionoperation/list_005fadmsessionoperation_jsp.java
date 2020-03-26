package org.apache.jsp.web.sys.admsessionoperation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.settings.util.Constants;

public final class list_005fadmsessionoperation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent_message;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_messages_message_id_bundle;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_ignore_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_rewrite_page_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent_message = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_messages_message_id_bundle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_ignore_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_rewrite_page_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_html_errors_nobody.release();
    _jspx_tagPool_logic_messagesPresent_message.release();
    _jspx_tagPool_html_messages_message_id_bundle.release();
    _jspx_tagPool_bean_write_name_ignore_nobody.release();
    _jspx_tagPool_html_rewrite_page_nobody.release();
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
      out.write("      * \r\n");
      out.write("      * @version \r\n");
      out.write("      * @author \r\n");
      out.write("      */\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"table\">\r\n");
      out.write("  <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
      out.write("    <tr class=\"bottom\">\r\n");
      out.write("      <td width=\"71%\" class=\"page-title-header\" align=\"left\">\r\n");
      out.write("        <!-- Titlul ferestrei de listare. -->\r\n");
      out.write("        <b>");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </b><!-- END Sectiune de Titlu pagina. -->\r\n");
      out.write("      </td>\r\n");
      out.write("      <td valign=\"middle\" nowrap=\"true\" align=\"right\">\r\n");
      out.write("\t\t<input type=\"image\" src=\"images/search.gif\" onMouseOut=\"this.src='images/search.gif'\"\r\n");
      out.write("\t\t\tonMouseOver=\"this.src='images/search_over.gif'\" onClick=\"javascript:showLayer('search')\"\r\n");
      out.write("\t\t\tclass=\"arrow\" border=\"0\" title=\"");
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t<input type=\"image\" onClick=\"javascript:refresh();\" name=\"reload_btn\" src=\"images/refresh.gif\"  border=\"0\" title='");
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write("' />\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <table width=\"100%\">\r\n");
      out.write("    <!-- Sectiune de Afisare Erori. -->\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td colspan=\"2\">\r\n");
      out.write("        ");
      if (_jspx_meth_html_errors_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <!-- END Sectiune de Afisare Erori. -->\r\n");
      out.write("    <!-- #########################3 -->\r\n");
      out.write("    <!-- Start Sectiune de SEARCH. -->\r\n");
      out.write("    <!-- #############################-->\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td colspan=\"2\">\r\n");

        try { 

      out.write("\r\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "search_admsessionoperation.jsp", out, true);
      out.write('\r');
      out.write('\n');

        } catch (Exception e) {
          e.printStackTrace();
        }

      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <!-- #############################-->\r\n");
      out.write("    <!-- END Sectiune de SEARCH. -->\r\n");
      out.write("    ");
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_messagesPresent_0.setParent(null);
      _jspx_th_logic_messagesPresent_0.setMessage("true");
      int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
      if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <tr>\r\n");
          out.write("        <td colspan=\"2\" class=\"note\" align=\"center\">\r\n");
          out.write("          ");
          //  html:messages
          org.apache.struts.taglib.html.MessagesTag _jspx_th_html_messages_0 = (org.apache.struts.taglib.html.MessagesTag) _jspx_tagPool_html_messages_message_id_bundle.get(org.apache.struts.taglib.html.MessagesTag.class);
          _jspx_th_html_messages_0.setPageContext(_jspx_page_context);
          _jspx_th_html_messages_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
          _jspx_th_html_messages_0.setId("mesaje");
          _jspx_th_html_messages_0.setBundle("app");
          _jspx_th_html_messages_0.setMessage("true");
          int _jspx_eval_html_messages_0 = _jspx_th_html_messages_0.doStartTag();
          if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String mesaje = null;
            if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_messages_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_messages_0.doInitBody();
            }
            mesaje = (java.lang.String) _jspx_page_context.findAttribute("mesaje");
            do {
              out.write("\r\n");
              out.write("            ");
              if (_jspx_meth_bean_write_0(_jspx_th_html_messages_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("          ");
              int evalDoAfterBody = _jspx_th_html_messages_0.doAfterBody();
              mesaje = (java.lang.String) _jspx_page_context.findAttribute("mesaje");
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
          out.write("        </td>\r\n");
          out.write("      </tr>\r\n");
          out.write("    ");
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
      out.write("  </table>\r\n");

  try { 

      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "list_lista_admsessionoperation.jsp", out, true);
      out.write('\r');
      out.write('\n');

  } catch (Exception e) {
    e.printStackTrace();
  }

      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<form name=\"actionForm\" method=\"post\" action=\"sys/admsessionoperation.do\">\r\n");
      out.write("  <input type=\"hidden\" name=\"method\" />\r\n");
      out.write("  <input type=\"hidden\" name=\"page\" />\r\n");
      out.write("  <input type=\"hidden\" name=\"prefix\" value=\"/\" />\r\n");
      out.write("  <input type=\"hidden\" name=\"id_session_operation\" />\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("  function showPrint(name, id) {\r\n");
      out.write("    link = \"");
      if (_jspx_meth_html_rewrite_0(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("    popup = window.open(link + \"?method=showPrint&\" + name + \"=\" + id, \"_blank\", \r\n");
      out.write("            \"height=500,width=600,status=no,toolbar=no,menubar=no,location=yes,scrollbars=yes\");\r\n");
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
    _jspx_th_bean_message_0.setBundle("admsessionoperation");
    _jspx_th_bean_message_0.setKey("adm_session_operation.title.list");
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
    _jspx_th_bean_message_1.setBundle("app");
    _jspx_th_bean_message_1.setKey("message.button.tooltip.cauta");
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
    _jspx_th_bean_message_2.setBundle("app");
    _jspx_th_bean_message_2.setKey("message.button.tooltip.refresh");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
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

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_messages_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_ignore_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_messages_0);
    _jspx_th_bean_write_0.setName("mesaje");
    _jspx_th_bean_write_0.setIgnore(true);
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_ignore_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_name_ignore_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_html_rewrite_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_rewrite_0 = (org.apache.struts.taglib.html.RewriteTag) _jspx_tagPool_html_rewrite_page_nobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_rewrite_0.setPageContext(_jspx_page_context);
    _jspx_th_html_rewrite_0.setParent(null);
    _jspx_th_html_rewrite_0.setPage("/admsessionoperation.do");
    int _jspx_eval_html_rewrite_0 = _jspx_th_html_rewrite_0.doStartTag();
    if (_jspx_th_html_rewrite_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_rewrite_page_nobody.reuse(_jspx_th_html_rewrite_0);
      return true;
    }
    _jspx_tagPool_html_rewrite_page_nobody.reuse(_jspx_th_html_rewrite_0);
    return false;
  }
}
