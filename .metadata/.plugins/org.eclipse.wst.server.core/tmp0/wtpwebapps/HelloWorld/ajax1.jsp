<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	function sendRequest(){
		var httpRequest = new XMLHttpRequest();
		
		//httpRequest.readyState == XMLHttpRequest.DONE 결과값 출력 준비가 됬다.
		//httpRequest.status == 200 페이지가 존재한다.
		httpRequest.onreadystatechange = function(){
			if(httpRequest.readyState == XMLHttpRequest.DONE && httpRequest.status == 200){
				document.getElementById("text").innerHTML = httpRequest.responseText;
			}
		};
		//GET  방식으로 요청을 보내면서 데이터를 동시에 전달함.
		httpRequest.open("GET", "ajax1_1.jsp?city=seoul&zipcode=12345", true);
		httpRequest.send();
	}
</script>
<body>
	<h1>GET 방식의 요청</h1>
	<button type="button" onclick="sendRequest()">GET 방식으로 요청 보내기!</button>
	<p id="text"></p>
</body>
</html>