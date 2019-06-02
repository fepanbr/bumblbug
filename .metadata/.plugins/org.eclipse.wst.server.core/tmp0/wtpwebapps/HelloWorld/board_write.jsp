<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String useridx = (String)session.getAttribute("sIdx");
	String sUserid = (String)session.getAttribute("sUserid");
	String sName = (String)session.getAttribute("sName");
	
	if(useridx == null || useridx.equals("")){
		response.sendRedirect("member1_2.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form name="bForm" method="post" action="board_writeP.jsp" enctype="Multipart/form-data">
	<p>이름 : <%=sName %></p>
	<p><label>제목 : <input type="text" name="b_title"></label></p>
	<p><label>이메일 : <input type="text" name="b_email"></label></p>
	<p>내용</p>
	<p><textarea name="b_content" cols="50" rows="5"></textarea></p>	
	<p><label>파일 : <input type="file" name="b_file"></label></p>	
	<p><input type="submit" value="글쓰기완료"></p>
	</form>
</body>
</html>









