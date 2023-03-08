package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		//1~10까지의 숫자를 10개 입력 하세요.
		Random r = new Random();
//		for(int i=0; i<10; i++) {
//			int num = r.nextInt(10)+1;
//			set.add(num);
//		}

		while(set.size()<10) {
			int num = r.nextInt(10)+1;
			set.add(num);
		}
		System.out.println("사이즈는:"+set.size());
			
		for(int data: set) {
			System.out.println(data);
		}
		
	}

}
