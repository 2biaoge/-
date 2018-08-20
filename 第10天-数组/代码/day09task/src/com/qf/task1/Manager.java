package com.qf.task1;

public class Manager extends Employee {

	private double monthlyPay;
	
	public double getMonthlyPay() {
		return monthlyPay;
	}

	public void setMonthlyPay(double monthlyPay) {
		this.monthlyPay = monthlyPay;
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return getMonthlyPay();
	}

}
