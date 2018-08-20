package com.qf.day18_2;

public class Test {
	public static void main(String[] args) throws Exception{
		String str="张三";
		byte[] bs=str.getBytes("utf-8");
		for (byte b : bs) {
			System.out.printf("%X",b);
		}
	}
}
