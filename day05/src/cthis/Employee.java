package cthis;

import java.util.Calendar;

public class Employee {
	
	private String id;        
	private String name;      
	private int salary;       
	
	
	
	public Employee() {
		Calendar cal = Calendar.getInstance();  //ctrl+shift+o
		//""는 id가 string 이고 year 등은 int 기 때문에 string 으로 바꿔주기 위해서 넣음
		this.id = ""+cal.get(Calendar.YEAR)+cal.get(Calendar.MILLISECOND);  
		
	}

	//id값은 자동생성하겠다...
	public Employee(String name, int salary) {
		//constructor 안에서 this()는 바로 위의 constructor 호출, 이건 맨 위에 써야 한다. this.salary 밑에쓸순없다
		this();
		this.name = name;
		this.salary = salary;
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
