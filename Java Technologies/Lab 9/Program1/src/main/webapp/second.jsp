<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%if(session.getAttribute("uname") == null) {%>
	<p>Sorry you cannot access this page as you have not logged in</p>
	<%}else {%>
	<p>Hii <% out.println(session.getAttribute("uname")); %> , Welcome to Second.jsp</p>
	<%} %>
</body>
</html>