package com.qf.day09_3;

public class Mouse implements USB{

	@Override
	public void service() {
		System.out.println("和电脑连接成功,鼠标开始工作.....");
	}

}
