package com.qf.day13;
/*
 * 包装类
 * byte-- Byte
 * short--Short
 * int--->Integer
 * long---Long
 * float---Float
 * double---Double
 * char--Character
 * boolean---Boolean
 * 
 */
public class Demo1 {
	public static void main(String[] args) {
//		byte b=12;
//		Byte b2=new Byte((byte)10);
//		Byte b3=6;
		
		int num=20;
		Integer num2=new Integer(150);
		Integer num3=new Integer(150);
		
		Integer num4=new Integer(20);
		
		System.out.println(num2==num3);
		//1 当基本类型和包装类型比较时，把包装类型转成基本类型再比较  (拆箱)
		System.out.println(num==num4); //num==num4.intValue();

		Integer num5=new Integer(127);
		Integer num6=new Integer(127);
		System.out.println(num5==num6); //false
		
		Integer num7=128; //装箱 Integer.valueOf(128);
		Integer num8=128;
		System.out.println(num7==num8);//false
		//Integer中有一个-128到127缓冲区
		Integer num9=127; //装箱
		Integer num10=127;
		System.out.println(num9==num10);//true
		
		
	}
}
