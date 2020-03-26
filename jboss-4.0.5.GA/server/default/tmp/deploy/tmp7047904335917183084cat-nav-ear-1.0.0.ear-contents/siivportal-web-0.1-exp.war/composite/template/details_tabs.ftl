<#-- ----------------------------------------------------------------------- -->
<#--                                                                         -->
<#-- details_tabs.ftl                                                        -->
<#--                                                                         -->
<#-- Copyright (c) 2005 UTI Systems. All Rights Reserved.                    -->
<#--                                                                         -->
<#-- This source file may not be copied, modified or redistributed,          -->
<#-- in whole or in part, in any form or for any reason, without the express -->
<#-- written consent of UTI Systems.                                         -->
<#--                                                                         -->
<#-- ----------------------------------------------------------------------- -->

<#-- main table -->
<table width="100%" cellspacing="0" cellpadding="0">

  <#-- first row -->
  <tr>

    <#-- tabs cell -->
    <td valign="bottom" class="composite-tabs-cell">
      <table cellspacing="0" cellpadding="0">
        <tr id="tabs_row"></tr>
      </table>
    </td>
    <#-- end tabs cell -->

    <#-- buttons cell -->
    <td width="100%" align="right" class="composite-tabs-buttons-cell">
      <table cellspacing="3" cellpadding="0">
        <tr valign="middle">
          <td>
            <#if changeRenderModeEnabled>
                <img src="composite/image/btn_render_mode_list.gif" class="composite-image-button"
                    alt="${getMessage("${const.COMPOSITE_MESSAGES_BUNDLE}", "composite.tooltip.detail.render.list")}" 
                        onclick="compositeChangeDetailsRenderMode(${const.DETAILS_RENDER_MODE_LIST}, false);"/>
            <#else>
                &nbsp;
            </#if>
          </td>
          <td>
            <img src="composite/image/btn_toggle_component_visibility.gif" class="composite-image-button"
                alt="${getMessage("${const.COMPOSITE_MESSAGES_BUNDLE}", "composite.tooltip.component.toggle_visibility")}" 
                    onclick="compositeChangeComponentVisibility(${presConst.DETAILS_JSVAR_NAME}.getCurrentDetailID());"/>
          </td>
        </tr>
      </table>
    </td>
    <#-- end buttons cell -->

  </tr>
  <#-- end first row -->

  <#-- separator row-->
  <tr>
    <td colspan="2" class="composite-tabs-separator-row-cell"><img src="composite/image/pixel.gif"/></td>
  </tr>
  <#-- end separator row -->

  <#-- current detail row -->
  <tr>
    <#-- this ID will be updated whenever current detail is changed -->
    <td colspan="2" class="composite-tabs-detail-content-cell" id="${presConst.COMPONENT_ELEMENT_ID_PREFIX}${currentDetailID}">
        ${getComponentPage(currentDetailID)}
    </td>
  </tr>
  <#-- end current detail row -->

</table>
<#-- end main table -->

<script type="text/javascript">
    <#assign detailsList = []>
    <#list detailIDs as id>
        <#assign labelKey>${compositeEntityID}.detail.${id}.label</#assign>
        <#assign detailBeanCode>new CompositeDetailBean('${id}', '${getMessage(compositeEntityBundle, labelKey)}')</#assign>
        <#assign detailsList = detailsList + ["${detailBeanCode}"]>
    </#list>
    ${presConst.DETAILS_JSVAR_NAME} = new ${jsClassName}([<#list detailsList as item>${item}<#if item_has_next>,</#if></#list>], "${currentDetailID}");
</script>

