package com.kbstar.hrd;

public class Employee {
	
	private String id;        //private로 막아두면, 외부로 부터의 접근이 원천차단
	private String name;      //가져올 수도 없고, 수정할 수도 없다
	private int salary;       //그래서 getter and setter를 만드는것임
	
	
	//default constructor 객체가 생성될 때 field들을 초기화 시켜주는 역할
	public Employee() {
	}

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	//getter and setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}
	
	
			
	// method
	public double getTax() {
		double result = 0.0;
		result = this.salary *0.17;
		return result;		
	}
	
	public int getAnnsalary() {
		int result = 0;
		result = this.salary*12;
		return result;
	}
	public double getAnnTax() {
		double result = 0.0;
		result = this.getAnnsalary()*0.17;
		return result;
	}
	
	
	
	
	
	
	
	//이 상태로는 App 에서 동작하려고 해도 getter와 setter가 없어서, 가져올 수가 없다	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	

	
}
