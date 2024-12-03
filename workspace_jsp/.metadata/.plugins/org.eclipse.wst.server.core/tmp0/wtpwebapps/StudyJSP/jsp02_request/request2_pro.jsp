<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>request2_pro.jsp</h1>
	<h3>회원가입 데이터 확인</h3>
	<%
	// 이름, 아이디, 비밀번호, 주민번호(jumin1, jumin2), 주소(address1, address2)
	// 이메일(email1, email2), 직업, 성별 파라미터 가져와서 변수에 저장 후 출력
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	
	// 주민번호 앞자리, 뒷자리를 하나의 변수에 결합(구분자 "-" 사용) => DB 등에 저장 시 필요
	String jumin1 = request.getParameter("jumin1");
	String jumin2 = request.getParameter("jumin2");
	String jumin = jumin1 + "-" + jumin2;
	
	// 기본주소(address1)와 상세주소(address2)를 하나의 변수에 결합(구분자 "/" 사용)
	String address1 = request.getParameter("address1");
	String address2 = request.getParameter("address2");
	String address = address1 + "/" + address2;
	
	// email1, email2를 하나의 변수에 결합 (구분자 "@" 사용)
	String email1 = request.getParameter("email1");
	String email2 = request.getParameter("email2");
	String email = email1 + "@" + email2;
	
	String job = request.getParameter("job");
	String gender = request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");
	String motivation = request.getParameter("motivation");
	%>
	
	<table border="1">
		<tr>
			<th>이름</th>
			<td><%=name %></td>
		</tr>
		<tr>
			<th>아이디</th>
			<td><%=id %></td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><%=passwd %></td>
		</tr>
		<tr>
			<th>주민번호</th>
			<td><%=jumin %></td>
		</tr>
		<tr>
			<th>주소</th>
			<td><%=address %></td>
		</tr>
		<tr>
			<th>E-Mail</th>
			<td><%=email %></td>
		</tr>
		<tr>
			<th>직업</th>
			<td><%=job %></td>
		</tr>
		<tr>
			<th>성별</th>
			<td><%=gender %></td>
		</tr>
		<tr>
			<th>취미</th>
			<td>
			<%-- 반복문을 사용하여 취미 출력 --%>
			<%
			for (String h : hobby) {
				out.print(h + "<br>");
			}
			%>
			</td>
		</tr>
		<tr>
			<th>가입동기</th>
			<td><%=motivation %></td>
		</tr>
	</table>

</body>
</html>