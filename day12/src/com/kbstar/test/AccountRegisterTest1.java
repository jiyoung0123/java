package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountService;

public class AccountRegisterTest1 {
  
	public static void main(String[] args) {
		CRUDService<String, AccountDTO> service = new AccountService();
		AccountDTO acc1 = new AccountDTO("00001",10000, "james1") ;
		AccountDTO acc2 = new AccountDTO("00002",20000, "james2") ;
		AccountDTO acc3 = new AccountDTO("00003",1000, "james3") ;
				
		//register test
		try {
			service.register(acc1);
			service.register(acc2);
			service.register(acc3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
		//remove test
		try {
			service.remove("0005");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//modify test		
		try {
			service.modify(acc1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		//get(k) test
		AccountDTO acc = null;
		try {
			acc = service.get("0007");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//get() test
		List<AccountDTO> list = null;
		try {
			list = service.get();
			for(AccountDTO data:list) {
				System.out.println(data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		


	}

}
