<#-- ----------------------------------------------------------------------- -->
<#--                                                                         -->
<#-- details_list.ftl                                                        -->
<#--                                                                         -->
<#-- Copyright (c) 2005 UTI Systems. All Rights Reserved.                    -->
<#--                                                                         -->
<#-- This source file may not be copied, modified or redistributed,          -->
<#-- in whole or in part, in any form or for any reason, without the express -->
<#-- written consent of UTI Systems.                                         -->
<#--                                                                         -->
<#-- ----------------------------------------------------------------------- -->

<#-- main table -->
<table width="100%" class="composite-details-table" cellspacing="0" cellpadding="0">

    <#list detailIDs as id>
        <#assign labelKey>${compositeEntityID}.detail.${id}.label</#assign>

    <tr class="composite-detail-title-row">
        <td class="composite-detail-title-cell">
            <img src="composite/image/btn_toggle_component_visibility.gif" class="composite-image-button"
                alt="${getMessage("${const.COMPOSITE_MESSAGES_BUNDLE}", "composite.tooltip.component.toggle_visibility")}"
                        onclick="compositeChangeComponentVisibility('${id}');"/>
        </td>

        <#-- the style class is reseted by "compositeSetDetailErrorFlag" -->
        <td id="${presConst.COMPONENT_TITLE_ELEMENT_ID_PREFIX}${id}" width="100%" align="left" class="composite-detail-title-cell">
            ${getMessage(compositeEntityBundle, labelKey)}
        </td>

        <td align="right">
            <#if (id_index == 0) && changeRenderModeEnabled>
            <img src="composite/image/btn_render_mode_tabs.gif" class="composite-image-button"
                alt="${getMessage("${const.COMPOSITE_MESSAGES_BUNDLE}", "composite.tooltip.detail.render.tabs")}"
                    onclick="compositeChangeDetailsRenderMode(${const.DETAILS_RENDER_MODE_TABS}, false)"/>
            <#else>
                &nbsp;
            </#if>
        </td>
    </tr>

    <tr>
      <td><img src="composite/image/pixel.gif" width="2" height="2" border="0"/></td>
    </tr>

    <tr>
        <td class="composite-detail-content-cell" colspan="3" id="${presConst.COMPONENT_ELEMENT_ID_PREFIX}${id}">
            ${getComponentPage(id)}
        </td>
    </tr>
    </#list>

</table>
<%-- end main table --%>

<script type="text/javascript">
    <#assign detailsList = []>
    <#list detailIDs as id>
        <#assign labelKey>${compositeEntityID}.detail.${id}.label</#assign>
        <#assign detailBeanCode>new CompositeDetailBean('${id}', '${getMessage(compositeEntityBundle, labelKey)}')</#assign>
        <#assign detailsList = detailsList + ["${detailBeanCode}"]>
    </#list>
    ${presConst.DETAILS_JSVAR_NAME} = new ${jsClassName}([<#list detailsList as item>${item}<#if item_has_next>,</#if></#list>]);
</script>
