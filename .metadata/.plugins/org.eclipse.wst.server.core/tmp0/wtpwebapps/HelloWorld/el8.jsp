<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String[] studyArr = {"류정원","김사과","오렌지","이멜론"};
    pageContext.setAttribute("study", studyArr);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Expression Language </title>
</head>
<body>
<h2> EL Array Test </h2>
<b> 리스트 </b>
<hr width="150" align="left" color="red" size="5">
1. ${ study[0] } <br/>
2. ${ study[1] } <br/>
3. ${ study[2] } <br/>
4. ${ study[3] } <br/>
</body>
</html>
