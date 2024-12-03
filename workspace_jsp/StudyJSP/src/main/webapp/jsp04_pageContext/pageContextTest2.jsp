<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>pageContextTest2.jsp</h1>
	<%
	String id = request.getParameter("id");
	out.print("<h3>아이디: " + id + "</h3");
	%>
</body>
</html>