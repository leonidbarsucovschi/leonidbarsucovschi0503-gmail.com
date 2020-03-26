package org.apache.jsp.composite.script;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.jpf.base.composite.util.CompositeConstants;

public final class composite_005fmultiple_005frecords_005fjs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
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
      response.setContentType("text/javascript; charset=iso-8859-2");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeMultipleRecords.prototype = new __Records();\r\n");
      out.write("CompositeMultipleRecords.prototype.constructor = CompositeMultipleRecords;\r\n");
      out.write("\r\n");
      out.write("function CompositeMultipleRecords(compID, entityId, prefix) {\r\n");
      out.write("    this.Records(entityId, prefix);\r\n");
      out.write("    this.componentID = compID;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function __CompositeMultipleRecords() {}\r\n");
      out.write("__CompositeMultipleRecords.prototype = CompositeMultipleRecords.prototype;\r\n");
      out.write("__CompositeMultipleRecords.prototype.CompositeMultipleRecords = CompositeMultipleRecords;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeMultipleRecords.prototype.executeOperation = function(operation,\r\n");
      out.write("            fastRequest, callbackFunction, submit) {\r\n");
      out.write("    var form = compositeGetHTMLForm(fastRequest);\r\n");
      out.write("\r\n");
      out.write("    if (form == null) {\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    form.");
      out.print(CompositeConstants.PARAM_ENTITY_ID);
      out.write(".value = this.getID();\r\n");
      out.write("\r\n");
      out.write("    compositeExecuteComponentOperation(this.componentID,\r\n");
      out.write("            operation, fastRequest,\r\n");
      out.write("            callbackFunction, submit);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeMultipleRecords.prototype.navigationChanged = function() {\r\n");
      out.write("    this.executeOperation(\"changeNavigation\", false, null);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeMultipleRecords.prototype.onFilter = function() {\r\n");
      out.write("    this.executeOperation(\"filter\", false, null);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeMultipleRecords.prototype.onRefresh = function() {\r\n");
      out.write("    this.executeOperation(\"refresh\", false, null);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeMultipleRecords.prototype.onSave = function(callback, submit) {\r\n");
      out.write("    if (this.validateForm()) {\r\n");
      out.write("        if (this.prepareForSubmit()) {\r\n");
      out.write("            this.executeOperation(\"save\", false, callback, submit);\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeMultipleRecords.prototype.validateForm = function() {\r\n");
      out.write("    return compositeValidateComponentFormData(this.componentID,\r\n");
      out.write("            \"");
      out.print(CompositeConstants.COMPONENT_SAVE_OPERATION);
      out.write("_\" + this.getID());\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeMultipleRecords.prototype.prepareForSubmit = function() {\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeMultipleRecords.prototype.onDelete = function() {\r\n");
      out.write("    if (confirm(\"");
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_0.setParent(null);
      _jspx_th_bean_message_0.setKey("composite.confirm.multiplerecords.delete");
      _jspx_th_bean_message_0.setBundle(CompositeConstants.COMPOSITE_MESSAGES_BUNDLE);
      int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
      if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
      out.write("\")) {\r\n");
      out.write("        this.executeOperation(\"delete\", false, null);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeMultipleRecords.prototype.onDeleteSelected = function() {\r\n");
      out.write("    if (this.getSelectedCount() == 0) {\r\n");
      out.write("        alert(\"");
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_1.setParent(null);
      _jspx_th_bean_message_1.setKey("composite.alert.multiplerecords.noselection");
      _jspx_th_bean_message_1.setBundle(CompositeConstants.COMPOSITE_MESSAGES_BUNDLE);
      int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
      if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
      out.write("\");\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    if (confirm(\"");
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_2.setParent(null);
      _jspx_th_bean_message_2.setKey("composite.confirm.multiplerecords.delete_multiple");
      _jspx_th_bean_message_2.setBundle(CompositeConstants.COMPOSITE_MESSAGES_BUNDLE);
      int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
      if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
      out.write("\")) {\r\n");
      out.write("        this.executeOperation(\"deleteMultiple\", false, null);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
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
}
