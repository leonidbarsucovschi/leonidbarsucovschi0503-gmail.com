<%--
 *
 * composite_multiple_records_js.jsp
 *
 * Copyright (c) 2005 UTI Systems. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of UTI Systems.
 *
--%>

<%@ page language="java" %>
<%@ page contentType="text/javascript; charset=iso-8859-2" %>

<%-- imports --%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositeConstants"%>

<%-- taglibs --%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
CompositeMultipleRecords.prototype = new __Records();
CompositeMultipleRecords.prototype.constructor = CompositeMultipleRecords;

function CompositeMultipleRecords(compID, entityId, prefix) {
    this.Records(entityId, prefix);
    this.componentID = compID;
}

<%------------------------------------------------------------------------------
    The mirror class of "CompositeMultipleRecords". See "records_js.jsp" for
    more details about mirror classes.
------------------------------------------------------------------------------%>
function __CompositeMultipleRecords() {}
__CompositeMultipleRecords.prototype = CompositeMultipleRecords.prototype;
__CompositeMultipleRecords.prototype.CompositeMultipleRecords = CompositeMultipleRecords;

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
CompositeMultipleRecords.prototype.executeOperation = function(operation,
            fastRequest, callbackFunction, submit) {
    var form = compositeGetHTMLForm(fastRequest);

    if (form == null) {
        return;
    }

    form.<%=CompositeConstants.PARAM_ENTITY_ID%>.value = this.getID();

    compositeExecuteComponentOperation(this.componentID,
            operation, fastRequest,
            callbackFunction, submit);
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
CompositeMultipleRecords.prototype.navigationChanged = function() {
    this.executeOperation("changeNavigation", false, null);
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
CompositeMultipleRecords.prototype.onFilter = function() {
    this.executeOperation("filter", false, null);
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
CompositeMultipleRecords.prototype.onRefresh = function() {
    this.executeOperation("refresh", false, null);
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
CompositeMultipleRecords.prototype.onSave = function(callback, submit) {
    if (this.validateForm()) {
        if (this.prepareForSubmit()) {
            this.executeOperation("save", false, callback, submit);
			return true;
        }
    }
	return false;
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
CompositeMultipleRecords.prototype.validateForm = function() {
    return compositeValidateComponentFormData(this.componentID,
            "<%=CompositeConstants.COMPONENT_SAVE_OPERATION%>_" + this.getID());
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
CompositeMultipleRecords.prototype.prepareForSubmit = function() {
    return true;
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
CompositeMultipleRecords.prototype.onDelete = function() {
    if (confirm("<bean:message key="composite.confirm.multiplerecords.delete" bundle="<%=CompositeConstants.COMPOSITE_MESSAGES_BUNDLE%>"/>")) {
        this.executeOperation("delete", false, null);
    }
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
CompositeMultipleRecords.prototype.onDeleteSelected = function() {
    if (this.getSelectedCount() == 0) {
        alert("<bean:message key="composite.alert.multiplerecords.noselection" bundle="<%=CompositeConstants.COMPOSITE_MESSAGES_BUNDLE%>"/>");
        return;
    }

    if (confirm("<bean:message key="composite.confirm.multiplerecords.delete_multiple" bundle="<%=CompositeConstants.COMPOSITE_MESSAGES_BUNDLE%>"/>")) {
        this.executeOperation("deleteMultiple", false, null);
    }
}
