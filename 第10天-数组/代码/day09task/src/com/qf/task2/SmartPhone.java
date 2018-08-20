package com.qf.task2;

public class SmartPhone extends Phone implements Photoable,PlayVideoable{
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	

	public SmartPhone(String brand, String type) {
		super(brand, type);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void call() {
		System.out.println("智能手机打电话.....");
		
	}

	@Override
	public void sendMsg() {
		System.out.println("智能手机发短信....");
	}

	@Override
	public void show() {
		System.out.println("这是一款智能手机，品牌是:"+getBrand()+"型号是:"+getType());
		
	}


	@Override
	public void photo() {
		System.out.println("智能手机进行美颜拍照.....");
	}


	@Override
	public void playVideo() {
		System.out.println("智能手机可以播放大片.....");
		
	}


	
	
}
