    var flash6Installed = false;    // boolean. true if flash 6 is installed
    var flash7Installed = false;    // boolean. true if flash 7 is installed
    var flash8Installed = false;    // boolean. true if flash 8 is installed
    var flash9Installed = false;    // boolean. true if flash 9 is installed
    var minVersion = 6;             // highest version we can actually detect
    var maxVersion = 9;             // highest version we can actually detect
    var actualVersion = 0;          // version the user really has

    var isIE  = (navigator.appVersion.indexOf("MSIE") != -1) ? true : false;    // true if we're on ie
    var isWin = (navigator.appVersion.toLowerCase().indexOf("win") != -1) ? true : false; // true if we're on windows

    if(isIE && isWin){
      document.write('<SCR' + 'IPT LANGUAGE=VBScript\> \n');
      document.write('on error resume next \n');
      document.write('flash2Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.2"))) \n');
      document.write('flash3Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.3"))) \n');
      document.write('flash4Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.4"))) \n');
      document.write('flash5Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.5"))) \n');
      document.write('flash6Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.6"))) \n');
      document.write('flash7Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.7"))) \n');
      document.write('flash8Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.8"))) \n');
      document.write('flash9Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.9"))) \n');
      document.write('<\/SCR' + 'IPT\> \n'); // break up end tag so it doesn't end our script
    }

    function hasFlashVersion(requiredVersion) {
      // If navigator.plugins exists...
      if (navigator.plugins) {
        if (navigator.plugins["Shockwave Flash 2.0"]
            || navigator.plugins["Shockwave Flash"]) {

          var isVersion2 = navigator.plugins["Shockwave Flash 2.0"] ? " 2.0" : "";
          var flashDescription = navigator.plugins["Shockwave Flash" + isVersion2].description;
          var flashVersion = parseInt(flashDescription.substring(16));

          flash6Installed = flashVersion <= 6;
          flash7Installed = flashVersion == 7;
          flash8Installed = flashVersion == 8;
          flash9Installed = flashVersion >= 9;
        }
      }

      for (var i = minVersion; i <= maxVersion; i++) {
        if (eval("flash" + i + "Installed") == true) actualVersion = i;
      }

      if(navigator.userAgent.indexOf("WebTV") != -1) actualVersion = 4;

      if (actualVersion >= requiredVersion) {
           return true;
      } else {
            return false;
      }
    }


   /* var hasRightFlashVersion = false;
    var allowedDiskSpace = false;
    var treeMenuLoaded = false;
    var mainMenuLoaded = false;
    var startedMenus = false; */


    function flashRepository_DoFSCommand(command, args) {
      if (command == "createMainMenu") {
          document.getElementById("mainMenu").innerHTML = '';
          document.getElementById("mainMenu").innerHTML = args;
          mainMenuLoaded = true;
      } else if(command == "createTreeMenu") {
          //alert(args);
          unFormatCode(args,"[delimiter]");
          document.getElementById("treeMenu").innerHTML = htmlFragment;
          createScript(scriptFragment);
          treeMenuLoaded = true;
      } else if(command == "started") {
          startedMenus = true;
      } else if(command == "status") {
          switch(args) {
            case '1':
                        allowedDiskSpace = true;
                        break;
            default :
                        allowedDiskSpace = false;
                        break;
          }
      }
    }



    function sendFlashVariables(menuMain, menuTree) {

        var flashMovie = window.document.flashRepository;

        if(menuMain) {
            flashMovie.SetVariable("/:mainMenuStr",document.getElementById("mainMenu").innerHTML);
        }
        if(menuTree) {
            flashMovie.SetVariable("/:treeMenuStr",document.getElementById("treeMenu").innerHTML);
        }
        flashMovie.GotoFrame(2);
        flashMovie.Play();
    }

    function callFScommand(menuMain,menuTree,nrTries) {
        if(startedMenus) return;
        nrTries--;
        if(nrTries < 1) return;
        sendFlashVariables(menuMain,menuTree);
        setTimeout("callFScommand("+menuMain+","+menuTree+")",300);
    }

    var scriptFragment = "";
    var htmlFragment = "";

    function createScript(scriptText) {
        var script = document.createElement("script");
        script.type = "text/javascript";
        script.text = scriptText;
        document.body.appendChild(script);
        d.openTo(menuIdToOpen);
    }

    function unFormatCode(strCode,delimiter) {
        var strTmp = strCode.split(delimiter);

        scriptFragment = strTmp[1];
        htmlFragment = strTmp[0];
    }

