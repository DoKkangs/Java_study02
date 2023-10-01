package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010,"이순신");
		
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VipCustomer customerKim = new VipCustomer(10020,"김유신");
		
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VipCustomer(1234, "noname"); //형변환(업캐스팅)
		// vc. //인스턴스는 vipcustomer로 다 만들어져있지만 타입이 customer로 바인딩 되있으므로 customer의 멤버변수와 메서드만 사용가능.
		//변수는 자기 타입것만 사용 가능.
		
	}
}
