package com.techelevator.postage;

public class SPU implements DeliveryDriver{

	private String spuClass;
	
	public SPU(String spuClass) {
		
		this.spuClass = spuClass;
	}
	@Override
	public double CalculateRate(int distance, double weight) {
		
		double rate = 0.00;
		if (this.spuClass == "4-day") {
			rate = (weight * 0.0050) * distance;
		}
		
		if (this.spuClass == "2-day") {
			rate = (weight * 0.050) * distance;
		}
		
		if (this.spuClass == "next day") {
			rate = (weight * 0.075) * distance;
		}
		return rate;
	}

	@Override
	public String toString() {
		return "SPU " + "("+spuClass+")             ";
	}
	
}
