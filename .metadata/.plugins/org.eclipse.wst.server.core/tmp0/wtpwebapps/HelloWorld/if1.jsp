<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>정보출력폼</h2>
	<%
		String name = "사공정훈";
		String gender = "1";
		String hp = "01055045331";
		int jumsu[] = {90,80,60,70};
	%>
	<p>당신의 이름은 <%=name %>입니다.</p>
	<p>
	<%
		if(gender.equals("1")){
	%>
		성별은 남자이며,
	<%
		}else{
	%>
		성별은 여자이며,
	<%
		}
	%>
	</p>
		
</body>
</html>