package bank;

public class App {
    //객체지향의 개념을 공부하는 것일뿐, 현업에서는 이런식으로 개발 안 함
	public static void main(String[] args) {
		Account acc  = new Account ("이말숙", 10000);
		System.out.println(acc);
		
		acc.withdraw(20000);
		acc.deposit(30000);
		System.out.println(acc);

	}

}
