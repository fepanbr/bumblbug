<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%
Connection conn = null;

try{
	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
	if(conn == null){
		throw new Exception("데이터베이스에 연결 할 수 없습니다.<br>");
	}
	out.println("데이터베이스에 연결 되었습니다.");
}catch(Exception e){
	out.println("데이터베이스에 연결 할 수 없습니다.<br>");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MariaDB연결</title>
</head>
<body>
</body>
</html>