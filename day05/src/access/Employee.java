package access;

public class Employee {

	// 실제로 변수에 private protected를 사용하진 않음
	//같은 팀 내에서 사용 가능한건, private와 protected 임.
	private String id;
	protected String name;
	int salary; // 아무것도 안 쓰면 default임

	public Employee() {
	}

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// getter and setter

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
		result = this.salary * 0.17;
		return result;
	}

	// 이 안에서는 사용 가능하지만, 다른 App에서는 사용 못하도록 막음
	// 막는 이유는 다른 team 에서 혹시라도 다른 team 의 함수를 가져다 쓸까봐 막는것
	private int getAnnsalary() {
		int result = 0;
		result = this.salary * 12;
		return result;
	}

	protected double getAnnTax() {
		double result = 0.0;
		result = this.getAnnsalary() * 0.17;
		return result;
	}

	// 이 상태로는 App 에서 동작하려고 해도 getter와 setter가 없어서, 가져올 수가 없다
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
