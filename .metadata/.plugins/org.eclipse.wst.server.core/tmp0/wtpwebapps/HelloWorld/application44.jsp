<%@page import="java.io.BufferedInputStream"%>
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
	BufferedInputStream input = null;
	byte[] buffer = new byte[128];
	String filePath = "text.txt";
	// / : 홈 디렉토리
	
	try{
		input = new BufferedInputStream(application.getResourceAsStream(filePath));
		
		int len =-1;
		while((len= input.read(buffer))!= -1){
			 System.out.println(new String(buffer,0,len));
			
		}
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		if(input !=null){
			input.close();
		}
	}


%>

</body>
</html>