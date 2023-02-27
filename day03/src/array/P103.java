package array;

public class P103 {

	public static void main(String[] args) {
		
		//int arr[] = new int[3];       //이 방법으로 배열 생성
		//int []arr = new int[3];       //이 방법도 가능

		//int arr[] = new int[3];
		//arr[0] = 10;
		//arr[1] = 20;
		//arr[2] = 30;
		int arr[]= {10,20,30};         //이 방법도 가능, 한가지 type만 넣을 수 있으니, 30.0 이런건 안됨
		System.out.println(arr);

	
		for (int data : arr) { 
			System.out.printf("%d \t", data);
		}

	}
}
