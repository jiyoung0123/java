package variable;


import java.util.Random;
import java.util.Scanner;

public class P74 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      System.out.println("숫자를 입력 하십시오(10~100)");
      String cmd = sc.next();
      //10~100 사이의 정수를 입력 받는다.
      //1부터 입력 받은 숫자 까지의 범위에서 랜덤한 숫자를 발생 하시오
     Random r = new Random();
     int num = Integer.parseInt(cmd); 
     int rndNum = r.nextInt(num)+1;
     System.out.println(rndNum);
     sc.close();
}
}
