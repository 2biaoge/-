package com.qf.day18;

import java.io.Serializable;
/*
 * Serializable 标记接口
 */
public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 200L;
	private String brand;
	private String color;
	private int money;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String brand, String color, int money) {
		super();
		this.brand = brand;
		this.color = color;
		this.money = money;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", money=" + money + "]";
	}
	
	
}
