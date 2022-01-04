package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.board.domain.CountryVO;

public class CountryDAOimpl implements CountryDAO {

	@Inject
	 private SqlSession sql;
	 
	 private static String namespace = "com.board.mappers.country";

	 // 게시물 목록
	 @Override
	 public List<CountryVO> list() throws Exception { 
	  
		 return sql.selectList(namespace + ".country");
	 }

}
