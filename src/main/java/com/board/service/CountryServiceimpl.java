package com.board.service;

import java.util.List;

import javax.inject.Inject;

import com.board.dao.CountryDAO;
import com.board.domain.CountryVO;

public class CountryServiceimpl implements CountryService {

	@Inject
	 private CountryDAO dao;
	 
	 @Override
	 public List<CountryVO> list() throws Exception{
		 return dao.list();
	 }
}
