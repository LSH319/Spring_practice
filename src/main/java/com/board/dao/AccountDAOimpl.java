package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.board.domain.AccountVO;

public class AccountDAOimpl implements AccountDAO {

	 @Inject
	 private SqlSession sql;
	 
	 private static String namespace = "com.board.mappers.account";

	 // 게시물 목록
	 @Override
	 public List<AccountVO> list() throws Exception { 
	  
		 return sql.selectList(namespace + ".list");
	 }

}
