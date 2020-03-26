<%@ page import="ro.uti.apmc.sys.util.AdmMenuConstants"%>
 <%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Aug 8, 2005
  Time: 3:26:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
   <div>
     <script type="text/javascript">
       d = new dTree('d');
       var root = 'Root-nod';
       d.add(1,-1,'<bean:message bundle="portal" key="portal.menu.harta_site"/>','javascript: alegeTip(1,root)');
       <logic:iterate id="elementLista" name="<%= AdmMenuConstants.KEY_LIST_MENU_TREE %>">
         var den_<bean:write name="elementLista" property="id_menu_entry"/> = '<bean:write name="elementLista" property="traducere"/>'
         d.add(<bean:write name="elementLista" property="id_menu_entry"/>,<bean:write name="elementLista" property="fk_menu_entry"/>,'<bean:write name="elementLista" property="traducere"/>','javascript: alegeTip(<bean:write name="elementLista" property="id_menu_entry"/>,den_<bean:write name="elementLista" property="id_menu_entry"/>)');
       </logic:iterate>
       document.write(d);
     </script>
   </div>

