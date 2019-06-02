<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	HashMap map= new HashMap();
	map.put("index1", "value1");
	map.put("index2", "value2");
	map.put("index3", "value3");
	map.put("index4", "value4");
	map.put("index5", "value5");
	map.put("index6", "value6");
	request.setAttribute("eachMap", map);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL for Each</title>
</head>
<body>
	<c:forEach var="list" items="${eachMap}" varStatus="ind">
	${ind.index} eachMap value is ${list.value} <br/>
	</c:forEach>
</body>
</html>