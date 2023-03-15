package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.ShopService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.ShopServiceImpl;

public class MyCartSellectAllTest {

	public static void main(String[] args) {
		ShopService <Cust, Cart> service = new ShopServiceImpl();

		CRUDService<String, Cart> Service = new CartCRUDServiceImpl();
		List<Cart> list = null;
		try {
			list = service.myCart("낑깡");
			for (Cart data : list) {
				System.out.println(data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}