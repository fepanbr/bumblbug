<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %> 
<%
	Connection conn = null;
	ResultSet  rs = null;	
	PreparedStatement pstmt = null;

	request.setCharacterEncoding("UTF-8");

	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
 
	String sql = "select b_idx, b_useridx, b_name, b_title, b_email, b_file, b_regdate, b_hit from board1 order by b_idx desc";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
	<center><h2>리스트</h2></center>
	<table align="center" border="1" width="800">
		<tr align="center">
			<td width="80">글번호</td>
			<td width="320">제목</td>
			<td width="80">이름</td>
			<td width="80">조회수</td>
			<td width="190">날짜</td>
			<td width="50">파일</td>
		</tr>
	<%
		while(rs.next()){
			String b_idx 		= rs.getString("b_idx");
			String b_useridx 	= rs.getString("b_useridx");
			String b_name 		= rs.getString("b_name");
			String b_title 		= rs.getString("b_title");
			String b_email 		= rs.getString("b_email");
			String b_regdate	= rs.getString("b_regdate").substring(0, 10);
			//String b_file 	= rs.getString("b_file");
			String b_hit 		= rs.getString("b_hit");
	%>
		<tr>
			<td><%=b_idx%></td>
			<td><a href="board_view.jsp?b_idx=<%=b_idx%>"><%=b_title%></a></td>
			<td><%=b_name%></td>
			<td><%=b_hit%></td>
			<td><%=b_regdate%></td>
			<td></td>
		</tr>
	<%
		}
	%>
	</table>	
</body>
</html>