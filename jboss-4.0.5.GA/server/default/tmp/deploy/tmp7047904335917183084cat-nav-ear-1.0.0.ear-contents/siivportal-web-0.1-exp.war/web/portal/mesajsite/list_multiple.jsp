<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:form action="mesajsite.do" >
     <input type="hidden" name="method">
      <html:hidden property="checkedString" name="<%=Constants.TBL_MESAJ_SITE_KEY%>" />
<table cellSpacing=0 cellPadding=0 width="100%" border=0>
  <tr>
      <TD class="page-title-header" >
        <logic:present name="multiple" scope="request" >
            <logic:equal value="delete" name="multiple" scope="request" >
                <bean:message bundle="mesajsite" key="mesaj_site.title.delete_multiple"/>
            </logic:equal>
            <logic:equal value="deleteArh" name="multiple" scope="request" >
                <bean:message bundle="mesajsite" key="mesaj_site.title.delete_multiple_arh"/>
            </logic:equal>
        </logic:present>
      </TD>
       <td valign="middle" nowrap align="right">
           <logic:present name="multiple" scope="request" >
            <logic:equal value="delete" name="multiple" scope="request" >
                <input type="image" onClick="document.<%=Constants.TBL_MESAJ_SITE_KEY%>.method.value='multipleDelete';document.<%=Constants.TBL_MESAJ_SITE_KEY%>.submit()" name="del_btn" src="images/sterge.gif" onMouseOut="this.src='images/sterge.gif'" onMouseOver="this.src='images/sterge.gif'" border="0"   title='<bean:message  bundle="mesajsite" key="mesaj_site.button.delete"/>' />
                <input type="image" onClick="document.<%=Constants.TBL_MESAJ_SITE_KEY%>.method.value='list';document.<%=Constants.TBL_MESAJ_SITE_KEY%>.submit()" name="a_btn" src="images/anuleaza.gif" onMouseOut="this.src='images/anuleaza.gif'" onMouseOver="this.src='images/anuleaza.gif'" border="0"   title='<bean:message  bundle="mesajsite" key="mesaj_site.button.anuleaza"/>' />
            </logic:equal>

            <logic:equal value="deleteArh" name="multiple" scope="request" >
                <input type="image" onClick="document.<%=Constants.TBL_MESAJ_SITE_KEY%>.method.value='multipleDeleteArh';document.<%=Constants.TBL_MESAJ_SITE_KEY%>.submit()" name="del_btn" src="images/sterge.gif" onMouseOut="this.src='images/sterge.gif'" onMouseOver="this.src='images/sterge.gif'" border="0"   title='<bean:message  bundle="mesajsite" key="mesaj_site.button.delete"/>' />
                <input type="image" onClick="document.<%=Constants.TBL_MESAJ_SITE_KEY%>.method.value='listArchive';document.<%=Constants.TBL_MESAJ_SITE_KEY%>.submit()" name="a_btn" src="images/anuleaza.gif" onMouseOut="this.src='images/anuleaza.gif'" onMouseOver="this.src='images/anuleaza.gif'" border="0"   title='<bean:message  bundle="mesajsite" key="mesaj_site.button.anuleaza"/>' />
            </logic:equal>
        </logic:present>
       </td>
  </tr>
</html:form>
  <tr>
      <td class=smallbodylite colspan="2">
        &nbsp;
      </td>
  </tr>
  <tr>
    <td colspan="2">
        <logic:present name="multiple" scope="request" >
            <logic:equal value="delete" name="multiple" scope="request" >
               <div>
                  <display:table list="<%= Constants.TBL_MESAJ_SITE_KEY_LIST %>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="portal/mesajsite.do" decorator="ro.uti.waf.taglib.table.DefaultTableDecorator">
                    <display:column property="userIcon" bundle="mesajsite" title="mesaj_site.prompt.tip_utilizator" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>

                    <display:column property="titlu_mesaj" bundle="mesajsite" title="mesaj_site.prompt.titlu_mesaj" sortable="titlu_mesaj" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
                    <display:column property="data_introducere" bundle="mesajsite" title="mesaj_site.prompt.data_introducere" sortable="data_introducere" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
                    <display:column property="data_arhivare" bundle="mesajsite" title="mesaj_site.prompt.data_arhivare" sortable="data_arhivare" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
                    <display:column property="nume_prenume" bundle="mesajsite" title="mesaj_site.prompt.nume_prenume" sortable="nume" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
                  </display:table>
                </div>
            </logic:equal>
            <logic:equal value="deleteArh" name="multiple" scope="request" >
                <div>
                  <display:table list="<%= Constants.TBL_MESAJ_SITE_KEY_LIST %>" crt="yes" bundle="app" style="report" pagesize="50" method="listArchive" requestURI="portal/mesajsite.do" decorator="ro.uti.waf.taglib.table.DefaultTableDecorator">
                    <display:column property="userIcon" bundle="mesajsite" title="mesaj_site.prompt.tip_utilizator" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
                    
                    <display:column property="titlu_mesaj" bundle="mesajsite" title="mesaj_site.prompt.titlu_mesaj" sortable="titlu_mesaj" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
                    <display:column property="data_introducere" bundle="mesajsite" title="mesaj_site.prompt.data_introducere" sortable="data_introducere" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
                    <display:column property="data_arhivare" bundle="mesajsite" title="mesaj_site.prompt.data_arhivare" sortable="data_arhivare" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
                    <display:column property="nume_prenume" bundle="mesajsite" title="mesaj_site.prompt.nume_prenume" sortable="nume" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
                  </display:table>
                </div>
            </logic:equal>
        </logic:present>

     </td>
   </tr>
  <tr>
      <td class=smallbodylite colspan="2">
        &nbsp;
      </td>
  </tr>
  <%-- <tr>
       <td width="45%" align="right">
           <logic:present name="multiple" scope="request" >
               <logic:equal value="delete" name="multiple" scope="request" >
                   <html:form action="mesajsite.do" >
                      <input type="hidden" name="method" value="multipleDelete"/>
                      <html:hidden property="checkedString" name="<%=Constants.TBL_MESAJ_SITE_KEY%>" />

                      <html:submit styleClass="btn-generic">
                           <bean:message bundle="mesajsite" key="mesaj_site.button.delete"/>
                      </html:submit>

                   </html:form>
               </logic:equal>
               <logic:equal value="deleteArh" name="multiple" scope="request" >
                   <html:form action="mesajsite.do" >
                      <input type="hidden" name="method" value="multipleDeleteArh"/>
                      <html:hidden property="checkedString" name="<%=Constants.TBL_MESAJ_SITE_KEY%>" />

                      <html:submit styleClass="btn-generic">
                           <bean:message bundle="mesajsite" key="mesaj_site.button.delete"/>
                      </html:submit>

                   </html:form>
               </logic:equal>
           </logic:present>
       </td>
       <td class=smallbodylite >
        &nbsp;
      </td>
       <td>
           <logic:present name="multiple" scope="request" >
               <logic:equal value="delete" name="multiple" scope="request" >
                   <html:form action="mesajsite.do" >
                      <input type="hidden" name="method" value="list"/>

                      <html:submit styleClass="btn-generic">
                           <bean:message bundle="mesajsite" key="mesaj_site.button.anuleaza"/>
                      </html:submit>

                   </html:form>
               </logic:equal>
               <logic:equal value="deleteArh" name="multiple" scope="request" >
                   <html:form action="mesajsite.do" >
                      <input type="hidden" name="method" value="listArchive"/>

                      <html:submit styleClass="btn-generic">
                           <bean:message bundle="mesajsite" key="mesaj_site.button.anuleaza"/>
                      </html:submit>

                   </html:form>
               </logic:equal>
           </logic:present>
       </td>
   </tr>--%>
</table>