<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상품 등록</h2>
	<form action="insertGoods.do" method="post">
		상품번호 : <input type="text" name="no"><br>
		상품명 : <input type="text" name="item"><br>
		가 격 : <input type="text" name="price"><br>
		수 량 : <input type="text" name="qty"><br>
		이미지 : <input type="text" name="fname"><br>
		<input type="submit" value="등록">&nbsp;&nbsp;
		<input type="reset" value="취소">
	</form>
</body>
</html>