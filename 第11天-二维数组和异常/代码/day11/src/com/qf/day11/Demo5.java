package com.qf.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

/*
 * 多重catch
 */
public class Demo5 {
	public static void main(String[] args) {
		divide();
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
		} catch (NullPointerException e) {// 捕获，并处理异常
			System.out.println("出现空指针异常...");
			e.printStackTrace();// 打印异常信息
		} catch (ArithmeticException e) {
			System.out.println("出现算术异常...");
			e.printStackTrace();// 打印异常信息
		}catch (Exception e) {
			System.out.println("出现异常...");
			e.printStackTrace();// 打印异常信息
		}
		finally { // 包含必须执行的代码，比如，释放资源的代码
			System.out.println("finally执行了");
			input.close();
		}
		System.out.println("程序执行完毕...");

	}
}
