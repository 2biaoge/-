package com.qf.day17_2;

import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * 使用字节输出流写入文件
 */
public class Demo2 {
	public static void main(String[] args) throws Exception{
		//1创建字节输出流（如果文件不存在，则创建）
		OutputStream os=new FileOutputStream("d:\\haha.txt");
		//2一个一个的写入
//		os.write(97);
//		os.write(98);
//		os.write(99);
		//3一次写入多个字节
		String s="abcdefg";
		byte[] buf=s.getBytes();
		os.write(buf);
		//4关闭
		os.close();
		System.out.println("执行成功");
	}
}
