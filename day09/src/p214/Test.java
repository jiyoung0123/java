package p214;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num");
		int num = 0;
		try {
			num = Integer.parseInt(sc.next());
			int result = 10 / num;
			System.out.println(result);
//		}catch(ArithmeticException | NumberFormatException e) {
//			System.out.println("잘못 입력되었습니다.");
//		}catch(Exception e) { // Exception 은 최상위 클래스 , 그러나 이렇게 선언할 시 무슨 오류인지는 알 수 없다.
//			System.out.println("Error");
		}catch(ArithmeticException e1) {
			System.out.println("분모가 0입니다");
			return;
//			e1.printStackTrace();
		}catch(NumberFormatException e2) {
			System.out.println("숫자를 넣어주세요");
			return;   //return을 실행 시 마지막에 sc.close() 가 실행이 안됨
		}finally {
			System.out.println("반드시 실행");
			sc.close();	
		}
				
		System.out.println("End Application");
	}

}
