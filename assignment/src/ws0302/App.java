package ws0302;

public class App {

	public static void main(String[] args) {

		// 1. 6개의 Account 객체 배열을 만들어 다음과 같은 객체를 입력 한다.
		Account accounts[] = new Account[6];
		accounts[0] = new Account("james1", 10000, 0.35, "VIP");
		accounts[1] = new Account("james2", 10000, 0.45, "GOLD");
		accounts[2] = new Account("james3", 10000, 0.55, "SIVER");
		accounts[3] = new Account("james4", 10000, 0.15, "GOLD");
		accounts[4] = new Account("james5", 10000, 0.28, "SIVER");
		accounts[5] = new Account("james6", 10000, 0.31, "VIP");
		
		// 2.6개의 계좌 정보를 출력 하시오
		for (Account a : accounts) {
			System.out.println(a);
		}
		
		
		// 3. 모든 계좌의 잔액과 현재 이자금액을 출력 하시오
		for (Account a : accounts) {
			System.out.printf("잔액 : %4.2f,이자금액 : %4.2f\n", a.getBalance(), a.getInterest());
		}
		
		
		// 4. VIP들의 잔액의 합과 평균을 출력 하시오
		double avg = 0;
		double sum = 0;
		int cnt = 0;

		for (Account a : accounts) {
			if (a.getGrade().equals("VIP")) {
				sum += a.getBalance();
				cnt++;
			}

		}
		avg = sum / cnt;
		System.out.printf("VIP들의 합은%4.2f, VIP들의 잔액의 평균은%4.2f\n", sum, avg);

	}

}
