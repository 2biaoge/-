package com.qf.day22_2;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * 文件通道
 */
public class FileChannelDemo {
	public static void main(String[] args) throws Exception{
		//1创建流
		RandomAccessFile raf=new RandomAccessFile("d:\\aaa.txt", "rw");
		//2获取通道
		FileChannel fileChannel=raf.getChannel();
		//3创建缓冲区
		ByteBuffer buf=ByteBuffer.allocate(1024);
		//4读取
//		int len=fileChannel.read(buf);//把文件中数据放入缓冲区
//		//5切换成读模式
//		buf.flip();
//		
//		for(int i=0;i<len;i++){
//			System.out.print((char)buf.get());
//		}
		int len=0;
		while((len=fileChannel.read(buf))!=-1){
			buf.flip();//切换成读模式
			String s=new String(buf.array(), 0, len);
			System.out.println(s);
			buf.clear();//positon=0 
		}
		
		//6关闭
		fileChannel.close();
		raf.close();
	}
}
