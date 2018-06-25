<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
table, th, td{
	border: 3px solid silver;
	border-collapse: collapse;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
		<thead>
			<tr>
				<th>글번호</th>		
				<th>글제목</th>		
				<th>작성자</th>		
				<th>작성일</th>		
				<th>조회수</th>		
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="b">
				<tr>
					<td>${b.no }</td>
					<td><a href="detailBoard.do?no=${b.no}">${b.title}</a></td>
					<td>${b.writer}</td>
					<td>${b.regdate}</td>
					<td>${b.hit }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="insertBoard.do">게시물등록</a>
</body>
</html>