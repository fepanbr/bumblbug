<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    ArrayList<String> familyList = new ArrayList<>();
    String[] nameArr = {"류정원", "김사과", "오렌지", "이멜론"};
    for(int i=0; i<nameArr.length ; i++){
        familyList.add(nameArr[i]);
    }
    pageContext.setAttribute("Family", familyList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Expression Language Test </title>
</head>
<body>
<h2> EL Array Test 2 </h2>
<b> Family List </b>
<hr width="150" align="left" size="5" color="red">
1. ${Family[0]} <br>
2. ${Family[1]} <br>
3. ${Family[2]} <br>
4. ${Family[3]} <br>
</body>
</html>