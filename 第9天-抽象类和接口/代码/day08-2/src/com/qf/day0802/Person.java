package com.qf.day0802;

public  class Person {
	final String name;
	//在构造方法中赋值
	public Person(){
		name="zhangsan";
	}
	
	
	public final void show(){//可以被继承，不能被重写
		System.out.println(name);
	}
}	
