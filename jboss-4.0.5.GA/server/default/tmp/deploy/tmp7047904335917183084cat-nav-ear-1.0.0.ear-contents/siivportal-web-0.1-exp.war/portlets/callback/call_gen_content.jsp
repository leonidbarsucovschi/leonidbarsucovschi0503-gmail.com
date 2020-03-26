<%
  String includePage = request.getParameter("page");
  Exception ex=null;
  try {
      if (includePage != null) {
          includePage+=".jsp";
          includePage="/"+includePage;
%>
<jsp:include page="<%=includePage%>" flush="true" />
<%        } else {
          ex= new Exception("Page not found: 404");
      }
  } catch (Exception e) {
    ex=e;
}
if(ex!=null){%>
<jsp:include page="/missing.jsp" flush="true"/>
<%
    ex.printStackTrace();
}
%>
