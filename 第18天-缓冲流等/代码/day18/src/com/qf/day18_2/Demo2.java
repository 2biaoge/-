package com.qf.day18_2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.SortedMap;

/*
 * 使用BufferedOutputStream
 */
public class Demo2 {
	public static void main(String[] args) throws Exception{
		//1创建缓冲字节输出流
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d:\\info.txt"));
		//2写入
		String s="我爱你中国";
		byte[] bytes = s.getBytes("utf-8");//默认utf-8|gbk
		bos.write(bytes);
		//3关闭
		bos.close();
	
	}
}
