package com.qf.day20_2;

public class Test {
	public static void main(String[] args) {
		//1创建票资源
		TicketRes res=new TicketRes();
		//2创建四个窗口
		Thread t1=new Thread(res,"窗口1");
		Thread t2=new Thread(res,"窗口2");
		Thread t3=new Thread(res,"窗口3");
		Thread t4=new Thread(res,"窗口4");
		//3启动线程
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
