package com.qf.day18_4;

import java.io.ByteArrayInputStream;
import java.util.concurrent.SynchronousQueue;

/*
 * ByteArrayInputStream
 * 字节内存输入流 
 */
public class Demo1 {
	public static void main(String[] args) throws Exception{
		//1创建ByteArrayInputStream
		byte[] buf={10,20,30,40,50};//buf数据
		ByteArrayInputStream bais=new ByteArrayInputStream(buf);
		//2读取
		int d=0;
		while((d=bais.read())!=-1){
			System.out.println(d);
		}
		//3关闭(可写可不写)
		bais.close();
	}
}
