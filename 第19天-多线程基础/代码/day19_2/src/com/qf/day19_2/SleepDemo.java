package com.qf.day19_2;

public class SleepDemo extends Thread {
	@Override
	public void run() {
		for(int i=1;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"...."+i);
			//休眠一会
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
