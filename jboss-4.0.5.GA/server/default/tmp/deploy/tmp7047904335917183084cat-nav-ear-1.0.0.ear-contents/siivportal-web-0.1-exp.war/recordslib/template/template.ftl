<#-- ----------------------------------------------------------------------- -->
<#--                                                                         -->
<#-- template.ftl                                                            -->
<#--                                                                         -->
<#-- Copyright (c) 2005 UTI Systems. All Rights Reserved.                    -->
<#--                                                                         -->
<#-- This source file may not be copied, modified or redistributed,          -->
<#-- in whole or in part, in any form or for any reason, without the express -->
<#-- written consent of UTI Systems.                                         -->
<#--                                                                         -->
<#-- ----------------------------------------------------------------------- -->

<#-- ----------------------------------------------------------------------- -->
<#--                                                                         -->
<#-- ----------------------------------------------------------------------- -->

<#if ctxBean.stylesPrefix?has_content>
    <#assign stylesPrefix="${ctxBean.stylesPrefix}">
<#else>
    <#assign stylesPrefix="">
</#if>

<#if ctxBean.imagesPath?has_content>
    <#assign imagesPath="${ctxBean.imagesPath}">
<#else>
    <#assign imagesPath="recordslib/image">
</#if>

<#-- ----------------------------------------------------------------------- -->
<#--                                                                         -->
<#-- ----------------------------------------------------------------------- -->

<#macro renderImageButton enabled, imageFile, imageFileDisabled, tooltipKey, onclick>
    <img class="${stylesPrefix}records-image-button<#if !enabled>-disabled</#if>"
            src="${imagesPath}/<#if enabled>${imageFile}<#else>${imageFileDisabled}</#if>"
            alt="${getMessage(tooltipKey)}"
            <#if enabled>onclick="${onclick}"</#if>/>
</#macro>

<#-- ----------------------------------------------------------------------- -->
<#--                                                                         -->
<#-- ----------------------------------------------------------------------- -->

<script type="text/javascript">
    <#assign jsvar = "${ctxBean.id}_records">
    var ${jsvar} = new ${ctxBean.jsClassName}("${ctxBean.id}", "${stylesPrefix}");

	function onEditClickDetail(index) {
		if (${jsvar}.isEditMode()) {
			${jsvar}.onSave("${jsvar}.onEdit(" + index + ")");
			__invocationArray.temporaryHandlers.length = 0;
		}
		else {						
			${jsvar}.onEdit(index);
		}
	}

	function checkForEnterOrEsc(evt) {
		var evt = (evt) ? evt : event;
		var charCode = (evt.which) ? evt.which : evt.keyCode;
		if (charCode == 13) {
			${jsvar}.onSave();
			__invocationArray.temporaryHandlers.length = 0;
			return false;
		}
		
		if (charCode == 27) {
			${jsvar}.onCancel();
			__invocationArray.temporaryHandlers.length = 0;
			return false;
		}

		return true;
	}

	function keyPressed(e) {
		var evt = e ? e : event;

		if (!checkForEnterOrEsc(evt)) {
			return false;
		}

		var charCode = (evt.which) ? evt.which : evt.keyCode;
		if (charCode == 38 && ${jsvar}.currentRecordIdx > 0 && ${jsvar}.isEditMode()) {
			onEditClickDetail(${jsvar}.currentRecordIdx - 1);
			return false;
		}

		if (charCode == 40 && 
			(${jsvar}.currentRecordIdx + 1) < ${jsvar}.recordsList.length && 
			${jsvar}.isEditMode()) {
			onEditClickDetail(${jsvar}.currentRecordIdx + 1);
			return false;
		}
		return true;
	}
</script>

<#-- ----------------------------------------------------------------------- -->
<#--                                                                         -->
<#-- ----------------------------------------------------------------------- -->
<#--
<div class="${stylesPrefix}non-edit-mode-div" id="${const.EDITMODE_BUTTONS_ELM_ID_PREFIX}${ctxBean.id}">
	<@renderImageButton true, "btn_save.gif",
			"", "records.tooltip.button.save", "${jsvar}.onSave()"/>
	<span id="${const.DELETE_BUTTON_PARENT_ELM_ID}">
	<#if ctxBean.showDelBtn>
		<@renderImageButton true, "btn_delete.gif",
				"", "records.tooltip.button.delete", "${jsvar}.onDelete()"/>
	</#if>
	</span>
	<@renderImageButton true, "btn_cancel.gif",	"", "records.tooltip.button.cancel", "${jsvar}.onCancel()"/>
</div>
-->
<#-- ----------------------------------------------------------------------- -->
<#--                                                                         -->
<#-- ----------------------------------------------------------------------- -->

<input type="hidden" id="${ctxBean.id}${const.PARAM_RECORDS_PER_PAGE}"
        name="${ctxBean.id}${const.PARAM_RECORDS_PER_PAGE}" value="${ctxBean.viewBean.recordsPerPage}"/>
<input type="hidden" id="${ctxBean.id}${const.PARAM_CURRENT_PAGE_IDX}"
        name="${ctxBean.id}${const.PARAM_CURRENT_PAGE_IDX}" value="${ctxBean.viewBean.currentPageIdx}"/>
<input type="hidden" id="${ctxBean.id}${const.PARAM_SORT_KEY}"
        name="${ctxBean.id}${const.PARAM_SORT_KEY}" value="${ctxBean.viewBean.sortKey?if_exists}"/>
<input type="hidden" id="${ctxBean.id}${const.PARAM_SORT_TYPE}"
        name="${ctxBean.id}${const.PARAM_SORT_TYPE}" value="${ctxBean.viewBean.sortType?string}"/>
<input type="hidden" id="${ctxBean.id}${const.PARAM_FILTER_FORM_VISIBILITY}"
        name="${ctxBean.id}${const.PARAM_FILTER_FORM_VISIBILITY}" value="${ctxBean.viewBean.filterFormVisibility?string}"/>

<#-- ----------------------------------------------------------------------- -->
<#--                                                                         -->
<#-- ----------------------------------------------------------------------- -->

<table class="${stylesPrefix}records-table" cellspacing="0" cellpadding="0"
        <#if ctxBean.tableAttr.width?has_content>width="${ctxBean.tableAttr.width}"</#if>
        <#if ctxBean.tableAttr.align?has_content>align="${ctxBean.tableAttr.align}"</#if>>

<#-- NAVIGATION ROW -->
<tr>
    <td nowrap="true">
        <table width="100%" class="${stylesPrefix}records-navigation-table" cellspacing="0" cellpadding="0">
            <tr valign="bottom">
                <#-- selection buttons -->
                <td id="${const.SELECTION_BUTTONS_ELM_ID_PREFIX}${ctxBean.id}" width="1%" align="left" nowrap="true">
                    <#if !ctxBean.printMode && (ctxBean.viewBean.recordsCount > 0)>
                    <@renderImageButton true,  "btn_select_all.gif",
                            "", "records.tooltip.button.select_all",
                            "${jsvar}.onSelectAll()"/>
                    <@renderImageButton true,  "btn_toggle_sel.gif",
                            "", "records.tooltip.button.toggle_selection",
                            "${jsvar}.onToggleSelection()"/>
                    &nbsp;
                    </#if>
                </td>
                <#-- end selection buttons -->

                <#-- information message -->
                <td align="left" nowrap="true">
                    <#if (ctxBean.viewBean.recordsCount > 0)>${getMessage("records.prompt.details", ctxBean.viewBean.firstRecordIdx + 1, ctxBean.viewBean.lastRecordIdx + 1, ctxBean.viewBean.recordsCount)}<#else>${getMessage("records.prompt.empty_list")}</#if>
                </td>
                <#-- end information message -->

                <#-- navigation buttons + commands -->
                <td id="${const.NAVIGATION_BUTTONS_ELM_ID_PREFIX}${ctxBean.id}" align="right" nowrap="true">
                    &nbsp;
                    <#if (ctxBean.viewBean.pagesCount > 1)>
                        <@renderImageButton (ctxBean.viewBean.currentPageIdx > 0),
                                "btn_nav_first.png", "btn_nav_first_disabled.png",
                                "records.tooltip.navigation.first",
                                "${jsvar}.onChangeCurrentPage(0)"/>

                        <@renderImageButton (ctxBean.viewBean.currentPageIdx > 0),
                                "btn_nav_prev.png", "btn_nav_prev_disabled.png",
                                "records.tooltip.navigation.prev",
                                "${jsvar}.onChangeCurrentPage(${ctxBean.viewBean.currentPageIdx - 1})"/>

                        <#list pages as page>
                            <#if (ctxBean.viewBean.currentPageIdx != page)>
                                <a class="${stylesPrefix}records-page" href="javascript:${jsvar}.onChangeCurrentPage(${page})">${page + 1}</a>
                            <#else>
                                <span class="${stylesPrefix}records-current-page">${page + 1}</span>
                            </#if>
                        </#list>

                        <@renderImageButton (ctxBean.viewBean.currentPageIdx < ctxBean.viewBean.pagesCount - 1),
                                "btn_nav_next.png", "btn_nav_next_disabled.png",
                                "records.tooltip.navigation.next",
                                "${jsvar}.onChangeCurrentPage(${ctxBean.viewBean.currentPageIdx + 1})"/>

                        <@renderImageButton (ctxBean.viewBean.currentPageIdx < ctxBean.viewBean.pagesCount - 1),
                                "btn_nav_last.png", "btn_nav_last_disabled.png",
                                "records.tooltip.navigation.last",
                                "${jsvar}.onChangeCurrentPage(${ctxBean.viewBean.pagesCount - 1})"/>
                    </#if>

                    <#if (ctxBean.filterCellsList?has_content)>
                        <@renderImageButton true, "btn_toggle_filter_visibility.gif",
                                "", "records.tooltip.button.toggle_filter_visibility",
                                "${jsvar}.onToggleFilterFormVisibility()"/>
                    </#if>

                    <@renderImageButton true, "btn_refresh.gif",
                            "", "records.tooltip.button.refresh", "${jsvar}.onRefresh()"/>

                    <#if (ctxBean.viewBean.recordsCount > 0) && ctxBean.rppList?has_content>
                        <select class="${stylesPrefix}records-records-per-page" onchange="${jsvar}.onChangeRecordsPerPage(this.options[this.options.selectedIndex].value)">
                            <#list ctxBean.rppList as item>
                                <option value="${item}" <#if item==ctxBean.viewBean.recordsPerPage>selected</#if>><#if item <= 0>${getMessage("records.rpp.prompt.all")}<#else>${item}</#if></option>
                            </#list>
                        </select>
                    </#if>

                    <#if (ctxBean.viewBean.recordsCount > 0) && (ctxBean.formCellsList?has_content) && ctxBean.showDelBtn>
                    <@renderImageButton true, "btn_delete_sel.gif",
                            "", "records.tooltip.button.delete_selected",
                            "${jsvar}.onDeleteSelected()"/>
                    </#if>

                    <#if (ctxBean.formCellsList?has_content) && ctxBean.showAddBtn>
                        <@renderImageButton true, "btn_add.gif", "",
                                "records.tooltip.button.add", "${jsvar}.onAdd()"/>
                    </#if>
                </td>
                <#-- end navigation buttons + commands -->

                <#-- edit mode buttons -->
	
                <td class="${stylesPrefix}records-hidden" id="${const.EDITMODE_BUTTONS_ELM_ID_PREFIX}${ctxBean.id}" align="right" nowrap="true">
                    <@renderImageButton true, "btn_save.gif",
                            "", "records.tooltip.button.save", "${jsvar}.onSave()"/>
                    <span id="${const.DELETE_BUTTON_PARENT_ELM_ID}">
                    <#if ctxBean.showDelBtn>
                        <@renderImageButton true, "btn_delete.gif",
                                "", "records.tooltip.button.delete", "${jsvar}.onDelete()"/>
                    </#if>
                    </span>
                    <@renderImageButton true, "btn_cancel.gif",
                            "", "records.tooltip.button.cancel", "${jsvar}.onCancel()"/>
                </td>
	
				<#--<td></td> -->
                <#-- end edit mode buttons -->
            </tr>
        </table>
    </td>
</tr>
<#-- END NAVIGATION ROW -->

<#-- separator row -->
<tr><td><img src="${imagesPath}/pixel.gif" height="5" border="0"/></td></tr>
<#-- end separator row -->

<#-- CONTENT ROW -->
<tr>
    <td>
        <table class="${stylesPrefix}records-list-table" width="100%" cellspacing="2" cellpadding="0">

            <#-- filter row -->
            <#if (ctxBean.filterCellsList?has_content)>
            <tr id="${const.FILTER_ELEMENTS_ELM_ID_PREFIX}${ctxBean.id}" class="<#if ctxBean.viewBean.filterFormVisibility>${stylesPrefix}records-filter-row<#else>${stylesPrefix}records-hidden</#if>">
                <td class="${stylesPrefix}records-filter-row-idx-cell">&nbsp;</td>
                <#list ctxBean.filterCellsList as cell>
                <td align="<#if cell.align?has_content>${cell.align}<#else>center</#if>"
                        valign="<#if cell.valign?has_content>${cell.valign}<#else>middle</#if>"
                        <#if cell.colspan?has_content>colspan="${cell.colspan}"</#if>
                        <#if cell.nowrap?has_content>nowrap="${cell.nowrap}"</#if>>
                    ${cell.content}
                </td>
                </#list>
                <td align="right" valign="middle">
                    <@renderImageButton true, "btn_filter.gif",
                            "", "records.tooltip.button.filter", "${jsvar}.onFilter()"/>
                </td>
            </tr>
            </#if>
            <#-- end filter row -->

            <#-- form row -->
            <#if (ctxBean.formCellsList?has_content)>
            <tr id="${const.FORM_ELEMENTS_ELM_ID_PREFIX}${ctxBean.id}" class="${stylesPrefix}records-hidden">
                <td class="${stylesPrefix}records-form-row-idx-cell">&nbsp;</td>
                <#list ctxBean.formCellsList as cell>
                <td align="<#if cell.align?has_content>${cell.align}<#else>center</#if>"
                        valign="<#if cell.valign?has_content>${cell.valign}<#else>middle</#if>"
                        <#if cell_has_next>
                            <#if cell.colspan?has_content>colspan="${cell.colspan}"</#if>
                        <#else>
                            colspan="<#if cell.colspan?has_content>${1 + cell.colspan?number}<#else>2</#if>"
                        </#if>
                        <#if cell.nowrap?has_content>nowrap="${cell.nowrap}"</#if>
						onKeyDown="keyPressed(event);"
						>
                    ${cell.content}
                </td>
                </#list>				
            </tr>
            </#if>
            <#-- end form row -->

            <#-- header row -->
            <tr valign="middle">
                <th class="${stylesPrefix}records-header-idx-cell<#if ctxBean.printMode>-printmode</#if>" width="45">${getMessage("records.prompt.idx")}</th>
                <#list ctxBean.propertiesList as property>
                    <#if property.label?has_content>
                        <#assign className="">
                        <#if property.sortKey?has_content>
                            <#assign className="sortable">

                            <#if ctxBean.viewBean.sortKey?has_content>
                                <#if (property.sortKey == ctxBean.viewBean.sortKey)>
                                    <#if ctxBean.viewBean.sortType>
                                        <#assign className="sorted-ascending">
                                    <#else>
                                        <#assign className="sorted-descending">
                                    </#if>
                                </#if>
                            </#if>
                        </#if>

                <th class="${stylesPrefix}${className}" nowrap="true"
                        <#if property.cellAttr.width?has_content>width="${property.cellAttr.width}"</#if>
                        align="<#if property.alignTH?has_content>${property.alignTH}<#else>center</#if>"
                        <#if property.sortKey?has_content>onclick="if (!${jsvar}.isEditMode()) {${jsvar}.onChangeSortCriteria('${property.sortKey}')};"</#if>
                        <#if !property_has_next>colspan="2"</#if>>
                    ${property.label}<#if property.mandatory><span class="${stylesPrefix}mandatory_property">${getMessage("records.mandatory.sign")}</span></#if>
                </th>
                    </#if>
                </#list>
            </tr>
            <#-- end header row -->

            <#-- record rows -->
            <#list ctxBean.recordsList as record>
            <tr id="${const.RECORD_PROPERTIES_ELM_ID_PREFIX}${ctxBean.id}${record_index}" class="${stylesPrefix}records-row-<#if (record_index % 2) == 0>even<#else>odd</#if>" valign="middle">
                <td id="${const.RECORD_IDX_ELM_ID_PREFIX}${ctxBean.id}${record_index}" class="${stylesPrefix}records-row-idx-cell<#if ctxBean.printMode>-printmode</#if>"<#if !ctxBean.printMode> onclick="if (!${jsvar}.isEditMode()) {${jsvar}.toggleRecordSelection(${record_index})}"</#if>>
                    <input type="checkbox" name="${ctxBean.id}${const.PARAM_RECORD_ID}" id="${const.RECORD_ID_ELM_ID_PREFIX}${ctxBean.id}${record_index}" style="display:none" value=""/>
                    ${ctxBean.viewBean.firstRecordIdx + record_index + 1}
                </td>
                <#list ctxBean.propertiesList as property>
                    <#if property.label?has_content>
                        <td class="${stylesPrefix}record-property-cell" align="<#if property.alignTD?has_content>${property.alignTD}<#else>center</#if>"
                            valign="<#if property.cellAttr.valign?has_content>${property.cellAttr.valign}<#else>middle</#if>"
                                <#if property.cellAttr.nowrap?has_content>nowrap="${property.cellAttr.nowrap}"</#if>
                                <#if (ctxBean.formCellsList?has_content)>onclick="onEditClickDetail(${record_index});"</#if>
                                <#if !property_has_next>colspan="2"</#if>>
                            <#if property.escape>${property.valuesList[record_index]?html}<#else>${property.valuesList[record_index]}</#if>
                        </td>
                    </#if>
                </#list>
            </tr>
            <script type="text/javascript">
                var bean = ${jsvar}.createRecordBeanInstance();

                <#list ctxBean.propertiesList as property>
                bean.${property.name} = "${property.valuesList[record_index]?js_string}";
                </#list>

                ${jsvar}.addRecordBean(bean);
                document.getElementById("${const.RECORD_ID_ELM_ID_PREFIX}${ctxBean.id}${record_index}").value = bean.getRecordID();
            </script>
            </#list>
            <#-- end record rows -->
        </table>
    </td>
</tr>
<#-- END CONTENT ROW -->

</table>
