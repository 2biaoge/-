package com.qf.day18;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 使用InputStreamReader读取文本文件 
 * 采用指定编码来读取
 */
public class Demo1 {
	public static void main(String[] args) throws Exception{
		//1创建对象
		InputStream is=new FileInputStream("d:\\123.txt");
		InputStreamReader isr=new InputStreamReader(is, "utf-8"); //读取的文件是gbk
		//2读取
		char[] buf=new char[10];
		int len=0;
		while((len=isr.read(buf))!=-1){
			for(int i=0;i<len;i++){
				System.out.print(buf[i]);
			}
		}
		//3关闭
		isr.close();
		//is.close();
		
	}
}	
