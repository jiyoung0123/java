package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartUpdateTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> service = new CartCRUDServiceImpl();
		Cart cart = new Cart("2022314864100", "낑깡", "ddong2", 2, null);

		try {
			service.modify(cart);
			System.out.println("수정성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
}
}}