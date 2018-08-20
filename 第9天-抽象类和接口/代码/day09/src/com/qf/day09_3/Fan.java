package com.qf.day09_3;

public class Fan implements USB{

	@Override
	public void service() {
		System.out.println("和电脑连接成功，风扇开始工作.....");
	}

}
