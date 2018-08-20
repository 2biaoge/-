package com.qf.day09_1;

public class Test {
	public static void main(String[] args) {
		//1主人
		Master laowang=new Master("老王",33);
		//2创建交通工具
		TrafficTool tool=new Car();
		tool.setBrand("宝马x6");
		//3回家
		laowang.goHome(tool);
		
	}
}
