package inherit2;

import java.util.Date;

public class App3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Manager();
		Employee e3 = new Sales();
	    //Sales is a Employee
		
		
		//Employee is a Object
		//java에서 모든 class는 Employee extends Object 가 생략이 되어있음
		Object obj1 = new Employee();
		Object obj2 = new Manager();
		Object obj3 = new Date();
		

	}

}
