package com.qf.day14_1;
/*
 * Math
 */
public class Demo4 {
	public static void main(String[] args) {
		//1绝对值
		System.out.println("Math.abs---------");
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(2.8));
		System.out.println(Math.abs(-2.8));
		//2立方根
		System.out.println("Math.cbrt---------");
		System.out.println(Math.cbrt(27));
		//3ceil()返回大于或等于这个数字的最小整数
		System.out.println("Math.ceil---------");
		System.out.println(Math.ceil(5));
		System.out.println(Math.ceil(5.2));
		System.out.println(Math.ceil(5.5));
		System.out.println(Math.ceil(5.8));
		System.out.println("Math.floor---------");
		//4floor()返回小于或等于这个数字的最大整数
		System.out.println(Math.floor(3.5));
		System.out.println(Math.floor(4));
		System.out.println(Math.floor(3.2));
		//5pow(double a, double b) a的b次幂
		System.out.println("Math.pow---------");
		System.out.println(Math.pow(2,10));
		//6random()，返回0-1之间的随机数  含0不含1
		System.out.println(Math.random());
		//7round(); 把小数部分去掉，只有整数部分
		System.out.println("Math.round---------");
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(2.89));
		System.out.println((double)Math.round(1.43389*100)/100);
		//8平方根
		System.out.println("Math.sqrt---------");
		System.out.println(Math.sqrt(25));
		
		
		
	}
}
