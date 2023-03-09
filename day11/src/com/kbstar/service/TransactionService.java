package com.kbstar.service;

import java.util.List;


import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class TransactionService implements CRUDService<String,TransactionDTO>{
	
	DAO<String, TransactionDTO> transanctionDao;
	
	public TransactionService() {
		
		transanctionDao = new TransactionDAO();		
	}

	@Override
	public void register(TransactionDTO v) throws Exception {
		transanctionDao.insert(v);
		
	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub 없애기
		
	}

	@Override
	public void modify(TransactionDTO v) throws Exception {
		// TODO Auto-generated method stub  없애기
		
	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		TransactionDTO obj = null;
		obj =transanctionDao.select(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> get() throws Exception {
		List<TransactionDTO> list = null;
		list = transanctionDao.select();
		return list;
	}

	
	}

	
