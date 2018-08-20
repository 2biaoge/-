package com.qf.day13;
/*
 * 基本类型和字符串之间的转换
 */
public class Demo3 {
	public static void main(String[] args) {
		//1基本类型转成字符串
		int i=10;
		String s=i+"";
		
		boolean b=true;
		String s2=String.valueOf(b);
		System.out.println(s2);
		//2把字符串转成基本类型
		String s3="12";
		String s4="3.14";
		String s5="false"; //"true"转成true,如果不是，则转成false
		int num=Integer.parseInt(s3);
		double d=Double.parseDouble(s4);
		boolean b2=Boolean.parseBoolean(s5);
		System.out.println(num);
		System.out.println(d);
		System.out.println(b2);
		
		//3字符串转成char
		String s6="hello";
		char c=s6.charAt(1);
		System.out.println(c);
		
		int num5=Integer.valueOf("20");
		
	}
}
