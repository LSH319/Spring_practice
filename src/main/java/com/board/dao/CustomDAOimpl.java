package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.board.domain.CustomVO;

public class CustomDAOimpl implements CustomDAO {

	@Inject
	 private SqlSession sql;
	 
	 private static String namespace = "com.board.mappers.custom";

	 // 게시물 목록
	 @Override
	 public List<CustomVO> list() throws Exception { 
	  
		 return sql.selectList(namespace + ".custom");
	 }

}
