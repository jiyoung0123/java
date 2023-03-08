package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String, UserDTO>{
	DAO<String, UserDTO> dao;
	
	
	//constructor
	public UserService() {
		dao = new UserDAO();
	}

	@Override
	//여기서 만약 throws가 아닌 try catch로 예외를 잡아버리면, 여기서 출력되고 해결되고 끝나버림
	//App까지 예외사항 출력이 가지가 않음. 그래서 여기선 꼭 throw로 던져야 함
	//try catch가 아닌 throw를  = 내가 이 예외를 처리하지 않고, 던지겠다!! 라는 뜻
	public void register(UserDTO v) throws Exception {
		System.out.println("Security Check...");
		dao.insert(v);
		System.out.println("Send mail..");
		System.out.println("Send SMS..");
		
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send mail..");
		System.out.println("Send SMS..");
		
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		dao.update(v);
		System.out.println(v.getId()+"님이 수정 되었습니다.");
		
	}

	//@Override
	//public void search() {
    // search 라는 기능이 필요해서 넣기는 했지만interface에 넣었지만 이 class에서는 필요없어서, 안씀				
	//}

	

	

	

}
