<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String userid = request.getParameter("userid");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String zipcode = request.getParameter("zipcode");
	String addr1 = request.getParameter("addr1");
	String addr2 = request.getParameter("addr2");
	String addr3 = request.getParameter("addr3");
	
	session.setAttribute("sId", userid);
	session.setAttribute("sName", name);
	session.setAttribute("sGender", gender);
	
	try{
		Cookie info = new Cookie("cVisitCnt", "1"); // 쿠키를 생성한다.
		info.setMaxAge(365*24*60*60);               // 쿠키의 유효기간을 365일로 설정한다.
		info.setPath("/");                          // 쿠키의 유효한 디렉토리를 "/" 로 설정한다.
		response.addCookie(info);                   // 클라이언트 응답에 쿠키를 추가한다.
	}catch(Exception e){
		
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입완료</title>
</head>
<body>
	<script>
		alert("회원가입이 완료되었습니다.");
		location.href="ex1_2.jsp";	
	</script>
</body>
</html>