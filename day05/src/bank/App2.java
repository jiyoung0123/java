package bank;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {

		// 계좌생성을 while문 안에다가 쓰면, 반복될 때마다 초기화가 될 수 있는 문제가 있음
		// 계좌를 생성하고, 그 안에서 입출금, 조회 등등을 해야 하니까
		// refernce type을 초기화 하는 법
		Account acc = null;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Input Command(c,w,d,s,q)...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			} else if (cmd.equals("c")) {
				System.out.println("Create Accouunt");
				System.out.println("Input Account Info[name,balance]");
				System.out.println("Input Name: ");
				String name = sc.next();
				System.out.println("Input Balance:");
				double balance = Double.parseDouble(sc.next());

				acc = new Account(name, balance);
				System.out.println(acc);

			} else if (cmd.equals("w")) {
				System.out.println("Widthdraw");
				System.out.println("Input Widthraw Money: ");
				double money = Double.parseDouble(sc.next());
				acc.withdraw(money);
				System.out.println(acc);

			} else if (cmd.equals("d")) {
				System.out.println("Deposit");
				System.out.println("Input Deposit Money: ");
				double money = Double.parseDouble(sc.next());
				acc.deposit(money);
				System.out.println(acc);
			} else if (cmd.equals("s")) {
				System.out.println("Select: ");
				System.out.println(acc);
			}

		}
		sc.close();
	}
}
