package com.qf.day19;
/*
 * 执行main方法的线程叫主线程
 */
public class Demo1 {
	public static void main(String[] args) {
		//2创建线程对象
		MyThread t1=new MyThread("线程1");
		MyThread t2=new MyThread("线程2");
	
		//3启动了一个子线程
		t1.start();
		t2.start();
		for(int i=0;i<100;i++){
			System.out.println("主线程执行了******"+i);
		}
		
	}
}
