package com.qf.task1;



public class Test {
	public static void main(String[] args) {
		//1创建对象
		Technology technology=new Technology();
		technology.setName("亮亮");
		technology.setHours(200);
		//计算工资
		double s= technology.calcSalary();
		technology.setSalary(s);
		//计算等级
		int level=technology.calcLevel();
		technology.setSalaryLevel(level);
		//打印
		technology.show();
		
		//2创建销售员
		Salesman salesman=new Salesman();
		salesman.setName("冯鑫");
		salesman.setSales(50000);
		double s1=salesman.calcSalary();
		salesman.setSalary(s1);
		int level1=salesman.calcLevel();
		salesman.setSalaryLevel(level1);
		salesman.show();
		
		
	}
}
