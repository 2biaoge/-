package com.qf.day19_4;

import java.awt.CardLayout;

/*
 * 存钱功能
 */
public class SaveMoney implements Runnable{

	private BankCard card;
	public SaveMoney(BankCard card) {
		this.card=card;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			card.setBanlance(card.getBanlance()+10000);
			System.out.println(Thread.currentThread().getName()+"存了10000，余额是:"+card.getBanlance());
		}
		
	}
	
}
