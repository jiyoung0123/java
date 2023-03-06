package shape;

public class App {

	public static void main(String[] args) {
		//아래는 생성할 수 없다. -abstract
		//Shape s  = new Shape(10,10);
		// Cannot instantiate the type Shape		
		
		Shape s1 = new Triangle(10,20,100,80);
		System.out.println(s1.getXY());
		System.out.println(s1.getArea());
		System.out.println(s1.getCircumn());
	}

}
