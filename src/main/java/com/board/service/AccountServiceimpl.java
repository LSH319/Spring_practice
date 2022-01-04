package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.AccountDAO;
import com.board.domain.AccountVO;

@Service
public class AccountServiceimpl implements AccountService {

	 @Inject
	 private AccountDAO dao;
	 
	 @Override
	 public List<AccountVO> list() throws Exception{
		 return dao.list();
	 }
}
