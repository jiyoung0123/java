package oop1;

public class Car {
	public String name;
	public String color;
	public int size;
	
	// 생성자. (constructor)     -class에서 생성이 될 때 셋팅만 해주는 역할	default로 생성되는 역할의 constructor
	public Car() {               //constructor에 들어가는 내용이 argument
		this.name = "k1";
		this.color = "red";
		this.size = 1000;
	}
	
	
	
	//constructor는 이름이 같아도, 들어가는 내용이 달라지면 
	public Car(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
	
	public void go() {
		System.out.printf("%s, %s Go Car...", this.name, this.color);
		
	}
	public void stop() {
		System.out.printf("%s, %s stop Car...", this.name, this.color);
	}

}
