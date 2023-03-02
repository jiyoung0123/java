package access;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee(); 
		
		//protected와 default는 접근 가능. private는 불가
		e.name = "";
		
		//Employee.java 에서 private으로 만든 getAnnsalary()는 여기서는 접근 불가
		

	}

}
