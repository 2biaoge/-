package com.qf.day12_5;

public class Test2 {
	public static void main(String[] args) {
		SingleTon2 s=SingleTon2.getInstance();
		SingleTon2 s2=SingleTon2.getInstance();
		SingleTon2 s3=SingleTon2.getInstance();
		SingleTon2 s4=SingleTon2.getInstance();
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
