<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language</title>
</head>
<body>
<h2> EL의 Scope </h2>
<%
    int sum=0;
    for(int i=1; i<=10; i++){
        sum+=i;
    }  
    request.setAttribute("sum", new Integer(sum));
    
    // 1. pageContext.forward("이동 할 페이지");	-> request, response 스코프에 담긴 값이 유효합니다.
    
    // 2. <jsp:forward page="이동 할 페이지"/>
    
    // 3. RequestDispatcher rd = request.getRequestDispatcher("이동 할 페이지");
    // rd.forward(request, response);
    
    
%>
<jsp:forward page="el1_1.jsp"/>
</body>
</html>