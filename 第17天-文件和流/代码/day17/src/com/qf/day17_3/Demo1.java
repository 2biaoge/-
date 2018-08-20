package com.qf.day17_3;

import java.io.FileReader;
import java.io.Reader;
import java.lang.ProcessBuilder.Redirect;

/*
 * 使用字符输入流读取文件
 */
public class Demo1 {
	public static void main(String[] args) throws Exception{
		//1创建字符文件输入流
		Reader reader=new FileReader("d:\\123.txt");
		//2读取
		//2.1一个一个字符的读取
//		int d=0;
//		while((d=reader.read())!=-1){
//			System.out.print((char)d);
//		}
		//2.2一次读取多个字符
		char[] buf=new char[10];
		int len=0;
		while((len=reader.read(buf))!=-1){
			for(int i=0;i<len;i++){
				System.out.print(buf[i]);
			}
		}
		//3关闭
		reader.close();
		
	}
}
