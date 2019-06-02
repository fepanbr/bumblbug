<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Enumeration<String> paramNames = application.getInitParameterNames();
	while(paramNames.hasMoreElements()){
		String paramName = paramNames.nextElement();
		String paramValue = application.getInitParameter(paramName);
		
		System.out.println(paramName+ "=" +paramValue);
	}


%>

</body>
</html>