<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language Test </title>
</head>
<body>
 <h2> EL param2 </h2>
<% request.setCharacterEncoding("utf-8"); %>
name : ${param.name} <br/>
name : ${param['name']}<br/>
name : ${param["name"]}<br/>
 
hobby : ${paramValues.hobby[0]} 
          ${paramValues.hobby[1]} 
          ${paramValues.hobby[2]} 
          ${paramValues.hobby[3]}           
</body>
</html>