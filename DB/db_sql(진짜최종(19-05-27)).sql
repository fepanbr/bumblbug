-- MySQL Script generated by MySQL Workbench
-- Mon May 27 22:18:14 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema website2
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema website3
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema website3
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `website3` DEFAULT CHARACTER SET utf8 ;
USE `website3` ;

-- -----------------------------------------------------
-- Table `website3`.`user_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`user_tb` (
  `u_idx` INT(11) NOT NULL AUTO_INCREMENT COMMENT '회원 인덱스',
  `u_img` VARCHAR(100) NULL DEFAULT NULL COMMENT '회원 이미지',
  `u_nm` VARCHAR(20) NOT NULL COMMENT '회원 이름',
  `u_email` VARCHAR(45) NOT NULL COMMENT '회원이메일',
  `u_pwd` VARCHAR(45) NOT NULL COMMENT '회원 비밀번호',
  `u_loc` VARCHAR(10) NULL DEFAULT NULL COMMENT '회원 활동지역',
  `u_intro` MEDIUMTEXT NULL DEFAULT NULL COMMENT '회원 소개',
  `sns_con_tf` TINYINT(1) NULL DEFAULT NULL COMMENT '회원 sns연동유무',
  `u_website` VARCHAR(100) NULL DEFAULT NULL COMMENT '회원 사이트 주소',
  `news_sub_tf` TINYINT(1) NULL DEFAULT NULL COMMENT '회원 뉴스구독 유무',
  `u_ph` VARCHAR(45) NULL DEFAULT NULL COMMENT '회원 폰번호',
  PRIMARY KEY (`u_idx`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `website3`.`pj_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`pj_tb` (
  `pj_idx` INT(11) NOT NULL AUTO_INCREMENT COMMENT '프로젝트 인덱스',
  `pj_title` VARCHAR(150) NOT NULL COMMENT '프로젝트 제목',
  `pj_short_title` VARCHAR(10) NOT NULL COMMENT '프로젝트 짧은 제목',
  `pj_img` VARCHAR(100) NOT NULL COMMENT '프로젝트 이미지',
  `pj_summary` VARCHAR(100) NOT NULL COMMENT '프로젝트 요약',
  `pj_category` VARCHAR(45) NOT NULL COMMENT '프로젝트 카테고리',
  `pj_url` VARCHAR(100) NOT NULL COMMENT '프로젝트 주소',
  `search_tag` VARCHAR(125) NULL DEFAULT NULL COMMENT '검색 태그',
  `profile_img` VARCHAR(100) NULL DEFAULT NULL COMMENT '진행자 프로필 이미지',
  `leader_nm` VARCHAR(20) NOT NULL COMMENT '진행자 이름',
  `leader_intro` MEDIUMTEXT NOT NULL COMMENT '진행자 소개',
  `leader_loc` VARCHAR(10) NULL DEFAULT NULL COMMENT '진행자 활동지역',
  `pj_end_dt` DATE NOT NULL COMMENT '프로젝트 마감 날짜',
  `pj_intro_video` VARCHAR(100) NOT NULL COMMENT '프로젝트 소개 영상',
  `pj_sup_num` INT(11) NULL DEFAULT 0 COMMENT '프로젝트 후원자 수',
  `pj_u_idx` INT(11) NOT NULL COMMENT '프로젝트를 진행하는 회원 idx',
  `pj_f_price` VARCHAR(45) NULL DEFAULT '0' COMMENT '프로젝트 후원 금액',
  `pj_story` MEDIUMTEXT NULL DEFAULT NULL COMMENT '프로젝트 스토리',
  `obj_price` VARCHAR(45) NOT NULL COMMENT '목표금액',
  `pj_reg_dt` DATE NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '프로젝트 등록 날짜',
  `ac_no` VARCHAR(45) NOT NULL COMMENT '계좌번호',
  `ah` VARCHAR(20) NOT NULL COMMENT '계좌소유주',
  `bank_nm` VARCHAR(20) NOT NULL COMMENT '은행이름',
  `ah_birth` DATE NULL DEFAULT NULL COMMENT '소유주 생년월일',
  PRIMARY KEY (`pj_idx`),
  INDEX `pj_u_idx` (`pj_u_idx` ASC) VISIBLE,
  CONSTRAINT `pj_tb_ibfk_1`
    FOREIGN KEY (`pj_u_idx`)
    REFERENCES `website3`.`user_tb` (`u_idx`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `website3`.`notice_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`notice_tb` (
  `b_idx` INT(11) NOT NULL AUTO_INCREMENT COMMENT '게시글 인덱스',
  `b_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '게시글 등록시간',
  `b_content` LONGTEXT NOT NULL COMMENT '게시글 내용',
  `b_u_idx` INT(11) NOT NULL COMMENT '게시한 유저 인덱스',
  `b_pj_idx` INT(11) NOT NULL COMMENT '게시글이 속한 프로젝트의 인덱스',
  PRIMARY KEY (`b_idx`),
  INDEX `b_pj_idx` (`b_pj_idx` ASC) VISIBLE,
  CONSTRAINT `notice_tb_ibfk_1`
    FOREIGN KEY (`b_pj_idx`)
    REFERENCES `website3`.`pj_tb` (`pj_idx`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `website3`.`comments_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`comments_tb` (
  `c_idx` INT(11) NOT NULL AUTO_INCREMENT COMMENT '댓글인덱스',
  `c_content` LONGTEXT NOT NULL COMMENT '댓글내용',
  `c_u_idx` INT(11) NOT NULL COMMENT '댓글쓴유저',
  `c_dt` DATETIME NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '댓글쓴시각',
  `c_b_idx` INT(11) NOT NULL COMMENT '게시글인덱스',
  PRIMARY KEY (`c_idx`),
  INDEX `c_b_idx` (`c_b_idx` ASC) VISIBLE,
  CONSTRAINT `comments_tb_ibfk_1`
    FOREIGN KEY (`c_b_idx`)
    REFERENCES `website3`.`notice_tb` (`b_idx`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `website3`.`del_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`del_tb` (
  `d_idx` INT(11) NOT NULL AUTO_INCREMENT COMMENT '배송인덱스',
  `d_u_idx` INT(11) NULL DEFAULT NULL COMMENT '배송정보를 가지고있는 회원 인덱스',
  `d_ph` VARCHAR(45) NULL DEFAULT NULL COMMENT '배송받는사람 폰번호',
  `d_zipcode` VARCHAR(10) NULL DEFAULT NULL COMMENT '배송지우편번호',
  `d_addr` VARCHAR(100) NULL DEFAULT NULL COMMENT '배송지주소',
  `d_detail_addr` VARCHAR(100) NULL DEFAULT NULL COMMENT '배송지상세주소',
  PRIMARY KEY (`d_idx`),
  INDEX `d_u_idx` (`d_u_idx` ASC) VISIBLE,
  CONSTRAINT `del_tb_ibfk_1`
    FOREIGN KEY (`d_u_idx`)
    REFERENCES `website3`.`user_tb` (`u_idx`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `website3`.`present_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`present_tb` (
  `p_idx` INT(11) NOT NULL AUTO_INCREMENT COMMENT '선물 인덱스',
  `min_price` INT(11) NOT NULL COMMENT '최소금액',
  `p_explain` VARCHAR(100) NULL DEFAULT NULL COMMENT '선물 설명',
  `due_dt` DATE NOT NULL COMMENT '선물마감날짜',
  `supmem_cnt` INT(11) NULL DEFAULT 0 COMMENT '선물후원자수',
  `limit_amount` INT(11) NULL DEFAULT 1 COMMENT '제한수량',
  `del_tf` TINYINT(1) NULL DEFAULT NULL COMMENT '선물배송유무',
  `pj_p_idx` INT(11) NULL DEFAULT NULL COMMENT '선물이 속한 프로젝트 인덱스',
  PRIMARY KEY (`p_idx`),
  INDEX `pj_p_idx` (`pj_p_idx` ASC) VISIBLE,
  CONSTRAINT `present_tb_ibfk_1`
    FOREIGN KEY (`pj_p_idx`)
    REFERENCES `website3`.`pj_tb` (`pj_idx`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `website3`.`fund_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`fund_tb` (
  `f_idx` INT(11) NOT NULL AUTO_INCREMENT COMMENT '후원인덱스',
  `f_dt` DATE NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '후원한 날짜',
  `f_deadline` DATE NOT NULL COMMENT '후원마감일',
  `f_price` INT(11) NULL DEFAULT 1000 COMMENT '후원금액',
  `supmem_idx` INT(11) NULL DEFAULT NULL COMMENT '후원자인덱스',
  `f_pj_idx` INT(11) NULL DEFAULT NULL COMMENT '후원한 프로젝트의 인덱스',
  `f_p_idx` INT(11) NULL DEFAULT NULL COMMENT '후원한 선물 인덱스',
  `f_d_idx` INT(11) NULL DEFAULT NULL COMMENT '후원 선물 배송인덱스',
  PRIMARY KEY (`f_idx`),
  INDEX `supmem_idx` (`supmem_idx` ASC) VISIBLE,
  INDEX `f_pj_idx` (`f_pj_idx` ASC) VISIBLE,
  INDEX `f_p_idx` (`f_p_idx` ASC) VISIBLE,
  INDEX `f_d_idx` (`f_d_idx` ASC) VISIBLE,
  CONSTRAINT `fund_tb_ibfk_1`
    FOREIGN KEY (`supmem_idx`)
    REFERENCES `website3`.`user_tb` (`u_idx`)
    ON DELETE CASCADE,
  CONSTRAINT `fund_tb_ibfk_2`
    FOREIGN KEY (`f_pj_idx`)
    REFERENCES `website3`.`pj_tb` (`pj_idx`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fund_tb_ibfk_3`
    FOREIGN KEY (`f_p_idx`)
    REFERENCES `website3`.`present_tb` (`p_idx`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fund_tb_ibfk_4`
    FOREIGN KEY (`f_d_idx`)
    REFERENCES `website3`.`del_tb` (`d_idx`)
    ON DELETE SET NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `website3`.`item_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`item_tb` (
  `i_idx` INT(11) NOT NULL AUTO_INCREMENT COMMENT '아이템 인덱스',
  `i_nm` VARCHAR(20) NULL DEFAULT NULL COMMENT '아이템 이름',
  `i_amount` INT(11) NULL DEFAULT 0 COMMENT '아이템 수량',
  `i_option` VARCHAR(100) NULL DEFAULT NULL COMMENT '아이템 옵션',
  `i_p_included` INT(11) NULL DEFAULT NULL COMMENT '선물에 포함된 아이템',
  `i_included_tf` TINYINT(1) NULL DEFAULT NULL COMMENT '아이템 포함 유무',
  PRIMARY KEY (`i_idx`),
  INDEX `i_p_included` (`i_p_included` ASC) VISIBLE,
  CONSTRAINT `item_tb_ibfk_1`
    FOREIGN KEY (`i_p_included`)
    REFERENCES `website3`.`present_tb` (`p_idx`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `website3`.`pay_info_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`pay_info_tb` (
  `pay_info_idx` INT(11) NOT NULL AUTO_INCREMENT COMMENT '결제정보인덱스',
  `pay_u_idx` INT(11) NULL DEFAULT NULL COMMENT '결제정보를 갖고있는 회원 인덱스',
  `pay_info_means` ENUM('카드') NULL DEFAULT '카드' COMMENT '결제 정보 수단',
  `card_no` VARCHAR(45) NULL DEFAULT NULL COMMENT '카드 번호',
  `card_valid` VARCHAR(45) NULL DEFAULT NULL COMMENT '카드 유효기간',
  `owner_birth` VARCHAR(45) NULL DEFAULT NULL COMMENT '소유주 생년월일',
  `card_pwd` VARCHAR(45) NULL DEFAULT NULL COMMENT '카드비밀번호앞2자리',
  `owner_ph` VARCHAR(45) NULL DEFAULT NULL COMMENT '소유주폰번호',
  PRIMARY KEY (`pay_info_idx`),
  INDEX `pay_u_idx` (`pay_u_idx` ASC) VISIBLE,
  CONSTRAINT `pay_info_tb_ibfk_1`
    FOREIGN KEY (`pay_u_idx`)
    REFERENCES `website3`.`user_tb` (`u_idx`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `website3`.`pay_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`pay_tb` (
  `pay_idx` INT(11) NOT NULL AUTO_INCREMENT COMMENT '결제 인덱스',
  `pay_means` ENUM('카드') NOT NULL COMMENT '결제수단',
  `pay_price` VARCHAR(45) NOT NULL COMMENT '결제 금액',
  `pay_f_idx` INT(11) NOT NULL COMMENT '결제를 한 후원 인덱스',
  `pay_dt` DATE NULL DEFAULT NULL COMMENT '결제 날짜',
  `pay_st` ENUM('펀딩진행중', '펀딩마감') NULL DEFAULT NULL COMMENT '결제 상태',
  PRIMARY KEY (`pay_idx`),
  INDEX `pay_f_idx` (`pay_f_idx` ASC) VISIBLE,
  CONSTRAINT `pay_tb_ibfk_1`
    FOREIGN KEY (`pay_f_idx`)
    REFERENCES `website3`.`fund_tb` (`f_idx`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `website3`.`tag_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`tag_tb` (
  `tag_idx` INT(11) NOT NULL AUTO_INCREMENT COMMENT '태그인덱스',
  `tag_nm` VARCHAR(20) NULL DEFAULT NULL COMMENT '태그이름',
  `pj_tag_idx` INT(11) NULL DEFAULT NULL COMMENT '태그가 속한 프로젝트인덱스',
  PRIMARY KEY (`tag_idx`),
  INDEX `pj_tag_idx` (`pj_tag_idx` ASC) VISIBLE,
  CONSTRAINT `tag_tb_ibfk_1`
    FOREIGN KEY (`pj_tag_idx`)
    REFERENCES `website3`.`pj_tb` (`pj_idx`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `website3`.`temp_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `website3`.`temp_tb` (
  `tp_idx` INT(11) NULL DEFAULT NULL COMMENT '임시 인덱스',
  `tp_title` VARCHAR(150) NULL DEFAULT NULL COMMENT '임시 프로젝트 제목',
  `tp_short_title` VARCHAR(10) NULL DEFAULT NULL COMMENT '임시 짧은 프로젝트 제목',
  `tp_img` VARCHAR(100) NULL DEFAULT NULL COMMENT '임시 이미지',
  `tp_summary` VARCHAR(100) NULL DEFAULT NULL COMMENT '임시 요약',
  `tp_category` VARCHAR(45) NULL DEFAULT NULL COMMENT '임시 카테고리',
  `tp_url` VARCHAR(100) NULL DEFAULT NULL COMMENT '임시 주소',
  `tp_search_tag` VARCHAR(125) NULL DEFAULT NULL COMMENT '임시 검색 태그',
  `tp_profile_img` VARCHAR(100) NULL DEFAULT NULL COMMENT '임시 프로필 이미지',
  `tp_leader_nm` VARCHAR(20) NULL DEFAULT NULL COMMENT '임시 진행자 이름',
  `tp_leader_intro` MEDIUMTEXT NULL DEFAULT NULL COMMENT '임시 진행자 소개',
  `tp_leader_loc` VARCHAR(10) NULL DEFAULT NULL COMMENT '임시 진행자 활동지역',
  `tp_end_dt` DATE NULL DEFAULT NULL COMMENT '임시 마감 날짜',
  `tp_intro_video` VARCHAR(100) NULL DEFAULT NULL COMMENT '임시 소개 영상',
  `tp_u_idx` INT(11) NOT NULL COMMENT '임시 회원 인덱스',
  `tp_story` MEDIUMTEXT NULL DEFAULT NULL COMMENT '임시 스토리',
  `tp_obj_price` VARCHAR(45) NULL DEFAULT NULL COMMENT '임시 목표 금액',
  `tp_reg_dt` DATE NULL DEFAULT NULL COMMENT '임시 등록 날짜',
  `tp_ac_no` VARCHAR(45) NULL DEFAULT NULL COMMENT '임시 계좌 번호',
  `tp_ah` VARCHAR(20) NULL DEFAULT NULL COMMENT '임시 소유주',
  `tp_bank_nm` VARCHAR(20) NULL DEFAULT NULL COMMENT '임시 은행 이름',
  `tp_st` ENUM('작성중', '승인대기중', '완료') NULL DEFAULT '작성중' COMMENT '임시 상태',
  `tp_ah_birth` DATE NULL DEFAULT NULL COMMENT '임시 소유주 생년월일')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
