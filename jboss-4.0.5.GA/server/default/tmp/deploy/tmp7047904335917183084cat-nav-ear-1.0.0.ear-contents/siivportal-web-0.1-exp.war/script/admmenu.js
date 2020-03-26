//o referinta la obiectul XMLHttpRequest
var xmlhttp;
//numele metodei in fuctie de acest nume tratez raspunsul venit de la server
var metoda;
//fereastra in care incarc mnutree
var popup=null;
//trimite mesaj asincron catre server SET
function loadXMLDoc(url,_metoda) {
  this.metoda = _metoda;
 // code for Mozilla, etc.
 if (window.XMLHttpRequest){
  xmlhttp=new XMLHttpRequest();
  xmlhttp.onreadystatechange=xmlhttpChange;
  xmlhttp.open("GET",url,true);
  xmlhttp.send(null);
 }
 // code for IE
 else if (window.ActiveXObject){
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    if (xmlhttp)
    {
    xmlhttp.onreadystatechange=xmlhttpChange;
    xmlhttp.open("GET",url,true);
    xmlhttp.send();
    }
  }
}

function xmlhttpChange() {
// if xmlhttp shows "loaded"
 if (xmlhttp.readyState==4){
  // if "OK"
  if (xmlhttp.status==200) {
   if ((metoda=="list")||(metoda=="edit")) {
     var el = document.getElementById("html");
     el.innerHTML = xmlhttp.responseText;
     hidePopUp();
   }
   if (metoda=="add") {
     if (xmlhttp.responseText=="ok") {
       alert("Inregistrarea a fost adaugata");
       clear();
     }else {
       alert("Eroare la adaugarea inregistrarii");
     }
   }
   if (metoda=="update") {
     if (xmlhttp.responseText=="ok") {
       alert("Modificarile au fost salvate");
       clear();
     }else {
       alert("Eroare la salvarea modificarilor");
     }
   }
  }else {
    alert("Problem retrieving XML data");
  }
 }
}

//*****************?***********************************//
function clear() {
  var d = document.getElementById("html");
  while(d.hasChildNodes()) {
   d.removeChild(d.firstChild);
  }
}
function addurl() {
 var el = document.getElementById("dir");
 var url = document.getElementById("menu_url_dir");
 url.value = el.value;
}
function composeurl(tool) {
 var url = document.getElementById("menu_url_dir");
 url.value = tool.value;
 var optiune = tool.options[tool.selectedIndex];
 document.getElementById("menu_url_label").value = optiune.text;
}

function getParametrii() {
 var tmp = "?method="+document.form_AdmMenuEntryForm.method.value;
 //tmp = tmp + "&id_menu_entry="+document.getElementById("id_menu_entry").value;
 tmp = tmp + "&fk_menu_entry="+document.getElementById("fk_menu_entry").value;
 tmp = tmp + "&menu_url_dir="+document.getElementById("menu_url_dir").value;
 tmp = tmp + "&link_menu_name="+document.getElementById("link_menu_name").value;
 tmp = tmp + "&menu_name="+document.getElementById("menu_name").value;
 tmp = tmp + "&menu_type="+document.getElementById("menu_type").value;
 tmp = tmp + "&menu_state_boo="+document.getElementById("menu_state_boo").value;
 tmp = tmp + "&menu_order="+document.getElementById("menu_order").value;
 alert("tmp ="+tmp);
 return tmp;
}
//
function add() {
 if (valideaza()) loadXMLDoc("/siiv/sys/admmenutree.do"+getParametrii(),"add");
}
function update() {
 loadXMLDoc("/siiv/sys/admmenutree.do"+getParametrii(),"update");
}
//
function showAdd() {
 loadXMLDoc("/siiv/sys/admmenutree.do?method=showAdd&idParinte="+idMenu,"list");
}
//
function showEdit() {
 loadXMLDoc("/siiv/sys/admmenutree.do?method=showEdit&idMenu="+idMenu,"edit");
}
//
function showTranslate() {
 loadXMLDoc("/siiv/sys/admmenutree.do?method=showTranslate&idMenu="+idMenu,"translate")
}
//
function showDelete() {
 loadXMLDoc("/siiv/sys/admmenutree.do?method=showDelete&idMenu="+idMenu,"delete")
}

//*****************functii de validare*************************************//
// Trim whitespace from left and right sides of s.
function trim(s) {
 return s.replace( /^\s*/, "" ).replace( /\s*$/, "" );
}
function isVid(value) {
 if (value==null) {
  return true;
 }else {
  if (trim(value).length==0) {
   return true;
  }
 }
 return false;
}
function isAllDigits(argvalue) {
    argvalue = argvalue.toString();
    var validChars = "0123456789";
    var startFrom = 0;
    if ((argvalue.charAt(0) == "0")&&(argvalue.length >= 2)) {
        return false;
    }
    for (var n = startFrom; n < argvalue.length; n++) {
       if (validChars.indexOf(argvalue.substring(n, n+1)) == -1) return false;
    }
    return true;
}
// validari
function valideaza() {
 var tmp = true;
 var msg = "Urmatoarele campuri sunt obligatorii:\n\r";
 //nod parinte
 if (isVid(document.getElementById("fk_menu_entry").value)) {
   tmp = false;
   msg = msg + "Nod Parinte\n\r";
 }
 //nume meniu
 if (isVid(document.getElementById("menu_name").value)) {
   tmp = false;
   msg = msg + "Nume meniu\n\r";
 }
 //url meniu
 if (isVid(document.getElementById("menu_url_dir").value)) {
   tmp = false;
   msg = msg + "Url meniu\n\r";
 }
 if (isVid(document.getElementById("menu_order").value)) {
   tmp = false;
   msg = msg + "Numar de ordine meniu\n\r";
 }
 //numar de ordine pentru meniu
 if (!isAllDigits(document.getElementById("menu_order").value)) {
    tmp = false;
    msg = msg + "Numar de ordine trebuie sa fie intreg";
 }
 if (!tmp) {
  alert(msg);
 }
 return tmp;
}