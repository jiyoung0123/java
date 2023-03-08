package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;



public class ItemDAO implements DAO<Integer, ItemDTO>{

	
	@Override
	public void insert(ItemDTO v) throws Exception {	
		if(v.getId()==0001) {
			throw new Exception("EX0007");			
		}if(v.getQt()==0) {
			throw new Exception("EX0010");}
		connect();
		System.out.println(v);
		System.out.println("Inserted ...");
		close();
	}


	@Override
	public void delete(Integer k) throws Exception {
		if(k==0001) {
			throw new Exception("EX0008");			
		}
		connect();
		System.out.println(k);
		System.out.println("Deleted ...");
		close();

		
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(v.getId()==0001) {
			throw new Exception("EX0009");
		}if(v.getQt()==0) {
			throw new Exception("EX0010");
		}
		System.out.println(v);
		System.out.println("Updated ...");
	}
	
	

}
