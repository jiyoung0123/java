package aggregation;

public class App {

	public static void main(String[] args) {
		//자동차가 없는 haman 생성
		Human human = new Human("James");
		System.out.println(human);
		
		Car car = new Car("k1", "red", 1000);
		human.setCar(car);
		System.out.println(human);
		
		human.drive();
		System.out.println("");
		human.stopCar();

	}

}
