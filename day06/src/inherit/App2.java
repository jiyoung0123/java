package inherit;

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
			
			//instanceof-배열에서 끄집어낸 객체가 Sales type 이니? ...
			if(em instanceof Sales) {
				
				//System.out.println(em.getIncentive()); -employee에서 getIncentive함수 return 0 으로 만든 후, sales에서 override
				
				//employee type의 객체를 sales 타입으로 바꾸는것
				Sales s = (Sales)em;
				//이렇게 바꾸고 s. 누르면 getIncentive 보임. sales 객체니깐!
				System.out.println(s.getIncentive());
			}
			
		}
		
		
		
	

	}

}
