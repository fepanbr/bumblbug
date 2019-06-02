<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %> 
<%
	Connection conn = null;
	ResultSet  rs = null;	
	PreparedStatement pstmt = null;

	request.setCharacterEncoding("UTF-8");
	String b_idx = request.getParameter("b_idx");

	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
 
	String sql = "update board1 set b_hit = b_hit + 1 where b_idx = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, b_idx);
	pstmt.executeUpdate();
	
	sql = "select b_idx, b_useridx, b_name, b_title, b_email, b_content, b_file, b_regdate, b_hit, b_ip from board1 where b_idx=?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, b_idx);
	rs = pstmt.executeQuery();
	
	
	if(rs.next())
	{
		try{
			String b_useridx 	= rs.getString("b_useridx");
			String b_name 		= rs.getString("b_name");
			String b_title 		= rs.getString("b_title");
			String b_email 		= rs.getString("b_email");
			String b_content 	= rs.getString("b_content");
			String b_file 		= rs.getString("b_file");
			String b_regdate 	= rs.getString("b_regdate");
			String b_hit 		= rs.getString("b_hit");
			String b_ip 		= rs.getString("b_ip");
			
%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글보기</title>
</head>
<body>
	<h2>글보기</h2>
	<p>이름 : <%=b_name%> (<%=b_ip %>)</p>
	<p>제목 : <%=b_title %></p>
	<p>조회수 : <%=b_hit %></p>
	<p>이메일 : <%=b_email %></p>
	<p><%=b_content %></p>
	<p>첨부파일 : <%=b_file %></p>
	<p><a href="board_list.jsp">리스트</a> | <a href="board_edit.jsp">글수정</a> | <a href="board_delete.jsp">글삭제</a></p>
		
</body>
</html>
<%
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>