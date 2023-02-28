package oop3;

public class Car {
	private String name;
	private String color;
	private int size;
	private int fsize;    //기름통사이즈
	private int cfsize;   //현재의 기름사이즈
	
	// 생성자. (constructor)
	
	//default constructor
	public Car() {
	}

	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
	}

	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize);             //위의 constructor를 가져와서 만듬
		this.cfsize = cfsize;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}
	
	/* 기름을 넣는다. (return값이 없음. 기름은 넣고,return이 없다- void)
	기름통보다 많은 양을 넣으면 -다시 주유 하세요
	음수 값이 들어가면 - 다시 주유 하세요
	 */
	public void setCfsize(int size) {
		if(size <= 0 || fsize <(cfsize+size) ) {
			System.out.println("다시주유하세요");
			return;
		} 		
		cfsize += size;                      
	   //cfsize = cfsize + size
	   // cfsize;현재의 기름사이즈  fsize;기름통사이즈
	}
	
	
	// 주행을 한다.
	// 1리터당 10km를 주행 할 수 있다.
	public void go(int distance) {
		if(cfsize < 0 || cfsize < (distance/10)){
			System.out.println("주유하시고 출발 하세요");
			return;
		}
		System.out.printf("%s Go ...", this.name, distance);
		cfsize = cfsize - (distance/10);
	}
	
	// 멈춘다.
	public void stop() {
		System.out.printf("%s Stop ...", this.name );
	}
	
	


	

	
	
	
	
}