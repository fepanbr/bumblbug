<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %> 
<%
	Connection conn = null;
	ResultSet  rs = null;	
	PreparedStatement pstmt = null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>

</head>
<body>
	<table width="800" align="center" border="1">
<%
try{
	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
 
	String sql = "select mem_idx, mem_userid, mem_name, mem_gender, mem_addr1, mem_registdate from member1 order by mem_idx desc";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
	
		while(rs.next()){
			String mem_idx = rs.getString("mem_idx");
			String mem_userid = rs.getString("mem_userid");
			String mem_name = rs.getString("mem_name");
			String mem_gender = rs.getString("mem_gender");
			String mem_addr1 = rs.getString("mem_addr1");
			String mem_registdate = rs.getString("mem_registdate");
%>
	<tr>
	<td width="50"><%=mem_idx%></td>
	<td width="100"><%=mem_userid%></td>
	<td width="100"><%=mem_name%></td>
	<td width="100"><%=mem_gender%></td>
	<td width="350"><%=mem_addr1%></td>
	<td width="100"><%=mem_registdate%></td>
	</tr>
<%
	}
}catch(Exception e){                                                  
e.printStackTrace();
	out.println("member1 테이블 호출에 실패했습니다.");
}finally{                                                           
	if(rs != null) try{rs.close();}catch(SQLException sqle){}            
	if(pstmt != null) try{pstmt.close();}catch(SQLException sqle){}  
	if(conn != null) try{conn.close();}catch(SQLException sqle){}
}
%>
</table>
</body>
</html>