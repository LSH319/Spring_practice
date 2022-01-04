package com.board.service;

import javax.inject.Inject;

import com.board.dao.CustomDAO;
import com.board.domain.CustomVO;

public class CustomServiceimpl implements CustomService {

	@Inject
	 private CustomDAO dao;
	 
	 @Override
	 public void write(CustomVO vo) throws Exception{
		 dao.write(vo);
	 }

}
