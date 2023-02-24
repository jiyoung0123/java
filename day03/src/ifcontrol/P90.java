package ifcontrol;

public class P90 {

	public static void main(String[] args) {
		int a= 50;
		int b = 80;

		
		// 두 수의 최대 값과 최소 값을 구하시오
		int max = 0;
		int min = 0;
		
		max = (a>b)? a : b;
		min = (a<b)? a : b;
		
		System.out.printf("MAX : %d, MIN: %d",max,min);
		



	}

}
