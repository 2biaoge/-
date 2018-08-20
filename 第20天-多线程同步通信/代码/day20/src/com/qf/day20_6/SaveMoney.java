package com.qf.day20_6;

public class SaveMoney implements Runnable{

	private BankCard card;
	public SaveMoney(BankCard card) {
		this.card=card;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
				card.save();
		}
	}
	

}
