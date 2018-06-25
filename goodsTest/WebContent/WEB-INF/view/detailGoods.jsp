<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
				<tr>
					<td>${g.no }</td>
					<td>${g.item }</td>
					<td>${g.price }</td>
					<td>${g.qty }</td>
					<td><img src="img/${g.fname }" width="100"></td>
				</tr>
		</tbody>
	</table>
	<a href="updateGoods.do?no=${g.no }">수정</a>&nbsp;&nbsp;
	<a href="deleteGoods.do?no=${g.no }">삭제</a>
</body>
</html>