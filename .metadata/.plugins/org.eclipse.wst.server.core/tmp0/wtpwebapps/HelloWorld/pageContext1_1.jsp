<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext객체</title>
</head>
<body>
	<h1>pagecontext 객체 테스트 페이지 입니다.</h1>
	<h2>include 와 foward의 차이점을 확인해 보세요.</h2>
	<%
		String type = request.getParameter("type");
		if(type.equals("include")){
			pageContext.include("pageContext1_2.jsp");
		}else if(type.equals("forward")){
			pageContext.forward("pageContext1_2.jsp");
		}
	
	
	%>

</body>
</html>