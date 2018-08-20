package com.qf.day13;
/*
 * String类型
 * 特征：不可变性
 * 
 */
public class Demo4 {
	public static void main(String[] args) {
		String name="张三";  //"张三" 放在串池中
		String name2=name;
		String name3=new String("张三");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name==name2);
		System.out.println(name==name3);
		
		//修改
		name="李四";
		System.out.println(name);
		System.out.println(name2);
	}
}
