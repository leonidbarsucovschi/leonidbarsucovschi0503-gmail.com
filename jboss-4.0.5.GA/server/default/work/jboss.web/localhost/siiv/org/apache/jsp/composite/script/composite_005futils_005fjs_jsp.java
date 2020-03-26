package org.apache.jsp.composite.script;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class composite_005futils_005fjs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("function compositeTrim(s) {\r\n");
      out.write("    return s.replace( /^\\s*/, \"\" ).replace( /\\s*$/, \"\" );\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeGetOptionText(optionsElemId) {\r\n");
      out.write("    var optionsElm = document.getElementById(optionsElemId);\r\n");
      out.write("\r\n");
      out.write("    if (optionsElm.selectedIndex == -1) {\r\n");
      out.write("        return \"\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var elem = optionsElm.options[optionsElm.selectedIndex];\r\n");
      out.write("    return isNaN(parseInt(elem.value)) ? \"\" : elem.text;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function Invoker(object, func, params) {\r\n");
      out.write("\tthis.object = object;\r\n");
      out.write("\tthis.func = func;\r\n");
      out.write("\tthis.params = params;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("Invoker.prototype.getObject = function(){\r\n");
      out.write("\treturn this.object;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("Invoker.prototype.setObject = function(object){\r\n");
      out.write("\tthis.object = object;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("Invoker.prototype.getFunction = function(){\r\n");
      out.write("\treturn this.func;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("Invoker.prototype.setFunction = function(func){\r\n");
      out.write("\tthis.func = func;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("Invoker.prototype.getParams = function(){\r\n");
      out.write("\treturn this.params;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("Invoker.prototype.setParams = function(params){\r\n");
      out.write("\tthis.params = params;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("Invoker.prototype.invoke = function(){\r\n");
      out.write("\treturn this.func.apply(this.object, this.params);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function InvocationArray(){\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("InvocationArray.prototype.permanentHandlers = new Array();\r\n");
      out.write("InvocationArray.prototype.temporaryHandlers = new Array();\r\n");
      out.write("\r\n");
      out.write("InvocationArray.prototype.addPermHandler = function(inv) {\r\n");
      out.write("\tthis.permanentHandlers[this.permanentHandlers.length] = inv;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("InvocationArray.prototype.addTempHandler = function(inv) {\r\n");
      out.write("\tthis.temporaryHandlers[this.temporaryHandlers.length] = inv;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("InvocationArray.prototype.removeTempHandler = function(inv) {\r\n");
      out.write("\tfor (var i = 0; i < this.temporaryHandlers.length; i++)\r\n");
      out.write("\t\tif (inv.object == this.temporaryHandlers[i].object \r\n");
      out.write("\t\t\t&& inv.func == this.temporaryHandlers[i].func) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (this.temporaryHandlers[i].params.length != inv.params.length) continue;\r\n");
      out.write("\t\t\tfor (var j = 0; j < this.temporaryHandlers[i].params.length ; j++)\r\n");
      out.write("\t\t\t\tif (this.temporaryHandlers[i].params[j] != inv.params[j]) continue;\r\n");
      out.write("\t\t\tthis.temporaryHandlers.splice(i, 1);\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("InvocationArray.prototype.run = function() {\r\n");
      out.write("\tfor (var i = 0 ; i < this.permanentHandlers.length ; i++) {\r\n");
      out.write("\t\tif (! this.permanentHandlers[i].invoke())\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfor (var i = 0 ; i < this.temporaryHandlers.length ; i++) {\r\n");
      out.write("\t\tif (! this.temporaryHandlers[i].invoke())\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tthis.temporaryHandlers.length = 0;\r\n");
      out.write("\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var __invocationArray = new InvocationArray();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function findFrame(frameName){\r\n");
      out.write("\tvar result = findFrameInWindow(top, frameName);\r\n");
      out.write("\treturn result;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function findFrameInWindow(win, frameName){\r\n");
      out.write("\tfor (var i = 0; i < win.frames.length; i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (win.frames[i].name == frameName)\r\n");
      out.write("\t\t\treturn win.frames[i];\r\n");
      out.write("\r\n");
      out.write("\t\tvar result = findFrameInWindow(win.frames[i], frameName);\r\n");
      out.write("\t\tif (result != null)\r\n");
      out.write("\t\t\treturn result;\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\treturn null;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function Position(elemx, elemy) {\r\n");
      out.write("\tthis.x = elemx;\r\n");
      out.write("\tthis.y = elemy;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("Position.prototype.add = function(pos) {\r\n");
      out.write("\tthis.x += pos.x;\r\n");
      out.write("\tthis.y += pos.y;\r\n");
      out.write("\treturn this;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("Position.prototype.toString = function() {\r\n");
      out.write("\treturn \"(\" + this.x + \",\" + this.y + \")\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function calcElemPosition(elem) {\r\n");
      out.write("\tif (elem == document.body) {\r\n");
      out.write("\t\treturn new Position(elem.offsetLeft, elem.offsetTop);\r\n");
      out.write("\t}\r\n");
      out.write("\treturn (new Position(elem.offsetLeft, elem.offsetTop)).\r\n");
      out.write("\t\tadd(calcElemPosition(elem.offsetParent));\r\n");
      out.write("}");
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
