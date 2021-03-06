package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Bean.ProjectBean;
import dbConnection.DBConnectionMgr;


public class MainDAO { 

    private DBConnectionMgr pool;
    
    public MainDAO() {
       try {
          pool = DBConnectionMgr.getInstance();
       }catch(Exception e) {
          e.printStackTrace();
       }
    }

    public ArrayList<ProjectBean> getAllProject(){
    	
    	Connection con = null; 
    	PreparedStatement pstmt = null; 
    	ResultSet rs = null; 
    	String sql = null; 
    	
    	ArrayList<ProjectBean> pjlist = new ArrayList<ProjectBean>();
    	
    	try {
    		con = pool.getConnection();
    		sql = "select PJ.pj_idx, PJ.pj_title, PJ.pj_img, PJ.pj_url, PJ.leader_nm, PJ.pj_end_dt, PJ.pj_reg_dt, PJ.pj_f_price, PJ.obj_price from pj_tb PJ;";
    		pstmt = con.prepareStatement(sql);
//    		pstmt.setString(1, u_idx);
    		rs = pstmt.executeQuery();
    		while(rs.next()) {
    			ProjectBean pjBean = new ProjectBean();
    			pjBean.setPj_idx(rs.getInt("pj_idx"));
    			pjBean.setPj_title(rs.getString("pj_title"));
    			pjBean.setPj_img(rs.getString("pj_img"));
    			pjBean.setPj_url(rs.getString("pj_url"));
    			pjBean.setLeader_nm(rs.getString("leader_nm"));
    			pjBean.setPj_reg_dt(rs.getString("pj_reg_dt"));
    			pjBean.setPj_end_dt(rs.getString("pj_end_dt"));
    			pjBean.setPj_f_price(rs.getString("pj_f_price"));
    			pjBean.setObj_price(rs.getString("obj_price"));
    			
    			pjlist.add(pjBean);
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		pool.freeConnection(con, pstmt, rs);
    	}
    	
    	return pjlist;
    }
    
    public ArrayList<ProjectBean> getRecommProject(){
    	Connection con = null; 
    	PreparedStatement pstmt = null; 
    	ResultSet rs = null; 
    	String sql = null; 
    	
    	ArrayList<ProjectBean> recommlist = new ArrayList<ProjectBean>();
    	try {
    		con = pool.getConnection();
    		sql = "select PJ.pj_idx, PJ.pj_title, PJ.pj_img, PJ.pj_url, PJ.leader_nm, PJ.pj_end_dt, PJ.pj_reg_dt, PJ.pj_f_price, PJ.obj_price, PJ.pj_sup_num \r\n" + 
    				"from pj_tb PJ\r\n" + 
    				"WHERE  pj_f_price >24224 AND pj_sup_num >4000 ;";
    		pstmt = con.prepareStatement(sql);
//    		pstmt.setString(1, u_idx);
    		rs = pstmt.executeQuery();
    		while(rs.next()) {
    			ProjectBean pjBean = new ProjectBean();
    			pjBean.setPj_idx(rs.getInt("pj_idx"));
    			pjBean.setPj_title(rs.getString("pj_title"));
    			pjBean.setPj_img(rs.getString("pj_img"));
    			pjBean.setPj_url(rs.getString("pj_url"));
    			pjBean.setLeader_nm(rs.getString("leader_nm"));
    			pjBean.setPj_reg_dt(rs.getString("pj_reg_dt"));
    			pjBean.setPj_end_dt(rs.getString("pj_end_dt"));
    			pjBean.setPj_f_price(rs.getString("pj_f_price"));
    			pjBean.setObj_price(rs.getString("obj_price"));
    			pjBean.setPj_sup_num(rs.getInt("pj_sup_num"));
    			
    			
    			recommlist.add(pjBean);
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		pool.freeConnection(con, pstmt, rs);
    	}   	
    	return recommlist;
    }// end of recommProject    
 
    public ArrayList<ProjectBean> getNewProject(){
    	Connection con = null; 
    	PreparedStatement pstmt = null; 
    	ResultSet rs = null; 
    	String sql = null; 
    	
    	ArrayList<ProjectBean> newlist = new ArrayList<ProjectBean>();
    	try {
    		con = pool.getConnection();
    		sql = "select PJ.pj_idx, PJ.pj_title, PJ.pj_img, PJ.pj_url, PJ.leader_nm, PJ.pj_end_dt, PJ.pj_reg_dt, PJ.pj_f_price, PJ.obj_price, PJ.pj_sup_num \r\n" + 
    				"from pj_tb PJ\r\n" + 
    				"WHERE pj_reg_dt >= DATE_ADD(NOW(), INTERVAL -4 DAY) ;";
    		pstmt = con.prepareStatement(sql);
//    		pstmt.setString(1, u_idx);
    		rs = pstmt.executeQuery();
    		while(rs.next()) {
    			ProjectBean pjBean = new ProjectBean();
    			pjBean.setPj_idx(rs.getInt("pj_idx"));
    			pjBean.setPj_title(rs.getString("pj_title"));
    			pjBean.setPj_img(rs.getString("pj_img"));
    			pjBean.setPj_url(rs.getString("pj_url"));
    			pjBean.setLeader_nm(rs.getString("leader_nm"));
    			pjBean.setPj_reg_dt(rs.getString("pj_reg_dt"));
    			pjBean.setPj_end_dt(rs.getString("pj_end_dt"));
    			pjBean.setPj_f_price(rs.getString("pj_f_price"));
    			pjBean.setObj_price(rs.getString("obj_price"));
    			
    			newlist.add(pjBean);
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		pool.freeConnection(con, pstmt, rs);
    	}
    	return newlist;
    }// end of newProject    
    
    public ArrayList<ProjectBean> getEndProject(){
    	Connection con = null; 
    	PreparedStatement pstmt = null; 
    	ResultSet rs = null; 
    	String sql = null; 
    	
    	ArrayList<ProjectBean> endlist = new ArrayList<ProjectBean>();
    	try {
    		con = pool.getConnection();
    		sql = "select PJ.pj_idx, PJ.pj_title, PJ.pj_end_dt, PJ.pj_reg_dt, PJ.pj_img, PJ.pj_url, PJ.leader_nm, PJ.pj_f_price, PJ.obj_price, PJ.pj_sup_num from pj_tb PJ WHERE TO_DAYS(pj_end_dt) - TO_DAYS(pj_reg_dt) <3;";
    		pstmt = con.prepareStatement(sql);
//    		pstmt.setString(1, u_idx);
    		rs = pstmt.executeQuery();
    		
    		while(rs.next()) {
    			ProjectBean pjBean = new ProjectBean();
    			pjBean.setPj_idx(rs.getInt("pj_idx"));
    			pjBean.setPj_title(rs.getString("pj_title"));
    			pjBean.setPj_img(rs.getString("pj_img"));
    			pjBean.setPj_url(rs.getString("pj_url"));
    			pjBean.setLeader_nm(rs.getString("leader_nm"));
    			pjBean.setPj_reg_dt(rs.getString("pj_reg_dt"));
    			pjBean.setPj_end_dt(rs.getString("pj_end_dt"));
    			pjBean.setPj_f_price(rs.getString("pj_f_price"));
    			pjBean.setObj_price(rs.getString("obj_price"));
    			
    			endlist.add(pjBean);
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		pool.freeConnection(con, pstmt, rs);
    	}
    	return endlist;
    }// end of endProject   
   
    public ArrayList<ProjectBean> getGameProject(){
    	Connection con = null; 
    	PreparedStatement pstmt = null; 
    	ResultSet rs = null; 
    	String sql = null; 
    	
    	ArrayList<ProjectBean> gamelist = new ArrayList<ProjectBean>();
    	try {
    		con = pool.getConnection();
    		sql = "select PJ.pj_idx, PJ.pj_title, PJ.pj_end_dt, PJ.pj_reg_dt, PJ.pj_img, PJ.pj_url, PJ.leader_nm, PJ.pj_f_price, PJ.obj_price, PJ.pj_sup_num  \r\n" + 
    				"from pj_tb PJ\r\n" + 
    				"WHERE pj_category='game';";
    		pstmt = con.prepareStatement(sql);
//    		pstmt.setString(1, u_idx);
    		rs = pstmt.executeQuery();
    		
    		while(rs.next()) {
    			ProjectBean pjBean = new ProjectBean();
    			pjBean.setPj_idx(rs.getInt("pj_idx"));
    			pjBean.setPj_title(rs.getString("pj_title"));
    			pjBean.setPj_img(rs.getString("pj_img"));
    			pjBean.setPj_url(rs.getString("pj_url"));
    			pjBean.setLeader_nm(rs.getString("leader_nm"));
    			pjBean.setPj_reg_dt(rs.getString("pj_reg_dt"));
    			pjBean.setPj_end_dt(rs.getString("pj_end_dt"));
    			pjBean.setPj_f_price(rs.getString("pj_f_price"));
    			pjBean.setObj_price(rs.getString("obj_price"));
    			
    			gamelist.add(pjBean);
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		pool.freeConnection(con, pstmt, rs);
    	}
    	return gamelist;
    }// end of categoryProject
    
    
   

  

}