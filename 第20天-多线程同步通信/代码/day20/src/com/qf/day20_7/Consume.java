package com.qf.day20_7;
/*
 * 消费面包
 */
public class Consume implements Runnable{
	private BreadCon con;
	public Consume(BreadCon con) {
		this.con=con;
	}
	@Override
	public void run() {
		for(int i=1;i<=30;i++){
			con.output();
		}
	}
}
