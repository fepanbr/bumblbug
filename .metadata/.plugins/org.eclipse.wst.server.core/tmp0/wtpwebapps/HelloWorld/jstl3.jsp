<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="a" value="${257}" scope="session"/>
	<c:set var="result" value="${a%3}" scope="session"/>

<c:choose>
	<c:when test="${result == 1 || result==2}">
		${a} 는 3의 배수가 아니다.
	</c:when>
	<c:otherwise>
		${a} 는 3의 배수이다.
	</c:otherwise>
</c:choose>

</body>
</html>