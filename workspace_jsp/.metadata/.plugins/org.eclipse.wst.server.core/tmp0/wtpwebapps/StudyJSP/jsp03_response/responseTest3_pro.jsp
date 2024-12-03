<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>responseTest3_pro.jsp</h1>
	<h3>로그인 처리</h3>
	<%
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	
	String dbId = "admin";
	String dbPasswd = "1234";
	
	// 아이디와 패스워드 문자열에 대한 비교 수행
	// => 일치할 경우 "responseTest3_result1.jsp" 페이지로 이동(리다이렉트)
	//    불일치할 경우 "responseTest3_result2.jsp" 페이지로 이동(리다이렉트)
	if (id.equals(dbId) && passwd.equals(dbPasswd)) {
		out.print("<script>alert('로그인 성공!')</script>");
		response.sendRedirect("responseTest3_result1.jsp");
	} else {
		out.print("<script>alert('로그인 실패!')</script>");
		response.sendRedirect("responseTest3_result2.jsp");
	}
	%>


</body>
</html>