package com.qf.task1;
/*
 * 销售员
 */
public class Salesman extends Employee {

	private double sales;
	public final double  bonus=0.20;

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return getSales()*bonus;
	}



}
