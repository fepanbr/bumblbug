<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %> 
<%
	Connection conn = null;
	ResultSet  rs = null;	
	PreparedStatement pstmt = null;

	request.setCharacterEncoding("UTF-8");
	String useridx = (String)session.getAttribute("sIdx");

	String mem_userid = null;
	String mem_name = null;
	String mem_gender = null;
	String mem_zipcode = null;
	String mem_addr1 = null;
	String mem_addr2 = null;
	String mem_addr3 = null;
	
	try{
		if(useridx == null || useridx.equals("")){
			response.sendRedirect("member1_2.jsp");	// 로그인
		}else{
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
		 
			String sql = "select mem_userid, mem_name, mem_gender, mem_zipcode, mem_addr1, mem_addr2, mem_addr3 from member1 where mem_idx=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, useridx);
			rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				mem_userid = rs.getString("mem_userid");;
				mem_name = rs.getString("mem_name");;
				mem_gender = rs.getString("mem_gender");;
				mem_zipcode = rs.getString("mem_zipcode");;
				mem_addr1 = rs.getString("mem_addr1");;
				mem_addr2 = rs.getString("mem_addr2");;
				mem_addr3 = rs.getString("mem_addr3");;
			}
		}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>간단 회원가입</title>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
    }
</script>
</head>
<body>
	<form method="post" action="member1_7.jsp">
		<p><label>아이디 <%=mem_userid%></label></p>
		<p><label>패스워드 <input type="password" name="pwd"></label></p>
		<p><label>이름 <input type="text" name="name" value="<%=mem_name%>"></label></p>
		<p>성별 <label>남자<input type="radio" name="gender" value="남자" <%if(mem_gender.equals("남자")){%>checked<%}%>></label> 
		<label>여자<input type="radio" name="gender" value="여자" <%if(mem_gender.equals("여자")){%>checked<%}%>></label>
		<p>우편번호 <input type="text" name="zipcode" size="5" maxlength="5" id="sample6_postcode" placeholder="우편번호" readonly value="<%=mem_zipcode%>"> <input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"></p>
		<p><input type="text" name="addr1" id="sample6_address" value="<%=mem_addr1%>" placeholder="주소" readonly></p>
		<p><input type="text" name="addr2" id="sample6_detailAddress" value="<%=mem_addr2%>" placeholder="상세주소"></p>
		<p><input type="text" name="addr3" id="sample6_extraAddress" value="<%=mem_addr3%>" placeholder="참고항목"></p>		
		<p><input type="submit" value="회원가입"></p>
	</form>
</body>
<%
	}catch(Exception e){
		
	}
%>
</html>