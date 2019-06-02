<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String userid = request.getParameter("userid");
    	String pwd = request.getParameter("pwd");
		request.setCharacterEncoding("UTF-8");
		
		if(userid.equals("apple")&& pwd.equals("1234"))
		{
			//session.setAttribute("id". rs["id"]);
			session.setAttribute("id", userid);
			response.sendRedirect("session1_2.jsp");
			
		}else{
			response.sendRedirect("session1.jsp");
		}
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 객체</title>
</head>
<body>
	아이디 : <%=userid %><br>
	패스워드 : <%=pwd %><br>
</body>
</html>