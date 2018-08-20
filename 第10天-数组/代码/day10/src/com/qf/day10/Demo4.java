package com.qf.day10;
/*
 * 数组内存分配
 */
public class Demo4 {
	public static void main(String[] args) {
		//1创建数组
		String[] names={"张三","李四","王五"};
		names[0]="赵六";
		System.out.println("修改之前遍历names........");
		for(String s:names){
			System.out.println(s);
		}
		
		String[] names2=names;
		names2[2]="田七";
		System.out.println("修改之后遍历names........");
		for(String s:names){
			System.out.println(s);
		}
		
		names2=new String[5];
		names2[0]="1111";
		names2[1]="2222";
		names2[2]="3333";
		names2[3]="4444";
		names2[4]="5555";
		
	}
}
