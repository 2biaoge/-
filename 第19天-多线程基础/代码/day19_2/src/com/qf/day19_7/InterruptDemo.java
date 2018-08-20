package com.qf.day19_7;

public class InterruptDemo extends Thread{
	@Override
	public void run() {
		System.out.println("子线程开始执行了.............");
		try {
			System.out.println("子线程开始休眠 30秒.......");
			Thread.sleep(30000);
			System.out.println("子线程正常苏醒了...");
		} catch (InterruptedException e) {
			System.out.println("子线程被打醒了.....");
		}
		
		System.out.println("子线程结束了.......");
		
	}
}
