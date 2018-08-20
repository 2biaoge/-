package com.qf.day23;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello world");
		for (String string : args) {
			System.out.println(string);
		}
		Runtime runtime=Runtime.getRuntime();
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.freeMemory());
		System.out.println(runtime.totalMemory());
	}
	public static void main2(String s1,String s2,String s3) {
		
	}
}
