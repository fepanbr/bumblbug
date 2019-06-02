<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	try{
		Cookie info = new Cookie("testCookie", "SAVE cookie");		//쿠키생성
		info.setMaxAge(1*24*60*60);									//쿠키의 유효기간을 1일로 설정
		info.setPath("/");											//쿠키의 유효한 디렉토리를 "/" 로
		response.addCookie(info);									//클라이언트 응답에 쿠키를 추가한다
		
	}catch(Exception e){
		
	}
	
	
	%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie 객체</title>
</head>
<body>
쿠키를 생성합니다.
</body>
</html>