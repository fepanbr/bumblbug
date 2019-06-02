<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloWorld</title>
</head>
<body>
 jsp 연습<br>
 <script>
 	var num = 10;
 	document.write("num = "+ num+"<br>");
 </script>
 <%
 	int num = 20;
 out.println("num = " + num);
 
 %>
 <br>
 <%
	//str 변수 선언
 	String str = "사공정훈";
 	out.println(str + "의 jsp 첫 페이지입니다.");
 
 %>
 <br>
 <%
 	
 	out.println("현재 날짜및 시간은");
 
 %>
 
 <%=new Date()			//%= out.println 과 같다. 
 %>			
 입니다

</body>
</html>