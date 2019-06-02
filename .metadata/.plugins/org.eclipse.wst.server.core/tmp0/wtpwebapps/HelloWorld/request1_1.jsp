<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

   request.setCharacterEncoding("UTF-8");
   String name = request.getParameter("name");      // name값이 name인 녀석을 찾아서 가져와라
   String gender = request.getParameter("gender");   // name값이 gender인 녀석을 찾아서 가져와라
   String hp = request.getParameter("hp");         // name값이 hp인 녀석을 찾아서 가져와라      input태그의 radio는 값 하나만 전달 즉, 1이 전달
   String hobby[] = request.getParameterValues("hobby");      // getParameterValues 메소드는 배열을 반환한다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request객체</title>
</head>
<body>
   <h2> 정보 출력폼</h2>
   <p>당신의 이름은 <%=name %>입니다.</p>
   <p>
   <%
      if(gender.equals("1")){
         
   %>
      성별은 남자이며,
   <%
      } else {
   %>
   성별은 여자이며,
   <%
      }
   %>

   전화번호는 <%=hp %>입니다.</p>
   <p>취미는 <%
      for (int i = 0; i < hobby.length; i++){
         out.print(hobby[i] + " ");
      }
   
   %>입니다.</p>
</body>
</html>