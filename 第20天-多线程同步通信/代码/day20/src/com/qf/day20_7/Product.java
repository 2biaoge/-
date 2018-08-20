package com.qf.day20_7;
/*
 * 生产面包类
 */
public class Product implements Runnable{
	private BreadCon con;
	public Product(BreadCon con) {
		this.con=con;
	}
	@Override
	public void run() {
		for(int i=1;i<=30;i++){
			Bread b=new Bread(i, Thread.currentThread().getName());
			this.con.input(b);
		}
	}
}
