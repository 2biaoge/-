package com.qf.day19_3;
/*
 * 四个窗口共卖100张
 */
public class Demo2 {
	public static void main(String[] args) {
		//1创建TicketRes
		TicketRes res=new TicketRes();

		//2创建窗口
		Thread w1=new Thread(res);
		Thread w2=new Thread(res);
		Thread w3=new Thread(res);
		Thread w4=new Thread(res);
			
		//3启动
		w1.start();
		w2.start();
		w3.start();
		w4.start();
		
	}
}
