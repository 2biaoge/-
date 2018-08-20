package com.qf.day0802;
/*
 * 1 final用法 修饰变量 ---》常量，不能再修改
 * 	1 修饰成员变量
 * 		-->声明同时赋值(推荐写法)
 *      -->在构造方法和静态代码块中赋值
 *  2 修饰局部变量    声明同时赋值
 */
public class Demo1 {
	static final String s;
	//静态代码块中赋值
	static{
		s="hello";
	}
	public static void main(String[] args) {
		System.out.println(s);
		final int num=10;//局部变量
		System.out.println(num);
	}
}
