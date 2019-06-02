<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %> 
<%
	Connection conn = null;
	ResultSet  rs = null;	
	PreparedStatement pstmt = null;

	request.setCharacterEncoding("UTF-8");
	String useridx = (String)session.getAttribute("sIdx");

	String mem_pwd = request.getParameter("pwd");
	String mem_name = request.getParameter("name");
	String mem_gender = request.getParameter("gender");
	String mem_zipcode = request.getParameter("zipcode");
	String mem_addr1 = request.getParameter("addr1");
	String mem_addr2 = request.getParameter("addr2");
	String mem_addr3 = request.getParameter("addr3");
	
	try{
		if(useridx == null || useridx.equals("")){
			response.sendRedirect("member1_2.jsp");	// 로그인
		}else{
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
		 
			String sql = "select mem_idx from member1 where mem_idx=? and mem_pwd=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, useridx);
			pstmt.setString(2, mem_pwd);
			rs = pstmt.executeQuery();		
			if(rs.next())
			{
				sql = "update member1 set mem_name=?, mem_gender=?, mem_zipcode=?, mem_addr1=?, mem_addr2=?, mem_addr3=? where mem_idx=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, mem_name);
				pstmt.setString(2, mem_gender);
				pstmt.setString(3, mem_zipcode);
				pstmt.setString(4, mem_addr1);
				pstmt.setString(5, mem_addr2);
				pstmt.setString(6, mem_addr3);
				pstmt.setString(7, useridx);
				pstmt.executeUpdate();
				%>
				<script>
					alert("수정되었습니다.");
					location.href="member1_6.jsp";	
				</script>
				<%
			}else{
				%>
				<script>
					alert("비밀번호가 잘못되었습니다..");
					history.back();	
				</script>
				<%	
			}
		}
	}catch(Exception e){
		
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