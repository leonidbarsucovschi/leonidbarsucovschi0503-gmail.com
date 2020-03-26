<%--
 *
 * jpdisplaytag.jsp
 *
 * Copyright (c) 2006 UTI Systems. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of UTI Systems.
 *
--%>

<%@ page language="java" %>
<%@ page contentType="text/javascript; charset=iso-8859-2"%>

<%------------------------------------------------------------------------------
    Get a form from id or form

    @param formId form or form id
------------------------------------------------------------------------------%>
  function dtResolveForm(formElmOrId) {

      var navForm = (typeof(formElmOrId) == "string")
      ? document.getElementById(formElmOrId) : formElmOrId;
      /*
      *  patch to support old pages that have a single form per page
      */
      if(typeof(navForm) == "undefined" )
            navForm = document.navigationForm;

      return navForm;
}
<%------------------------------------------------------------------------------
    Set Naviation details for a display tag.

    @param formId form or form id
    @param crtPage page to switch
------------------------------------------------------------------------------%>

  function dtNavigateTo(formElmOrId , crtPage) {

      var navForm =dtResolveForm(formElmOrId);
      navForm.crtPage.value = crtPage;

      dtSubmitForm(navForm);
      return;
  }

<%------------------------------------------------------------------------------
    Set Naviation details for a display tag.

    @param formId form or form id
    @param results results per page
------------------------------------------------------------------------------%>
  function dtSetPageResults(formElmOrId,results) {

    var navForm =dtResolveForm(formElmOrId);
    //dumpForm(navForm);
    navForm.rpp.value = results;
    navForm.crtPage.value = 1;

    dtSubmitForm(navForm);
    return;
  }
<%------------------------------------------------------------------------------
    Set Order criteria for list for a display tag.

    @param formId form or form id
    @param ordery the field for sorting
    @param orderType is asc or desc
------------------------------------------------------------------------------%>
  function dtOrderBy(formElmOrId, orderBy, orderType) {

    var navForm =dtResolveForm(formElmOrId);

    if(orderBy==-1){
      alert('Trebuie sa selectati un criteriu !');
      return;
    }
      navForm.orderBy.value = orderBy;
      navForm.orderType.value = orderType;
      dtSubmitForm(navForm);
      return;
  }
<%------------------------------------------------------------------------------
    reset criateria and jump to the first page

    @param formId form or form id
------------------------------------------------------------------------------%>
  function dtReset(formElmOrId) {

    var navForm =dtResolveForm(formElmOrId);
    navForm.method.value="refresh";
    navForm.orderBy.value =  "";
    navForm.orderType.value = "";
    navForm.crtPage.value = 1;
    navForm.rpp.value = "";
    dtSubmitForm(navForm);

    return;
 }
<%------------------------------------------------------------------------------
    Submit the form on classic way of using ajax. To submit a form
    using ajax the form must have a parameter called <code>is_ajax</code>
    set to value true


    @param formId form or form id
------------------------------------------------------------------------------%>
function dtSubmitForm(formElmOrId){

    var navForm = dtResolveForm(formElmOrId);

    if(typeof navForm.is_ajax!='undefined'){
          if(navForm.is_ajax.value=='true'){
              var response = submitFormUsingAjax(navForm);
              dtDisplayResult(response,navForm.id+"Div");
          }
    }
    else
      navForm.submit();
}

<%------------------------------------------------------------------------------
    called to display the result when the form is submited using ajax

    @param responseText the response from ajax request
    @param  divName the name of the div that display the result
------------------------------------------------------------------------------%>
function dtDisplayResult(responseText, divName){
   var myDiv = document.getElementById(divName);
   myDiv.innerHTML = responseText;

}
<%------------------------------------------------------------------------------
    sumbimts a form using ajax. this submit does not work with files

    @param formId form or form id
------------------------------------------------------------------------------%>
function submitFormUsingAjax(formElmOrId){
  var frmSub =  new JpfFormSubmit(formElmOrId);
  var req = new JpfHttpRequest(frmSub.formAction,frmSub.encodeFormData());
  var response = req.send();
  return response;
}


<%------------------------------------------------------------------------------
    for debug purpose

    @param formObject form object
------------------------------------------------------------------------------%>
function dumpForm(formObject){
alert(formObject);
document.write('<table border=1><tr><th>element</th><th>name</th><th>type</th><th>value</th>');
for (var i=0;i<document.formObject.length;i++)
{

	current = document.formObject.elements[i];
	document.write('<tr><td>' + i);
	document.write('<td>' + current.name);
	document.write('<td>' + current.type);
	document.write('<td>' + current.value + '</tr>');
}
 document.write('</table>');
}



