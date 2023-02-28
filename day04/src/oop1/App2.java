package oop1;

public class App2 {

	public static void main(String[] args) {
		Car car1 = new Car("k2","blue",2000);  //객체를 만들 때 속성을 셋팅하는것 오른쪽에서 메모리가 만들어지고,k2","blue",2000 
		                                      //해당 주소는 왼쪽에 만들어짐(car1)car1은 3가지 속성의 주소를 가리키는것
		car1.go();                            //car1 주소의 행위를 나타냄
		car1.stop();
		System.out.println("--------------");
		
		Car car2 = new Car("k3","white",3000);
		car2.go();
		car2.stop();

	}

}
