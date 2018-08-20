package com.qf.task3;
/*
 * 雇员
 */
public class Employee implements Comparable<Employee>{
	private int age;
	private int workyear;
	private double salary;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWorkyear() {
		return workyear;
	}
	public void setWorkyear(int workyear) {
		this.workyear = workyear;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int age, int workyear, double salary) {
		super();
		this.age = age;
		this.workyear = workyear;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		int n1=this.age-o.age;
		int n2=o.workyear-this.workyear;
		int n3=Double.valueOf(o.salary).compareTo(this.salary);
	
		return n1==0?(n2==0?n3:n2):n1;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", workyear=" + workyear + ", salary=" + salary + "]";
	}
	
	
	
}
