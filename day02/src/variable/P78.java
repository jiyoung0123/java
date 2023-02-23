package variable;

public class P78 {

	public static void main(String[] args) {
        int a = 10;
        a = --a + 1 ;   //이때 CPU가 돌아감
        //a-1 과 a--는 같은 의미지만, a--가 더 빠르게 진행이 된다
        System.out.println(a);
        
        int b = 20;
        b += 1;
        // b = b + 1;

	}

}
