<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>test4_main.jsp</h1>
	<form action="asdasd.test" method="get">
		<input type="submit" value="요청 (GET)">
	</form>
	<form action="qwer.test" method="post">
		<input type="submit" value="요청 (POST)">
	</form>
	<hr>
	
	<form action="/aaa.test" method="get">
		<input type="submit" value="/aaa.test 요청 (GET)">
	</form>
	
	<form action="/StudyJSP/asdasd/aaa.test" method="get">
		<input type="submit" value="/StudyJSP/asdasd/aaa.test 요청 (GET)">
	</form>
	<form action="${pageContext.request.contextPath}/aaa.test" method="get">
		<input type="submit" value="EL/aaa.test 요청 (GET)">
	</form>

</body>
</html>