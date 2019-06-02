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
	long lastAccessTime = session.getLastAccessedTime();
	out.println(lastAccessTime);

%>

</body>
</html>