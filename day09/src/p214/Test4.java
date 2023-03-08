package p214;

import java.util.Random;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		int ar [] = new int[10];
		Random r = new Random();
		
		for(int i = 0; i < 10/*ar.length*/; i++) { 
			ar[i] = r.nextInt(10)+1;
		}
		
		for(int data:ar) {
			System.out.println(data);
			Thread.sleep(200);
		}
	}

}
