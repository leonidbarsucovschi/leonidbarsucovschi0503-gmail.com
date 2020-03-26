package org.apache.jsp.selectionComponent.popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.Set;
import ro.uti.waf.components.selectionComponent.selectionPopup.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.ejb.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.type.*;
import ro.uti.waf.components.selectionComponent.selectionPopup.web.*;
import org.apache.struts.Globals;

public final class filters_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_property_name_indexId_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_property_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEqual_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleId_styleClass_style_property_onchange_disabled;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_property_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_size_property_maxlength_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_radio_value_styleId_styleClass_property_disabled;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleId_styleClass_size_property_multiple_disabled;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_type_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_type_property_name_indexId_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors_property_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEqual_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleId_styleClass_style_property_onchange_disabled = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_type_property_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_size_property_maxlength_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_radio_value_styleId_styleClass_property_disabled = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleId_styleClass_size_property_multiple_disabled = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_bean_define_type_property_name_id_nobody.release();
    _jspx_tagPool_logic_iterate_type_property_name_indexId_id.release();
    _jspx_tagPool_logic_messagesPresent_property.release();
    _jspx_tagPool_html_errors_property_bundle_nobody.release();
    _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody.release();
    _jspx_tagPool_logic_notEqual_value_property_name.release();
    _jspx_tagPool_html_select_styleId_styleClass_style_property_onchange_disabled.release();
    _jspx_tagPool_logic_iterate_type_property_name_id.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_html_text_styleId_styleClass_size_property_maxlength_disabled_nobody.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.release();
    _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.release();
    _jspx_tagPool_html_radio_value_styleId_styleClass_property_disabled.release();
    _jspx_tagPool_html_select_styleId_styleClass_size_property_multiple_disabled.release();
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.release();
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

    java.lang.String _jspx_operator_1 = null;

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

    try {

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Tabela filtre -->\r\n");
      out.write("<table border=\"1\" bordercolor=\"white\" cellspacing=\"0\" cellpadding=\"2\" width=\"80%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"button-row\" style=\"background-color: #0066CC; color:#FFFFFF; border-bottom-width: 0px;\" colspan=\"4\">\r\n");
      out.write("     &nbsp;");
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_0.setParent(null);
      _jspx_th_bean_message_0.setBundle(Constants.MESSAGE_BUNDLE);
      _jspx_th_bean_message_0.setKey("gs.filters.title");
      int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
      if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_0.setParent(null);
      _jspx_th_bean_define_0.setId("selectionCase");
      _jspx_th_bean_define_0.setName(Constants.SELECTION_PARAMS);
      _jspx_th_bean_define_0.setProperty("selectionCase");
      _jspx_th_bean_define_0.setType("SelectionCase");
      int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
      if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
        return;
      }
      _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
      SelectionCase selectionCase = null;
      selectionCase = (SelectionCase) _jspx_page_context.findAttribute("selectionCase");
      out.write("\r\n");
      out.write("\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_property_name_indexId_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setId("searchColumnData");
      _jspx_th_logic_iterate_0.setName(Constants.SELECTION_FORM);
      _jspx_th_logic_iterate_0.setProperty("searchColumns");
      _jspx_th_logic_iterate_0.setIndexId("idx");
      _jspx_th_logic_iterate_0.setType("SearchColumnData");
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        SearchColumnData searchColumnData = null;
        java.lang.Integer idx = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        searchColumnData = (SearchColumnData) _jspx_page_context.findAttribute("searchColumnData");
        idx = (java.lang.Integer) _jspx_page_context.findAttribute("idx");
        do {
          out.write("\r\n");
          out.write("\r\n");

    String idxProp = "searchColumnData[" + idx +"]";
    String id = "filter" + idx;
    boolean disabled = !searchColumnData.isSelected();
    String visibility1 = searchColumnData.getOperator().endsWith(SearchColumn.op_is_null) ? "hidden" : "visible";
    String visibility2 = searchColumnData.getOperator().endsWith(SearchColumn.op_between) ? "visible" : "hidden";

          out.write('\r');
          out.write('\n');
          //  logic:messagesPresent
          org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
          _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_messagesPresent_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_messagesPresent_0.setProperty(idxProp);
          int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
          if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td valign=\"middle\" nowrap=\"nowrap\" colspan=\"4\" class=\"errormsg\" align=\"left\">\r\n");
              out.write("      ");
              //  html:errors
              org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_bundle_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
              _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
              _jspx_th_html_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
              _jspx_th_html_errors_0.setProperty(idxProp);
              _jspx_th_html_errors_0.setBundle(Constants.MESSAGE_BUNDLE);
              int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
              if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_errors_property_bundle_nobody.reuse(_jspx_th_html_errors_0);
                return;
              }
              _jspx_tagPool_html_errors_property_bundle_nobody.reuse(_jspx_th_html_errors_0);
              out.write('\r');
              out.write('\n');
              out.write("\r\n");
              out.write("    </td>\r\n");
              out.write("  </tr>\r\n");
              int evalDoAfterBody = _jspx_th_logic_messagesPresent_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_messagesPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_messagesPresent_property.reuse(_jspx_th_logic_messagesPresent_0);
            return;
          }
          _jspx_tagPool_logic_messagesPresent_property.reuse(_jspx_th_logic_messagesPresent_0);
          out.write("\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td class=\"button-row\" style=\"border-bottom-width: 0px; background-color:#E1DBD1\">\r\n");
          out.write("      ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_0 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_checkbox_0.setPageContext(_jspx_page_context);
          _jspx_th_html_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_html_checkbox_0.setProperty(idxProp+".selected");
          _jspx_th_html_checkbox_0.setStyleId(String.valueOf(idx));
          _jspx_th_html_checkbox_0.setOnclick((searchColumnData.getSearchColumn().isMandatory() ? "return false;" : "filterCheck(this);"));
          int _jspx_eval_html_checkbox_0 = _jspx_th_html_checkbox_0.doStartTag();
          if (_jspx_th_html_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody.reuse(_jspx_th_html_checkbox_0);
            return;
          }
          _jspx_tagPool_html_checkbox_styleId_property_onclick_nobody.reuse(_jspx_th_html_checkbox_0);
          out.write("\r\n");
          out.write("    </td>\r\n");
          out.write("    <td nowrap class=\"button-row\" style=\"border-bottom-width: 0px; background-color:#E1DBD1\">\r\n");
          out.write("       &nbsp;\r\n");
          out.write("\r\n");
          out.write("       ");
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_bean_message_1.setBundle(selectionCase.getBundle());
          _jspx_th_bean_message_1.setKey(searchColumnData.getSearchColumn().getLabel());
          int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
          if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
          out.write("\r\n");
          out.write("       &nbsp;\r\n");
          out.write("    </td>\r\n");
          out.write("    <td align=\"left\" nowrap class=\"button-row\" style=\"border-bottom-width: 0px; background-color:#E1DBD1\">\r\n");
          out.write("      ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_notEqual_0 = (org.apache.struts.taglib.logic.NotEqualTag) _jspx_tagPool_logic_notEqual_value_property_name.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_notEqual_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEqual_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_notEqual_0.setName("searchColumnData");
          _jspx_th_logic_notEqual_0.setProperty("searchColumn.type.name");
          _jspx_th_logic_notEqual_0.setValue(BaseType.BOOLEAN.getName());
          int _jspx_eval_logic_notEqual_0 = _jspx_th_logic_notEqual_0.doStartTag();
          if (_jspx_eval_logic_notEqual_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("      ");
String onChangeString = "operationChanged(this,'tbl_"+idx.toString()+"')";
              out.write("\r\n");
              out.write("        ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleId_styleClass_style_property_onchange_disabled.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_select_0.setPageContext(_jspx_page_context);
              _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEqual_0);
              _jspx_th_html_select_0.setProperty(idxProp+".operator");
              _jspx_th_html_select_0.setStyleId(id);
              _jspx_th_html_select_0.setStyleClass("text");
              _jspx_th_html_select_0.setStyle("width:75");
              _jspx_th_html_select_0.setOnchange(onChangeString);
              _jspx_th_html_select_0.setDisabled(disabled);
              int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
              if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_select_0.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("          ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
                  _jspx_th_logic_iterate_1.setId("operator");
                  _jspx_th_logic_iterate_1.setName("searchColumnData");
                  _jspx_th_logic_iterate_1.setProperty("searchColumn.operators");
                  _jspx_th_logic_iterate_1.setType("java.lang.String");
                  int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
                  if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.String operator = null;
                    if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_iterate_1.doInitBody();
                    }
                    operator = (java.lang.String) _jspx_page_context.findAttribute("operator");
                    do {
                      out.write("\r\n");
                      out.write("                ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_0 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_option_0.setPageContext(_jspx_page_context);
                      _jspx_th_html_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
                      _jspx_th_html_option_0.setValue(operator);
                      int _jspx_eval_html_option_0 = _jspx_th_html_option_0.doStartTag();
                      if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_option_0.doInitBody();
                        }
                        do {
                          out.write('\r');
                          out.write('\n');
                          out.write("\r\n");
                          out.write("                   ");
                          //  bean:message
                          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
                          _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
                          _jspx_th_bean_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_option_0);
                          _jspx_th_bean_message_2.setBundle(Constants.MESSAGES_KEY);
                          _jspx_th_bean_message_2.setKey("gs.filter.operator."+operator);
                          int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
                          if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
                            return;
                          }
                          _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
                          out.write("  \r\n");
                          out.write("                 ");
                          int evalDoAfterBody = _jspx_th_html_option_0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_0);
                        return;
                      }
                      _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_0);
                      out.write("\r\n");
                      out.write("          ");
                      int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
                      operator = (java.lang.String) _jspx_page_context.findAttribute("operator");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_iterate_type_property_name_id.reuse(_jspx_th_logic_iterate_1);
                    return;
                  }
                  _jspx_tagPool_logic_iterate_type_property_name_id.reuse(_jspx_th_logic_iterate_1);
                  out.write("\r\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_select_styleId_styleClass_style_property_onchange_disabled.reuse(_jspx_th_html_select_0);
                return;
              }
              _jspx_tagPool_html_select_styleId_styleClass_style_property_onchange_disabled.reuse(_jspx_th_html_select_0);
              out.write("\r\n");
              out.write("      ");
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
          out.write("      ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_equal_0.setName("searchColumnData");
          _jspx_th_logic_equal_0.setProperty("searchColumn.type.name");
          _jspx_th_logic_equal_0.setValue(BaseType.BOOLEAN.getName());
          int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
          if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("        &nbsp;\r\n");
              out.write("      ");
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
          out.write("    </td>\r\n");
          out.write("    <td align=\"left\" nowrap class=\"button-row\" style=\"border-bottom-width: 0px; background-color:#E1DBD1\">\r\n");
          out.write("       <table id=\"tbl_");
          out.print(idx.toString());
          out.write("\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
          out.write("        <tr>\r\n");
          out.write("         <td style=\"visibility: ");
          out.print(visibility1);
          out.write(";\">\r\n");
          out.write("          &nbsp;\r\n");
          out.write("\r\n");
  // FILTRE AVAND UN TIP DE BAZA
    if (searchColumnData.getSearchColumn().getType().isBaseType()) {

          out.write("\r\n");
          out.write("\r\n");
          out.write("  ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_equal_1.setName("searchColumnData");
          _jspx_th_logic_equal_1.setProperty("searchColumn.type.name");
          _jspx_th_logic_equal_1.setValue(BaseType.STRING.getName());
          int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
          if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("          ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_property_maxlength_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_text_0.setPageContext(_jspx_page_context);
              _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
              _jspx_th_html_text_0.setProperty(idxProp+".val1");
              _jspx_th_html_text_0.setStyleId(id);
              _jspx_th_html_text_0.setSize("30");
              _jspx_th_html_text_0.setMaxlength("100");
              _jspx_th_html_text_0.setStyleClass("inputtext");
              _jspx_th_html_text_0.setDisabled(disabled);
              int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
              if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_text_styleId_styleClass_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_0);
                return;
              }
              _jspx_tagPool_html_text_styleId_styleClass_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_0);
              out.write("\r\n");
              out.write("         </td>\r\n");
              out.write("         <td style=\"visibility: ");
              out.print(visibility2);
              out.write(";\">\r\n");
              out.write("          ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
              _jspx_th_html_hidden_0.setProperty(idxProp+".val2");
              _jspx_th_html_hidden_0.setValue("");
              int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
              if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
                return;
              }
              _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
              out.write("\r\n");
              out.write("  ");
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
          out.write("  ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_2 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_2.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_equal_2.setName("searchColumnData");
          _jspx_th_logic_equal_2.setProperty("searchColumn.type.name");
          _jspx_th_logic_equal_2.setValue(BaseType.INTEGER.getName());
          int _jspx_eval_logic_equal_2 = _jspx_th_logic_equal_2.doStartTag();
          if (_jspx_eval_logic_equal_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("          ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_text_1.setPageContext(_jspx_page_context);
              _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_2);
              _jspx_th_html_text_1.setProperty(idxProp+".val1");
              _jspx_th_html_text_1.setStyleId(id);
              _jspx_th_html_text_1.setSize("10");
              _jspx_th_html_text_1.setMaxlength("100");
              _jspx_th_html_text_1.setStyleClass("inputtext");
              _jspx_th_html_text_1.setDisabled(disabled);
              _jspx_th_html_text_1.setStyle("text-align:right;");
              int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
              if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_1);
                return;
              }
              _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_1);
              out.write("\r\n");
              out.write("         </td>\r\n");
              out.write("         <td style=\"visibility: ");
              out.print(visibility2);
              out.write(";\">\r\n");
              out.write("          &nbsp;");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_3.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_2);
              _jspx_th_bean_message_3.setBundle(Constants.MESSAGE_BUNDLE);
              _jspx_th_bean_message_3.setKey("gs.filter.and");
              int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
              if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
              out.write("&nbsp;\r\n");
              out.write("          ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_text_2.setPageContext(_jspx_page_context);
              _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_2);
              _jspx_th_html_text_2.setProperty(idxProp+".val2");
              _jspx_th_html_text_2.setStyleId(id);
              _jspx_th_html_text_2.setSize("10");
              _jspx_th_html_text_2.setMaxlength("100");
              _jspx_th_html_text_2.setStyleClass("inputtext");
              _jspx_th_html_text_2.setDisabled(disabled);
              _jspx_th_html_text_2.setStyle("text-align:right;");
              int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
              if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_2);
                return;
              }
              _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_2);
              out.write("\r\n");
              out.write("  ");
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
          out.write("\r\n");
          out.write("  ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_3 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_3.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_equal_3.setName("searchColumnData");
          _jspx_th_logic_equal_3.setProperty("searchColumn.type.name");
          _jspx_th_logic_equal_3.setValue(BaseType.NUMBER.getName());
          int _jspx_eval_logic_equal_3 = _jspx_th_logic_equal_3.doStartTag();
          if (_jspx_eval_logic_equal_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("          ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_text_3.setPageContext(_jspx_page_context);
              _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_3);
              _jspx_th_html_text_3.setProperty(idxProp+".val1");
              _jspx_th_html_text_3.setStyleId(id);
              _jspx_th_html_text_3.setSize("10");
              _jspx_th_html_text_3.setMaxlength("100");
              _jspx_th_html_text_3.setStyleClass("inputtext");
              _jspx_th_html_text_3.setDisabled(disabled);
              _jspx_th_html_text_3.setStyle("text-align:right;");
              int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
              if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_3);
                return;
              }
              _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_3);
              out.write("\r\n");
              out.write("         </td>\r\n");
              out.write("         <td style=\"visibility: ");
              out.print(visibility2);
              out.write(";\">\r\n");
              out.write("          &nbsp;");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_4.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_3);
              _jspx_th_bean_message_4.setBundle(Constants.MESSAGE_BUNDLE);
              _jspx_th_bean_message_4.setKey("gs.filter.and");
              int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
              if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
              out.write("&nbsp;\r\n");
              out.write("          ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_text_4.setPageContext(_jspx_page_context);
              _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_3);
              _jspx_th_html_text_4.setProperty(idxProp+".val2");
              _jspx_th_html_text_4.setStyleId(id);
              _jspx_th_html_text_4.setSize("10");
              _jspx_th_html_text_4.setMaxlength("100");
              _jspx_th_html_text_4.setStyleClass("inputtext");
              _jspx_th_html_text_4.setDisabled(disabled);
              _jspx_th_html_text_4.setStyle("text-align:right;");
              int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
              if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_4);
                return;
              }
              _jspx_tagPool_html_text_styleId_styleClass_style_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_4);
              out.write("\r\n");
              out.write("  ");
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
          out.write("\r\n");
          out.write("  ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_4 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_4.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_equal_4.setName("searchColumnData");
          _jspx_th_logic_equal_4.setProperty("searchColumn.type.name");
          _jspx_th_logic_equal_4.setValue(BaseType.DATE.getName());
          int _jspx_eval_logic_equal_4 = _jspx_th_logic_equal_4.doStartTag();
          if (_jspx_eval_logic_equal_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write(" <script type=\"text/javascript\">\r\n");
              out.write("    shortDateFormat = \"");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_4);
              _jspx_th_bean_message_5.setBundle(Constants.MESSAGE_BUNDLE);
              _jspx_th_bean_message_5.setKey("format.date.short");
              int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
              if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
              out.write("\";\r\n");
              out.write(" </script>\r\n");
              out.write("\r\n");
              out.write("          ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_5 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_text_5.setPageContext(_jspx_page_context);
              _jspx_th_html_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_4);
              _jspx_th_html_text_5.setStyleClass("inputtext");
              _jspx_th_html_text_5.setProperty(idxProp+".val1");
              _jspx_th_html_text_5.setStyleId(id);
              _jspx_th_html_text_5.setDisabled(disabled);
              _jspx_th_html_text_5.setReadonly(false);
              _jspx_th_html_text_5.setSize("10");
              int _jspx_eval_html_text_5 = _jspx_th_html_text_5.doStartTag();
              if (_jspx_th_html_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.reuse(_jspx_th_html_text_5);
                return;
              }
              _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.reuse(_jspx_th_html_text_5);
              out.write("\r\n");
              out.write("          <img type=\"image\" src=\"../resources/images/cal.gif\" align=\"absmiddle\" id=\"");
              out.print(id);
              out.write('"');
              out.write(' ');
              out.print(disabled?"disabled='disabled'":"");
              out.write("\r\n");
              out.write("                 onclick=\"popUpCalendar(this, document.");
              out.print(Constants.SELECTION_FORM);
              out.write('.');
              out.print(id);
              out.write("[1], shortDateFormat ,0);return false;\"\r\n");
              out.write("                 style=\"font-size:11px;cursor:pointer;\"/>\r\n");
              out.write("         </td>\r\n");
              out.write("         <td style=\"visibility: ");
              out.print(visibility2);
              out.write(";\">\r\n");
              out.write("          &nbsp;");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_4);
              _jspx_th_bean_message_6.setBundle(Constants.MESSAGE_BUNDLE);
              _jspx_th_bean_message_6.setKey("gs.filter.and");
              int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
              if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
              out.write("&nbsp;\r\n");
              out.write("          ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_6 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_text_6.setPageContext(_jspx_page_context);
              _jspx_th_html_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_4);
              _jspx_th_html_text_6.setStyleClass("inputtext");
              _jspx_th_html_text_6.setProperty(idxProp+".val2");
              _jspx_th_html_text_6.setStyleId(id);
              _jspx_th_html_text_6.setDisabled(disabled);
              _jspx_th_html_text_6.setReadonly(false);
              _jspx_th_html_text_6.setSize("10");
              int _jspx_eval_html_text_6 = _jspx_th_html_text_6.doStartTag();
              if (_jspx_th_html_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.reuse(_jspx_th_html_text_6);
                return;
              }
              _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.reuse(_jspx_th_html_text_6);
              out.write("\r\n");
              out.write("          <img type=\"image\" src=\"../resources/images/cal.gif\" align=\"absmiddle\" id=\"");
              out.print(id);
              out.write('"');
              out.write(' ');
              out.print(disabled?"disabled='disabled'":"");
              out.write("\r\n");
              out.write("                 onclick=\"popUpCalendar(this, document.");
              out.print(Constants.SELECTION_FORM);
              out.write('.');
              out.print(id);
              out.write("[2], shortDateFormat,0);return false;\"\r\n");
              out.write("                 style=\"font-size:11px;cursor:pointer;\"/>\r\n");
              out.write("  ");
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
          out.write("\r\n");
          out.write("  ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_5 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_5.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_equal_5.setName("searchColumnData");
          _jspx_th_logic_equal_5.setProperty("searchColumn.type.name");
          _jspx_th_logic_equal_5.setValue(BaseType.TIMESTAMP.getName());
          int _jspx_eval_logic_equal_5 = _jspx_th_logic_equal_5.doStartTag();
          if (_jspx_eval_logic_equal_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("          ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_7 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_text_7.setPageContext(_jspx_page_context);
              _jspx_th_html_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_5);
              _jspx_th_html_text_7.setStyleClass("inputtext");
              _jspx_th_html_text_7.setProperty(idxProp+".val1");
              _jspx_th_html_text_7.setStyleId(id);
              _jspx_th_html_text_7.setDisabled(disabled);
              _jspx_th_html_text_7.setReadonly(false);
              _jspx_th_html_text_7.setSize("20");
              int _jspx_eval_html_text_7 = _jspx_th_html_text_7.doStartTag();
              if (_jspx_th_html_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.reuse(_jspx_th_html_text_7);
                return;
              }
              _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.reuse(_jspx_th_html_text_7);
              out.write("\r\n");
              out.write("          <img type=\"image\" src=\"../resources/images/cal.gif\" align=\"absmiddle\" id=\"");
              out.print(id);
              out.write('"');
              out.write(' ');
              out.print(disabled?"disabled='disabled'":"");
              out.write("\r\n");
              out.write("                 onclick=\"popUpCalendar(this, document.");
              out.print(Constants.SELECTION_FORM);
              out.write('.');
              out.print(id);
              out.write("[1], '");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_7 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_7.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_5);
              _jspx_th_bean_message_7.setBundle(Constants.MESSAGE_BUNDLE);
              _jspx_th_bean_message_7.setKey("format.timestamp");
              int _jspx_eval_bean_message_7 = _jspx_th_bean_message_7.doStartTag();
              if (_jspx_th_bean_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
              out.write("',1);return false;\"\r\n");
              out.write("                 style=\"font-size:11px;cursor:pointer;\"/>\r\n");
              out.write("         </td>\r\n");
              out.write("         <td style=\"visibility: ");
              out.print(visibility2);
              out.write(";\">\r\n");
              out.write("          &nbsp;");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_8 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_8.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_5);
              _jspx_th_bean_message_8.setBundle(Constants.MESSAGE_BUNDLE);
              _jspx_th_bean_message_8.setKey("gs.filter.and");
              int _jspx_eval_bean_message_8 = _jspx_th_bean_message_8.doStartTag();
              if (_jspx_th_bean_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
              out.write("&nbsp;\r\n");
              out.write("          ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_8 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_text_8.setPageContext(_jspx_page_context);
              _jspx_th_html_text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_5);
              _jspx_th_html_text_8.setStyleClass("inputtext");
              _jspx_th_html_text_8.setProperty(idxProp+".val2");
              _jspx_th_html_text_8.setStyleId(id);
              _jspx_th_html_text_8.setDisabled(disabled);
              _jspx_th_html_text_8.setReadonly(false);
              _jspx_th_html_text_8.setSize("20");
              int _jspx_eval_html_text_8 = _jspx_th_html_text_8.doStartTag();
              if (_jspx_th_html_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.reuse(_jspx_th_html_text_8);
                return;
              }
              _jspx_tagPool_html_text_styleId_styleClass_size_readonly_property_disabled_nobody.reuse(_jspx_th_html_text_8);
              out.write("\r\n");
              out.write("          <img type=\"image\" src=\"../resources/images/cal.gif\" align=\"absmiddle\" id=\"");
              out.print(id);
              out.write('"');
              out.write(' ');
              out.print(disabled?"disabled='disabled'":"");
              out.write("\r\n");
              out.write("                 onclick=\"popUpCalendar(this, document.");
              out.print(Constants.SELECTION_FORM);
              out.write('.');
              out.print(id);
              out.write("[2], '");
              //  bean:message
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_9 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
              _jspx_th_bean_message_9.setPageContext(_jspx_page_context);
              _jspx_th_bean_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_5);
              _jspx_th_bean_message_9.setBundle(Constants.MESSAGE_BUNDLE);
              _jspx_th_bean_message_9.setKey("format.timestamp");
              int _jspx_eval_bean_message_9 = _jspx_th_bean_message_9.doStartTag();
              if (_jspx_th_bean_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
                return;
              }
              _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
              out.write("',1);return false;\"\r\n");
              out.write("                 style=\"font-size:11px;cursor:pointer;\"/>\r\n");
              out.write("  ");
              int evalDoAfterBody = _jspx_th_logic_equal_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_equal_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_5);
            return;
          }
          _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_5);
          out.write("\r\n");
          out.write("\r\n");
          out.write("  ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_6 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_equal_6.setPageContext(_jspx_page_context);
          _jspx_th_logic_equal_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_equal_6.setName("searchColumnData");
          _jspx_th_logic_equal_6.setProperty("searchColumn.type.name");
          _jspx_th_logic_equal_6.setValue(BaseType.BOOLEAN.getName());
          int _jspx_eval_logic_equal_6 = _jspx_th_logic_equal_6.doStartTag();
          if (_jspx_eval_logic_equal_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("          ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_0 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_styleId_styleClass_property_disabled.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_radio_0.setPageContext(_jspx_page_context);
              _jspx_th_html_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_6);
              _jspx_th_html_radio_0.setValue("true");
              _jspx_th_html_radio_0.setProperty(idxProp+".val1");
              _jspx_th_html_radio_0.setStyleId(id);
              _jspx_th_html_radio_0.setStyleClass("radio");
              _jspx_th_html_radio_0.setDisabled(disabled);
              int _jspx_eval_html_radio_0 = _jspx_th_html_radio_0.doStartTag();
              if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_radio_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_radio_0.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("              ");
                  //  bean:message
                  org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_10 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
                  _jspx_th_bean_message_10.setPageContext(_jspx_page_context);
                  _jspx_th_bean_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_radio_0);
                  _jspx_th_bean_message_10.setBundle(Constants.MESSAGE_BUNDLE);
                  _jspx_th_bean_message_10.setKey("gs.value.yes");
                  int _jspx_eval_bean_message_10 = _jspx_th_bean_message_10.doStartTag();
                  if (_jspx_th_bean_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
                    return;
                  }
                  _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
                  out.write("\r\n");
                  out.write("          ");
                  int evalDoAfterBody = _jspx_th_html_radio_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_radio_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_radio_value_styleId_styleClass_property_disabled.reuse(_jspx_th_html_radio_0);
                return;
              }
              _jspx_tagPool_html_radio_value_styleId_styleClass_property_disabled.reuse(_jspx_th_html_radio_0);
              out.write("\r\n");
              out.write("          &nbsp;\r\n");
              out.write("          ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_1 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_styleId_styleClass_property_disabled.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_radio_1.setPageContext(_jspx_page_context);
              _jspx_th_html_radio_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_6);
              _jspx_th_html_radio_1.setValue("false");
              _jspx_th_html_radio_1.setProperty(idxProp+".val1");
              _jspx_th_html_radio_1.setStyleId(id);
              _jspx_th_html_radio_1.setStyleClass("radio");
              _jspx_th_html_radio_1.setDisabled(disabled);
              int _jspx_eval_html_radio_1 = _jspx_th_html_radio_1.doStartTag();
              if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_radio_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_radio_1.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("              ");
                  //  bean:message
                  org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_11 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
                  _jspx_th_bean_message_11.setPageContext(_jspx_page_context);
                  _jspx_th_bean_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_radio_1);
                  _jspx_th_bean_message_11.setBundle(Constants.MESSAGE_BUNDLE);
                  _jspx_th_bean_message_11.setKey("gs.value.no");
                  int _jspx_eval_bean_message_11 = _jspx_th_bean_message_11.doStartTag();
                  if (_jspx_th_bean_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
                    return;
                  }
                  _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
                  out.write("\r\n");
                  out.write("          ");
                  int evalDoAfterBody = _jspx_th_html_radio_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_radio_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_radio_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_radio_value_styleId_styleClass_property_disabled.reuse(_jspx_th_html_radio_1);
                return;
              }
              _jspx_tagPool_html_radio_value_styleId_styleClass_property_disabled.reuse(_jspx_th_html_radio_1);
              out.write("\r\n");
              out.write("         </td>\r\n");
              out.write("         <td style=\"visibility: ");
              out.print(visibility2);
              out.write(";\">\r\n");
              out.write("          &nbsp;\r\n");
              out.write("          ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_6);
              _jspx_th_html_hidden_1.setProperty(idxProp+".val2");
              _jspx_th_html_hidden_1.setValue("");
              int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
              if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
                return;
              }
              _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
              out.write("\r\n");
              out.write("   </td>\r\n");
              out.write("  ");
              int evalDoAfterBody = _jspx_th_logic_equal_6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_equal_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_6);
            return;
          }
          _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_6);
          out.write("\r\n");
          out.write("\r\n");
  // PARAMETRI AVAND UN TIP DERIVAT
    } else {
        String multiple = searchColumnData.getOperator().endsWith(SearchColumn.op_in) ? "yes" : null;
        String selectSize = multiple != null ? "4" : "1";

          out.write("\r\n");
          out.write("         ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleId_styleClass_size_property_multiple_disabled.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_1.setPageContext(_jspx_page_context);
          _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_html_select_1.setProperty(idxProp+".val");
          _jspx_th_html_select_1.setDisabled(disabled);
          _jspx_th_html_select_1.setStyleId(id);
          _jspx_th_html_select_1.setMultiple(multiple);
          _jspx_th_html_select_1.setSize(selectSize);
          _jspx_th_html_select_1.setStyleClass("inputtext");
          int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
          if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_1.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("             ");
              if (_jspx_meth_html_optionsCollection_0(_jspx_th_html_select_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("         ");
              int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_select_styleId_styleClass_size_property_multiple_disabled.reuse(_jspx_th_html_select_1);
            return;
          }
          _jspx_tagPool_html_select_styleId_styleClass_size_property_multiple_disabled.reuse(_jspx_th_html_select_1);
          out.write("\r\n");
          out.write("        </td>\r\n");
          out.write("        <td style=\"visibility: hidden;\">\r\n");
          out.write("         &nbsp;\r\n");
          out.write("         ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
          _jspx_th_html_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_html_hidden_2.setProperty(idxProp+".val2");
          _jspx_th_html_hidden_2.setValue("");
          int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
          if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_2);
            return;
          }
          _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_2);
          out.write('\r');
          out.write('\n');

    }

          out.write("\r\n");
          out.write("         </td>\r\n");
          out.write("        </tr>\r\n");
          out.write("       </table>\r\n");
          out.write("    </td>\r\n");
          out.write("  </tr>\r\n");
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          searchColumnData = (SearchColumnData) _jspx_page_context.findAttribute("searchColumnData");
          idx = (java.lang.Integer) _jspx_page_context.findAttribute("idx");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_iterate_type_property_name_indexId_id.reuse(_jspx_th_logic_iterate_0);
        return;
      }
      _jspx_tagPool_logic_iterate_type_property_name_indexId_id.reuse(_jspx_th_logic_iterate_0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"4\" class=\"button-row\" align=\"center\" style=\"background-color: #FFCC00;\">&nbsp;\r\n");
      out.write("      \r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td colspan=4 class=\"tableHeader\" style=\"background-color:#FFFFFF \">\r\n");
      out.write("        <center>\r\n");
      out.write("          <input value=\"Rezultate\"\r\n");
      out.write("                 class=\"button\" type=\"button\" onclick=\"parent.selectionWindow=myWindow;document.getElementById('theForm').submit();\">\r\n");
      out.write("        </center>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");

    } catch (Throwable thr) {
        System.err.println("#### filters.jsp ####" );
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

  private boolean _jspx_meth_html_optionsCollection_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_0 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_0.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_optionsCollection_0.setName("searchColumnData");
    _jspx_th_html_optionsCollection_0.setProperty("searchColumn.type.values");
    _jspx_th_html_optionsCollection_0.setValue("key");
    _jspx_th_html_optionsCollection_0.setLabel("value");
    int _jspx_eval_html_optionsCollection_0 = _jspx_th_html_optionsCollection_0.doStartTag();
    if (_jspx_th_html_optionsCollection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_0);
      return true;
    }
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_0);
    return false;
  }
}
