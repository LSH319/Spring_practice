package com.board.domain;

public class CountryVO {
	/*
	 * CREATE TABLE country(
	country_eng CHAR(20) not NULL,
	country_kor CHAR(20) NOT NULL,
	PRIMARY KEY(country_eng)
	);
	 */
	private String country_eng;
	private String country_kor;
	
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
	
	 
}
