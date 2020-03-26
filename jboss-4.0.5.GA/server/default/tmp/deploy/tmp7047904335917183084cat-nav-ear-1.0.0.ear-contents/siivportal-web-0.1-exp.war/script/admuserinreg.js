var baza_url="/siiv/sys/admuserinreg.do?method=";
//*****Start definire obiect Xreq*****//
//constructorul obiectului Xreq
function  Xreq(url,procesare,parametri) {
 this.xmlhttp=null;
 this.procesare = procesare;
 this.loadXMLDoc(url,parametri);
}
//
Xreq.prototype.loadXMLDoc=function(url,parametri) {
  if (window.XMLHttpRequest){
    this.xmlhttp=new XMLHttpRequest();
  } else if (window.ActiveXObject){
    this.xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
  if (this.xmlhttp){
      var xreq = this;
      this.xmlhttp.onreadystatechange=function(){
        xreq.onReadyState();
      }
      this.xmlhttp.open("GET",url,true);
      this.xmlhttp.send(parametri);
  }
}
//
Xreq.prototype.onReadyState = function() {
    var xmlhttp = this.xmlhttp;
    //alert(xmlhttp);
    var ready = xmlhttp.readyState;
    //alert(ready);
    if (ready==4){
      var httpStatus = xmlhttp.status;
      //alert(httpStatus);
      if (httpStatus==200) {
        var procesare = "this."+this.procesare+"()";
        eval(procesare);
      }else {
        alert("Problem retrieving XML data");
      }
    }
}
//metoda particulara pentru admuserinreg
//ordinea este:
//den_firma,cui,tara,den_oras,adresa principala,telefon,fax,email,site_web,statut
Xreq.prototype.setFirma = function() {
   var xmlhttp = this.xmlhttp;
   var msg = xmlhttp.responseText.split("|");
   if (msg.length < 10) return;
   for (i=0;i<10;i++) {
     var t = document.getElementById(i);
     var th = document.getElementById("t"+i);
     while(t.hasChildNodes()) {
       t.removeChild(t.firstChild);
       th.value = "";
     }
     th.value = msg[i];
     var txtNod = document.createTextNode(msg[i]);
     t.appendChild(txtNod); 
   }
}
//ordinea este:
//0-den_firma,1-cui,2-tara,3-den_oras,4-adresa principala,5-telefon,6-fax,7-email,
//8-site_web,9-statut,10-fk_oras,11-fk_tara,12-fk_statut_firma
Xreq.prototype.setFirmaLaInreg = function() {
    var xmlhttp = this.xmlhttp;
    //alert(xmlhttp.responseText);
    var msg = xmlhttp.responseText.split("|");
    if (msg.length != 13) return;
    document.getElementById("t0").value = msg[0].trim();
    document.getElementById("t1").value = msg[1].trim();
    document.getElementById("t4").value = msg[4].trim();
    document.getElementById("t5").value = msg[5].trim();
    document.getElementById("t6").value = msg[6].trim();
    document.getElementById("t7").value = msg[7].trim();
    document.getElementById("t8").value = msg[8].trim();
    setComponentValue("values.fk_tara",msg[11].trim());
    setComponentValue("values.fk_statut_firma",msg[12].trim());
    setComponentValue("fk_oras_1",msg[10].trim());
    setComponentValue("fk_oras_2",msg[10].trim());

}

//*****End definire obiect Xreq*****//


//metoda apelata la selectarea unei firme in prelucrare
function onChange_fk_firma() {
 var method = "getFirma";
 var fk_firma = document.getElementById("values.fk_firma").value;
 if (fk_firma == null || typeof fk_firma == "undefined" || fk_firma == "" ) {
   resetInfoFirma();
   return;
 }
 var url = baza_url + method+"&fk_firma="+fk_firma;
 var procesare="setFirma";
 new Xreq(url,procesare);
}
//metoda apelata la selectarea unei firme la solicitare de inregistrare
function on_values_fk_firma_change() {
  //alert("start");
  var method = "getFirma";
  var fk_firma = document.getElementById("values.fk_firma").value;
  if (fk_firma == null || typeof fk_firma == "undefined" || fk_firma == "" ) {
    return;
  }
  var url = baza_url + method+"&fk_firma="+fk_firma;
  //alert(url);
  var procesare="setFirmaLaInreg";
  new Xreq(url,procesare);
}
//daca nu se selecteaza nici o firma
//se reseteaza info despre firma selectata
function resetInfoFirma() {
   for (i=0;i<10;i++) {
     var t = document.getElementById(i);
     var th = document.getElementById("t"+i);
     while(t.hasChildNodes()) {
       t.removeChild(t.firstChild);
       th.value = "";
     }
     var txtNod = document.createTextNode("");
     t.appendChild(txtNod);
   }
}
