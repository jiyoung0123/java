package com.kbstar.dao;


//ctrl shift o 눌러서 나옴
import com.kbstar.frame.DAO;

public class UserMariaDBDAO implements DAO{

	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("Inserted MariaDB...");
		
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("Deleted MariaDB...");
		
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("Updated MariaDB...");
		
		
	}
	
	

}
