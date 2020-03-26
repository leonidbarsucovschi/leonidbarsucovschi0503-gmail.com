package org.apache.jsp.web.sys.admsessionoperation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.settings.util.Constants;
import ro.uti.settings.util.ThreadSafeSDFs;

public final class view_005fadmsessionoperation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_type_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_html_errors_nobody.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
    _jspx_tagPool_bean_define_type_property_name_id_nobody.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"table\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"100%\" valign=\"top\" class=\"bottom\" align=\"left\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"bottom\" align=\"right\">\r\n");
      out.write("\t\t<img border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:closeWindow();\"\r\n");
      out.write("\t\t\t title='");
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write("'\r\n");
      out.write("\t\t\t src=\"images/close_off.gif\"/>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"1\" align=\"center\" class=\"lightrow\" cellspacing=\"1\">\r\n");
      out.write("\r\n");
      out.write("<!-- Sectiune de Afisare Erori. -->\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td valign=\"middle\" nowrap=\"nowrap\" colspan=\"2\" class=\"errormsg\" align=\"center\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_html_errors_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<!-- END Sectiune de Afisare Erori. -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td colspan=\"2\" height=\"10\">\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<!-- Cimpul 'user_login' field. -->\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"40%\" valign=\"top\" align=\"right\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t:\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"text\">\r\n");
      out.write("\t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_0.setParent(null);
      _jspx_th_bean_write_0.setProperty("user_login");
      _jspx_th_bean_write_0.setName(Constants.ADM_SESSION_OPERATION_KEY);
      int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
      if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<!-- Cimpul 'fk_user' field. -->\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"40%\" valign=\"top\" align=\"right\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_bean_message_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t:\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"text\">\r\n");
      out.write("\t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_1.setParent(null);
      _jspx_th_bean_write_1.setProperty("fk_user");
      _jspx_th_bean_write_1.setName(Constants.ADM_SESSION_OPERATION_KEY);
      int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
      if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Cimpul 'http_session_id' field. -->\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"40%\" valign=\"top\" align=\"right\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_bean_message_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t:\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"text\">\r\n");
      out.write("\t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_2.setParent(null);
      _jspx_th_bean_write_2.setProperty("http_session_id");
      _jspx_th_bean_write_2.setName(Constants.ADM_SESSION_OPERATION_KEY);
      int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
      if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<!-- Cimpul 'ip_address' field. -->\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"40%\" valign=\"top\" align=\"right\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_bean_message_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t:\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"text\">\r\n");
      out.write("\t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_3.setParent(null);
      _jspx_th_bean_write_3.setProperty("ip_address");
      _jspx_th_bean_write_3.setName(Constants.ADM_SESSION_OPERATION_KEY);
      int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
      if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td colspan=\"2\" height=\"10\">\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<!-- Cimpul 'operation_date' field. -->\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"40%\" valign=\"top\" align=\"right\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_bean_message_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t:\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"text\">\r\n");
      out.write("\t\t");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_0.setParent(null);
      _jspx_th_bean_define_0.setId("operationDate");
      _jspx_th_bean_define_0.setProperty("operation_date");
      _jspx_th_bean_define_0.setName(Constants.ADM_SESSION_OPERATION_KEY);
      _jspx_th_bean_define_0.setType("oracle.sql.TIMESTAMP");
      int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
      if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
        return;
      }
      _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
      oracle.sql.TIMESTAMP operationDate = null;
      operationDate = (oracle.sql.TIMESTAMP) _jspx_page_context.findAttribute("operationDate");
      out.write("\r\n");
      out.write("\t\t");
      out.print(ThreadSafeSDFs.getSdf().format(oracle.sql.TIMESTAMP.toTimestamp(operationDate.getBytes())));
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<!-- Cimpul 'description' field. -->\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"40%\" valign=\"top\" align=\"right\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_bean_message_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t:\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"text\">\r\n");
      out.write("\t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_4.setParent(null);
      _jspx_th_bean_write_4.setProperty("description");
      _jspx_th_bean_write_4.setName(Constants.ADM_SESSION_OPERATION_KEY);
      int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
      if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<!-- Cimpul 'opp_name' field. -->\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"40%\" valign=\"top\" align=\"right\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_bean_message_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t:\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"text\">\r\n");
      out.write("\t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_5 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_5.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_5.setParent(null);
      _jspx_th_bean_write_5.setProperty("opp_name");
      _jspx_th_bean_write_5.setName(Constants.ADM_SESSION_OPERATION_KEY);
      int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
      if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<!-- Cimpul 'description' field. -->\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"40%\" valign=\"top\" align=\"right\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_bean_message_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t:\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"text\">\r\n");
      out.write("\t\t");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_6 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_6.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_6.setParent(null);
      _jspx_th_bean_write_6.setProperty("description");
      _jspx_th_bean_write_6.setName(Constants.ADM_SESSION_OPERATION_KEY);
      int _jspx_eval_bean_write_6 = _jspx_th_bean_write_6.doStartTag();
      if (_jspx_th_bean_write_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
        return;
      }
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Cimpul 'dump' field. -->\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"40%\" valign=\"top\" align=\"right\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_bean_message_10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t:\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"text\">\r\n");
      out.write("\t\t");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_0.setParent(null);
      _jspx_th_logic_notEmpty_0.setProperty("dump");
      _jspx_th_logic_notEmpty_0.setName(Constants.ADM_SESSION_OPERATION_KEY);
      int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
      if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_bean_define_1.setId("dumpStr");
          _jspx_th_bean_define_1.setProperty("dump");
          _jspx_th_bean_define_1.setName(Constants.ADM_SESSION_OPERATION_KEY);
          _jspx_th_bean_define_1.setType("java.lang.String");
          int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
          if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
            return;
          }
          _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
          java.lang.String dumpStr = null;
          dumpStr = (java.lang.String) _jspx_page_context.findAttribute("dumpStr");
          out.write("\r\n");
          out.write("\t\t\t");
          out.print(dumpStr.replaceAll("\n","<br>"));
          out.write("\r\n");
          out.write("\t\t");
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
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<form name=\"closeForm\" method=\"post\" action=\"sys/admsessionoperation.do\">\r\n");
      out.write("\t");
      if (_jspx_meth_html_hidden_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction closeWindow()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.closeForm.submit();\r\n");
      out.write("\t}\r\n");
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
    _jspx_th_bean_message_0.setKey("adm_session_operation.title.view");
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
    _jspx_th_bean_message_1.setBundle("admsessionoperation");
    _jspx_th_bean_message_1.setKey("adm_session_operation.label.closeWindow");
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
    _jspx_th_bean_message_2.setBundle("admsessionoperation");
    _jspx_th_bean_message_2.setKey("adm_session_operation.view.user_login");
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
    _jspx_th_bean_message_3.setBundle("admsessionoperation");
    _jspx_th_bean_message_3.setKey("adm_session_operation.view.fk_user");
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
    _jspx_th_bean_message_4.setBundle("admsessionoperation");
    _jspx_th_bean_message_4.setKey("adm_session_operation.view.http_session_id");
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
    _jspx_th_bean_message_5.setBundle("admsessionoperation");
    _jspx_th_bean_message_5.setKey("adm_session_operation.view.ip_address");
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
    _jspx_th_bean_message_6.setBundle("admsessionoperation");
    _jspx_th_bean_message_6.setKey("adm_session_operation.prompt.operation_date");
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
    _jspx_th_bean_message_7.setBundle("admsessionoperation");
    _jspx_th_bean_message_7.setKey("adm_session_operation.prompt.description");
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
    _jspx_th_bean_message_8.setBundle("admsessionoperation");
    _jspx_th_bean_message_8.setKey("adm_session_operation.view.opp_name");
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
    _jspx_th_bean_message_9.setBundle("admsessionoperation");
    _jspx_th_bean_message_9.setKey("adm_session_operation.view.description");
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
    _jspx_th_bean_message_10.setBundle("admsessionoperation");
    _jspx_th_bean_message_10.setKey("adm_session_operation.prompt.dump");
    int _jspx_eval_bean_message_10 = _jspx_th_bean_message_10.doStartTag();
    if (_jspx_th_bean_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
    return false;
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
}
