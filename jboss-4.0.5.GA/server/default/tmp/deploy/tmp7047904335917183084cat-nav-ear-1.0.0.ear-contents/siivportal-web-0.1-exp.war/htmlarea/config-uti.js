function getConfig() {
 var config = new HTMLArea.Config();
 config.toolbar = [
  [ "fontname", "space",
    "fontsize", "space",
    "formatblock", "space",
    "bold", "italic", "underline", "separator",
    "subscript", "superscript", "separator",
    "copy", "cut", "paste", "undo", "redo" ],
		
  [ "justifyleft", "justifycenter", "justifyright", "justifyfull", "separator",
    "insertorderedlist", "insertunorderedlist", "separator",
    "forecolor", "hilitecolor", "separator",
    "inserthorizontalrule", "createlink", "insertimage", "inserttable", "htmlmode", "separator"]
 ];
 return config;
}