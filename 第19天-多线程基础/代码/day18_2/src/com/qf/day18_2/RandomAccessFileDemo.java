package com.qf.day18_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile类的使用
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws Exception {
		//write();
		read();
		//method();
	}
	//写入
	private static void write() throws Exception {
		//1创建RandomAccessFile对象
		RandomAccessFile raf=new RandomAccessFile("d:\\ran.txt", "rw");
		//2写
		raf.write(20);
		raf.writeDouble(3.5);
		raf.writeInt(30);
		raf.writeBoolean(true);
		raf.writeUTF("张三疯");
		
		//写2
		raf.write(120);
		raf.writeDouble(13.5);
		raf.writeInt(130);
		raf.writeBoolean(false);
		raf.writeUTF("李思思");
		
		//3关闭
		raf.close();
		System.out.println("写入成功");
	}
	//读取
	public static void read() throws Exception{
		//1创建RandomAccessFile 对象
		RandomAccessFile randomAccessFile=new RandomAccessFile("d:\\ran.txt", "rw");
		//2读取
		//跳过张三疯
		//设置文件的偏移指针 ,从0开始
		//randomAccessFile.seek(25);
		//randomAccessFile.seek(25);
		//跳过字节个数
		//randomAccessFile.skipBytes(25);
		//randomAccessFile.skipBytes(25);
		byte[] bs=new byte[25];
		randomAccessFile.readFully(bs);
		System.out.println(randomAccessFile.getFilePointer());
		
		int n=randomAccessFile.read();
		double d=randomAccessFile.readDouble();
		int n2=randomAccessFile.readInt();
		boolean b=randomAccessFile.readBoolean();
		String s=randomAccessFile.readUTF();
		System.out.println(n+"..."+d+"..."+n2+"..."+b+"..."+s);
		//3关闭
		randomAccessFile.close();
	}
	//其他方法
	public static void method() throws Exception{
		RandomAccessFile raf=new RandomAccessFile("d:\\ran2.txt", "rw");
		//1设置文件长度
		raf.setLength(1024*1024);
		//2获取长度
		System.out.println(raf.length());
		raf.close();
		
	}
}
