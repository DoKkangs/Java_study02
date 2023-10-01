package ch03;

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
		
		System.out.println("VipCustomer(int,String) 호출");
	}
	
	public String getAgentId() {
		
		return agentId;
	}
	
	
	
}
