package com.board.dao;

import java.util.List;

import com.board.domain.CountryVO;

public interface CountryDAO {
	public List<CountryVO> list() throws Exception; 
}
