package com.apps.classes;

public class Companies {

	String companyName;
	String location;
	float profit;
	float loss;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getProfit() {
		return profit;
	}
	public void setProfit(float profit) {
		this.profit = profit;
	}
	public float getLoss() {
		return loss;
	}
	public void setLoss(float loss) {
		this.loss = loss;
	}
	@Override
	public String toString() {
		
		return String.valueOf(profits());
	}
	public float profits() {
		return profit-loss;
	}
	
}
