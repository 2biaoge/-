package com.qf.day20;

public class TicketRes implements Runnable{

	private int ticket=100;
	//锁
	private Object lock=new Object();
	@Override
	public void run() {
		while(true){
			synchronized (lock) {//this:表示当前对象，只有一个
					if(ticket<1){
						break;
					}
					System.out.println(Thread.currentThread().getName()+"卖第"+ticket+"张票");
					ticket--;
			}
		
		}
	}

}
