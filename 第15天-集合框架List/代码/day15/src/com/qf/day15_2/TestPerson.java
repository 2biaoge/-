package com.qf.day15_2;

public class TestPerson {
	public static void main(String[] args) {
		Person<String> p1=new Person<String>();
		p1.setT("hello");
		System.out.println(p1.getT());
		
		Person<Integer> p2=new Person<Integer>();
		p2.setT(20);
		System.out.println(p2.getT());
 	}
}
