package com.qf.day22_2;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo3 {
	public static void main(String[] args) throws Exception{
		//1创建文件输入流
		FileOutputStream fos=new FileOutputStream("d:\\ccc.txt",true);
		//2获取FileChannel
		FileChannel fileChannel=fos.getChannel();
		//3写入
		ByteBuffer buf=ByteBuffer.allocate(1024);
		buf.put("java是世界上最好的语言".getBytes());
		//4切换成读模式
		buf.flip();
		//5写入
		while(buf.hasRemaining()){
			fileChannel.write(buf);
		}
		//6关闭
		fileChannel.close();
		fos.close();
		
	}
}
