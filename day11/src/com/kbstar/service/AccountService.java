package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class AccountService implements CRUDService<String, AccountDTO>{
	
	DAO<String, AccountDTO> accDao;
	Notification notification; 
	
	public AccountService() {
		accDao = new AccountDAO();
		notification = new NotificationImpl();
		
	}

	@Override
	public void register(AccountDTO v) throws Exception {
		try{
			accDao.insert(v);
			System.out.println("생성이 완료 되었습니다.");
			System.out.printf("생성된계좌는...%s\n",v);
			System.out.println("------------------------------------------");
		}		
		catch(Exception e) {
			throw new Exception("계좌개설 실패..");
		}
		
		
	}

	@Override
	public void remove(String k) throws Exception {
		try{
			accDao.delete(k);
			System.out.printf("%s계좌의 탈퇴가 완료 되었습니다.\n",k);
			System.out.println("------------------------------------------");

		
		}catch(Exception e) {
			throw new Exception("탈퇴 실패..");
			
		}
		
	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		
		try{
			accDao.update(v);
			System.out.println(v);
		}catch(Exception e) {
			throw new Exception("업데이트 실패");
		}
		
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		AccountDTO obj = null;
		obj = accDao.select(k);
		System.out.println("된건가");
		return obj;
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		List<AccountDTO> list = null;
		try{
			list = accDao.select();
			return list;
		}catch(Exception e) {
			throw new Exception("조회오류");
		}
		
		
	}
	

}
