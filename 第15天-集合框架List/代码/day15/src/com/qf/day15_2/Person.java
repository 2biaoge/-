package com.qf.day15_2;
/*
 * 定义泛型类
 * T (Type) ：是一个占位符,表示一种数据类型
 * E (Element) :
 * 	   
 */
public class Person<T> {
	private String name;
	private int age;
	private T t;
	//private T[] arr;
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
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public void show(){
		System.out.println(this.name+"..."+this.age);
	}
	
	
}
