package com.qf.day20_7;
/*
 * 面包容器
 */
public class BreadCon {
	private Bread con;
	private boolean flag; //
	
	
	//放入面包
	public synchronized void input(Bread b){
		while(flag==true){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		this.con=b;
		System.out.println(Thread.currentThread().getName()+"生产了"+b.getId());
		flag=true;
		this.notifyAll();
	}
	
	//吃面包
	public synchronized void output(){
		while(flag==false){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		Bread b=con;
		con=null;
		System.out.println(Thread.currentThread().getName()+"消费了"+b.getId()+" 生产者:"+b.getProductName());
		flag=false;
		this.notifyAll();
	}
}
