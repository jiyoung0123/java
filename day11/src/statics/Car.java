package statics;

public class Car {
	private String name;
	private String maker;
	public static String makerName = "HD";
	
	//static 이라고 된 부분은 객체가 생성이 될 때 관여하지 않는다
	//객체생성이랑은 별도	
		
	//static은 뭐지? static field의 주인은 class 다
	//자동차라는 class가 소유하고 있는 별도의 변수
	//car1,car2 라는 Car 객체들을 만들때 makerName은 관여하지 않는다
	//static 영역을 사용하는 방법은 class.변수 (Car.makerName)을 넣어서 불러서 씀
	//class가 보유하고 있는 기능일뿐
	//static 함수를 사용하려면, 그 안에 들어가는 변수는 static 변수가 들어가야 한다.
	

	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}

	public Car(String name, String maker) {
		this.name = name;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", maker=" + maker + "]";
	}
	

}
