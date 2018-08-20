package com.qf.day12_5;
/*
 * 单例设计模式
 * 1.把构造方法变成私有的
 * 2.在类内部创建一个对象，添加一个静态成员变量
 * 3.提供一个公开的方法，返回创建的这个对象
 * 懒汉式单例
 */
public class SingleTon {
	private SingleTon(){
		
	}
	private static SingleTon instance;//默认值null
	
	public static SingleTon getInstance(){
		if(instance==null){
			instance=new SingleTon();
		}
		return instance;
	}
}
