package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSellectAllTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> Service = new CartCRUDServiceImpl();
		List<Cart> list = null;
		try {
			list = Service.get();
			for (Cart data : list) {
				System.out.println(data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}