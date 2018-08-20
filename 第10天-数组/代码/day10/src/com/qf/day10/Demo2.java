package com.qf.day10;

import java.util.Scanner;

/*
 * 数组操作
 */
public class Demo2 {
	public static void main(String[] args) {
		//Scanner input=new Scanner(System.in);
		//1 数组的遍历
		//1.1声明数组
		int[] nums=new int[5];//声明数组，长度为5，每个元素是默认值
		//1.2遍历默认值
		System.out.println("赋值之前------------");
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
		//1.3给数组赋值
		for (int i = 0; i < nums.length; i++) {
			nums[i]=(int)(Math.random()*100)+1;
			//nums[i]=input.nextInt();
		}
		System.out.println("赋值之后--------------");
		//1.4遍历数组
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		//1.5在jdk1.5之后 使用foreach遍历  、增强for循环 (for ：) 
		System.out.println("使用增强for循环遍历");
		
		for(int n : nums){ //遍历数组中的每个元素，赋值n,增强for没有下标
			System.out.println(n);
		}
		
	}
}
