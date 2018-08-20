package com.qf.day19_3;
/*
 * 优先级
 */
public class PriorityDemo extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println(Thread.currentThread().getName()+"...."+i);
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
