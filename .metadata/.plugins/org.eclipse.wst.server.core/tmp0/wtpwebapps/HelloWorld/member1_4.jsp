<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %> 
<%
	String mem_userid = null;
	Connection conn = null;
	ResultSet  rs = null;	
	PreparedStatement pstmt = null;
	
	request.setCharacterEncoding("UTF-8");
	String useridx = (String)session.getAttribute("sIdx");
	String sUserid = (String)session.getAttribute("sUserid");
	String sName = (String)session.getAttribute("sName");
	
	if(useridx == null || useridx.equals("")){
		response.sendRedirect("member1_2.jsp");	// 로그인
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>환영합니다.</title>

</head>
<body>
	<p><%=sUserid%>님 환영합니다.</p>
	<p><a href="board_write.jsp">게시판글쓰기</a> | <a href="board_list.jsp">게시판리스트</a></p>
	<p><a href="member1_5.jsp">로그아웃</a> | <a href="member1_6.jsp">회원정보수정</a></p>
</body>
</html>









