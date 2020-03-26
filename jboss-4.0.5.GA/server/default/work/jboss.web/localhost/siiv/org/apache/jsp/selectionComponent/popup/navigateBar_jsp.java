package org.apache.jsp.selectionComponent.popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.*;
import ro.uti.waf.components.selectionComponent.taglib.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.type.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.web.*;
import java.util.Enumeration;

public final class navigateBar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_greaterThan_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEqual_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_lessEqual_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_lessThan_value_property_name;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_greaterThan_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEqual_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_lessEqual_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_lessThan_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_write_property_name_nobody.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_logic_greaterThan_value_property_name.release();
    _jspx_tagPool_logic_notEqual_value_property_name.release();
    _jspx_tagPool_logic_lessEqual_value_property_name.release();
    _jspx_tagPool_logic_lessThan_value_property_name.release();
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

        String prefix=request.getParameter("prefix");
        String pagge="";

        // get the list navigation parameters /////////////////
        ViewObject viewObject = (ViewObject)request.getAttribute("viewObject");
        int resPerPage = viewObject.getResPerPage();
        int crtPage = viewObject.getCrtPage();

        int prevPage = viewObject.getPrevPage();
        int nextPage = viewObject.getNextPage();
        int lastPage =  viewObject.getLastPage();

        int pages = viewObject.getPages();
        int groupStartPage = viewObject.getGroupStartPage();
        int groupEndPage = viewObject.getGroupEndPage();
        int pageItems = viewObject.getPageItems();

      out.write("\r\n");
      out.write("\r\n");
if(pagge.length()>0) {
      out.write("\r\n");
      out.write("    <input type=\"hidden\" name=\"page\" value=\"");
      out.print(pagge);
      out.write("\"/>\r\n");
      out.write("    <input type=\"hidden\" name=\"prefix\" value=\"");
      out.print(prefix);
      out.write("\"/>\r\n");
}
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"rpp\" value=\"");
      if (_jspx_meth_bean_write_0(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"crtPage\" value=\"");
      if (_jspx_meth_bean_write_1(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" align=center border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n");
      out.write("\r\n");
      out.write("    ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_0.setParent(null);
      _jspx_th_logic_equal_0.setValue("0");
      _jspx_th_logic_equal_0.setProperty("maxItems");
      _jspx_th_logic_equal_0.setName("viewObject");
      int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
      if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td colspan=\"3\" align=\"center\" class=\"note\">\r\n");
          out.write("          ");
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
          _jspx_th_bean_message_0.setKey("navigation.toolbar.noresults");
          _jspx_th_bean_message_0.setBundle(Constants.MESSAGE_BUNDLE);
          int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
          if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
          out.write("!\r\n");
          out.write("      </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    ");
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
      out.write("<!-- end numarul de rezultate  -->\r\n");
      out.write("<!-- display pages --->\r\n");
      //  logic:greaterThan
      org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_greaterThan_0 = (org.apache.struts.taglib.logic.GreaterThanTag) _jspx_tagPool_logic_greaterThan_value_property_name.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
      _jspx_th_logic_greaterThan_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_greaterThan_0.setParent(null);
      _jspx_th_logic_greaterThan_0.setValue("1");
      _jspx_th_logic_greaterThan_0.setProperty("pages");
      _jspx_th_logic_greaterThan_0.setName("viewObject");
      int _jspx_eval_logic_greaterThan_0 = _jspx_th_logic_greaterThan_0.doStartTag();
      if (_jspx_eval_logic_greaterThan_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <tr>\r\n");
          out.write("\t  <td class=\"searchBar\">\r\n");
          out.write("\t\t<table   cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
          out.write("          <tbody>\r\n");
          out.write("            <tr>\r\n");
          out.write("              <td valign=\"middle\" nowrap=\"true\">\r\n");
          out.write("                ");
          //  logic:greaterThan
          org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_greaterThan_1 = (org.apache.struts.taglib.logic.GreaterThanTag) _jspx_tagPool_logic_greaterThan_value_property_name.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
          _jspx_th_logic_greaterThan_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_greaterThan_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_logic_greaterThan_1.setValue("1");
          _jspx_th_logic_greaterThan_1.setProperty("groupStartPage");
          _jspx_th_logic_greaterThan_1.setName("viewObject");
          int _jspx_eval_logic_greaterThan_1 = _jspx_th_logic_greaterThan_1.doStartTag();
          if (_jspx_eval_logic_greaterThan_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t<input align=\"absmiddle\" type=\"image\" onClick='setNavigate(");
              out.print(resPerPage);
              out.write(",1)' name=\"first\" src=\"../resources/images/navigator/btn-first.png\"\r\n");
              out.write("\t\t\t\t\t       title='");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_1);
              _jspx_th_bean_message_1.setKey("label.navigation.first");
              _jspx_th_bean_message_1.setBundle(Constants.MESSAGE_BUNDLE);
              int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
              if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
              out.write("'  border=\"0\"/>\r\n");
              out.write("\t\t\t    ");
              int evalDoAfterBody = _jspx_th_logic_greaterThan_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_greaterThan_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_greaterThan_value_property_name.reuse(_jspx_th_logic_greaterThan_1);
            return;
          }
          _jspx_tagPool_logic_greaterThan_value_property_name.reuse(_jspx_th_logic_greaterThan_1);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_logic_equal_1.setValue("1");
          _jspx_th_logic_equal_1.setProperty("groupStartPage");
          _jspx_th_logic_equal_1.setName("viewObject");
          int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
          if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t<input align=\"absmiddle\" type=\"image\" name=\"first\" src=\"../resources/images/navigator/btn-first-disabled.png\" disabled=\"true\"\r\n");
              out.write("\t\t\t\t\t       title='");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
              _jspx_th_bean_message_2.setKey("label.navigation.first");
              _jspx_th_bean_message_2.setBundle(Constants.MESSAGE_BUNDLE);
              int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
              if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
              out.write("' border=\"0\"/>\r\n");
              out.write("\t\t\t\t");
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
          out.write("              </td>\r\n");
          out.write("              <td valign=\"middle\" nowrap=\"true\">\r\n");
          out.write("                ");
          if (_jspx_meth_logic_greaterThan_2(_jspx_th_logic_greaterThan_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("              </td>\r\n");
          out.write("              <td valign=\"middle\" nowrap=\"true\">\r\n");
          out.write("                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_2 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_2.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_logic_equal_2.setValue("true");
          _jspx_th_logic_equal_2.setProperty("primaPagina");
          _jspx_th_logic_equal_2.setName("viewObject");
          int _jspx_eval_logic_equal_2 = _jspx_th_logic_equal_2.doStartTag();
          if (_jspx_eval_logic_equal_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t<input align=\"absmiddle\" type=\"image\" onClick='setNavigate(");
              out.print(resPerPage);
              out.write(',');
              out.print(prevPage);
              out.write(")' name=\"prev\" src=\"../resources/images/navigator/btn-previous.png\"\r\n");
              out.write("\t\t\t\t\t       title='");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_3.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_2);
              _jspx_th_bean_message_3.setKey("label.navigation.prev");
              _jspx_th_bean_message_3.setBundle(Constants.MESSAGE_BUNDLE);
              int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
              if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
              out.write("' border=\"0\"/>\r\n");
              out.write("\t\t\t\t");
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
          out.write("                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_3 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_3.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_logic_equal_3.setValue("false");
          _jspx_th_logic_equal_3.setProperty("primaPagina");
          _jspx_th_logic_equal_3.setName("viewObject");
          int _jspx_eval_logic_equal_3 = _jspx_th_logic_equal_3.doStartTag();
          if (_jspx_eval_logic_equal_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t<input align=\"absmiddle\" type=\"image\" name=\"prev\" src=\"../resources/images/navigator/btn-previous-disabled.png\" disabled=\"true\" title='");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_4.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_3);
              _jspx_th_bean_message_4.setKey("label.navigation.prev");
              _jspx_th_bean_message_4.setBundle(Constants.MESSAGE_BUNDLE);
              int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
              if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
              out.write("'\r\n");
              out.write("\t\t\t\t\t       border=\"0\"/>\r\n");
              out.write("\t\t\t\t");
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
          out.write("\t\t\t\t\t\t\t\t");
 for (int i=groupStartPage+1;i<=groupEndPage;i++) {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_4 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_4.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_logic_equal_4.setName("viewObject");
          _jspx_th_logic_equal_4.setProperty("crtPage");
          _jspx_th_logic_equal_4.setValue(i+"");
          int _jspx_eval_logic_equal_4 = _jspx_th_logic_equal_4.doStartTag();
          if (_jspx_eval_logic_equal_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t [<b>");
              out.print(i);
              out.write("</b>]\r\n");
              out.write("\t\t\t\t\t\t\t\t\t");
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
          out.write("\t\t\t\t\t\t\t\t\t");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_notEqual_0 = (org.apache.struts.taglib.logic.NotEqualTag) _jspx_tagPool_logic_notEqual_value_property_name.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_notEqual_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEqual_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_logic_notEqual_0.setName("viewObject");
          _jspx_th_logic_notEqual_0.setProperty("crtPage");
          _jspx_th_logic_notEqual_0.setValue(i+"");
          int _jspx_eval_logic_notEqual_0 = _jspx_th_logic_notEqual_0.doStartTag();
          if (_jspx_eval_logic_notEqual_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"searchLink\" href=\"javascript:setPage(");
              out.print(i);
              out.write(");\">");
              out.print(i);
              out.write("</a>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_notEqual_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEqual_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEqual_value_property_name.reuse(_jspx_th_logic_notEqual_0);
            return;
          }
          _jspx_tagPool_logic_notEqual_value_property_name.reuse(_jspx_th_logic_notEqual_0);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  logic:greaterThan
          org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_greaterThan_3 = (org.apache.struts.taglib.logic.GreaterThanTag) _jspx_tagPool_logic_greaterThan_value_property_name.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
          _jspx_th_logic_greaterThan_3.setPageContext(_jspx_page_context);
          _jspx_th_logic_greaterThan_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_logic_greaterThan_3.setValue("0");
          _jspx_th_logic_greaterThan_3.setProperty("nextPage");
          _jspx_th_logic_greaterThan_3.setName("viewObject");
          int _jspx_eval_logic_greaterThan_3 = _jspx_th_logic_greaterThan_3.doStartTag();
          if (_jspx_eval_logic_greaterThan_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t<input align=\"absmiddle\" type=\"image\" onClick='setNavigate(");
              out.print(resPerPage);
              out.write(',');
              out.print(nextPage);
              out.write(")' name=\"next\" src=\"../resources/images/navigator/btn-next.png\"\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttitle=\"");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_3);
              _jspx_th_bean_message_5.setKey("label.navigation.next");
              _jspx_th_bean_message_5.setBundle(Constants.MESSAGE_BUNDLE);
              int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
              if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
              out.write("\"  border=\"0\"/>\r\n");
              out.write("\t\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_greaterThan_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_greaterThan_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_greaterThan_value_property_name.reuse(_jspx_th_logic_greaterThan_3);
            return;
          }
          _jspx_tagPool_logic_greaterThan_value_property_name.reuse(_jspx_th_logic_greaterThan_3);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_logic_lessEqual_0(_jspx_th_logic_greaterThan_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_notEqual_1 = (org.apache.struts.taglib.logic.NotEqualTag) _jspx_tagPool_logic_notEqual_value_property_name.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_notEqual_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEqual_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_logic_notEqual_1.setName("viewObject");
          _jspx_th_logic_notEqual_1.setProperty("ultimulGrup");
          _jspx_th_logic_notEqual_1.setValue("true");
          int _jspx_eval_logic_notEqual_1 = _jspx_th_logic_notEqual_1.doStartTag();
          if (_jspx_eval_logic_notEqual_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t|\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"searchLink\" href=\"javascript:setPage(");
              out.print(groupEndPage+1);
              out.write(");\" > next <b>");
              out.print(pageItems);
              out.write("</b> </a>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:setPage(");
              out.print(groupEndPage+1);
              out.write(")\" ><img border=\"0\" align=\"absmiddle\" src=\"../resources/images/next.gif\"></a>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t|\r\n");
              out.write("\t\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_notEqual_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEqual_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEqual_value_property_name.reuse(_jspx_th_logic_notEqual_1);
            return;
          }
          _jspx_tagPool_logic_notEqual_value_property_name.reuse(_jspx_th_logic_notEqual_1);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td valign=\"middle\" nowrap=\"true\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          //  logic:greaterThan
          org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_greaterThan_4 = (org.apache.struts.taglib.logic.GreaterThanTag) _jspx_tagPool_logic_greaterThan_value_property_name.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
          _jspx_th_logic_greaterThan_4.setPageContext(_jspx_page_context);
          _jspx_th_logic_greaterThan_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_logic_greaterThan_4.setValue("0");
          _jspx_th_logic_greaterThan_4.setProperty("nextPage");
          _jspx_th_logic_greaterThan_4.setName("viewObject");
          int _jspx_eval_logic_greaterThan_4 = _jspx_th_logic_greaterThan_4.doStartTag();
          if (_jspx_eval_logic_greaterThan_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<input align=\"absmiddle\" type=\"image\" onClick='setNavigate(");
              out.print(resPerPage);
              out.write(',');
              out.print(lastPage);
              out.write(")' name=\"last\" src=\"../resources/images/navigator/btn-last.png\"\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle='");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_4);
              _jspx_th_bean_message_6.setKey("label.navigation.last");
              _jspx_th_bean_message_6.setBundle(Constants.MESSAGE_BUNDLE);
              int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
              if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
              out.write("' border=\"0\"/>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_greaterThan_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_greaterThan_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_greaterThan_value_property_name.reuse(_jspx_th_logic_greaterThan_4);
            return;
          }
          _jspx_tagPool_logic_greaterThan_value_property_name.reuse(_jspx_th_logic_greaterThan_4);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          //  logic:lessThan
          org.apache.struts.taglib.logic.LessThanTag _jspx_th_logic_lessThan_0 = (org.apache.struts.taglib.logic.LessThanTag) _jspx_tagPool_logic_lessThan_value_property_name.get(org.apache.struts.taglib.logic.LessThanTag.class);
          _jspx_th_logic_lessThan_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_lessThan_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_logic_lessThan_0.setValue("0");
          _jspx_th_logic_lessThan_0.setProperty("nextPage");
          _jspx_th_logic_lessThan_0.setName("viewObject");
          int _jspx_eval_logic_lessThan_0 = _jspx_th_logic_lessThan_0.doStartTag();
          if (_jspx_eval_logic_lessThan_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<input align=\"absmiddle\" type=\"image\" name=\"last\" src=\"../resources/images/navigator/btn-last-disabled.png\" disabled=\"true\" title='");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_7 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_7.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_lessThan_0);
              _jspx_th_bean_message_7.setKey("label.navigation.last");
              _jspx_th_bean_message_7.setBundle(Constants.MESSAGE_BUNDLE);
              int _jspx_eval_bean_message_7 = _jspx_th_bean_message_7.doStartTag();
              if (_jspx_th_bean_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
              out.write("'\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t border=\"0\"/>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_lessThan_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_lessThan_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_lessThan_value_property_name.reuse(_jspx_th_logic_lessThan_0);
            return;
          }
          _jspx_tagPool_logic_lessThan_value_property_name.reuse(_jspx_th_logic_lessThan_0);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td width=\"100%\" valign=\"middle\">\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td valign=\"middle\" nowrap=\"true\" class=\"searchLink\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_8 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_8.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_bean_message_8.setKey("label.navigation.page");
          _jspx_th_bean_message_8.setBundle(Constants.MESSAGE_BUNDLE);
          int _jspx_eval_bean_message_8 = _jspx_th_bean_message_8.doStartTag();
          if (_jspx_th_bean_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
          out.write("&nbsp;<b>");
          out.print(crtPage);
          out.write("</b>&nbsp;");
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_9 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_9.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
          _jspx_th_bean_message_9.setKey("label.navigation.of");
          _jspx_th_bean_message_9.setBundle(Constants.MESSAGE_BUNDLE);
          int _jspx_eval_bean_message_9 = _jspx_th_bean_message_9.doStartTag();
          if (_jspx_th_bean_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
          out.write("&nbsp;<b>");
          out.print(pages);
          out.write("</b>\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("            </tr>\r\n");
          out.write("          </tbody>\r\n");
          out.write("        </table>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("    </tr>\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_greaterThan_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_greaterThan_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_greaterThan_value_property_name.reuse(_jspx_th_logic_greaterThan_0);
        return;
      }
      _jspx_tagPool_logic_greaterThan_value_property_name.reuse(_jspx_th_logic_greaterThan_0);
      out.write("\r\n");
      out.write("</table>\r\n");
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

  private boolean _jspx_meth_bean_write_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent(null);
    _jspx_th_bean_write_0.setProperty("resPerPage");
    _jspx_th_bean_write_0.setName("viewObject");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_1.setParent(null);
    _jspx_th_bean_write_1.setProperty("crtPage");
    _jspx_th_bean_write_1.setName("viewObject");
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
    return false;
  }

  private boolean _jspx_meth_logic_greaterThan_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_greaterThan_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:greaterThan
    org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_greaterThan_2 = (org.apache.struts.taglib.logic.GreaterThanTag) _jspx_tagPool_logic_greaterThan_value_property_name.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
    _jspx_th_logic_greaterThan_2.setPageContext(_jspx_page_context);
    _jspx_th_logic_greaterThan_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
    _jspx_th_logic_greaterThan_2.setValue("0");
    _jspx_th_logic_greaterThan_2.setProperty("groupStartPage");
    _jspx_th_logic_greaterThan_2.setName("viewObject");
    int _jspx_eval_logic_greaterThan_2 = _jspx_th_logic_greaterThan_2.doStartTag();
    if (_jspx_eval_logic_greaterThan_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t|\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t<a href=\"javascript:setPage(");
        if (_jspx_meth_bean_write_2(_jspx_th_logic_greaterThan_2, _jspx_page_context))
          return true;
        out.write(");\" >\r\n");
        out.write("\t\t\t\t\t  <img border=\"0\" align=\"absmiddle\" src=\"../resources/images/back.gif\">\r\n");
        out.write("\t\t\t\t\t</a>\r\n");
        out.write("\t\t\t\t\t<a class=\"searchLink\" href=\"javascript:setPage(");
        if (_jspx_meth_bean_write_3(_jspx_th_logic_greaterThan_2, _jspx_page_context))
          return true;
        out.write(");\" >prev. <b>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_bean_write_4(_jspx_th_logic_greaterThan_2, _jspx_page_context))
          return true;
        out.write("</b>\r\n");
        out.write("                    </a>\r\n");
        out.write("\t\t\t\t\t|\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_greaterThan_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_greaterThan_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_greaterThan_value_property_name.reuse(_jspx_th_logic_greaterThan_2);
      return true;
    }
    _jspx_tagPool_logic_greaterThan_value_property_name.reuse(_jspx_th_logic_greaterThan_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_greaterThan_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_2);
    _jspx_th_bean_write_2.setProperty("groupStartPage");
    _jspx_th_bean_write_2.setName("viewObject");
    int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
    if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_greaterThan_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_2);
    _jspx_th_bean_write_3.setProperty("groupStartPage");
    _jspx_th_bean_write_3.setName("viewObject");
    int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
    if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
    return false;
  }

  private boolean _jspx_meth_bean_write_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_greaterThan_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_2);
    _jspx_th_bean_write_4.setProperty("pageItems");
    _jspx_th_bean_write_4.setName("viewObject");
    int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
    if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
    return false;
  }

  private boolean _jspx_meth_logic_lessEqual_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_greaterThan_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:lessEqual
    org.apache.struts.taglib.logic.LessEqualTag _jspx_th_logic_lessEqual_0 = (org.apache.struts.taglib.logic.LessEqualTag) _jspx_tagPool_logic_lessEqual_value_property_name.get(org.apache.struts.taglib.logic.LessEqualTag.class);
    _jspx_th_logic_lessEqual_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_lessEqual_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_greaterThan_0);
    _jspx_th_logic_lessEqual_0.setValue("0");
    _jspx_th_logic_lessEqual_0.setProperty("nextPage");
    _jspx_th_logic_lessEqual_0.setName("viewObject");
    int _jspx_eval_logic_lessEqual_0 = _jspx_th_logic_lessEqual_0.doStartTag();
    if (_jspx_eval_logic_lessEqual_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<input width=\"18\" type=\"image\" title=\"Next\" src=\"../resources/images/navigator/btn-next-disabled.png\" disabled=\"true\"  name=\"next\" height=\"18\" border=\"0\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t title=\"Next\" align=\"absmiddle\">\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_lessEqual_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_lessEqual_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_lessEqual_value_property_name.reuse(_jspx_th_logic_lessEqual_0);
      return true;
    }
    _jspx_tagPool_logic_lessEqual_value_property_name.reuse(_jspx_th_logic_lessEqual_0);
    return false;
  }
}
