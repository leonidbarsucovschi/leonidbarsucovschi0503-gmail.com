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
//trimite mesaj asincron catre server POST
//salvarea modificarilor

function postHtmlDoc(url,_metoda) {
 this.metoda = _metoda
 // code for Mozilla, etc.
 if (window.XMLHttpRequest){
  xmlhttp=new XMLHttpRequest();
  xmlhttp.onreadystatechange=xmlhttpChange;
  xmlhttp.open("POST",url,true);
  //xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
  //xmlhttp.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
  //xmlhttp.send("msg="+escape(editor.getHTML()));
   //var msg = editor.getHTML();
   var msg = tinyMCE.getContent();
   //alert(msg);
   xmlhttp.setRequestHeader('Content-Type','multipart/form-data; boundary=AaB03x');
   var  body = '--AaB03x\r\nContent-Disposition: form-data; name="method"\r\n\r\nmodific_html\r\n';
   body += '--AaB03x\r\nContent-Disposition: form-data; name="root_dir"\r\n\r\n'+dirHTML+'\r\n';
   //body += '--AaB03x\r\nContent-Disposition: form-data; name="msg"\r\nContent-Transfer-Encoding: base64\r\n\r\n'+encode64(msg)+'\r\n';
   //body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+numeHTML+'"\r\nContent-Type: text/html; charset=UTF-8\r\nContent-Transfer-Encoding: base64\r\n\r\n'+encode64(msg)+'\r\n';
   //body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+numeHTML+'"\r\nContent-Type: application/octet-stream\r\n\r\n'+msg+'\r\n';
   body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+numeHTML+'"\r\nContent-Type: text/html; charset=UTF-8\r\n\r\n'+msg+'\r\n';
   body += '--AaB03x--';
   //alert(body);
   xmlhttp.send(body);
 }
 // code for IE
 else if (window.ActiveXObject){
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    if (xmlhttp)
    {
    xmlhttp.onreadystatechange=xmlhttpChange;
    xmlhttp.open("POST",url,true);
     //xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
     //xmlhttp.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
     //method=modific_html&root_dir="+dirHTML+"&html="+numeHTML;
     //var msg = editor.getHTML();
     var msg = tinyMCE.getContent();
     //alert(msg);
     xmlhttp.setRequestHeader('Content-Type','multipart/form-data; boundary=AaB03x');
     var  body = '--AaB03x\r\nContent-Disposition: form-data; name="method"\r\n\r\nmodific_html\r\n';
     body += '--AaB03x\r\nContent-Disposition: form-data; name="root_dir"\r\n\r\n'+dirHTML+'\r\n';
     //body += '--AaB03x\r\nContent-Disposition: form-data; name="msg"\r\nContent-Transfer-Encoding: base64\r\n\r\n'+encode64(msg)+'\r\n';
     //body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+numeHTML+'"\r\nContent-Type: text/html; charset=UTF-8\r\nContent-Transfer-Encoding: base64\r\n\r\n'+encode64(msg)+'\r\n';
     //body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+numeHTML+'"\r\nContent-Type: application/octet-stream\r\n\r\n'+msg+'\r\n';
     body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+numeHTML+'"\r\nContent-Type: text/html; charset=UTF-8\r\n\r\n'+msg+'\r\n';
     body += '--AaB03x--';
     //alert(body);
     xmlhttp.send(body);
    }
  }
}


//trimite mesaj asincron catre server POST
//noua pagina
function postHtmlDocNou(url,_metoda,nume) {
 this.metoda = _metoda
 // code for Mozilla, etc.
 if (window.XMLHttpRequest){
  xmlhttp=new XMLHttpRequest();
  xmlhttp.onreadystatechange=xmlhttpChange;
  xmlhttp.open("POST",url,true);
  //xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
  //xmlhttp.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
  //xmlhttp.send("msg="+escape(editor.getHTML()));
   //var msg = editor.getHTML();
   var msg = tinyMCE.getContent();
  //alert(msg);
   xmlhttp.setRequestHeader('Content-Type','multipart/form-data; boundary=AaB03x');
   var  body = '--AaB03x\r\nContent-Disposition: form-data; name="method"\r\n\r\nmodific_html\r\n';
   body += '--AaB03x\r\nContent-Disposition: form-data; name="root_dir"\r\n\r\n'+document.getElementById("dir").value+'\r\n';
   //body += '--AaB03x\r\nContent-Disposition: form-data; name="msg"\r\nContent-Transfer-Encoding: base64\r\n\r\n'+encode64(msg)+'\r\n';
   //body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+numeHTML+'"\r\nContent-Type: text/html; charset=UTF-8\r\nContent-Transfer-Encoding: base64\r\n\r\n'+encode64(msg)+'\r\n';
   //body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+numeHTML+'"\r\nContent-Type: application/octet-stream\r\n\r\n'+msg+'\r\n';
   body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+nume+'"\r\nContent-Type: text/html; charset=UTF-8\r\n\r\n'+msg+'\r\n';
   body += '--AaB03x--';
   //alert(body);
   xmlhttp.send(body);
 }
 // code for IE
 else if (window.ActiveXObject){
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    if (xmlhttp)
    {
    xmlhttp.onreadystatechange=xmlhttpChange;
    xmlhttp.open("POST",url,true);
     //xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
     //xmlhttp.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
     //method=modific_html&root_dir="+dirHTML+"&html="+numeHTML;
     //var msg = editor.getHTML();
     var msg = tinyMCE.getContent();
     //alert(msg);
     xmlhttp.setRequestHeader('Content-Type','multipart/form-data; boundary=AaB03x');
     var  body = '--AaB03x\r\nContent-Disposition: form-data; name="method"\r\n\r\nmodific_html\r\n';
     body += '--AaB03x\r\nContent-Disposition: form-data; name="root_dir"\r\n\r\n'+document.getElementById("dir").value+'\r\n';
     //body += '--AaB03x\r\nContent-Disposition: form-data; name="msg"\r\nContent-Transfer-Encoding: base64\r\n\r\n'+encode64(msg)+'\r\n';
     //body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+numeHTML+'"\r\nContent-Type: text/html; charset=UTF-8\r\nContent-Transfer-Encoding: base64\r\n\r\n'+encode64(msg)+'\r\n';
     //body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+numeHTML+'"\r\nContent-Type: application/octet-stream\r\n\r\n'+msg+'\r\n';
     body += '--AaB03x\r\nContent-Disposition: form-data; name="theFile"; filename="'+nume+'"\r\nContent-Type: text/html; charset=UTF-8\r\n\r\n'+msg+'\r\n';
     body += '--AaB03x--';
     //alert(body);
     xmlhttp.send(body);
    }
  }
}



function xmlhttpChange() {
 //alert("xmlhttpChange");
// if xmlhttp shows "loaded"
 if (xmlhttp.readyState==4){
  // if "OK"
  if (xmlhttp.status==200) {
    if (metoda=="load") {
     //alert("method=load");
       init1();
    }
    if (metoda=="get"){
        //alert("Start-method=get");
        //editor.setHTML(HTML_START+HTML_STYLE+xmlhttp.responseText+HTML_END);
        tinyMCE.setContent(xmlhttp.responseText);
        //alert(xmlhttp.responseText);
        //initializez numeFisier si dir unde se face editarea pentru a le avea la salvare
        numeHTML = document.getElementById("html").value;
        dirHTML =  getIdStaticDir();
        //alert("End-method=get");
    }
    if (metoda=="set") {
     if (xmlhttp.responseText=="ok") {
       alert("Salvarea modificarilor a fost facuta!");
       numeHTML=null;
       dirHTML=null;
       if (nou) {
           var cbo = document.getElementById("html");
           var op = document.createElement("option");
           op.setAttribute("value",nume);
           op.setAttribute("selected",true);
           var txt = document.createTextNode(nume);
           op.appendChild(txt);
           cbo.appendChild(op);
       }
       //editor.setHTML("");
       tinyMCE.setContent('');
     }
     else  alert("Salvarea modificarilor a esuat!");
    }
  }else {
    alert("Problem retrieving XML data");
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
    //xml = xml1[0].split(",")
 xml = xml1[0].split("|")
 for (i=0; i<xml.length; i++) {
  var str = xml[i];
  if (str!=null && str.length!=0) addOption(cbo,str,str);
 }
    //xml = xml1[1].split(",")
 xml = xml1[1].split("|")
 for (i=0; i<xml.length; i++) {
  var str = xml[i];

  if (str!=null && str.length!=0) addOption(cboi,str,str);
 }
    //xml = xml1[2].split(",")
 xml = xml1[2].split("|")
 for (i=0; i<xml.length; i++) {
  var str = xml[i];
  if (str!=null && str.length!=0) addOption(cbod,str,str);
 }
}

//click pe butonul insert imagine
//insereaza imaginea selectata din lista in locul unde este cursorul in editor
//http://172.16.206.22:8080/siiv/portal/staticcontent/static.do?package_id=501&resource=tomcat.gif

function inserareImagine() {
 var img = document.getElementById("img").value;
 if (img == "") {
  alert("Selectati un fisier imagine din lista");
  return false; 
 }
 var url="portal/static.do?x=get&package_id="+getIdStaticDir()+"&resource="+img;
 //editor._doc.execCommand("insertimage", false, url);
 tinyMCE.execCommand("mceInsertContent", false,"<img src="+url+">");
}

//click pe butonul insert link catre html
//insereaza un link catre o pagina html din continutul static

function inserareLinkHtml() {
 var html = document.getElementById("html").value;
 if (html == "") {
  alert("Selectati un fisier html din lista");
  return false; 
 }
 var url="portal/static.do?x=load&package_id="+getIdStaticDir()+"&resource="+html;
 //editor._doc.execCommand("createlink", false, url);
 tinyMCE.execCommand("createlink", false, url);
}

//click pe butonul insert link catre o resursa pentur dowload
//insereaza un link catre o resursa de dowload din continutul static

function inserareLinkDld() {
 var html = document.getElementById("dld").value;
 if (html == "") {
  alert("Selectati un fisier din lista de download");
  return false;
 }
 var url="portal/static.do?x=get&package_id="+getIdStaticDir()+"&resource="+html;
 //editor._doc.execCommand("createlink", false, url);
 tinyMCE.execCommand("createlink", false, url);
}


//click pe butonul editare
//incarca pagina html selectata in fereastra editorului
//onChange="loadXMLDoc('/edhtml/pagini_statice/501/html_11_en.html','get')"
function incarcaPagHtml() {
 //alert("incarcaPagHtml");
 var html = document.getElementById("html").value;
 if (html == "") {
  alert("Selectati un fisier html din lista");
  return false; 
 }
 //var url = "portal/static.do?x=get&package_id="+getIdStaticDir()+"&resource="+html;
 var url = "/siiv/publishing/edit_static_content.do?method=get_resource&package_id="+getIdStaticDir()+"&resource="+html;
 loadXMLDoc(url,"get");
}

/*
*  Return the id of the module. It is the numerical part from the end of the
*  directory name
*/
function getIdStaticDir() {

    //the name of the static dir is text from the combobox
    var dir = document.getElementById("dir").value;
    return dir;
//
//    //paternul
//    var patternForId = "([0-9]*)$";
//    //reg exp object
//    var rExp = new RegExp(patternForId);
//    //tagul de id dir
//    var dirPath = document.getElementById("dir").value;
//    //the id is the only returned element.
//    var idFound = rExp.exec(dirPath)[0];
//
//    return idFound;

}

//salveaza modificarile
function salvare() {
 nou = false;
  //var  html = document.getElementById("html").value;
  if (numeHTML == null) {
    alert("Selectati un fisier html din lista");
    return false;
  }
  if (!confirm("Salvati modificarile din fereastra de editare pentru fisierul "+numeHTML+" aflat in directorul " + dirHTML+"?")) {
    return false;
  }
  //var url = "/siiv/publishing/edit_static_content.do?method=modific_html&root_dir="+dirHTML+"&html="+numeHTML;
  var url = "/siiv/publishing/edit_static_content.do";
  postHtmlDoc(url,"set");
}
//save _as
function salvare_as() {
  if (numeHTML == null) {
    alert("Selectati un fisier html din lista");
    return false;
  }
 nou = true;
 nume = window.prompt("Introduceti numele fisierului pentru noua pagina html:","nume.html");
 if (nume==null) {
    alert("Operatia s-a anulat deoarece nu s-a introdus un nume pentru fisierul html");
    return false;
 }else {
   var pat = /^[a-zA-Z_0-9]+$/;
   str = nume.split(".");
   if (str.length!=2) {
    alert("Operatia s-a anulat deoarece nu s-a introdus un nume valid pentru fisierul html");
    return false;
   }
   if (str[0].length==0) {
     alert("Operatia s-a anulat deoarece nu s-a introdus un nume valid pentru fisierul html");
     return false;
   }
    if (!str[0].match(pat)) {
     alert("Operatia s-a anulat!Nume fisier trebuie sa contina doar litere,cifre si _");
     return false;
   }
   if (str[1]!="html") {
     alert("Operatia s-a anulat!Extensia fisierului trebuie sa fie html");
     return false;
   }
 }
 if (document.getElementById("dir").value.length==0) {
   alert("Operatia s-a anulat deoarece nu s-a ales un director de continut static");
   return false;
 }
 if (!confirm("Salvati pagina html din fereastra de editare \n cu numele "+nume+" in directorul " + document.getElementById("dir").value+"?")) {
   return false;
 }
 if (nume !=null) {
   var url = "/siiv/publishing/edit_static_content.do";
   postHtmlDocNou(url,"set",nume);
 }
}

//salveaza un nou fisier html
function nouaPagina() {
 nou = true;
 nume = window.prompt("Introduceti numele fisierului pentru noua pagina html:","nume.html");
 if (nume==null) {
    alert("Operatia s-a anulat deoarece nu s-a introdus un nume pentru fisierul html");
    return false;
 }else {
   var pat = /^[a-zA-Z_0-9]+$/;
   str = nume.split(".");
   if (str.length!=2) {
    alert("Operatia s-a anulat deoarece nu s-a introdus un nume valid pentru fisierul html");
    return false;
   }
   if (str[0].length==0) {
     alert("Operatia s-a anulat deoarece nu s-a introdus un nume valid pentru fisierul html");
     return false;
   }
   if (!str[0].match(pat)) {
     alert("Operatia s-a anulat!Nume fisier trebuie sa contina doar litere,cifre si _");
     return false;
   }
   if (str[1]!="html") {
     alert("Operatia s-a anulat!Extensia fisierului trebuie sa fie html");
     return false;
   }
 }
 if (document.getElementById("dir").value.length==0) {
   alert("Operatia s-a anulat deoarece nu s-a ales un director de continut static");
   return false;
 }
 if (!confirm("Salvati pagina html din fereastra de editare \n cu numele "+nume+" in directorul " + document.getElementById("dir").value+"?")) {
   return false;
 }
 if (nume !=null) {
   var url = "/siiv/publishing/edit_static_content.do";
   postHtmlDocNou(url,"set",nume);
 }
}
 //
 function addOption(cbo,value,txt) {
  var op = document.createElement("option");
  op.setAttribute("value",value);
  var txtn = document.createTextNode(txt);
  op.appendChild(txtn);
  cbo.appendChild(op);
 }


