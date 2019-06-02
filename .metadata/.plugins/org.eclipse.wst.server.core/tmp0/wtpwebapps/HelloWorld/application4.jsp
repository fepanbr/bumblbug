<%@page import="java.io.IOException"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application 객체</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	BufferedReader reader = null;
	String filePath = "C:\\Program Files\\Apache Software Foundation\\Tomcat 8.5\\webapps\\ROOT\\text.txt";
	try{
		reader= new BufferedReader(new FileReader(filePath));
		
		while(true){
			String str = reader.readLine();
			
			if(str == null) break;
			System.out.println(str);
		}
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		if(reader !=null){
			reader.close();
		}
	}


%>

</body>
</html>