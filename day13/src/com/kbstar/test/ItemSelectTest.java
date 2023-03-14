package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemSelectTest {

	public static void main(String[] args) {
		CRUDService<String, Item> itemService = new ItemCRUDServiceImpl();
		Item item = null;
		
		try {
			item = itemService.get("2023314113100");
			System.out.println(item);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}}}
