<%@page import="Bean.*, java.util.*"%>

<%@page import="DAO.ProjectInsertDAO"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%
 request.setCharacterEncoding("UTF-8");
 String u_idx = (String)session.getAttribute("u_idx");

%>
<!-- bean 사용 setting -->
<jsp:useBean id="tempbean" class="Bean.TempBean" />
<jsp:useBean id="Mgr" class="DAO.ProjectInsertDAO" />

<% 


String uploadPath = request.getRealPath("/Bumblbugimg");
out.println("절대경로 : " + uploadPath + "<br/>");
int maxSize = 1024 * 1024 * 10; // 파일 용량 10M
String fileName1 = "";
String fileName2 = "";
String fileName3 = "";



MultipartRequest mr = null;
try {
	
	mr = new MultipartRequest(request, uploadPath, maxSize, "utf-8", new DefaultFileRenamePolicy());
	
	String tp_title = mr.getParameter("pj_title");
	String tp_short_title = mr.getParameter("pj_short_title");
	String tp_summary = mr.getParameter("pj_summary");
	String tp_category = mr.getParameter("pj_category");
	String tp_url = mr.getParameter("pj_url");
	String tp_search_Tag = mr.getParameter("search_tag");
	String tp_leader_nm = mr.getParameter("leader_nm");
	String tp_leader_intro = mr.getParameter("leader_intro");
	String tp_leader_loc = mr.getParameter("leader_loc");
	String tp_obj_price = mr.getParameter("obj_price");
	String tp_reg_dt = mr.getParameter("pj_reg_dt");
	String tp_end_dt = mr.getParameter("pj_end_dt");
	String tp_story = mr.getParameter("pj_story");
	String tp_ac_no = mr.getParameter("ac_no");
	String tp_ah = mr.getParameter("ah");
	String tp_bank_nm = mr.getParameter("bank_nm");
	String tp_ah_birth = mr.getParameter("ah_birth");
	
	out.println("연:::습::"+tp_reg_dt);
	
	
	
	//입력한 값을 multipartRequset 객체로 변수에 담기(선물1)
	String tp_min_price1 = mr.getParameter("min_price1");
	String tp_p_nm1 = mr.getParameter("p_nm1");
	String tp_due_dt1 = mr.getParameter("due_dt1");
	String tp_limit_amount1 = mr.getParameter("limit_amount1");
	String tp_p_explain1 = mr.getParameter("p_explain1");
	//입력한 값을 multipartRequset 객체로 변수에 담기(선물2)
	String tp_p_nm2 = mr.getParameter("p_nm2");
	String tp_min_price2 = mr.getParameter("min_price2");
	String tp_p_explain2 = mr.getParameter("p_explain2");
	String tp_limit_amount2 = mr.getParameter("limit_amount2");
	String tp_due_dt2 = mr.getParameter("due_dt2");
	//입력한 값을 multipartRequset 객체로 변수에 담기(선물3)
	String tp_p_nm3 = mr.getParameter("p_nm3");
	String tp_min_price3 = mr.getParameter("min_price3");
	String tp_p_explain3 = mr.getParameter("p_explain3");
	String tp_limit_amount3 = mr.getParameter("limit_amount3");
	String tp_due_dt3 = mr.getParameter("due_dt3");
	
	
	
	
	//파일 업로드 ///////////////////////////////////////////////////
	
	
	Enumeration files = mr.getFileNames();
	while (files.hasMoreElements()) {
		String file1 = (String) files.nextElement();
		fileName1 = mr.getFilesystemName(file1); // 중복 정책에 따라 뒤에 1,2,3으로 이름을 변경하여 유니크하게 파일명을 생성
		String file2 = (String) files.nextElement();
		fileName2 = mr.getFilesystemName(file2);
		String file3 = (String) files.nextElement();
		fileName3 = mr.getFilesystemName(file3);
		
	}
	 
	
	tempbean.setTp_title(tp_title);
	tempbean.setTp_short_title(tp_short_title);
	
	///////////////////////////////
	tempbean.setTp_img(fileName2);
	/////////////////////////////////
	
	
	tempbean.setTp_summary(tp_summary);
	tempbean.setTp_category(tp_category);
	tempbean.setTp_url(tp_url);
	tempbean.setTp_search_tag(tp_search_Tag);

	///////////////////////////////////
	tempbean.setTp_profile_img(fileName3);
	///////////////////////////////////////
	
	
	tempbean.setTp_leader_nm(tp_leader_nm);
	tempbean.setTp_leader_intro(tp_leader_intro);
	tempbean.setTp_leader_loc(tp_leader_loc);
	tempbean.setTp_reg_dt(tp_reg_dt);
	tempbean.setTp_end_dt(tp_end_dt);
	
	///////////////////////////////////////
	tempbean.setTp_intro_video(fileName1);
	///////////////////////////////////////
	
	
	
	tempbean.setTp_story(tp_story);
	tempbean.setTp_obj_price(tp_obj_price);
	tempbean.setTp_ac_no(tp_ac_no);
	tempbean.setTp_ah(tp_ah);
	tempbean.setTp_bank_nm(tp_bank_nm);
	tempbean.setTp_ah_birth(tp_ah_birth);
	tempbean.setTp_u_idx(Integer.parseInt(u_idx));
	
	
	
	
	
	
	
	int tp_idx = Mgr.insertTemp(tempbean, u_idx);
	String a = Integer.toString(tp_idx);
	
	
	TempPresentBean presentbean = new TempPresentBean();

	presentbean.setTp_min_price(Integer.parseInt(tp_min_price1));
	presentbean.setTp_p_nm(tp_p_nm1);
	presentbean.setTp_due_dt(tp_due_dt1);
	presentbean.setTp_limit_amount(Integer.parseInt(tp_limit_amount1));
	presentbean.setTp_p_explain(tp_p_explain1);
	
	Mgr.insertTempPresent(presentbean, a);
	
	presentbean.setTp_min_price(Integer.parseInt(tp_min_price2));
	presentbean.setTp_p_nm(tp_p_nm2);
	presentbean.setTp_due_dt(tp_due_dt2);
	presentbean.setTp_limit_amount(Integer.parseInt(tp_limit_amount2));
	presentbean.setTp_p_explain(tp_p_explain2);
	
	Mgr.insertTempPresent(presentbean, a);
	
	presentbean.setTp_min_price(Integer.parseInt(tp_min_price3));
	presentbean.setTp_p_nm(tp_p_nm3);
	presentbean.setTp_due_dt(tp_due_dt3);
	presentbean.setTp_limit_amount(Integer.parseInt(tp_limit_amount3));
	presentbean.setTp_p_explain(tp_p_explain3);
	
	Mgr.insertTempPresent(presentbean, a);
	
	
	
} catch (Exception e) {
	e.printStackTrace();
}



%>

