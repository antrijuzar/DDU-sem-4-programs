<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="ob" class="lab8.Program2"></jsp:useBean>
	<jsp:setProperty property="*" name="ob"/>
	The arguments and the operator entered are:<br>
	<jsp:getProperty property="arg1" name="ob"/><br>
	<jsp:getProperty property="arg2" name="ob"/><br>
	<jsp:getProperty property="operator" name="ob"/><br>
	The result is:<br>
	<jsp:getProperty property="result" name="ob"/>
</body>
</html>