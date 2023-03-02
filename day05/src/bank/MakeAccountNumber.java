package bank;

import java.util.Calendar;

public class MakeAccountNumber {
	
	
	//static이란 클래스의 field가 없는 상황에서 나는 makeAccNum의 기능만 사용하겠다
	public static String makeAccNum() {
		String accNum = "";
		Calendar cal = Calendar.getInstance();
		accNum = ""+cal.get(Calendar.YEAR)
		           +(cal.get(Calendar.MONTH)+1)
		           +cal.get(Calendar.DAY_OF_MONTH)
		           +cal.get(Calendar.MILLISECOND);		
		return accNum;
	}

	
	
}
