package org.apache.jsp.web.sys.admuserext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import ro.uti.settings.util.Constants;
import ro.uti.apmc.sys.util.AdmUserInregConstants;

public final class add_005fadmuserext_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
    _jspx_dependants.add("/selectionComponent/WEB-INF/selectionComponent.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_scope_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_scope_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_messages_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_onsubmit_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_property_maxlength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_styleId_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_styleId_styleClass_size_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_selection_selectionComponent_property_multiple_idTableName_detailsFieldName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_selection_genericSelection_styleClass_showCodeInsert_searchCaseId_knownFieldName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_scope_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_scope_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_messages_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_onsubmit_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_property_maxlength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_styleId_styleClass_size_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_selection_selectionComponent_property_multiple_idTableName_detailsFieldName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_selection_genericSelection_styleClass_showCodeInsert_searchCaseId_knownFieldName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_logic_empty_scope_property_name.release();
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_logic_notEmpty_scope_property_name.release();
    _jspx_tagPool_logic_messagesPresent.release();
    _jspx_tagPool_html_messages_id.release();
    _jspx_tagPool_bean_write_name_nobody.release();
    _jspx_tagPool_html_form_onsubmit_action.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.release();
    _jspx_tagPool_html_hidden_styleId_property_nobody.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_html_password_styleId_styleClass_size_property_nobody.release();
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
    _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.release();
    _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody.release();
    _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_nobody.release();
    _jspx_tagPool_selection_selectionComponent_property_multiple_idTableName_detailsFieldName.release();
    _jspx_tagPool_selection_genericSelection_styleClass_showCodeInsert_searchCaseId_knownFieldName.release();
    _jspx_tagPool_html_submit_styleClass.release();
    _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody.release();
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
      out.write("<form name=\"closeForm\" method=\"post\" action=\"sys/admuserext.do\">\r\n");
      out.write("  ");
      if (_jspx_meth_html_hidden_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("var popupldap;\r\n");
      out.write("//caut in ldap si afisez rezultatele\r\n");
      out.write("function showListLDAP() {\r\n");
      out.write("  var numeLdap = document.getElementById('numeSearchLdap').value;\r\n");
      out.write("  popupldap = window.open(\"/siiv/sys/admuserext.do?method=showListLDAP&numeLdap=\"+numeLdap,\"w1list\",\"height=300,width=500,status=no,toolbar=no,menubar=no,location=no,scrollbars=yes\");\r\n");
      out.write("}\r\n");
      out.write("function setLDAP(issuer_name,serial_number) {\r\n");
      out.write("     document.getElementById(\"issuer_name\").value=issuer_name;\r\n");
      out.write("     document.getElementById(\"serial_number\").value=serial_number;\r\n");
      out.write("\r\n");
      out.write("     var el_1 = document.getElementById('div_tr_iss_2');\r\n");
      out.write("     while(el_1.hasChildNodes()) {\r\n");
      out.write("        el_1.removeChild(el_1.firstChild);\r\n");
      out.write("     }\r\n");
      out.write("     var txtNod = document.createTextNode(issuer_name);\r\n");
      out.write("     el_1.appendChild(txtNod);\r\n");
      out.write("\r\n");
      out.write("     var el_2 = document.getElementById('div_tr_sn_2');\r\n");
      out.write("     while(el_2.hasChildNodes()) {\r\n");
      out.write("        el_2.removeChild(el_2.firstChild);\r\n");
      out.write("     }\r\n");
      out.write("     var txtNod = document.createTextNode(serial_number);\r\n");
      out.write("     el_2.appendChild(txtNod);\r\n");
      out.write("\r\n");
      out.write("     if(popupldap) popupldap.close();\r\n");
      out.write("}\r\n");
      out.write("function close() {\r\n");
      out.write(" if(popupldap) popupldap.close();\r\n");
      out.write("}\r\n");
      out.write("function closeWindow() {\r\n");
      out.write("    document.closeForm.submit();\r\n");
      out.write("}\r\n");
      out.write("function showTrAdd() {\r\n");
      out.write("    var cd_boo_0 = document.getElementById('cd_boo_0');\r\n");
      out.write("    var cd_boo_1 = document.getElementById('cd_boo_1');\r\n");
      out.write("    var field = document.getElementById('cd');\r\n");
      out.write("\r\n");
      out.write("    if (cd_boo_0.checked) {\r\n");
      out.write("      document.getElementById(\"div_tr_pw_1\").style.display=\"inline\";\r\n");
      out.write("      document.getElementById(\"div_tr_pw_2\").style.display=\"inline\";\r\n");
      out.write("      document.getElementById(\"div_tr_cpw_1\").style.display=\"inline\";\r\n");
      out.write("      document.getElementById(\"div_tr_cpw_2\").style.display=\"inline\";\r\n");
      out.write("      document.getElementById(\"div_tr_btn_1\").style.display=\"none\";\r\n");
      out.write("      document.getElementById(\"div_tr_btn_2\").style.display=\"none\";\r\n");
      out.write("      document.getElementById(\"div_tr_iss_1\").style.display=\"none\";\r\n");
      out.write("      document.getElementById(\"div_tr_iss_2\").style.display=\"none\";\r\n");
      out.write("      document.getElementById(\"div_tr_sn_1\").style.display=\"none\";\r\n");
      out.write("      document.getElementById(\"div_tr_sn_2\").style.display=\"none\";\r\n");
      out.write("      field.value=\"0\";\r\n");
      out.write("      reset();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    if (cd_boo_1.checked) {\r\n");
      out.write("      document.getElementById(\"div_tr_pw_1\").style.display=\"none\";\r\n");
      out.write("      document.getElementById(\"div_tr_pw_2\").style.display=\"none\";\r\n");
      out.write("      document.getElementById(\"div_tr_cpw_1\").style.display=\"none\";\r\n");
      out.write("      document.getElementById(\"div_tr_cpw_2\").style.display=\"none\";\r\n");
      out.write("      document.getElementById(\"div_tr_btn_1\").style.display=\"inline\";\r\n");
      out.write("      document.getElementById(\"div_tr_btn_2\").style.display=\"inline\";\r\n");
      out.write("      document.getElementById(\"div_tr_iss_1\").style.display=\"inline\";\r\n");
      out.write("      document.getElementById(\"div_tr_iss_2\").style.display=\"inline\";\r\n");
      out.write("      document.getElementById(\"div_tr_sn_1\").style.display=\"inline\";\r\n");
      out.write("      document.getElementById(\"div_tr_sn_2\").style.display=\"inline\";\r\n");
      out.write("      field.value=\"1\";\r\n");
      out.write("      reset();\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("function chAutP() {\r\n");
      out.write("  var ch_0  = document.getElementById('ch_0');\r\n");
      out.write("  var ch_1  = document.getElementById('ch_1');\r\n");
      out.write("  var ch_2  = document.getElementById('ch_2');\r\n");
      out.write("  if (ch_0.checked) {\r\n");
      out.write("    document.getElementById(\"div_tr_pw_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_pw_2\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_2\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_2\").style.display=\"none\";\r\n");
      out.write("    reset();\r\n");
      out.write("  }\r\n");
      out.write("  if (ch_1.checked) {\r\n");
      out.write("    document.getElementById(\"div_tr_pw_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_pw_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_2\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_2\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_2\").style.display=\"inline\";\r\n");
      out.write("    reset();\r\n");
      out.write("  }\r\n");
      out.write("  if (ch_2.checked) {\r\n");
      out.write("    document.getElementById(\"div_tr_pw_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_pw_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_2\").style.display=\"none\";\r\n");
      out.write("    reset();\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("function chAut() {\r\n");
      out.write("  var ch_0  = document.getElementById('ch_0');\r\n");
      out.write("  var ch_1  = document.getElementById('ch_1');\r\n");
      out.write("  var ch_2  = document.getElementById('ch_2');\r\n");
      out.write("  if (ch_0.checked) {\r\n");
      out.write("    document.getElementById(\"div_tr_pw_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_pw_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_2\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_2\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_2\").style.display=\"inline\";\r\n");
      out.write("    reset();\r\n");
      out.write("  }\r\n");
      out.write("  if (ch_1.checked) {\r\n");
      out.write("    document.getElementById(\"div_tr_pw_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_pw_2\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_1\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_2\").style.display=\"inline\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_2\").style.display=\"none\";\r\n");
      out.write("    reset();\r\n");
      out.write("  }\r\n");
      out.write("  if (ch_2.checked) {\r\n");
      out.write("    document.getElementById(\"div_tr_pw_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_pw_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_cpw_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_btn_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_iss_2\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_1\").style.display=\"none\";\r\n");
      out.write("    document.getElementById(\"div_tr_sn_2\").style.display=\"none\";\r\n");
      out.write("    reset();\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("function reset() {\r\n");
      out.write(" document.getElementById('pw').value='';\r\n");
      out.write(" document.getElementById('cpw').value='';\r\n");
      out.write(" document.getElementById('numeSearchLdap').value='';\r\n");
      out.write(" document.getElementById('issuer_name').value='';\r\n");
      out.write(" document.getElementById('serial_number').value='';\r\n");
      out.write(" var el_1 = document.getElementById('div_tr_iss_2');\r\n");
      out.write(" while(el_1.hasChildNodes()) {\r\n");
      out.write("  el_1.removeChild(el_1.firstChild);\r\n");
      out.write(" }\r\n");
      out.write(" var el_2 = document.getElementById('div_tr_sn_2');\r\n");
      out.write(" while(el_2.hasChildNodes()) {\r\n");
      out.write("  el_2.removeChild(el_2.firstChild);\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("//la check boxuri\r\n");
      out.write("function initChb(id_boo,id) {\r\n");
      out.write(" var chb = document.getElementById(id_boo);\r\n");
      out.write(" var field = document.getElementById(id);\r\n");
      out.write(" if (chb.checked) {\r\n");
      out.write("   field.value=\"1\";\r\n");
      out.write(" }else {\r\n");
      out.write("   field.value=\"0\";\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("function initAcountStatus(id_boo,id) {\r\n");
      out.write(" var chb = document.getElementById(id_boo);\r\n");
      out.write(" var field = document.getElementById(id);\r\n");
      out.write(" if (chb.checked) {\r\n");
      out.write("   field.value=\"0\";\r\n");
      out.write(" }else {\r\n");
      out.write("   field.value=\"1\";\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"table\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write(" <tr>\r\n");
      out.write("  <td width=\"100%\" valign=\"top\" align=\"left\" class=\"page-subtitle\">&nbsp;\r\n");
      out.write("  <!-- Titlul ferestrei pentru adaugare. -->\r\n");
      out.write("  ");
      //  logic:empty
      org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_0 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_scope_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
      _jspx_th_logic_empty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_empty_0.setParent(null);
      _jspx_th_logic_empty_0.setName(Constants.ADM_USER_EXT_KEY);
      _jspx_th_logic_empty_0.setProperty("values.primaryKey");
      _jspx_th_logic_empty_0.setScope("request");
      int _jspx_eval_logic_empty_0 = _jspx_th_logic_empty_0.doStartTag();
      if (_jspx_eval_logic_empty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("   ");
          if (_jspx_meth_bean_message_0(_jspx_th_logic_empty_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_empty_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_empty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_0);
        return;
      }
      _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_0);
      out.write("\r\n");
      out.write("  <!-- Titlul ferestrei pentru modificare. -->\r\n");
      out.write("  ");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_0.setParent(null);
      _jspx_th_logic_notEmpty_0.setName(Constants.ADM_USER_EXT_KEY);
      _jspx_th_logic_notEmpty_0.setProperty("values.primaryKey");
      _jspx_th_logic_notEmpty_0.setScope("request");
      int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
      if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("   ");
          if (_jspx_meth_bean_message_1(_jspx_th_logic_notEmpty_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_notEmpty_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_notEmpty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_0);
        return;
      }
      _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_0);
      out.write("\r\n");
      out.write("  <!-- END Sectiune de Titlu pagina. -->\r\n");
      out.write("  </td>\r\n");
      out.write("  <td class=\"bottom\" align=\"right\">\r\n");
      out.write("   <img border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:closeWindow();\" title='");
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write("' src=\"images/close_off.gif\" />\r\n");
      out.write("  </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_messagesPresent_0.setParent(null);
      int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
      if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write(" <tr>\r\n");
          out.write("  <td valign=\"top\" colspan=\"2\" class=\"msg_error\" align=\"center\">\r\n");
          out.write("     <ul>\r\n");
          out.write("      ");
          //  html:messages
          org.apache.struts.taglib.html.MessagesTag _jspx_th_html_messages_0 = (org.apache.struts.taglib.html.MessagesTag) _jspx_tagPool_html_messages_id.get(org.apache.struts.taglib.html.MessagesTag.class);
          _jspx_th_html_messages_0.setPageContext(_jspx_page_context);
          _jspx_th_html_messages_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
          _jspx_th_html_messages_0.setId("error");
          int _jspx_eval_html_messages_0 = _jspx_th_html_messages_0.doStartTag();
          if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String error = null;
            if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_messages_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_messages_0.doInitBody();
            }
            error = (java.lang.String) _jspx_page_context.findAttribute("error");
            do {
              out.write("\r\n");
              out.write("       <li>");
              if (_jspx_meth_bean_write_0(_jspx_th_html_messages_0, _jspx_page_context))
                return;
              out.write("</li>\r\n");
              out.write("      ");
              int evalDoAfterBody = _jspx_th_html_messages_0.doAfterBody();
              error = (java.lang.String) _jspx_page_context.findAttribute("error");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_messages_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_messages_id.reuse(_jspx_th_html_messages_0);
            return;
          }
          _jspx_tagPool_html_messages_id.reuse(_jspx_th_html_messages_0);
          out.write("\r\n");
          out.write("     </ul>\r\n");
          out.write("  </td>\r\n");
          out.write(" </tr>\r\n");
          int evalDoAfterBody = _jspx_th_logic_messagesPresent_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_messagesPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_messagesPresent.reuse(_jspx_th_logic_messagesPresent_0);
        return;
      }
      _jspx_tagPool_logic_messagesPresent.reuse(_jspx_th_logic_messagesPresent_0);
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write(" <!-- START Sectiune de FORM. -->\r\n");
      out.write(" ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_onsubmit_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/admuserext.do");
      _jspx_th_html_form_0.setOnsubmit("return validateForm_AdmUserExtForm(this);");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write(" <!--campuri hidden-->\r\n");
          out.write("\r\n");
          out.write(" ");
          if (_jspx_meth_html_hidden_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write(" <!-- Cimpul 'fk_user' field. -->\r\n");
          out.write(" ");
          if (_jspx_meth_html_hidden_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write(" <!--Campul account_creration_date-->\r\n");
          out.write(" ");
          if (_jspx_meth_html_hidden_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write(" <!--campul account_deletion_date-->\r\n");
          out.write(" ");
          if (_jspx_meth_html_hidden_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write(" <!--campul logged-->\r\n");
          out.write(" ");
          if (_jspx_meth_html_hidden_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write(" <!--campul user_type-->\r\n");
          out.write(" ");
          if (_jspx_meth_html_hidden_6(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write(" <!--campul user_login-->\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td valign=\"top\" class=\"label\" align=\"right\" width=\"40%\">\r\n");
          out.write("       ");
          if (_jspx_meth_bean_message_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" *:\r\n");
          out.write("    </td>\r\n");
          out.write("    <td class=\"field_text\" align=\"left\" width=\"60%\">\r\n");
          out.write("     ");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("     <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("    </td>\r\n");
          out.write("  </tr>\r\n");
          out.write(" <!-- Cimpul 'nume' field. -->\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td valign=\"top\" class=\"label\" align=\"right\" >\r\n");
          out.write("     ");
          if (_jspx_meth_bean_message_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" *:\r\n");
          out.write("    </td>\r\n");
          out.write("    <td class=\"text\" align=\"left\" >\r\n");
          out.write("      ");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_6(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("    </td>\r\n");
          out.write("  </tr>\r\n");
          out.write(" <!-- Cimpul 'prenume' field. -->\r\n");
          out.write(" <tr>\r\n");
          out.write("  <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("   ");
          if (_jspx_meth_bean_message_7(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" *:\r\n");
          out.write("  </td>\r\n");
          out.write("  <td class=\"text\" align=\"left\">\r\n");
          out.write("    ");
          if (_jspx_meth_html_text_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_8(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("  </td>\r\n");
          out.write(" </tr>\r\n");
          out.write("<!-- Cimpul 'email' field. -->\r\n");
          out.write(" <tr>\r\n");
          out.write("  <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("   ");
          if (_jspx_meth_bean_message_9(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" *:\r\n");
          out.write("  </td>\r\n");
          out.write("  <td class=\"text\" align=\"left\">\r\n");
          out.write("   ");
          if (_jspx_meth_html_text_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("   <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_10(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("  </td>\r\n");
          out.write(" </tr>\r\n");
          out.write("<!--Campul account_status-->\r\n");
          if (_jspx_meth_html_hidden_7(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("<tr>\r\n");
          out.write(" <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("   ");
          if (_jspx_meth_bean_message_11(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" :\r\n");
          out.write("  </td>\r\n");
          out.write("  <td class=\"text\" align=\"left\">\r\n");
          out.write("    <input type=\"checkbox\" id=\"account_status_boo\" onclick=\"javascript: initAcountStatus('account_status_boo','account_status');\"/>\r\n");
          out.write("    <script type=\"text/javascript\">\r\n");
          out.write("      if (document.getElementById(\"account_status\").value == \"0\") {\r\n");
          out.write("          document.getElementById(\"account_status_boo\").checked = true;\r\n");
          out.write("      }\r\n");
          out.write("    </script>\r\n");
          out.write("   <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_12(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("  </td>\r\n");
          out.write("</tr>\r\n");
          out.write("<!-##################################################################################-->\r\n");
          out.write("<!--Start adaugare  mod de autentificare-->\r\n");
          out.write("<!-##################################################################################-->\r\n");
          //  logic:empty
          org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_1 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_scope_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
          _jspx_th_logic_empty_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_empty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_empty_1.setName(Constants.ADM_USER_EXT_KEY);
          _jspx_th_logic_empty_1.setProperty("values.primaryKey");
          _jspx_th_logic_empty_1.setScope("request");
          int _jspx_eval_logic_empty_1 = _jspx_th_logic_empty_1.doStartTag();
          if (_jspx_eval_logic_empty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write(" <!--Campul CD -->\r\n");
              out.write(" ");
              if (_jspx_meth_html_hidden_8(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write(" <tr>\r\n");
              out.write("  <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
              out.write("   ");
              if (_jspx_meth_bean_message_13(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write(" *:\r\n");
              out.write("  </td>\r\n");
              out.write("  <td class=\"text\" align=\"left\">\r\n");
              out.write("   <input type=\"radio\" name=\"cd_boo\" id=\"cd_boo_1\" value=\"1\" onclick=\"javascript: showTrAdd();\"/>\r\n");
              out.write("   ");
              if (_jspx_meth_bean_message_14(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("   <br>\r\n");
              out.write("   <input type=\"radio\" name=\"cd_boo\" id=\"cd_boo_0\" value=\"0\" onclick=\"javascript: showTrAdd();\"/>\r\n");
              out.write("   ");
              if (_jspx_meth_bean_message_15(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("  </td>\r\n");
              out.write(" </tr>\r\n");
              out.write(" <script type=\"text/javascript\">\r\n");
              out.write("  if (document.getElementById(\"cd\").value == \"1\") {\r\n");
              out.write("    document.getElementById(\"cd_boo_1\").checked = true;\r\n");
              out.write("  }\r\n");
              out.write("  if (document.getElementById(\"cd\").value == \"0\") {\r\n");
              out.write("    document.getElementById(\"cd_boo_0\").checked = true;\r\n");
              out.write("  }\r\n");
              out.write(" </script>\r\n");
              out.write(" <!-- Cimpul 'user_password' field. -->\r\n");
              out.write(" <tr>\r\n");
              out.write("  <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
              out.write("    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_0.setValue(String.valueOf(0));
              _jspx_th_logic_equal_0.setProperty("values.cd");
              _jspx_th_logic_equal_0.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
              if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("      <div style=\"display: inline\" id=\"div_tr_pw_1\" >\r\n");
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
              out.write("    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_1.setValue(String.valueOf(1));
              _jspx_th_logic_equal_1.setProperty("values.cd");
              _jspx_th_logic_equal_1.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
              if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("      <div style=\"display: none\" id=\"div_tr_pw_1\" >\r\n");
                  out.write("    ");
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
              out.write("       ");
              if (_jspx_meth_bean_message_16(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write(" *:\r\n");
              out.write("      </div>\r\n");
              out.write("  </td>\r\n");
              out.write("  <td class=\"text\" align=\"left\">\r\n");
              out.write("    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_2 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_2.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_2.setValue(String.valueOf(0));
              _jspx_th_logic_equal_2.setProperty("values.cd");
              _jspx_th_logic_equal_2.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_2 = _jspx_th_logic_equal_2.doStartTag();
              if (_jspx_eval_logic_equal_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("      <div style=\"display: inline\" id=\"div_tr_pw_2\" >\r\n");
                  out.write("    ");
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
              out.write("    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_3 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_3.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_3.setValue(String.valueOf(1));
              _jspx_th_logic_equal_3.setProperty("values.cd");
              _jspx_th_logic_equal_3.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_3 = _jspx_th_logic_equal_3.doStartTag();
              if (_jspx_eval_logic_equal_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("      <div style=\"display: none\" id=\"div_tr_pw_2\" >\r\n");
                  out.write("    ");
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
              out.write("      ");
              if (_jspx_meth_html_password_0(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("      <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
              if (_jspx_meth_bean_message_17(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\" />\r\n");
              out.write("     </div>\r\n");
              out.write("  </td>\r\n");
              out.write(" </tr>\r\n");
              out.write(" <!-- Cimpul 'c_user_password' confirmare field. -->\r\n");
              out.write("<tr>\r\n");
              out.write(" <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
              out.write("   ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_4 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_4.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_4.setValue("0");
              _jspx_th_logic_equal_4.setProperty("values.cd");
              _jspx_th_logic_equal_4.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_4 = _jspx_th_logic_equal_4.doStartTag();
              if (_jspx_eval_logic_equal_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("    <div style=\"display: inline\" id=\"div_tr_cpw_1\">\r\n");
                  out.write("   ");
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
              out.write("   ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_5 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_5.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_5.setValue("1");
              _jspx_th_logic_equal_5.setProperty("values.cd");
              _jspx_th_logic_equal_5.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_5 = _jspx_th_logic_equal_5.doStartTag();
              if (_jspx_eval_logic_equal_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("    <div style=\"display: none\" id=\"div_tr_cpw_1\">\r\n");
                  out.write("   ");
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
              out.write("       ");
              if (_jspx_meth_bean_message_18(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write(" *:\r\n");
              out.write("    </div>\r\n");
              out.write("   </td>\r\n");
              out.write("   <td class=\"text\" align=\"left\">\r\n");
              out.write("     ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_6 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_6.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_6.setValue("0");
              _jspx_th_logic_equal_6.setProperty("values.cd");
              _jspx_th_logic_equal_6.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_6 = _jspx_th_logic_equal_6.doStartTag();
              if (_jspx_eval_logic_equal_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("       <div style=\"display: inline\" id=\"div_tr_cpw_2\">\r\n");
                  out.write("     ");
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
              out.write("     ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_7 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_7.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_7.setValue("1");
              _jspx_th_logic_equal_7.setProperty("values.cd");
              _jspx_th_logic_equal_7.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_7 = _jspx_th_logic_equal_7.doStartTag();
              if (_jspx_eval_logic_equal_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("       <div style=\"display: none\" id=\"div_tr_cpw_2\">\r\n");
                  out.write("     ");
                  int evalDoAfterBody = _jspx_th_logic_equal_7.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_7);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_7);
              out.write("\r\n");
              out.write("       ");
              if (_jspx_meth_html_password_1(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("       <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
              if (_jspx_meth_bean_message_19(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\" />\r\n");
              out.write("      </div>\r\n");
              out.write("   </td>\r\n");
              out.write(" </tr>\r\n");
              out.write("<!-- campul dupa care caut in ldap -->\r\n");
              out.write("<tr>\r\n");
              out.write(" <td align=\"right\" class=\"label\">\r\n");
              out.write("   ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_8 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_8.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_8.setValue("1");
              _jspx_th_logic_equal_8.setProperty("values.cd");
              _jspx_th_logic_equal_8.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_8 = _jspx_th_logic_equal_8.doStartTag();
              if (_jspx_eval_logic_equal_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("     <div style=\"display: inline\" id=\"div_tr_btn_1\">\r\n");
                  out.write("   ");
                  int evalDoAfterBody = _jspx_th_logic_equal_8.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_8);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_8);
              out.write("\r\n");
              out.write("   ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_9 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_9.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_9.setValue("0");
              _jspx_th_logic_equal_9.setProperty("values.cd");
              _jspx_th_logic_equal_9.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_9 = _jspx_th_logic_equal_9.doStartTag();
              if (_jspx_eval_logic_equal_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("     <div style=\"display: none\" id=\"div_tr_btn_1\">\r\n");
                  out.write("   ");
                  int evalDoAfterBody = _jspx_th_logic_equal_9.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_9);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_9);
              out.write("\r\n");
              out.write("      ");
              if (_jspx_meth_bean_message_20(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write(" *:\r\n");
              out.write("    </div>\r\n");
              out.write(" </td>\r\n");
              out.write(" <td class=\"text\" align=\"left\">\r\n");
              out.write("   ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_10 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_10.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_10.setValue("1");
              _jspx_th_logic_equal_10.setProperty("values.cd");
              _jspx_th_logic_equal_10.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_10 = _jspx_th_logic_equal_10.doStartTag();
              if (_jspx_eval_logic_equal_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("     <div style=\"display: inline\" id=\"div_tr_btn_2\">\r\n");
                  out.write("   ");
                  int evalDoAfterBody = _jspx_th_logic_equal_10.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_10);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_10);
              out.write("\r\n");
              out.write("   ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_11 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_11.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_11.setValue("0");
              _jspx_th_logic_equal_11.setProperty("values.cd");
              _jspx_th_logic_equal_11.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_11 = _jspx_th_logic_equal_11.doStartTag();
              if (_jspx_eval_logic_equal_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("     <div style=\"display: none\" id=\"div_tr_btn_2\">\r\n");
                  out.write("   ");
                  int evalDoAfterBody = _jspx_th_logic_equal_11.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_11);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_11);
              out.write("\r\n");
              out.write("      ");
              if (_jspx_meth_html_text_4(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("      <img src=\"images/quest.gif\" width=\"15\" height=\"15\"  style=\"cursor:pointer;\" title=\"");
              if (_jspx_meth_bean_message_21(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\"/>\r\n");
              out.write("      <!--Buton cauta in LDAP-->\r\n");
              out.write("      <input type=\"button\" class=\"btn-generic\" value='");
              if (_jspx_meth_bean_message_22(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("'   onclick=\"javascript: showListLDAP();\"/>\r\n");
              out.write("    </div>\r\n");
              out.write(" </td>\r\n");
              out.write("</tr>\r\n");
              out.write(" <!--campul 'issuer_name' -->\r\n");
              out.write(" ");
              if (_jspx_meth_html_hidden_9(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write(" <tr>\r\n");
              out.write("  <td align=\"right\" class=\"label\">\r\n");
              out.write("    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_12 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_12.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_12.setValue("1");
              _jspx_th_logic_equal_12.setProperty("values.cd");
              _jspx_th_logic_equal_12.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_12 = _jspx_th_logic_equal_12.doStartTag();
              if (_jspx_eval_logic_equal_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("      <div style=\"display: inline\" id=\"div_tr_iss_1\">\r\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_logic_equal_12.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_12);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_12);
              out.write("\r\n");
              out.write("    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_13 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_13.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_13.setValue("0");
              _jspx_th_logic_equal_13.setProperty("values.cd");
              _jspx_th_logic_equal_13.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_13 = _jspx_th_logic_equal_13.doStartTag();
              if (_jspx_eval_logic_equal_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("      <div style=\"display: none\" id=\"div_tr_iss_1\">\r\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_logic_equal_13.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_13);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_13);
              out.write("\r\n");
              out.write("       ");
              if (_jspx_meth_bean_message_23(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write(" *:\r\n");
              out.write("      </div>\r\n");
              out.write("  </td>\r\n");
              out.write("  <td align=\"left\" class=\"text\" id=\"el_1\" >\r\n");
              out.write("     ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_14 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_14.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_14.setValue("1");
              _jspx_th_logic_equal_14.setProperty("values.cd");
              _jspx_th_logic_equal_14.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_14 = _jspx_th_logic_equal_14.doStartTag();
              if (_jspx_eval_logic_equal_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("      <div style=\"display: inline\" id=\"div_tr_iss_2\">\r\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_logic_equal_14.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_14);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_14);
              out.write("\r\n");
              out.write("    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_15 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_15.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_15.setValue("0");
              _jspx_th_logic_equal_15.setProperty("values.cd");
              _jspx_th_logic_equal_15.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_15 = _jspx_th_logic_equal_15.doStartTag();
              if (_jspx_eval_logic_equal_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("      <div style=\"display: none\" id=\"div_tr_iss_2\">\r\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_logic_equal_15.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_15);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_15);
              out.write("\r\n");
              out.write("       ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_bean_write_1.setName(Constants.ADM_USER_EXT_KEY);
              _jspx_th_bean_write_1.setProperty("values.issuer_name");
              int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
              if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
                return;
              }
              _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
              out.write("\r\n");
              out.write("      </div>\r\n");
              out.write("  </td>\r\n");
              out.write("</tr>\r\n");
              out.write("<!--campul 'serial_number' -->\r\n");
              if (_jspx_meth_html_hidden_10(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("<tr>\r\n");
              out.write(" <td align=\"right\" class=\"label\">\r\n");
              out.write("   ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_16 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_16.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_16.setValue("1");
              _jspx_th_logic_equal_16.setProperty("values.cd");
              _jspx_th_logic_equal_16.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_16 = _jspx_th_logic_equal_16.doStartTag();
              if (_jspx_eval_logic_equal_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("      <div style=\"display: inline\" id=\"div_tr_sn_1\">\r\n");
                  out.write("   ");
                  int evalDoAfterBody = _jspx_th_logic_equal_16.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_16);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_16);
              out.write("\r\n");
              out.write("   ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_17 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_17.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_17.setValue("0");
              _jspx_th_logic_equal_17.setProperty("values.cd");
              _jspx_th_logic_equal_17.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_17 = _jspx_th_logic_equal_17.doStartTag();
              if (_jspx_eval_logic_equal_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("      <div style=\"display: none\" id=\"div_tr_sn_1\">\r\n");
                  out.write("   ");
                  int evalDoAfterBody = _jspx_th_logic_equal_17.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_17);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_17);
              out.write("\r\n");
              out.write("      ");
              if (_jspx_meth_bean_message_24(_jspx_th_logic_empty_1, _jspx_page_context))
                return;
              out.write(" *:\r\n");
              out.write("     </div>\r\n");
              out.write(" </td>\r\n");
              out.write(" <td align=\"left\" class=\"text\" id=\"el_2\" >\r\n");
              out.write("    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_18 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_18.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_18.setValue("1");
              _jspx_th_logic_equal_18.setProperty("values.cd");
              _jspx_th_logic_equal_18.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_18 = _jspx_th_logic_equal_18.doStartTag();
              if (_jspx_eval_logic_equal_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("      <div style=\"display: inline\" id=\"div_tr_sn_2\">\r\n");
                  out.write("   ");
                  int evalDoAfterBody = _jspx_th_logic_equal_18.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_18);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_18);
              out.write("\r\n");
              out.write("   ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_19 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_19.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_logic_equal_19.setValue("0");
              _jspx_th_logic_equal_19.setProperty("values.cd");
              _jspx_th_logic_equal_19.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_19 = _jspx_th_logic_equal_19.doStartTag();
              if (_jspx_eval_logic_equal_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("     <div style=\"display: none\" id=\"div_tr_sn_2\">\r\n");
                  out.write("   ");
                  int evalDoAfterBody = _jspx_th_logic_equal_19.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_19);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_19);
              out.write("\r\n");
              out.write("       ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
              _jspx_th_bean_write_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
              _jspx_th_bean_write_2.setName(Constants.ADM_USER_EXT_KEY);
              _jspx_th_bean_write_2.setProperty("values.serial_number");
              int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
              if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
                return;
              }
              _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
              out.write("\r\n");
              out.write("     </div>\r\n");
              out.write(" </td>\r\n");
              out.write("</tr>\r\n");
              int evalDoAfterBody = _jspx_th_logic_empty_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_empty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_1);
            return;
          }
          _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_1);
          out.write("\r\n");
          out.write("<!-##################################################################################-->\r\n");
          out.write("<!--End adaugare mod de autentificare-->\r\n");
          out.write("<!-##################################################################################-->\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<!-##################################################################################-->\r\n");
          out.write("<!--Start editare mod de autentificare-->\r\n");
          out.write("<!-##################################################################################-->\r\n");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEmpty_1.setName(Constants.ADM_USER_EXT_KEY);
          _jspx_th_logic_notEmpty_1.setProperty("values.primaryKey");
          _jspx_th_logic_notEmpty_1.setScope("request");
          int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
          if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("<!-- Cimpul 'cd' field. -->\r\n");
              if (_jspx_meth_html_hidden_11(_jspx_th_logic_notEmpty_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("<tr>\r\n");
              out.write("  <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
              out.write("       ");
              if (_jspx_meth_bean_message_25(_jspx_th_logic_notEmpty_1, _jspx_page_context))
                return;
              out.write(" :\r\n");
              out.write("  </td>\r\n");
              out.write("  <td class=\"text\">\r\n");
              out.write("         ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_20 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_20.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
              _jspx_th_logic_equal_20.setValue("1");
              _jspx_th_logic_equal_20.setProperty("values.cd");
              _jspx_th_logic_equal_20.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_20 = _jspx_th_logic_equal_20.doStartTag();
              if (_jspx_eval_logic_equal_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  if (_jspx_meth_bean_message_26(_jspx_th_logic_equal_20, _jspx_page_context))
                    return;
                  int evalDoAfterBody = _jspx_th_logic_equal_20.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_20);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_20);
              out.write("\r\n");
              out.write("         ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_21 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_21.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
              _jspx_th_logic_equal_21.setValue("0");
              _jspx_th_logic_equal_21.setProperty("values.cd");
              _jspx_th_logic_equal_21.setName(Constants.ADM_USER_EXT_KEY);
              int _jspx_eval_logic_equal_21 = _jspx_th_logic_equal_21.doStartTag();
              if (_jspx_eval_logic_equal_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  if (_jspx_meth_bean_message_27(_jspx_th_logic_equal_21, _jspx_page_context))
                    return;
                  int evalDoAfterBody = _jspx_th_logic_equal_21.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_21);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_21);
              out.write("\r\n");
              out.write("  </td>\r\n");
              out.write("</tr>\r\n");
              out.write("\r\n");
              out.write("<!--##################  Start editare  mod de autentificare CD  ######################-->\r\n");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_22 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_22.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
              _jspx_th_logic_equal_22.setValue("1");
              _jspx_th_logic_equal_22.setName(Constants.ADM_USER_EXT_KEY);
              _jspx_th_logic_equal_22.setProperty("values.cd");
              int _jspx_eval_logic_equal_22 = _jspx_th_logic_equal_22.doStartTag();
              if (_jspx_eval_logic_equal_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("<!--campul 'issuer_name' -->\r\n");
                  out.write(" ");
                  if (_jspx_meth_html_hidden_12(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write(" <tr>\r\n");
                  out.write("  <td align=\"right\" class=\"label\">\r\n");
                  out.write("    ");
                  if (_jspx_meth_bean_message_28(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("  </td>\r\n");
                  out.write("  <td align=\"left\" class=\"field_text\">\r\n");
                  out.write("    ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
                  _jspx_th_bean_write_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_bean_write_3.setName(Constants.ADM_USER_EXT_KEY);
                  _jspx_th_bean_write_3.setProperty("values.issuer_name");
                  int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
                  if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
                    return;
                  }
                  _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
                  out.write("\r\n");
                  out.write("  </td>\r\n");
                  out.write(" </tr>\r\n");
                  out.write(" <!--campul 'serial_number' -->\r\n");
                  out.write("  ");
                  if (_jspx_meth_html_hidden_13(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("  <tr>\r\n");
                  out.write("   <td align=\"right\" class=\"label\">\r\n");
                  out.write("      ");
                  if (_jspx_meth_bean_message_29(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("   </td>\r\n");
                  out.write("   <td align=\"left\" class=\"field_text\">\r\n");
                  out.write("       ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
                  _jspx_th_bean_write_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_bean_write_4.setName(Constants.ADM_USER_EXT_KEY);
                  _jspx_th_bean_write_4.setProperty("values.serial_number");
                  int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
                  if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
                    return;
                  }
                  _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
                  out.write("\r\n");
                  out.write("   </td>\r\n");
                  out.write("  </tr>\r\n");
                  out.write("<!--Campul changeAut-->\r\n");
                  out.write("   <tr>\r\n");
                  out.write("    <td align=\"right\" class=\"label\" >\r\n");
                  out.write("      ");
                  if (_jspx_meth_bean_message_30(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("    </td>\r\n");
                  out.write("    <td align=\"left\">\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_radio_0(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("    </td>\r\n");
                  out.write("   </tr>\r\n");
                  out.write("   <tr>\r\n");
                  out.write("    <td align=\"right\" class=\"label\" >\r\n");
                  out.write("      ");
                  if (_jspx_meth_bean_message_31(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("    </td>\r\n");
                  out.write("    <td align=\"left\">\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_radio_1(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("    </td>\r\n");
                  out.write("   </tr>\r\n");
                  out.write("   <tr>\r\n");
                  out.write("    <td align=\"right\" class=\"label\" >\r\n");
                  out.write("      ");
                  if (_jspx_meth_bean_message_32(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("    </td>\r\n");
                  out.write("    <td align=\"left\">\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_radio_2(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("    </td>\r\n");
                  out.write("   </tr>\r\n");
                  out.write("<!-- campul dupa care caut in ldap -->\r\n");
                  out.write("<tr>\r\n");
                  out.write("  <td align=\"right\" class=\"label\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_23 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_23.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_23.setValue("2");
                  _jspx_th_logic_equal_23.setProperty("changeAut");
                  _jspx_th_logic_equal_23.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_23 = _jspx_th_logic_equal_23.doStartTag();
                  if (_jspx_eval_logic_equal_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_1\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_23.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_23);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_23);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_24 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_24.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_24.setValue("0");
                  _jspx_th_logic_equal_24.setProperty("changeAut");
                  _jspx_th_logic_equal_24.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_24 = _jspx_th_logic_equal_24.doStartTag();
                  if (_jspx_eval_logic_equal_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_1\" style=\"display: inline\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_24.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_24);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_24);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_25 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_25.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_25.setValue("1");
                  _jspx_th_logic_equal_25.setProperty("changeAut");
                  _jspx_th_logic_equal_25.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_25 = _jspx_th_logic_equal_25.doStartTag();
                  if (_jspx_eval_logic_equal_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_1\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_25.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_25);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_25);
                  out.write("\r\n");
                  out.write("      ");
                  if (_jspx_meth_bean_message_33(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write(" *:\r\n");
                  out.write("     </div>\r\n");
                  out.write("  </td>\r\n");
                  out.write("  <td class=\"text\" align=\"left\">\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_26 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_26.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_26.setValue("2");
                  _jspx_th_logic_equal_26.setProperty("changeAut");
                  _jspx_th_logic_equal_26.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_26 = _jspx_th_logic_equal_26.doStartTag();
                  if (_jspx_eval_logic_equal_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_2\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_26.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_26);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_26);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_27 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_27.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_27.setValue("0");
                  _jspx_th_logic_equal_27.setProperty("changeAut");
                  _jspx_th_logic_equal_27.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_27 = _jspx_th_logic_equal_27.doStartTag();
                  if (_jspx_eval_logic_equal_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_2\" style=\"display: inline\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_27.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_27);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_27);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_28 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_28.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_28.setValue("1");
                  _jspx_th_logic_equal_28.setProperty("changeAut");
                  _jspx_th_logic_equal_28.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_28 = _jspx_th_logic_equal_28.doStartTag();
                  if (_jspx_eval_logic_equal_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_2\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_28.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_28);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_28);
                  out.write("\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_text_5(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("      <img src=\"images/quest.gif\" width=\"15\" height=\"15\"  style=\"cursor:pointer;\" title=\"");
                  if (_jspx_meth_bean_message_34(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\"/>\r\n");
                  out.write("      <!--Buton cauta in LDAP-->\r\n");
                  out.write("      <input type=\"button\" class=\"btn-generic\" value='");
                  if (_jspx_meth_bean_message_35(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("'   onclick=\"javascript: showListLDAP();\"/>\r\n");
                  out.write("     </div>\r\n");
                  out.write("   </td>\r\n");
                  out.write("</tr>\r\n");
                  out.write("<!--campul 'issuer_name' -->\r\n");
                  out.write(" ");
                  if (_jspx_meth_html_hidden_14(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("<tr>\r\n");
                  out.write(" <td align=\"right\" class=\"label\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_29 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_29.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_29.setValue("2");
                  _jspx_th_logic_equal_29.setProperty("changeAut");
                  _jspx_th_logic_equal_29.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_29 = _jspx_th_logic_equal_29.doStartTag();
                  if (_jspx_eval_logic_equal_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div style=\"display: none\" id=\"div_tr_iss_1\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_29.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_29);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_29);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_30 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_30.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_30.setValue("0");
                  _jspx_th_logic_equal_30.setProperty("changeAut");
                  _jspx_th_logic_equal_30.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_30 = _jspx_th_logic_equal_30.doStartTag();
                  if (_jspx_eval_logic_equal_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div style=\"display: inline\" id=\"div_tr_iss_1\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_30.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_30);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_30);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_31 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_31.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_31.setValue("1");
                  _jspx_th_logic_equal_31.setProperty("changeAut");
                  _jspx_th_logic_equal_31.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_31 = _jspx_th_logic_equal_31.doStartTag();
                  if (_jspx_eval_logic_equal_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div style=\"display: none\" id=\"div_tr_iss_1\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_31.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_31);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_31);
                  out.write("\r\n");
                  out.write("        ");
                  if (_jspx_meth_bean_message_36(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write(" *:\r\n");
                  out.write("     </div>\r\n");
                  out.write("  </td>\r\n");
                  out.write("  <td align=\"left\" class=\"text\" id=\"el_1\" >\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_32 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_32.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_32.setValue("2");
                  _jspx_th_logic_equal_32.setProperty("changeAut");
                  _jspx_th_logic_equal_32.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_32 = _jspx_th_logic_equal_32.doStartTag();
                  if (_jspx_eval_logic_equal_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div style=\"display: none\" id=\"div_tr_iss_2\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_32.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_32);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_32);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_33 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_33.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_33.setValue("0");
                  _jspx_th_logic_equal_33.setProperty("changeAut");
                  _jspx_th_logic_equal_33.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_33 = _jspx_th_logic_equal_33.doStartTag();
                  if (_jspx_eval_logic_equal_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div style=\"display: inline\" id=\"div_tr_iss_2\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_33.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_33);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_33);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_34 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_34.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_34.setValue("1");
                  _jspx_th_logic_equal_34.setProperty("changeAut");
                  _jspx_th_logic_equal_34.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_34 = _jspx_th_logic_equal_34.doStartTag();
                  if (_jspx_eval_logic_equal_34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div style=\"display: none\" id=\"div_tr_iss_2\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_34.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_34);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_34);
                  out.write("\r\n");
                  out.write("       ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_5 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_write_5.setPageContext(_jspx_page_context);
                  _jspx_th_bean_write_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_bean_write_5.setName(Constants.ADM_USER_EXT_KEY);
                  _jspx_th_bean_write_5.setProperty("issuer_name_n");
                  int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
                  if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
                    return;
                  }
                  _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
                  out.write("\r\n");
                  out.write("     </div>\r\n");
                  out.write("  </td>\r\n");
                  out.write("</tr>\r\n");
                  out.write("<!--campul 'serial_number' -->\r\n");
                  out.write("   ");
                  if (_jspx_meth_html_hidden_15(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("<tr>\r\n");
                  out.write(" <td align=\"right\" class=\"label\">\r\n");
                  out.write("  ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_35 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_35.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_35.setValue("2");
                  _jspx_th_logic_equal_35.setProperty("changeAut");
                  _jspx_th_logic_equal_35.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_35 = _jspx_th_logic_equal_35.doStartTag();
                  if (_jspx_eval_logic_equal_35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: none\" id=\"div_tr_sn_1\">\r\n");
                      out.write("  ");
                      int evalDoAfterBody = _jspx_th_logic_equal_35.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_35);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_35);
                  out.write("\r\n");
                  out.write("  ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_36 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_36.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_36.setValue("0");
                  _jspx_th_logic_equal_36.setProperty("changeAut");
                  _jspx_th_logic_equal_36.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_36 = _jspx_th_logic_equal_36.doStartTag();
                  if (_jspx_eval_logic_equal_36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: inline\" id=\"div_tr_sn_1\">\r\n");
                      out.write("  ");
                      int evalDoAfterBody = _jspx_th_logic_equal_36.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_36);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_36);
                  out.write("\r\n");
                  out.write("  ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_37 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_37.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_37.setValue("1");
                  _jspx_th_logic_equal_37.setProperty("changeAut");
                  _jspx_th_logic_equal_37.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_37 = _jspx_th_logic_equal_37.doStartTag();
                  if (_jspx_eval_logic_equal_37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: none\" id=\"div_tr_sn_1\">\r\n");
                      out.write("  ");
                      int evalDoAfterBody = _jspx_th_logic_equal_37.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_37);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_37);
                  out.write("\r\n");
                  out.write("      ");
                  if (_jspx_meth_bean_message_37(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write(" *:\r\n");
                  out.write("    </div>\r\n");
                  out.write(" </td>\r\n");
                  out.write(" <td align=\"left\" class=\"text\" id=\"el_2\" >\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_38 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_38.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_38.setValue("2");
                  _jspx_th_logic_equal_38.setProperty("changeAut");
                  _jspx_th_logic_equal_38.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_38 = _jspx_th_logic_equal_38.doStartTag();
                  if (_jspx_eval_logic_equal_38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: none\" id=\"div_tr_sn_2\">\r\n");
                      out.write("  ");
                      int evalDoAfterBody = _jspx_th_logic_equal_38.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_38);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_38);
                  out.write("\r\n");
                  out.write("  ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_39 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_39.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_39.setValue("0");
                  _jspx_th_logic_equal_39.setProperty("changeAut");
                  _jspx_th_logic_equal_39.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_39 = _jspx_th_logic_equal_39.doStartTag();
                  if (_jspx_eval_logic_equal_39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: inline\" id=\"div_tr_sn_2\">\r\n");
                      out.write("  ");
                      int evalDoAfterBody = _jspx_th_logic_equal_39.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_39);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_39);
                  out.write("\r\n");
                  out.write("  ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_40 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_40.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_40.setValue("1");
                  _jspx_th_logic_equal_40.setProperty("changeAut");
                  _jspx_th_logic_equal_40.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_40 = _jspx_th_logic_equal_40.doStartTag();
                  if (_jspx_eval_logic_equal_40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: none\" id=\"div_tr_sn_2\">\r\n");
                      out.write("  ");
                      int evalDoAfterBody = _jspx_th_logic_equal_40.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_40);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_40);
                  out.write("\r\n");
                  out.write("       ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_6 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_write_6.setPageContext(_jspx_page_context);
                  _jspx_th_bean_write_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_bean_write_6.setName(Constants.ADM_USER_EXT_KEY);
                  _jspx_th_bean_write_6.setProperty("serial_number_n");
                  int _jspx_eval_bean_write_6 = _jspx_th_bean_write_6.doStartTag();
                  if (_jspx_th_bean_write_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
                    return;
                  }
                  _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
                  out.write("\r\n");
                  out.write("  </td>\r\n");
                  out.write("</tr>\r\n");
                  out.write("<!-- Cimpul 'user_passwd' field. -->\r\n");
                  out.write("<input type=\"hidden\" name=\"label_password\" value=' ");
                  if (_jspx_meth_bean_message_38(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("'/>\r\n");
                  out.write("<input type=\"hidden\" name=\"label_c_password\" value='");
                  if (_jspx_meth_bean_message_39(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("'/>\r\n");
                  out.write("<tr>\r\n");
                  out.write(" <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_41 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_41.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_41.setValue("2");
                  _jspx_th_logic_equal_41.setProperty("changeAut");
                  _jspx_th_logic_equal_41.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_41 = _jspx_th_logic_equal_41.doStartTag();
                  if (_jspx_eval_logic_equal_41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: none\" id=\"div_tr_pw_1\" >\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_41.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_41);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_41);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_42 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_42.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_42.setValue("0");
                  _jspx_th_logic_equal_42.setProperty("changeAut");
                  _jspx_th_logic_equal_42.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_42 = _jspx_th_logic_equal_42.doStartTag();
                  if (_jspx_eval_logic_equal_42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: none\" id=\"div_tr_pw_1\" >\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_42.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_42);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_42);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_43 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_43.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_43.setValue("1");
                  _jspx_th_logic_equal_43.setProperty("changeAut");
                  _jspx_th_logic_equal_43.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_43 = _jspx_th_logic_equal_43.doStartTag();
                  if (_jspx_eval_logic_equal_43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: inline\" id=\"div_tr_pw_1\" >\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_43.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_43);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_43);
                  out.write("\r\n");
                  out.write("     ");
                  if (_jspx_meth_bean_message_40(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write(" *:\r\n");
                  out.write("    </div>\r\n");
                  out.write(" </td>\r\n");
                  out.write(" <td class=\"text\" align=\"left\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_44 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_44.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_44.setValue("2");
                  _jspx_th_logic_equal_44.setProperty("changeAut");
                  _jspx_th_logic_equal_44.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_44 = _jspx_th_logic_equal_44.doStartTag();
                  if (_jspx_eval_logic_equal_44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: none\" id=\"div_tr_pw_2\" >\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_44.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_44);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_44);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_45 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_45.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_45.setValue("0");
                  _jspx_th_logic_equal_45.setProperty("changeAut");
                  _jspx_th_logic_equal_45.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_45 = _jspx_th_logic_equal_45.doStartTag();
                  if (_jspx_eval_logic_equal_45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: none\" id=\"div_tr_pw_2\" >\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_45.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_45);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_45);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_46 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_46.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_46.setValue("1");
                  _jspx_th_logic_equal_46.setProperty("changeAut");
                  _jspx_th_logic_equal_46.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_46 = _jspx_th_logic_equal_46.doStartTag();
                  if (_jspx_eval_logic_equal_46 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    <div style=\"display: inline\" id=\"div_tr_pw_2\" >\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_46.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_46);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_46);
                  out.write("\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_password_2(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("      <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                  if (_jspx_meth_bean_message_41(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\" />\r\n");
                  out.write("    </div>\r\n");
                  out.write(" </td>\r\n");
                  out.write("</tr>\r\n");
                  out.write("<!-- Cimpul 'c_user_password' confirmare field. -->\r\n");
                  out.write("<tr>\r\n");
                  out.write("  <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_47 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_47.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_47.setValue("2");
                  _jspx_th_logic_equal_47.setProperty("changeAut");
                  _jspx_th_logic_equal_47.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_47 = _jspx_th_logic_equal_47.doStartTag();
                  if (_jspx_eval_logic_equal_47 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div style=\"display: none\" id=\"div_tr_cpw_1\" >\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_47.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_47);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_47);
                  out.write("\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_48 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_48.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_48.setValue("0");
                  _jspx_th_logic_equal_48.setProperty("changeAut");
                  _jspx_th_logic_equal_48.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_48 = _jspx_th_logic_equal_48.doStartTag();
                  if (_jspx_eval_logic_equal_48 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div style=\"display: none\" id=\"div_tr_cpw_1\" >\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_48.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_48);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_48);
                  out.write("\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_49 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_49.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_49.setValue("1");
                  _jspx_th_logic_equal_49.setProperty("changeAut");
                  _jspx_th_logic_equal_49.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_49 = _jspx_th_logic_equal_49.doStartTag();
                  if (_jspx_eval_logic_equal_49 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div style=\"display: inline\" id=\"div_tr_cpw_1\" >\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_49.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_49);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_49);
                  out.write("\r\n");
                  out.write("     ");
                  if (_jspx_meth_bean_message_42(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write(" *:\r\n");
                  out.write("    </div>\r\n");
                  out.write(" </td>\r\n");
                  out.write(" <td class=\"text\" align=\"left\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_50 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_50.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_50.setValue("2");
                  _jspx_th_logic_equal_50.setProperty("changeAut");
                  _jspx_th_logic_equal_50.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_50 = _jspx_th_logic_equal_50.doStartTag();
                  if (_jspx_eval_logic_equal_50 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div style=\"display: none\" id=\"div_tr_cpw_1\" >\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_50.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_50);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_50);
                  out.write("\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_51 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_51.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_51.setValue("0");
                  _jspx_th_logic_equal_51.setProperty("changeAut");
                  _jspx_th_logic_equal_51.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_51 = _jspx_th_logic_equal_51.doStartTag();
                  if (_jspx_eval_logic_equal_51 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div style=\"display: none\" id=\"div_tr_cpw_1\" >\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_51.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_51);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_51);
                  out.write("\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_52 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_52.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
                  _jspx_th_logic_equal_52.setValue("1");
                  _jspx_th_logic_equal_52.setProperty("changeAut");
                  _jspx_th_logic_equal_52.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_52 = _jspx_th_logic_equal_52.doStartTag();
                  if (_jspx_eval_logic_equal_52 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div style=\"display: inline\" id=\"div_tr_cpw_1\" >\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_52.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_52);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_52);
                  out.write("\r\n");
                  out.write("       ");
                  if (_jspx_meth_html_password_3(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("       <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                  if (_jspx_meth_bean_message_43(_jspx_th_logic_equal_22, _jspx_page_context))
                    return;
                  out.write("\" />\r\n");
                  out.write("     </div>\r\n");
                  out.write("  </td>\r\n");
                  out.write(" </tr>\r\n");
                  int evalDoAfterBody = _jspx_th_logic_equal_22.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_22);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_22);
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("<!--############# Start editare  mod de autentificare PW ################################-->\r\n");
              out.write("\r\n");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_53 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_equal_53.setPageContext(_jspx_page_context);
              _jspx_th_logic_equal_53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
              _jspx_th_logic_equal_53.setValue("0");
              _jspx_th_logic_equal_53.setName(Constants.ADM_USER_EXT_KEY);
              _jspx_th_logic_equal_53.setProperty("values.cd");
              int _jspx_eval_logic_equal_53 = _jspx_th_logic_equal_53.doStartTag();
              if (_jspx_eval_logic_equal_53 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("<!--Campul user_passwd-->\r\n");
                  if (_jspx_meth_html_hidden_16(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("<!--Campul changeAut-->\r\n");
                  out.write("   <tr>\r\n");
                  out.write("    <td align=\"right\" class=\"label\" >\r\n");
                  out.write("      ");
                  if (_jspx_meth_bean_message_44(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("    </td>\r\n");
                  out.write("    <td align=\"left\">\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_radio_3(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("    </td>\r\n");
                  out.write("   </tr>\r\n");
                  out.write("   <tr>\r\n");
                  out.write("    <td align=\"right\" class=\"label\" >\r\n");
                  out.write("      ");
                  if (_jspx_meth_bean_message_45(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("    </td>\r\n");
                  out.write("    <td align=\"left\">\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_radio_4(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("    </td>\r\n");
                  out.write("   </tr>\r\n");
                  out.write("   <tr>\r\n");
                  out.write("    <td align=\"right\" class=\"label\" >\r\n");
                  out.write("      ");
                  if (_jspx_meth_bean_message_46(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write(" :\r\n");
                  out.write("    </td>\r\n");
                  out.write("    <td align=\"left\">\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_radio_5(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("    </td>\r\n");
                  out.write("   </tr>\r\n");
                  out.write("\r\n");
                  out.write("<!-- campul dupa care caut in ldap -->\r\n");
                  out.write("<tr>\r\n");
                  out.write(" <td align=\"right\" class=\"label\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_54 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_54.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_54.setValue("2");
                  _jspx_th_logic_equal_54.setProperty("changeAut");
                  _jspx_th_logic_equal_54.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_54 = _jspx_th_logic_equal_54.doStartTag();
                  if (_jspx_eval_logic_equal_54 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_1\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_54.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_54);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_54);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_55 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_55.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_55.setValue("0");
                  _jspx_th_logic_equal_55.setProperty("changeAut");
                  _jspx_th_logic_equal_55.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_55 = _jspx_th_logic_equal_55.doStartTag();
                  if (_jspx_eval_logic_equal_55 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_1\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_55.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_55);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_55);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_56 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_56.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_56.setValue("1");
                  _jspx_th_logic_equal_56.setProperty("changeAut");
                  _jspx_th_logic_equal_56.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_56 = _jspx_th_logic_equal_56.doStartTag();
                  if (_jspx_eval_logic_equal_56 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_1\" style=\"display: inline\">\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_56.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_56);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_56);
                  out.write("\r\n");
                  out.write("      ");
                  if (_jspx_meth_bean_message_47(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write(" *:\r\n");
                  out.write("     </div>\r\n");
                  out.write(" </td>\r\n");
                  out.write(" <td class=\"text\" align=\"left\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_57 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_57.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_57.setValue("2");
                  _jspx_th_logic_equal_57.setProperty("changeAut");
                  _jspx_th_logic_equal_57.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_57 = _jspx_th_logic_equal_57.doStartTag();
                  if (_jspx_eval_logic_equal_57 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_2\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_57.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_57);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_57);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_58 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_58.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_58.setValue("0");
                  _jspx_th_logic_equal_58.setProperty("changeAut");
                  _jspx_th_logic_equal_58.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_58 = _jspx_th_logic_equal_58.doStartTag();
                  if (_jspx_eval_logic_equal_58 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_2\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_58.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_58);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_58);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_59 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_59.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_59.setValue("1");
                  _jspx_th_logic_equal_59.setProperty("changeAut");
                  _jspx_th_logic_equal_59.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_59 = _jspx_th_logic_equal_59.doStartTag();
                  if (_jspx_eval_logic_equal_59 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_btn_2\" style=\"display: inline\">\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_59.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_59);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_59);
                  out.write("\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_text_6(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("      <img src=\"images/quest.gif\" width=\"15\" height=\"15\"  style=\"cursor:pointer;\" title=\"");
                  if (_jspx_meth_bean_message_48(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\"/>\r\n");
                  out.write("<!--Buton cauta in LDAP-->\r\n");
                  out.write("      <input type=\"button\" class=\"btn-generic\" value='");
                  if (_jspx_meth_bean_message_49(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("'   onclick=\"javascript: showListLDAP();\"/>\r\n");
                  out.write("    </div>\r\n");
                  out.write(" </td>\r\n");
                  out.write("</tr>\r\n");
                  out.write("<!--campul 'issuer_name' -->\r\n");
                  if (_jspx_meth_html_hidden_17(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("<tr>\r\n");
                  out.write(" <td align=\"right\" class=\"label\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_60 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_60.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_60.setValue("2");
                  _jspx_th_logic_equal_60.setProperty("changeAut");
                  _jspx_th_logic_equal_60.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_60 = _jspx_th_logic_equal_60.doStartTag();
                  if (_jspx_eval_logic_equal_60 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_iss_1\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_60.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_60);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_60);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_61 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_61.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_61.setValue("0");
                  _jspx_th_logic_equal_61.setProperty("changeAut");
                  _jspx_th_logic_equal_61.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_61 = _jspx_th_logic_equal_61.doStartTag();
                  if (_jspx_eval_logic_equal_61 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_iss_1\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_61.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_61);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_61);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_62 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_62.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_62.setValue("1");
                  _jspx_th_logic_equal_62.setProperty("changeAut");
                  _jspx_th_logic_equal_62.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_62 = _jspx_th_logic_equal_62.doStartTag();
                  if (_jspx_eval_logic_equal_62 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_iss_1\" style=\"display: inline\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_62.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_62);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_62);
                  out.write("\r\n");
                  out.write("     ");
                  if (_jspx_meth_bean_message_50(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write(" *:\r\n");
                  out.write("    </div>\r\n");
                  out.write(" </td>\r\n");
                  out.write(" <td align=\"left\" class=\"text\" id=\"el_1\" >\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_63 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_63.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_63.setValue("2");
                  _jspx_th_logic_equal_63.setProperty("changeAut");
                  _jspx_th_logic_equal_63.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_63 = _jspx_th_logic_equal_63.doStartTag();
                  if (_jspx_eval_logic_equal_63 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_iss_2\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_63.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_63);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_63);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_64 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_64.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_64.setValue("0");
                  _jspx_th_logic_equal_64.setProperty("changeAut");
                  _jspx_th_logic_equal_64.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_64 = _jspx_th_logic_equal_64.doStartTag();
                  if (_jspx_eval_logic_equal_64 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_iss_2\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_64.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_64);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_64);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_65 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_65.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_65.setValue("1");
                  _jspx_th_logic_equal_65.setProperty("changeAut");
                  _jspx_th_logic_equal_65.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_65 = _jspx_th_logic_equal_65.doStartTag();
                  if (_jspx_eval_logic_equal_65 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_iss_2\" style=\"display: inline\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_65.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_65);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_65);
                  out.write("\r\n");
                  out.write("      ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_7 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_write_7.setPageContext(_jspx_page_context);
                  _jspx_th_bean_write_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_bean_write_7.setName(Constants.ADM_USER_EXT_KEY);
                  _jspx_th_bean_write_7.setProperty("values.issuer_name");
                  int _jspx_eval_bean_write_7 = _jspx_th_bean_write_7.doStartTag();
                  if (_jspx_th_bean_write_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_7);
                    return;
                  }
                  _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_7);
                  out.write("\r\n");
                  out.write("    </div>\r\n");
                  out.write(" </td>\r\n");
                  out.write("</tr>\r\n");
                  out.write("<!--campul 'serial_number' -->\r\n");
                  out.write("   ");
                  if (_jspx_meth_html_hidden_18(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("<tr>\r\n");
                  out.write(" <td align=\"right\" class=\"label\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_66 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_66.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_66.setValue("2");
                  _jspx_th_logic_equal_66.setProperty("changeAut");
                  _jspx_th_logic_equal_66.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_66 = _jspx_th_logic_equal_66.doStartTag();
                  if (_jspx_eval_logic_equal_66 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_sn_1\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_66.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_66);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_66);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_67 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_67.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_67.setValue("0");
                  _jspx_th_logic_equal_67.setProperty("changeAut");
                  _jspx_th_logic_equal_67.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_67 = _jspx_th_logic_equal_67.doStartTag();
                  if (_jspx_eval_logic_equal_67 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_sn_1\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_67.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_67);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_67);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_68 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_68.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_68.setValue("1");
                  _jspx_th_logic_equal_68.setProperty("changeAut");
                  _jspx_th_logic_equal_68.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_68 = _jspx_th_logic_equal_68.doStartTag();
                  if (_jspx_eval_logic_equal_68 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_sn_1\" style=\"display: inline\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_68.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_68);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_68);
                  out.write("\r\n");
                  out.write("      ");
                  if (_jspx_meth_bean_message_51(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write(" *:\r\n");
                  out.write("    </div>\r\n");
                  out.write("  </td>\r\n");
                  out.write("  <td align=\"left\" class=\"text\" id=\"el_2\" >\r\n");
                  out.write("     ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_69 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_69.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_69.setValue("2");
                  _jspx_th_logic_equal_69.setProperty("changeAut");
                  _jspx_th_logic_equal_69.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_69 = _jspx_th_logic_equal_69.doStartTag();
                  if (_jspx_eval_logic_equal_69 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_sn_2\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_69.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_69);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_69);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_70 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_70.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_70.setValue("0");
                  _jspx_th_logic_equal_70.setProperty("changeAut");
                  _jspx_th_logic_equal_70.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_70 = _jspx_th_logic_equal_70.doStartTag();
                  if (_jspx_eval_logic_equal_70 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_sn_2\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_70.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_70);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_70);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_71 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_71.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_71.setValue("1");
                  _jspx_th_logic_equal_71.setProperty("changeAut");
                  _jspx_th_logic_equal_71.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_71 = _jspx_th_logic_equal_71.doStartTag();
                  if (_jspx_eval_logic_equal_71 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("     <div id=\"div_tr_sn_2\" style=\"display: inline\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_71.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_71);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_71);
                  out.write("\r\n");
                  out.write("       ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_8 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_write_8.setPageContext(_jspx_page_context);
                  _jspx_th_bean_write_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_bean_write_8.setName(Constants.ADM_USER_EXT_KEY);
                  _jspx_th_bean_write_8.setProperty("values.serial_number");
                  int _jspx_eval_bean_write_8 = _jspx_th_bean_write_8.doStartTag();
                  if (_jspx_th_bean_write_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_8);
                    return;
                  }
                  _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_8);
                  out.write("\r\n");
                  out.write("     </div>\r\n");
                  out.write("  </td>\r\n");
                  out.write("</tr>\r\n");
                  out.write("<!-- Cimpul 'user_password_n' field. -->\r\n");
                  out.write("<input type=\"hidden\" name=\"label_password\" value=' ");
                  if (_jspx_meth_bean_message_52(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("'/>\r\n");
                  out.write("<input type=\"hidden\" name=\"label_c_password\" value='");
                  if (_jspx_meth_bean_message_53(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("'/>\r\n");
                  out.write("<tr>\r\n");
                  out.write(" <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_72 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_72.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_72.setValue("2");
                  _jspx_th_logic_equal_72.setProperty("changeAut");
                  _jspx_th_logic_equal_72.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_72 = _jspx_th_logic_equal_72.doStartTag();
                  if (_jspx_eval_logic_equal_72 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_pw_1\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_72.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_72);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_72);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_73 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_73.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_73.setValue("0");
                  _jspx_th_logic_equal_73.setProperty("changeAut");
                  _jspx_th_logic_equal_73.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_73 = _jspx_th_logic_equal_73.doStartTag();
                  if (_jspx_eval_logic_equal_73 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_pw_1\" style=\"display: inline\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_73.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_73);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_73);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_74 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_74.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_74.setValue("1");
                  _jspx_th_logic_equal_74.setProperty("changeAut");
                  _jspx_th_logic_equal_74.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_74 = _jspx_th_logic_equal_74.doStartTag();
                  if (_jspx_eval_logic_equal_74 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_pw_1\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_74.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_74);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_74);
                  out.write("\r\n");
                  out.write("       ");
                  if (_jspx_meth_bean_message_54(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write(" *:\r\n");
                  out.write("      </div>\r\n");
                  out.write(" </td>\r\n");
                  out.write(" <td class=\"text\" align=\"left\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_75 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_75.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_75.setValue("2");
                  _jspx_th_logic_equal_75.setProperty("changeAut");
                  _jspx_th_logic_equal_75.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_75 = _jspx_th_logic_equal_75.doStartTag();
                  if (_jspx_eval_logic_equal_75 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_pw_2\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_75.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_75);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_75);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_76 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_76.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_76.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_76.setValue("0");
                  _jspx_th_logic_equal_76.setProperty("changeAut");
                  _jspx_th_logic_equal_76.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_76 = _jspx_th_logic_equal_76.doStartTag();
                  if (_jspx_eval_logic_equal_76 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_pw_2\" style=\"display: inline\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_76.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_76);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_76);
                  out.write("\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_77 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_77.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_77.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_77.setValue("1");
                  _jspx_th_logic_equal_77.setProperty("changeAut");
                  _jspx_th_logic_equal_77.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_77 = _jspx_th_logic_equal_77.doStartTag();
                  if (_jspx_eval_logic_equal_77 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_pw_2\" style=\"display: none\">\r\n");
                      out.write("   ");
                      int evalDoAfterBody = _jspx_th_logic_equal_77.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_77);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_77);
                  out.write("\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_password_4(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("      <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                  if (_jspx_meth_bean_message_55(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\" />\r\n");
                  out.write("     </div>\r\n");
                  out.write(" </td>\r\n");
                  out.write("</tr>\r\n");
                  out.write(" <!-- Cimpul 'c_user_password' confirmare field. -->\r\n");
                  out.write("<tr>\r\n");
                  out.write("  <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_78 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_78.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_78.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_78.setValue("2");
                  _jspx_th_logic_equal_78.setProperty("changeAut");
                  _jspx_th_logic_equal_78.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_78 = _jspx_th_logic_equal_78.doStartTag();
                  if (_jspx_eval_logic_equal_78 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_cpw_1\" style=\"display: none\">\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_78.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_78);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_78);
                  out.write("\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_79 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_79.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_79.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_79.setValue("0");
                  _jspx_th_logic_equal_79.setProperty("changeAut");
                  _jspx_th_logic_equal_79.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_79 = _jspx_th_logic_equal_79.doStartTag();
                  if (_jspx_eval_logic_equal_79 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_cpw_1\" style=\"display: inline\">\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_79.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_79);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_79);
                  out.write("\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_80 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_80.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_80.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_80.setValue("1");
                  _jspx_th_logic_equal_80.setProperty("changeAut");
                  _jspx_th_logic_equal_80.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_80 = _jspx_th_logic_equal_80.doStartTag();
                  if (_jspx_eval_logic_equal_80 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_cpw_1\" style=\"display: none\">\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_80.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_80);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_80);
                  out.write("\r\n");
                  out.write("       ");
                  if (_jspx_meth_bean_message_56(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write(" *:\r\n");
                  out.write("     </div>\r\n");
                  out.write(" </td>\r\n");
                  out.write(" <td class=\"text\" align=\"left\">\r\n");
                  out.write("   ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_81 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_81.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_81.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_81.setValue("2");
                  _jspx_th_logic_equal_81.setProperty("changeAut");
                  _jspx_th_logic_equal_81.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_81 = _jspx_th_logic_equal_81.doStartTag();
                  if (_jspx_eval_logic_equal_81 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_cpw_2\" style=\"display: none\">\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_81.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_81);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_81);
                  out.write("\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_82 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_82.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_82.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_82.setValue("0");
                  _jspx_th_logic_equal_82.setProperty("changeAut");
                  _jspx_th_logic_equal_82.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_82 = _jspx_th_logic_equal_82.doStartTag();
                  if (_jspx_eval_logic_equal_82 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_cpw_2\" style=\"display: inline\">\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_82.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_82);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_82);
                  out.write("\r\n");
                  out.write("    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_83 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_equal_83.setPageContext(_jspx_page_context);
                  _jspx_th_logic_equal_83.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
                  _jspx_th_logic_equal_83.setValue("1");
                  _jspx_th_logic_equal_83.setProperty("changeAut");
                  _jspx_th_logic_equal_83.setName(Constants.ADM_USER_EXT_KEY);
                  int _jspx_eval_logic_equal_83 = _jspx_th_logic_equal_83.doStartTag();
                  if (_jspx_eval_logic_equal_83 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("      <div id=\"div_tr_cpw_2\" style=\"display: none\">\r\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_logic_equal_83.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_equal_83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_83);
                    return;
                  }
                  _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_83);
                  out.write("\r\n");
                  out.write("      ");
                  if (_jspx_meth_html_password_5(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("      <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
                  if (_jspx_meth_bean_message_57(_jspx_th_logic_equal_53, _jspx_page_context))
                    return;
                  out.write("\" />\r\n");
                  out.write("    </div>\r\n");
                  out.write("  </td>\r\n");
                  out.write(" </tr>\r\n");
                  int evalDoAfterBody = _jspx_th_logic_equal_53.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_equal_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_53);
                return;
              }
              _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_53);
              out.write("\r\n");
              out.write("\r\n");
              int evalDoAfterBody = _jspx_th_logic_notEmpty_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_1);
            return;
          }
          _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_1);
          out.write("\r\n");
          out.write("<!--############## End editare mod de autentificare ##########################-->\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<tr class=\"even\">\r\n");
          out.write("  <td class=\"label\" colspan=\"2\" >\r\n");
          out.write("    <b>");
          if (_jspx_meth_bean_message_58(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</b>\r\n");
          out.write("   </td>\r\n");
          out.write("</tr>\r\n");
          out.write("      <!-- Cimpul 'bi' buletin informativ field. -->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_19(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <tr>\r\n");
          out.write("       <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("         ");
          if (_jspx_meth_bean_message_59(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" :\r\n");
          out.write("       </td>\r\n");
          out.write("       <td class=\"text\" align=\"left\" valign=\"top\">\r\n");
          out.write("        <input type=\"checkbox\" id=\"bi_boo\" onclick=\"javascript: initChb('bi_boo','bi');\"/>\r\n");
          out.write("       <script type=\"text/javascript\">\r\n");
          out.write("          if (document.getElementById(\"bi\").value == \"1\") {\r\n");
          out.write("              document.getElementById(\"bi_boo\").checked = true;\r\n");
          out.write("          }\r\n");
          out.write("        </script>\r\n");
          out.write("        <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_60(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("       </td>\r\n");
          out.write("      </tr>\r\n");
          out.write("      <tr class=\"even\" >\r\n");
          out.write("       <td class=\"label\" colspan=\"2\" >\r\n");
          out.write("        <b>");
          if (_jspx_meth_bean_message_61(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</b>\r\n");
          out.write("       </td>\r\n");
          out.write("      </tr>\r\n");
          out.write("      <!-- Cimpul 'stiri' field. -->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_20(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <tr>\r\n");
          out.write("        <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("         ");
          if (_jspx_meth_bean_message_62(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" :\r\n");
          out.write("        </td>\r\n");
          out.write("        <td class=\"text\" align=\"left\" valign=\"top\">\r\n");
          out.write("        <input type=\"checkbox\" id=\"stiri_boo\" onclick=\"javascript: initChb('stiri_boo','stiri');\"/>\r\n");
          out.write("       <script type=\"text/javascript\">\r\n");
          out.write("          if (document.getElementById(\"stiri\").value == \"1\") {\r\n");
          out.write("              document.getElementById(\"stiri_boo\").checked = true;\r\n");
          out.write("          }\r\n");
          out.write("        </script>\r\n");
          out.write("        <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_63(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("       </td>\r\n");
          out.write("      </tr>\r\n");
          out.write("      <!-- Cimpul 'sig_port' field. -->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_21(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <tr>\r\n");
          out.write("       <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("        ");
          if (_jspx_meth_bean_message_64(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" :\r\n");
          out.write("       </td>\r\n");
          out.write("       <td class=\"text\" align=\"left\" valign=\"top\">\r\n");
          out.write("        <input type=\"checkbox\" id=\"sig_port_boo\" onclick=\"javascript: initChb('sig_port_boo','sig_port');\"/>\r\n");
          out.write("       <script type=\"text/javascript\">\r\n");
          out.write("          if (document.getElementById(\"sig_port\").value == \"1\") {\r\n");
          out.write("              document.getElementById(\"sig_port_boo\").checked = true;\r\n");
          out.write("          }\r\n");
          out.write("        </script>\r\n");
          out.write("         <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_65(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("       </td>\r\n");
          out.write("      </tr>\r\n");
          out.write("      <!-- Cimpul 'prot_med' field. -->\r\n");
          out.write("      ");
          if (_jspx_meth_html_hidden_22(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      <tr>\r\n");
          out.write("        <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("          ");
          if (_jspx_meth_bean_message_66(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" :\r\n");
          out.write("        </td>\r\n");
          out.write("        <td class=\"text\" align=\"left\" valign=\"top\">\r\n");
          out.write("        <input type=\"checkbox\" id=\"prot_med_boo\" onclick=\"javascript: initChb('prot_med_boo','prot_med');\"/>\r\n");
          out.write("       <script type=\"text/javascript\">\r\n");
          out.write("          if (document.getElementById(\"prot_med\").value == \"1\") {\r\n");
          out.write("              document.getElementById(\"prot_med_boo\").checked = true;\r\n");
          out.write("          }\r\n");
          out.write("        </script>\r\n");
          out.write("         <img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_67(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("       </td>\r\n");
          out.write("      </tr>\r\n");
          out.write("      <!-- Cimpul 'fk_limba' field. -->\r\n");
          out.write(" <tr>\r\n");
          out.write("   <td valign=\"top\" class=\"label\" align=\"right\">\r\n");
          out.write("    ");
          if (_jspx_meth_bean_message_68(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" *:\r\n");
          out.write("   </td>\r\n");
          out.write("   <td class=\"text\" align=\"left\">\r\n");
          out.write("\t\t ");
          if (_jspx_meth_selection_selectionComponent_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("   </td>\r\n");
          out.write(" </tr>\r\n");
          out.write('\r');
          out.write('\n');
          out.write('\r');
          out.write('\n');
          out.write('\r');
          out.write('\n');
          out.write('\r');
          out.write('\n');
          out.write("\r\n");
          out.write("  <!-- START Sectiune de BUTOANE. -->\r\n");
          out.write("  ");
          //  logic:empty
          org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_2 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_scope_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
          _jspx_th_logic_empty_2.setPageContext(_jspx_page_context);
          _jspx_th_logic_empty_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_empty_2.setName(Constants.ADM_USER_EXT_KEY);
          _jspx_th_logic_empty_2.setProperty("values.primaryKey");
          _jspx_th_logic_empty_2.setScope("request");
          int _jspx_eval_logic_empty_2 = _jspx_th_logic_empty_2.doStartTag();
          if (_jspx_eval_logic_empty_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("  <!-- Buton adugare. -->\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td colspan=\"2\" class=\"button-row\" align=\"center\">\r\n");
              out.write("      ");
              if (_jspx_meth_html_submit_0(_jspx_th_logic_empty_2, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("      ");
              if (_jspx_meth_html_hidden_23(_jspx_th_logic_empty_2, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    </td>\r\n");
              out.write("  </tr>\r\n");
              int evalDoAfterBody = _jspx_th_logic_empty_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_empty_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_2);
            return;
          }
          _jspx_tagPool_logic_empty_scope_property_name.reuse(_jspx_th_logic_empty_2);
          out.write('\r');
          out.write('\n');
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_2 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_scope_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_2.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEmpty_2.setName(Constants.ADM_USER_EXT_KEY);
          _jspx_th_logic_notEmpty_2.setProperty("values.primaryKey");
          _jspx_th_logic_notEmpty_2.setScope("request");
          int _jspx_eval_logic_notEmpty_2 = _jspx_th_logic_notEmpty_2.doStartTag();
          if (_jspx_eval_logic_notEmpty_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("<!-- buton modificare. -->\r\n");
              out.write("<tr>\r\n");
              out.write("  <td colspan=\"2\" class=\"button-row\" align=\"center\">\r\n");
              out.write("    ");
              if (_jspx_meth_html_submit_1(_jspx_th_logic_notEmpty_2, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_hidden_24(_jspx_th_logic_notEmpty_2, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("  </td>\r\n");
              out.write("</tr>\r\n");
              int evalDoAfterBody = _jspx_th_logic_notEmpty_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_2);
            return;
          }
          _jspx_tagPool_logic_notEmpty_scope_property_name.reuse(_jspx_th_logic_notEmpty_2);
          out.write("\r\n");
          out.write("<!-- END Sectiune de BUTOANE. -->\r\n");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_onsubmit_action.reuse(_jspx_th_html_form_0);
        return;
      }
      _jspx_tagPool_html_form_onsubmit_action.reuse(_jspx_th_html_form_0);
      out.write("\r\n");
      out.write("<!-- END Sectiune de FORM. -->\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Validare cimpuri forma. -->\r\n");
      if (_jspx_meth_html_javascript_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script language=\"Javascript1.1\" src=\"staticJavascript.jsp\"></script>\r\n");
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

  private boolean _jspx_meth_bean_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_0);
    _jspx_th_bean_message_0.setBundle("admuserext");
    _jspx_th_bean_message_0.setKey("adm_user_ext.title.add");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
    _jspx_th_bean_message_1.setBundle("admuserext");
    _jspx_th_bean_message_1.setKey("adm_user_ext.title.save");
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
    _jspx_th_bean_message_2.setBundle("admuserext");
    _jspx_th_bean_message_2.setKey("adm_user_ext.label.closeWindow");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_messages_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_messages_0);
    _jspx_th_bean_write_0.setName("error");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_0);
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
    _jspx_th_html_hidden_1.setProperty("values.id_user_ext");
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
    _jspx_th_html_hidden_2.setProperty("values.fk_user");
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
    _jspx_th_html_hidden_3.setProperty("values.account_creation_dateString");
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
    _jspx_th_html_hidden_4.setProperty("values.account_deletion_dateString");
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
    _jspx_th_html_hidden_5.setProperty("values.logged");
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
    _jspx_th_html_hidden_6.setProperty("values.user_type");
    int _jspx_eval_html_hidden_6 = _jspx_th_html_hidden_6.doStartTag();
    if (_jspx_th_html_hidden_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_6);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_6);
    return false;
  }

  private boolean _jspx_meth_bean_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_3.setBundle("admuserinreg");
    _jspx_th_bean_message_3.setKey("adm_user_inreg.prompt.user_login");
    int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
    if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("values.user_login");
    _jspx_th_html_text_0.setStyleClass("field_input");
    _jspx_th_html_text_0.setMaxlength("25");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_4.setBundle("admuserinreg");
    _jspx_th_bean_message_4.setKey("adm_user_inreg.label.tooltip.user_login");
    int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
    if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_5.setBundle("admuserinreg");
    _jspx_th_bean_message_5.setKey("adm_user_inreg.prompt.nume_user");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setStyleClass("field_input");
    _jspx_th_html_text_1.setProperty("values.nume");
    _jspx_th_html_text_1.setMaxlength("100");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_6.setBundle("admuserinreg");
    _jspx_th_bean_message_6.setKey("adm_user_inreg.label.tooltip.nume_user");
    int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
    if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_6);
    return false;
  }

  private boolean _jspx_meth_bean_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_7 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_7.setBundle("admuserinreg");
    _jspx_th_bean_message_7.setKey("adm_user_inreg.prompt.prenume_user");
    int _jspx_eval_bean_message_7 = _jspx_th_bean_message_7.doStartTag();
    if (_jspx_th_bean_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_7);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_2.setStyleClass("field_input");
    _jspx_th_html_text_2.setProperty("values.prenume");
    _jspx_th_html_text_2.setMaxlength("100");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_8 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_8.setBundle("admuserinreg");
    _jspx_th_bean_message_8.setKey("adm_user_inreg.label.tooltip.prenume_user");
    int _jspx_eval_bean_message_8 = _jspx_th_bean_message_8.doStartTag();
    if (_jspx_th_bean_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
    return false;
  }

  private boolean _jspx_meth_bean_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_9 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_9.setBundle("admuserinreg");
    _jspx_th_bean_message_9.setKey("adm_user_inreg.prompt.email_user");
    int _jspx_eval_bean_message_9 = _jspx_th_bean_message_9.doStartTag();
    if (_jspx_th_bean_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_3.setStyleClass("field_input");
    _jspx_th_html_text_3.setProperty("values.email");
    _jspx_th_html_text_3.setMaxlength("100");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_text_3);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_10 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_10.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_10.setBundle("admuserinreg");
    _jspx_th_bean_message_10.setKey("adm_user_inreg.label.tooltip.email_user");
    int _jspx_eval_bean_message_10 = _jspx_th_bean_message_10.doStartTag();
    if (_jspx_th_bean_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
    return false;
  }

  private boolean _jspx_meth_html_hidden_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_7 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_7.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_7.setProperty("values.account_status");
    _jspx_th_html_hidden_7.setStyleId("account_status");
    int _jspx_eval_html_hidden_7 = _jspx_th_html_hidden_7.doStartTag();
    if (_jspx_th_html_hidden_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_7);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_7);
    return false;
  }

  private boolean _jspx_meth_bean_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_11 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_11.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_11.setBundle("admuserext");
    _jspx_th_bean_message_11.setKey("adm_user_ext.label.active_user");
    int _jspx_eval_bean_message_11 = _jspx_th_bean_message_11.doStartTag();
    if (_jspx_th_bean_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_11);
    return false;
  }

  private boolean _jspx_meth_bean_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_12 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_12.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_12.setBundle("admuserext");
    _jspx_th_bean_message_12.setKey("adm_user_ext.label.tooltip.active_user");
    int _jspx_eval_bean_message_12 = _jspx_th_bean_message_12.doStartTag();
    if (_jspx_th_bean_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_12);
    return false;
  }

  private boolean _jspx_meth_html_hidden_8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_8 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_8.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_html_hidden_8.setProperty("values.cd");
    _jspx_th_html_hidden_8.setStyleId("cd");
    int _jspx_eval_html_hidden_8 = _jspx_th_html_hidden_8.doStartTag();
    if (_jspx_th_html_hidden_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_8);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_8);
    return false;
  }

  private boolean _jspx_meth_bean_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_13 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_13.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_13.setBundle("admuserinreg");
    _jspx_th_bean_message_13.setKey("adm_user_inreg.prompt.mod_autentificare");
    int _jspx_eval_bean_message_13 = _jspx_th_bean_message_13.doStartTag();
    if (_jspx_th_bean_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_13);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_13);
    return false;
  }

  private boolean _jspx_meth_bean_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_14 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_14.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_14.setBundle("admuserinreg");
    _jspx_th_bean_message_14.setKey("adm_user_inreg.prompt.cd");
    int _jspx_eval_bean_message_14 = _jspx_th_bean_message_14.doStartTag();
    if (_jspx_th_bean_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_14);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_14);
    return false;
  }

  private boolean _jspx_meth_bean_message_15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_15 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_15.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_15.setBundle("admuserinreg");
    _jspx_th_bean_message_15.setKey("adm_user_inreg.prompt.up");
    int _jspx_eval_bean_message_15 = _jspx_th_bean_message_15.doStartTag();
    if (_jspx_th_bean_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_15);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_15);
    return false;
  }

  private boolean _jspx_meth_bean_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_16 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_16.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_16.setBundle("admuserinreg");
    _jspx_th_bean_message_16.setKey("adm_user_inreg.prompt.user_password");
    int _jspx_eval_bean_message_16 = _jspx_th_bean_message_16.doStartTag();
    if (_jspx_th_bean_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_16);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_16);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleId_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(_jspx_page_context);
    _jspx_th_html_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_html_password_0.setStyleClass("field_input");
    _jspx_th_html_password_0.setProperty("values.user_passwd");
    _jspx_th_html_password_0.setSize("30");
    _jspx_th_html_password_0.setStyleId("pw");
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleId_styleClass_size_property_nobody.reuse(_jspx_th_html_password_0);
      return true;
    }
    _jspx_tagPool_html_password_styleId_styleClass_size_property_nobody.reuse(_jspx_th_html_password_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_17 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_17.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_17.setBundle("admuserinreg");
    _jspx_th_bean_message_17.setKey("adm_user_inreg.label.tooltip.user_password");
    int _jspx_eval_bean_message_17 = _jspx_th_bean_message_17.doStartTag();
    if (_jspx_th_bean_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_17);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_17);
    return false;
  }

  private boolean _jspx_meth_bean_message_18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_18 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_18.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_18.setBundle("admuserinreg");
    _jspx_th_bean_message_18.setKey("adm_user_inreg.prompt.c_user_password");
    int _jspx_eval_bean_message_18 = _jspx_th_bean_message_18.doStartTag();
    if (_jspx_th_bean_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
    return false;
  }

  private boolean _jspx_meth_html_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_1 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleId_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_1.setPageContext(_jspx_page_context);
    _jspx_th_html_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_html_password_1.setStyleClass("field_input");
    _jspx_th_html_password_1.setProperty("c_user_password");
    _jspx_th_html_password_1.setSize("30");
    _jspx_th_html_password_1.setStyleId("cpw");
    int _jspx_eval_html_password_1 = _jspx_th_html_password_1.doStartTag();
    if (_jspx_th_html_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleId_styleClass_size_property_nobody.reuse(_jspx_th_html_password_1);
      return true;
    }
    _jspx_tagPool_html_password_styleId_styleClass_size_property_nobody.reuse(_jspx_th_html_password_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_19 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_19.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_19.setBundle("admuserinreg");
    _jspx_th_bean_message_19.setKey("adm_user_inreg.label.tooltip.c_user_password");
    int _jspx_eval_bean_message_19 = _jspx_th_bean_message_19.doStartTag();
    if (_jspx_th_bean_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
    return false;
  }

  private boolean _jspx_meth_bean_message_20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_20 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_20.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_20.setBundle("admuser");
    _jspx_th_bean_message_20.setKey("adm_user.prompt.numeldap");
    int _jspx_eval_bean_message_20 = _jspx_th_bean_message_20.doStartTag();
    if (_jspx_th_bean_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_20);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_20);
    return false;
  }

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(_jspx_page_context);
    _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_html_text_4.setErrorStyleClass("errorfield");
    _jspx_th_html_text_4.setStyleClass("field_input");
    _jspx_th_html_text_4.setProperty("numeSearchLdap");
    _jspx_th_html_text_4.setStyleId("numeSearchLdap");
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_4);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_21(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_21 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_21.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_21.setBundle("admuser");
    _jspx_th_bean_message_21.setKey("adm_user.label.tooltip.numeldap");
    int _jspx_eval_bean_message_21 = _jspx_th_bean_message_21.doStartTag();
    if (_jspx_th_bean_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_21);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_21);
    return false;
  }

  private boolean _jspx_meth_bean_message_22(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_22 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_22.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_22.setBundle("admuserinreg");
    _jspx_th_bean_message_22.setKey("adm_user_inreg.button.cauta_ldap");
    int _jspx_eval_bean_message_22 = _jspx_th_bean_message_22.doStartTag();
    if (_jspx_th_bean_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_22);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_22);
    return false;
  }

  private boolean _jspx_meth_html_hidden_9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_9 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_9.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_html_hidden_9.setProperty("values.issuer_name");
    _jspx_th_html_hidden_9.setStyleId("issuer_name");
    int _jspx_eval_html_hidden_9 = _jspx_th_html_hidden_9.doStartTag();
    if (_jspx_th_html_hidden_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_9);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_9);
    return false;
  }

  private boolean _jspx_meth_bean_message_23(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_23 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_23.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_23.setBundle("admuserinreg");
    _jspx_th_bean_message_23.setKey("adm_user_inreg.prompt.issuer_name");
    int _jspx_eval_bean_message_23 = _jspx_th_bean_message_23.doStartTag();
    if (_jspx_th_bean_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_23);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_23);
    return false;
  }

  private boolean _jspx_meth_html_hidden_10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_10 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_10.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_html_hidden_10.setProperty("values.serial_number");
    _jspx_th_html_hidden_10.setStyleId("serial_number");
    int _jspx_eval_html_hidden_10 = _jspx_th_html_hidden_10.doStartTag();
    if (_jspx_th_html_hidden_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_10);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_10);
    return false;
  }

  private boolean _jspx_meth_bean_message_24(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_24 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_24.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_1);
    _jspx_th_bean_message_24.setBundle("admuserinreg");
    _jspx_th_bean_message_24.setKey("adm_user_inreg.prompt.serial_number");
    int _jspx_eval_bean_message_24 = _jspx_th_bean_message_24.doStartTag();
    if (_jspx_th_bean_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_24);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_24);
    return false;
  }

  private boolean _jspx_meth_html_hidden_11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_11 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_11.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
    _jspx_th_html_hidden_11.setProperty("values.cd");
    int _jspx_eval_html_hidden_11 = _jspx_th_html_hidden_11.doStartTag();
    if (_jspx_th_html_hidden_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_11);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_11);
    return false;
  }

  private boolean _jspx_meth_bean_message_25(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_25 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_25.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
    _jspx_th_bean_message_25.setBundle("admuserext");
    _jspx_th_bean_message_25.setKey("adm_user_ext.prompt.mod_autentificare");
    int _jspx_eval_bean_message_25 = _jspx_th_bean_message_25.doStartTag();
    if (_jspx_th_bean_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_25);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_25);
    return false;
  }

  private boolean _jspx_meth_bean_message_26(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_26 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_26.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_20);
    _jspx_th_bean_message_26.setBundle("admuserinreg");
    _jspx_th_bean_message_26.setKey("adm_user_inreg.prompt.cd");
    int _jspx_eval_bean_message_26 = _jspx_th_bean_message_26.doStartTag();
    if (_jspx_th_bean_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_26);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_26);
    return false;
  }

  private boolean _jspx_meth_bean_message_27(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_27 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_27.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_21);
    _jspx_th_bean_message_27.setBundle("admuserinreg");
    _jspx_th_bean_message_27.setKey("adm_user_inreg.prompt.up");
    int _jspx_eval_bean_message_27 = _jspx_th_bean_message_27.doStartTag();
    if (_jspx_th_bean_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_27);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_27);
    return false;
  }

  private boolean _jspx_meth_html_hidden_12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_12 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_12.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_html_hidden_12.setProperty("values.issuer_name");
    int _jspx_eval_html_hidden_12 = _jspx_th_html_hidden_12.doStartTag();
    if (_jspx_th_html_hidden_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_12);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_12);
    return false;
  }

  private boolean _jspx_meth_bean_message_28(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_28 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_28.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_28.setBundle("admuserext");
    _jspx_th_bean_message_28.setKey("adm_user_ext.prompt.issuer_name_e");
    int _jspx_eval_bean_message_28 = _jspx_th_bean_message_28.doStartTag();
    if (_jspx_th_bean_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_28);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_28);
    return false;
  }

  private boolean _jspx_meth_html_hidden_13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_13 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_13.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_html_hidden_13.setProperty("values.serial_number");
    int _jspx_eval_html_hidden_13 = _jspx_th_html_hidden_13.doStartTag();
    if (_jspx_th_html_hidden_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_13);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_13);
    return false;
  }

  private boolean _jspx_meth_bean_message_29(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_29 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_29.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_29.setBundle("admuserext");
    _jspx_th_bean_message_29.setKey("adm_user_ext.prompt.serial_number_e");
    int _jspx_eval_bean_message_29 = _jspx_th_bean_message_29.doStartTag();
    if (_jspx_th_bean_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_29);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_29);
    return false;
  }

  private boolean _jspx_meth_bean_message_30(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_30 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_30.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_30.setBundle("admuserext");
    _jspx_th_bean_message_30.setKey("adm_user_ext.prompt.nochange");
    int _jspx_eval_bean_message_30 = _jspx_th_bean_message_30.doStartTag();
    if (_jspx_th_bean_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_30);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_30);
    return false;
  }

  private boolean _jspx_meth_html_radio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_0 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_html_radio_0.setProperty("changeAut");
    _jspx_th_html_radio_0.setValue("2");
    _jspx_th_html_radio_0.setOnclick("javascript: chAut();");
    _jspx_th_html_radio_0.setStyleId("ch_2");
    int _jspx_eval_html_radio_0 = _jspx_th_html_radio_0.doStartTag();
    if (_jspx_th_html_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_0);
      return true;
    }
    _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_31(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_31 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_31.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_31.setBundle("admuserext");
    _jspx_th_bean_message_31.setKey("adm_user_ext.prompt.changecd");
    int _jspx_eval_bean_message_31 = _jspx_th_bean_message_31.doStartTag();
    if (_jspx_th_bean_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_31);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_31);
    return false;
  }

  private boolean _jspx_meth_html_radio_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_1 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_1.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_html_radio_1.setProperty("changeAut");
    _jspx_th_html_radio_1.setValue("0");
    _jspx_th_html_radio_1.setOnclick("javascript: chAut();");
    _jspx_th_html_radio_1.setStyleId("ch_0");
    int _jspx_eval_html_radio_1 = _jspx_th_html_radio_1.doStartTag();
    if (_jspx_th_html_radio_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_1);
      return true;
    }
    _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_32(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_32 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_32.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_32.setBundle("admuserext");
    _jspx_th_bean_message_32.setKey("adm_user_ext.prompt.changeaut");
    int _jspx_eval_bean_message_32 = _jspx_th_bean_message_32.doStartTag();
    if (_jspx_th_bean_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_32);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_32);
    return false;
  }

  private boolean _jspx_meth_html_radio_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_2 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_2.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_html_radio_2.setProperty("changeAut");
    _jspx_th_html_radio_2.setValue("1");
    _jspx_th_html_radio_2.setOnclick("javascript: chAut();");
    _jspx_th_html_radio_2.setStyleId("ch_1");
    int _jspx_eval_html_radio_2 = _jspx_th_html_radio_2.doStartTag();
    if (_jspx_th_html_radio_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_2);
      return true;
    }
    _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_33(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_33 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_33.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_33.setBundle("admuser");
    _jspx_th_bean_message_33.setKey("adm_user.prompt.numeldap");
    int _jspx_eval_bean_message_33 = _jspx_th_bean_message_33.doStartTag();
    if (_jspx_th_bean_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_33);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_33);
    return false;
  }

  private boolean _jspx_meth_html_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_5 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_5.setPageContext(_jspx_page_context);
    _jspx_th_html_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_html_text_5.setErrorStyleClass("errorfield");
    _jspx_th_html_text_5.setStyleClass("field_input");
    _jspx_th_html_text_5.setProperty("numeSearchLdap");
    _jspx_th_html_text_5.setStyleId("numeSearchLdap");
    int _jspx_eval_html_text_5 = _jspx_th_html_text_5.doStartTag();
    if (_jspx_th_html_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_5);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_5);
    return false;
  }

  private boolean _jspx_meth_bean_message_34(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_34 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_34.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_34.setBundle("admuser");
    _jspx_th_bean_message_34.setKey("adm_user.label.tooltip.numeldap");
    int _jspx_eval_bean_message_34 = _jspx_th_bean_message_34.doStartTag();
    if (_jspx_th_bean_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_34);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_34);
    return false;
  }

  private boolean _jspx_meth_bean_message_35(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_35 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_35.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_35.setBundle("admuserinreg");
    _jspx_th_bean_message_35.setKey("adm_user_inreg.button.cauta_ldap");
    int _jspx_eval_bean_message_35 = _jspx_th_bean_message_35.doStartTag();
    if (_jspx_th_bean_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_35);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_35);
    return false;
  }

  private boolean _jspx_meth_html_hidden_14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_14 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_14.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_html_hidden_14.setProperty("issuer_name_n");
    _jspx_th_html_hidden_14.setStyleId("issuer_name");
    int _jspx_eval_html_hidden_14 = _jspx_th_html_hidden_14.doStartTag();
    if (_jspx_th_html_hidden_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_14);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_14);
    return false;
  }

  private boolean _jspx_meth_bean_message_36(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_36 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_36.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_36.setBundle("admuserext");
    _jspx_th_bean_message_36.setKey("adm_user_ext.prompt.issuer_name_n");
    int _jspx_eval_bean_message_36 = _jspx_th_bean_message_36.doStartTag();
    if (_jspx_th_bean_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_36);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_36);
    return false;
  }

  private boolean _jspx_meth_html_hidden_15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_15 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_15.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_html_hidden_15.setProperty("serial_number_n");
    _jspx_th_html_hidden_15.setStyleId("serial_number");
    int _jspx_eval_html_hidden_15 = _jspx_th_html_hidden_15.doStartTag();
    if (_jspx_th_html_hidden_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_15);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_15);
    return false;
  }

  private boolean _jspx_meth_bean_message_37(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_37 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_37.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_37.setBundle("admuserext");
    _jspx_th_bean_message_37.setKey("adm_user_ext.prompt.serial_number_n");
    int _jspx_eval_bean_message_37 = _jspx_th_bean_message_37.doStartTag();
    if (_jspx_th_bean_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_37);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_37);
    return false;
  }

  private boolean _jspx_meth_bean_message_38(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_38 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_38.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_38.setBundle("admuserinreg");
    _jspx_th_bean_message_38.setKey("adm_user_inreg.prompt.user_password");
    int _jspx_eval_bean_message_38 = _jspx_th_bean_message_38.doStartTag();
    if (_jspx_th_bean_message_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_38);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_38);
    return false;
  }

  private boolean _jspx_meth_bean_message_39(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_39 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_39.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_39.setBundle("admuserinreg");
    _jspx_th_bean_message_39.setKey("adm_user_inreg.prompt.c_user_password");
    int _jspx_eval_bean_message_39 = _jspx_th_bean_message_39.doStartTag();
    if (_jspx_th_bean_message_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_39);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_39);
    return false;
  }

  private boolean _jspx_meth_bean_message_40(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_40 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_40.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_40.setBundle("admuserinreg");
    _jspx_th_bean_message_40.setKey("adm_user_inreg.prompt.user_password");
    int _jspx_eval_bean_message_40 = _jspx_th_bean_message_40.doStartTag();
    if (_jspx_th_bean_message_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_40);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_40);
    return false;
  }

  private boolean _jspx_meth_html_password_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_2 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_2.setPageContext(_jspx_page_context);
    _jspx_th_html_password_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_html_password_2.setErrorStyleClass("errorfield");
    _jspx_th_html_password_2.setStyleClass("field_input");
    _jspx_th_html_password_2.setProperty("values.user_passwd");
    _jspx_th_html_password_2.setMaxlength("25");
    _jspx_th_html_password_2.setStyleId("pw");
    int _jspx_eval_html_password_2 = _jspx_th_html_password_2.doStartTag();
    if (_jspx_th_html_password_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody.reuse(_jspx_th_html_password_2);
      return true;
    }
    _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody.reuse(_jspx_th_html_password_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_41(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_41 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_41.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_41.setBundle("admuserinreg");
    _jspx_th_bean_message_41.setKey("adm_user_inreg.label.tooltip.user_password");
    int _jspx_eval_bean_message_41 = _jspx_th_bean_message_41.doStartTag();
    if (_jspx_th_bean_message_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_41);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_41);
    return false;
  }

  private boolean _jspx_meth_bean_message_42(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_42 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_42.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_42.setBundle("admuserinreg");
    _jspx_th_bean_message_42.setKey("adm_user_inreg.prompt.c_user_password");
    int _jspx_eval_bean_message_42 = _jspx_th_bean_message_42.doStartTag();
    if (_jspx_th_bean_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_42);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_42);
    return false;
  }

  private boolean _jspx_meth_html_password_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_3 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_3.setPageContext(_jspx_page_context);
    _jspx_th_html_password_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_html_password_3.setErrorStyleClass("errorfield");
    _jspx_th_html_password_3.setStyleClass("field_input");
    _jspx_th_html_password_3.setProperty("c_user_password");
    _jspx_th_html_password_3.setMaxlength("25");
    _jspx_th_html_password_3.setStyleId("cpw");
    int _jspx_eval_html_password_3 = _jspx_th_html_password_3.doStartTag();
    if (_jspx_th_html_password_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody.reuse(_jspx_th_html_password_3);
      return true;
    }
    _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody.reuse(_jspx_th_html_password_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_43(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_43 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_43.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_22);
    _jspx_th_bean_message_43.setBundle("admuserinreg");
    _jspx_th_bean_message_43.setKey("adm_user_inreg.label.tooltip.c_user_password");
    int _jspx_eval_bean_message_43 = _jspx_th_bean_message_43.doStartTag();
    if (_jspx_th_bean_message_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_43);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_43);
    return false;
  }

  private boolean _jspx_meth_html_hidden_16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_16 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_16.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_html_hidden_16.setProperty("values.user_passwd");
    int _jspx_eval_html_hidden_16 = _jspx_th_html_hidden_16.doStartTag();
    if (_jspx_th_html_hidden_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_16);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_16);
    return false;
  }

  private boolean _jspx_meth_bean_message_44(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_44 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_44.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_44.setBundle("admuserext");
    _jspx_th_bean_message_44.setKey("adm_user_ext.prompt.nochange");
    int _jspx_eval_bean_message_44 = _jspx_th_bean_message_44.doStartTag();
    if (_jspx_th_bean_message_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_44);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_44);
    return false;
  }

  private boolean _jspx_meth_html_radio_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_3 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_3.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_html_radio_3.setProperty("changeAut");
    _jspx_th_html_radio_3.setValue("2");
    _jspx_th_html_radio_3.setOnclick("javascript: chAutP();");
    _jspx_th_html_radio_3.setStyleId("ch_2");
    int _jspx_eval_html_radio_3 = _jspx_th_html_radio_3.doStartTag();
    if (_jspx_th_html_radio_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_3);
      return true;
    }
    _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_45(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_45 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_45.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_45.setBundle("admuserext");
    _jspx_th_bean_message_45.setKey("adm_user_ext.prompt.changepw");
    int _jspx_eval_bean_message_45 = _jspx_th_bean_message_45.doStartTag();
    if (_jspx_th_bean_message_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_45);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_45);
    return false;
  }

  private boolean _jspx_meth_html_radio_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_4 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_4.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_html_radio_4.setProperty("changeAut");
    _jspx_th_html_radio_4.setValue("0");
    _jspx_th_html_radio_4.setOnclick("javascript: chAutP();");
    _jspx_th_html_radio_4.setStyleId("ch_0");
    int _jspx_eval_html_radio_4 = _jspx_th_html_radio_4.doStartTag();
    if (_jspx_th_html_radio_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_4);
      return true;
    }
    _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_46(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_46 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_46.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_46.setBundle("admuserext");
    _jspx_th_bean_message_46.setKey("adm_user_ext.prompt.changeaut");
    int _jspx_eval_bean_message_46 = _jspx_th_bean_message_46.doStartTag();
    if (_jspx_th_bean_message_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_46);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_46);
    return false;
  }

  private boolean _jspx_meth_html_radio_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_5 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_5.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_html_radio_5.setProperty("changeAut");
    _jspx_th_html_radio_5.setValue("1");
    _jspx_th_html_radio_5.setOnclick("javascript: chAutP();");
    _jspx_th_html_radio_5.setStyleId("ch_1");
    int _jspx_eval_html_radio_5 = _jspx_th_html_radio_5.doStartTag();
    if (_jspx_th_html_radio_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_5);
      return true;
    }
    _jspx_tagPool_html_radio_value_styleId_property_onclick_nobody.reuse(_jspx_th_html_radio_5);
    return false;
  }

  private boolean _jspx_meth_bean_message_47(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_47 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_47.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_47.setBundle("admuser");
    _jspx_th_bean_message_47.setKey("adm_user.prompt.numeldap");
    int _jspx_eval_bean_message_47 = _jspx_th_bean_message_47.doStartTag();
    if (_jspx_th_bean_message_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_47);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_47);
    return false;
  }

  private boolean _jspx_meth_html_text_6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_6 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_6.setPageContext(_jspx_page_context);
    _jspx_th_html_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_html_text_6.setErrorStyleClass("errorfield");
    _jspx_th_html_text_6.setStyleClass("field_input");
    _jspx_th_html_text_6.setProperty("numeSearchLdap");
    _jspx_th_html_text_6.setStyleId("numeSearchLdap");
    int _jspx_eval_html_text_6 = _jspx_th_html_text_6.doStartTag();
    if (_jspx_th_html_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_6);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_errorStyleClass_nobody.reuse(_jspx_th_html_text_6);
    return false;
  }

  private boolean _jspx_meth_bean_message_48(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_48 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_48.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_48.setBundle("admuser");
    _jspx_th_bean_message_48.setKey("adm_user.label.tooltip.numeldap");
    int _jspx_eval_bean_message_48 = _jspx_th_bean_message_48.doStartTag();
    if (_jspx_th_bean_message_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_48);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_48);
    return false;
  }

  private boolean _jspx_meth_bean_message_49(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_49 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_49.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_49.setBundle("admuserinreg");
    _jspx_th_bean_message_49.setKey("adm_user_inreg.button.cauta_ldap");
    int _jspx_eval_bean_message_49 = _jspx_th_bean_message_49.doStartTag();
    if (_jspx_th_bean_message_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_49);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_49);
    return false;
  }

  private boolean _jspx_meth_html_hidden_17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_17 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_17.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_html_hidden_17.setProperty("values.issuer_name");
    _jspx_th_html_hidden_17.setStyleId("issuer_name");
    int _jspx_eval_html_hidden_17 = _jspx_th_html_hidden_17.doStartTag();
    if (_jspx_th_html_hidden_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_17);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_17);
    return false;
  }

  private boolean _jspx_meth_bean_message_50(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_50 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_50.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_50.setBundle("admuserinreg");
    _jspx_th_bean_message_50.setKey("adm_user_inreg.prompt.issuer_name");
    int _jspx_eval_bean_message_50 = _jspx_th_bean_message_50.doStartTag();
    if (_jspx_th_bean_message_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_50);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_50);
    return false;
  }

  private boolean _jspx_meth_html_hidden_18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_18 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_18.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_html_hidden_18.setProperty("values.serial_number");
    _jspx_th_html_hidden_18.setStyleId("serial_number");
    int _jspx_eval_html_hidden_18 = _jspx_th_html_hidden_18.doStartTag();
    if (_jspx_th_html_hidden_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_18);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_18);
    return false;
  }

  private boolean _jspx_meth_bean_message_51(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_51 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_51.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_51.setBundle("admuserinreg");
    _jspx_th_bean_message_51.setKey("adm_user_inreg.prompt.serial_number");
    int _jspx_eval_bean_message_51 = _jspx_th_bean_message_51.doStartTag();
    if (_jspx_th_bean_message_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_51);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_51);
    return false;
  }

  private boolean _jspx_meth_bean_message_52(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_52 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_52.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_52.setBundle("admuserext");
    _jspx_th_bean_message_52.setKey("adm_user_ext.prompt.user_password_n");
    int _jspx_eval_bean_message_52 = _jspx_th_bean_message_52.doStartTag();
    if (_jspx_th_bean_message_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_52);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_52);
    return false;
  }

  private boolean _jspx_meth_bean_message_53(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_53 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_53.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_53.setBundle("admuserinreg");
    _jspx_th_bean_message_53.setKey("adm_user_inreg.prompt.c_user_password");
    int _jspx_eval_bean_message_53 = _jspx_th_bean_message_53.doStartTag();
    if (_jspx_th_bean_message_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_53);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_53);
    return false;
  }

  private boolean _jspx_meth_bean_message_54(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_54 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_54.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_54.setBundle("admuserext");
    _jspx_th_bean_message_54.setKey("adm_user_ext.prompt.user_password_n");
    int _jspx_eval_bean_message_54 = _jspx_th_bean_message_54.doStartTag();
    if (_jspx_th_bean_message_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_54);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_54);
    return false;
  }

  private boolean _jspx_meth_html_password_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_4 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_4.setPageContext(_jspx_page_context);
    _jspx_th_html_password_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_html_password_4.setStyleClass("field_input");
    _jspx_th_html_password_4.setProperty("user_password_n");
    _jspx_th_html_password_4.setMaxlength("25");
    _jspx_th_html_password_4.setStyleId("pw");
    int _jspx_eval_html_password_4 = _jspx_th_html_password_4.doStartTag();
    if (_jspx_th_html_password_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_password_4);
      return true;
    }
    _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_nobody.reuse(_jspx_th_html_password_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_55(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_55 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_55.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_55.setBundle("admuserinreg");
    _jspx_th_bean_message_55.setKey("adm_user_inreg.label.tooltip.user_password");
    int _jspx_eval_bean_message_55 = _jspx_th_bean_message_55.doStartTag();
    if (_jspx_th_bean_message_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_55);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_55);
    return false;
  }

  private boolean _jspx_meth_bean_message_56(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_56 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_56.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_56.setBundle("admuserinreg");
    _jspx_th_bean_message_56.setKey("adm_user_inreg.prompt.c_user_password");
    int _jspx_eval_bean_message_56 = _jspx_th_bean_message_56.doStartTag();
    if (_jspx_th_bean_message_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_56);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_56);
    return false;
  }

  private boolean _jspx_meth_html_password_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_5 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_5.setPageContext(_jspx_page_context);
    _jspx_th_html_password_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_html_password_5.setErrorStyleClass("errorfield");
    _jspx_th_html_password_5.setStyleClass("field_input");
    _jspx_th_html_password_5.setProperty("c_user_password");
    _jspx_th_html_password_5.setMaxlength("25");
    _jspx_th_html_password_5.setStyleId("cpw");
    int _jspx_eval_html_password_5 = _jspx_th_html_password_5.doStartTag();
    if (_jspx_th_html_password_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody.reuse(_jspx_th_html_password_5);
      return true;
    }
    _jspx_tagPool_html_password_styleId_styleClass_property_maxlength_errorStyleClass_nobody.reuse(_jspx_th_html_password_5);
    return false;
  }

  private boolean _jspx_meth_bean_message_57(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_57 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_57.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_53);
    _jspx_th_bean_message_57.setBundle("admuserinreg");
    _jspx_th_bean_message_57.setKey("adm_user_inreg.label.tooltip.c_user_password");
    int _jspx_eval_bean_message_57 = _jspx_th_bean_message_57.doStartTag();
    if (_jspx_th_bean_message_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_57);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_57);
    return false;
  }

  private boolean _jspx_meth_bean_message_58(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_58 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_58.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_58.setBundle("admuserinreg");
    _jspx_th_bean_message_58.setKey("adm_user_inreg.prompt.informatii");
    int _jspx_eval_bean_message_58 = _jspx_th_bean_message_58.doStartTag();
    if (_jspx_th_bean_message_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_58);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_58);
    return false;
  }

  private boolean _jspx_meth_html_hidden_19(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_19 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_19.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_19.setProperty("values.bi");
    _jspx_th_html_hidden_19.setStyleId("bi");
    int _jspx_eval_html_hidden_19 = _jspx_th_html_hidden_19.doStartTag();
    if (_jspx_th_html_hidden_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_19);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_19);
    return false;
  }

  private boolean _jspx_meth_bean_message_59(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_59 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_59.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_59.setBundle("admuserinreg");
    _jspx_th_bean_message_59.setKey("adm_user_inreg.prompt.bi");
    int _jspx_eval_bean_message_59 = _jspx_th_bean_message_59.doStartTag();
    if (_jspx_th_bean_message_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_59);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_59);
    return false;
  }

  private boolean _jspx_meth_bean_message_60(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_60 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_60.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_60.setBundle("admuserinreg");
    _jspx_th_bean_message_60.setKey("adm_user_inreg.label.tooltip.bi");
    int _jspx_eval_bean_message_60 = _jspx_th_bean_message_60.doStartTag();
    if (_jspx_th_bean_message_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_60);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_60);
    return false;
  }

  private boolean _jspx_meth_bean_message_61(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_61 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_61.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_61.setBundle("admuserinreg");
    _jspx_th_bean_message_61.setKey("adm_user_inreg.prompt.anunturi");
    int _jspx_eval_bean_message_61 = _jspx_th_bean_message_61.doStartTag();
    if (_jspx_th_bean_message_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_61);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_61);
    return false;
  }

  private boolean _jspx_meth_html_hidden_20(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_20 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_20.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_20.setProperty("values.stiri");
    _jspx_th_html_hidden_20.setStyleId("stiri");
    int _jspx_eval_html_hidden_20 = _jspx_th_html_hidden_20.doStartTag();
    if (_jspx_th_html_hidden_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_20);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_20);
    return false;
  }

  private boolean _jspx_meth_bean_message_62(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_62 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_62.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_62.setBundle("admuserinreg");
    _jspx_th_bean_message_62.setKey("adm_user_inreg.prompt.stiri");
    int _jspx_eval_bean_message_62 = _jspx_th_bean_message_62.doStartTag();
    if (_jspx_th_bean_message_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_62);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_62);
    return false;
  }

  private boolean _jspx_meth_bean_message_63(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_63 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_63.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_63.setBundle("admuserinreg");
    _jspx_th_bean_message_63.setKey("adm_user_inreg.label.tooltip.stiri");
    int _jspx_eval_bean_message_63 = _jspx_th_bean_message_63.doStartTag();
    if (_jspx_th_bean_message_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_63);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_63);
    return false;
  }

  private boolean _jspx_meth_html_hidden_21(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_21 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_21.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_21.setProperty("values.sig_port");
    _jspx_th_html_hidden_21.setStyleId("sig_port");
    int _jspx_eval_html_hidden_21 = _jspx_th_html_hidden_21.doStartTag();
    if (_jspx_th_html_hidden_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_21);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_21);
    return false;
  }

  private boolean _jspx_meth_bean_message_64(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_64 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_64.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_64.setBundle("admuserinreg");
    _jspx_th_bean_message_64.setKey("adm_user_inreg.prompt.sig_port");
    int _jspx_eval_bean_message_64 = _jspx_th_bean_message_64.doStartTag();
    if (_jspx_th_bean_message_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_64);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_64);
    return false;
  }

  private boolean _jspx_meth_bean_message_65(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_65 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_65.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_65.setBundle("admuserinreg");
    _jspx_th_bean_message_65.setKey("adm_user_inreg.label.tooltip.sig_port");
    int _jspx_eval_bean_message_65 = _jspx_th_bean_message_65.doStartTag();
    if (_jspx_th_bean_message_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_65);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_65);
    return false;
  }

  private boolean _jspx_meth_html_hidden_22(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_22 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_22.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_22.setProperty("values.prot_med");
    _jspx_th_html_hidden_22.setStyleId("prot_med");
    int _jspx_eval_html_hidden_22 = _jspx_th_html_hidden_22.doStartTag();
    if (_jspx_th_html_hidden_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_22);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_22);
    return false;
  }

  private boolean _jspx_meth_bean_message_66(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_66 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_66.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_66.setBundle("admuserinreg");
    _jspx_th_bean_message_66.setKey("adm_user_inreg.prompt.prot_med");
    int _jspx_eval_bean_message_66 = _jspx_th_bean_message_66.doStartTag();
    if (_jspx_th_bean_message_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_66);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_66);
    return false;
  }

  private boolean _jspx_meth_bean_message_67(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_67 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_67.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_67.setBundle("admuserinreg");
    _jspx_th_bean_message_67.setKey("adm_user_inreg.label.tooltip.prot_med");
    int _jspx_eval_bean_message_67 = _jspx_th_bean_message_67.doStartTag();
    if (_jspx_th_bean_message_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_67);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_67);
    return false;
  }

  private boolean _jspx_meth_bean_message_68(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_68 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_68.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_68.setBundle("admuserext");
    _jspx_th_bean_message_68.setKey("adm_user_ext.prompt.fk_limba");
    int _jspx_eval_bean_message_68 = _jspx_th_bean_message_68.doStartTag();
    if (_jspx_th_bean_message_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_68);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_68);
    return false;
  }

  private boolean _jspx_meth_selection_selectionComponent_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  selection:selectionComponent
    ro.uti.waf.components.selectionComponent.taglib.selectionComponent.SelectionComponentTag _jspx_th_selection_selectionComponent_0 = (ro.uti.waf.components.selectionComponent.taglib.selectionComponent.SelectionComponentTag) _jspx_tagPool_selection_selectionComponent_property_multiple_idTableName_detailsFieldName.get(ro.uti.waf.components.selectionComponent.taglib.selectionComponent.SelectionComponentTag.class);
    _jspx_th_selection_selectionComponent_0.setPageContext(_jspx_page_context);
    _jspx_th_selection_selectionComponent_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_selection_selectionComponent_0.setProperty("values.fk_limba");
    _jspx_th_selection_selectionComponent_0.setDetailsFieldName("denumire");
    _jspx_th_selection_selectionComponent_0.setIdTableName("lmb.ID_LIMBA");
    _jspx_th_selection_selectionComponent_0.setMultiple("false");
    int _jspx_eval_selection_selectionComponent_0 = _jspx_th_selection_selectionComponent_0.doStartTag();
    if (_jspx_eval_selection_selectionComponent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_selection_selectionComponent_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_selection_selectionComponent_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_selection_selectionComponent_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("       ");
        if (_jspx_meth_selection_genericSelection_0(_jspx_th_selection_selectionComponent_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_selection_selectionComponent_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_selection_selectionComponent_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_selection_selectionComponent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_selection_selectionComponent_property_multiple_idTableName_detailsFieldName.reuse(_jspx_th_selection_selectionComponent_0);
      return true;
    }
    _jspx_tagPool_selection_selectionComponent_property_multiple_idTableName_detailsFieldName.reuse(_jspx_th_selection_selectionComponent_0);
    return false;
  }

  private boolean _jspx_meth_selection_genericSelection_0(javax.servlet.jsp.tagext.JspTag _jspx_th_selection_selectionComponent_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  selection:genericSelection
    ro.uti.waf.components.selectionComponent.taglib.selectionComponent.genericSelection.GenericSelectionTag _jspx_th_selection_genericSelection_0 = (ro.uti.waf.components.selectionComponent.taglib.selectionComponent.genericSelection.GenericSelectionTag) _jspx_tagPool_selection_genericSelection_styleClass_showCodeInsert_searchCaseId_knownFieldName.get(ro.uti.waf.components.selectionComponent.taglib.selectionComponent.genericSelection.GenericSelectionTag.class);
    _jspx_th_selection_genericSelection_0.setPageContext(_jspx_page_context);
    _jspx_th_selection_genericSelection_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_selection_selectionComponent_0);
    _jspx_th_selection_genericSelection_0.setSearchCaseId("nomLimba");
    _jspx_th_selection_genericSelection_0.setKnownFieldName("cod");
    _jspx_th_selection_genericSelection_0.setShowCodeInsert("true");
    _jspx_th_selection_genericSelection_0.setStyleClass("field_input_small");
    int _jspx_eval_selection_genericSelection_0 = _jspx_th_selection_genericSelection_0.doStartTag();
    if (_jspx_eval_selection_genericSelection_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_selection_genericSelection_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_selection_genericSelection_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_selection_genericSelection_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("       ");
        int evalDoAfterBody = _jspx_th_selection_genericSelection_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_selection_genericSelection_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_selection_genericSelection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_selection_genericSelection_styleClass_showCodeInsert_searchCaseId_knownFieldName.reuse(_jspx_th_selection_genericSelection_0);
      return true;
    }
    _jspx_tagPool_selection_genericSelection_styleClass_showCodeInsert_searchCaseId_knownFieldName.reuse(_jspx_th_selection_genericSelection_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_2);
    _jspx_th_html_submit_0.setStyleClass("button");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_bean_message_69(_jspx_th_html_submit_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_html_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_styleClass.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_styleClass.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_69(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_69 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_69.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_0);
    _jspx_th_bean_message_69.setBundle("admuserext");
    _jspx_th_bean_message_69.setKey("adm_user_ext.button.add");
    int _jspx_eval_bean_message_69 = _jspx_th_bean_message_69.doStartTag();
    if (_jspx_th_bean_message_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_69);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_69);
    return false;
  }

  private boolean _jspx_meth_html_hidden_23(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_23 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_23.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_2);
    _jspx_th_html_hidden_23.setProperty("method");
    _jspx_th_html_hidden_23.setValue("add");
    int _jspx_eval_html_hidden_23 = _jspx_th_html_hidden_23.doStartTag();
    if (_jspx_th_html_hidden_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_23);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_23);
    return false;
  }

  private boolean _jspx_meth_html_submit_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_1 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_2);
    _jspx_th_html_submit_1.setStyleClass("button");
    int _jspx_eval_html_submit_1 = _jspx_th_html_submit_1.doStartTag();
    if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_bean_message_70(_jspx_th_html_submit_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_html_submit_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_styleClass.reuse(_jspx_th_html_submit_1);
      return true;
    }
    _jspx_tagPool_html_submit_styleClass.reuse(_jspx_th_html_submit_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_70(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_70 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_70.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_1);
    _jspx_th_bean_message_70.setBundle("admuserext");
    _jspx_th_bean_message_70.setKey("adm_user_ext.button.save");
    int _jspx_eval_bean_message_70 = _jspx_th_bean_message_70.doStartTag();
    if (_jspx_th_bean_message_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_70);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_70);
    return false;
  }

  private boolean _jspx_meth_html_hidden_24(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_24 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_24.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_2);
    _jspx_th_html_hidden_24.setProperty("method");
    _jspx_th_html_hidden_24.setValue("update");
    int _jspx_eval_html_hidden_24 = _jspx_th_html_hidden_24.doStartTag();
    if (_jspx_th_html_hidden_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_24);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_24);
    return false;
  }

  private boolean _jspx_meth_html_javascript_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:javascript
    org.apache.struts.taglib.html.JavascriptValidatorTag _jspx_th_html_javascript_0 = (org.apache.struts.taglib.html.JavascriptValidatorTag) _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody.get(org.apache.struts.taglib.html.JavascriptValidatorTag.class);
    _jspx_th_html_javascript_0.setPageContext(_jspx_page_context);
    _jspx_th_html_javascript_0.setParent(null);
    _jspx_th_html_javascript_0.setFormName("form_AdmUserExtForm");
    _jspx_th_html_javascript_0.setDynamicJavascript("true");
    _jspx_th_html_javascript_0.setStaticJavascript("false");
    int _jspx_eval_html_javascript_0 = _jspx_th_html_javascript_0.doStartTag();
    if (_jspx_th_html_javascript_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody.reuse(_jspx_th_html_javascript_0);
      return true;
    }
    _jspx_tagPool_html_javascript_staticJavascript_formName_dynamicJavascript_nobody.reuse(_jspx_th_html_javascript_0);
    return false;
  }
}
