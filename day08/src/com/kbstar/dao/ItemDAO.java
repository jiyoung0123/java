package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;


//generic에서는 primitive type을 선언할 수 없다. int 라고 쓰는게 아니라 Integer라고 써야 한다
public class ItemDAO implements DAO<Integer, ItemDTO>{
//DAO는 database에 넣기 위해 만든것
	
	@Override
	public void insert(ItemDTO v) {
		//SQL의 DML language가 여기에 들어오는것	
		connect();
		System.out.println(v);
		System.out.println("Inserted ...");
		close();
	}

	//int id = 100; int type을 객체type으로 자동으로 바꿔줌
	@Override
	public void delete(Integer k) {
		connect();
		System.out.println(k);
		System.out.println("Deleted ...");
		close();

		
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v);
		System.out.println("Updated ...");
	}
	
	

}
