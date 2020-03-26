/*
*     Funtie folosita pentru afisarea ferestrelor de editare si stergere
*/
        function setAction(action,key ,id) {
        	document.actionForm.actionType.value = action;
        	document.actionForm.elements[key].value = id;
        	document.actionForm.submit();
        	return;
       	}

       	function submitTopForm(command) {
       	    document.topForm.action.value = command;
       	    document.topForm.submit();
       	}
/*
*     Funtii de navigare
*/
	      function setNavigate(rpp, crtPage) {
			 document.navigationForm.rpp.value = rpp;
			 document.navigationForm.crtPage.value = crtPage;
			 document.navigationForm.submit();
			 return;
	      }
	      function setResults(rpp) {
	    		 document.navigationForm.rpp.value = rpp;
	    		 document.navigationForm.crtPage.value = 1;
	    		 document.navigationForm.submit();
	    		 return;
	      }
	      function setDisplayMode(mode) {
	    		 document.navigationForm.displayMode.value = mode;
	    		 document.navigationForm.submit();
	    		 return;
	      }

	      function setOrder(orderBy, orderType) {

	             if(orderBy==-1){
	                alert('Trebuie sa selectati un criteriu !');
                    return;
	                }

	    		 document.navigationForm.orderBy.value = orderBy;
	    		 document.navigationForm.orderType.value = orderType;
	    		 document.navigationForm.submit();
	    		 return;
	      }
       function setPage(crtPage) {
        document.pagesForm.crtPage.value = crtPage;
        document.pagesForm.submit();
        return;
       }
/*
*     END Funtii navigare
*/
/**
*     Functie pentru ascunderea interfetei de search
*/
	function clikker(a)
	{
		if (a.style.display =='')
		{
			a.style.display = 'none';
			//b.src='images/portlet/show.gif';
		}
		else
		{
 			a.style.display='';
			//b.src='images/portlet/hide.gif';
		}
	}

function showLayer(layerID) {
document.getElementById(layerID).style.display='block';
}
function hideLayer(layerID) {
document.getElementById(layerID).style.display='none';
document.navigationForm.search.value = 0;
}


/**
*     END_Functie pentru ascunderea interfetei de search
*/

/**
*  Seteaza rolul care se doreste a fi sters, in add_user
*/
          function setRole(id) {
            document.deleteRole.id_appl_role.value = id;
            document.deleteRole.submit();
            return;
          }
/**
*   Verifica daca s=a selectat un rol
*/
          function checkSelect() {
            if (document.addRole.id_appl_role.value=="0")
              document.addRole.addRoleBtn.disabled=true;
            else
              document.addRole.addRoleBtn.disabled=false;
}

/**
*   Verifica daca s=a selectat un subrol
*/
          function checkSubRoleSelect() {
            if (document.addSubRole.id_appl_sub_role.value=="0")
              document.addSubRole.addRoleBtn.disabled=true;
            else
              document.addSubRole.addRoleBtn.disabled=false;
}
/**
*  Seteaza subrolul care se doreste a fi sters, in add_role
*/
          function setSubRole(id) {
            document.deleteSubRole.id_appl_sub_role.value = id;
            document.deleteSubRole.submit();
            return;
          }
/**
*  functie chemata la unload de fiecare template.
*/
function execUnload()
{
    var iX = window.document.body.offsetWidth + window.event.clientX ;
    var iY = window.event.clientY ;
    if (iX <= 30 && iY < 0 ){
        location="toUS?prefix=/userservice&page=logout.do&action=102";
    }
}

function iterativeSetAction(action,key ,listObj)
{
     document.actionForm.actionType.value = action;
    var boolAtLeastOne = false;
    for ( var i = 0; i < listObj.length; i++ )
         if ( listObj[ i ].checked ) {
            document.actionForm.elements[key].value += ( listObj[ i ].id + '|' );
            boolAtLeastOne = true;
         }
//    alert( document.actionForm.elements[key].value );
     if ( boolAtLeastOne )
        document.actionForm.submit();
    return;
}

//
// Unfilters a string writed out by a <bean:write filter="true"/> Struts tag.
//
function unFilterString(val) {
    // works because none of the results contains a character that
    // may affect the folowing replacements
    val = val.replace(/&lt;/g, "<");
    val = val.replace(/&gt;/g, ">");
    val = val.replace(/&quot;/g, "\"");
    val = val.replace(/&#39;/g, "\'");

    // this must be the last
    val = val.replace(/&amp/g, "&");

    return val;
}