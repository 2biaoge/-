package com.qf.day19;
/*
 * 线程类
 */
public class ThreadDemo extends Thread{
	
	public ThreadDemo(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+"......"+i);
		}
	}
}
