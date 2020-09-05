
<%@page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"  errorPage="/WEB-INF/jsp/error.jsp" %>
<html>
<body>
<h2>Hello World!</h2>

<%
    System.err.println(pageContext.getRequest().getLocalPort());
    System.err.println(pageContext.getServletContext().getContextPath());
    System.err.println(pageContext.getServletContext().getServerInfo());
%>

<jsp:forward page="/index"></jsp:forward>

</body>
</html>
