package whilecontrol;

public class P93 {

	public static void main(String[] args) {
		// 합과 평균을 구하시오
		
		int sum = 0;
	    double avg = 0;
	      
		System.out.println("Start...");
		int i =1;
		while(i<=100) {
			sum += i;      //sum = sum + i
			i++;
		}
		avg = (sum * 1.0) / (i-1 * 1.0);
		
		System.out.printf("%d \n%4.2f\n", sum, avg);
		System.out.println("End..."+i);
	}
				
}
