package com.qf.day10;
/*
 * 数组的内存分配
 */
public class Demo3 {
	public static void main(String[] args) {
		int[] a = {5,7,20};
		System.out.println("a的长度为：" + a.length);//3
		//修改数组的元素
		a[0]=50;
		a[1]=60;
		a[2]=80;
		System.out.println("a修改之前....");
		for(int num : a){
			System.out.println(num);
		}
		int[] b=a;//把a得地址赋值给b
		
		b[0]=1000; //修改b[0] 其实也修改了a
		System.out.println("a修改之后....");
		for(int num : a){
			System.out.println(num);
		}
		
		//给b重新赋值
		b=new int[4];
		b[0]=5;
		b[1]=7;
		b[2]=9;
		b[3]=11;
		
		System.out.println("b重新赋值后");
		for(int num : b){
			System.out.println(num);
		}
		
	}
}
