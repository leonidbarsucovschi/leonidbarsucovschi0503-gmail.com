var HTML_START='<HTML>';
var HTML_END='</HTML>';
var HTML_STYLE='<HEAD><link rel="stylesheet" type="text/css" media="screen" href="css/global_styles.css"> <link rel="stylesheet" type="text/css" media="screen" href="css/page_styles.css"><link rel="stylesheet" type="text/css" media="screen" href="css/element_styles.css"></HEAD>';

//numele fisierului ales spre editare
var numeHTML;
//numele directorului de resurse statice din care s-a ales fisierul html spre editare
var dirHTML;


//o referinta la obiectul XMLHttpRequest
var xmlhttp;
//numele metodei in fuctie de acest nume tratez raspunsul venit de la server
var metoda;
//nume fisier html nou
var nume;
//true se salveaza un nou fisier false se salveaza modificari pe un fisier vechi
var nou = false;
//false nu a fost initializat htmlarea, true a fost initializat textarea
var flag = true;
//pentur codare base64
var keyStr = "ABCDEFGHIJKLMNOP" +
                "QRSTUVWXYZabcdef" +
                "ghijklmnopqrstuv" +
                "wxyz0123456789+/" +
                "=";

function encode64(input) {
      var output = "";
      var chr1, chr2, chr3 = "";
      var enc1, enc2, enc3, enc4 = "";
      var i = 0;

      do {
         chr1 = input.charCodeAt(i++);
         chr2 = input.charCodeAt(i++);
         chr3 = input.charCodeAt(i++);

         enc1 = chr1 >> 2;
         enc2 = ((chr1 & 3) << 4) | (chr2 >> 4);
         enc3 = ((chr2 & 15) << 2) | (chr3 >> 6);
         enc4 = chr3 & 63;

         if (isNaN(chr2)) {
            enc3 = enc4 = 64;
         } else if (isNaN(chr3)) {
            enc4 = 64;
         }

         output = output +
            keyStr.charAt(enc1) +
            keyStr.charAt(enc2) +
            keyStr.charAt(enc3) +
            keyStr.charAt(enc4);
         chr1 = chr2 = chr3 = "";
         enc1 = enc2 = enc3 = enc4 = "";
      } while (i < input.length);

      return output;
   }

//trimite mesaj asincron catre server SET
function loadXMLDoc(url,_metoda) {
 //alert("loadXMLDoc");
 this.metoda = _metoda
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

//initializeaza cbo cu directoarele root de continut static
function init() {
 var cbo = document.getElementById("dir");
 xml = xmlhttp.responseText.split(",");
 for (i=0; i<xml.length; i++) {
  var str = xml[i];
  var op = document.createElement("option");
  op.setAttribute("value",str);
  var txt = document.createTextNode(str);
  op.appendChild(txt);
  cbo.appendChild(op);
 }
}
//initializeaza lista de fisiere html si imagine si download care sunt in directorul root selectat

function init1() {
 var cbo = document.getElementById("html");
 var cboi = document.getElementById("img");
 var cbod = document.getElementById("dld");
 //reinitializez cbo de html si img si dowload
 while(cbo.hasChildNodes()) {
  cbo.removeChild(cbo.firstChild);
 }
 while(cboi.hasChildNodes()) {
  cboi.removeChild(cboi.firstChild);
 }
 while(cbod.hasChildNodes()) {
  cbod.removeChild(cbod.firstChild);
 }
 //
 xml1 = xmlhttp.responseText.split(";");
 xml = xml1[0].split(",")
 for (i=0; i<xml.length; i++) {
  var str = xml[i];
  if (str!=null && str.length!=0) addOption(cbo,str,str);
 }
 xml = xml1[1].split(",")
 for (i=0; i<xml.length; i++) {
  var str = xml[i];

  if (str!=null && str.length!=0) addOption(cboi,str,str);
 }
 xml = xml1[2].split(",")
 for (i=0; i<xml.length; i++) {
  var str = xml[i];
  if (str!=null && str.length!=0) addOption(cbod,str,str);
 }
}
/*
*  Return the id of the module. It is the numerical part from the end of the
*  directory name
*/
function getIdStaticDir() {

    //the name of the static dir is text from the combobox
    var dir = document.getElementById("dir").value;
    return dir;
}

//salveaza modificarile
 //
 function addOption(cbo,value,txt) {
  var op = document.createElement("option");
  op.setAttribute("value",value);
  var txtn = document.createTextNode(txt);
  op.appendChild(txtn);
  cbo.appendChild(op);
 }


