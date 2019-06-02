<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%
	request.setCharacterEncoding("UTF-8");
	String useridx = (String)session.getAttribute("sIdx");
	String sUserid = (String)session.getAttribute("sUserid");
	String sName = (String)session.getAttribute("sName");
	String b_idx = request.getParameter("b_idx");
	
	if(useridx == null || useridx.equals("")){
		response.sendRedirect("member1_2.jsp");
	}
	
	Connection conn = null;
	ResultSet  rs = null;	
	PreparedStatement pstmt = null;
	
	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
 
	String sql = "UPDATE member SET Img=? where mem_idx='15'";
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
<title>글수정</title>
</head>
<body>
	<form name="bForm" method="post" action="board_editP.jsp">
	<input type="hidden" name="b_idx" value="<%=b_idx%>">
	<p>이름 : <%=sName %></p>
	<p><label>제목 : <input type="text" name="b_title" value="<%=b_title%>"></label></p>
	<p><label>이메일 : <input type="text" name="b_email" value="<%=b_email%>"></label></p>
	<p>내용</p>
	<p><textarea name="b_content" cols="50" rows="5"><%=b_content %></textarea></p>	
	<p><label>파일 : <input type="file" name="b_file"></label></p>	
	<p><input type="submit" value="글수정완료"></p>
	</form>
</body>
</html>
<%
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
%>







