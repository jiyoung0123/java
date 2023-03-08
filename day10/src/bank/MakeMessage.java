package bank;

public class MakeMessage {
	public static String makeMessage(String code) {
		String result = "";
		switch(code) {
		case "ER0001" : result = "계좌개설 실패.."; break;
		case "EX0002" : result = "음수입력.."; break;
		case "EX0003" : result = "잔액부족.."; break;
		case "EX0007" : result = "item에러1.."; break;
		case "EX0008" : result = "item에러2.."; break;
		case "EX0009" : result = "item에러3.."; break;
		case "EX0010" : result = "주문수량은 0은 안됩니다"; break;
		default: result= "고객센터에 문의 하세요";
		
		}
		
		return result;
	}

}
