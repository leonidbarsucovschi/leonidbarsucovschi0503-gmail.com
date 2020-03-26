package org.apache.jsp.script.ajax_005fjpf_005fbeta;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jportal_005fhttp_005frequest_005fjs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("function JpfHttpRequest(url, data) {\r\n");
      out.write("    if (JpfHttpRequest.httpRequest == null) {\r\n");
      out.write("        throw \"Class initialization failed: no XMLHttpRequest\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    this.requestURL = url;\r\n");
      out.write("    this.requestData = data;\r\n");
      out.write("\r\n");
      out.write("    /* Default values for request attributes */\r\n");
      out.write("    this.method = \"POST\";\r\n");
      out.write("    this.contentType = \"application/x-www-form-urlencoded\";\r\n");
      out.write("    this.acceptCharset = \"UTF-8\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function __JpfHttpRequest() {}\r\n");
      out.write("__JpfHttpRequest.prototype = JpfHttpRequest.prototype;\r\n");
      out.write("__JpfHttpRequest.prototype.JpfAjax = JpfHttpRequest;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("if (typeof (JpfHttpRequest.httpRequest) == \"undefined\") {\r\n");
      out.write("    try {\r\n");
      out.write("        if (typeof(XMLHttpRequest) == \"undefined\") {\r\n");
      out.write("            JpfHttpRequest.httpRequest = function() {\r\n");
      out.write("                return new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("            };\r\n");
      out.write("        } else {\r\n");
      out.write("            JpfHttpRequest.httpRequest = XMLHttpRequest;\r\n");
      out.write("        }\r\n");
      out.write("    } catch (exc) {\r\n");
      out.write("        JpfHttpRequest.httpRequest = null;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("JpfHttpRequest.prototype.send = function() {\r\n");
      out.write("    var req = new JpfHttpRequest.httpRequest();\r\n");
      out.write("\r\n");
      out.write("    req.open(this.method, this.requestURL, false);\r\n");
      out.write("    this.setRequestHeaders(req);\r\n");
      out.write("\r\n");
      out.write("    try {\r\n");
      out.write("        req.send(this.requestData);\r\n");
      out.write("        var succeeded = req.status == 200;\r\n");
      out.write("    } catch (e) {\r\n");
      out.write("        var succeeded = false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    return succeeded ? req.responseText : null;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("JpfHttpRequest.prototype.setRequestHeaders = function(req) {\r\n");
      out.write("    req.setRequestHeader(\"Accept-Charset\", this.acceptCharset);\r\n");
      out.write("    req.setRequestHeader(\"Content-Type\", this.contentType);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("JpfHttpRequest.prototype.setMethod = function(value) {\r\n");
      out.write("    this.method = value;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("JpfHttpRequest.prototype.setContentType = function(value) {\r\n");
      out.write("    this.contentType = value;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("JpfHttpRequest.prototype.setAcceptCharset = function(value) {\r\n");
      out.write("    this.acceptCharset = value;\r\n");
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
