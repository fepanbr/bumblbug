<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>

<%
	request.setCharacterEncoding("UTF-8");

	String userid = request.getParameter("userid");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String zipcode = request.getParameter("zipcode");
	String addr1 = request.getParameter("addr1");
	String addr2 = request.getParameter("addr2");
	String addr3 = request.getParameter("addr3");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");

		String sql = "insert into member1 (mem_userid, mem_name, mem_pwd, mem_gender, mem_zipcode, mem_addr1, mem_addr2, mem_addr3, mem_registdate) values (?,?,password('"+pwd+"'),?,?,?,?,?,now())";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userid);
		pstmt.setString(2, name);
		pstmt.setString(3, gender);
		pstmt.setString(4, zipcode);
		pstmt.setString(5, addr1);
		pstmt.setString(6, addr2);
		pstmt.setString(7, addr3);
		pstmt.executeUpdate();
	}catch(Exception e){
		out.println("데이터베이스에 연결 할 수 없습니다.<br>");
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입완료</title>
</head>
<body>
	<script>
		alert("회원가입이 완료되었습니다.");
		location.href="member1_2.jsp";	
	</script>
</body>
</html>