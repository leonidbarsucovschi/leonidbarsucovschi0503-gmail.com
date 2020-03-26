<%@ page import="java.util.*,
				 ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm" method="post" action="reports/report.do">
	<html:hidden property="method" value="list"/>
</form>
<script>
	function closeWindow()
	{
		document.closeForm.submit();
	}

	function MultiSelector(list_target, max)
	{
		this.list_target = list_target;
		this.count = 0;
		this.id = 0;
		if (max)
			this.max = max;
		else
			this.max = -1;

		this.addElement = function(element)
		{
			if (element.tagName == 'INPUT' && element.type == 'file')
			{
				element.name = 'uploadFiles[' + this.id++ + ']';

				element.multi_selector = this;

				element.onchange = function()
				{
					element_tab = this.value.split('\\');
					nbr_elements = element_tab.length;
					if (this.multi_selector.alreadyInList(element_tab[nbr_elements-1]))
					{
						alert("Raportul exista deja in lista.");
						return;
					}

					var new_element = document.createElement('input');
					new_element.type = 'file';

					this.parentNode.insertBefore(new_element, this);

					this.multi_selector.addElement(new_element);

					this.multi_selector.addListRow(this);

					this.style.position = 'absolute';
					this.style.left = '-1000px';
				};
				if (this.max != -1 && this.count >= this.max)
					element.disabled = true;

				this.count++;
				this.current_element = element;
			}
			else
				alert('Error: not a file input element');
		}

		this.addListRow = function(element)
		{
			var new_row = document.createElement('tr');
			var new_col_radio = document.createElement('td');
			var new_col_filename = document.createElement('td');
			var new_col_button = document.createElement('td');

			new_col_radio.setAttribute('align', 'left');
			new_col_filename.setAttribute('align', 'left');
			new_col_button.setAttribute('align', 'right');

			new_row.appendChild(new_col_radio);
			new_row.appendChild(new_col_filename);
			new_row.appendChild(new_col_button);

			new_row.element = element;

			element_tab = element.value.split('\\');
			nbr_elements = element_tab.length;

			try
			{
				new_row_radio = document.createElement('<input type="radio" name="selFile" value=\'' + element_tab[nbr_elements-1] + '\'/>');
			}
			catch(err)
			{
				new_row_radio = document.createElement('input');
				new_row_radio.type = 'radio';
				new_row_radio.name = 'selFile';
				new_row_radio.value = element_tab[nbr_elements-1];
			}

			var new_row_button = document.createElement('a');
			new_row_button.setAttribute('href', '#');
			new_row_button.appendChild(document.createTextNode('Scoate'));
			new_row_button.onclick = function()
			{
				this.parentNode.parentNode.parentNode.removeChild(this.parentNode.parentNode);
				this.parentNode.parentNode.element.parentNode.removeChild(this.parentNode.parentNode.element);
				this.parentNode.parentNode.element.multi_selector.count --;
				this.parentNode.parentNode.element.multi_selector.current_element.disabled = false;

				return false;
			};

			new_col_radio.appendChild(new_row_radio);
			new_col_filename.innerHTML = element_tab[nbr_elements-1];
			new_col_button.appendChild(new_row_button);

			this.list_target.appendChild(new_row);

		};


		this.checkRadios = function(element)
		{
			var found_it = false;

			if (document.form_ReportForm.selFile != null)
			{
				for (var i=0; i < document.form_ReportForm.selFile.length; i++)
				{
					if (document.form_ReportForm.selFile[i].checked)
						found_it = true;
				}
				if (!found_it && document.form_ReportForm.selFile.length > 1)
					alert("Va rugam sa selectati un raport principal.");
				else
					found_it = true;
			}
			else
				alert("Va rugam sa adaugati un raport (si eventual subrapoartele sale) pentru incarcare.");

			return found_it;
		}

		this.alreadyInList = function(value)
		{
			var found_it = false;

			if (document.form_ReportForm.selFile != null)
			{
				for (var i=0; i < document.form_ReportForm.selFile.length; i++)
				{
					if (document.form_ReportForm.selFile[i].value == value)
						found_it = true;
				}
				if (document.form_ReportForm.selFile.value == value)
					found_it = true;
			}
			return found_it;
		}
	};
</script>


<div class="table">
	<table width="100%" border="0" cellpadding="0" cellspacing="1">
		<tr>
			<td width="100%" valign="top" align="left" class="page-subtitle">
				<!-- Titlul ferestrei pentru modificare. -->
				<logic:empty name="<%=Constants.TBL_REPORT_KEY%>" property="values.primaryKey" scope="request">
				  <bean:message bundle="report" key="report.title.new"/>
				</logic:empty>
				<!-- Titlul ferestrei pentru adaugare. -->
				<logic:notEmpty name="<%=Constants.TBL_REPORT_KEY%>" property="values.primaryKey" scope="request">
				  <bean:message bundle="report" key="report.title.edit"/>
				</logic:notEmpty>
				<!-- END Sectiune de Titlu pagina. -->
			</td>
			<td class="bottom" align="right">
				<img border="0" style="cursor:pointer;" onClick="closeWindow();"
					 title='<bean:message bundle="report" key="report.label.closeWindow"/>' src="images/close_off.gif"
					 onMouseOver="this.src='images/close_on.gif'" onmouseout="this.src='images/close_off.gif'"/>
			</td>
		</tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="1">
		<logic:messagesPresent>
			<tr>
				<td valign="top" colspan="2" align="center" class="msg_error">
					<html:messages id="error" bundle="report">
						<bean:write name="error"/><br>
					</html:messages>
				</td>
			</tr>
		</logic:messagesPresent>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="1" class="report">
		<!-- START Sectiune de FORM. -->
		<html:form action="/report.do" enctype="multipart/form-data" onsubmit="return multi_selector.checkRadios()">
			<html:hidden property="values.report_id"/>
			<html:hidden property="values.report_file"/>
			<html:hidden property="step" value="0"/>
			<!-- Cimpul 'nume fisier' field. -->
			<tr>
				<td valign="top" class="label" align="right" width="50%">
					<bean:message bundle="report" key="report.prompt.uploadFile"/>:
				</td>
				<td align="left">
					<input id="our_file_element" type="file" name="file_1" >
				</td>
			</tr>
			<tr>
				<td colspan="2">&nbsp</td>
			</tr>
			<tr>
				<td colspan="2" class="button-row" align="center">
					<table border="0" cellpadding="0" cellspacing="1">
						<tbody id="files_list">
						<tr>
							<th>&nbsp<bean:message bundle="report" key="report.prompt.main_report"/>&nbsp</th>
							<th width="250"><bean:message bundle="report" key="report.prompt.file_name"/></th>
							<th width="50">&nbsp</th>
						</tr>
						</tbody>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>
			<!-- Buton incarcare. -->
			<tr>
				<td colspan="2" class="button-row" align="center">
					<html:submit styleClass="btn-generic">
						<bean:message bundle="report" key="report.button.upload"/>
					</html:submit>
					<html:hidden property="method" value="upload"/>
				</td>
			</tr>
		</html:form>
		<!-- END Sectiune de FORM. -->
	</table>
</div>
<script>
	var multi_selector = new MultiSelector( document.getElementById( 'files_list' ), 9 );
	multi_selector.addElement( document.getElementById( 'our_file_element' ) );
</script>

