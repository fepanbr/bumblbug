<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<style>
</style>
<script>
	$(function() {
		$("#search")
				.keydown(function() {

				})
				.keyup(
						function() {
							$("#display").text($(this).val());
							var httpRequest = new XMLHttpRequest();
							httpRequest.onreadystatechange = function() {
								if (httpRequest.readyState == XMLHttpRequest.DONE
										&& httpRequest.status == 200) {
									document.getElementById("display").innerHTML = httpRequest.responseText;
								}
							};
							httpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
							httpRequest.send($(this).val());	//변수에 데이터 넣으면 post방식
							

						});
	});
</script>
</head>
<body>
	<div>
		<input id="search" type="text">
		<button>검색</button>
		<div id="display"></div>

	</div>

</body>
</html>