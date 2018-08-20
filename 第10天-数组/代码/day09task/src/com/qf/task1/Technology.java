package com.qf.task1;
/*
 * 技术员
 */
public class Technology extends Employee {

	//常量
	public final double hourlyPay=80;
	private double hours;

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public double calcSalary() {
		
		return hourlyPay*getHours();
	}


}
