package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer desktop = new Desktop();
//		Computer computer = new Computer(); //추상 클래스는 new할 수 없다.
		desktop.display();
//		desktop.DesktopShowInfo() //업캐스팅 되 있으므로 desktop에 있는 메서드는 사용불가 computer에 메서드만 사용가능.
		
		MyNoteBook myNoteBook = new MyNoteBook();
		myNoteBook.typing();
		myNoteBook.display();
		
	}
}
