package ifcontrol;

public class P86 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 50.0;
		
		System.out.println("start....");
	
		

		if(gender.equals("M")) {
			System.out.println("Male...");
		}else {
			System.out.println("Female...");
		}
		
		grade = (sum>=90)? "VIP" : (sum >=70)? "GOLD":"SILVER";

		
		if(grade.equals("VIP")) {			
			 System.out.println("VIP 혜택...");
			 // return;		 
			}
		
		
		System.out.printf("%s, %s, %4.2f \n", grade, gender,sum);
		System.out.println("End....");
	}

}
