package ch11;

public class CalcuratorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
//		Calc calc = new CompleteCalc();  //인터페이스로 선언
		CompleteCalc calc = new CompleteCalc(); //CompleteCalc()는 Calc인터페이스를 구현한 것이고 CompleteCalc는 Calc의 타입이다.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.devide(num1, num2));
		
		calc.showInfo(); // CompleteCalc로 선언됬을때만 볼 수 있음 Calc 인터페이스로 선언된 경우는 안보임


	}
}
