package com.qf.day18_6;

import java.io.Serializable;

/*
 * 学生类
 * 实现Serializable接口，这是一个标记接口，作用表示这个类可以被序列化
 */
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 200L;
	private String name;
	private transient int age;// transient ：瞬间的短暂的
	public static String country="中国";
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
