<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	session.setMaxInactiveInterval(180);
	long lastAccessTime = session.getLastAccessedTime();
	out.println(lastAccessTime);
	String userid = null;
	
	try{
		userid = (String)session.getAttribute("id");
		out.println("현재 접속된 아이디는 : "+userid + "입니다");
	}catch(Exception e){
		
	}

%>

</body>
</html>