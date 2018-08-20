package com.qf.day12_5;
/*
 * 老板类
 * 1.私有化构造方法
 * 2.创建一个对象
 * 3.提供公开的方法，返回对象
 */
public class Boss {
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
	
	private Boss(){
		
	}
	private static Boss boss;
	public static Boss getBoss(){
		if(boss==null){
			boss=new Boss();
		}
		return boss;
	}
	
}
