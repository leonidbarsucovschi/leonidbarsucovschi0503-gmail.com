<#-- ----------------------------------------------------------------------- -->
<#--                                                                         -->
<#-- compsoite_form.ftl                                                      -->
<#--                                                                         -->
<#-- Copyright (c) 2005 UTI Systems. All Rights Reserved.                    -->
<#--                                                                         -->
<#-- This source file may not be copied, modified or redistributed,          -->
<#-- in whole or in part, in any form or for any reason, without the express -->
<#-- written consent of UTI Systems.                                         -->
<#--                                                                         -->
<#-- ----------------------------------------------------------------------- -->

<#compress>
<script type="text/javascript">
    var formElm = document.getElementById("${tagInstance.formId}");

    if (formElm == null) {
        throw "Form with ID = '${tagInstance.formId}' is missing";
    }

    var elements = formElm.elements;
    var tokenElm = null;

    for (var i = 0; (tokenElm == null) && (i < elements.length); i++) {
        if (elements[i].name == "${strutsHtmlConst.TOKEN_KEY}") {
            tokenElm = elements[i];
        }
    }

    if (tokenElm == null) {
        try {
            tokenElm = document.createElement(
                    "<input name='${strutsHtmlConst.TOKEN_KEY}'/>");
        } catch (e) { }

        if (!tokenElm || !tokenElm.name) { // Not in IE, then
            tokenElm = document.createElement("INPUT");
            tokenElm.name = "${strutsHtmlConst.TOKEN_KEY}";
        }

        tokenElm.type = "hidden";
        formElm.appendChild(tokenElm);
    }

    tokenElm.value = "${tokenValue}";
</script>
</#compress>