package com.qf.task2;
/*
 * 手机类
 */
public  abstract class Phone {
	private String brand;//品牌
	private String type;//型号
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Phone(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}


	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public abstract void call();
	public abstract void sendMsg();
	public abstract void show();
}
