<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>a태그 form 전송</title>
    <script>
    
    function content_view(idnum){
         var f=document.contents;   //폼 name
      
         f.id.value = idnum;    //POST방식으로 넘기고 싶은 값(hidden 변수에 값을 넣음)
         f.action="parctice2.jsp"; //이동할 페이지
         
         f.method="get"; //POST방식
         f.submit();
}
</script>


   
  </head>
  <body>
    <form name="contents">
        <input type="hidden" name="id"/>
         ...........
         <input type='button' value='보기' onClick='javascript:content_view(1);'/>
         ...........
         <input type='button' value='보기' onClick='javascript:content_view(2);'/>
         ...........
         <input type='button' value='보기' onClick='javascript:content_view(3);'/>
         ...........
</form>


  </body>
</html>