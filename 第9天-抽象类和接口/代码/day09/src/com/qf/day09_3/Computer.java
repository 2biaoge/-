package com.qf.day09_3;

public class Computer {
	//电脑拥有三个usb接口
	USB usb1;
	USB usb2;
	USB usb3;
	
	//电脑工作方法
	public void work(){
		if(usb1!=null){
			usb1.service();
		}
		if(usb2!=null){
			usb2.service();
		}
		if(usb3!=null){
			usb3.service();
		}
	}
}
