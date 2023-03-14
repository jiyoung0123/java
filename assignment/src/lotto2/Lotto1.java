package lotto2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto1 {
	private int prizeMoney =0;
	Set<Integer>winningNum = new HashSet<Integer>();
	
	Random r = new Random();
	
	public void makeWinningNumberMoney() {
	
		for(int i=0; winningNum.size()<3 ;i++) {
			int num = r.nextInt(24)+1;
			winningNum.add(num);
		}System.out.println(winningNum);
		prizeMoney = r.nextInt(2000000000)+1;
		System.out.println("당첨금액은"+prizeMoney+"원 입니다");
	}


	
//	checkRanking(myNum: ArrayList<Integer>): int
	
	public ArrayList<Integer> checkRanking (int a, int b, int c){
		ArrayList<Integer> list = new ArrayList<>();
		int cnt = 0;
		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println(list);
		
		for(int data: list) {
			for(int num :winningNum) {
				if(data==num) {
					cnt++;
				}
			}
		}if(cnt==3) {
			System.out.println("1등입니다");
		}else if(cnt==2) {
			System.out.println("2등입니다");
		}else if(cnt==1) {
			System.out.println("2등입니다");
		}else{
			System.out.println("꽝입니다");
		}
		return list;
	}
	
	
//	본인이 입력한 숫자 3개를 argument로 입력 하면
//	몇개가 일치한지를 check 한후 등수를 리턴
//	등수는 자유롭게 설정
//	prizeMoney(grade: int): double
//	등수 정보를 입력 하면 당첨 금액을 리턴
//	당첨 금액 비율은 자유롭게 설정

}
