package com.qf.day22_3;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopy {
	public static void main(String[] args) throws Exception{
		//1jdk1.7 FileChannel.open
		FileChannel readChannel=FileChannel.open(Paths.get("d:\\timg.jpg"), StandardOpenOption.READ);
		FileChannel writeChannel=FileChannel.open(Paths.get("d:\\timg2.jpg"), StandardOpenOption.CREATE,StandardOpenOption.WRITE);

		//2写
		ByteBuffer buf=ByteBuffer.allocate(1024*4);
		while((readChannel.read(buf))!=-1){
			buf.flip();
			writeChannel.write(buf);
			buf.clear();
		}
		//3关闭
		readChannel.close();
		writeChannel.close();
		System.out.println("复制完毕");
		
	}
}
