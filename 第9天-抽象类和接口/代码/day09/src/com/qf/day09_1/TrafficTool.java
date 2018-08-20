package com.qf.day09_1;

public abstract class TrafficTool {
	private String brand;//品牌
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public abstract void run();
	
}
