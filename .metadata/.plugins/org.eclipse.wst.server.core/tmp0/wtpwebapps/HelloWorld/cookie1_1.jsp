<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Cookie[] cookies = request.getCookies();
    	out.println("현재 설정된 쿠키의 개수 : "+ cookies.length);
    	for(int i=0 ; i<cookies.length; i++){
    		out.println(i + "번째 쿠키 이름: "+ cookies[i].getName());
    		out.println(i + "번째 쿠키에 설정된 값: "+ cookies[i].getValue());
    		out.println("<br>");
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