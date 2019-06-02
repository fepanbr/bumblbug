<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "javax.naming.Context" %>
<%@ page import = "javax.naming.InitialContext" %>
<%@ page import = "javax.sql.DataSource" %>
<%@ page import = "java.sql.*" %>
<%
DataSource dataSource;
Connection conn = null;

try{
	// 컨넥션 풀 이용
	Context context = new InitialContext();
	dataSource = (DataSource)context.lookup("java:comp/env/jdbc_mariadb");
	conn = dataSource.getConnection();
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