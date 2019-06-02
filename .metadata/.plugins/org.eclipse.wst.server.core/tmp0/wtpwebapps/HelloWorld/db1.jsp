<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");

		String sql = "insert into member1 values (?,?,?,?,?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "1");
		pstmt.setString(2, "apple");
		pstmt.setString(3, "김사과");
		pstmt.setString(4, "1111");
		pstmt.setString(5, "여자");
		pstmt.setString(6, "11111");
		pstmt.setString(7, "서울");
		pstmt.setString(8, "서초구");
		pstmt.setString(9, "양재동");
		pstmt.setString(10, "2019-05-14");
		pstmt.executeUpdate();
		out.println("새로운 필드가 추가되었습니다.<br>");		
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