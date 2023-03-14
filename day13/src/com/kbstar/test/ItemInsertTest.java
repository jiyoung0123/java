package com.kbstar.test;


import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Item> crudService = new ItemCRUDServiceImpl();
		
		Item item = new Item("감자", 5000, 2.2);
		try {
			crudService.register(item);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}}
		
		