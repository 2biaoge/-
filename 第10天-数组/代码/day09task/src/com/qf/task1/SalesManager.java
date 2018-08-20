package com.qf.task1;

public class SalesManager extends Employee {

	private double sales;//销售额
	private double monthlyPay;//固定工资
	public final double bonus=0.10;

	public double getSales() {
		return sales;
	}



	public void setSales(double sales) {
		this.sales = sales;
	}



	public double getMonthlyPay() {
		return monthlyPay;
	}



	public void setMonthlyPay(double monthlyPay) {
		this.monthlyPay = monthlyPay;
	}



	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return getSales()*bonus+getMonthlyPay();
	}

}
