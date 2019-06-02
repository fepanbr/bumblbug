<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag Example</title>
</head>
<body>
<c:set var="name" value="사공정훈" scope="session"/> 
<c:if test="${name eq '사공정훈'}">
	<p>사공정훈이 맞습니다.</p>
</c:if>

</body>
</html>