package com.qf.day12_5;

public class Test {
	public static void main(String[] args) {
//		SingleTon singleTon=new SingleTon();
//		SingleTon singleTon2=new SingleTon();
//		SingleTon singleTon3=new SingleTon();
//		SingleTon singleTon4=new SingleTon();
		
//		System.out.println(singleTon.hashCode());
//		System.out.println(singleTon2.hashCode());
//		System.out.println(singleTon3.hashCode());
//		System.out.println(singleTon4.hashCode());
		
		SingleTon singleTon=SingleTon.getInstance();
		SingleTon singleTon2=SingleTon.getInstance();
		SingleTon singleTon3=SingleTon.getInstance();
		SingleTon singleTon4=SingleTon.getInstance();
		System.out.println(singleTon.hashCode());
		System.out.println(singleTon2.hashCode());
		System.out.println(singleTon3.hashCode());
		System.out.println(singleTon4.hashCode());
	}
}
