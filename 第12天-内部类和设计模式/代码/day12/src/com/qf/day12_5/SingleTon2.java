package com.qf.day12_5;
/*
 * 单例
 * 1.私有化构造方法
 * 2.在内部要创建一个对象，实例化，静态而且是常量
 * 3.提供公开的方法，返回这个对象
 * 饿汉式单例
 */
public class SingleTon2 {
	private SingleTon2(){
		
	}
	private static final SingleTon2 instance=new SingleTon2();
	
	public static SingleTon2 getInstance(){
		return instance;
	}
	
}
