package com.qf.day19;
/*
 * 多线程步骤
 *  1 继承Thread类，重写run方法
 *  2 创建线程对象
 *  3 启动
 */
public class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			
			System.out.println("子线程在执行..."+i+"....."+Thread.currentThread().getName());
		}
	}
}
