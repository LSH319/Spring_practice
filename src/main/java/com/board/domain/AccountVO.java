package com.board.domain;

public class AccountVO {
/*
 CREATE TABLE ACCOUNT(
	busi_num CHAR(20) NOT NULL,
	factory CHAR(20),
	trade_bank CHAR(20),
	account_num CHAR(20),
	PRIMARY KEY(busi_num)
); 
 */
	private String busi_num;
	private String factory;
	private String trade_bank;
	private String account_num;
	
	
	public String getBusi_num() {
		return busi_num;
	}
	public void setBusi_num(String busi_num) {
		this.busi_num = busi_num;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getTrade_bank() {
		return trade_bank;
	}
	public void setTrade_bank(String trade_bank) {
		this.trade_bank = trade_bank;
	}
	public String getAccount_num() {
		return account_num;
	}
	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}
}
