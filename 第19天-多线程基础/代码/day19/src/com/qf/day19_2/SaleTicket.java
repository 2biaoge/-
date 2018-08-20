package com.qf.day19_2;

public class SaleTicket extends Thread {
	
	public SaleTicket(String name){
		super(name);
	}
	private int ticket=100;//票
	@Override
	public void run() {
		while(true){
			if(ticket<1){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"卖了第"+ticket+"张票");
			ticket--;
		}
	}
}
