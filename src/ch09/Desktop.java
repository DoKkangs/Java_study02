package ch09;

public class Desktop extends Computer{

	@Override
	void display() {
		System.out.println("Desktop display");
	}

	@Override
	void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	public void turnOn() {
		System.out.println("Desktop turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("Desktop turn off");
	}
	
	public void DesktopShowInfo() {
		System.out.println("Desktop!!");
	}
	
	
}
