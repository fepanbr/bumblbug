<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
     request.setCharacterEncoding("utf-8");
     String name = request.getParameter("name");	//기존 방식 
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> EL 객체 사용 테스트 </title>
</head>
<body>

    <h3> ${sessionScope.test} </h3>
    <h3> ${param.name} </h3>
    <h3><%=name%> </h3>
</body>
</html>