package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {

		int arr[] = new int[10];     //heap메모리에 10개의 공간이 생긴다
		Random r = new Random();

		double avg = 0.0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(99) + 1; // arr의 i 번째에 난수를 집어넣겠다. 라는 뜻
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	
		// 배열의 합과 평균을 구하시오
		int sum = 0;		
		for(int a:arr) {
			sum += a;
		}

		avg = (sum*1.0) / arr.length;
		System.out.printf("%d, %4.2f",sum,avg);

	}
}
