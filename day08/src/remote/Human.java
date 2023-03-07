package remote;

public class Human {

	public static void main(String[] args) {
		//null에 tv를 넣냐, audio를 넣냐에 따라 원하는걸 켜고 끌 수 있다
		Remote remote = new Audio();
		remote.turnOff();
		remote.turnOn();
		

	}

}
