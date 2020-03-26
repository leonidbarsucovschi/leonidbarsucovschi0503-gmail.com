var previousMenuId = "";

// Call during document onmousemove.
// Tests whether the mouse is within the bounds of the context menu.
function TestOnMenu() {

  if (previousMenuId == "" ) return;
  var el = document.getElementById(previousMenuId);

   if ( event.x + document.body.scrollLeft < el.style.posLeft ||
        event.y + document.body.scrollTop < el.style.posTop ||
        event.x + document.body.scrollLeft > el.style.posLeft+el.offsetWidth ||
        event.y + document.body.scrollTop > el.style.posTop+el.offsetHeight) {
          el.style.visibility = "hidden";
   }
}

function hidePopUp() {
	var el = document.getElementById("select");
	var elR = document.getElementById("selectR");
	var elFR = document.getElementById("selectFR");
    if(el!=null && typeof(el) != "undefined")
        el.style.visibility = "hidden";
    if(elR!=null && typeof(elR) != "undefined")
        elR.style.visibility = "hidden";
    if(elFR!=null && typeof(elFR) != "undefined")
        elFR.style.visibility = "hidden";
}

function showPopUpRolUser() {
   //specific pt  adm_user_inreg si adm_user_ext
    var paf = document.getElementById("paf");
    if (paf) {
      if (paf.value!=1) {
        return;
      }
    }
    //end specific
	var previousEl = document.getElementById(previousMenuId);

	if (previousEl != null) {
		hidePopUp(previousMenuId);
	}

	previousMenuId = "select";

	var el = document.getElementById("select");

	if (is_nav6up) {
		el.style.left = mousePosX - 10;
		el.style.top = mousePosY - 10;
                if (el.style.left < 0) el.style.left=0;
                if (el.style.top < 0) el.style.top=0;
	}
	else {
		el.style.pixelLeft = mousePosX - 10;// - el.style.pixelLeft;
		el.style.pixelTop = mousePosY - 10;// - el.style.pixelTop;
                if (el.style.pixelLeft < 0) el.style.pixelLeft=0;
                if (el.style.pixelTop < 0) el.style.pixelTop=0;
	}

	el.style.visibility = "visible";
}


function showPopUp() {
	var previousEl = document.getElementById(previousMenuId);

	if (previousEl != null) {
		hidePopUp(previousMenuId);
	}

	previousMenuId = "select";

	var el = document.getElementById("select");

	if (is_nav6up) {
		el.style.left = mousePosX - 10;
		el.style.top = mousePosY - 10;
                if (el.style.left < 0) el.style.left=0;
                if (el.style.top < 0) el.style.top=0;
	}
	else {
		el.style.pixelLeft = mousePosX - 10;// - el.style.pixelLeft;
		el.style.pixelTop = mousePosY - 10;// - el.style.pixelTop;
                if (el.style.pixelLeft < 0) el.style.pixelLeft=0;
                if (el.style.pixelTop < 0) el.style.pixelTop=0;
	}

	el.style.visibility = "visible";
}

function showPopUpRoot() {
    //specific pt  adm_user_inreg si adm_user_ext
    var idp = document.getElementById("idp");
    if (idp) {
      if (idp.value!=1) {
        return;
      }
    }
    //end specific
	var previousEl = document.getElementById(previousMenuId);
	if (previousEl != null) {
		hidePopUp(previousMenuId);
	}

	previousMenuId = "select";

	var el = document.getElementById("selectR");

	if (is_nav6up) {
		el.style.left = mousePosX - 10;
		el.style.top = mousePosY - 10;
                if (el.style.left < 0) el.style.left=0;
                if (el.style.top < 0) el.style.top=0;
	}
	else {
		el.style.pixelLeft = mousePosX - 10;// - el.style.pixelLeft;
		el.style.pixelTop = mousePosY - 10;// - el.style.pixelTop;
                if (el.style.pixelLeft < 0) el.style.pixelLeft=0;
                if (el.style.pixelTop < 0) el.style.pixelTop=0;
	}

	el.style.visibility = "visible";
}