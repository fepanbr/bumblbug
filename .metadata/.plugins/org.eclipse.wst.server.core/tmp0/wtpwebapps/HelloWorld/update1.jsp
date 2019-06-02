<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<%
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	request.setCharacterEncoding("UTF-8");
	String email = request.getParameter("email");
%>
<%
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");

		String sql = "select mem_email from member ";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		ArrayList<String> a =new ArrayList<>();

		while (rs.next()) {
			String mem_email = rs.getString("mem_email");
			if(mem_email.contains(email)){
				a.add(mem_email);
				
				
			}else{
				
			}
		}
		out.println(a);
		
	} catch (Exception e) {
		e.printStackTrace();
		out.println("member1 테이블 호출에 실패했습니다.");
	} finally {
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException sqle) {
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException sqle) {
			}
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException sqle) {
			}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>