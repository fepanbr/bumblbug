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
		String serverInfo = application.getServerInfo();
		int majorVersion = application.getMajorVersion();
		int minorVersion = application.getMinorVersion();
		
		System.out.println("serverInfo = " +serverInfo);
		System.out.println("majorVersion = " +majorVersion);
		System.out.println("minorversion = " +minorVersion);
	%>

</body>
</html>