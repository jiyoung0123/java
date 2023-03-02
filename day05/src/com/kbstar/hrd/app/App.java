package com.kbstar.hrd.app;

import com.kbstar.hrd.Employee;

public class App {

	public static void main(String[] args) {
		// Employee e = new Employee 여기까지만 치고 ctrl space 치면 어떤 constructor를 선택할건지 나옴
		Employee e = new Employee("100", "이말숙", 500);
		System.out.println(e);
		System.out.println(e.getSalary());
		System.out.println(e.getTax());
		System.out.println(e.getAnnsalary());
		System.out.println(e.getAnnTax());
		
		
		System.out.println("===================================");
		
		
		//Employee type의 배열을 생성하겠다! 이 3개에는 employee type의 객체가 들어갈 수 있다
		Employee emps[] = new  Employee[3];  
		emps [0] = new Employee("201","홍말자", 400);
		emps [1] = new Employee("202","정말자", 450);
		emps [2] = new Employee("203","장말자", 480);
		
		
		//emps 안에 들어가 있는 type은 Employee
		//집합체 안에서 하나하나 끄집어 낼 때는 foreach 함수 쓰자
		for(Employee em:emps) {
			System.out.println(em);
			System.out.println(em.getTax());
			System.out.println(em.getAnnsalary());
			System.out.println(em.getAnnTax());
		}
 	}

}
