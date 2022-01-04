package com.board.domain;

import java.util.Date;

public class CustomVO {
	/*
	CREATE TABLE custom(
		busi_num CHAR(20) NOT NULL,
		custom CHAR(20) not null,
		short CHAR(20),
		ceo CHAR(10),
		charge_person CHAR(10),
		busi_condition CHAR(10),
		item CHAR(10),
		post_num CHAR(10),
		addr1 VARCHAR(80),
		addr2 VARCHAR(80),
		tel CHAR(10),
		fax CHAR(10),
		homepage CHAR(20),
		co_yn CHAR(1),
		foreigen_accountyn CHAR(1),
		tax_yn CHAR(1),
		country_eng CHAR(20),
		country_kor CHAR(20),
		special_relation CHAR(1),
		trade_stop CHAR(1),
		contract_period_s DATE,
		contract_period_e DATE,
		regi_info_man CHAR(10),
		regi_info_date DATE,
		modi_info_man CHAR(10),
		modi_info_date DATE,
		PRIMARY KEY(busi_num)
		);
	*/
	private String busi_num;
	private String custom;
	private String Short;
	private String ceo;
	private String charge_person;
	private String busi_condition;
	private String item;
	private String post_num;
	private String addr1;
	private String addr2;
	private String tel;
	private String fax;
	private String homepage;
	private String co_yn;
	private String foregin_yn;
	private String tax_yn;
	private String country_eng;
	private String country_kor;
	private String special_relation;
	private String trade_stop;
	private Date contract_period_s;
	private Date contract_period_e;
	private String regi_info_man;
	private Date regi_info_date;
	private String modi_info_man;
	private Date modi_info_date;
	
	public String getBusi_num() {
		return busi_num;
	}
	public void setBusi_num(String busi_num) {
		this.busi_num = busi_num;
	}
	public String getCustom() {
		return custom;
	}
	public void setCustom(String custom) {
		this.custom = custom;
	}
	public String getShort() {
		return Short;
	}
	public void setShort(String s) {
		Short = s;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getCharge_person() {
		return charge_person;
	}
	public void setCharge_person(String charge_person) {
		this.charge_person = charge_person;
	}
	public String getBusi_condition() {
		return busi_condition;
	}
	public void setBusi_condition(String busi_condition) {
		this.busi_condition = busi_condition;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getPost_num() {
		return post_num;
	}
	public void setPost_num(String post_num) {
		this.post_num = post_num;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getCo_yn() {
		return co_yn;
	}
	public void setCo_yn(String co_yn) {
		this.co_yn = co_yn;
	}
	public String getForegin_yn() {
		return foregin_yn;
	}
	public void setForegin_yn(String foregin_yn) {
		this.foregin_yn = foregin_yn;
	}
	public String getTax_yn() {
		return tax_yn;
	}
	public void setTax_yn(String tax_yn) {
		this.tax_yn = tax_yn;
	}
	public String getCountry_eng() {
		return country_eng;
	}
	public void setCountry_eng(String country_eng) {
		this.country_eng = country_eng;
	}
	public String getCountry_kor() {
		return country_kor;
	}
	public void setCountry_kor(String country_kor) {
		this.country_kor = country_kor;
	}
	public String getSpecial_relation() {
		return special_relation;
	}
	public void setSpecial_relation(String special_relation) {
		this.special_relation = special_relation;
	}
	public String getTrade_stop() {
		return trade_stop;
	}
	public void setTrade_stop(String trade_stop) {
		this.trade_stop = trade_stop;
	}
	public Date getContract_period_s() {
		return contract_period_s;
	}
	public void setContract_period_s(Date contract_period_s) {
		this.contract_period_s = contract_period_s;
	}
	public Date getContract_period_e() {
		return contract_period_e;
	}
	public void setContract_period_e(Date contract_period_e) {
		this.contract_period_e = contract_period_e;
	}
	public String getRegi_info_man() {
		return regi_info_man;
	}
	public void setRegi_info_man(String regi_info_man) {
		this.regi_info_man = regi_info_man;
	}
	public Date getRegi_info_date() {
		return regi_info_date;
	}
	public void setRegi_info_date(Date regi_info_date) {
		this.regi_info_date = regi_info_date;
	}
	public String getModi_info_man() {
		return modi_info_man;
	}
	public void setModi_info_man(String modi_info_man) {
		this.modi_info_man = modi_info_man;
	}
	public Date getModi_info_date() {
		return modi_info_date;
	}
	public void setModi_info_date(Date modi_info_date) {
		this.modi_info_date = modi_info_date;
	}
	
	
}
