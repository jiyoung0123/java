package inherit2;

public class App2 {

	public static void main(String[] args) {
		
		//Manager is a Employee
		Employee e = new Manager("100","james",500,50);
		
		//아래는 오류....
		//Manager m = new Employee("100","james",500);
		
		//이렇게도 가능... 한번에 넣어서 관리하고 출력이 쉬움. is a 관계가 성립하니깐 가능..
		//Employee를 담을 수 있는 공간에 하위 class의 객체도 담을 수 있다 
		Employee ea[]  = new Employee[5];
		ea[0]= new Employee("100","james",500);
		ea[1]= new Employee("101","james",500);
		ea[2]= new Manager("102","james",500, 50);
		ea[3]= new Manager("103","james",500, 50);
		ea[4]= new Sales("104","james",500, "seoul",0.35);
		
		
		
		//Employee라는 객체에 sales를 넣었기 때문에 Employee에 선언한 함수들만 보인다.(getIncentive 안 보임)
		//em. 누르면 employee에서 정의된것만 보임
		for(Employee em:ea) {
			System.out.println(em);
			System.out.println(em.getAnnSalary());
				System.out.println(em.getIncentive());
			}
			System.out.println("-----------------------");
			TaxCal t = new TaxCal();
			double result = t.getTax(ea[4]);
			System.out.println(result);
		}
		
		
		
	

	}


