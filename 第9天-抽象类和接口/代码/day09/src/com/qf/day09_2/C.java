package com.qf.day09_2;

public interface C extends A,B{

		//从jdk1.8之后可以包含静态方法和默认方法
		public static void haha(){
			System.out.println("haha");
		}
		
		public default void heihei(){
			System.out.println("heihei");
		}

}
