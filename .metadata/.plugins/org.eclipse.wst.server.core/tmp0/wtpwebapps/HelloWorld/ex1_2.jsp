<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String userid = (String)session.getAttribute("sId");
	String name = (String)session.getAttribute("sName");
	String gender = (String)session.getAttribute("sGender");
	int vcnt = 0;
	
	Cookie[] cookies = request.getCookies();
	for(int i = 0 ; i<cookies.length; i++){
		if(cookies[i].getName().equals("cVisitCnt")){
			vcnt = Integer.parseInt(cookies[i].getValue());
			vcnt += 1;
			Cookie cookies2 = new Cookie("cVisitCnt", vcnt+"");
			response.addCookie(cookies2);
			out.println(cookies[i].getName()+"<br>");
			out.println(cookies[i].getValue()+"<br>");			
		}
	}	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>환영합니다.</title>
</head>
<body>
	<h2>환영합니다. <%=name%>님</h2>
	<p><%=userid%> (<%=gender%>)</p>
	<p>접속횟수 : <%=vcnt%></p>
</body>
</html>