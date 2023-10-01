package ch09;

//추상 클래스
public abstract class Computer {

	//추상 클래스는 상속을 하기 위한 클래스이다.
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
