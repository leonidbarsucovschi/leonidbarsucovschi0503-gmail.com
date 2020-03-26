package org.apache.jsp.selectionComponent.autoload;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Hashtable;
import ro.uti.waf.components.selectionComponent.util.Constants;
import ro.uti.waf.components.selectionComponent.autoload.LoadDetailsForm;

public final class loadDetailsResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/jportal/sys/sys.tld");
    _jspx_dependants.add("/WEB-INF/tags/jportal/sys/base.tag");
    _jspx_dependants.add("/WEB-INF/tld/jstl1.1/c.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_onsubmit_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notPresent_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_scope_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_rewrite_action_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_logic_present_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_onsubmit_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notPresent_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_scope_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_rewrite_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_logic_present_name.release();
    _jspx_tagPool_html_form_styleId_onsubmit_action.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_logic_notPresent_name.release();
    _jspx_tagPool_bean_write_scope_property_name_nobody.release();
    _jspx_tagPool_logic_iterate_name_id.release();
    _jspx_tagPool_bean_write_name_nobody.release();
    _jspx_tagPool_html_rewrite_action_nobody.release();
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    <META http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-2\">\r\n");
      out.write("         ");
      if (_jspx_meth_sys_base_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<script src=\"../script/hashtable.js\" ></script>\r\n");
      out.write("<script src=\"../script/jportal.js\" ></script>\r\n");
      out.write("<script src=\"../script/selectioncomponent.js\" ></script>\r\n");
      out.write("\r\n");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_0 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_0.setParent(null);
      _jspx_th_logic_present_0.setName(Constants.LOAD_DETAILS_KEY);
      int _jspx_eval_logic_present_0 = _jspx_th_logic_present_0.doStartTag();
      if (_jspx_eval_logic_present_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_onsubmit_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_0.setPageContext(_jspx_page_context);
          _jspx_th_html_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_0);
          _jspx_th_html_form_0.setStyleId("innerForm");
          _jspx_th_html_form_0.setAction("loadDetails");
          _jspx_th_html_form_0.setOnsubmit("alert('submit inner form')");
          int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
          if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_hidden_1(_jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_hidden_2(_jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_hidden_3(_jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_hidden_4(_jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_hidden_5(_jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_hidden_6(_jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_7 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_7.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
              _jspx_th_html_hidden_7.setProperty("actionType");
              _jspx_th_html_hidden_7.setValue(ro.uti.waf.components.selectionComponent.util.Commands.LOADDETAILS+"");
              int _jspx_eval_html_hidden_7 = _jspx_th_html_hidden_7.doStartTag();
              if (_jspx_th_html_hidden_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_7);
                return;
              }
              _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_7);
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_hidden_8(_jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_hidden_9(_jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    <div id=\"parametersDiv\"></div>\r\n");
              out.write("\r\n");
              int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_form_styleId_onsubmit_action.reuse(_jspx_th_html_form_0);
            return;
          }
          _jspx_tagPool_html_form_styleId_onsubmit_action.reuse(_jspx_th_html_form_0);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("</body>\r\n");
          out.write("<script >\r\n");
          out.write("\r\n");
          //  logic:notPresent
          org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_notPresent_0 = (org.apache.struts.taglib.logic.NotPresentTag) _jspx_tagPool_logic_notPresent_name.get(org.apache.struts.taglib.logic.NotPresentTag.class);
          _jspx_th_logic_notPresent_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_notPresent_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_0);
          _jspx_th_logic_notPresent_0.setName(Constants.LOAD_DETAILS_KEY_LIST);
          int _jspx_eval_logic_notPresent_0 = _jspx_th_logic_notPresent_0.doStartTag();
          if (_jspx_eval_logic_notPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\tfunction setDetailsParent(){\r\n");
              out.write("\t\tparent.document.getElementById('");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_0.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_0.setScope("request");
              _jspx_th_bean_write_0.setProperty("propertyName");
              int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
              if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_0);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_0);
              out.write("').value='");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_1.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_1.setScope("request");
              _jspx_th_bean_write_1.setProperty("idTableValue");
              int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
              if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_1);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_1);
              out.write("';\r\n");
              out.write("\t\tparent.document.getElementById('");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_2.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_2.setScope("request");
              _jspx_th_bean_write_2.setProperty("displayName");
              int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
              if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_2);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_2);
              out.write("').value='");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_3.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_3.setScope("request");
              _jspx_th_bean_write_3.setProperty("idTableValue");
              int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
              if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_3);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_3);
              out.write("';\r\n");
              out.write("\r\n");
              out.write("                var textComp = parent.document.getElementById('");
              out.print(ro.uti.waf.components.selectionComponent.taglib.selectionComponent.Constants.TEXT);
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_4.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_4.setScope("request");
              _jspx_th_bean_write_4.setProperty("displayName");
              int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
              if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_4);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_4);
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_5 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_5.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_5.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_5.setScope("request");
              _jspx_th_bean_write_5.setProperty("knownFieldName");
              int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
              if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_5);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_5);
              out.write("');\r\n");
              out.write("                if(textComp){\r\n");
              out.write("                  textComp.value='");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_6 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_6.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_6.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_6.setScope("request");
              _jspx_th_bean_write_6.setProperty("knownFieldValue");
              int _jspx_eval_bean_write_6 = _jspx_th_bean_write_6.doStartTag();
              if (_jspx_th_bean_write_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_6);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_6);
              out.write("';\r\n");
              out.write("                }\r\n");
              out.write("\r\n");
              out.write("        ");
String details = ((LoadDetailsForm)request.getAttribute(Constants.LOAD_DETAILS_KEY)).getDetailsFieldValue();
            if(details.trim().length()==0)
                details = "&nbsp;";

        
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\tparent.document.getElementById('");
              out.print(ro.uti.waf.components.selectionComponent.taglib.selectionComponent.Constants.DIV);
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_7 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_7.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_7.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_7.setScope("request");
              _jspx_th_bean_write_7.setProperty("displayName");
              int _jspx_eval_bean_write_7 = _jspx_th_bean_write_7.doStartTag();
              if (_jspx_th_bean_write_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_7);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_7);
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_8 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_8.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_8.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_8.setScope("request");
              _jspx_th_bean_write_8.setProperty("detailsFieldName");
              int _jspx_eval_bean_write_8 = _jspx_th_bean_write_8.doStartTag();
              if (_jspx_th_bean_write_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_8);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_8);
              out.write("').innerHTML=truncate('");
              out.print(details);
              out.write('\'');
              out.write(',');
              out.write(' ');
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_9 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_9.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_9.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_9.setScope("request");
              _jspx_th_bean_write_9.setProperty("maxlengthDetails");
              int _jspx_eval_bean_write_9 = _jspx_th_bean_write_9.doStartTag();
              if (_jspx_th_bean_write_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_9);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_9);
              out.write(");\r\n");
              out.write("\t\tparent.document.getElementById('");
              out.print(ro.uti.waf.components.selectionComponent.taglib.selectionComponent.Constants.DETAILS_HIDDEN);
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_10 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_10.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_10.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_10.setScope("request");
              _jspx_th_bean_write_10.setProperty("displayName");
              int _jspx_eval_bean_write_10 = _jspx_th_bean_write_10.doStartTag();
              if (_jspx_th_bean_write_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_10);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_10);
              out.write("').value='");
              out.print(details);
              out.write("';\r\n");
              out.write("\r\n");
              out.write("        parent.");
              out.print(ro.uti.waf.components.selectionComponent.taglib.selectionComponent.Constants.ON_CHANGE_FUNCTION);
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_11 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_11.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
              _jspx_th_bean_write_11.setName(Constants.LOAD_DETAILS_KEY);
              _jspx_th_bean_write_11.setScope("request");
              _jspx_th_bean_write_11.setProperty("displayName");
              int _jspx_eval_bean_write_11 = _jspx_th_bean_write_11.doStartTag();
              if (_jspx_th_bean_write_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_11);
                return;
              }
              _jspx_tagPool_bean_write_scope_property_name_nobody.reuse(_jspx_th_bean_write_11);
              out.write("();\r\n");
              out.write("\r\n");
              out.write("\t}\r\n");
              out.write("    setDetailsParent();\r\n");
              int evalDoAfterBody = _jspx_th_logic_notPresent_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notPresent_name.reuse(_jspx_th_logic_notPresent_0);
            return;
          }
          _jspx_tagPool_logic_notPresent_name.reuse(_jspx_th_logic_notPresent_0);
          out.write("\r\n");
          out.write("\r\n");
          //  logic:present
          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_1 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
          _jspx_th_logic_present_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_present_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_0);
          _jspx_th_logic_present_1.setName(Constants.LOAD_DETAILS_KEY_LIST);
          int _jspx_eval_logic_present_1 = _jspx_th_logic_present_1.doStartTag();
          if (_jspx_eval_logic_present_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\tfunction setAutoCompleteValues(){\r\n");
              out.write("        var autoComplArray = new Array();\r\n");
              out.write("\r\n");
              out.write("        ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
              _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_1);
              _jspx_th_logic_iterate_0.setId("value");
              _jspx_th_logic_iterate_0.setName(Constants.LOAD_DETAILS_KEY_LIST);
              int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
              if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object value = null;
                if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_iterate_0.doInitBody();
                }
                value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                do {
                  out.write("\r\n");
                  out.write("            autoComplArray[autoComplArray.length] = '");
                  if (_jspx_meth_bean_write_12(_jspx_th_logic_iterate_0, _jspx_page_context))
                    return;
                  out.write("';\r\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
                  value = (java.lang.Object) _jspx_page_context.findAttribute("value");
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
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\teval('parent.setAutoCompleteValues'+document.innerForm.propertyName.value+'(autoComplArray);');\r\n");
              out.write("\t}\r\n");
              out.write("    setAutoCompleteValues();\r\n");
              int evalDoAfterBody = _jspx_th_logic_present_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_present_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_1);
            return;
          }
          _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_1);
          out.write("\r\n");
          out.write("\r\n");
          out.write("</script>\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_logic_present_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_0);
        return;
      }
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_0);
      out.write("\r\n");
      out.write("\r\n");
      //  logic:notPresent
      org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_notPresent_1 = (org.apache.struts.taglib.logic.NotPresentTag) _jspx_tagPool_logic_notPresent_name.get(org.apache.struts.taglib.logic.NotPresentTag.class);
      _jspx_th_logic_notPresent_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_notPresent_1.setParent(null);
      _jspx_th_logic_notPresent_1.setName(Constants.LOAD_DETAILS_KEY);
      int _jspx_eval_logic_notPresent_1 = _jspx_th_logic_notPresent_1.doStartTag();
      if (_jspx_eval_logic_notPresent_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<form name=\"innerForm\" action=\"");
          if (_jspx_meth_html_rewrite_0(_jspx_th_logic_notPresent_1, _jspx_page_context))
            return;
          out.write("\"  method=\"POST\">\r\n");
          out.write("    <input type=\"hidden\" name=\"idTableValue\"/>\r\n");
          out.write("    <input type=\"hidden\" name=\"idTableName\"/>\r\n");
          out.write("    <input type=\"hidden\" name=\"knownFieldName\"/>\r\n");
          out.write("    <input type=\"hidden\" name=\"knownFieldValue\"/>\r\n");
          out.write("    <input type=\"hidden\" name=\"detailsFieldName\"/>\r\n");
          out.write("    <input type=\"hidden\" name=\"propertyName\"/>\r\n");
          out.write("    <input type=\"hidden\" name=\"displayName\"/>\r\n");
          out.write("    <input type=\"hidden\" name=\"actionType\" value='");
          out.print(ro.uti.waf.components.selectionComponent.util.Commands.LOADDETAILS+"");
          out.write("'/>\r\n");
          out.write("    <input type=\"hidden\" name=\"searchCaseId\"/>\r\n");
          out.write("    <input type=\"hidden\" name=\"maxlengthDetails\"/>\r\n");
          out.write("    <div id=\"parametersDiv\"></div>\r\n");
          out.write("</form>\r\n");
          out.write("\r\n");
          out.write("</body>\r\n");
          out.write("\r\n");
          out.write("<script >\r\n");
          out.write("\r\n");
          out.write("function listparameters(forma){\r\n");
          out.write("  for(var i=0; i<forma.elements.length; i++){\r\n");
          out.write("    alert(forma.elements[i].name +\" = \"+forma.elements[i].value);\r\n");
          out.write("  }\r\n");
          out.write("}\r\n");
          out.write("\r\n");
          out.write("\r\n");
          //  logic:present
          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_2 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
          _jspx_th_logic_present_2.setPageContext(_jspx_page_context);
          _jspx_th_logic_present_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_1);
          _jspx_th_logic_present_2.setName(Constants.LOAD_DETAILS_KEY_LIST);
          int _jspx_eval_logic_present_2 = _jspx_th_logic_present_2.doStartTag();
          if (_jspx_eval_logic_present_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\tfunction setAutoCompleteValues(){\r\n");
              out.write("        var autoComplArray = new Array();\r\n");
              out.write("\r\n");
              out.write("        ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
              _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_2);
              _jspx_th_logic_iterate_1.setId("value");
              _jspx_th_logic_iterate_1.setName(Constants.LOAD_DETAILS_KEY_LIST);
              int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
              if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object value = null;
                if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_iterate_1.doInitBody();
                }
                value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                do {
                  out.write("\r\n");
                  out.write("            autoComplArray[autoComplArray.length] = '");
                  if (_jspx_meth_bean_write_13(_jspx_th_logic_iterate_1, _jspx_page_context))
                    return;
                  out.write("';\r\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
                  value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_1);
                return;
              }
              _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_1);
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\teval('parent.setAutoCompleteValues'+document.innerForm.propertyName.value+'(autoComplArray);');\r\n");
              out.write("\t}\r\n");
              out.write("    setAutoCompleteValues();\r\n");
              int evalDoAfterBody = _jspx_th_logic_present_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_present_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_2);
            return;
          }
          _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_2);
          out.write("\r\n");
          out.write("\r\n");
          out.write("</script>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_logic_notPresent_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_notPresent_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_notPresent_name.reuse(_jspx_th_logic_notPresent_1);
        return;
      }
      _jspx_tagPool_logic_notPresent_name.reuse(_jspx_th_logic_notPresent_1);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
    _jspx_th_sys_base_0.doTag();
    return false;
  }

  private boolean _jspx_meth_html_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_0.setProperty("idTableName");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_0);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_0);
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
    _jspx_th_html_hidden_1.setProperty("idTableValue");
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
    _jspx_th_html_hidden_2.setProperty("knownFieldName");
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
    _jspx_th_html_hidden_3.setProperty("knownFieldValue");
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
    _jspx_th_html_hidden_4.setProperty("detailsFieldName");
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
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_5 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_5.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_5.setProperty("propertyName");
    int _jspx_eval_html_hidden_5 = _jspx_th_html_hidden_5.doStartTag();
    if (_jspx_th_html_hidden_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_5);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_5);
    return false;
  }

  private boolean _jspx_meth_html_hidden_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_6 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_6.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_6.setProperty("displayName");
    int _jspx_eval_html_hidden_6 = _jspx_th_html_hidden_6.doStartTag();
    if (_jspx_th_html_hidden_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_6);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_6);
    return false;
  }

  private boolean _jspx_meth_html_hidden_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_8 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_8.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_8.setProperty("searchCaseId");
    int _jspx_eval_html_hidden_8 = _jspx_th_html_hidden_8.doStartTag();
    if (_jspx_th_html_hidden_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_8);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_8);
    return false;
  }

  private boolean _jspx_meth_html_hidden_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_9 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_9.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_9.setProperty("maxlengthDetails");
    int _jspx_eval_html_hidden_9 = _jspx_th_html_hidden_9.doStartTag();
    if (_jspx_th_html_hidden_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_9);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_9);
    return false;
  }

  private boolean _jspx_meth_bean_write_12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_12 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_12.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_12.setName("value");
    int _jspx_eval_bean_write_12 = _jspx_th_bean_write_12.doStartTag();
    if (_jspx_th_bean_write_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_12);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_12);
    return false;
  }

  private boolean _jspx_meth_html_rewrite_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notPresent_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_rewrite_0 = (org.apache.struts.taglib.html.RewriteTag) _jspx_tagPool_html_rewrite_action_nobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_rewrite_0.setPageContext(_jspx_page_context);
    _jspx_th_html_rewrite_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_1);
    _jspx_th_html_rewrite_0.setAction("/selectionComponent/loadDetails");
    int _jspx_eval_html_rewrite_0 = _jspx_th_html_rewrite_0.doStartTag();
    if (_jspx_th_html_rewrite_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_rewrite_action_nobody.reuse(_jspx_th_html_rewrite_0);
      return true;
    }
    _jspx_tagPool_html_rewrite_action_nobody.reuse(_jspx_th_html_rewrite_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_13 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_13.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_13.setName("value");
    int _jspx_eval_bean_write_13 = _jspx_th_bean_write_13.doStartTag();
    if (_jspx_th_bean_write_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_13);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_13);
    return false;
  }
}
