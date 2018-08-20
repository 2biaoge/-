package com.qf.day19_3;
/*
 * 票资源
 */
public class TicketRes implements Runnable{

	private  int ticket=100;//
	
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
