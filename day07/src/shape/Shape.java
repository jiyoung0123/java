package shape;

//abstract class는 일반 class 와 동일하다
public abstract class Shape {
	
	protected int x;
	protected int y;
	
	
	//constructor
	public Shape() {
	}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//Abstract Method
	public abstract double getArea();
	public abstract double getCircumn();
	
	public String getXY() {
		return x + " , " +y;
		
	}
	
	//getter and setter
	
}
