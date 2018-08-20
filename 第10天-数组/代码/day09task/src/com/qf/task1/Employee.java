package com.qf.task1;

/*
 * 员工
 */
public abstract class Employee {
	//计算器
	public static int count=1;
	
	private int id;// 编号
	private String name;// 名字
	private double salary;// 工资
	private int salaryLevel;// 工资级别
	
	public Employee(){
		//自动给id赋值
		id=count;
		count++;
	}

	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(int salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	// 1计算工资的方法
	public abstract double calcSalary();

	// 2计算级别的方法
	public  int calcLevel(){
		double s=getSalary();
		if(s>8000){
			return 4;
		}else if(s>5000){
			return 3;
		}else if(s>3000){
			return 2;
		}else {
			return 1;
		}
	}

	// 3显示信息
	public void show() {
		System.out.println("编号是" + this.id + "的员工（技术员、销售员、销售经理、经理）的姓名是" + this.name + "，工资是" + this.salary + "，工资级别是"
				+ this.salaryLevel);
	}
}
