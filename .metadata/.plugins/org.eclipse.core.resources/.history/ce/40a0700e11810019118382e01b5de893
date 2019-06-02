<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%  // upload.jsp(hidden)로 부터 넘어온 값들을 구함
	String id = request.getParameter("id");
	String subject = request.getParameter("subject");
	String fileName = request.getParameter("fileName");
	String orgfileName = request.getParameter("orgfileName");

%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : <%=id %><br>
	제목 : <%=subject %><br>
	첨부파일(클릭시 다운로드)<br>
	<!-- download.jsp 파일로 저장된 파일의 이름을 넘겨줌 -->
	- 파일 : <a href="download.jsp?fileName=<%=fileName%>"><%=orgfileName %></a><br>
	</body>
</html>