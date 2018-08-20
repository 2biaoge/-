package com.qf.day18_3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/*
 * BufferedWriter
 * 缓冲字符输出流
 */
public class Demo2 {
	public static void main(String[] args) throws Exception{
		//1创建对象
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("d:\\heihei.txt"),"gbk");
		BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\haha.txt"));//utf-8
		//2写入
		bw.write("我爱北京天安门");
		bw.newLine();//写入行分隔符
		bw.write("学习java,找个好媳妇或老公");
		//3关闭
		bw.close();
		
	}
}
