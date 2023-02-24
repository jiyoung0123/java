package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {
		// 숫자를 4개의 2자리수를 입력 받는다.
		// 만약 2자리수가 아니면 프로그램 종료.

		Scanner sc = new Scanner(System.in);
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;

		System.out.println("국어성적 입력:");
		ko = Integer.parseInt(sc.next());
		if (ko < 10 || ko >= 100) {
			sc.close();
			return;
		}

		System.out.println("영어성적 입력:");
		en = Integer.parseInt(sc.next());
		if (en < 10 || en >= 100) {
			sc.close();
			return;
		}

		System.out.println("수학성적 입력:");
		ma = Integer.parseInt(sc.next());
		if (ma < 10 || ma >= 100) {
			sc.close();
			return;
		}

		System.out.println("과학성적 입력:");
		si = Integer.parseInt(sc.next());
		if (si < 10 || si >= 100) {
			sc.close();
			return;
		}

	
		double average = 0;
		int sum = 0;

		sum = ko + en + ma + si;
		System.out.println(sum);

		average = sum / 4.0;
		System.out.println(average);

		String grade = "";

		grade = (average >= 90) ? "A" : (average >= 80) ? "B" : (average >= 70) ? "C" : (average >= 60) ? "D" : "F";

		// 평균과 합계를 구합니다.

		// 평균이 90이상이면 A
		// 평균이 80이상이면 B
		// 평균이 70이상이면 C
		// 평균이 60이상이면 D
		// 60미만이면 F

		// 합계, 평균, 학점을 출력 하시오

		System.out.printf("합계 : %d, 평균 : %4.2f, 학점 : %s", sum, average, grade);
		sc.close();
	}

}
