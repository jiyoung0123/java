package bank;

import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws NegativeNumber {
		Account acc = new Account();
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input [c,s,d,w,q]");
			String cmd = sc.next();
			if (cmd.equals("c")) {
				try {
					System.out.println("계좌 생성");
					System.out.println("Input name");
					String name = sc.next();
					System.out.println("Input accHolder");
					String accHolder = sc.next();
					System.out.println("Input balance");
					double balance = Double.parseDouble(sc.next());
					int accNo = r.nextInt(9998) + 1;

					acc = new Account(accNo, name, accHolder, balance);
					System.out.println("계좌가 생성되었습니다.");
					System.out.println(acc);
				} catch (NegativeNumber e) {
					System.out.println(e.getMessage());
				}
			} else if (cmd.equals("s")) {
				System.out.println(acc.getAccInfo());
			} else if (cmd.equals("d")) {
				try {
					System.out.println("입금할 금액을 입력하세요");
					int d = Integer.parseInt(sc.next());
					acc.deposit(d);
					System.out.println(acc.deposit(d));
				} catch (NegativeNumber e) {
					System.out.println(e.getMessage());
				}
			} else if (cmd.equals("w")) {
				try {
					int w = Integer.parseInt(sc.next());
					acc.widthrow(w);
					System.out.println(acc.widthrow(w));
				} catch (NegativeNumber e) {
					System.out.println(e.getMessage());
				}
			} else if (cmd.equals("q")) {
				break;
			}
		}
		System.out.println("??");
		sc.close();
		// 계좌 생성
		// 계좌 정보 조회
		// 계좌 입금
		// 게좌 출금
	}
}