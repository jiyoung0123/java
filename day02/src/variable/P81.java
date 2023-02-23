package variable;

import java.util.Random;
import java.util.Scanner;

public class P81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number..");

		// String cmd = sc.next();
		// int num = Integer.parseInt(cmd);

		int num = Integer.parseInt(sc.next());
		String result = (num > 0) ? "정상" : "비정상";
		System.out.println(result);
		sc.close();  //프로그램이 scan 시스템을 실행하면 파이프를 꽂는다, 이걸 close 하지 않으면 파이프를 뽑지 않고 계속 지속..
		             //그래서 파이프가 계속 꽂혀있으니 프로그램이 죽어버림
		             //os와 열어두면 항상 close 해야 함
	}
}
