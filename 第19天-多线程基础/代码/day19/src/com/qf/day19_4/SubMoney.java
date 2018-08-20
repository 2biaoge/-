package com.qf.day19_4;
/*
 * 取钱功能
 */
public class SubMoney implements Runnable{
	
	private BankCard card;
	public SubMoney(BankCard card) {
		this.card=card;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(card.getBanlance()>=10000){
				card.setBanlance(card.getBanlance()-10000);
				System.out.println(Thread.currentThread().getName()+"取了10000，余额是:"+card.getBanlance());
			}else{
				System.out.println("余额不足，该存钱了....");
				i--;
			}
			
		}
		
	}
}	
