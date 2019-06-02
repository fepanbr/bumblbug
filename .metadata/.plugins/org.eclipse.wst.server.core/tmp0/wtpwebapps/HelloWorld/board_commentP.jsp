<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%
	request.setCharacterEncoding("UTF-8");
	String useridx 			= (String)session.getAttribute("sIdx");
	String c_boardidx 		= request.getParameter("b_idx");	
	String c_content 		= request.getParameter("c_content");
	String b_ip				= request.getRemoteAddr();
	Connection conn = null;
	PreparedStatement pstmt = null;
	try{
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
		String sql = "insert into comment1 (c_useridx, c_boardidx, c_content, c_ip) values (?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, useridx);
		pstmt.setString(2, c_boardidx);
		pstmt.setString(3, c_content);
		pstmt.setString(4, b_ip);
		pstmt.executeUpdate();
	}catch(Exception e){
		out.println("데이터베이스에 연결 할 수 없습니다.<br>");
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글쓰기</title>
</head>
<body>
	<script>
		alert("글쓰기가 완료되었습니다.");
		location.href="board_view.jsp?b_idx=<%=c_boardidx%>";	
	</script>
</body>
</html>