package oop2;

import java.util.Random;

public class Employee {
	private String id; // private의 의미는, 한번 설정이 되고 나서는 변경이 안되게끔 접근을 막는것.
	private String name;
	private int salary;

	public Employee() { // 우리가 뭔가를 집어넣지 않아도 생성되는 constructor
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 10000000;
	}

	public Employee(String id, String name, int salary) { // id name salary를 넣어야 생성되는 constructor
		this.id = id; // 여기서는 this가 꼭 들어가야 함
		this.name = name;
		if (salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
	}

	public Employee(String name, int salary) { // name salary만 넣으면 id까지 만들어지는 constructor
		this("10000",name,salary);           //name과 salary가 생성되면 위의 constructor로 보내져서 생성이됨
		                                     //salary 같은게 0보다 작은 값을 0으로 설정하는걸 제각각하지않고 위로 보내서 한꺼번에하게됨
		
	}

	// 이름이 바뀌었을 경우, 이름을 private로 해서 못 바꾼다. 그럴때
	// 우클릭, source 에서 Generate getter and setter로 변경 가능

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

	public int getAnnSalary() {
		return this.salary * 12;

	}

	public double getTax() {
		return this.salary * 0.175;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
