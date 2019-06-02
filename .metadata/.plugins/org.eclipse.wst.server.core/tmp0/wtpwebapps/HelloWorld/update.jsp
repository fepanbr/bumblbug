<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function sendRequest() {
		var input = document.getElementById("typing").value;
		document.getElementById("result").innerHTML =input;
		var httpRequest = new XMLHttpRequest();
		httpRequest.onreadystatechange = function() {
			if (httpRequest.readyState == XMLHttpRequest.DONE
					&& httpRequest.status == 200) {
				
				
				
				document.getElementById("text").innerHTML = httpRequest.responseText;
			}
		};
		// POST 방식의 요청은 데이터를 Http 헤더에 포함시켜 전송함.
		httpRequest.open("POST", "update1.jsp", true);
		httpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		httpRequest.send("email="+input);	//변수에 데이터 넣으면 post방식
	}
	
	
</script>
</head>
<body>
	<h1>아이디검색</h1>
	<input id="typing" type=text onkeyup="sendRequest()"></input>
	<p id="text"></p>
	<p>My name is: <span id="result"></span></p>

</body>
</html>