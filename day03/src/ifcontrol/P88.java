package ifcontrol;

public class P88 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 63.0;
		
		System.out.println("start....");
			
		
		if(gender.equals("M")) {
			System.out.println("Male...");
		}else {
			System.out.println("Female...");
		}

		
		if(sum>=95 || (sum<=90 && sum>=85)) {
			grade = "VIP";			
		} else if((sum>=75 && sum<=80)||(sum>=60 && sum<=65)) {
			grade = "GOLD";
		} else {
			grade = "NORMAL";
		}

		
		if(grade.equals("VIP")) {			
			 System.out.println("VIP 혜택...");
			 // return;		 
			}
		
		
		System.out.printf("%s, %s, %4.2f \n", grade, gender,sum);
		System.out.println("End....");
	}

}
