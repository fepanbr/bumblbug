<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<jsp:useBean id="bDAO" class="Board.BoardDAO" />





<%
    	
    	
    	int totalRecord = 0; //전체 레코드 수
    	int numPerPage = 5; //페이지 당 레코드수
    	int pagePerBlock = 10; //블럭당 페이지 수 
    	
    	int totalPage=0 ; //전체 페이지 수 
    	int totalBlock=0; //전체 블럭수
    	
    	int nowPage = 1; //현재 페이지
    	int nowBlock = 1; //현재블럭
    	
    	int start=0; //DB의 select 쿼리문 시작번호
    	int end=5; //시작번호로부터 가져올 게시물의 수
    	
    	if(request.getParameter("nowPage")!=null){
    		nowPage = Integer.parseInt(request.getParameter("nowPage"));
    	}
    	start = (nowPage-1)*(numPerPage);		//select문 찾을때 첫 시작점 설정
    	System.out.println(start);
    	end = numPerPage;
    	
    	totalRecord = 500;		//일단 임의로 500으로 지정
    	totalPage = (int)Math.ceil((double)totalRecord/numPerPage);	//전체페이지수
    	nowBlock = (int)Math.ceil((double)nowPage/pagePerBlock);		//전체블럭계산
    	totalBlock = (int)Math.ceil((double)totalPage/pagePerBlock);
    %>
<!-- 여기까지 기본적인 알아야할 값들!!!!!--------------------------------------- -->




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!--script 부분 시작 -->
<script type="text/javascript">

//새로고침 하기 위한 메소드
 function list(){
	 document.lstFrm.action = "listprac.jsp";
	 document.listFrm.submit();
 }
 
 //페이지 선택했을때 리스트를 바꿔주기위한 메소드
 function paging(page){
	 document.readFrm.nowPage.value = page;
	 document.readFrm.submit();
	 
 }
 //한 블럭이 넘아갈떄 쓰는 메소드
 function block(value){
	 document.readFrm.nowPage.value = <%=pagePerBlock%>*(value-1)+1;
	 document.readFrm.submit();
 }
 //게시글 읽기 메소드
 function read(num){
	 document.readFrm.num.value = num;
	 document.readFrm.action ="read.jsp";
	 document.readFrm.submit();
	 
 }
</script>

</head>
<body>
	<center>
		<h2>리스트</h2>
	</center>
	<table align="center" border="1" width="800">
		<tr align="center">
			<td width="80">글번호</td>
			<td width="320">제목</td>
			<td width="80">이름</td>
			<td width="80">조회수</td>
			<td width="190">날짜</td>
			<td width="50">파일</td>
		</tr>
		<%

	Connection conn = null;
	ResultSet  rs = null;	
	PreparedStatement pstmt = null;

	request.setCharacterEncoding("UTF-8");

	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
	
	String sql = "select b_idx, b_useridx, b_name, b_title, b_email, b_file, b_regdate, b_hit from  board1 order by b_idx desc, b_idx limit ? , ? " ;
	

	pstmt = conn.prepareStatement(sql);
	pstmt.setInt(1, start);
	pstmt.setInt(2, end);
	rs = pstmt.executeQuery();
%>
		
		
		
	  	<%
	while(rs.next()){
			String b_idx 		= rs.getString("b_idx");
			String b_useridx 	= rs.getString("b_useridx");
			String b_name 		= rs.getString("b_name");
			String b_title 		= rs.getString("b_title");
			String b_email 		= rs.getString("b_email");
			String b_regdate	= rs.getString("b_regdate").substring(0, 10);
			//String b_file 	= rs.getString("b_file");
			String b_hit 		= rs.getString("b_hit");
			
			String c_cnt = "";
			String sql2 = "select count(c_idx) as c_cnt from comment1 where c_boardidx=?";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, b_idx);
			ResultSet rs2 = pstmt.executeQuery();
			if(rs2.next())
			{
				if(!rs2.getString("c_cnt").equals("0")) {
					c_cnt = "["+rs2.getString("c_cnt")+"]";
				}
			}
	%>
		<tr>
			<td><%=b_idx%></td>
			<td><a href="board_view.jsp?b_idx=<%=b_idx%>"><%=b_title%> </a><%=c_cnt%></td>
			<td><%=b_name%></td>
			<td><%=b_hit%></td>
			<td><%=b_regdate%></td>
			<td></td>
		</tr>
		<%
		}
	%>
	</table>


	<% 
		int pageStart = (nowBlock -1)*pagePerBlock + 1 ; //하단 페이지 시작번호
	  	int pageEnd = ((pageStart + pagePerBlock ) <= totalPage) ?  (pageStart + pagePerBlock): totalPage+1; 
	  	//하단 페이지 끝번호
	  if(totalPage !=0){
		if (nowBlock > 1) {%>


	<a href="javascript:block('<%=nowBlock-1%>')">prev...</a>

	<%}%>&nbsp;

	<%for ( ; pageStart < pageEnd; pageStart++){%>

	<a href="javascript:paging('<%=pageStart %>')"> 
		 [<%=pageStart %>]
	
	</a>
	<%}//for%>&nbsp;
	<%if (totalBlock > nowBlock ) {%>
	<a href="javascript:block('<%=nowBlock+1%>')">.....next</a>
	<%}%>&nbsp;
	<%}%>

	<!-- 넘겨줄  -->
	<form name="listFrm" method="post">
		<input type="hidden" name="reload" value="true"> <input
			type="hidden" name="nowPage" value="1">

	</form>


	<form name="readFrm" method="get">
		<input type="hidden" name="num">
		<input type="hidden" name="nowPage" value="<%=nowPage%>">  
			
	</form>

</body>
</html>