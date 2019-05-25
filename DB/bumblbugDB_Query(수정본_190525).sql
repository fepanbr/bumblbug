create table temp_tb (
	tp_idx int,
	tp_title varchar(150),
	tp_short_title varchar(10),
	tp_img varchar(100),
	tp_summary varchar(100),
	tp_category varchar(45),
	tp_url varchar(100),
	tp_search_tag varchar(125),
	tp_profile_img varchar(100),
	tp_leader_nm varchar(20),
	tp_leader_intro mediumtext,
	tp_leader_loc varchar(10),
	tp_end_dt date,
	tp_intro_video varchar(100),
	tp_u_idx int,
	tp_story mediumtext,
	tp_obj_price varchar(45),
	tp_reg_dt date,
	tp_ac_no varchar(45),
	tp_ah varchar(20),
	tp_bank_nm varchar(20),
	tp_st enum('작정중','승인대기중','완료'),
	tp_ah_birth date
);

alter table pay_tb drop column pay_st;
alter table pay_tb add(pay_dt date);
alter table pay_tb add(pay_st enum('펀딩진행중', '펀딩마감'));

