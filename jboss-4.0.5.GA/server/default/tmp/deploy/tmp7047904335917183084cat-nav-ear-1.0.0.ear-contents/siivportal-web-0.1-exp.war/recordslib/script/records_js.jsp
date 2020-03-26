<%--
 *
 * records_js.jsp
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

<%@ page import="ro.uti.jpf.taglib.records.RecordsConst" %>
<%@ page import="ro.uti.jpf.base.composite.util.CompositePresentationConst" %>

<%------------------------------------------------------------------------------
    The bean that stores the properties for a record. It has only one method,
    named "getRecordID", which must be implemented by all
    derived beans.
------------------------------------------------------------------------------%>
function RecordBean() {
}

RecordBean.prototype.getRecordID = function() {
    alert("recordbean:getRecordID");
}

<%------------------------------------------------------------------------------
    Constructs a new "Records" instance.

    @id               the ID that unique identifies the list of records
    @prefix           the prefix to be used for the name of all
                      CSS classes
------------------------------------------------------------------------------%>
function Records(id, prefix) {
    /* the ID that unique identifies the list of records */
    this.theID = id;

    /* the prefix to be used for all CSS classes */
    this.stylesPrefix = prefix;

    /* the list with records; each element is a RecordBean "instance" */
    this.recordsList = new Array();

    /* the index of the record that is edited; if -1 a new record is added */
    this.currentRecordIdx = null;

    /* Specifies if form should be displayed at top or at bottom (default)
    when a new record is edited. Since v2.0.2. */
    this.showAddFormAtTop = true;
}

<%------------------------------------------------------------------------------
    A mirror class of "Records" class.

    This is a completely copy of the "Records" class (by using the same
    prototype), but it has an empty constructor and an additional method, named
    "Records", which is a reference to the constructor of "Records"
    class.

    To extend the "Records" class in a real OOP manner, use the following
    javascript code:

    MyNewClass.prototype = new __Records();
    MyNewClass.prototype.constructor = MyNewClass;

    function MyNewClass(id, prefix, extra parameters) {
        this.Records(id, prefix);
    }
------------------------------------------------------------------------------%>
function __Records() {}
__Records.prototype = Records.prototype;
__Records.prototype.Records = Records;

<%------------------------------------------------------------------------------
    Getter for the ID that unique identifies the list of records.
------------------------------------------------------------------------------%>
Records.prototype.getID = function() {
    return this.theID;
}

<%------------------------------------------------------------------------------
    Getter for the index of the record that is edited.

    Returns -1 if a new record is added, NULL if no record is added/edited or
    the index of the record that is edited.
------------------------------------------------------------------------------%>
Records.prototype.getCurrentRecordIdx = function() {
    return this.currentRecordIdx;
}

<%------------------------------------------------------------------------------
    Returns TRUE if a record is added/edited, FALSE otherwise. The index of
    the record can be retrieved using "getCurrentRecordIdx" function.
------------------------------------------------------------------------------%>
Records.prototype.isEditMode = function() {
    return this.currentRecordIdx != null;
}

<%------------------------------------------------------------------------------
    Getter for the final name of a CSS class.

    @name             the  CSS class for which to return the final name

    Returns the specified name, prefixed with the value
    of "stylesPrefix" property.
------------------------------------------------------------------------------%>
Records.prototype.getStyleClass = function(name) {
    return this.stylesPrefix + name;
}

<%------------------------------------------------------------------------------
    Creates a new "RecordBean" instance.
------------------------------------------------------------------------------%>
Records.prototype.createRecordBeanInstance = function() {
    alert("records:crateRecordBeanInstance");
}

<%------------------------------------------------------------------------------
    Adds a new record to the end of the records list.

    @record           the bean with the values for all record's properties
------------------------------------------------------------------------------%>
Records.prototype.addRecordBean = function(record) {
    this.recordsList.push(record);
}

<%------------------------------------------------------------------------------
    Getter for the bean that stores the properties for a record.

    @recordIdx        the index of the record
------------------------------------------------------------------------------%>

Records.prototype.getRecordBean = function(recordIdx) {
    return this.recordsList[recordIdx];
}

<%------------------------------------------------------------------------------
    Since v2.0.2.
------------------------------------------------------------------------------%>
Records.prototype.getRecordIdxCellElm = function(recordIdx) {
    return document.getElementById("<%=RecordsConst.RECORD_IDX_ELM_ID_PREFIX%>"
            + this.theID + recordIdx);
}

<%------------------------------------------------------------------------------
    Since v2.0.2.
------------------------------------------------------------------------------%>
Records.prototype.getRecordCheckboxElm = function(recordIdx) {
    return document.getElementById("<%=RecordsConst.RECORD_ID_ELM_ID_PREFIX%>"
            + this.theID + recordIdx);
}

<%------------------------------------------------------------------------------
    Since v2.0.2.
------------------------------------------------------------------------------%>
Records.prototype.getFormRowElm = function() {
    return document.getElementById("<%=RecordsConst.FORM_ELEMENTS_ELM_ID_PREFIX%>"
            + this.theID);
}

<%------------------------------------------------------------------------------
    Since v2.0.2.
------------------------------------------------------------------------------%>
Records.prototype.getRecordRowElm = function(recordIdx) {
    return document.getElementById("<%=RecordsConst.RECORD_PROPERTIES_ELM_ID_PREFIX%>"
            + this.theID + recordIdx);
}

<%------------------------------------------------------------------------------
    Since v2.0.2.
------------------------------------------------------------------------------%>
Records.prototype.getFilterRowElm = function() {
    return document.getElementById("<%=RecordsConst.FILTER_ELEMENTS_ELM_ID_PREFIX%>"
            + this.theID)
}

<%------------------------------------------------------------------------------
    Called when the user changes current page.

    The implementation simply updates the value of the coresponding element
    from navigation form and then calls "navigationChanged" method.
------------------------------------------------------------------------------%>
Records.prototype.onChangeCurrentPage = function(pageIdx) {
    var elm = document.getElementById(this.theID + "<%=RecordsConst.PARAM_CURRENT_PAGE_IDX%>");

    if (elm == null) {
        return;
    }

    elm.value = "" + pageIdx;
    this.navigationChanged();
}

<%------------------------------------------------------------------------------
    Called when the user changes the number of records displayed
    into one page.

    The implementation simply updates the value of the coresponding elements
    from navigation form and then calls "navigationChanged" method.
------------------------------------------------------------------------------%>
Records.prototype.onChangeRecordsPerPage = function(recordsPerPage) {
    var elm = document.getElementById(this.theID + "<%=RecordsConst.PARAM_RECORDS_PER_PAGE%>");

    if (elm == null) {
        return;
    }

    elm.value = "" + recordsPerPage;
    this.navigationChanged();
}

<%------------------------------------------------------------------------------
    Called when the user changes records sort criteria.

    The implementation simply updates the value of the coresponding elements
    from navigation form and then calls "navigationChanged" method.

    @sortKey          the key (specified when records were rendered) to be
                      used for sorting the records
------------------------------------------------------------------------------%>
Records.prototype.onChangeSortCriteria = function(sortKey) {
    var sortKeyElm = document.getElementById(this.theID + "<%=RecordsConst.PARAM_SORT_KEY%>");
    var sortTypeElm = document.getElementById(this.theID + "<%=RecordsConst.PARAM_SORT_TYPE%>");

    if ((sortKeyElm == null) || (sortTypeElm == null)) {
        return;
    }

    if (sortKeyElm.value == sortKey) {
        sortTypeElm.value = sortTypeElm.value == "true" ? "false" : "true";
    } else {
        sortKeyElm.value = sortKey;
        sortTypeElm.value = "true";
    }

    this.navigationChanged();
}

<%------------------------------------------------------------------------------
    Called when the user toggles the visibility of the form used for
    filtering the records.
------------------------------------------------------------------------------%>
Records.prototype.onToggleFilterFormVisibility = function() {
    var elm = document.getElementById(this.theID + "<%=RecordsConst.PARAM_FILTER_FORM_VISIBILITY%>");
    var filterRowElm = this.getFilterRowElm();

    if ((elm == null) || (filterRowElm == null)) {
        return;
    }

    elm.value = elm.value == "true" ? "false" : "true";

    filterRowElm.className = this.getStyleClass(elm.value == "true"
            ? "records-filter-row" : "records-hidden");
}

<%------------------------------------------------------------------------------
    Called when one of navigation form's properties was changed and the
    records should be rendered again.

    The method MUST be overridden in derived classes. Default implementation
    simply displays an error message.
------------------------------------------------------------------------------%>
Records.prototype.navigationChanged = function() {
    alert("records:navigationChanged");
}

<%------------------------------------------------------------------------------
    Checks to see if a record is selected.

    @recordIdx        the index of the record

    Returns TRUE if the record is selected, FALSE otherwise.
------------------------------------------------------------------------------%>
Records.prototype.isRecordSelected = function(recordIdx) {
    return this.getRecordCheckboxElm(recordIdx).checked;
}

<%------------------------------------------------------------------------------
    Selects a record.

    @recordIdx        the index of the record
------------------------------------------------------------------------------%>
Records.prototype.selectRecord = function(recordIdx, select) {
    var rowElm = this.getRecordRowElm(recordIdx);

    var cs = this.getStyleClass(recordIdx % 2 == 0 ? "records-row-even" : "records-row-odd")
          + (select ? (" " + this.getStyleClass("records-row-selected")) : "");

    rowElm.className = this.getStyleClass(recordIdx % 2 == 0 ? "records-row-even" : "records-row-odd")
          + (select ? (" " + this.getStyleClass("records-row-selected")) : "");

    this.getRecordIdxCellElm(recordIdx).className =
            this.getStyleClass("records-row-idx-cell")
                    + (select ? (" " + this.getStyleClass("records-row-idx-cell-selected")) : "");

    this.getRecordCheckboxElm(recordIdx).checked = select;
}

<%------------------------------------------------------------------------------
    Toggles the selection for a record.

    @recordIdx        the index of the record
------------------------------------------------------------------------------%>
Records.prototype.toggleRecordSelection = function(recordIdx) {
    this.selectRecord(recordIdx, !this.isRecordSelected(recordIdx));
}

<%------------------------------------------------------------------------------
    Called when the user clicks on "Select All" button.
------------------------------------------------------------------------------%>
Records.prototype.onSelectAll = function() {
    for (var i = 0; i < this.recordsList.length; i++) {
        this.selectRecord(i, true);
    }
}

<%------------------------------------------------------------------------------
    Called when the user clicks on "Toggle Selection" button.
------------------------------------------------------------------------------%>
Records.prototype.onToggleSelection = function() {
    for (var i = 0; i < this.recordsList.length; i++) {
        this.toggleRecordSelection(i);
    }
}

<%------------------------------------------------------------------------------
    Returns the number of selected records.
------------------------------------------------------------------------------%>
Records.prototype.getSelectedCount = function() {
    var count = 0;

    for (var i = 0; i < this.recordsList.length; i++) {
        if (this.isRecordSelected(i)) {
            count++;
        }
    }

    return count;
}

<%------------------------------------------------------------------------------
    Called when the user clicks on "Filter Records" button.

    The method MUST be overridden in derived classes. Default implementation
    simply displays an error message.
------------------------------------------------------------------------------%>
Records.prototype.onFilter = function() {
    alert("records:onFilter");
}

<%------------------------------------------------------------------------------
    Called when the user clicks on "Refresh" button.

    The method MUST be overridden in derived classes. Default implementation
    simply displays an error message.
------------------------------------------------------------------------------%>
Records.prototype.onRefresh = function() {
    alert("records:onRefresh");
}

<%------------------------------------------------------------------------------
    Called when the user clicks on "Add" button.
------------------------------------------------------------------------------%>
Records.prototype.onAdd = function() {
    this.enterEditMode(-1);
}

<%------------------------------------------------------------------------------
    Called when the user wants to edit an existing record.

    @recordIdx        the index of the record
------------------------------------------------------------------------------%>
Records.prototype.onEdit = function(recordIdx) {
    this.enterEditMode(recordIdx);
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
Records.prototype.enterEditMode = function(recordIdx) {
    if (recordIdx != -1) {
        this.changeRecordRowElmVisibility(recordIdx, false);
    }
	
	var editModeHiddenInput = document.getElementById(
		"<%=CompositePresentationConst.EDIT_MODE_ID%>");
	editModeHiddenInput.value = "true";

	__invocationArray.addTempHandler(new Invoker(this, this.onSave, new Array(null, false)));

    this.positionFormRowElm(recordIdx);
    this.currentRecordIdx = recordIdx;
	
	try {
        recordIdx == -1 ? this.resetForm() : this.populateForm(recordIdx);
	} catch (err) {
		alert(err);
	}

    this.getFormRowElm().className = this.getStyleClass("records-form-row-" 
		+ (recordIdx%2==0?"even":"odd"));

    this.setFormFocus();
    this.showHideButtons();
}

<%------------------------------------------------------------------------------
    Since v2.0.2.
------------------------------------------------------------------------------%>
Records.prototype.changeRecordRowElmVisibility = function(recordIdx, visible) {
    var recordRowElm = this.getRecordRowElm(recordIdx);

    if (!visible) {
        recordRowElm.recordsPrevClassName = recordRowElm.className;
        recordRowElm.className = this.getStyleClass("records-hidden");
    } else {
        recordRowElm.className = recordRowElm.recordsPrevClassName;
        recordRowElm.recordsPrevClassName = null;
    }
}

<%------------------------------------------------------------------------------
    Since v2.0.2.
------------------------------------------------------------------------------%>
Records.prototype.positionFormRowElm = function(recordIdx) {
    var formRowElm = this.getFormRowElm();

	if (recordIdx != -1) {
        formRowElm.parentNode.insertBefore(formRowElm,
                this.getRecordRowElm(recordIdx));
    } else {
        if (this.showAddFormAtTop && (this.recordsList.length > 0)) {
            formRowElm.parentNode.insertBefore(formRowElm,
                    this.getRecordRowElm(0));
        } else {
            formRowElm.parentNode.appendChild(formRowElm);
        }
    }
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
Records.prototype.exitEditMode = function() {
    if (this.currentRecordIdx != -1) {
        this.changeRecordRowElmVisibility(this.currentRecordIdx, true);
    }

	var editModeHiddenInput = document.getElementById("<%=CompositePresentationConst.EDIT_MODE_ID%>");
	editModeHiddenInput.value = "false";

	__invocationArray.removeTempHandler(new Invoker(this, this.onSave, new Array(null, false)));

    this.currentRecordIdx = null;

    this.getFormRowElm().className = this.getStyleClass("records-hidden");

    this.resetForm();
    this.showHideButtons();
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
Records.prototype.showHideButtons = function() {
    document.getElementById("<%=RecordsConst.SELECTION_BUTTONS_ELM_ID_PREFIX%>"
            + this.theID).className = this.isEditMode()
                    ? this.getStyleClass("records-hidden") : "";

    document.getElementById("<%=RecordsConst.NAVIGATION_BUTTONS_ELM_ID_PREFIX%>"
            + this.theID).className = this.isEditMode()
                    ? this.getStyleClass("records-hidden") : "";

    <%---------------------------------------------------------------------------
    document.getElementById("<%=RecordsConst.EDITMODE_BUTTONS_ELM_ID_PREFIX%>"
            + this.theID).className = this.isEditMode()
                    ? this.getStyleClass("edit-mode-div") : 
					this.getStyleClass("non-edit-mode-div");
	
	var pos = calcElemPosition(this.getFormRowElm());
	document.getElementById("<%=RecordsConst.EDITMODE_BUTTONS_ELM_ID_PREFIX%>"
            + this.theID).style.top = pos.y;
	
	document.getElementById("<%=RecordsConst.EDITMODE_BUTTONS_ELM_ID_PREFIX%>"
            + this.theID).style.left = pos.x + this.getFormRowElm().clientWidth + 5;
   ----------------------------------------------------------------------------%>
   document.getElementById("<%=RecordsConst.EDITMODE_BUTTONS_ELM_ID_PREFIX%>"
            + this.theID).className = this.isEditMode()
                    ? "" : this.getStyleClass("records-hidden");
   
    if (this.isEditMode()) {
        document.getElementById("<%=RecordsConst.DELETE_BUTTON_PARENT_ELM_ID%>").className =
                this.currentRecordIdx == -1 ? "composite-hidden" : "";		
    }
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
Records.prototype.populateForm = function(recordIdx) {
    alert("records:populateForm");
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
Records.prototype.setFormFocus = function() {
    alert("records:setFormFocus");
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
Records.prototype.resetForm = function(recordIdx) {
    alert("records:resetForm");
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
Records.prototype.onSave = function() {
    alert("records:onSave");
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
Records.prototype.onDelete = function(recordIdx) {
    alert("records:onDelete");
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
Records.prototype.onCancel = function() {
    this.exitEditMode();
}

<%------------------------------------------------------------------------------

------------------------------------------------------------------------------%>
Records.prototype.onDeleteSelected = function() {
    alert("records:onDeleteSelected");
}
