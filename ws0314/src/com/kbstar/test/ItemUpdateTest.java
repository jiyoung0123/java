package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemUpdateTest {

	public static void main(String[] args) {
		CRUDService<String, Item> service = new ItemCRUDServiceImpl();
		Item item = null;
		
		item = new Item("2023314379100", "토마토", 32315000, 1.1, null);
		
		try {
			service.modify(item);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
