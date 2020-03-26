package org.apache.jsp.script.displaytag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jpdisplaytag_005fjs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  function dtResolveForm(formElmOrId) {\r\n");
      out.write("\r\n");
      out.write("      var navForm = (typeof(formElmOrId) == \"string\")\r\n");
      out.write("      ? document.getElementById(formElmOrId) : formElmOrId;\r\n");
      out.write("      /*\r\n");
      out.write("      *  patch to support old pages that have a single form per page\r\n");
      out.write("      */\r\n");
      out.write("      if(typeof(navForm) == \"undefined\" )\r\n");
      out.write("            navForm = document.navigationForm;\r\n");
      out.write("\r\n");
      out.write("      return navForm;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  function dtNavigateTo(formElmOrId , crtPage) {\r\n");
      out.write("\r\n");
      out.write("      var navForm =dtResolveForm(formElmOrId);\r\n");
      out.write("      navForm.crtPage.value = crtPage;\r\n");
      out.write("\r\n");
      out.write("      dtSubmitForm(navForm);\r\n");
      out.write("      return;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  function dtSetPageResults(formElmOrId,results) {\r\n");
      out.write("\r\n");
      out.write("    var navForm =dtResolveForm(formElmOrId);\r\n");
      out.write("    //dumpForm(navForm);\r\n");
      out.write("    navForm.rpp.value = results;\r\n");
      out.write("    navForm.crtPage.value = 1;\r\n");
      out.write("\r\n");
      out.write("    dtSubmitForm(navForm);\r\n");
      out.write("    return;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function dtOrderBy(formElmOrId, orderBy, orderType) {\r\n");
      out.write("\r\n");
      out.write("    var navForm =dtResolveForm(formElmOrId);\r\n");
      out.write("\r\n");
      out.write("    if(orderBy==-1){\r\n");
      out.write("      alert('Trebuie sa selectati un criteriu !');\r\n");
      out.write("      return;\r\n");
      out.write("    }\r\n");
      out.write("      navForm.orderBy.value = orderBy;\r\n");
      out.write("      navForm.orderType.value = orderType;\r\n");
      out.write("      dtSubmitForm(navForm);\r\n");
      out.write("      return;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function dtReset(formElmOrId) {\r\n");
      out.write("\r\n");
      out.write("    var navForm =dtResolveForm(formElmOrId);\r\n");
      out.write("    navForm.method.value=\"refresh\";\r\n");
      out.write("    navForm.orderBy.value =  \"\";\r\n");
      out.write("    navForm.orderType.value = \"\";\r\n");
      out.write("    navForm.crtPage.value = 1;\r\n");
      out.write("    navForm.rpp.value = \"\";\r\n");
      out.write("    dtSubmitForm(navForm);\r\n");
      out.write("\r\n");
      out.write("    return;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("function dtSubmitForm(formElmOrId){\r\n");
      out.write("\r\n");
      out.write("    var navForm = dtResolveForm(formElmOrId);\r\n");
      out.write("\r\n");
      out.write("    if(typeof navForm.is_ajax!='undefined'){\r\n");
      out.write("          if(navForm.is_ajax.value=='true'){\r\n");
      out.write("              var response = submitFormUsingAjax(navForm);\r\n");
      out.write("              dtDisplayResult(response,navForm.id+\"Div\");\r\n");
      out.write("          }\r\n");
      out.write("    }\r\n");
      out.write("    else\r\n");
      out.write("      navForm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function dtDisplayResult(responseText, divName){\r\n");
      out.write("   var myDiv = document.getElementById(divName);\r\n");
      out.write("   myDiv.innerHTML = responseText;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function submitFormUsingAjax(formElmOrId){\r\n");
      out.write("  var frmSub =  new JpfFormSubmit(formElmOrId);\r\n");
      out.write("  var req = new JpfHttpRequest(frmSub.formAction,frmSub.encodeFormData());\r\n");
      out.write("  var response = req.send();\r\n");
      out.write("  return response;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function dumpForm(formObject){\r\n");
      out.write("alert(formObject);\r\n");
      out.write("document.write('<table border=1><tr><th>element</th><th>name</th><th>type</th><th>value</th>');\r\n");
      out.write("for (var i=0;i<document.formObject.length;i++)\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("\tcurrent = document.formObject.elements[i];\r\n");
      out.write("\tdocument.write('<tr><td>' + i);\r\n");
      out.write("\tdocument.write('<td>' + current.name);\r\n");
      out.write("\tdocument.write('<td>' + current.type);\r\n");
      out.write("\tdocument.write('<td>' + current.value + '</tr>');\r\n");
      out.write("}\r\n");
      out.write(" document.write('</table>');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
