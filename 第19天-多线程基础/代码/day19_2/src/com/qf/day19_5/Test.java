package com.qf.day19_5;

public class Test {
	public static void main(String[] args) {
		//1创建线程对象(前台线程)
		DeamonThread d1=new DeamonThread();
		//2启动
		//设置d1线程为后台线程
		d1.setDaemon(true);
		d1.start();
		
		for(int i=0;i<10;i++){
			System.out.println("主线程***************"+i);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
