<%@page import="com.db.ConnDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Connection conn =null;
	ConnDB ddb = new ConnDB();
	conn = ddb.Dbcon();
	System.out.println(conn+"<-- 객체가 생성되었습니다.");



%>

</body>
</html>