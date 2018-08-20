package com.qf.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

/*
 * try ... finally 处理不了异常，只能释放资源
 */
public class Demo6 {
	public static void main(String[] args) {
//		try {
			divide();
//		} catch (Exception e) {
//			System.out.println("处理异常了...");
//		}
		
	}

	public static void divide() {
		Scanner input = new Scanner(System.in);
		try {// 有可能发生异常...
			System.out.println("请输入第一个数");
			int num1 = input.nextInt();
			System.out.println("请输入第二个数");
			int num2 = input.nextInt();
			int result = num1 / num2;
			System.out.println("结果是:" + result);
		} 
		finally { // 包含必须执行的代码，比如，释放资源的代码
			System.out.println("finally执行了");
			input.close();
		}
		System.out.println("程序执行完毕...");

	}
}
