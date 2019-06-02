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
		var currentState = "";
		httpRequest.onreadystatechange = function() {
			switch (httpRequest.readyState) {
			case XMLHttpRequest.UNSET:
				currentState += "XMLHttpRequest 객체의 현재 상태는 UNSET 입니다.<br>";
				break;
			case XMLHttpRequest.OPENED:
				currentState += "XMLHttpRequest 객체의 현재 상태는 OPENED 입니다.<br>";
				break;
			case XMLHttpRequest.HEADERS_RECEIVED:
				currentState += "XMLHttpRequest 객체의 현재 상태는 HEADERS_RECEIVED 입니다.<br>";
				break;
			case XMLHttpRequest.LOADING:
				currentState += "XMLHttpRequest 객체의 현재 상태는 LOADING 입니다.<br>";
				break;
			case XMLHttpRequest.DONE:
				currentState += "XMLHttpRequest 객체의 현재 상태는 DONE 입니다.<br>";
				break;
			}
			document.getElementById("status").innerHTML = currentState;

			if (httpRequest.readyState == XMLHttpRequest.DONE
					&& httpRequest.status == 200) {
				document.getElementById("text").innerHTML = httpRequest.responseText;
			}
		};
		httpRequest.open("GET", "data.txt", true);
		httpRequest.send();
		
	}
</script>
</head>
<body>
	<h1>onreadystatechange 속성</h1>
	<button type="button" onclick="sendRequest()">Ajax 요청 보내기!</button>
	<p id="status"></p>
	<p id="text"></p>

</body>
</html>