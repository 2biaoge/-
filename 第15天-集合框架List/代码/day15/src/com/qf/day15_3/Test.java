package com.qf.day15_3;

public class Test {
	public static void main(String[] args) {
//		School<String> qf=new School<String>();
//		qf.setName("千锋");
//		qf.setT("hello");
//		show(qf);
//		
//		School<Integer> qf2=new School<Integer>();
//		qf2.setName("千锋2");
//		qf2.setT(11);
//		show(qf2);
		
		
		
//		School<Animal> qq=new School<Animal>();
//		qq.setName("animal");
		
		//School<String> qq=new School<String>();
		
		//show2(qq);
		
		//School<Cat> school=new School<Cat>();
		//show3(school);
		
	}
	public static void show(School<?> shool){ //? 表示任何类型
		System.out.println(shool.toString());
	}
	public static void show2(School<? extends Animal> shool){ //? 表示Animal或Animal的子类  泛型上限
		System.out.println(shool.toString());
	}
	
	public static void show3(School<? super Dog> shool){ //? 表示Dog或Dog的父类  泛型下限
		System.out.println(shool.toString());
	}
}
