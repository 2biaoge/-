package com.qf.day19_6;

public class Test {
	public static void main(String[] args) {
		YieldThread y1=new YieldThread();
		//y1.setPriority(10);
		YieldThread y2=new YieldThread();
		y1.start();
		y2.start();
		
		
		
	}
}
