<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@page import="java.io.File"%>
<%@ page import = "javax.naming.Context" %>
<%@ page import = "javax.naming.InitialContext" %>
<%@ page import = "javax.sql.DataSource" %>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%
	
	DataSource dataSource;
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String uploadPath = request.getRealPath("/upload");
	out.println("절대경로 : " + uploadPath + "<br/>");
	
	int maxSize = 1024 * 1024 * 10;	// 파일 용량 10M
	
	String name = "";
	String subject = "";
	
	String fileName1 = "";		// DB컬럼에 저장될 이름
	String originalName1 = "";	// 실제 파일 이름
	long fileSize = 0;
	String fileType = "";
	
	MultipartRequest multi = null;
		
	try{
		multi = new MultipartRequest(request,uploadPath,maxSize,"utf-8",new DefaultFileRenamePolicy());
		// request, 업로드경로, 파일용량, 인코딩타입, 중복파일명에 대한 처리 정책
		String useridx = (String)session.getAttribute("sIdx");
		String sUserid = (String)session.getAttribute("sUserid");
		String sName = (String)session.getAttribute("sName");
		String b_title 		= multi.getParameter("b_title");
		String b_email 		= multi.getParameter("b_email");
		String b_content 	= multi.getParameter("b_content");
		String b_ip			= request.getRemoteAddr();
		
		Enumeration files = multi.getFileNames();
		// 전송된 모든 파일이름들을 저장

		while(files.hasMoreElements()){
			String file1 = (String)files.nextElement();	// 파일 input에 지정된 이름
			originalName1 = multi.getOriginalFileName(file1); // 파일 이름
			fileName1 = multi.getFilesystemName(file1);	 // 중복 정책에 따라 뒤에 1,2,3으로 이름을 변경하여 유니크하게 파일명을 생성
			fileType = multi.getContentType(file1); // 파일타입
			File file = multi.getFile(file1); // 실제 바이너리 파일
			fileSize = file.length(); // 파일크기
		}
			
		
		Context context = new InitialContext();
		dataSource = (DataSource)context.lookup("java:comp/env/jdbc_mariadb");
		conn = dataSource.getConnection();
		String sql = "insert into board1 (b_useridx, b_name, b_title, b_email, b_content, b_file, b_ip) values (?, ?, ?, ?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, useridx);
		pstmt.setString(2, sName);
		pstmt.setString(3, b_title);
		pstmt.setString(4, b_email);
		pstmt.setString(5, b_content);
		pstmt.setString(6, fileName1);	// 파일
		pstmt.setString(7, b_ip);
		pstmt.executeUpdate();
	}catch(Exception e){
		e.printStackTrace();
		out.println("데이터베이스에 연결 할 수 없습니다.<br>");
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<script>
		alert("글쓰기가 완료되었습니다.");
		location.href="board_list.jsp";	
	</script>
</body>
</html>