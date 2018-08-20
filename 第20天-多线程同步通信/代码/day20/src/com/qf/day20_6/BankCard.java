package com.qf.day20_6;

public class BankCard {
	private int balance;
	
	private boolean flag;//false表示没钱，可以存取 ，true表示有钱,可以取钱

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	/*
	 * 存钱
	 */
	public synchronized void save(){//this
		
		while(flag==true){
			//等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		balance=balance+10000;
		System.out.println(Thread.currentThread().getName()+"存了10000，余额是:"+balance);
		flag=true;//有钱了
		//通知
		this.notifyAll();//通知小苍取钱
		
	}
	/*
	 * 取钱
	 */
	public synchronized void sub(){	//this
		while(flag==false){
			try {
				this.wait();//
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		balance=balance-10000;
		System.out.println(Thread.currentThread().getName() + "取了10000,余额是:" + balance);
		//修改标记
		flag=false;
		//通知张三存取
		this.notifyAll();
		

	}
	
}
