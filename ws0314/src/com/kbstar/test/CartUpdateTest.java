package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartUpdateTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> service = new CartCRUDServiceImpl();
		Cart cart = new Cart("2023314532100", "테서터누구야", "dj222",5, null);
		try {
			service.modify(cart);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
