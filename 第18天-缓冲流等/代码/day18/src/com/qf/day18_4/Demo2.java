package com.qf.day18_4;

import java.io.ByteArrayOutputStream;

/*
 * 使用ByteArrayOutputStream
 * 字节内存输出流
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		//1创建字节内存输出流(内部有缓冲区)
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		//2写数据
		baos.write(10);
		baos.write(100);
		baos.write(126);
		baos.write(-50);
		baos.write(5);
		//3关闭
		baos.close();
		//4从流的缓冲区中取数据
		byte[] data=baos.toByteArray();
		for (byte b : data) {
			System.out.println(b);
		}
	}
}
