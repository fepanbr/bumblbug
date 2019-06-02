<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 객체</title>
</head>
<body>
	클라이언트의 Ip 주소 : <%= request.getRemoteAddr() %><br>
	요청정보 프로토콜 = <%=request.getProtocol() %><br>
	요청정보 전송방식= <%=request.getMethod() %><br>
	요청 URL= <%=request.getRequestURL() %><br>
	컨텐츠 경로 = <%=request.getContentType() %><br>
	

</body>
</html>