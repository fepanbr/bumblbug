<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language Test</title>
</head>
<body>
    <h2> EL param2 Test </h2>
    <form action="el7_1.jsp" method="post">
    name : <input type="text" name="name"><p/>
    hobby : 독서  <input type="checkbox" name="hobby" value="독서">
              여행  <input type="checkbox" name="hobby" value="여행">
              등산  <input type="checkbox" name="hobby" value="등산">
              낚시  <input type="checkbox" name="hobby" value="낚시">
              영화보기  <input type="checkbox" name="hobby" value="영화보기">
              운동  <input type="checkbox" name="hobby" value="운동">
              댄스  <input type="checkbox" name="hobby" value="댄스"> <br/>
            <input type="submit" value="전송">    
    </form>
</body>
</html>