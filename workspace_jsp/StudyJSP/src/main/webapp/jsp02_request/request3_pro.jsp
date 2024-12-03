<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>request3_pro.jsp</h1>
	<h3>로그인 처리</h3>
	<%-- 폼 파라미터(아이디, 패스워드, 아이디 기억)값 가져와서 변수에 저장 및 출력하기 --%>
	<%
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String rememberId = request.getParameter("rememberId");
	
// 	out.print("<h3>아이디: " + id + "</h3>");
// 	out.print("<h3>패스워드: " + passwd + "</h3>");
// 	out.print("<h3>아이디 기억: " + rememberId + "</h3>");
	%>
	<h3>아이디: <%=id %></h3>
	<h3>패스워드: <%=passwd %></h3>
	<h3>아이디 기억: <%=rememberId %></h3>
	
	<%
	/*
	[ 자바 코드를 사용하여 아이디와 패스워드를 판별하여 로그인 성공 여부 판별 ]
	- 데이터베이스에 지정된 아이디를 "admin", 패스워드를 "1234" 라고 가정하고 변수에 미리 저장
	- 폼을 통해 입력받은 아이디와 패스워드를 가각 데이터베이스의 데이터와 비교하여
	  둘 다 일치할 경우 "로그인 성공!", 아니면 "로그인 실패!" 출력
	*/
	String dbId = "admin";
	String dbPasswd = "1234";
	
	if (id.equals(dbId) && passwd.equals(dbPasswd)) {
		out.print("<h3>로그인 성공!</h3>");
	} else {
// 		out.print("<h3>로그인 실패!</h3>");
		// ------------------------------------------
		// 자바스크립트를 활용하여 "로그인 실패!" 알림창 출력 후 이전 페이지 돌아가기 처리
		// 1) out.print() 메서드에 자바스크립트 코드를 "문자열" 형태로 전달
// 		out.print("<script>");
// 		out.print("alert('로그인 실패!');");
// 		out.print("history.back();");
// 		out.print("</script>");
	%>
	<%-- 이 영역은 HTML 태그 영역 이므로 자바스크립트 태그 작성 가능 --%>
	<script type="text/javascript">
		alert('로그인 실패!');
		history.back();
	</script>
	<% 
	}
	%>

</body>
</html>