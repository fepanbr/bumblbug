<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function sendRequest() {
		var httpRequest = new XMLHttpRequest();
		httpRequest.onreadystatechange = function() {
			if (httpRequest.readyState == XMLHttpRequest.DONE
					&& httpRequest.status == 200) {
				document.getElementById("text").innerHTML = httpRequest.responseText;
			}
		};
		// POST 방식의 요청은 데이터를 Http 헤더에 포함시켜 전송함.
		httpRequest.open("POST", "ajax1_1.jsp", true);
		httpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		httpRequest.send("city=Seoul&zipcode=06141");	//변수에 데이터 넣으면 post방식
	}
</script>
</head>
<body>
	<h1>POST 방식의 요청</h1>
	<button type="button" onclick="sendRequest()">POST 방식으로 요청 보내기!</button>
	<p id="text"></p>

</body>
</html>