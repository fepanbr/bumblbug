<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out객체</title>
</head>
<body>
	버퍼 크기 : <%= out.getBufferSize() %><br>
	남은 크기 : <%= out.getRemaining() %><br>
	버퍼 크기 : <%= out.isAutoFlush() %>

</body>
</html>