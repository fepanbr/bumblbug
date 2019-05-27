﻿create table PJ_TB (
	pj_idx int auto_increment primary key,
	pj_title varchar(150) not null,
	pj_short_title varchar(10) not null,
	pj_img varchar(100) not null,
	pj_summary varchar(100) not null,
	pj_category varchar(45) not null,
	pj_url varchar(100) not null,
	search_tag varchar(125) default null,
	profile_img varchar(100),
	leader_nm varchar(20) not null,
	leader_intro mediumtext not null,
	leader_loc varchar(10),
	pj_end_dt date not null,
	pj_intro_video varchar(100) not null,
	pj_sup_num int default 0,
	pj_u_idx int not null,
	pj_f_price varchar(45) default '0',
	pj_story mediumtext,
	obj_price varchar(45) not null,
	pj_reg_dt date default now(),
	ac_no varchar(45) not null,
	ah varchar(20) not null,
	bank_nm varchar(20) not null,
	ah_birth date
);



create table USER_TB (
	u_idx int auto_increment primary key,
	u_img varchar(100),
	u_nm varchar(20) not null,
	u_email varchar(45) not null,
	u_pwd varchar(45) not null,
	u_loc varchar(10),
	u_intro mediumtext,
	sns_con_tf tinyint(1),
	u_website varchar(100),
	news_sub_tf tinyint(1),
	u_ph varchar(45)
);

create table NOTICE_TB (
	b_idx int auto_increment primary key,
	b_time datetime default now(),
	b_content longtext not null,
	b_u_idx int not null,
	b_pj_idx int not null
);

create table COMMENTS_TB (
	c_idx int auto_increment primary key,
	c_content longtext not null,
	c_u_idx int not null,
	c_dt datetime default now(),
	c_b_idx int not null
);

create table PRESENT_TB (
	p_idx int auto_increment primary key,
	min_price int not null,
	p_explain varchar(100) default null,
	due_dt date not null,
	supmem_cnt int default 0,
	limit_amount int default 1,
	del_tf tinyint(1),
	pj_p_idx int
);

create table TAG_TB(
	tag_idx int auto_increment primary key,
	tag_nm varchar(20),
	pj_tag_idx int
);

create table ITEM_TB (
	i_idx int auto_increment primary key,
	i_nm varchar(20),
	i_amount int default 0,
	i_option varchar(100),
	i_p_included int,
	i_included_tf tinyint(1)
);


create table FUND_TB (
	f_idx int auto_increment primary key,
	f_dt date default now(),
	f_deadline date not null,
	f_price int default 1000,
	supmem_idx int,
	f_pj_idx int,
	f_p_idx int,
	f_d_idx int
);


create table DEL_TB (
	d_idx int auto_increment primary key,
	d_u_idx int,
	d_ph varchar(45),
	d_zipcode varchar(10),
	d_addr varchar(100),
	d_detail_addr varchar(100)
);

create table PAY_TB (
	pay_idx int auto_increment primary key,
	pay_means enum('카드') not null,
	pay_price varchar(45) not null,
	pay_st date not null,
	pay_f_idx int not null
);

create table PAY_INFO_TB (
	pay_info_idx int auto_increment primary key,
	pay_u_idx int default null,
	pay_info_means enum('카드') default '카드',
	card_no varchar(45) default null,
	card_valid varchar(45) default null,
	owner_birth varchar(45) default null,
	card_pwd varchar(45) default null,
	owner_ph varchar(45) default null
);

alter table COMMENTS_TB add foreign key (c_b_idx) references NOTICE_TB (b_idx) on delete cascade;
alter table PRESENT_TB add foreign key (pj_p_idx) references PJ_TB (pj_idx) on delete cascade;
alter table ITEM_TB add foreign key (i_p_included) references PRESENT_TB (p_idx) on delete cascade;
alter table FUND_TB add foreign key (supmem_idx) references USER_TB (u_idx) on delete cascade;
alter table FUND_TB add foreign key (f_pj_idx) references PJ_TB (pj_idx) on delete cascade on update cascade;
alter table FUND_TB add foreign key (f_p_idx) references PRESENT_TB (p_idx) on delete cascade on update cascade;
alter table DEL_TB add foreign key (d_u_idx) references USER_TB (u_idx) on delete cascade;
alter table PAY_TB add foreign key (pay_f_idx) references FUND_TB (f_idx) on delete cascade;
alter table PAY_INFO_TB add foreign key (pay_u_idx) references USER_TB (u_idx) on delete cascade;
alter table PJ_TB add foreign key (pj_u_idx) references USER_TB (u_idx) on delete cascade;
alter table NOTICE_TB add foreign key (b_pj_idx) references PJ_TB (pj_idx) on delete cascade;
alter table fund_tb add foreign key(f_d_idx) references del_tb (d_idx) on delete set null;
alter table tag_tb add foreign key(pj_tag_idx) references pj_tb(pj_idx) on delete cascade;

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
	tp_u_idx int not null,
	tp_story mediumtext,
	tp_obj_price varchar(45),
	tp_reg_dt date,
	tp_ac_no varchar(45),
	tp_ah varchar(20),
	tp_bank_nm varchar(20),
	tp_st enum('작성중','승인대기중','완료') default '작성중',
	tp_ah_birth date
);

alter table pay_tb drop column pay_st;
alter table pay_tb add(pay_dt date);
alter table pay_tb add(pay_st enum('펀딩진행중', '펀딩마감'));


