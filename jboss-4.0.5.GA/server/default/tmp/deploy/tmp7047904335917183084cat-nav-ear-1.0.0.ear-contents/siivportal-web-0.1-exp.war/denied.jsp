<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<script  type="text/javascript">
  var loaded=<%=request.getParameter("x")%>;
  if(window.parent!=null && loaded==null){
    window.parent.location="<%=request.getContextPath()%>/template.jsp?page=denied&x=1";
  }
</script>

<div>
  <p>
    &nbsp;
  </p>
  <p>
    &nbsp;
  </p>
      <p align="center">
      <img src="images/error32.gif" title="Error" align="right"/>
      <b><bean:message key="error.access.denied"/></b>
      </p>
  <p>
    &nbsp;
  </p>
  <p>
    &nbsp;
  </p>
  <p>
    &nbsp;
  </p>
  <p>
    &nbsp;
  </p>
  <p>
    &nbsp;
  </p>
  <p>
    &nbsp;
  </p>
  <p>
    &nbsp;
  </p>
  <p>
    &nbsp;
  </p>  
</div>