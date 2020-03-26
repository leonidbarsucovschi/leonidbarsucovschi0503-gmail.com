package org.apache.jsp.web.contrapositions;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import ro.uti.settings.util.Constants;

public final class upload_005ffileoperation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_messages_id_bundle;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_onsubmit_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_messages_id_bundle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_onsubmit_enctype_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_logic_messagesPresent.release();
    _jspx_tagPool_html_messages_id_bundle.release();
    _jspx_tagPool_bean_write_name_nobody.release();
    _jspx_tagPool_html_form_onsubmit_enctype_action.release();
    _jspx_tagPool_html_submit_styleClass.release();
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
      out.write("<form name=\"closeForm\" method=\"post\" action=\"contrapositions/fileoperation.do\">\r\n");
      out.write("\t");
      if (_jspx_meth_html_hidden_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction closeWindow()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.closeForm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction MultiSelector(list_target, max)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tthis.list_target = list_target;\r\n");
      out.write("\t\tthis.count = 0;\r\n");
      out.write("\t\tthis.id = 0;\r\n");
      out.write("\t\tif (max)\r\n");
      out.write("\t\t\tthis.max = max;\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\tthis.max = -1;\r\n");
      out.write("\r\n");
      out.write("\t\tthis.addElement = function(element)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif (element.tagName == 'INPUT' && element.type == 'file')\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\telement.name = 'uploadFiles[' + this.id++ + ']';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\telement.multi_selector = this;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\telement.onchange = function()\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\telement_tab = this.value.split('\\\\');\r\n");
      out.write("\t\t\t\t\tnbr_elements = element_tab.length;\r\n");
      out.write("\t\t\t\t\tif (this.multi_selector.alreadyInList(element_tab[nbr_elements-1]))\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\talert(\"Raportul exista deja in lista.\");\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar new_element = document.createElement('input');\r\n");
      out.write("\t\t\t\t\tnew_element.type = 'file';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tthis.parentNode.insertBefore(new_element, this);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tthis.multi_selector.addElement(new_element);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tthis.multi_selector.addListRow(this);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tthis.style.position = 'absolute';\r\n");
      out.write("\t\t\t\t\tthis.style.left = '-1000px';\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\tif (this.max != -1 && this.count >= this.max)\r\n");
      out.write("\t\t\t\t\telement.disabled = true;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tthis.count++;\r\n");
      out.write("\t\t\t\tthis.current_element = element;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\talert('Error: not a file input element');\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tthis.addListRow = function(element)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar new_row = document.createElement('tr');\r\n");
      out.write("\t\t\tvar new_col_radio = document.createElement('td');\r\n");
      out.write("\t\t\tvar new_col_filename = document.createElement('td');\r\n");
      out.write("\t\t\tvar new_col_button = document.createElement('td');\r\n");
      out.write("\r\n");
      out.write("\t\t\tnew_col_radio.setAttribute('align', 'left');\r\n");
      out.write("\t\t\tnew_col_filename.setAttribute('align', 'left');\r\n");
      out.write("\t\t\tnew_col_button.setAttribute('align', 'right');\r\n");
      out.write("\r\n");
      out.write("\t\t\tnew_row.appendChild(new_col_radio);\r\n");
      out.write("\t\t\tnew_row.appendChild(new_col_filename);\r\n");
      out.write("\t\t\tnew_row.appendChild(new_col_button);\r\n");
      out.write("\r\n");
      out.write("\t\t\tnew_row.element = element;\r\n");
      out.write("\r\n");
      out.write("\t\t\telement_tab = element.value.split('\\\\');\r\n");
      out.write("\t\t\tnbr_elements = element_tab.length;\r\n");
      out.write("\r\n");
      out.write("\t\t\ttry\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tnew_row_radio = document.createElement('<input type=\"radio\" name=\"selFile\" value=\\'' + element_tab[nbr_elements-1] + '\\'/>');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tcatch(err)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tnew_row_radio = document.createElement('input');\r\n");
      out.write("\t\t\t\tnew_row_radio.type = 'radio';\r\n");
      out.write("\t\t\t\tnew_row_radio.name = 'selFile';\r\n");
      out.write("\t\t\t\tnew_row_radio.value = element_tab[nbr_elements-1];\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar new_row_button = document.createElement('a');\r\n");
      out.write("\t\t\tnew_row_button.setAttribute('href', '#');\r\n");
      out.write("\t\t\tnew_row_button.appendChild(document.createTextNode('Scoate'));\r\n");
      out.write("\t\t\tnew_row_button.onclick = function()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tthis.parentNode.parentNode.parentNode.removeChild(this.parentNode.parentNode);\r\n");
      out.write("\t\t\t\tthis.parentNode.parentNode.element.parentNode.removeChild(this.parentNode.parentNode.element);\r\n");
      out.write("\t\t\t\tthis.parentNode.parentNode.element.multi_selector.count --;\r\n");
      out.write("\t\t\t\tthis.parentNode.parentNode.element.multi_selector.current_element.disabled = false;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\tnew_col_radio.appendChild(new_row_radio);\r\n");
      out.write("\t\t\tnew_col_filename.innerHTML = element_tab[nbr_elements-1];\r\n");
      out.write("\t\t\tnew_col_button.appendChild(new_row_button);\r\n");
      out.write("\r\n");
      out.write("\t\t\tthis.list_target.appendChild(new_row);\r\n");
      out.write("\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\tthis.checkRadios = function(element)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar found_it = false;\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (document.form_FileOperationForm.selFile != null)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tfor (var i=0; i < document.form_FileOperationForm.selFile.length; i++)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tif (document.form_FileOperationForm.selFile[i].checked)\r\n");
      out.write("\t\t\t\t\t\tfound_it = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (!found_it && document.form_FileOperationForm.selFile.length > 1)\r\n");
      out.write("\t\t\t\t\talert(\"Va rugam sa selectati fisierul principal.\");\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t\tfound_it = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\talert(\"Va rugam sa adaugati un fisier extern (si in cazul Ucraina - lunar, subfisierul sau) pentru incarcare.\");\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn found_it;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tthis.alreadyInList = function(value)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar found_it = false;\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (document.form_FileOperationForm.selFile != null)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tfor (var i=0; i < document.form_FileOperationForm.selFile.length; i++)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tif (document.form_FileOperationForm.selFile[i].value == value)\r\n");
      out.write("\t\t\t\t\t\tfound_it = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (document.form_FileOperationForm.selFile.value == value)\r\n");
      out.write("\t\t\t\t\tfound_it = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn found_it;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"table\">\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"100%\" valign=\"top\" align=\"left\" class=\"page-subtitle\">\r\n");
      out.write("\t\t\t\t  ");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td class=\"bottom\" align=\"right\">\r\n");
      out.write("\t\t\t\t<img border=\"0\" style=\"cursor:pointer;\" onClick=\"closeWindow();\"\r\n");
      out.write("\t\t\t\t\t title='");
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write("' src=\"images/close_off.gif\"\r\n");
      out.write("\t\t\t\t\t onMouseOver=\"this.src='images/close_on.gif'\" onmouseout=\"this.src='images/close_off.gif'\"/>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("\t\t");
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_messagesPresent_0.setParent(null);
      int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
      if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td valign=\"top\" colspan=\"2\" align=\"center\" class=\"msg_error\">\r\n");
          out.write("\t\t\t\t\t");
          //  html:messages
          org.apache.struts.taglib.html.MessagesTag _jspx_th_html_messages_0 = (org.apache.struts.taglib.html.MessagesTag) _jspx_tagPool_html_messages_id_bundle.get(org.apache.struts.taglib.html.MessagesTag.class);
          _jspx_th_html_messages_0.setPageContext(_jspx_page_context);
          _jspx_th_html_messages_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
          _jspx_th_html_messages_0.setId("error");
          _jspx_th_html_messages_0.setBundle("fileoperation");
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
              out.write("\t\t\t\t\t\t");
              if (_jspx_meth_bean_write_0(_jspx_th_html_messages_0, _jspx_page_context))
                return;
              out.write("<br>\r\n");
              out.write("\t\t\t\t\t");
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
            _jspx_tagPool_html_messages_id_bundle.reuse(_jspx_th_html_messages_0);
            return;
          }
          _jspx_tagPool_html_messages_id_bundle.reuse(_jspx_th_html_messages_0);
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t");
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
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" class=\"report\">\r\n");
      out.write("\t\t<!-- START Sectiune de FORM. -->\r\n");
      out.write("\t\t");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<!-- END Sectiune de FORM. -->\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar multi_selector = new MultiSelector( document.getElementById( 'files_list' ), 9 );\r\n");
      out.write("\tmulti_selector.addElement( document.getElementById( 'our_file_element' ) );\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_bean_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent(null);
    _jspx_th_bean_message_0.setBundle("fileoperation");
    _jspx_th_bean_message_0.setKey("fileoperation.admin.title.new");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent(null);
    _jspx_th_bean_message_1.setBundle("fileoperation");
    _jspx_th_bean_message_1.setKey("fileoperation.label.closeWindow");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
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

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_onsubmit_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/fileoperation.do");
    _jspx_th_html_form_0.setEnctype("multipart/form-data");
    _jspx_th_html_form_0.setOnsubmit("return multi_selector.checkRadios()");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<!-- Cimpul 'nume fisier' field. -->\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td valign=\"top\" class=\"label\" align=\"right\" width=\"50%\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_bean_message_2(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write(":\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t<td align=\"left\">\r\n");
        out.write("\t\t\t\t\t<input id=\"our_file_element\" type=\"file\" name=\"file_1\" >\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td colspan=\"2\">&nbsp</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td colspan=\"2\" class=\"button-row\" align=\"center\">\r\n");
        out.write("\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
        out.write("\t\t\t\t\t\t<tbody id=\"files_list\">\r\n");
        out.write("\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t<th>&nbsp");
        if (_jspx_meth_bean_message_3(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("&nbsp</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th width=\"250\">");
        if (_jspx_meth_bean_message_4(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th width=\"50\">&nbsp</th>\r\n");
        out.write("\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t</tbody>\r\n");
        out.write("\t\t\t\t\t</table>\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td colspan=\"2\">&nbsp;</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t<!-- Buton incarcare. -->\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td colspan=\"2\" class=\"button-row\" align=\"center\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_hidden_1(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_onsubmit_enctype_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_onsubmit_enctype_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_2.setBundle("fileoperation");
    _jspx_th_bean_message_2.setKey("fileoperation.prompt.uploadFile");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
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
    _jspx_th_bean_message_3.setBundle("fileoperation");
    _jspx_th_bean_message_3.setKey("fileoperation.prompt.mainFile");
    int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
    if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
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
    _jspx_th_bean_message_4.setBundle("fileoperation");
    _jspx_th_bean_message_4.setKey("fileoperation.prompt.uploadFile");
    int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
    if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setStyleClass("btn-generic");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_bean_message_5(_jspx_th_html_submit_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_bean_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_0);
    _jspx_th_bean_message_5.setBundle("fileoperation");
    _jspx_th_bean_message_5.setKey("fileoperation.button.upload");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_5);
    return false;
  }

  private boolean _jspx_meth_html_hidden_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_1.setProperty("method");
    _jspx_th_html_hidden_1.setValue("upload");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
    return false;
  }
}
