package com.qf.day09_3;

import java.util.logging.Level;

public class Test {
	public static void main(String[] args) {
		//1创建电脑
		Computer lenovo=new Computer();
		//2鼠标
		Mouse luoji=new Mouse();
		//3优盘
		Upan jinshidun=new Upan();
		//4风扇
		Fan meidi=new Fan();
		
		lenovo.usb1=luoji;
		lenovo.usb2=meidi;
		lenovo.usb3=jinshidun;
		
		lenovo.work();
	}
}
