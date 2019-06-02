<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request객체</title>
</head>
<body>
<form action="request1_1.jsp" method="post">
   <p><label>이름 <input type="text" name="name"></label></p>
   <p><label>남자 <input type="radio" name="gender" value="1" checked></label>
   <label>여자 <input type="radio" name="gender" value="2"></label></p>
   <p><label>휴대폰번호 <input type="text" name="hp"></label></p>
   <p>취미<label>등산 <input type="checkbox" name="hobby" value="등산"></label>
   <label>게임 <input type="checkbox" name="hobby" value="게임"></label>
   <label>드라이브 <input type="checkbox" name="hobby" value="드라이브"></label>
   <label>영화감상 <input type="checkbox" name="hobby" value="영화감상"></label>
   <p><input type="submit" value="전송"></p>
</form>
</body>
</html>