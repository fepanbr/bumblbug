<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%
	request.setCharacterEncoding("UTF-8");
	String useridx = (String)session.getAttribute("sIdx");
	String sUserid = (String)session.getAttribute("sUserid");
	String sName = (String)session.getAttribute("sName");
	String b_idx		= request.getParameter("b_idx");
	String b_title 		= request.getParameter("b_title");
	String b_email 		= request.getParameter("b_email");
	String b_content 	= request.getParameter("b_content");
	String b_ip			= request.getRemoteAddr();
	Connection conn = null;
	PreparedStatement pstmt = null;
	try{
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
		String sql = "update board1 set b_useridx=?, b_name=?, b_title=?, b_email=?, b_content=?, b_file=?, b_ip=? where b_idx=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, useridx);
		pstmt.setString(2, sName);
		pstmt.setString(3, b_title);
		pstmt.setString(4, b_email);
		pstmt.setString(5, b_content);
		pstmt.setString(6, "");	// 파일
		pstmt.setString(7, b_ip);
		pstmt.setString(8, b_idx);
		pstmt.executeUpdate();
	}catch(Exception e){
		out.println("데이터베이스에 연결 할 수 없습니다.<br>");
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<script>
		alert("글변경이 완료되었습니다.");
		location.href="board_view.jsp?b_idx=<%=b_idx%>";	
	</script>
</body>
</html>