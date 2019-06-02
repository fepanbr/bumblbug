package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import Bean.*;
import dbConnection.DBConnectionMgr;

public class ProjectDAO {
	
	private DBConnectionMgr pool;

	public ProjectDAO() {
		try {
			pool = DBConnectionMgr.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// PJ_TB�� ���ڵ� bean set
	public ProjectBean getProject(String pj_idx) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ProjectBean bean = null;
		
		try {
			con = pool.getConnection();
			String sql = "select * from PJ_TB where pj_idx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pj_idx);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				bean = new ProjectBean();
				bean.setPj_idx(rs.getInt("pj_idx"));
				bean.setPj_title(rs.getString("pj_title"));
				bean.setPj_short_title(rs.getString("pj_short_title"));
				bean.setPj_img(rs.getString("pj_img"));
				bean.setPj_summary(rs.getString("pj_summary"));
				bean.setPj_category(rs.getString("pj_category"));
				bean.setPj_url(rs.getString("pj_url"));
				bean.setSearch_tag(rs.getString("search_tag"));
				bean.setProfile_img(rs.getString("profile_img"));
				bean.setLeader_nm(rs.getString("leader_nm"));
				bean.setLeader_intro(rs.getString("leader_intro"));
				bean.setLeader_loc(rs.getString("leader_loc"));
				bean.setPj_end_dt(rs.getString("pj_end_dt"));
				bean.setPj_intro_video(rs.getString("pj_intro_video"));
				bean.setPj_sup_num(rs.getInt("pj_sup_num"));
				bean.setPj_u_idx(rs.getInt("pj_u_idx"));
				bean.setPj_f_price(rs.getString("pj_f_price"));
				bean.setPj_story(rs.getString("pj_story"));
				bean.setObj_price(rs.getString("obj_price"));
				bean.setPj_reg_dt(rs.getString("pj_reg_dt"));
				bean.setAc_no(rs.getString("ac_no"));
				bean.setAh(rs.getString("ah"));
				bean.setBank_nm(rs.getString("bank_nm"));
				bean.setAh_birth(rs.getString("ah_birth"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con);
		}
		
		return bean;
	}
	
	// �ش� ������Ʈ�� PRESENT_TB ���ڵ� ArrayList<Bean> set
	public ArrayList<PresentBean> getPresentList(String pj_idx) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PresentBean bean = null;
		
		ArrayList<PresentBean> list = new ArrayList<PresentBean>();
		
		try {
			con = pool.getConnection();
			String sql = "select * from PRESENT_TB where pj_p_idx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pj_idx);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				bean = new PresentBean();
				
				bean.setP_idx(rs.getInt("p_idx"));
				bean.setMin_price(rs.getInt("min_price"));
				bean.setP_nm(rs.getString("p_nm"));
				bean.setP_explain(rs.getString("p_explain"));
				bean.setDue_dt(rs.getString("due_dt"));
				bean.setSupmem_cnt(rs.getInt("supmem_cnt"));
				bean.setLimit_amount(rs.getInt("limit_amount"));
				bean.setPj_p_idx(rs.getInt("pj_p_idx"));
				
				
				list.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con);
		}
		return list;
	}
	
	// ���αݾ�%
	public String goalAmount(String cprice, String gprice){
		
		double c_price = Double.valueOf(cprice);
		double g_price = Double.valueOf(gprice);
		
		int goal = (int)((c_price / g_price) * 100.0);
		
		String goalAmount = String.valueOf(goal);
		
		return goalAmount;
	}
	
	// ���� �ð�
//	public long dDAY(String endDate) {
//		
//		try{
//	        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-mm-dd", Locale.KOREA);
//	        // date1, date2 �� ��¥�� parse()�� ���� Date������ ��ȯ.
//	        Date dDate = format1.parse(endDate);
//
//	        String time =  format1.format(new Date());
//	        Date today =  format1.parse(time);
//	        
//	        System.out.println(dDate + " / " + today);
//	        
//	        // Date�� ��ȯ�� �� ��¥�� ����� �� �� ���ϰ����� long type ������ �ʱ�ȭ �ϰ� �ִ�.
//	        // ������ -950400000. long type ���� return �ȴ�.
//	        long calDate = dDate.getTime() - today.getTime(); 
//	        
//	        // Date.getTime() �� �ش糯¥�� ��������1970�� 00:00:00 ���� �� �ʰ� �귶������ ��ȯ���ش�. 
//	        // ���� 24*60*60*1000(�� �ð����� ���� ������) �� �����ָ� �ϼ��� ���´�.
//	        long dDay = calDate / ( 24*60*60*1000); 
//	 
//	        dDay = Math.abs(dDay);
//	        
//	        return dDay;
//	        }
//	        catch(ParseException e)
//	        {
//	        	e.printStackTrace();
//	        	return -1;
//	        }
//		
//		
//	}
	
	// �ش� ������Ʈ���� ���õ� ���� PresentBean set
	public PresentBean getPresent(int p_idx) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PresentBean bean = null;
		
		try {
			con = pool.getConnection();
			String sql = "select * from PRESENT_TB where p_idx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, p_idx);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				bean = new PresentBean();
				bean.setP_idx(rs.getInt("p_idx"));
				bean.setMin_price(rs.getInt("min_price"));
				bean.setP_nm(rs.getString("p_nm"));
				bean.setP_explain(rs.getString("p_explain"));
				bean.setDue_dt(rs.getString("due_dt"));
				bean.setSupmem_cnt(rs.getInt("supmem_cnt"));
				bean.setLimit_amount(rs.getInt("limit_amount"));
				bean.setPj_p_idx(rs.getInt("pj_p_idx"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con);
		}
		
		return bean;
	}
	
	// �ش� ȸ���� ��������, ����� ���� �Է� ��Ȳ üũ
	public int checkUserCase(String u_idx) {
		
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		
		try {
			con = pool.getConnection();
			
			String sql1 = "select pay_info_idx from PAY_INFO_TB where pay_u_idx = ?";
			String sql2 = "select d_idx from DEL_Tb where d_u_idx = ?";
			
			pstmt1 = con.prepareStatement(sql1);
			pstmt1.setString(1, u_idx);
			pstmt2 = con.prepareStatement(sql2);
			pstmt2.setString(1, u_idx);
			
			boolean flag1 = pstmt1.executeQuery().next(); // �ش� ȸ���� ī������ ���� ���� ����
			boolean flag2 = pstmt2.executeQuery().next(); // �ش� ȸ���� ������� ���� ����
			
			if(flag1) {
				
				if(flag2) {
					
					result = 3; // �ش� ȸ���� ī������ ����, ����� ������ ��� ��ȿ��.
					
				} else {
					
					result = 2; // �ش� ȸ���� ī������ ���� ��, ����� ����  ��.
					
				}
				
			} else {
				
				result = 1; // �ش� ȸ���� ī������ ����, ����� ���� ��� ����.
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con);
		}
		
		return result;
	}
	
	// �ش� ȸ���� ����� ��� ArrayList<Bean> set
	public ArrayList<DelBean> getDelList(String u_idx) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DelBean bean = null;
		
		ArrayList<DelBean> list = new ArrayList<DelBean>();
		
		try {
			con = pool.getConnection();
			String sql = "select * from DEL_TB where d_u_idx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, u_idx);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				bean = new DelBean();
				bean.setD_idx(rs.getInt("d_idx"));
				bean.setD_u_idx(rs.getInt("d_u_idx"));
				bean.setD_ph(rs.getString("d_ph"));
				bean.setD_zipcode(rs.getString("d_zipcode"));
				bean.setD_addr(rs.getString("d_addr"));
				bean.setD_detail_addr(rs.getString("d_detail_addr"));
				list.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con);
		}
		return list;
	}
	
	// DEL_TB�� ���ڵ� bean set
	public DelBean getDel(String u_idx) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DelBean bean = null;
		
		try {
			con = pool.getConnection();
			String sql = "select * from DEL_TB where d_u_idx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, u_idx);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				bean = new DelBean();
				bean.setD_idx(rs.getInt("d_idx"));
				bean.setD_u_idx(rs.getInt("d_u_idx"));
				bean.setD_ph(rs.getString("d_ph"));
				bean.setD_zipcode(rs.getString("d_zipcode"));
				bean.setD_addr(rs.getString("d_addr"));
				bean.setD_detail_addr(rs.getString("d_detail_addr"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con);
		}
		
		return bean;
	}
	
	// PAY_INFO_TB ���ڵ� insert
	public void insertPayInfo(PayInfoBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		
		try {
			con = pool.getConnection();
			sql = "insert PAY_INFO_TB(pay_u_idx, card_no, card_valid"
					+ ", owner_birth, card_pwd, owner_ph)values(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bean.getPay_u_idx());
			pstmt.setString(2, bean.getCard_no());
			pstmt.setString(3, bean.getCard_valid());
			pstmt.setString(4, bean.getOwner_birth());
			pstmt.setString(5, bean.getCard_pwd());
			pstmt.setString(6, bean.getOwner_ph());
			if (pstmt.executeUpdate() == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return;
	}
	
	// DEL_TB ���ڵ� insert
	public Boolean insertDel(DelBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Boolean flag=null;
		
		try {
			con = pool.getConnection();
			String sql = "insert DEL_TB(d_u_idx, d_ph, d_zipcode, d_addr, d_detail_addr)"
							+"values(?,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bean.getD_u_idx());
			pstmt.setString(2, bean.getD_ph());
			pstmt.setString(3, bean.getD_zipcode());
			pstmt.setString(4, bean.getD_addr());
			pstmt.setString(5, bean.getD_detail_addr());
			
			if (pstmt.executeUpdate() == 1) {
				flag = true;
				System.out.println("del ����");
				}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	// insertDel()���� DEL_TB�� insert��  ���ڵ� d_idx ���
		public int setDelidx(DelBean bean) {
			int d_idx = 0;
			
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				con = pool.getConnection();
				String sql = "select d_idx from DEL_TB where d_u_idx=? and d_ph=? and d_zipcode=? and d_addr=? and d_detail_addr=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, bean.getD_u_idx());
				pstmt.setString(2, bean.getD_ph());
				pstmt.setString(3, bean.getD_zipcode());
				pstmt.setString(4, bean.getD_addr());
				pstmt.setString(5, bean.getD_detail_addr());
				rs = pstmt.executeQuery();
				if (rs.next()) {
					d_idx = rs.getInt("d_idx");
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con);
			}
			
			return d_idx;
		}
	
	// FUND_TB ���ڵ� insert
	public Boolean insertFund(FundBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Boolean flag=null;
		
		try {
			con = pool.getConnection();
			String sql = "insert FUND_TB(f_dt, f_deadline, f_price, supmem_idx, f_pj_idx , f_p_idx, f_d_idx)"
							+"values(?,?,?,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getF_dt());
			pstmt.setString(2, bean.getF_deadline());
			pstmt.setInt(3, bean.getF_price());
			pstmt.setInt(4, bean.getSupmem_idx());
			pstmt.setInt(5, bean.getF_pj_idx());
			pstmt.setInt(6, bean.getF_p_idx());
			pstmt.setInt(7, bean.getF_d_idx());
			
			if (pstmt.executeUpdate() == 1) {
				flag = true;
				System.out.println("fund ����");}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	// insertFund()���� FUND_TB�� insert��  ���ڵ� f_idx ���
	public int setFundidx(FundBean bean) {
		int f_idx = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection();
			String sql = "select f_idx from FUND_TB where f_dt=? and f_deadline=? and f_price=? and supmem_idx=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getF_dt());
			pstmt.setString(2, bean.getF_deadline());
			pstmt.setInt(3, bean.getF_price());
			pstmt.setInt(4, bean.getSupmem_idx());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				f_idx = rs.getInt("f_idx");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con);
		}
		
		return f_idx;
	}

	// PAY_TB ���ڵ� insert
	public Boolean insertPay(PayBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Boolean flag=null;
		
		try {
			con = pool.getConnection();
			String sql = "insert PAY_TB(pay_price, pay_f_idx, pay_dt)"
							+"values(?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bean.getPay_price());
			pstmt.setInt(2, bean.getPay_f_idx());
			pstmt.setString(3, bean.getPay_dt());
			
			if (pstmt.executeUpdate() == 1)
				flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	// �Ŀ� �Ϸ� �� 
	//  PJ_TB > (pj_sup_num ++) & (pj_s_price ++)
	public Boolean updateProject(ProjectBean bean, int u_idx) {
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		Boolean flag = null;
		
		int f_price = 0;
		int s_price = 0;
		
		try {
			con = pool.getConnection();
			
			String sql1 = "select f_price from FUND_TB where f_pj_idx=? and supmem_idx=?"; // �Ŀ��� �ݾ� select
			pstmt1 = con.prepareStatement(sql1);
			pstmt1.setInt(1, bean.getPj_idx());
			pstmt1.setInt(2, u_idx);
			rs = pstmt1.executeQuery();
			if (rs.next()) {
				f_price = rs.getInt("f_price");
			}
			
			// ȸ���� �Ŀ��� �ݾ� + ������Ʈ �� �Ŀ� �ݾ�
			s_price = f_price + Integer.parseInt(bean.getPj_f_price());
			
			String sql2 = "update PJ_TB set pj_sup_num=?, pj_f_price=? where pj_idx=?";
			pstmt2 = con.prepareStatement(sql2);
			pstmt2.setInt(1, bean.getPj_sup_num()+1); // �Ŀ��ڼ�++
			pstmt2.setInt(2, s_price);
			pstmt2.setInt(3, bean.getPj_idx());
			
			if (pstmt2.executeUpdate() == 1)
				flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt1);
		}
		return flag;
	}
	
	// �Ŀ� �Ϸ� �� 
	// PRESENT_TB > (supmem_cnt ++)
	public Boolean updatePresent(PresentBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Boolean flag=null;
		
		try {
			con = pool.getConnection();
			String sql = "update PRESENT_TB set supmem_cnt=? where p_idx=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bean.getSupmem_cnt()+1);
			pstmt.setInt(2, bean.getP_idx());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}

}
