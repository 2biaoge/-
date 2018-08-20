package com.qf.day18;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
 * 使用OutputStreamWriter写入文件
 * 指定编码
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		//1创建OutputStreamWriter
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("d:\\456.txt"), "utf-8");
		//2写入
		osw.write("我爱你中国");
		//3关闭
		osw.close();
		
	}
}
