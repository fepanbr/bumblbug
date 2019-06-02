<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
     request.setCharacterEncoding("UTF-8");
    %>
    
    <!-- 자바빈 액션 사용 -->
    <jsp:useBean id="memberBean" class="com.db.MemberBean"/>
    <jsp:setProperty name="memberBean" property="*"/>
    <b>회원가입 되었습니다.</b>
    
    <b><%=memberBean.getId() %></b>님의 회원종보입니다. <br/><br/>
    
    <table border="1">
    	<tr>
    		<td>아이디</td>
    		<td><%=memberBean.getId() %></td>
   		</tr>
   		<tr>
    		<td>비밀번호</td>
    		<td><%=memberBean.getPw() %></td>
   		</tr>
   		<tr>
    		<td>주소</td>
    		<td><%=memberBean.getAddr() %></td>
   		</tr>
    
    
    </table>
    

</body>
</html>