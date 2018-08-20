package com.qf.day20_5;

public class KingThread extends Thread{
	@Override
	public void run() {
		King king=King.getKing();
		System.out.println(Thread.currentThread().getName()+"...."+king.hashCode());
	}
}
