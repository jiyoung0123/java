package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemSelectAllTest {

	public static void main(String[] args) {
		CRUDService<String, Item> itemService = new ItemCRUDServiceImpl();
		List<Item> list = null;
		try {
			list = itemService.get();
			for (Item data : list) {
				System.out.println(data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
