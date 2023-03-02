package com.kbstar.hrd.app;

import com.kbstar.hrd.Manager;

public class AppManager {

	public static void main(String[] args) {
		Manager managers[] = new Manager[3];
		managers[0] = new Manager("301","정수아",500,50);
		managers[1] = new Manager("302","이수아",510,55);
		managers[2] = new Manager("303","고수아",520,60);
		
		for(Manager m:managers) {
			System.out.println(m);
			System.out.println(m.getTax());
			System.out.println(m.getAnnsalary());
			System.out.println(m.getAnnTax());
			
			
		}
		

	}

}
