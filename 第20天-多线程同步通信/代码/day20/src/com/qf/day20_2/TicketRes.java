package com.qf.day20_2;

public class TicketRes implements Runnable{

	private  int ticket=100;
	//锁
	private Object lock=new Object();
	@Override
	public void run() {
		while(true){
			boolean b=sale();
			if(!b){
				break;
			}
		}
	}
	//卖票(同步的非静态方法，锁是this)
	public synchronized  boolean sale(){
			if(ticket<1){
				return false;//没票了
			}
			System.out.println(Thread.currentThread().getName()+"卖第"+ticket+"张票");
			ticket--;
			return true;
	}
	//卖票2(同步的静态方法,锁是类.class 类对象)TicketRes.class
//	public   static boolean sale2(){
//		synchronized (TicketRes.class) {
//			if(ticket<1){
//				return false;//没票了
//			}
//			System.out.println(Thread.currentThread().getName()+"卖第"+ticket+"张票");
//			ticket--;
//			return true;
//		}
//			
//	}
}
