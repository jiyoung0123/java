package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	private HashSet<Integer> winnigNum;
	private double prizeMoney;
	public Lotto() {
		 winnigNum = new HashSet<Integer>();
	}
	
	public double getPrizeMoney() {
		return prizeMoney;
	}


	public void makeWinnigNumberMoney() {
		//번호생성, 당첨금생성
		Random r = new Random();
		prizeMoney = r. nextInt(2000000000)+1;
		while(winnigNum.size()<3) {
			int num = r.nextInt(25)+1;
			winnigNum.add(num);			
		}
		System.out.printf("총 당첨금은 %4.0f",prizeMoney);
		System.out.println(winnigNum.toString());
	}
	
	public int checkRanking(ArrayList<Integer> myNum) throws Exception {
		int grade = 0;
		int cnt=0;
		for(int num :myNum) {
			for(int prizeNum :winnigNum) {
				if(num == prizeNum) {
				cnt++;}
			}
		}
		switch(cnt) {
		case 3 : grade = 1; break;
		case 2 : grade = 2; break;
		case 1 : grade = 3; break;
		default : throw new Exception("꽝");
		}
		
		return grade;
	}
	
	public double prizeMoney(int grade) {
		double pMoney = 0.0;
		switch(grade) {
		case 1 : pMoney = prizeMoney *0.7; break;
		case 2 : pMoney = prizeMoney *0.2; break;
		case 3 : pMoney = prizeMoney *0.1; break;
		default : pMoney = 0.0;
		}
		return pMoney;
	}

}
