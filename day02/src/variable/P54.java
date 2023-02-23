package variable;

public class P54 {

	private static final char A = 0;

	public static void main(String[] args) {
     // boolean
     boolean b1 =10>5;

     //정수
     int n1 = 10;
     long n2 = 20000000000000000l;
     
     //실수
     double d1 = 1.0;
     float f1 = 1.0f;
     
     
     double d2 = 1.0/2.0;
      System.out.println(d2);
      
      double d3 = 10.0/3.0 ;
      System.out.println(d3);
      
      
      float f2 = 10.0f/3.0f ;
      System.out.println(f2);
      
      
      //char
      char c1 = 'A';
      System.out.println(c1);
     
      char c2 = 65;   //국제 표준임. 숫자 65는 A를 나타냄->이게 메모리에 들어갈 때는 65가 2진수로 들어감
      System.out.println(c2);
      
      int n3 = 10;
      double n4 = 10.0;
      double result = n3;      
      
	}

}
