package com.qf.day19_2;


/*
 * 四个窗口个卖100张票
 */
public class Demo1 {
	public static void main(String[] args) {
		//1创建四个窗口
		SaleTicket w1=new SaleTicket("窗口1");
		SaleTicket w2=new SaleTicket("窗口2");
		SaleTicket w3=new SaleTicket("窗口3");
		SaleTicket w4=new SaleTicket("窗口4");
		
		//2启动
		w1.start();
		w2.start();
		w3.start();
		w4.start();
	}
}
