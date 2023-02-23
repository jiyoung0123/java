package variable;

import java.util.Random;


public class P68 {

	public static void main(String[] args) {
		String s2 = "11";
		String s1 = "10";
		int s2 = Integer.parseInt(s1); // JDK에서 제공하는 API의 하나.-parseInt 등등..
		int a = 10;
		System.out.println(s2 + a); // 20 출력

	
        Random r = new Random();
        System.out.println(r);
        int rndNum = r.nextInt(10)+1;
        System.out.println(rndNum);
	}

}
