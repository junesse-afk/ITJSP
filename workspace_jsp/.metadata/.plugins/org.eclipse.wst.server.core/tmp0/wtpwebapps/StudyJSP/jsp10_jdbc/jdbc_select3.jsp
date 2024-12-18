<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>학생 목록 조회</h1>
	<%-- StudentDTO 객체 복수개를 관리하는 List 객체를 request 객체에 저장했을 경우 --%>
	<%-- 1) request 객체에 저장된 studentList 객체의 각 StudentDTO 객체에 접근 시 --%>
	<%--   기본적으로 List 객체는 배열과 동일한 인덱스 접근 방법 사용 ${객체명[인덱스].xxx} --%>
	<%-- 
	<h3>
		<!-- 1번학생 정보 -->
		번호: ${requestScope.studentList[0].idx }<br>
		이름: ${requestScope.studentList[0].name }<br>
		<hr>
		<!-- 2번학생 정보 -->
		번호: ${studentList[1].idx }<br>
		이름: ${studentList[1].name }<br>
		<hr>
		<!-- 3번학생 정보 -->
		번호: ${studentList[2].idx }<br>
		이름: ${studentList[2].name }<br>
		<hr>
		<!-- 4번학생 정보 -->
		번호: ${studentList[3].idx }<br>
		이름: ${studentList[3].name }<br>
		<hr>
	</h3> 
	--%>
	
	<%-- 2) 반복문을 통해 중복 코드 제거를 위해 향상된 for문 역할을 수행하는 c:forEach 태그 활용 --%>
	<%-- 기본문법: <c:forEach var="" items=""></c:forEach> --%>
	<%--
	String[] arr = {"홍길동", "이순신", "강감찬"};
	for (String str : arr) {
		System.out.println(str)
	}
	List<StudentDTO> studentList = [ 1번사람, 2번사람, 3번사람 ];
	for (StudentDTO student : studentList) {
		System.out.println("번호: " + student.getIdx());
		System.out.println("이름: " + student.name);
	}
	 --%>
	 
	<c:forEach var="student" items="${studentList}">
		번호: ${student.idx }<br>
		이름: ${student.name }<br>
		<hr>
	</c:forEach>
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>