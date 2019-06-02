<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	request.setCharacterEncoding("UTF-8");
    	String city = request.getParameter("city");
    	String zipcode = request.getParameter("zipcode");
    	
    	out.println("get 방식으로 전달된 메세지 입니다.");
    	out.println("city: "+city);
    	out.println("zipcode: "+ zipcode);
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