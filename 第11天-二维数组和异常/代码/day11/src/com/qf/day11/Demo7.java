package com.qf.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

/*
 * throws :声明异常 ,一般不声明运行时异常，声明编译时异常,告诉调用者，此方法会发生异常。
 */
public class Demo7 {
	public static void main(String[] args) throws Exception{
		/*try {
			divide();
		} catch (Exception e) {
			System.out.println("出现异常了...");
		}*/
		divide();
	
	}

	public static void divide() throws  Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1 = input.nextInt();
		System.out.println("请输入第二个数");
		int num2 = input.nextInt();
		int result = num1 / num2;
		System.out.println("结果是:" + result);
		System.out.println("程序执行完毕...");

	}
}
