package com.qf.day18_2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*
 * 使用BufferedInputStream
 */
public class Demo1 {
	public static void main(String[] args) throws Exception{
		//1创建缓冲字节流
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:\\123.txt"));
		//2读取
		//2.1一个字节一个字节
//		int d=0;
//		while((d=bis.read())!=-1){
//			System.out.printf("%X ",d);
//		}
		//2.2一次读取多个字节
		byte[] buf=new byte[1024*4];
		int len=0;
		while((len=bis.read(buf))!=-1){
			for(int i=0;i<len;i++){
				System.out.printf("%X ",buf[i]);
			}
		}
		
		//3关闭
		bis.close();
		
		
	}
}
