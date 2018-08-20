package com.qf.day20_3;

import java.util.concurrent.locks.ReentrantLock;

public class TicketRes implements Runnable{

	private int ticket=100;
	//可重入锁
	private ReentrantLock lock=new ReentrantLock();
	@Override
	public void run() {
		while(true){
					lock.lock();//上锁
					try {
						if (ticket < 1) {
							break;
						}
						System.out.println(Thread.currentThread().getName() + "卖第" + ticket + "张票");
						ticket--;
					} finally {
						lock.unlock();
					}

		}
	}
	

}
