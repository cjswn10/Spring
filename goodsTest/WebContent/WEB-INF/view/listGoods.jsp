<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table, tr, td{
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
				<th>상품번호</th>		
				<th>상품명</th>		
				<th>가 격</th>		
				<th>수 량</th>		
				<th>이미지</th>		
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="g">
				<tr>
					<td>${g.no }</td>
					<td><a href="detailGoods.do?no=${g.no}">${g.item }</a></td>
					<td>${g.price }</td>
					<td>${g.qty }</td>
					<td><img src="img/${g.fname }" width="100"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="insertGoods.do">상품등록</a>
</body>
</html>