package overloading;

public class Calculator {
	
	public int sum(int a, double b) {
		int result = 0;
		result = a +(int)b ;
		return result;
	}
	
	//int n, int m 을 넣으면 안된다. -argument는 동일
	//return 값이 동일하지 않은 형식은 관계없다
	//return type은 신경 안 쓰고, 함수의 argument가 다르면 가능
	
	public int sum(int a, int b, int c) {         
		int result = 0;
		result = a +b +c;
		return result;
	}
	public int sum(int a, int b, int c, int d) {
		int result = 0;
		result = a +b +c + d;
		return result;
	}

}
