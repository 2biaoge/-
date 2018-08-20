package com.qf.day19_7;

import java.awt.event.ItemEvent;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception{
		System.out.println("主线程执行了.....");
		InterruptDemo interruptDemo=new InterruptDemo();
		interruptDemo.start();
		System.out.println("30秒内按任意键结束子线程");
		System.in.read();//程序会让用输入一个数据
		interruptDemo.interrupt();//打断线程
		System.out.println("主线程结束了.............");
		
	}
}
