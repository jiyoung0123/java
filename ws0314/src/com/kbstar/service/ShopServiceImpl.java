package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.ShopService;

public class ShopServiceImpl implements ShopService<Cust, Cart> {

	DAO<String, String, Cust> custDao;
	DAO<String, String, Item> itemDao;
	DAO<String, String, Cart> cartDao;

	public ShopServiceImpl() {
		custDao = new CustDaoImpl();
		itemDao = new ItemDaoImpl();
		cartDao = new CartDaoImpl();

	}

	@Override
	public Cust login(String id, String pwd) throws Exception {
		Cust cust = null;
		cust = custDao.select(id);
		if (cust != null) {
			if (cust.getPwd().equals(pwd)) {
				System.out.println("OK");
			} else {
				throw new Exception("로그인실패...");
			}
		} else {
			throw new Exception("로그인실패...");
		}
		return cust;
	}

	@Override
	public void register(Cust v) throws Exception {
		try {
			custDao.insert(v);
		} catch (Exception e) {
			throw new Exception();
		}
	}

	@Override
	public List<Cart> myCart(String id) throws Exception {
		List<Cart> list = null;
		list = cartDao.search(id);
		return list;
	}

}
