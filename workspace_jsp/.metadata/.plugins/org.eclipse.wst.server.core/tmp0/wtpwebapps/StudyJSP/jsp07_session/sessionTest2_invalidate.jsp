<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>sessionTest2_invalidate.jsp</h1>
	<%
	session.invalidate();
	
	out.print("세션 아이디: " + session.getId());
	%>
	<h3>세션 초기화 완료</h3>
	<h3><a href="sessionTest2_get.jsp">세션값 확인</a></h3>
	<%-- 세션 초기화 후 새로운 요청(ex. 다른 페이지 이동 등)시 새로운 세션 생성됨 --%>
	
	
	
	
	
	
</body>
</html>