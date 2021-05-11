<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="tmp" value="${param.process}"></c:set>
	<c:set var="strArr" value="${fn:split(tmp,' ')}"></c:set>
	<c:set var="counter" value="0"></c:set>
	<c:forEach var="i" begin="0" end="${fn:length(strArr)-1}">
		<c:set var="counter" value="${counter + 1}"></c:set>
		<c:out value="${strArr[i]}"></c:out><br>
	</c:forEach>
	<b><c:out value="Count:${counter}"></c:out></b>
</body>
</html>