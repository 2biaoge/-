package com.qf.day15_2;
/*
 * 定义泛型方法
 */
public class Student {
	
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public <T> void show(T t){
		System.out.println(t);
	}
	
}
