package shape;

public class Triangle extends Shape{
	private double width;
	private double height;
	
	//constructor
		public Triangle() {
		}
		
		
		public Triangle(double width, double height) {
			this.width = width;
			this.height = height;
		}
	 

		public Triangle(int x, int y, double width, double height) {
			//상위 class를 이용해서 x,y 좌표를 가져옴
			super(x, y);
			this.width = width;
			this.height = height;
		}

	
	@Override
	public double getArea() {
		return width*height /2;
	}

	@Override
	public double getCircumn() {
		//z =x2 + y2
		
		double result = 0.0;
		double z = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return z + width + height; 
	}

}
