package com.qf.day20_4;
/*
 * 女孩
 */
public class Girl extends Thread{
	@Override
	public void run() {
		while (true) {
			synchronized (Lock.lockb) {
				System.out.println("女孩拿着lockb");
				synchronized (Lock.locka) {
					System.out.println("女孩拿到了locka");
					System.out.println("女孩可以吃了...");
				}
			} 
		}
	}
}
