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
				<th>글번호</th>		
				<th>글제목</th>		
				<th>작성자</th>	
				<th>작성일</th>		
				<th>조회수</th>		
				<th>내용</th>		
			</tr>
		</thead>
		<tbody>
				<tr>
					<td>${b.no }</td>
					<td>${b.title}</td>
					<td>${b.writer}</td>
					<td>${b.regdate}</td>
					<td>${b.hit }</td>
					<td>${b.content }</td>
				</tr>
		</tbody>
	</table>
</body>
</html>