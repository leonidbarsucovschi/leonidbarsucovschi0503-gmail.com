package org.apache.jsp.selectionComponent.popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.ejb.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.type.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.web.*;
import org.apache.struts.Globals;

public final class selection_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/tld/jportal/sys/sys.tld");
    _jspx_dependants.add("/WEB-INF/tags/jportal/sys/base.tag");
    _jspx_dependants.add("/WEB-INF/tld/jstl1.1/c.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_scope_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEqual_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_scope_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEqual_value_scope_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_scope_property_name_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_define_type_scope_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_type_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEqual_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_scope_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEqual_value_scope_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_scope_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_define_type_scope_name_id_nobody.release();
    _jspx_tagPool_bean_define_type_property_name_id_nobody.release();
    _jspx_tagPool_html_form_styleId_method_action.release();
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_logic_notEqual_value_property_name.release();
    _jspx_tagPool_logic_equal_value_scope_property_name.release();
    _jspx_tagPool_logic_notEqual_value_scope_property_name.release();
    _jspx_tagPool_bean_write_scope_property_name_nobody.release();
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
      out.write("    <head>\r\n");
      out.write("        <META http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-2\">\r\n");
      out.write("   ");
      if (_jspx_meth_sys_base_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"../resources/css/menu.css\" >\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"../resources/css/styles.css\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"../resources/css/tab.css\">\r\n");
      out.write("<!--    <link type=\"text/css\" rel=\"stylesheet\" href=\"../resources/calendar/popcalendar.css\" >-->\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../script/hashtable.js\" language=\"JavaScript\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../script/gselect.js\" language=\"JavaScript\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../resources/calendar/popcalendar.js\" language=\"JavaScript\"></script>\r\n");
System.out.println("!!!!!!selection"); 
      out.write("\r\n");
      out.write("<script > columnProperties = new Array();</script>\r\n");
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
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_1.setParent(null);
      _jspx_th_bean_define_1.setId("selectionCase");
      _jspx_th_bean_define_1.setName(Constants.SELECTION_PARAMS);
      _jspx_th_bean_define_1.setProperty("selectionCase");
      _jspx_th_bean_define_1.setType("SelectionCase");
      int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
      if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
        return;
      }
      _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
      SelectionCase selectionCase = null;
      selectionCase = (SelectionCase) _jspx_page_context.findAttribute("selectionCase");
      out.write('\r');
      out.write('\n');
System.out.println("!!!!!!after define"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body onload=\"parent.resizeWindow(myWindow);\"\r\n");
      out.write("\t \t\t onmouseup=\"parent.dropIt()\"\r\n");
      out.write("\t\t\t onmousemove=\"parent.dragIt(event)\"\r\n");
      out.write("\t\t\t onclick=\"parent.bringToFront(myWindow)\">\r\n");
      out.write("\r\n");
      out.write("    ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_method_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/initSelect");
      _jspx_th_html_form_0.setMethod("post");
      _jspx_th_html_form_0.setStyleId("theForm");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("  <table id=\"window_table\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
          out.write("     <tr>\r\n");
          out.write("        <td style=\"background-color: #0066CC; height: 10px; font-size: 10px; overflow: hidden; cursor: move;\" width='99%'\r\n");
          out.write("              onmousedown=\"parent.pickIt(myWindow,event);\">\r\n");
          out.write("            <font color=\"White\"><b>&nbsp;\r\n");
          out.write("\r\n");
          out.write("             ");
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_0.setBundle(selectionCase.getBundle());
          _jspx_th_bean_message_0.setKey(selParams.getLabel());
          int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
          if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
          out.write("\r\n");
          out.write("             &nbsp;</b></font></td>\r\n");
          out.write("        <td style=\"background-color: Silver; border: groove; cursor: pointer; height:10px; font-size:10px;\"\r\n");
          out.write("            onclick=\"parent.closeFrame(myWindow);\"\r\n");
          out.write("            onselectstart=\"event.cancelBubble=true;event.returnValue=false;\"\r\n");
          out.write("            onmouseup=\"this.style.border='groove';\"\r\n");
          out.write("            onmouseout=\"this.style.border='groove';\"\r\n");
          out.write("            onmousedown=\"this.style.border='ridge';\">&nbsp;X&nbsp;</td>\r\n");
          out.write("     <tr><td colspan=\"2\">\r\n");
          out.write("\r\n");
          out.write("        <table bgcolor=\"#ffffff\" width=\"99%\" align=\"center\" border=\"20\" bordercolor=\"#D4D0C8\" cellpadding=\"5\" cellspacing=\"0\">\r\n");
          out.write("          <tr id=\"tabs_row\">\r\n");
          out.write("            <td onclick=\"parent.selectionWindow=myWindow;document.getElementById('theForm').submit();\" style=\"cursor: pointer;\"\r\n");
          out.write("                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_equal_0.setValue("true");
          _jspx_th_logic_equal_0.setName(Constants.SELECTION_FORM);
          _jspx_th_logic_equal_0.setProperty("showSearchTab");
          int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
          if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("class=\"tableDesc\"");
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
          out.write("                ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_notEqual_0 = (org.apache.struts.taglib.logic.NotEqualTag) _jspx_tagPool_logic_notEqual_value_property_name.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_notEqual_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEqual_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEqual_0.setValue("true");
          _jspx_th_logic_notEqual_0.setName(Constants.SELECTION_FORM);
          _jspx_th_logic_notEqual_0.setProperty("showSearchTab");
          int _jspx_eval_logic_notEqual_0 = _jspx_th_logic_notEqual_0.doStartTag();
          if (_jspx_eval_logic_notEqual_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("class=\"tableHeader\"");
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
          out.write(">\r\n");
          out.write("              ");
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_1.setKey("gs.records.tab");
          _jspx_th_bean_message_1.setBundle(Constants.MESSAGE_BUNDLE);
          int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
          if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
          out.write("\r\n");
          out.write("            </td>\r\n");
          out.write("            <td onclick=\"show_tab('fltr', 'art', this);\" style=\"cursor: pointer;\"\r\n");
          out.write("\r\n");
          out.write("                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_equal_1.setValue("true");
          _jspx_th_logic_equal_1.setName(Constants.SELECTION_FORM);
          _jspx_th_logic_equal_1.setProperty("showSearchTab");
          int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
          if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("class=\"tableHeader\"");
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
          out.write("                ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_notEqual_1 = (org.apache.struts.taglib.logic.NotEqualTag) _jspx_tagPool_logic_notEqual_value_property_name.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_notEqual_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEqual_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEqual_1.setValue("true");
          _jspx_th_logic_notEqual_1.setName(Constants.SELECTION_FORM);
          _jspx_th_logic_notEqual_1.setProperty("showSearchTab");
          int _jspx_eval_logic_notEqual_1 = _jspx_th_logic_notEqual_1.doStartTag();
          if (_jspx_eval_logic_notEqual_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("class=\"tableDesc\"");
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
          out.write(">\r\n");
          out.write("              ");
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_2.setKey("gs.filters.tab");
          _jspx_th_bean_message_2.setBundle(Constants.MESSAGE_BUNDLE);
          int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
          if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
          out.write("\r\n");
          out.write("            </td>\r\n");
          out.write("            <td width=\"90%\">&nbsp;</td>\r\n");
          out.write("          </tr>\r\n");
          out.write("\r\n");
          out.write("          ");
          out.write("\r\n");
          out.write("        ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_notEqual_2 = (org.apache.struts.taglib.logic.NotEqualTag) _jspx_tagPool_logic_notEqual_value_property_name.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_notEqual_2.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEqual_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEqual_2.setValue("true");
          _jspx_th_logic_notEqual_2.setName(Constants.SELECTION_FORM);
          _jspx_th_logic_notEqual_2.setProperty("showSearchTab");
          int _jspx_eval_logic_notEqual_2 = _jspx_th_logic_notEqual_2.doStartTag();
          if (_jspx_eval_logic_notEqual_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("          <tr id=\"art\" style=\"height: 400px;\" align=\"center\" valign=\"top\">\r\n");
              out.write("            <td colspan=3 class=\"tableHeader\">\r\n");
              out.write("                ");
              org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "records.jsp", out, true);
              out.write("\r\n");
              out.write("            </td>\r\n");
              out.write("          </tr>\r\n");
              out.write("        ");
              int evalDoAfterBody = _jspx_th_logic_notEqual_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEqual_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEqual_value_property_name.reuse(_jspx_th_logic_notEqual_2);
            return;
          }
          _jspx_tagPool_logic_notEqual_value_property_name.reuse(_jspx_th_logic_notEqual_2);
          out.write("\r\n");
          out.write("\r\n");
          out.write("          ");
          out.write("\r\n");
          out.write("        ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_2 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_2.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_equal_2.setValue("true");
          _jspx_th_logic_equal_2.setName(Constants.SELECTION_FORM);
          _jspx_th_logic_equal_2.setProperty("showSearchTab");
          int _jspx_eval_logic_equal_2 = _jspx_th_logic_equal_2.doStartTag();
          if (_jspx_eval_logic_equal_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("          <tr id=\"fltr\" style=\"height: 400px;width=100%\">\r\n");
              out.write("        ");
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
          out.write("        ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_notEqual_3 = (org.apache.struts.taglib.logic.NotEqualTag) _jspx_tagPool_logic_notEqual_value_property_name.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_notEqual_3.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEqual_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEqual_3.setValue("true");
          _jspx_th_logic_notEqual_3.setName(Constants.SELECTION_FORM);
          _jspx_th_logic_notEqual_3.setProperty("showSearchTab");
          int _jspx_eval_logic_notEqual_3 = _jspx_th_logic_notEqual_3.doStartTag();
          if (_jspx_eval_logic_notEqual_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("          <tr id=\"fltr\" style=\"display: none;height: 400px;\">\r\n");
              out.write("        ");
              int evalDoAfterBody = _jspx_th_logic_notEqual_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEqual_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEqual_value_property_name.reuse(_jspx_th_logic_notEqual_3);
            return;
          }
          _jspx_tagPool_logic_notEqual_value_property_name.reuse(_jspx_th_logic_notEqual_3);
          out.write("\r\n");
          out.write("            <td colspan=3 class=\"tableHeader\" align=\"center\" valign=\"middle\">\r\n");
          out.write("\r\n");
          out.write("                <div style=\"position: absolute;\" id=\"filterdiv\">\r\n");
          out.write("                  ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "filters.jsp", out, true);
          out.write("\r\n");
          out.write("                </div>\r\n");
          out.write("\r\n");
          out.write("            </td>\r\n");
          out.write("          </tr>\r\n");
          out.write("\r\n");
          out.write("          ");
          out.write("\r\n");
          out.write("          <tr style=\"height: 3px;\">\r\n");
          out.write("            <td colspan=3 >\r\n");
          out.write("            </td>\r\n");
          out.write("          </tr>\r\n");
          out.write("        </table>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
          out.write("\r\n");
          out.write("        <table width=\"99%\" border=\"0\" cellpadding=\"5\" cellspacing=\"0\" align=\"center\">\r\n");
          out.write("          <tr>\r\n");
          out.write("            <td class=\"tableHeader\">\r\n");
          out.write("\r\n");
          out.write("              <table width=\"100%\" class=table cellpadding=\"0\" cellspacing=\"0\">\r\n");
          out.write("                <tr class=\"button-row\">\r\n");
          out.write("                    <td colspan=3 class=\"button-row\" style=\"background-color: #0066CC; color:#FFFFFF; border-bottom-width: 0px;\">\r\n");
          out.write("                      ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_3 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_3.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_equal_3.setValue("true");
          _jspx_th_logic_equal_3.setName(Constants.SELECTION_FORM);
          _jspx_th_logic_equal_3.setProperty("multiple");
          int _jspx_eval_logic_equal_3 = _jspx_th_logic_equal_3.doStartTag();
          if (_jspx_eval_logic_equal_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                        ");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_3.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_3);
              _jspx_th_bean_message_3.setKey("gs.records.selected.multiple");
              _jspx_th_bean_message_3.setBundle(Constants.MESSAGE_BUNDLE);
              int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
              if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
              out.write("\r\n");
              out.write("                      ");
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
          out.write("                      ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_notEqual_4 = (org.apache.struts.taglib.logic.NotEqualTag) _jspx_tagPool_logic_notEqual_value_property_name.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_notEqual_4.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEqual_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEqual_4.setValue("true");
          _jspx_th_logic_notEqual_4.setName(Constants.SELECTION_FORM);
          _jspx_th_logic_notEqual_4.setProperty("multiple");
          int _jspx_eval_logic_notEqual_4 = _jspx_th_logic_notEqual_4.doStartTag();
          if (_jspx_eval_logic_notEqual_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                        ");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_4.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEqual_4);
              _jspx_th_bean_message_4.setKey("gs.records.selected.single");
              _jspx_th_bean_message_4.setBundle(Constants.MESSAGE_BUNDLE);
              int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
              if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
              out.write("\r\n");
              out.write("                      ");
              int evalDoAfterBody = _jspx_th_logic_notEqual_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEqual_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEqual_value_property_name.reuse(_jspx_th_logic_notEqual_4);
            return;
          }
          _jspx_tagPool_logic_notEqual_value_property_name.reuse(_jspx_th_logic_notEqual_4);
          out.write("\r\n");
          out.write("                    </td>\r\n");
          out.write("                </tr>\r\n");
          out.write("              </table>\r\n");
          out.write("\r\n");
          out.write("              <div style=\"overflow: auto; height: 40px;\" class=\"table\">\r\n");
          out.write("                ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "selected.jsp", out, true);
          out.write("\r\n");
          out.write("              </div>\r\n");
          out.write("\r\n");
          out.write("            </td>\r\n");
          out.write("          </tr>\r\n");
          out.write("\r\n");
          out.write("          <tr>\r\n");
          out.write("            <td colspan=3 class=\"tableHeader\">\r\n");
          out.write("              <center>\r\n");
          out.write("                <input value=\"");
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_5.setKey("gs.button.ok");
          _jspx_th_bean_message_5.setBundle(Constants.MESSAGE_BUNDLE);
          int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
          if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
          out.write("\"\r\n");
          out.write("                       class=\"button\" type=\"button\" onclick=\"sendValues()\">\r\n");
          out.write("                &nbsp;&nbsp;\r\n");
          out.write("                <input value=\"");
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_6.setKey("gs.button.cancel");
          _jspx_th_bean_message_6.setBundle(Constants.MESSAGE_BUNDLE);
          int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
          if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
          out.write("\"\r\n");
          out.write("                       class=\"button\" type=\"button\" onclick=\"parent.closeFrame(myWindow)\">\r\n");
          out.write("              </center>\r\n");
          out.write("            </td>\r\n");
          out.write("          </tr>\r\n");
          out.write("\r\n");
          out.write("        </table>\r\n");
          out.write("\r\n");
          out.write("\t\t</td></tr>\r\n");
          out.write("\t</table>\r\n");
          out.write("\r\n");
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
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("  var myWindow = parent.selectionWindow;\r\n");
      out.write("//----------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("  function show_tab(vizibil, ascuns, tab) {\r\n");
      out.write("\r\n");
      out.write("      var visibleClass = \"tableHeader\";\r\n");
      out.write("      var hiddenClass = \"tableDesc\";\r\n");
      out.write("\r\n");
      out.write("      var tabVizibil = document.getElementById(vizibil);\r\n");
      out.write("      var tabAscuns = document.getElementById(ascuns);\r\n");
      out.write("      tabVizibil.style.display = \"\";\r\n");
      out.write("      tabAscuns.style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("      var tabs = document.getElementById(\"tabs_row\").getElementsByTagName('TD');\r\n");
      out.write("      for (i = 0; i < tabs.length - 1; i++) {\r\n");
      out.write("        if (tabs[i].tagName == 'TD') {\r\n");
      out.write("            tabs[i].className = hiddenClass;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      tab.className = visibleClass;\r\n");
      out.write("\r\n");
      out.write("\tvar myDiv = document.getElementById('filterdiv');\r\n");
      out.write("\tmyDiv.style.top = 24 + myDiv.parentNode.offsetTop + (myDiv.parentNode.offsetHeight - myDiv.offsetHeight) / 2;\r\n");
      out.write("//\tif (myDiv.parentNode.offsetHeight - myDiv.offsetHeight < 0) myDiv.style.top = 0;\r\n");
      out.write("\tmyDiv.style.left = 4 + myDiv.parentNode.offsetLeft + (myDiv.parentNode.offsetWidth - myDiv.offsetWidth) / 2;\r\n");
      out.write("//\tif (myDiv.parentNode.offsetWidth - myDiv.offsetWidth < 0) myDiv.style.left = 0;\r\n");
      out.write("  }\r\n");
      out.write("//----------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("  function set_children_bgColor(color, row) {\r\n");
      out.write("\r\n");
      out.write("    var cells = row.getElementsByTagName('TD');\r\n");
      out.write("      for (i = 0; i < cells.length; i++) {\r\n");
      out.write("        if (cells[i].tagName == 'TD') {\r\n");
      out.write("            cells[i].style.backgroundColor = color;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("  }\r\n");
      out.write("//----------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("  function addRowToSelection(row){\r\n");
      out.write("      var tmp = row.cloneNode(true);\r\n");
      out.write("      var pkvalue=row.pk;\r\n");
      out.write("      tmp.pk =pkvalue;\r\n");
      out.write("        for (var j = 0; j < columnProperties.length; j++) {\r\n");
      out.write("          eval('tmp.' + columnProperties[j] + '=row.' + columnProperties[j] + ';');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("      var dest_table = document.getElementById('sel_table');\r\n");
      out.write("\r\n");
      out.write("      tmp.onmouseover=function () {};\r\n");
      out.write("      tmp.onmouseout=function () {};\r\n");
      out.write("      tmp.onclick=function () {};\r\n");
      out.write("      tmp.style.cursor='';\r\n");
      out.write("      set_children_bgColor('', tmp);\r\n");
      out.write("      tmp.getElementsByTagName('TD').item(0).align='left';\r\n");
      out.write("\r\n");
      out.write("      var image = document.createElement('IMG');\r\n");
      out.write("      image.src='../resources/images/delete_selected.gif';\r\n");
      out.write("      image.height='9'; image.width='10';\r\n");
      out.write("      image.style.cursor='pointer';\r\n");
      out.write("      image.onclick=function () {removeItem(this);};\r\n");
      out.write("      var firstTD = tmp.getElementsByTagName('TD').item(0);\r\n");
      out.write("      //firstTD.innerHTML='';\r\n");
      out.write("      var n = firstTD.childNodes.length;\r\n");
      out.write("      for(i=0; i<n; i++) {\r\n");
      out.write("        firstTD.removeChild(firstTD.childNodes.item(i));\r\n");
      out.write("      }\r\n");
      out.write("      firstTD.appendChild(image);\r\n");
      out.write("\r\n");
      out.write("//      alert(tmp.childNodes.item(0));\r\n");
      out.write("//      alert(tmp.childNodes.item(1));\r\n");
      out.write("//      alert(tmp.childNodes.item(2));\r\n");
      out.write("//      alert(tmp.childNodes.item(3));\r\n");
      out.write("\r\n");
      out.write("//      tmp.getElementsByTagName('input').item(0).disabled=false;\r\n");
      out.write("      var tbody = dest_table.getElementsByTagName('TBODY').item(0);\r\n");
      out.write("\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_4 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_scope_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_4.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_4.setParent(null);
      _jspx_th_logic_equal_4.setValue("true");
      _jspx_th_logic_equal_4.setName(Constants.SELECTION_FORM);
      _jspx_th_logic_equal_4.setProperty("multiple");
      _jspx_th_logic_equal_4.setScope("session");
      int _jspx_eval_logic_equal_4 = _jspx_th_logic_equal_4.doStartTag();
      if (_jspx_eval_logic_equal_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("//      var valIdRow = tmp.getElementsByTagName('input').item(0).value;\r\n");
          out.write("      var valIdRow = pkvalue;\r\n");
          out.write("\r\n");
          out.write("      var found = false;\r\n");
          out.write("      for(i=0; i<tbody.getElementsByTagName('TR').length; i++){\r\n");
          out.write("        var curTr = tbody.getElementsByTagName('TR').item(i);\r\n");
          out.write("        var curInput = curTr.getElementsByTagName('input').item(0);\r\n");
          out.write("        if(curInput){\r\n");
          out.write("            var curId = curInput.value;\r\n");
          out.write("            if(curId == valIdRow)\r\n");
          out.write("                found = true;\r\n");
          out.write("        }\r\n");
          out.write("      }\r\n");
          out.write("\r\n");
          out.write("      if(!found){\r\n");
          out.write("          if (tbody.getElementsByTagName('TR').length > 0) {\r\n");
          out.write("            var firstTR = tbody.getElementsByTagName('TR').item(0);\r\n");
          out.write("            tbody.insertBefore(tmp, firstTR);\r\n");
          out.write("          } else {\r\n");
          out.write("            tbody.appendChild(tmp);\r\n");
          out.write("          }\r\n");
          out.write("      }\r\n");
          int evalDoAfterBody = _jspx_th_logic_equal_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_equal_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_equal_value_scope_property_name.reuse(_jspx_th_logic_equal_4);
        return;
      }
      _jspx_tagPool_logic_equal_value_scope_property_name.reuse(_jspx_th_logic_equal_4);
      out.write('\r');
      out.write('\n');
      //  logic:notEqual
      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_notEqual_5 = (org.apache.struts.taglib.logic.NotEqualTag) _jspx_tagPool_logic_notEqual_value_scope_property_name.get(org.apache.struts.taglib.logic.NotEqualTag.class);
      _jspx_th_logic_notEqual_5.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEqual_5.setParent(null);
      _jspx_th_logic_notEqual_5.setValue("true");
      _jspx_th_logic_notEqual_5.setName(Constants.SELECTION_FORM);
      _jspx_th_logic_notEqual_5.setProperty("multiple");
      _jspx_th_logic_notEqual_5.setScope("session");
      int _jspx_eval_logic_notEqual_5 = _jspx_th_logic_notEqual_5.doStartTag();
      if (_jspx_eval_logic_notEqual_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("      if (tbody.getElementsByTagName('TR').length > 0) {\r\n");
          out.write("        tbody.removeChild(tbody.getElementsByTagName('TR').item(0));\r\n");
          out.write("      }\r\n");
          out.write("      tbody.appendChild(tmp);\r\n");
          int evalDoAfterBody = _jspx_th_logic_notEqual_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_notEqual_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_notEqual_value_scope_property_name.reuse(_jspx_th_logic_notEqual_5);
        return;
      }
      _jspx_tagPool_logic_notEqual_value_scope_property_name.reuse(_jspx_th_logic_notEqual_5);
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("//----------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("  function removeItem(image) {\r\n");
      out.write("      var row = image.parentNode.parentNode;\r\n");
      out.write("      var tbody = row.parentNode;\r\n");
      out.write("\r\n");
      out.write("      tbody.removeChild(row);\r\n");
      out.write("  }\r\n");
      out.write("//----------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("  function setSort(colIdx) {\r\n");
      out.write("      var theForm = document.getElementById('theForm');\r\n");
      out.write("      if (theForm.sortColumn.value == colIdx) {\r\n");
      out.write("          if (\"false\" == theForm.sortAsc.value) {\r\n");
      out.write("              theForm.sortAsc.value = \"true\";\r\n");
      out.write("          } else {\r\n");
      out.write("              theForm.sortAsc.value = \"false\";\r\n");
      out.write("          }\r\n");
      out.write("      } else {\r\n");
      out.write("          theForm.sortAsc.value = \"true\";\r\n");
      out.write("      }\r\n");
      out.write("      theForm.sortColumn.value = colIdx;\r\n");
      out.write("      theForm.crtPage.value = 1;\r\n");
      out.write("      parent.selectionWindow=myWindow;\r\n");
      out.write("      theForm.submit();\r\n");
      out.write("}\r\n");
      out.write("//----------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("  function setPage(crtPage) {\r\n");
      out.write("      document.getElementById('theForm').crtPage.value = crtPage;\r\n");
      out.write("      parent.selectionWindow=myWindow;\r\n");
      out.write("      document.getElementById('theForm').submit();\r\n");
      out.write("      return;\r\n");
      out.write("}\r\n");
      out.write("//----------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("  function setNavigate(rpp, crtPage) {\r\n");
      out.write("      document.getElementById('theForm').rpp.value = rpp;\r\n");
      out.write("      document.getElementById('theForm').crtPage.value = crtPage;\r\n");
      out.write("      //document.getElementById('theForm').submit();\r\n");
      out.write("      return;\r\n");
      out.write("  }\r\n");
      out.write("//----------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("  function sendValues() {\r\n");
      out.write("\r\n");
      out.write("    //alert(\"sendValues\");\r\n");
      out.write("\r\n");
      out.write("    var selection = new Array();\r\n");
      out.write("    var rows = document.getElementById('sel_table').getElementsByTagName('TR');\r\n");
      out.write("\r\n");
      out.write("    for (var idx = 0; idx < rows.length ; idx++) {\r\n");
      out.write("//      alert(rows.item(idx));\r\n");
      out.write("//      if(rows.item(idx).getElementsByTagName('input').item(0)){\r\n");
      out.write("      if(rows.item(idx).pk){\r\n");
      out.write("\r\n");
      out.write("//        alert(idx);\r\n");
      out.write("        selection[idx] = new Hashtable();\r\n");
      out.write("        var cells = rows.item(idx).getElementsByTagName('td');\r\n");
      out.write("\r\n");
      out.write("        for (var j = 1; j < cells.length; j++) {\r\n");
      out.write("          selection[idx].put(cells.item(j).id, cells.item(j).firstChild.nodeValue);\r\n");
      out.write("        }\r\n");
      out.write("//        alert(selection[idx]);\r\n");
      out.write("\r\n");
      out.write("        for (var j = 0; j < columnProperties.length; j++) {\r\n");
      out.write("          selection[idx].put(columnProperties[j], eval('rows.item(idx).'+columnProperties[j]));\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //alert('after: '+selection[idx]);\r\n");
      out.write("\r\n");
      out.write("<!--        selection[idx].put(\"pk\", rows.item(idx).pk); -->\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("    //alert('selection = ' + selection);\r\n");
      out.write("    if(selection.length > 0){\r\n");
      out.write("      parent.");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_0.setParent(null);
      _jspx_th_bean_write_0.setName(Constants.SELECTION_FORM);
      _jspx_th_bean_write_0.setProperty("callbackFunction");
      _jspx_th_bean_write_0.setScope("session");
      int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
      if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_0);
        return;
      }
      _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_0);
      out.write("(selection);\r\n");
      out.write("    }else{\r\n");
      out.write("      parent.resetSelectionComponent('");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
      _jspx_th_bean_write_1.setParent(null);
      _jspx_th_bean_write_1.setName(Constants.SELECTION_FORM);
      _jspx_th_bean_write_1.setProperty("property");
      _jspx_th_bean_write_1.setScope("session");
      int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
      if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_1);
        return;
      }
      _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_1);
      out.write("');\r\n");
      out.write("    }\r\n");
      out.write("    parent.closeFrame(myWindow);\r\n");
      out.write("  }\r\n");
      out.write("//----------------------------------------------------------------------------------------------------------------------\r\n");
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

  private boolean _jspx_meth_sys_base_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sys:base
    org.apache.jsp.tag.web.jportal.sys.base_tag _jspx_th_sys_base_0 = new org.apache.jsp.tag.web.jportal.sys.base_tag();
    _jspx_th_sys_base_0.setJspContext(_jspx_page_context);
    _jspx_th_sys_base_0.setSuffix("selectionComponent/popup/selection.jsp");
    _jspx_th_sys_base_0.doTag();
    return false;
  }
}
