package org.apache.jsp.composite.script;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.jpf.base.composite.util.CompositePresentationConst;
import ro.uti.jpf.base.composite.util.CompositeConstants;

public final class composite_005fserver_005fcommunication_005fjs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("var COMPOSITE_USE_AJAX_IF_POSSIBLE = true;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("if (typeof(XMLHttpRequest) == \"undefined\") {\r\n");
      out.write("    XMLHttpRequest = function() {\r\n");
      out.write("        return new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("    };\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeFormElementsCanBeEncoded(form) {\r\n");
      out.write("    if (typeof(form) != \"object\") {\r\n");
      out.write("        alert(\"compositeFormElementsCanBeEncoded: invalid form argument\");\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    return !compositeFormContainsFiles(form);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeFormContainsFiles(form) {\r\n");
      out.write("    if (typeof(form) != \"object\") {\r\n");
      out.write("        alert(\"compositeFormContainsFiles: invalid form argument\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    for (var i = 0; i < form.elements.length; i++) {\r\n");
      out.write("        if (form.elements[i].type == \"file\") {\r\n");
      out.write("            if (compositeTrim(form.elements[i].value).length > 0) {\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeEncodeFormData(form) {\r\n");
      out.write("    if (typeof(form) != \"object\") {\r\n");
      out.write("        alert(\"compositeEncodeFormData: invalid form argument\");\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var result = new String();\r\n");
      out.write("\r\n");
      out.write("    for (var i = 0; i < form.elements.length; i++) {\r\n");
      out.write("        var name = form.elements[i].name;\r\n");
      out.write("\r\n");
      out.write("          var isDisabled = typeof(form.elements[i].disabled) == \"boolean\"\r\n");
      out.write("                ? form.elements[i].disabled : true;\r\n");
      out.write("\r\n");
      out.write("        if ((name.length == 0) || isDisabled) {\r\n");
      out.write("            continue;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var values = compositeGetFormElementValues(form.elements[i]);\r\n");
      out.write("\r\n");
      out.write("        if (values == null) {\r\n");
      out.write("            return null;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\t\t    while (values.length > 0) {\r\n");
      out.write("\t            result = result + ((result.length > 0) ? \"&\" : \"\")\r\n");
      out.write("\t\t\t\t\t            + encodeURIComponent(name) + \"=\"\r\n");
      out.write("                      + encodeURIComponent(values.pop());\r\n");
      out.write("\t\t    }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    return result;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeGetFormElementValues(element) {\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    if ((element.type == \"hidden\") || (element.type == \"text\")\r\n");
      out.write("            || (element.type == \"password\") || (element.type == \"textarea\")) {\r\n");
      out.write("        return [element.value];\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    if ((element.type == \"checkbox\") || (element.type == \"radio\")) {\r\n");
      out.write("\t\treturn !element.checked ? new Array() : [element.value];\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    if ((element.type == \"select-one\") || (element.type == \"select-multiple\")) {\r\n");
      out.write("        return compositeGetSelectFormElementValues(element);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    if ((element.type == \"submit\") || (element.type == \"button\")) {\r\n");
      out.write("\t\t    return \"\";\r\n");
      out.write("\t  }\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    if (element.type == \"file\") {\r\n");
      out.write("        if (compositeTrim(element.value).length == 0) {\r\n");
      out.write("            return \"\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    return null;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeGetSelectFormElementValues(element) {\r\n");
      out.write("    if (typeof(element) == \"unknown\") {\r\n");
      out.write("        alert(\"compositeGetSelectFormElementValues: missing element argument!\");\r\n");
      out.write("        return null;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\t  var result = new Array();\r\n");
      out.write("\r\n");
      out.write("\t  if (element.type == \"select-multiple\") {\r\n");
      out.write("\t\t    for (var i = 0; i < element.options.length; i++) {\r\n");
      out.write("\t\t      \tif (element.options[i].selected) {\r\n");
      out.write("\t\t\t\t        result.push(element.options[i].value);\r\n");
      out.write("\t\t\t      }\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t  } else {\r\n");
      out.write("\t\t    if (element.selectedIndex >= 0) {\r\n");
      out.write("\t\t\t      result.push(element.options[element.selectedIndex].value);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t  }\r\n");
      out.write("\r\n");
      out.write("\t  return result;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeSubmitFormToHiddenFrame(form) {\r\n");
      out.write("    if (typeof(form) != \"object\") {\r\n");
      out.write("        alert(\"compositeSubmitFormToHiddenFrame: invalid form argument\");\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var useAJAX = COMPOSITE_USE_AJAX_IF_POSSIBLE\r\n");
      out.write("            ? compositeFormElementsCanBeEncoded(form) : false;\r\n");
      out.write("\r\n");
      out.write("    if (useAJAX) {\r\n");
      out.write("        compositeSubmitFormUsingAJAX(form);\r\n");
      out.write("    } else {\r\n");
      out.write("        compositeSubmitFormUsingStandardWay(form);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeSubmitFormUsingAJAX(form) {\r\n");
      out.write("    if (typeof(form) != \"object\") {\r\n");
      out.write("        alert(\"compositeSubmitFormUsingAJAX: invalid form argument\");\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var postData = compositeEncodeFormData(form);\r\n");
      out.write("\r\n");
      out.write("    if (postData == null) {\r\n");
      out.write("        alert(\"compositeSubmitFormUsingAJAX: form data cannot be encoded!\");\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var xmlhttp = new XMLHttpRequest();\r\n");
      out.write("\r\n");
      out.write("    xmlhttp.open(\"POST\", form.action, false);\r\n");
      out.write("    xmlhttp.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\r\n");
      out.write("    xmlhttp.setRequestHeader(\"Accept-Charset\",'UTF-8');\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    try {\r\n");
      out.write("        xmlhttp.send(postData);\r\n");
      out.write("    } catch (e) {\r\n");
      out.write("        alert(\"compositeSubmitFormUsingAJAX failed: \" + e);\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    if (xmlhttp.status != 200) {\r\n");
      out.write("        alert(\"");
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_0.setParent(null);
      _jspx_th_bean_message_0.setKey("composite.error.communication");
      _jspx_th_bean_message_0.setBundle(CompositeConstants.COMPOSITE_MESSAGES_BUNDLE);
      int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
      if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
      out.write("\");\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var frame = window.frames[\"");
      out.print(CompositePresentationConst.HIDDEN_IFRAME_NAME);
      out.write("\"];\r\n");
      out.write("\r\n");
      out.write("    frame.document.open();\r\n");
      out.write("    frame.document.write(xmlhttp.responseText);\r\n");
      out.write("    frame.document.close();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeSubmitFormUsingStandardWay(form) {\r\n");
      out.write("    if (typeof(form) != \"object\") {\r\n");
      out.write("        alert(\"compositeSubmitFormUsingStandardWay: invalid form argument\");\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var frame = document.getElementById(\r\n");
      out.write("        \"");
      out.print(CompositePresentationConst.HIDDEN_IFRAME_ID);
      out.write("\");\r\n");
      out.write("\r\n");
      out.write("    form.encoding = compositeGetFormEncoding(form);\r\n");
      out.write("    form.target = frame.name;\r\n");
      out.write("    form.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeGetFormEncoding(form) {\r\n");
      out.write("    if (typeof(form) != \"object\") {\r\n");
      out.write("        alert(\"compostieGetFormEncoding: invalid form argument\");\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    return compositeFormContainsFiles(form) ? \"multipart/form-data\"\r\n");
      out.write("            : \"application/x-www-form-urlencoded\";\r\n");
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
