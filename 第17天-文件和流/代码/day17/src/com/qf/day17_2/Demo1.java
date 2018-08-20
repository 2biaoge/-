package com.qf.day17_2;

import java.io.FileInputStream;
import java.io.InputStream;

/*
 * 使用字节输入流读取数据
 */
public class Demo1 {
	public static void main(String[] args) throws Exception{
		//1创建字节输入流
		InputStream is=new FileInputStream("d:\\123.txt");
		//2文件长度
		//System.out.println(is.available());
		//3读取文件中内容
		//3.1读取一个字节
//		int d=is.read();
//		System.out.println(d);
		//3.2一个一个字节的读
//		int d=0;
//		while((d=is.read())!=-1){
//			System.out.println((char)d);
//		}
		//3.3一次读取多个字节
		byte[] buf=new byte[10];//
		int len=0;//实际读取的字节个数
		while((len=is.read(buf))!=-1){
			for(int i=0;i<len;i++){
				System.out.print((char)buf[i]);
			}
		}
		//4关闭
		is.close();
	}
}
