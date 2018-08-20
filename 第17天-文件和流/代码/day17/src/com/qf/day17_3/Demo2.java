package com.qf.day17_3;

import java.io.FileWriter;
import java.io.Writer;

/*
 * 使用字符输出流
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		//1创建字符输出流
		Writer writer=new FileWriter("d:\\info.txt");
		//2写入字符串
		//writer.write("好好学习，天天向上");
		for(int i=0;i<100;i++){
			writer.write(i+"好好学习，天天向上\r\n");
			writer.flush();
		}
		//3关闭
		//writer.flush();
		writer.close();//close()时，会刷新缓冲区
		System.out.println("写入成功");
	}
}
