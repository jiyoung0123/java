package ifcontrol;

public class P84 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "F";
		double sum = 90.0;

		System.out.println("start....");

		if (gender.equals("M")) {
			System.out.println("Male...");
		} else {
			System.out.println("Female...");
		}

		if (gender.equals("M") && sum >= 90) {
			if (sum >= 90) {
				grade = "MVIP";
			} else if (sum >= 80) {
				grade = "MGOLD";
			} else {
				grade = "MNORMAL";
			}
		}

		else {
			if (sum >= 90) {
				grade = "FVIP";
			} else if (sum >= 80) {
				grade = "FGOLD";
			} else {
				grade = "FNORMAL";
			}
		}

		switch(grade) {
		case "FVIP":
		case "MVIP":
			sum += 100;
			break;               //여기서 break가 없으면, vip 는 100,90,10 다 받게 된다
		case "FGOLD":
		case "MGOLD":
			sum += 90;
			break;		
		default :                 //위의 case가 모두 아니면..
			sum += 10;			
		}
		
		
		
		if (grade.equals("VIP")) {
			System.out.println("VIP 혜택...");
			// return;
		}

		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		System.out.println("End....");
	}

}
