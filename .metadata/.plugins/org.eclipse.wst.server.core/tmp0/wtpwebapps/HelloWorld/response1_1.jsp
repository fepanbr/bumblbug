<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String userid = request.getParameter("userid");
    	String pwd = request.getParameter("pwd");
		request.setCharacterEncoding("UTF-8");
		
		if(userid.equals("apple")&& pwd.equals("1234"))
		{response.sendRedirect("response1_2.jsp");
			
		}else{
			response.sendRedirect("response1.jsp");
		}
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : <%=userid %><br>
	패스워드 : <%=pwd %><br>
</body>
</html>