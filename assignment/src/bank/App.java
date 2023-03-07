package bank;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		// 계좌생성
		// 계좌 정보 조회
		// 계좌 입금
		// 계좌 출금
		Account acc = new Account();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Input command(q,c,s,d,w)");
			String cmd = sc.next();
			if (cmd.equals("c")) {
				System.out.println("계좌생성을 하겠습니다.");
				System.out.println("Input Name: ");
				String name = sc.next();
				System.out.println("Input AccHolder: ");
				String accHolder = sc.next();
				System.out.println("Input Balance:");
				double balance = Double.parseDouble(sc.next());

				try {
					acc = new Account(name, accHolder, balance);
					System.out.println(acc);
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}

			} else if (cmd.equals("q")) {
				System.out.println("Bye...");
				break;
			}

			else if (cmd.equals("s")) {
				System.out.println("계좌조회...");
				acc.check();

				// 입금 - 음수 예외 상황
			} else if (cmd.equals("d")) {
				System.out.println("계좌입금...");
				System.out.println("입금금액을 입력하세요");
				int money = 0;
				try {
					money = Integer.parseInt(sc.next());

					acc.deposit(money);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				// 출금 - 잔액 부족 예외 상황, 음수 예외 상황
			} else if (cmd.equals("w")) {
				System.out.println("계좌출금...");
				System.out.println("출금금액을 입력하세요");
				int money = 0;
				try {
					money = Integer.parseInt(sc.next());
					acc.withdraw(money);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		}
		sc.close();
	}
}
