<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTl 변수</title>
</head>
<body>
<c:set var="name" value="김사과" />
이름 : <c:out value="${name}"/>
<br/>

<c:set var="name" value="사과" />
변경된 이름이름 : <c:out value="${name}"/>
<br/>
변경된 이름2: ${name}
<br/>
<c:remove var="name"/>
삭제된 이름 출럭 : <c:out value="${name}" default="이름없음" />
</body>
</html>