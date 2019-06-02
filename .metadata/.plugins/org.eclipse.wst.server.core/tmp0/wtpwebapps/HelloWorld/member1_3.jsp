<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %> 
<%
	Connection conn = null;
	ResultSet  rs = null;	
	PreparedStatement pstmt = null;

	request.setCharacterEncoding("UTF-8");
	String userid = request.getParameter("userid");
	String pwd = request.getParameter("pwd");
	

	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
 
	String sql = "select mem_idx, mem_userid, mem_name from member1 where mem_userid=? and mem_pwd=?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, userid);
	pstmt.setString(2, pwd);
	rs = pstmt.executeQuery();
	
	
	
	if(rs.next())
	{
		try{
			String mem_idx = rs.getString("mem_idx");
			String mem_userid = rs.getString("mem_userid");
			String mem_name = rs.getString("mem_name");
			session.setAttribute("sIdx", mem_idx);
			session.setAttribute("sUserid", mem_userid);
			session.setAttribute("sName", mem_name);
%>
		<script>
			alert("로그인 되었습니다.");
			location.href="member1_4.jsp";
		</script>
<%
		}catch(Exception e){
			e.printStackTrace();
		}
	}else{
%>
		<script>
			alert("아이디 또는 패스워드가 잘못되었습니다.");
			history.back();
		</script>
<%
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
</body>
</html>