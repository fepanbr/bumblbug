<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%
    session.setAttribute("test", "el 예제");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> EL 객체 사용 예제 </title>
</head>
<body>
<form action="el2_1.jsp" method="post">
    <table border="1">
    <tr>
        <td>이름 : </td>
        <td><input type="text" name="name" value="김사과"></td>
    </tr>
    <tr>
        <td colspan="2" align="center"><input type="submit" value="입력"></td>
    </tr>        
    </table>
</form>
</body>
</html>
