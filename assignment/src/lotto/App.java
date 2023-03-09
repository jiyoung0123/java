package lotto;

import java.util.ArrayList;


import java.util.Scanner;


public class App {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요");
		System.out.println("첫번째 숫자");
		int a = sc.nextInt();
		System.out.println("두번째 숫자");
		int b = sc.nextInt();
		System.out.println("세번째 숫자");
		int c = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		System.out.println("당신이 선택한 숫자는 아래와 같습니다.");
		System.out.println(list);
		
		Lotto game = new Lotto();

		game.makeWinningNumberMoney();

		game.checkingRanking(a, b, c);	
		
		System.out.println("당신의 등수를 입력하세요");
		int grade = sc.nextInt();		
		game.prizeMoneycal(grade);
			
	}}

	

	


