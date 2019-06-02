<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="bean_memberP.jsp" method="post">
	
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="pw" /></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="addr" /></td>
			</tr>
			<tr>
				<td>전화</td>
				<td><input type="text" name="tel" /></td>
			</tr>
		
		</table>
		<p><input type="submit" value="가입"></p>
	
	
	</form>

</body>
</html>