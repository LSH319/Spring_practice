package com.board.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.board.domain.CustomVO;

public class CustomDAOimpl implements CustomDAO {

	@Inject
	 private SqlSession sql;
	 
	 private static String namespace = "com.board.mappers.custom";

	 @Override
	 public void write(CustomVO vo) throws Exception { 
		 sql.insert(namespace + ".write", vo);
	 }

}
