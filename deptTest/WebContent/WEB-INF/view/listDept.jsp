<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>부서목록</h2>
<hr>
	<table border="1" width="60%">
		<tr>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>부서위치</td>
		</tr>
	
	<c:forEach items="${list}" var="d">
		<tr>
			<td>${d.dno}</td>
			<td>${d.dname}</td>
			<td>${d.dloc}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>