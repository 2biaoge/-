package com.qf.day18_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/*
 * BufferedReader
 * 缓存字符输入流
 */
public class Demo1 {
	public static void main(String[] args) throws Exception{
		//1创建BufferedReader对象
		InputStreamReader isr=new InputStreamReader(new FileInputStream("d:\\log.txt"), "gbk");
		BufferedReader br=new BufferedReader(isr);//utf-8
		//2读取
		//2.1一个字符一个字符的读
//		int d;
//		while((d=br.read())!=-1){
//			System.out.print((char)d);
//		}
		//2.2一次读取多个
//		char[] buf=new char[1024];
//		int len=0;
//		while((len=br.read(buf))!=-1){
//			for(int i=0;i<len;i++){
//				System.out.print(buf[i]);
//			}
//		}
		//2.3一行一行读取
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		//3关闭
		br.close();
		
	}
}
