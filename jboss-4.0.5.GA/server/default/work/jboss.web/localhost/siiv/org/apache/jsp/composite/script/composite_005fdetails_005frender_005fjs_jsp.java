package org.apache.jsp.composite.script;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.jpf.base.composite.util.CompositePresentationConst;

public final class composite_005fdetails_005frender_005fjs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
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
      out.write("  ");
      out.write("\r\n");
      out.write("function CompositeDetailBean(id, label) {\r\n");
      out.write("    this.detailID = id;\r\n");
      out.write("    this.detailLabel = label;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("CompositeDetailBean.prototype.getID = function() {\r\n");
      out.write("    return this.detailID;\r\n");
      out.write("}\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("CompositeDetailBean.prototype.getLabel = function() {\r\n");
      out.write("    return this.detailLabel;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function CompositeDetailsTabs(details, currDetID) {\r\n");
      out.write("    this.detailsList = details;\r\n");
      out.write("    this.currentDetailID = currDetID;\r\n");
      out.write("\r\n");
      out.write("    this.compositeTabs = null;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function __CompositeDetailsTabs() {}\r\n");
      out.write("__CompositeDetailsTabs.prototype = CompositeDetailsTabs.prototype;\r\n");
      out.write("__CompositeDetailsTabs.prototype.CompositeDetailsTabs = CompositeDetailsTabs;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeDetailsTabs.prototype.pageLoaded = function() {\r\n");
      out.write("    this.compositeTabs =\r\n");
      out.write("            new CompositeTabs(\"tabs_row\", this.getChangeDetailHandler());\r\n");
      out.write("\r\n");
      out.write("    for (i = 0; i < this.detailsList.length; i++) {\r\n");
      out.write("        this.compositeTabs.addTab(\r\n");
      out.write("                new CompositeTabBean(this.detailsList[i].getID(),\r\n");
      out.write("                        this.detailsList[i].getLabel()));\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    this.compositeTabs.renderTabs();\r\n");
      out.write("    this.currentDetailPageLoaded(this.currentDetailID);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function onCompositeChangeDetail(tabID) {\r\n");
      out.write("    compositeChangeCurrentDetail(tabID, false);\r\n");
      out.write("    return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeDetailsTabs.prototype.getChangeDetailHandler = function() {\r\n");
      out.write("    return onCompositeChangeDetail;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeDetailsTabs.prototype.currentDetailPageLoaded = function(detailID) {\r\n");
      out.write("    this.currentDetailID = detailID;\r\n");
      out.write("\r\n");
      out.write("    compositeCallComponentPageLoadedFunction(detailID);\r\n");
      out.write("    this.compositeTabs.selectTab(detailID);\r\n");
      out.write("\r\n");
      out.write("    compositeReplaceFocusFunction(detailID);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeDetailsTabs.prototype.getCurrentDetailID = function() {\r\n");
      out.write("    return this.currentDetailID;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeDetailsTabs.prototype.validateDetailsFormData = function() {\r\n");
      out.write("    if (compositeComponentRequiresValidation(this.currentDetailID)) {\r\n");
      out.write("        return compositeValidateComponentFormData(this.currentDetailID);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeDetailsTabs.prototype.setDetailErrorFlag = function(detailID,\r\n");
      out.write("        errorFlag) {\r\n");
      out.write("    this.compositeTabs.setErrorFlag(detailID, errorFlag);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function CompositeDetailsList(details) {\r\n");
      out.write("    this.detailsList = details;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function __CompositeDetailsList() {}\r\n");
      out.write("__CompositeDetailsList.prototype = CompositeDetailsList.prototype;\r\n");
      out.write("__CompositeDetailsList.prototype.CompositeDetailsList = CompositeDetailsList;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeDetailsList.prototype.pageLoaded = function() {\r\n");
      out.write("    for (var i = 0; i < this.detailsList.length; i++) {\r\n");
      out.write("        compositeCallComponentPageLoadedFunction(this.detailsList[i].getID());\r\n");
      out.write("        compositeReplaceFocusFunction(this.detailsList[i].getID());\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeDetailsList.prototype.validateDetailsFormData = function() {\r\n");
      out.write("    for (var i = 0; i < this.detailsList.length; i++)  {\r\n");
      out.write("        if (compositeComponentRequiresValidation(this.detailsList[i].getID())) {\r\n");
      out.write("            if (!compositeValidateComponentFormData(\r\n");
      out.write("                    this.detailsList[i].getID())) {\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("CompositeDetailsList.prototype.setDetailErrorFlag = function(detailID,\r\n");
      out.write("        errorFlag) {\r\n");
      out.write("    var element = document.getElementById(\r\n");
      out.write("            \"");
      out.print(CompositePresentationConst.COMPONENT_TITLE_ELEMENT_ID_PREFIX);
      out.write("\"\r\n");
      out.write("                    + detailID);\r\n");
      out.write("\r\n");
      out.write("    element.className = \"composite-detail-title-cell\"\r\n");
      out.write("            + (errorFlag ? \" error\" : \"\");\r\n");
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
