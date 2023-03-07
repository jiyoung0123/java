package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

//Service 라는 interface와 SearchService 라는 interface 도 같이 사용, 하나의 객체의 2가지 기능을 탑재
public class ItemService implements Service<Integer, ItemDTO> ,SearchService{
 
	DAO<Integer, ItemDTO> dao;
	
	public ItemService() {
		dao = new ItemDAO();
	}
	
	@Override
	public void register(ItemDTO v) {
		System.out.println(v+"Data Check..");
		dao.insert(v);
		System.out.println("Send SMS..");
		
	}

	@Override
	public void remove(Integer k) {
		System.out.println(k+"Data Check..");
		dao.delete(k);
		System.out.println("Send SMS..");
		
	}

	@Override
	public void modify(ItemDTO v) {
		System.out.println(v+"Data Check..");
		dao.update(v);
		System.out.println("Send SMS..");
		
	}

	@Override
	public void search() {
		System.out.println("Search...");
		
	}

	


}
