<%@page import="java.sql.SQLException"%>
<%@page import="java.util.concurrent.ExecutionException"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%
    	String idValue = request.getParameter("id");
    
    DataSource dataSource;
    Connection conn = null;
    PreparedStatement pstmtItem = null;
    PreparedStatement pstmtDetail = null;
    
    Throwable occuredException = null;
    
    try{
    	int id = Integer.parseInt(idValue);
    	
    	Context context = new InitialContext();
    	dataSource = (DataSource)context.lookup("java:comp/env/jdbc_mariadb");
    	conn = dataSource.getConnection();
    	if(conn == null){
    		throw new Exception("데이터베이스에 연결 할 수 없습니다. <br>");
    	}
    	conn.setAutoCommit(false);
    	
    	pstmtItem = conn.prepareStatement("insert into member1(mem_userid, mem_name, mem_pwd, mem_gender) values (?,?,?,?)");
    	pstmtItem.setString(1, "red");
    	pstmtItem.setString(2, "레드");
    	pstmtItem.setString(3, "1111");
    	pstmtItem.setString(4, "남자");
    	
    	if(request.getParameter("error") != null){
    		throw new Exception("의도적 익셉션 발생");
    	}
    	pstmtDetail = conn.prepareStatement("insert into member2 values (?,?,?,?)");
    	pstmtDetail.setString(1, "red");
    	pstmtDetail.setString(2, "1111");
    	pstmtDetail.setString(3, "서울");
    	pstmtDetail.setString(4, "01055045331");
    	pstmtDetail.executeUpdate();
    	
    	conn.commit();
    	
    }catch(Throwable e){
    	if(conn != null){
    		try{
    			conn.rollback();
    		}catch(SQLException ex){ ex.printStackTrace();
    	}
    		occuredException e;
    }finally{
    	if(pstmtItem != null)
    		try{pstmtItem.close();}catch(SQLException ex){ex.printStackTrace();}
    	if(pstmtDetail != null)
    		try{pstmtDetail.close();} catch(SQLException ex){ex.printStackTrace();}
    }
    
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>트랜잭션</title>
</head>
<body>
	트랜잭션 예제
</body>
</html>