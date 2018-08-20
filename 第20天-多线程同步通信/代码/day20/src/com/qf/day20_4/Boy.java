package com.qf.day20_4;

public class Boy extends Thread{
	@Override
	public void run() {
		while (true) {
			synchronized (Lock.locka) {
				System.out.println("男孩拿着locka");
				synchronized (Lock.lockb) {
					System.out.println("男孩拿到lockb");
					System.out.println("男孩可以吃了....");
				}
			} 
		}
	}
}
