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
		int sum=0;
		int avr=0;
	%>
	<p>당신의 이름은 <%=name %>입니다.</p>
	<p>
	<%
	for(int i=0; i<jumsu.length;i++){
		
		out.print(jumsu[i]+ " ");
		sum+=jumsu[i];
		
	}
	avr = sum/4;
	%>
	점입니다.
	<br>
	당신의 총점은 <%=sum%>
	당신의 평군은<%=avr %>입니다.

	</p>
		
</body>
</html>