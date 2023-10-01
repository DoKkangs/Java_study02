package ch02;

public class VipCustomer extends Customer{

	
	double saleRatio;
	private String agentId;
	
	public VipCustomer() {
		
		saleRatio = 0.1;
		bonusRatio = 0.05;
		customerGrade = "VIP";
	}
	
	public String getAgentId() {
		return agentId;
	}
	
}
