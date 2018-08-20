package com.qf.day13;

public class Demo5 {
	public static void main(String[] args) {
		String a="深圳";
		System.out.println("修改之前:"+a);
		show(a);
		System.out.println("修改之后:"+a);
		
	}
	public static void show(String add){
		add="北京";
		System.out.println(add);
	}
}
