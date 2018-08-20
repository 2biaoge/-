package com.qf.day19_4;

public class Test {
	public static void main(String[] args) {
		//1创建银行卡
		BankCard card=new BankCard();// 0
		//2存取功能
		SaveMoney save=new SaveMoney(card);
		//3取钱功能
		SubMoney sub=new SubMoney(card);
		//4线程对象
		Thread shaqiang=new Thread(save,"张莎强");
		Thread fengjie=new Thread(sub,"凤姐");
		//5启动
		
		shaqiang.start();
		fengjie.start();
		
	}
}
