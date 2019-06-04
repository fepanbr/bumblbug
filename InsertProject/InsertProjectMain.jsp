<%@page import="DAO.ProjectInsertDAO"%>
<%@page import="Bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="now" value="<%=new java.util.Date()%>" />
<fmt:formatDate value="${now}" var="nowdate" pattern="yyyy-MM-dd" />

<%
	request.setCharacterEncoding("UTF-8");

	String u_idx = (String) session.getAttribute("u_idx");
	ProjectInsertDAO pDAO = new ProjectInsertDAO();
	UserBean bean = pDAO.MemberInfo(u_idx);
	String u_img = bean.getU_img();
	String u_nm = bean.getU_nm();
	String u_intro = bean.getU_intro();
	String u_loc = bean.getU_loc();
	String u_email = bean.getU_email();
	String u_ph = bean.getU_ph();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/InsertProject.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/InsertProjectMain.js"></script>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css"
	type="text/css" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<style>

</style>
<script>

</script>
</head>
<body>
	<form method="post" name="insertform" enctype="multipart/form-data"
		action="readystorage.jsp">

		<div class="header">
			<div class="nav">
				<a class="navRight" href="../mainpage.jsp">내페이지</a> <a class="navCenter" href="#">Bumblbug</a>
				<a class="navLeft" href="#">창작자센터</a>
			</div>
			<div class="title">
				<h1 class="title_1">
					<span class="ready">준비 중</span>감동적인 제목
				</h1>
			</div>
			<div class="thirdDiv1">
				<span>펀딩 준비에 앞서 공개 검토가이드 라인 창작자 센터, 텀블벅 커뮤니티 운영원칙을 확인해주세요</span>
			</div>
			<div class="thirdDiv2">
				<span>프로젝트를 개설하려면 네 개의 섹션을 완성해야 합니다</span>
			</div>
			<div class="thirdBtn">
				<div class="look">
					<a class="lookBtn" href="#">미리보기</a>
				</div>
				<div class="review">
					<a class="reviewBtn" onclick="submitfuc()">검토 요청하기</a>
				</div>
			</div>
			<br>
		</div>
		<!--header div 끝-->
		<div class="p1_main">
			<!--입력창 + footer부분-->
			<ul class="tabs">
				<li class="tap-link1 current" data-tab="tab-1">프로젝트 개요</li>
				<li class="tap-link2" data-tab="tab-2">펀딩 및 선물 구성</li>
				<li class="tap-link3" data-tab="tab-3">스토리텔링</li>
				<li class="tap-link4" data-tab="tab-4">계좌설정</li>
			</ul>

			<div class="tab-content tc1 current" id="tab-1">
				<!--입력 div 시작-->
				<h3>프로젝트 개요</h3>
				<div class="p1All" style="height:100px;">
					<div class="title">프로젝트 제목</div>
					<div class="p1_inputBox p1_1_name">
						<input type="text" class="p1_1_input" name="pj_title"
							placeholder="프로젝트 제목을 입력해주세요" style="width: 500px"> <input
							type="text" class="p1_1_input_2" name="pj_short_title"
							placeholder="프로젝트 소제목을 입력해주세요" style="width: 300px">
						<div class="p1_1_output" style="display: none"></div>
					</div>
					<div class="btnAll p1_btn1">
						<a>입력하기</a>
					</div>
				</div>
				<div class="p1All">
					<div class="title">프로젝트 대표이미지</div>
					<div class="p1_inputBox p1_2_img">
						<input type="file" class="p1_2_input" id="imgInp" name="pj_img""><br>
						<img id="blah" src="#" />
					</div>
					<div class="btnAll p1_btn2">
						<a>올리기</a>
					</div>
				</div>
				<div class="p1All">
					<div class="title">프로젝트 요약</div>
					<div class="p1_inputBox p1_3_summary">
						<input type="text" class="p1_3_input" name="pj_summary"
							placeholder="프로젝트 요약을 입력해주세요" style="width: 500px">
						<div class="p1_3_output" style="display: none"></div>
					</div>
					<div class="btnAll p1_btn3">
						<a>입력하기</a>
					</div>
				</div>
				<div class="p1All">
					<div class="title">프로젝트 카테고리</div>
					<div class="p1_inputBox p1_4_category">
						<input type="text" class="p1_4_input" name="pj_category"
							placeholder="게임,공연,출판,영화중 입력" style="width: 500px">
						<div class="btnAll p1_4_output" style="display: none"></div>
					</div>
					<div class="btnAll p1_btn4">
						<a>입력하기</a>
					</div>
				</div>
				<div class="p1All">
					<div class="title">프로젝트 페이지 주소</div>
					<div class="p1_inputBox p1_5_address">
						<input type="text" class="p1_5_input" name="pj_url"
							value="https://tumblbug.com/" style="width: 500px">
						<div class="btnAll p1_5_output" style="display: none"></div>
					</div>
					<div class="btnAll p1_btn5">
						<a>입력하기</a>
					</div>
				</div>
				<div class="p1All">
					<div class="title">검색용 태그</div>
					<div class="p1_inputBox p1_6_tag">
						<input type="text" class="p1_6_input" name="search_tag"
							placeholder="예시:뱃지,웹툰,에코백,고양이" style="width: 300px">
						<div class="btnAll p1_6_output" style="display: none"></div>
					</div>
					<div class="btnAll p1_btn6">
						<a>입력하기</a>
					</div>
				</div>
				<h3>진행자 정보</h3>
				<div class="p1All">
					<div class="title">프로필 이미지</div>
					<div class="p1_inputBox p1_7_profileImg">
						<input type="file" class="p1_7_input" id="imgInp2"
							name="profile_img"><br>

					</div>
					<div class="btnAll p1_btn7">
						<a>올리기</a>
					</div>
				</div>
				<div class="p1All">
					<div class="title">진행자 이름</div>
					<div class="p1_inputBox p1_8_mcName">
						<input type="text" class="p1_8_input" name="leader_nm"
							placeholder="진행자의 이름을 입력해주세요" style="width: 200px"
							value="<%=u_nm%>">
						<div class="btnAll p1_8_output" style="display: none"></div>
					</div>
					<div class="btnAll p1_btn8">
						<a>입력하기</a>
					</div>
				</div>
				<div class="p1All">
					<div class="title">진행자 소개</div>
					<div class="p1_inputBox p1_9_mcIntroduction">
						<input type="text" class="p1_9_input" name="leader_intro"
							placeholder="진행자 소개를 입력해주세요" style="width: 500px"
							value="<%=u_intro%>">
						<div class="btnAll p1_9_output" style="display: none"></div>
					</div>
					<div class="btnAll p1_btn9">
						<a>입력하기</a>
					</div>
				</div>
				<div class="p1All">
					<div class="title">진행자 활동 지역</div>
					<div class="p1_inputBox p1_10_mcPlayarea">
						<input type="text" class="p1_10_input" name="leader_loc"
							placeholder="진행자 활동지역을 입력해주세요" style="width: 300px"
							value="<%=u_loc%>">
						<div class="btnAll p1_10_output" style="display: none"></div>
					</div>
					<div class="btnAll p1_btn10">
						<a>입력하기</a>
					</div>
				</div>
				<div class="footer1">
					<button class="next1">다음 ></button>
				</div>
			</div>
			<!--입력 div 끝-->

			<div class="tab-content tc2" id="tab-2">
				<!--입력 div 시작-->
				<h3>펀딩 목표 설정</h3>
				<div class="p2All">
					<div class="title">목표 금액</div>
					<div class="p1_inputBox p2_1_goalMoney">
						<input type="text" class="p2_1_input" name="obj_price"
							placeholder="목표 금액을 입력해주세요" style="width: 300px">
						<div class="btnAll p2_1_output" style="display: none"></div>
					</div>
					<div class="btnAll p2_btn1">
						<a>입력하기</a>
					</div>
				</div>
				<!---------------------------------------------------------------------------------------------------------------->
				<div class="p2All">
					<div class="title">프로젝트 등록일</div>
					<div class="p1_inputBox p2_2_projectLastdate">
						<input type="text" class="p2_2_input" type="text" id="tDate"
							name="pj_reg_dt" value="${nowdate}">
					</div>
				</div>

				<div class="p2All">
					<div class="title">프로젝트 마감일</div>
					<div class="p1_inputBox p2_2_projectLastdate">
						<input type="date" class="p2_2_input" name="pj_end_dt"
							placeholder="날짜를 선택해주세요" value="${nowdate}">
						<div class="btnAll p2_2_output" style="display: none"></div>
					</div>
					<div class="btnAll p2_btn2">
						<a>입력하기</a>
					</div>
				</div>

				<div class="p2All">
					<div class="title">선물 배송 날짜</div>
					<div class="p1_inputBox p2_4_presentdate">
						<input type="date" class="p2_4_input" name="due_dt"
							placeholder="날짜를 선택해주세요" value="${nowdate}">
						<div class="btnAll p2_4_output" style="display: none"></div>
					</div>
					<div class="btnAll p2_btn4">
						<a>입력하기</a>
					</div>
				</div>

				<h3 class="p2_Title">예상 정산일</h3>
				<div class="p2All">
					<div class="title">예상정산일</div>
					<div class="reDate">
						<p class="date1">마감일을 입력하시면 예상 정산일을 알려드립니다.</p>
						<p class="date2" style="display: none"></p>
					</div>
				</div>
				<!---------------------------------------------선물 추가하기--------------------------------------------------->
				<h3>선물 구성</h3>
				<div class="p2All" style="height:300px;">
					<div class="p1_inputBox p2_3_gift">
						<div style="margin:20px 0"><b>선물이름 : </b><input type="text" class="p2_3_input1" name="p_nm1"
							placeholder="선물이름을 입력해주세요"><b>,</b> <b>최소금액 : </b><input
							type="text" class="p2_3_input2" name="min_price1"
							placeholder="금액을 입력해주세요"><b>원,</b> <b>옵션 : </b><input
							type="text" class="p2_3_input3" name="p_explain1"
							placeholder="옵션을 입력해주세요"><b></b> <b>수량 : </b><input
							type="number" class="p2_3_input4" name="limit_amount1"
							style="width: 50px"> <b>배송예정날짜 : </b><input type="date"
							class="p2_3_input5" name="due_dt1" value="${nowdate}"><br>
						</div>
						<div style="margin:20px 0">	
						<b>선물이름 : </b><input type="text" class="p2_3_input6" name="p_nm2"
							placeholder="선물이름을 입력해주세요"><b>,</b> <b>최소금액 : </b><input
							type="text" class="p2_3_input7" name="min_price2"
							placeholder="금액을 입력해주세요"><b>원,</b> <b>옵션 : </b><input
							type="text" class="p2_3_input8" name="p_explain2"
							placeholder="옵션을 입력해주세요"><b>,</b> <b>수량 : </b><input
							type="number" class="p2_3_input9" name="limit_amount2"
							style="width: 50px"> <b>배송예정날짜 : </b><input type="date"
							class="p2_3_input10" name="due_dt2" value="${nowdate}"><br>
						</div>
						<div style="margin:20px 0">
						<b>선물이름 : </b><input type="text" class="p2_3_input11" name="p_nm3"
							placeholder="선물이름을 입력해주세요"><b>,</b> <b>최소금액 : </b><input
							type="text" class="p2_3_input12" name="min_price3"
							placeholder="금액을 입력해주세요"><b>원,</b> <b>옵션 : </b><input
							type="text" class="p2_3_input13" name="p_explain3"
							placeholder="옵션을 입력해주세요"><b>,</b> <b>수량 : </b><input
							type="number" class="p2_3_input14" name="limit_amount3"
							style="width: 50px"> <b>배송예정날짜 : </b><input type="date"
							class="p2_3_input15" name="due_dt3" value="${nowdate}"><br>
						</div>

						<div class="btnAll p2_3_output" style="display: none"></div>
					</div>
					<div class="btnAll p2_btn3">
						<a>입력하기</a>
					</div>
					<div class="footer2">
						<button class="back2">< 이전</button>
						<button class="next2">다음 ></button>
					</div>
				</div>
			</div>
			<!--입력 div 끝-->

			<div class="tab-content tc3" id="tab-3">
				<!--입력 div 시작-->
				<h3>프로젝트 소개 영상</h3>
				<div class="p3All">
					<div class="title">프로젝트 소개 영상</div>
					<div class="p1_inputBox p3_1_projectAvi">
						<input type="file" class="p3_1_input" name="pj_intro_video">
						<div class="btnAll p3_1_output" style="display: none"></div>
					</div>
					<div class="btnAll p3_btn1">
						<a>등록하기</a>
					</div>
				</div>
				<h3>프로젝트 스토리</h3>
				<div class="p3All">
					<div class="title">프로젝트 스토리</div>
					<div class="p1_inputBox p3_2_projectStory">
						<textarea class="p3_2_input" name="pj_story"
							placeholder="프로젝트 스토리를 입력해주세요"></textarea>

						<div class="btnAll p3_2_output" style="display: none"></div>
					</div>
					<div class="btnAll p3_btn2">
						<a>입력하기</a>
					</div>
				</div>
				<div class="footer2">
					<button class="back3">< 이전</button>
					<button class="next3">다음 ></button>
				</div>
			</div>
			<!--입력 div 끝-->
			<div class="tab-content tc4" id="tab-4">
				<!--입력 div 시작-->
				<h3>연락처 인증</h3>
				<div class="p4All">
					<div class="title">이메일 주소</div>
					<div class="p1_inputBox p4_1_emailAddress">
						<input type="text" class="p4_1_input" name="u_email"
							placeholder="이메일을 입력해주세요" style="width: 300px">
						<div class="btnAll p4_1_output" style="display: none"></div>
					</div>
					<div class="btnAll p4_btn1">
						<a>등록하기</a>
					</div>
				</div>
				<div class="p4All">
					<div class="title">휴대폰 번호</div>
					<div class="p1_inputBox p4_2_phoneNumber">
						<input type="text" class="p4_2_input" name="u_ph"
							placeholder="휴대폰 번호를 입력해주세요" value="<%=u_ph%>">
						<div class="btnAll p4_2_output" style="display: none"></div>
					</div>
					<div class="btnAll p4_btn2">
						<a>입력하기</a>
					</div>
				</div>
				<h3>입금 계좌</h3>
				<div class="p4All">
					<div class="title">거래 은행</div>
					<div class="p1_inputBox p4_3_tradeBank">
						<input type="text" class="p4_3_input" name="bank_nm"
							placeholder="거래은행을 입력해주세요">
						<div class="btnAll p4_3_output" style="display: none"></div>
					</div>
					<div class="btnAll p4_btn3">
						<a>입력하기</a>
					</div>
				</div>
				<div class="p4All">
					<div class="title">예금주 명</div>
					<div class="p1_inputBox p4_4_inputMoneyName">
						<input type="text" class="p4_4_input" name="ah"
							placeholder="예금주 명을 입력해주세요">
						<div class="btnAll p4_4_output" style="display: none"></div>
					</div>
					<div class="btnAll p4_btn4">
						<a>입력하기</a>
					</div>
				</div>
				<div class="p4All">
					<div class="title">계좌번호</div>
					<div class="p1_inputBox p4_5_cardNumber">
						<input type="text" class="p4_5_input" name="ac_no"
							placeholder="계좌 번호를 입력해주세요">
						<div class="btnAll p4_5_output" style="display: none"></div>
					</div>
					<div class="btnAll p4_btn5">
						<a>입력하기</a>
					</div>
				</div>
				<div class="p4All">
					<div class="title">생년월일</div>
					<div class="p1_inputBox p4_6_birth">
						<input type="date" class="p4_6_input" name="ah_birth"
							value="1988-07-29">
						<div class="btnAll p4_6_output" style="display: none"></div>
					</div>
					<div class="btnAll p4_btn6">
						<a>입력하기</a>
					</div>
				</div>
				<div class="footer2">

					<button class="back4">< 이전</button>
					<button type="submit" class="storage">임시저장</button>
				</div>

			</div>
			<!--입력 div 끝-->
			<br> <br> <br> <br>
		</div>
		<!--main div 끝-->
	</form>
</body>
</html>