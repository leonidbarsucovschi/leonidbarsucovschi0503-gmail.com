package org.apache.jsp.web.reports;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.siiv.SIIVConstants;
import net.sf.jasperreports.engine.JRParameter;
import ro.uti.apmc.sys.util.DatabaseMetaData;
import java.util.Map;
import java.util.Iterator;
import java.util.Calendar;
import ro.uti.settings.util.ThreadSafeSDFs;
import java.util.Date;

public final class show_005fprint_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/tld/jportal/jpdisplaytag.tld");
    _jspx_dependants.add("/selectionComponent/WEB-INF/selectionComponent.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_arg0_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_messages_id_bundle;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_onsubmit_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_selection_selectionComponent_name_multiple_idTableName_detailsFieldName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_selection_genericSelection_styleClass_showCodeInsert_searchCaseId_knownFieldName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_bundle_arg0_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_messages_id_bundle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_onsubmit_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_selection_selectionComponent_name_multiple_idTableName_detailsFieldName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_selection_genericSelection_styleClass_showCodeInsert_searchCaseId_knownFieldName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_bean_message_key_bundle_arg0_nobody.release();
    _jspx_tagPool_bean_write_name_nobody.release();
    _jspx_tagPool_logic_messagesPresent.release();
    _jspx_tagPool_html_messages_id_bundle.release();
    _jspx_tagPool_html_form_onsubmit_method_action.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_selection_selectionComponent_name_multiple_idTableName_detailsFieldName.release();
    _jspx_tagPool_selection_genericSelection_styleClass_showCodeInsert_searchCaseId_knownFieldName.release();
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
      out.write("<script src=\"selectionComponent/script/selectioncomponent.js\"></script>\r\n");
      out.write("<script src=\"selectionComponent/script/hashtable.js\"></script>\r\n");
      out.write("<script src=\"script/date.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<form name=\"closeForm\" method=\"post\" action=\"reports/report.do\">\r\n");
      out.write("    ");
      if (_jspx_meth_html_hidden_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function closeWindow()\r\n");
      out.write("{\r\n");
      out.write("    document.closeForm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getId(id)\r\n");
      out.write("{\r\n");
      out.write("\tvar select = document.getElementById(\"parametersValue1_\" + id);\r\n");
      out.write("\tswitch (select.options[select.selectedIndex].value)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tcase \"hs2\": return \"hs2.hs2_cod\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"hs4\": return \"hs4.hs4_cod\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"hs6\": return \"hs6.hs6_cod\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"hs8\": return \"CONCAT(hs8.hs6_cod,hs8.tar_pr1)\";\r\n");
      out.write("//\t\tcase \"hs8\": return \"c8.cod\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t}\r\n");
      out.write("\treturn \"hs2.hs2_cod\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function getCase(id)\r\n");
      out.write("{\r\n");
      out.write("\tvar select = document.getElementById(\"parametersValue1_\" + id);\r\n");
      out.write("\tswitch (select.options[select.selectedIndex].value)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tcase \"hs2\": return \"unhs2tab\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"hs4\": return \"unhs4tab\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"hs6\": return \"unhs6tab\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"hs8\": return \"untartab\";\r\n");
      out.write("//\t\tcase \"hs8\": return \"codes8\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t}\r\n");
      out.write("\treturn \"unhs2tab\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function clearSelects(id)\r\n");
      out.write("{\r\n");
      out.write("\tvar select1 = document.getElementById(\"parametersValue2_\" + id);\r\n");
      out.write("\tvar select2 = document.getElementById(\"selComp\" + id);\r\n");
      out.write("\tvar select3 = document.getElementById(\"textselComp\"+id+\"cod\");\r\n");
      out.write("\r\n");
      out.write("\twhile (select1.options.length > 0) select1.options[0] = null;\r\n");
      out.write("\tselect2.value = '';\r\n");
      out.write("\tselect3.value = '';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function onSubmit()\r\n");
      out.write("{\r\n");
      out.write("\tfor (i = 0; i < 50; i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (document.getElementById(\"selComp\" + i) != null)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif (document.getElementById(\"selComp\" + i).options != null)\r\n");
      out.write("\t\t\t\tfor (q = 0; q < document.getElementById(\"selComp\" + i).options.length; q++)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"parametersValue2_\" + i).options[q] = new Option(document.getElementById(\"selComp\" + i).options[q].text, document.getElementById(\"selComp\" + i).options[q].value);\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"parametersValue2_\" + i).options[q].selected = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\tif (document.getElementById(\"selComp\" + i).value != \"\")\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"parametersValue2_\" + i).options[0] = new Option(document.getElementById(\"selComp\" + i).value, document.getElementById(\"selComp\" + i).value);\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"parametersValue2_\" + i).options[0].selected = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");

	{
		JRParameter[] jrParameters = (JRParameter[] ) request.getAttribute("JRParameters");

		int i = 0;
		for (int j = 0; j < jrParameters.length; j++)
		{
			JRParameter param = jrParameters[j];
			String visible = param.getPropertiesMap().getProperty("visible");
			if (!param.isSystemDefined()
					&& !param.getName().equalsIgnoreCase("SUBREPORT_DIR")
					&& !param.getName().equalsIgnoreCase("options")
					&& !param.getName().equalsIgnoreCase("order_by")
					&& !param.getName().equalsIgnoreCase("start_item")
					&& !param.getName().equalsIgnoreCase("end_item")
					&& (visible == null || !visible.equalsIgnoreCase("false")))
			{
				String label = param.getDescription() != null && !param.getDescription().equals("") ? param.getDescription() : param.getName();		
				String type = param.getPropertiesMap().getProperty("type");
				String multiple = param.getPropertiesMap().getProperty("multiple");
				String min = param.getPropertiesMap().getProperty("min");
				String max = param.getPropertiesMap().getProperty("max");
				String difference = param.getPropertiesMap().getProperty("difference");

				if (type != null && (type.equals(String.valueOf(java.sql.Types.DATE)) || type.equals(String.valueOf(java.sql.Types.TIMESTAMP))))
				{
					if (min != null && min.indexOf("sysdate") > -1)
					{
						Calendar c = Calendar.getInstance();
						c.add(Calendar.DAY_OF_MONTH, Integer.valueOf(min.substring(7)).intValue());
						min = ThreadSafeSDFs.getMsdf().format(c.getTime());
	                }
					if (max != null && max.indexOf("sysdate") > -1)
					{
						Calendar c = Calendar.getInstance();
						c.add(Calendar.DAY_OF_MONTH, Integer.valueOf(max.substring(7)).intValue());
						max = ThreadSafeSDFs.getMsdf().format(c.getTime());
	                }


					
      out.write("\r\n");
      out.write("\t\t\t\t\tif (document.getElementById(\"parametersEnabled\" + ");
      out.print(i);
      out.write(") == null || document.getElementById(\"parametersEnabled\" + ");
      out.print(i);
      out.write(").checked == true)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tif (document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value == \"\")\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (!isDate(document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value, \"dd/MM/yyyy\"))\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tselect = document.getElementById(\"parametersOperator\" + ");
      out.print(i);
      out.write(");\r\n");
      out.write("\t\t\t\t\t\tif (select.options[select.selectedIndex].value == \"");
      out.print(SIIVConstants.OPERATOR_BETWEEN);
      out.write("\")\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tif (document.getElementById(\"parametersValue2_\" + ");
      out.print(i);
      out.write(").value == \"\")\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tif (!isDate(document.getElementById(\"parametersValue2_\" + ");
      out.print(i);
      out.write(").value, \"dd/MM/yyyy\"))\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      if (_jspx_meth_bean_message_3(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tif (compareDates(document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value, \"dd/MM/yyyy\", document.getElementById(\"parametersValue2_\" + ");
      out.print(i);
      out.write(").value, \"dd/MM/yyyy\") == 1)\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      if (_jspx_meth_bean_message_4(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (difference != null)
							{
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tdate1 = getDateFromFormat(document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value, \"dd/MM/yyyy\");\r\n");
      out.write("\t\t\t\t\t\t\t\tdate2 = getDateFromFormat(document.getElementById(\"parametersValue2_\" + ");
      out.print(i);
      out.write(").value, \"dd/MM/yyyy\");\r\n");
      out.write("\t\t\t\t\t\t\t\tif ((date2 - date1)/1000/60/60/24 > ");
      out.print(difference);
      out.write(")\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_5.setParent(null);
      _jspx_th_bean_message_5.setBundle("report");
      _jspx_th_bean_message_5.setKey("report.parameters.error.difference.date");
      _jspx_th_bean_message_5.setArg0(difference);
      int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
      if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_5);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_5);
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t");

							}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t");

						if (min != null)
						{
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tif (compareDates(\"");
      out.print(min);
      out.write("\", \"dd/MM/yyyy\", document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value, \"dd/MM/yyyy\") == 1)\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_6.setParent(null);
      _jspx_th_bean_message_6.setBundle("report");
      _jspx_th_bean_message_6.setKey("report.parameters.error.min");
      _jspx_th_bean_message_6.setArg0(min);
      int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
      if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_6);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_6);
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

						if (max != null)
						{
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tif (compareDates(document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value, \"dd/MM/yyyy\", \"");
      out.print(max);
      out.write("\", \"dd/MM/yyyy\") == 1)\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_7 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_7.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_7.setParent(null);
      _jspx_th_bean_message_7.setBundle("report");
      _jspx_th_bean_message_7.setKey("report.parameters.error.max");
      _jspx_th_bean_message_7.setArg0(max);
      int _jspx_eval_bean_message_7 = _jspx_th_bean_message_7.doStartTag();
      if (_jspx_th_bean_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_7);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_7);
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t");

				}
				if (type != null && (type.equals(String.valueOf(java.sql.Types.NUMERIC)) || type.equals(String.valueOf(java.sql.Types.DECIMAL))  || type.equals(String.valueOf(java.sql.Types.DOUBLE))))
				{
					
      out.write("\r\n");
      out.write("\t\t\t\t\tif (document.getElementById(\"parametersEnabled\" + ");
      out.print(i);
      out.write(") == null || document.getElementById(\"parametersEnabled\" + ");
      out.print(i);
      out.write(").checked == true)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tif (document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value == \"\")\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      if (_jspx_meth_bean_message_8(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tselect = document.getElementById(\"parametersOperator\" + ");
      out.print(i);
      out.write(");\r\n");
      out.write("\t\t\t\t\t\tif (select.options[select.selectedIndex].value == \"");
      out.print(SIIVConstants.OPERATOR_BETWEEN);
      out.write("\")\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tif (document.getElementById(\"parametersValue2_\" + ");
      out.print(i);
      out.write(").value == \"\")\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      if (_jspx_meth_bean_message_9(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tif (document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value > document.getElementById(\"parametersValue2_\" + ");
      out.print(i);
      out.write(").value)\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      if (_jspx_meth_bean_message_10(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (difference != null)
							{
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tdata1 = document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value;\r\n");
      out.write("\t\t\t\t\t\t\t\tdata2 = document.getElementById(\"parametersValue2_\" + ");
      out.print(i);
      out.write(").value;\r\n");
      out.write("\t\t\t\t\t\t\t\tif ((date2 - date1) > ");
      out.print(difference);
      out.write(")\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_11 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_11.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_11.setParent(null);
      _jspx_th_bean_message_11.setBundle("report");
      _jspx_th_bean_message_11.setKey("report.parameters.error.difference.numeric");
      _jspx_th_bean_message_11.setArg0(difference);
      int _jspx_eval_bean_message_11 = _jspx_th_bean_message_11.doStartTag();
      if (_jspx_th_bean_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_11);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_11);
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t");

							}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t");

						if (min != null)
						{
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tif (document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value < ");
      out.print(min);
      out.write(")\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_12 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_12.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_12.setParent(null);
      _jspx_th_bean_message_12.setBundle("report");
      _jspx_th_bean_message_12.setKey("report.parameters.error.min");
      _jspx_th_bean_message_12.setArg0(min);
      int _jspx_eval_bean_message_12 = _jspx_th_bean_message_12.doStartTag();
      if (_jspx_th_bean_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_12);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_12);
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

						if (max != null)
						{
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tif (document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value > ");
      out.print(max);
      out.write(")\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_13 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_13.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_13.setParent(null);
      _jspx_th_bean_message_13.setBundle("report");
      _jspx_th_bean_message_13.setKey("report.parameters.error.max");
      _jspx_th_bean_message_13.setArg0(max);
      int _jspx_eval_bean_message_13 = _jspx_th_bean_message_13.doStartTag();
      if (_jspx_th_bean_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_13);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_13);
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t");

				}
				if (type != null && (type.equals(String.valueOf(java.sql.Types.VARCHAR))))
				{
					
      out.write("\r\n");
      out.write("\t\t\t\t\tif (document.getElementById(\"parametersEnabled\" + ");
      out.print(i);
      out.write(") == null || document.getElementById(\"parametersEnabled\" + ");
      out.print(i);
      out.write(").checked == true)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tselect = document.getElementById(\"parametersOperator\" + ");
      out.print(i);
      out.write(");\r\n");
      out.write("\t\t\t\t\t\tif (select.options[select.selectedIndex].value != \"");
      out.print(SIIVConstants.OPERATOR_IS_NOT_NULL);
      out.write("\" &&\r\n");
      out.write("\t\t\t\t\t\t\tselect.options[select.selectedIndex].value != \"");
      out.print(SIIVConstants.OPERATOR_IS_NULL);
      out.write("\" &&\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value == \"\")\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      if (_jspx_meth_bean_message_14(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t");

						if (min != null)
						{
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tif (document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value.length < ");
      out.print(min);
      out.write(")\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_15 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_15.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_15.setParent(null);
      _jspx_th_bean_message_15.setBundle("report");
      _jspx_th_bean_message_15.setKey("report.parameters.error.string.min");
      _jspx_th_bean_message_15.setArg0(min);
      int _jspx_eval_bean_message_15 = _jspx_th_bean_message_15.doStartTag();
      if (_jspx_th_bean_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_15);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_15);
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

						if (max != null)
						{
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tif (document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").value.length > ");
      out.print(max);
      out.write(")\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_16 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_16.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_16.setParent(null);
      _jspx_th_bean_message_16.setBundle("report");
      _jspx_th_bean_message_16.setKey("report.parameters.error.string.max");
      _jspx_th_bean_message_16.setArg0(max);
      int _jspx_eval_bean_message_16 = _jspx_th_bean_message_16.doStartTag();
      if (_jspx_th_bean_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_16);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_16);
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t");

				}

				String nomenclator_table = param.getPropertiesMap().getProperty("nomenclator_table");
				if ((nomenclator_table != null && multiple != null) || (type != null && Integer.valueOf(type).intValue() <= -300))
				{
					
      out.write("\r\n");
      out.write("\t\t\t\t\tif (document.getElementById(\"parametersEnabled\" + ");
      out.print(i);
      out.write(") == null || document.getElementById(\"parametersEnabled\" + ");
      out.print(i);
      out.write(").checked == true)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tj = 0;\r\n");
      out.write("\t\t\t\t\t\tfor (q = 0; q < document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").options.length; q++)\r\n");
      out.write("\t\t\t\t\t\t\tif (document.getElementById(\"parametersValue1_\" + ");
      out.print(i);
      out.write(").options[q].selected == true)\r\n");
      out.write("\t\t\t\t\t\t\t\tj ++;\r\n");
      out.write("\t\t\t\t\t\tif (j > ");
      out.print(multiple);
      out.write(")\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\talert(\"");
      out.print(label);
      out.write(' ');
      out.write('-');
      out.write(' ');
      //  bean:message
      org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_17 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
      _jspx_th_bean_message_17.setPageContext(_jspx_page_context);
      _jspx_th_bean_message_17.setParent(null);
      _jspx_th_bean_message_17.setBundle("report");
      _jspx_th_bean_message_17.setKey("report.parameters.error.multiselect");
      _jspx_th_bean_message_17.setArg0(multiple);
      int _jspx_eval_bean_message_17 = _jspx_th_bean_message_17.doStartTag();
      if (_jspx_th_bean_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_17);
        return;
      }
      _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_17);
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t");

				}
				i++;
			}
		}
	}

      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function toggleSecondValue(id)\r\n");
      out.write("{\r\n");
      out.write("\tvar select = document.getElementById(\"parametersOperator\" + id);\r\n");
      out.write("\tvar value1 = document.getElementById(\"parametersValue1_\" + id);\r\n");
      out.write("\tvar value2 = document.getElementById(\"parametersValue2_\" + id);\r\n");
      out.write("\tvar dateButton1 = document.getElementById(\"trigger_parametersValue1_\" + id);\r\n");
      out.write("\tvar dateButton2 = document.getElementById(\"trigger_parametersValue2_\" + id);\r\n");
      out.write("\tif (select.options[select.selectedIndex].value == \"");
      out.print(SIIVConstants.OPERATOR_BETWEEN);
      out.write("\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvalue1.disabled = false;\r\n");
      out.write("\t\tif (value2 != null)\r\n");
      out.write("\t\t\tvalue2.disabled = false;\r\n");
      out.write("\t\tif (dateButton1 != null)\r\n");
      out.write("\t\t\tdateButton1.disabled = false;\r\n");
      out.write("\t\tif (dateButton2 != null)\r\n");
      out.write("\t\t\tdateButton2.disabled = false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvalue1.disabled = false;\r\n");
      out.write("\t\tif (value2 != null)\r\n");
      out.write("\t\t\tvalue2.disabled = true;\r\n");
      out.write("\t\tif (dateButton1 != null)\r\n");
      out.write("\t\t\tdateButton1.disabled = false;\r\n");
      out.write("\t\tif (dateButton2 != null)\r\n");
      out.write("\t\t\tdateButton2.disabled = true;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function updateParameter(id)\r\n");
      out.write("{\r\n");
      out.write("    var checkbox = document.getElementById(\"parametersEnabled\" + id);\r\n");
      out.write("    var operator = document.getElementById(\"parametersOperator\" + id);\r\n");
      out.write("    var value1 = document.getElementById(\"parametersValue1_\" + id);\r\n");
      out.write("    var value2 = document.getElementById(\"parametersValue2_\" + id);\r\n");
      out.write("    var dateButton1 = document.getElementById(\"trigger_parametersValue1_\" + id);\r\n");
      out.write("    var dateButton2 = document.getElementById(\"trigger_parametersValue2_\" + id);\r\n");
      out.write("    var orderBy1 = document.getElementById(\"parametersOrderBy1_\" + id);\r\n");
      out.write("    var orderBy2 = document.getElementById(\"parametersOrderBy2_\" + id);\r\n");
      out.write("\tvar selComp = document.getElementById(\"selComp\" + id);\r\n");
      out.write("\tvar selCompVis = document.getElementById(\"selectVizibilselComp\" + id);\r\n");
      out.write("\tvar scSearchButton = document.getElementById(\"selComp\" + id + \"searchButton\");\r\n");
      out.write("\r\n");
      out.write("\tif (checkbox == null || checkbox.checked == true)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tisDisabled = false;\r\n");
      out.write("\t\tdocument.getElementById(\"rowId\" + id).style.backgroundColor = id % 2 == 0 ? \"#F9F9F9\" : \"#FFFFFF\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\tisDisabled = true;\r\n");
      out.write("\t\tdocument.getElementById(\"rowId\" + id).style.backgroundColor = \"#E7E7E7\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif (operator != null) operator.disabled = isDisabled;\r\n");
      out.write("\tif (value1 != null) value1.disabled = isDisabled;\r\n");
      out.write("\tif (value2 != null) value2.disabled = isDisabled;\r\n");
      out.write("\tif (dateButton1 != null) dateButton1.disabled = isDisabled;\r\n");
      out.write("\tif (dateButton2 != null) dateButton2.disabled = isDisabled;\r\n");
      out.write("\tif (orderBy1 != null) orderBy1.disabled = isDisabled;\r\n");
      out.write("\tif (orderBy2 != null) orderBy2.disabled = isDisabled;\r\n");
      out.write("\tif (selComp != null) selComp.disabled = isDisabled;\r\n");
      out.write("\tif (selCompVis != null) selCompVis.disabled = isDisabled;\r\n");
      out.write("\tif (scSearchButton != null) scSearchButton.disabled = isDisabled;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"table\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td width=\"100%\" valign=\"top\" align=\"left\" class=\"page-subtitle\">\r\n");
      out.write("            <!-- Titlul ferestrei. -->\r\n");
      out.write("            ");
      if (_jspx_meth_bean_message_18(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t-\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_bean_write_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("        <td class=\"bottom\" align=\"right\">\r\n");
      out.write("            <img border=\"0\" style=\"cursor:pointer;\" onClick=\"javascript:closeWindow();\"\r\n");
      out.write("                 title='");
      if (_jspx_meth_bean_message_19(_jspx_page_context))
        return;
      out.write("' src=\"images/close_off.gif\"\r\n");
      out.write("                 onMouseOver=\"this.src='images/close_on.gif'\" onmouseout=\"this.src='images/close_off.gif'\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<!-- Sectiune de erori -->\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("    ");
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_messagesPresent_0.setParent(null);
      int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
      if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        <tr>\r\n");
          out.write("            <td valign=\"top\" colspan=\"2\" align=\"center\" class=\"msg_error\">\r\n");
          out.write("                ");
          //  html:messages
          org.apache.struts.taglib.html.MessagesTag _jspx_th_html_messages_0 = (org.apache.struts.taglib.html.MessagesTag) _jspx_tagPool_html_messages_id_bundle.get(org.apache.struts.taglib.html.MessagesTag.class);
          _jspx_th_html_messages_0.setPageContext(_jspx_page_context);
          _jspx_th_html_messages_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
          _jspx_th_html_messages_0.setId("error");
          _jspx_th_html_messages_0.setBundle("report");
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
              out.write("                    ");
              if (_jspx_meth_bean_write_1(_jspx_th_html_messages_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                    <br>\r\n");
              out.write("                ");
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
          out.write("            </td>\r\n");
          out.write("        </tr>\r\n");
          out.write("    ");
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
      out.write("<!-- Sectiune de parametrii enctype=\"multipart/form-data\" -->\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"3\" class=\"report\">\r\n");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_onsubmit_method_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/print.do");
      _jspx_th_html_form_0.setMethod("get");
      _jspx_th_html_form_0.setOnsubmit("return onSubmit();");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_html_hidden_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("<tr>\r\n");
          out.write("\t<td align=\"center\">\r\n");
          out.write("\t\t&nbsp;\r\n");
          out.write("\t</td>\r\n");
          out.write("\t<td align=\"center\">\r\n");
          out.write("        &nbsp;\r\n");
          out.write("        ");
          if (_jspx_meth_bean_message_20(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        &nbsp;\r\n");
          out.write("    </td>\r\n");
          out.write("    <td align=\"center\">\r\n");
          out.write("        &nbsp;\r\n");
          out.write("        ");
          if (_jspx_meth_bean_message_21(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        &nbsp;\r\n");
          out.write("    </td>\r\n");
          out.write("    <td align=\"center\">\r\n");
          out.write("        &nbsp;\r\n");
          out.write("        ");
          if (_jspx_meth_bean_message_22(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        &nbsp;\r\n");
          out.write("    </td>\r\n");
          out.write("    <td align=\"center\">\r\n");
          out.write("        &nbsp;\r\n");
          out.write("        ");
          if (_jspx_meth_bean_message_23(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        &nbsp;\r\n");
          out.write("    </td>\r\n");
          out.write("</tr>\r\n");
          out.write("\r\n");

	JRParameter[] jrParameters = (JRParameter[] ) request.getAttribute("JRParameters");

	int i = 0;
	for (int j = 0; j < jrParameters.length; j++)
	{
		JRParameter param = jrParameters[j];
		String visible = param.getPropertiesMap().getProperty("visible");
		if (!param.isSystemDefined()
				&& !param.getName().equalsIgnoreCase("SUBREPORT_DIR")
				&& !param.getName().equalsIgnoreCase("options")
				&& !param.getName().equalsIgnoreCase("order_by")
				&& !param.getName().equalsIgnoreCase("start_item")
				&& !param.getName().equalsIgnoreCase("end_item")
				&& (visible == null || !visible.equalsIgnoreCase("false")))
		{
			String type = param.getPropertiesMap().getProperty("type");
			
          out.write("\r\n");
          out.write("\t\t\t<tr id=\"");
          out.print("rowId"+i);
          out.write("\" style=\"backgroundColor:");
          out.print((i % 2 == 0 ? "#F9F9F9" : "#FFFFFF"));
          out.write(";\">\r\n");
          out.write("\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t");


			String required = param.getPropertiesMap().getProperty("required");
			if (required != null && required.equalsIgnoreCase("true"))
			{
				
          out.write("\t<input type=\"hidden\" name=\"p[");
          out.print(i);
          out.write("].enabled\" value=\"true\"/>");

			}
			else
			{
				
          out.write("\t<input type=\"checkbox\" name=\"p[");
          out.print(i);
          out.write("].enabled\" id=\"");
          out.print( "parametersEnabled" + i );
          out.write("\" value=\"true\" onclick=\"javascript:updateParameter(");
          out.print(i);
          out.write(')');
          out.write('"');
          out.write('>');

			}

			
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t");
          out.print(param.getDescription() != null && !param.getDescription().equals("") ? param.getDescription() : param.getName());
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("    \t\t<td align=\"center\">\r\n");
          out.write("\t\t\t");

				String tooltip = param.getPropertiesMap().getProperty("tooltip");
				String operators = param.getPropertiesMap().getProperty("operators");
				String min = param.getPropertiesMap().getProperty("min");
				String max = param.getPropertiesMap().getProperty("max");
				String difference = param.getPropertiesMap().getProperty("difference");
				String value1 = param.getPropertiesMap().getProperty("default");
				if (value1 != null && value1.equalsIgnoreCase("sysdate"))
					value1 = ThreadSafeSDFs.getMsdf().format(Calendar.getInstance().getTime());
				if (value1 == null)
					value1 = "";

			if (type != null && (type.equals(String.valueOf(java.sql.Types.DATE)) || type.equals(String.valueOf(java.sql.Types.TIMESTAMP))))
			{
				if (min != null && min.indexOf("sysdate") > -1)
				{
					Calendar c = Calendar.getInstance();
					c.add(Calendar.DAY_OF_MONTH, Integer.valueOf(min.substring(7)).intValue());
					min = ThreadSafeSDFs.getMsdf().format(c.getTime());
				}
				if (max != null && max.indexOf("sysdate") > -1)
				{
					Calendar c = Calendar.getInstance();
					c.add(Calendar.DAY_OF_MONTH, Integer.valueOf(max.substring(7)).intValue());
					max = ThreadSafeSDFs.getMsdf().format(c.getTime());
				}

				
          out.write("<select align=\"absmiddle\" name=\"p[");
          out.print(i);
          out.write("].operator\" id=\"");
          out.print( "parametersOperator" + i);
          out.write("\" class=\"selectboxTag\" onchange=\"javascript:toggleSecondValue(");
          out.print(i);
          out.write(')');
          out.write('"');
          out.write('>');

				if (operators == null) operators = "0;1;2;3;4;5;";
				if (operators.indexOf("0;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_EQUAL_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_24(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				if (operators.indexOf("1;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_GREATER_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_25(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				if (operators.indexOf("2;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_LESS_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_26(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				if (operators.indexOf("3;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_GREATER_OR_EQUAL_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_27(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				if (operators.indexOf("4;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_LESS_OR_EQUAL_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_28(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				if (operators.indexOf("5;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_BETWEEN_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_29(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				
          out.write("</select>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t\t<input type=\"text\" name=\"p[");
          out.print(i);
          out.write("].value1\" value=\"");
          out.print(value1);
          out.write("\" id=\"");
          out.print( "parametersValue1_" + i);
          out.write("\" class=\"field_input\">\r\n");
          out.write("\t\t\t\t\t<input align=\"absmiddle\" type=\"image\" src=\"images/cal.gif\" id=\"");
          out.print( "trigger_parametersValue1_" + i);
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t<script type=\"text/javascript\">\r\n");
          out.write("\t\t\t\t\t\tCalendar.setup(\r\n");
          out.write("\t\t\t\t\t\t{\r\n");
          out.write("\t\t\t\t\t\t\tinputField  : \"p[");
          out.print(i);
          out.write("].value1\",// ID of the input field\r\n");
          out.write("\t\t\t\t\t\t\tifFormat    : \"%d/%m/%Y\",    // the date format\r\n");
          out.write("\t\t\t\t\t\t\tbutton      : \"");
          out.print( "trigger_parametersValue1_" + i);
          out.write("\"// ID of the button\r\n");
          out.write("\t\t\t\t\t\t}\r\n");
          out.write("\t\t\t\t\t\t\t\t);\r\n");
          out.write("\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t<img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_30(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
if (min != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_31 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_31.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_31.setBundle("report");
          _jspx_th_bean_message_31.setKey("report.parameters.label.tooltip.date.min");
          _jspx_th_bean_message_31.setArg0(min);
          int _jspx_eval_bean_message_31 = _jspx_th_bean_message_31.doStartTag();
          if (_jspx_th_bean_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_31);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_31);
}
          out.write('\r');
          out.write('\n');
if (max != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_32 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_32.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_32.setBundle("report");
          _jspx_th_bean_message_32.setKey("report.parameters.label.tooltip.date.max");
          _jspx_th_bean_message_32.setArg0(max);
          int _jspx_eval_bean_message_32 = _jspx_th_bean_message_32.doStartTag();
          if (_jspx_th_bean_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_32);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_32);
}
          out.write('\r');
          out.write('\n');
if (difference != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_33 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_33.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_33.setBundle("report");
          _jspx_th_bean_message_33.setKey("report.parameters.label.tooltip.date.difference.date");
          _jspx_th_bean_message_33.setArg0(difference);
          int _jspx_eval_bean_message_33 = _jspx_th_bean_message_33.doStartTag();
          if (_jspx_th_bean_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_33);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_33);
}
          out.write('\r');
          out.write('\n');
if (tooltip != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_34 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_34.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_34.setBundle("report");
          _jspx_th_bean_message_34.setKey("report.parameters.label.tooltip");
          _jspx_th_bean_message_34.setArg0(tooltip);
          int _jspx_eval_bean_message_34 = _jspx_th_bean_message_34.doStartTag();
          if (_jspx_th_bean_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_34);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_34);
}
          out.write("\"/>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t");

					if (operators.indexOf("5;") > -1)
					{
				
          out.write("\r\n");
          out.write("\t\t\t\t\t<input type=\"text\" name=\"p[");
          out.print(i);
          out.write("].value2\" value=\"\" id=\"");
          out.print( "parametersValue2_" + i);
          out.write("\" class=\"field_input\">\r\n");
          out.write("\t\t\t\t\t<input align=\"absmiddle\" type=\"image\" src=\"images/cal.gif\" id=\"");
          out.print( "trigger_parametersValue2_" + i);
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t<script type=\"text/javascript\">\r\n");
          out.write("\t\t\t\t\t\tCalendar.setup(\r\n");
          out.write("\t\t\t\t\t\t{\r\n");
          out.write("\t\t\t\t\t\t\tinputField  : \"p[");
          out.print(i);
          out.write("].value2\",// ID of the input field\r\n");
          out.write("\t\t\t\t\t\t\tifFormat    : \"%d/%m/%Y\",    // the date format\r\n");
          out.write("\t\t\t\t\t\t\tbutton      : \"");
          out.print( "trigger_parametersValue2_" + i);
          out.write("\"// ID of the button\r\n");
          out.write("\t\t\t\t\t\t}\r\n");
          out.write("\t\t\t\t\t\t\t\t);\r\n");
          out.write("\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t");

					}
			}
			if (type != null && (type.equals(String.valueOf(java.sql.Types.NUMERIC)) || type.equals(String.valueOf(java.sql.Types.DECIMAL))))
			{
			    
          out.write("<select align=\"absmiddle\" name=\"p[");
          out.print(i);
          out.write("].operator\" id=\"");
          out.print( "parametersOperator" + i);
          out.write("\" class=\"selectboxTag\" onchange=\"javascript:toggleSecondValue(");
          out.print(i);
          out.write(')');
          out.write('"');
          out.write('>');

				if (operators == null) operators = "0;1;2;3;4;5;";
				if (operators.indexOf("0;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_EQUAL_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_35(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				if (operators.indexOf("1;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_GREATER_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_36(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				if (operators.indexOf("2;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_LESS_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_37(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				if (operators.indexOf("3;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_GREATER_OR_EQUAL_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_38(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				if (operators.indexOf("4;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_LESS_OR_EQUAL_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_39(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				if (operators.indexOf("5;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_BETWEEN_STR);
          out.write("\">\r\n");
          out.write("                \t\t");
          if (_jspx_meth_bean_message_40(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            \t\t</option>");

				}
				
          out.write("</select>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t\t<input type=\"text\" name=\"p[");
          out.print(i);
          out.write("].value1\" id=\"");
          out.print( "parametersValue1_" + i);
          out.write("\" value=\"");
          out.print(value1);
          out.write("\" class=\"field_input\">\r\n");
          out.write("\t\t\t\t\t<img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_41(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
if (min != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_42 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_42.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_42.setBundle("report");
          _jspx_th_bean_message_42.setKey("report.parameters.label.tooltip.numeric.min");
          _jspx_th_bean_message_42.setArg0(min);
          int _jspx_eval_bean_message_42 = _jspx_th_bean_message_42.doStartTag();
          if (_jspx_th_bean_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_42);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_42);
}
          out.write('\r');
          out.write('\n');
if (max != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_43 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_43.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_43.setBundle("report");
          _jspx_th_bean_message_43.setKey("report.parameters.label.tooltip.numeric.max");
          _jspx_th_bean_message_43.setArg0(max);
          int _jspx_eval_bean_message_43 = _jspx_th_bean_message_43.doStartTag();
          if (_jspx_th_bean_message_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_43);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_43);
}
          out.write('\r');
          out.write('\n');
if (difference != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_44 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_44.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_44.setBundle("report");
          _jspx_th_bean_message_44.setKey("report.parameters.label.tooltip.date.difference.numeric");
          _jspx_th_bean_message_44.setArg0(difference);
          int _jspx_eval_bean_message_44 = _jspx_th_bean_message_44.doStartTag();
          if (_jspx_th_bean_message_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_44);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_44);
}
          out.write('\r');
          out.write('\n');
if (tooltip != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_45 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_45.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_45.setBundle("report");
          _jspx_th_bean_message_45.setKey("report.parameters.label.tooltip");
          _jspx_th_bean_message_45.setArg0(tooltip);
          int _jspx_eval_bean_message_45 = _jspx_th_bean_message_45.doStartTag();
          if (_jspx_th_bean_message_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_45);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_45);
}
          out.write("\"/>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t");

					if (operators.indexOf("5;") > -1)
					{
				
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<input type=\"text\" name=\"p[");
          out.print(i);
          out.write("].value2\" id=\"");
          out.print( "parametersValue2_" + i);
          out.write("\" value=\"\" class=\"field_input\">\r\n");
          out.write("\t\t\t\t");

					}
			}
			if (type != null && (type.equals(String.valueOf(java.sql.Types.VARCHAR))))
			{
				
          out.write("<select align=\"absmiddle\" name=\"p[");
          out.print(i);
          out.write("].operator\" id=\"");
          out.print( "parametersOperator" + i);
          out.write("\" class=\"selectboxTag\" onchange=\"javascript:toggleSecondValue(");
          out.print(i);
          out.write(')');
          out.write('"');
          out.write('>');

				if (operators == null) operators = "6;7;8;0;9;";
				if (operators.indexOf("6;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_BEGIN_WITH_STR);
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_bean_message_46(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t</option>");

				}
				if (operators.indexOf("7;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_END_WITH_STR);
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_bean_message_47(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t</option>");

				}
				if (operators.indexOf("8;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_CONTAINS_STR);
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_bean_message_48(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t</option>");

				}
				if (operators.indexOf("0;") > -1)
				{
					
          out.write("<option value=\"");
          out.print(SIIVConstants.OPERATOR_EQUAL_STR);
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_bean_message_49(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t</option>");

				}
				
          out.write("</select>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td align=\"left\" colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t<input type=\"text\" name=\"p[");
          out.print(i);
          out.write("].value1\" id=\"");
          out.print( "parametersValue1_" + i);
          out.write("\" value=\"");
          out.print(value1);
          out.write("\" class=\"field_input\">\r\n");
          out.write("\t\t\t\t\t<img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_50(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
if (min != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_51 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_51.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_51.setBundle("report");
          _jspx_th_bean_message_51.setKey("report.parameters.label.tooltip.string.min");
          _jspx_th_bean_message_51.setArg0(min);
          int _jspx_eval_bean_message_51 = _jspx_th_bean_message_51.doStartTag();
          if (_jspx_th_bean_message_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_51);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_51);
}
          out.write('\r');
          out.write('\n');
if (max != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_52 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_52.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_52.setBundle("report");
          _jspx_th_bean_message_52.setKey("report.parameters.label.tooltip.string.max");
          _jspx_th_bean_message_52.setArg0(max);
          int _jspx_eval_bean_message_52 = _jspx_th_bean_message_52.doStartTag();
          if (_jspx_th_bean_message_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_52);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_52);
}
          out.write('\r');
          out.write('\n');
if (tooltip != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_53 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_53.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_53.setBundle("report");
          _jspx_th_bean_message_53.setKey("report.parameters.label.tooltip");
          _jspx_th_bean_message_53.setArg0(tooltip);
          int _jspx_eval_bean_message_53 = _jspx_th_bean_message_53.doStartTag();
          if (_jspx_th_bean_message_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_53);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_53);
}
          out.write("\"/>\r\n");
          out.write("\t\t\t\t");

			}

			String nomenclator_table = param.getPropertiesMap().getProperty("nomenclator_table");
			Map nomenclator = null;
			if (nomenclator_table != null)
			{
				String nomenclator_id = param.getPropertiesMap().getProperty("nomenclator_id");
				String nomenclator_code = param.getPropertiesMap().getProperty("nomenclator_code");
				String nomenclator_descr = param.getPropertiesMap().getProperty("nomenclator_descr");

				nomenclator = DatabaseMetaData.getInstance().getNomenclator(nomenclator_table, nomenclator_id, nomenclator_code, nomenclator_descr);
			}

			if (type != null && Integer.valueOf(type).intValue() <= -300)
			{
				nomenclator = SIIVConstants.getNomenclator(Integer.valueOf(type).intValue());
			}

			if (nomenclator != null)
			{
				String multiple = param.getPropertiesMap().getProperty("multiple");
				String[] values = value1.split(";");

				
          if (_jspx_meth_bean_message_54(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td align=\"left\" colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t<select align=\"absmiddle\" name=\"p[");
          out.print(i);
          out.write("].nom\" id=\"");
          out.print( "parametersValue1_" + i);
          out.write('"');
          out.write(' ');
          out.print((multiple != null && Integer.valueOf(multiple).intValue() == 1?"":"multiple=\"true\""));
          out.write(' ');
          out.print((multiple != null && Integer.valueOf(multiple).intValue() == 1?"":"height=\"5\""));
          out.write(" class=\"selectboxTag\">\r\n");
          out.write("\t\t\t\t\t\t");

							for (Iterator iterator = nomenclator.keySet().iterator(); iterator.hasNext();)
							{
								String key = (String) iterator.next();
								String value = (String) nomenclator.get(key);
						
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<option value=\"");
          out.print(key);
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t");

									for (int cnt = 0; cnt < values.length; cnt++)
										if (key.equalsIgnoreCase(values[cnt]))
											out.print("selected");
								
          out.write(">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          out.print(value);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t");

							}
						
          out.write("\r\n");
          out.write("\t\t\t\t\t</select>\r\n");
          out.write("\t\t\t\t\t<img src=\"images/quest.gif\" width=\"15\" height=\"15\" style=\"cursor:pointer;\" title=\"");
          if (_jspx_meth_bean_message_55(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
if (multiple != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_56 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_56.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_56.setBundle("report");
          _jspx_th_bean_message_56.setKey("report.parameters.label.tooltip.nomenclator.multiple");
          _jspx_th_bean_message_56.setArg0(multiple);
          int _jspx_eval_bean_message_56 = _jspx_th_bean_message_56.doStartTag();
          if (_jspx_th_bean_message_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_56);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_56);
}
          out.write('\r');
          out.write('\n');
if (tooltip != null){
          //  bean:message
          org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_57 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_arg0_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
          _jspx_th_bean_message_57.setPageContext(_jspx_page_context);
          _jspx_th_bean_message_57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_message_57.setBundle("report");
          _jspx_th_bean_message_57.setKey("report.parameters.label.tooltip");
          _jspx_th_bean_message_57.setArg0(tooltip);
          int _jspx_eval_bean_message_57 = _jspx_th_bean_message_57.doStartTag();
          if (_jspx_th_bean_message_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_57);
            return;
          }
          _jspx_tagPool_bean_message_key_bundle_arg0_nobody.reuse(_jspx_th_bean_message_57);
}
          out.write("\"/>\r\n");
          out.write("\t\t\t\t");

			}

			if (type != null && (type.equals("-100")))
			{
				String[] values = value1.split(";");
				int length = (values.length > 0) ? values[0].length() : 0;

				
          if (_jspx_meth_bean_message_58(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t\t<select name=\"p[");
          out.print(i);
          out.write("].nom\" id=\"");
          out.print( "parametersValue2_" + i);
          out.write("\" multiple=\"true\" style=\"visibility:hidden;width:1;height:1\"></select>\r\n");
          out.write("\t\t\t\t\t<select align=\"absmiddle\" name=\"p[");
          out.print(i);
          out.write("].value1\" id=\"");
          out.print( "parametersValue1_" + i);
          out.write("\" class=\"selectboxTag\" onchange=\"");
          out.print( "clearSelects(" + i + ")");
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t<option value=\"hs2\" ");
          out.print((length == 2?"SELECTED":""));
          out.write(">\r\n");
          out.write("\t\t\t\t\t\t\tNomenclator 2 cifre\r\n");
          out.write("\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t<option value=\"hs4\" ");
          out.print((length == 4?"SELECTED":""));
          out.write(">\r\n");
          out.write("\t\t\t\t\t\t\tNomenclator 4 cifre\r\n");
          out.write("\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t<option value=\"hs6\" ");
          out.print((length == 6?"SELECTED":""));
          out.write(">\r\n");
          out.write("\t\t\t\t\t\t\tNomenclator 6 cifre\r\n");
          out.write("\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t<option value=\"hs8\" ");
          out.print((length == 8?"SELECTED":""));
          out.write(">\r\n");
          out.write("\t\t\t\t\t\t\tNomenclator 8 cifre\r\n");
          out.write("\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t</select>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t\t");
          //  selection:selectionComponent
          ro.uti.waf.components.selectionComponent.taglib.selectionComponent.SelectionComponentTag _jspx_th_selection_selectionComponent_0 = (ro.uti.waf.components.selectionComponent.taglib.selectionComponent.SelectionComponentTag) _jspx_tagPool_selection_selectionComponent_name_multiple_idTableName_detailsFieldName.get(ro.uti.waf.components.selectionComponent.taglib.selectionComponent.SelectionComponentTag.class);
          _jspx_th_selection_selectionComponent_0.setPageContext(_jspx_page_context);
          _jspx_th_selection_selectionComponent_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_selection_selectionComponent_0.setName("selComp"+i);
          _jspx_th_selection_selectionComponent_0.setDetailsFieldName("dsc");
          _jspx_th_selection_selectionComponent_0.setIdTableName("getId("+i+")");
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
              out.write("\t\t\t\t\t\t");
              //  selection:genericSelection
              ro.uti.waf.components.selectionComponent.taglib.selectionComponent.genericSelection.GenericSelectionTag _jspx_th_selection_genericSelection_0 = (ro.uti.waf.components.selectionComponent.taglib.selectionComponent.genericSelection.GenericSelectionTag) _jspx_tagPool_selection_genericSelection_styleClass_showCodeInsert_searchCaseId_knownFieldName.get(ro.uti.waf.components.selectionComponent.taglib.selectionComponent.genericSelection.GenericSelectionTag.class);
              _jspx_th_selection_genericSelection_0.setPageContext(_jspx_page_context);
              _jspx_th_selection_genericSelection_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_selection_selectionComponent_0);
              _jspx_th_selection_genericSelection_0.setSearchCaseId("getCase("+i+")");
              _jspx_th_selection_genericSelection_0.setShowCodeInsert("true");
              _jspx_th_selection_genericSelection_0.setKnownFieldName("cod");
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
                  out.write("\t\t\t\t\t\t");
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
                return;
              }
              _jspx_tagPool_selection_genericSelection_styleClass_showCodeInsert_searchCaseId_knownFieldName.reuse(_jspx_th_selection_genericSelection_0);
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_selection_selectionComponent_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_selection_selectionComponent_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_selection_selectionComponent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_selection_selectionComponent_name_multiple_idTableName_detailsFieldName.reuse(_jspx_th_selection_selectionComponent_0);
            return;
          }
          _jspx_tagPool_selection_selectionComponent_name_multiple_idTableName_detailsFieldName.reuse(_jspx_th_selection_selectionComponent_0);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t<script>\r\n");
          out.write("\t\t\t\t\t\t");

							for (int cnt = 0; cnt < values.length; cnt++)
							{
						
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\tdocument.getElementById(\"");
          out.print("selComp"+i);
          out.write("\").value = \"");
          out.print(values[cnt]);
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\tdocument.getElementById(\"");
          out.print("textselComp"+i+"cod");
          out.write("\").value = \"");
          out.print(values[cnt]);
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t");

							}
						
          out.write("\r\n");
          out.write("\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t");

			}

			
          out.write("</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<script>\r\n");
          out.write("\t\t\t\tupdateParameter(");
          out.print(i);
          out.write(");\r\n");
          out.write("\t\t\t</script>");

			i++;
		}
		else
			if (param.getName().equalsIgnoreCase("options"))
			{
				String order = param.getPropertiesMap().getProperty("order");
				String order_labels = param.getPropertiesMap().getProperty("order_labels");
				if (order != null)
				{
					String[] columns = order.split(";");
					String[] labels = order_labels != null ? order_labels.split(";") : null;
					if (columns.length > 0)
					{
						
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t<td align=\"left\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_bean_message_59(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_bean_message_60(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td align=\"left\" colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<select align=\"absmiddle\" name=\"order1\" id=\"order1\" class=\"selectboxTag\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										for (int w = 0; w < columns.length; w ++)
										{
											
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print(columns[w]);
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.print(labels != null && w <= labels.length  - 1 ? labels[w] : columns[w]);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t    ");

										}
									
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</select>\r\n");
          out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t\t<select align=\"absmiddle\" name=\"order2\" id=\"order2\" class=\"selectboxTag\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print(SIIVConstants.SORT_ORDER_ASCENDING_STR);
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_bean_message_61(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print(SIIVConstants.SORT_ORDER_DESCENDING_STR);
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_bean_message_62(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t</select>\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t");

					}
				}
			}
	}

          out.write("\r\n");
          out.write("\r\n");
          out.write("<!-- Buton incarcare. -->\r\n");
          out.write("<tr>\r\n");
          out.write("    <td colspan=\"5\">\r\n");
          out.write("        &nbsp;\r\n");
          out.write("    </td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("    <td colspan=\"5\" class=\"button-row\" align=\"center\">\r\n");
          out.write("        ");
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_html_hidden_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    </td>\r\n");
          out.write("</tr>\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_onsubmit_method_action.reuse(_jspx_th_html_form_0);
        return;
      }
      _jspx_tagPool_html_form_onsubmit_method_action.reuse(_jspx_th_html_form_0);
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
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
    _jspx_th_html_hidden_0.setValue("listMine");
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
    _jspx_th_bean_message_0.setBundle("report");
    _jspx_th_bean_message_0.setKey("report.parameters.error.val1");
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
    _jspx_th_bean_message_1.setBundle("report");
    _jspx_th_bean_message_1.setKey("report.parameters.error.date.val1");
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
    _jspx_th_bean_message_2.setBundle("report");
    _jspx_th_bean_message_2.setKey("report.parameters.error.val2");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_3.setParent(null);
    _jspx_th_bean_message_3.setBundle("report");
    _jspx_th_bean_message_3.setKey("report.parameters.error.date.val2");
    int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
    if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_4.setParent(null);
    _jspx_th_bean_message_4.setBundle("report");
    _jspx_th_bean_message_4.setKey("report.parameters.error.invert");
    int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
    if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_8 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_8.setParent(null);
    _jspx_th_bean_message_8.setBundle("report");
    _jspx_th_bean_message_8.setKey("report.parameters.error.val1");
    int _jspx_eval_bean_message_8 = _jspx_th_bean_message_8.doStartTag();
    if (_jspx_th_bean_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_8);
    return false;
  }

  private boolean _jspx_meth_bean_message_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_9 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_9.setParent(null);
    _jspx_th_bean_message_9.setBundle("report");
    _jspx_th_bean_message_9.setKey("report.parameters.error.val2");
    int _jspx_eval_bean_message_9 = _jspx_th_bean_message_9.doStartTag();
    if (_jspx_th_bean_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_9);
    return false;
  }

  private boolean _jspx_meth_bean_message_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_10 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_10.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_10.setParent(null);
    _jspx_th_bean_message_10.setBundle("report");
    _jspx_th_bean_message_10.setKey("report.parameters.error.invert");
    int _jspx_eval_bean_message_10 = _jspx_th_bean_message_10.doStartTag();
    if (_jspx_th_bean_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_10);
    return false;
  }

  private boolean _jspx_meth_bean_message_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_14 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_14.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_14.setParent(null);
    _jspx_th_bean_message_14.setBundle("report");
    _jspx_th_bean_message_14.setKey("report.parameters.error.val1");
    int _jspx_eval_bean_message_14 = _jspx_th_bean_message_14.doStartTag();
    if (_jspx_th_bean_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_14);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_14);
    return false;
  }

  private boolean _jspx_meth_bean_message_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_18 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_18.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_18.setParent(null);
    _jspx_th_bean_message_18.setBundle("report");
    _jspx_th_bean_message_18.setKey("report.title.parameters");
    int _jspx_eval_bean_message_18 = _jspx_th_bean_message_18.doStartTag();
    if (_jspx_th_bean_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_18);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent(null);
    _jspx_th_bean_write_0.setName("reportName");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_19 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_19.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_19.setParent(null);
    _jspx_th_bean_message_19.setBundle("report");
    _jspx_th_bean_message_19.setKey("report.label.closeWindow");
    int _jspx_eval_bean_message_19 = _jspx_th_bean_message_19.doStartTag();
    if (_jspx_th_bean_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_19);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_messages_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_messages_0);
    _jspx_th_bean_write_1.setName("error");
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_1);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_1);
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
    _jspx_th_html_hidden_1.setProperty("report_id");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_1);
      return true;
    }
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_20(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_20 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_20.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_20.setBundle("report");
    _jspx_th_bean_message_20.setKey("report.parametersTable.parameter");
    int _jspx_eval_bean_message_20 = _jspx_th_bean_message_20.doStartTag();
    if (_jspx_th_bean_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_20);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_20);
    return false;
  }

  private boolean _jspx_meth_bean_message_21(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_21 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_21.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_21.setBundle("report");
    _jspx_th_bean_message_21.setKey("report.parametersTable.operation");
    int _jspx_eval_bean_message_21 = _jspx_th_bean_message_21.doStartTag();
    if (_jspx_th_bean_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_21);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_21);
    return false;
  }

  private boolean _jspx_meth_bean_message_22(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_22 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_22.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_22.setBundle("report");
    _jspx_th_bean_message_22.setKey("report.parametersTable.value1");
    int _jspx_eval_bean_message_22 = _jspx_th_bean_message_22.doStartTag();
    if (_jspx_th_bean_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_22);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_22);
    return false;
  }

  private boolean _jspx_meth_bean_message_23(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_23 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_23.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_23.setBundle("report");
    _jspx_th_bean_message_23.setKey("report.parametersTable.value2");
    int _jspx_eval_bean_message_23 = _jspx_th_bean_message_23.doStartTag();
    if (_jspx_th_bean_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_23);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_23);
    return false;
  }

  private boolean _jspx_meth_bean_message_24(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_24 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_24.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_24.setBundle("report");
    _jspx_th_bean_message_24.setKey("report.parameters.operators.numberOrDate.equal");
    int _jspx_eval_bean_message_24 = _jspx_th_bean_message_24.doStartTag();
    if (_jspx_th_bean_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_24);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_24);
    return false;
  }

  private boolean _jspx_meth_bean_message_25(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_25 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_25.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_25.setBundle("report");
    _jspx_th_bean_message_25.setKey("report.parameters.operators.numberOrDate.greater");
    int _jspx_eval_bean_message_25 = _jspx_th_bean_message_25.doStartTag();
    if (_jspx_th_bean_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_25);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_25);
    return false;
  }

  private boolean _jspx_meth_bean_message_26(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_26 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_26.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_26.setBundle("report");
    _jspx_th_bean_message_26.setKey("report.parameters.operators.numberOrDate.less");
    int _jspx_eval_bean_message_26 = _jspx_th_bean_message_26.doStartTag();
    if (_jspx_th_bean_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_26);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_26);
    return false;
  }

  private boolean _jspx_meth_bean_message_27(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_27 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_27.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_27.setBundle("report");
    _jspx_th_bean_message_27.setKey("report.parameters.operators.numberOrDate.greaterOrEqual");
    int _jspx_eval_bean_message_27 = _jspx_th_bean_message_27.doStartTag();
    if (_jspx_th_bean_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_27);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_27);
    return false;
  }

  private boolean _jspx_meth_bean_message_28(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_28 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_28.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_28.setBundle("report");
    _jspx_th_bean_message_28.setKey("report.parameters.operators.numberOrDate.lessOrEqual");
    int _jspx_eval_bean_message_28 = _jspx_th_bean_message_28.doStartTag();
    if (_jspx_th_bean_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_28);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_28);
    return false;
  }

  private boolean _jspx_meth_bean_message_29(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_29 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_29.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_29.setBundle("report");
    _jspx_th_bean_message_29.setKey("report.parameters.operators.numberOrDate.between");
    int _jspx_eval_bean_message_29 = _jspx_th_bean_message_29.doStartTag();
    if (_jspx_th_bean_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_29);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_29);
    return false;
  }

  private boolean _jspx_meth_bean_message_30(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_30 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_30.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_30.setBundle("report");
    _jspx_th_bean_message_30.setKey("report.parameters.label.tooltip.date");
    int _jspx_eval_bean_message_30 = _jspx_th_bean_message_30.doStartTag();
    if (_jspx_th_bean_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_30);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_30);
    return false;
  }

  private boolean _jspx_meth_bean_message_35(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_35 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_35.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_35.setBundle("report");
    _jspx_th_bean_message_35.setKey("report.parameters.operators.numberOrDate.equal");
    int _jspx_eval_bean_message_35 = _jspx_th_bean_message_35.doStartTag();
    if (_jspx_th_bean_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_35);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_35);
    return false;
  }

  private boolean _jspx_meth_bean_message_36(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_36 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_36.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_36.setBundle("report");
    _jspx_th_bean_message_36.setKey("report.parameters.operators.numberOrDate.greater");
    int _jspx_eval_bean_message_36 = _jspx_th_bean_message_36.doStartTag();
    if (_jspx_th_bean_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_36);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_36);
    return false;
  }

  private boolean _jspx_meth_bean_message_37(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_37 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_37.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_37.setBundle("report");
    _jspx_th_bean_message_37.setKey("report.parameters.operators.numberOrDate.less");
    int _jspx_eval_bean_message_37 = _jspx_th_bean_message_37.doStartTag();
    if (_jspx_th_bean_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_37);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_37);
    return false;
  }

  private boolean _jspx_meth_bean_message_38(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_38 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_38.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_38.setBundle("report");
    _jspx_th_bean_message_38.setKey("report.parameters.operators.numberOrDate.greaterOrEqual");
    int _jspx_eval_bean_message_38 = _jspx_th_bean_message_38.doStartTag();
    if (_jspx_th_bean_message_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_38);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_38);
    return false;
  }

  private boolean _jspx_meth_bean_message_39(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_39 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_39.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_39.setBundle("report");
    _jspx_th_bean_message_39.setKey("report.parameters.operators.numberOrDate.lessOrEqual");
    int _jspx_eval_bean_message_39 = _jspx_th_bean_message_39.doStartTag();
    if (_jspx_th_bean_message_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_39);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_39);
    return false;
  }

  private boolean _jspx_meth_bean_message_40(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_40 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_40.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_40.setBundle("report");
    _jspx_th_bean_message_40.setKey("report.parameters.operators.numberOrDate.between");
    int _jspx_eval_bean_message_40 = _jspx_th_bean_message_40.doStartTag();
    if (_jspx_th_bean_message_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_40);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_40);
    return false;
  }

  private boolean _jspx_meth_bean_message_41(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_41 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_41.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_41.setBundle("report");
    _jspx_th_bean_message_41.setKey("report.parameters.label.tooltip.numeric");
    int _jspx_eval_bean_message_41 = _jspx_th_bean_message_41.doStartTag();
    if (_jspx_th_bean_message_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_41);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_41);
    return false;
  }

  private boolean _jspx_meth_bean_message_46(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_46 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_46.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_46.setBundle("report");
    _jspx_th_bean_message_46.setKey("report.parameters.operators.text.beginWith");
    int _jspx_eval_bean_message_46 = _jspx_th_bean_message_46.doStartTag();
    if (_jspx_th_bean_message_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_46);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_46);
    return false;
  }

  private boolean _jspx_meth_bean_message_47(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_47 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_47.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_47.setBundle("report");
    _jspx_th_bean_message_47.setKey("report.parameters.operators.text.endWith");
    int _jspx_eval_bean_message_47 = _jspx_th_bean_message_47.doStartTag();
    if (_jspx_th_bean_message_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_47);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_47);
    return false;
  }

  private boolean _jspx_meth_bean_message_48(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_48 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_48.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_48.setBundle("report");
    _jspx_th_bean_message_48.setKey("report.parameters.operators.text.contains");
    int _jspx_eval_bean_message_48 = _jspx_th_bean_message_48.doStartTag();
    if (_jspx_th_bean_message_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_48);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_48);
    return false;
  }

  private boolean _jspx_meth_bean_message_49(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_49 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_49.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_49.setBundle("report");
    _jspx_th_bean_message_49.setKey("report.parameters.operators.text.equal");
    int _jspx_eval_bean_message_49 = _jspx_th_bean_message_49.doStartTag();
    if (_jspx_th_bean_message_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_49);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_49);
    return false;
  }

  private boolean _jspx_meth_bean_message_50(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_50 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_50.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_50.setBundle("report");
    _jspx_th_bean_message_50.setKey("report.parameters.label.tooltip.string");
    int _jspx_eval_bean_message_50 = _jspx_th_bean_message_50.doStartTag();
    if (_jspx_th_bean_message_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_50);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_50);
    return false;
  }

  private boolean _jspx_meth_bean_message_54(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_54 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_54.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_54.setBundle("report");
    _jspx_th_bean_message_54.setKey("report.parameters.operators.numberOrDate.equal");
    int _jspx_eval_bean_message_54 = _jspx_th_bean_message_54.doStartTag();
    if (_jspx_th_bean_message_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_54);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_54);
    return false;
  }

  private boolean _jspx_meth_bean_message_55(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_55 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_55.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_55.setBundle("report");
    _jspx_th_bean_message_55.setKey("report.parameters.label.tooltip.nomenclator");
    int _jspx_eval_bean_message_55 = _jspx_th_bean_message_55.doStartTag();
    if (_jspx_th_bean_message_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_55);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_55);
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
    _jspx_th_bean_message_58.setBundle("report");
    _jspx_th_bean_message_58.setKey("report.parameters.operators.numberOrDate.equal");
    int _jspx_eval_bean_message_58 = _jspx_th_bean_message_58.doStartTag();
    if (_jspx_th_bean_message_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_58);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_58);
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
    _jspx_th_bean_message_59.setBundle("report");
    _jspx_th_bean_message_59.setKey("report.parameters.label.order");
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
    _jspx_th_bean_message_60.setBundle("report");
    _jspx_th_bean_message_60.setKey("report.parameters.operators.numberOrDate.equal");
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
    _jspx_th_bean_message_61.setBundle("report");
    _jspx_th_bean_message_61.setKey("report.parameters.operators.text.Asc");
    int _jspx_eval_bean_message_61 = _jspx_th_bean_message_61.doStartTag();
    if (_jspx_th_bean_message_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_61);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_61);
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
    _jspx_th_bean_message_62.setBundle("report");
    _jspx_th_bean_message_62.setKey("report.parameters.operators.text.Desc");
    int _jspx_eval_bean_message_62 = _jspx_th_bean_message_62.doStartTag();
    if (_jspx_th_bean_message_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_62);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_62);
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
        out.write("            ");
        if (_jspx_meth_bean_message_63(_jspx_th_html_submit_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
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

  private boolean _jspx_meth_bean_message_63(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_63 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_63.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_0);
    _jspx_th_bean_message_63.setBundle("report");
    _jspx_th_bean_message_63.setKey("report.button.report");
    int _jspx_eval_bean_message_63 = _jspx_th_bean_message_63.doStartTag();
    if (_jspx_th_bean_message_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_63);
      return true;
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_63);
    return false;
  }

  private boolean _jspx_meth_html_hidden_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_2.setProperty("method");
    _jspx_th_html_hidden_2.setValue("execReport");
    int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
    if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_2);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_2);
    return false;
  }
}
