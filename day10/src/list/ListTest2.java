package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		// interface랑 abstract는 객체생성불가.
		// 그래서 new List 가 아닌 new ArrayList로 쓰는것
		List<Integer> list = new ArrayList<Integer>();

		// 1~10까지의 숫자를 20개 입력 한다.
		// 단 while 문을 이용한다.

		Random r = new Random();

		while (list.size()<20) {
			int num = r.nextInt(10) + 1;
			list.add(num);

		}
		
		//list 정보를 출력하시오
		System.out.println(list.size());
		System.out.println(list);
		for(int data : list) {
			System.out.println(data);
		}

	}

}
