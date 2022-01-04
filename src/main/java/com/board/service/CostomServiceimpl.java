package com.board.service;

import java.util.List;

import javax.inject.Inject;

import com.board.dao.CustomDAO;
import com.board.domain.CustomVO;

public class CostomServiceimpl implements CostomService {

	@Inject
	 private CustomDAO dao;
	 
	 @Override
	 public List<CustomVO> list() throws Exception{
		 return dao.list();
	 }

}
