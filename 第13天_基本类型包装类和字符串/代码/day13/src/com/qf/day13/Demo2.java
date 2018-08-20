package com.qf.day13;
/*
 * 装箱:把基本类型转成包装类的过程
 * 拆箱:把包装类转成基本类型的过程
 */
public class Demo2 {
	public static void main(String[] args) {
		Integer num1=100; //装箱 Integer.valueOf(num1);
		
		Integer num2=new Integer(250);
		int num3=num2;//  拆箱 num2.intValue();
		
	}
}
