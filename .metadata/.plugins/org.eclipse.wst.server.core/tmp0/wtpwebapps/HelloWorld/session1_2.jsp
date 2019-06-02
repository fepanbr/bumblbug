<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String userid = "";
    	try{
    		userid = (String)session.getAttribute("id");
        	if(userid ==null ||userid.equals("") ){
        		response.sendRedirect("session1.jsp");
        	}
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 객체</title>
</head>
<body>
	<p>로그인 되었습니다.</p>
	<p>환영합니다 <%=userid %>님</p>
	<p><a href="session1_logout.jsp">ffff</p>
</body>
</html>