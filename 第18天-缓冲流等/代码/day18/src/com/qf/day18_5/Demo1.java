package com.qf.day18_5;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * 重定向标准输入输出流
 */
public class Demo1 {
	public static void main(String[] args) throws Exception{
		//1重定向标准输出流(硬盘中一个文件中d:\\out.txt)
		System.setOut(new PrintStream("d:\\out.txt"));
		System.out.println("哈哈哈哈");
		System.out.println("嘿嘿嘿额");
		//2重定向标准输入流
//		System.setIn(new FileInputStream("d:\\in.txt"));
//		Scanner input=new Scanner(System.in);
//		String s=input.next();
//		System.out.println(s);
		//3重定向标准错误输出流
		System.setErr(new PrintStream("d:\\error.txt"));
		System.err.println("这是一个错误");
	}
}
