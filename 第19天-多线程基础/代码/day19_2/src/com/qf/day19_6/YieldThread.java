package com.qf.day19_6;

public class YieldThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"........"+i);
			//谦让 
			Thread.yield();
		}
	}
}
