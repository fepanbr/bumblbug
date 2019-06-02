<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Layout</title>
</head>
<body>
	<tabel width="400" border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			<jsp:include page="Action_top.jsp" flush="false" />
		</td>
	</tr>
	<tr>
		<td>
			<jsp:include page="Action_content.jsp" flush="false" />
		</td>
	</tr>
	<tr>
		<td>
			<jsp:include page="Action_bottom.jsp" flush="false" />
		</td>
	</tr>

</body>
</html>