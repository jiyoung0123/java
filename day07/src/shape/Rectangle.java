package shape;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	
    //constructor
	public Rectangle() {
	}
	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
 

	public Rectangle(int x, int y, double width, double height) {
		//상위 class를 이용해서 x,y 좌표를 가져옴
		super(x, y);
		this.width = width;
		this.height = height;
	}


	//자동으로 나옴. abstract에서 상속받은거니깐, 반드시 있어야 한다
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircumn() {
		return (width+height)*2;
	}

}
