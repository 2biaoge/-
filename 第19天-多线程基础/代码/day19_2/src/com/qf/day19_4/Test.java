package com.qf.day19_4;

public class Test {
	public static void main(String[] args) throws Exception{
		//1创建线程对象
		JoinDemo j1=new JoinDemo();
	
		//2启动
		j1.start();
		//3合并线程（加入线程）
		j1.join();//阻塞主线程
		for(int i=0;i<10;i++){
			System.out.println("主线程*******************"+i);
		}
	}
}
