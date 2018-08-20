package com.qf.day20_6;

public class Test extends Object{
	public static void main(String[] args) {
		//1创建银行卡
		BankCard  card=new BankCard();
		//2存取
		SaveMoney save=new SaveMoney(card);
		//3取钱
		SubMoney sub=new SubMoney(card);
		//4创建线程对象
		Thread zhangsan=new Thread(save,"张三");
		Thread lisi=new Thread(save,"李四");
		Thread xiaocang=new Thread(sub,"小苍");
		Thread xiaoze=new Thread(sub,"小泽");
		zhangsan.start();
		lisi.start();
		xiaocang.start();
		xiaoze.start();
	}
}
