package com.qf.day11;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		divide();
	}
	public static void divide(){
		try {//有可能发生异常...
			Scanner input=new Scanner(System.in);
			System.out.println("请输入第一个数");
			int num1=input.nextInt();
			System.out.println("请输入第二个数");
			int num2=input.nextInt();
			int result=num1/num2;
			System.out.println("结果是:"+result);
		} catch (Exception e) {//捕获，并处理异常
			System.out.println("出现异常了...");
			e.printStackTrace();//打印异常信息
		}
		System.out.println("程序执行完毕...");
		
	}
}
