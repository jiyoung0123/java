package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
	Set<Integer> winningNum = new HashSet<Integer>();
	private int prizeMoney;
	Random r = new Random();

	public void makeWinningNumberMoney() {

		while (winningNum.size() < 3) {
			int num = r.nextInt(24) + 1;
			//0~24  1~25
			winningNum.add(num);
		}System.out.println("오늘의 로또 번호는!!!");
		System.out.println(winningNum);
		prizeMoney = (r.nextInt(1900000000) + 1);
		//1~10 까지 무작위
		System.out.println("이번 LOTTO의 당첨 금액은" +prizeMoney+"입니다!");

	}



	public ArrayList<Integer> checkingRanking(int a, int b, int c) {
		ArrayList<Integer> list = new ArrayList<>();
		int cnt = 0;
		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println("당신의 등수는!!");
		for (int data : list) {
			for (int data1 : winningNum) {
				if (data == data1) {
					cnt++;
				}
			}
		}
		if (cnt == 3) {
			System.out.println("1등입니다");
		} else if (cnt == 2) {
			System.out.println("2등입니다");
		} else if (cnt == 1) {
			System.out.println("3등입니다");
		} else {
			System.out.println("꽝! 다음 기회에~~~");
		}
		 return list;
	}
	
			
	public double prizeMoneycal(int grade) {
		double money = 0;
		if(grade==1) {
			money=prizeMoney*0.7;
		}else if(grade==2) {
			money=prizeMoney*0.2;
		}else if(grade==3) {
			money=prizeMoney*0.1;
		}System.out.printf("당첨금액은_ %4.0f 원 입니다!",money);
		return money;		
	}

}
