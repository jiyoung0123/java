package com.kbstar.test;

import java.util.List;


import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
		
		Cust cust = new Cust("id02", "pwd0000", "말하는감자", 30);
		try {
			crudService.register(cust);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		Cust cust2 = new Cust("id01", "pwd06", "권깡", 30);
		try {
			crudService.modify(cust2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			crudService.remove("id07");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
