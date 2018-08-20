package com.qf.task2;

public class NormalPhone extends Phone {

	public NormalPhone() {
		// TODO Auto-generated constructor stub
	}
	
	
	public NormalPhone(String brand, String type) {
		super(brand, type);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void call() {
		System.out.println("普通手机打电话....");

	}

	@Override
	public void sendMsg() {
		System.out.println("普通手机发短信....");
	}

	@Override
	public void show() {
		System.out.println("这是一款普通手机,手机品牌是:"+getBrand()+",型号是:"+getType());
	}

}
