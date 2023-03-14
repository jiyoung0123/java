package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSelectTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> Service = new CartCRUDServiceImpl();
		Cart cart = null;
		
		try {
			cart = Service.get("202331429400");
			System.out.println(cart);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
