package com.qf.day19_3;

public class Test {
	public static void main(String[] args) {
		PriorityDemo p1=new PriorityDemo();
		PriorityDemo p2=new PriorityDemo();
		PriorityDemo p3=new PriorityDemo();
		//设置优先级
		p1.setPriority(1);
		p2.setPriority(5);
		p3.setPriority(10);
		
		//启动
		p1.start();
		p2.start();
		p3.start();
		
	}
}
