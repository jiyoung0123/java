package array;

public class P102 {

	public static void main(String[] args) {

		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr);

		for (int i = 0; i < arr.length; i++) {          //for문은 구닥다리방식임, 아래의 data 방식을 많이 사용
			System.out.printf("%d \t", arr[i]);
		}
		System.out.println("Type 2");
		for (int data : arr) { // arr의 집합체에 int형의 data를 하나씩 끄집어냄 끄집어낼 때 좋은 방법
			
			System.out.printf("%d \t", data);
		}

	}
}
