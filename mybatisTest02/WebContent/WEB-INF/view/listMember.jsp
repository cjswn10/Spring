<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 목록</h2>
	<hr>
	<table>
		<tr>
			<td>아이디</td>
			<td>이름</td>
		</tr>
		<c:forEach var="m" items="${list}">
		<tr>
			<td>${m.id }</td>
			<td><a href="detailMember.do?id=${m.id }">${m.name }</a></td>
		</tr>
		</c:forEach>
	
	</table>
	<a href="insertMember.do">회원 등록</a>
</body>
</html>