package com.qf.day17_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/*
 * 1 使用字节流复制文件
 * 	  
 * 2 使用字符流复制文件
 * 
 * 如果复制的文件是文本文件 ，用字节流和字符流都可以
 * 如果复制的文件是图片、音乐、电影, 用字符流复制会不会出现问题?
 */
public class CopyFile {

	public static void main(String[] args) throws Exception {
		copy2();
	}
	// 1 使用字节流复制文件
	public static void copy1() throws Exception{
		//1创建字节文件输入输出流
		InputStream is=new FileInputStream("d:\\003.jpg");
		OutputStream os=new FileOutputStream("d:\\004.jpg");
		//2读、写
		byte[] buf=new byte[1024*4];
		int len=0;
		while((len=is.read(buf))!=-1){
			//buf缓冲区,0从第一个位置写，len写的长度
			os.write(buf,0,len);
		}
		//3关闭
		is.close();
		os.close();
		System.out.println("复制完成");
	}
	
	//2使用字符流复制文件
	
	public static void copy2() throws Exception{
		//1创建字符输入输出流
		Reader reader=new FileReader("d:\\003.jpg");
		Writer writer=new FileWriter("d:\\005.jpg");
		//2读写
		char[] buf=new char[1024*4];
		int len=0;
		while((len=reader.read(buf))!=-1){
			writer.write(buf, 0, len);
		}
		//3关闭
		reader.close();
		writer.close();
		System.out.println("复制完成");
		
	}
	
	
}
