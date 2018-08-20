package com.qf.day22_2;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * FileChannel写
 */
public class FileChannelDemo2 {
	public static void main(String[] args) throws Exception{
		//1创建RandomeAccessFile
		RandomAccessFile raf=new RandomAccessFile("d:\\bbb.txt", "rw");
		
		//2获取通道
		FileChannel channel = raf.getChannel();
	
		//3写
		ByteBuffer buf=ByteBuffer.allocate(1024);
		buf.put("hello world 世界你好".getBytes());
		//4切换成读取
		buf.flip();
		while(buf.hasRemaining()) {
		    channel.write(buf);
		}
		//5关闭
		channel.close();
		raf.close();
	}
}
