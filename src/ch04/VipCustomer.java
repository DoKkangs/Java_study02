package ch04;

public class VipCustomer extends Customer{

	

	double saleRatio;
	private String agentId;
	
	/* public VipCustomer() {
//		super(); // 안써도 컴파일러가 자동으로 넣어줌.
		
		super(0, "no name");
		saleRatio = 0.1;
		bonusRatio = 0.05;
		customerGrade = "VIP";
		
		System.out.println("VipCustomer() 호출");
	}*/
	
	public VipCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
	}
	
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * saleRatio);
		return price;
	}



	public String getAgentId() {
		
		return agentId;
	}
	
	
	
}
