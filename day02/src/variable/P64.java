package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		double d = 10.2365;
		String str1 = "abc";   //기본자료형이 아닌 참조자료형 타입
		String str2 = "abc";
		str1 = "def";
		System.out.printf("%d %4.2f %s \n", a,d,str1);   ;
		//%4.2f 소숫점 앞4자리 뒤에 2자리 라는 의미임. 하지만 앞은 4자리 넘어도 걍 다 출력됨 큰 의미가 없다
		if(str1 == str2) {
			System.out.println("OK");
		}
		if(str1.equals(str2)) {
			System.out.println("OK2");
		}
		String str3 = new String("abc");
		String str4 = new String("abc");
	}

}
