package calculator;

public class Ui {
	//계산기 화면

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = 0;
		result = cal.sum(10, 20);
		System.out.println(result);
		cal.save(result);
		System.out.println("OK");

	}

}
