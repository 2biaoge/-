package com.qf.day11;

import java.io.FileInputStream;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
//		Object o=null;
//		System.out.println(o.toString());
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1=input.nextInt();
		System.out.println("请输入第二个数");
		int num2=input.nextInt();

		int result=num1/num2;
		System.out.println("结果是:"+result);
		
		//FileInputStream fis=new FileInputStream("d:\\aaa.txt");
	}
}
