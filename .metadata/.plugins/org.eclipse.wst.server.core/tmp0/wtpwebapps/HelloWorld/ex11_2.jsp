<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	request.setCharacterEncoding("UTF-8");
    	
    	String userid = (String)session.getAttribute("sId");
   	 	String name = (String)session.getAttribute("sName");
    	String gender = (String)session.getAttribute("sGender");
    	
    	
    	Cookie[] cookies = request.getCookies();
    	int vcnt = Integer.parseInt(cookies[2].getValue());
    	vcnt+= 1;
    	Cookie cookies2 = new Cookie("cVisitCnt", Integer.toString(vcnt));
    	response.addCookie(cookies2);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>환영합니다 XXX님</h2>


</body>
</html>