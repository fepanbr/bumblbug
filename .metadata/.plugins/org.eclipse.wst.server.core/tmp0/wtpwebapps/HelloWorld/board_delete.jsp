<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%
	request.setCharacterEncoding("UTF-8");
	String useridx = (String)session.getAttribute("sIdx");
	String sUserid = (String)session.getAttribute("sUserid");
	String sName = (String)session.getAttribute("sName");
	String b_idx		= request.getParameter("b_idx");
	Connection conn = null;
	PreparedStatement pstmt = null;
	try{
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
		String sql = "delete from board1 where b_useridx=? and b_idx=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, useridx);
		pstmt.setString(2, b_idx);
		pstmt.executeUpdate();
	}catch(Exception e){
		out.println("데이터베이스에 연결 할 수 없습니다.<br>");
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글삭제</title>
</head>
<body>
	<script>
		alert("글삭제 완료되었습니다.");
		location.href="board_list.jsp";	
	</script>
</body>
</html>