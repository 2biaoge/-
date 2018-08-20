package com.qf.day09_1;

public class Master {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Master() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Master(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void goHome(TrafficTool tool){
		System.out.println(name+"下班了...");
		tool.run();
		System.out.println(name+"到家了...");
	}
	
}
