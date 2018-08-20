package com.qf.day22_3;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopy2 {
	public static void main(String[] args)throws Exception {
		//1创建FileChannel
		FileChannel fileChannel1=FileChannel.open(Paths.get("d:\\Java虚拟机.pdf"),StandardOpenOption.READ);
		FileChannel fileChannel2=FileChannel.open(Paths.get("d:\\Java2.pdf"),StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		//2创建内存映射（直接缓冲区）
		MappedByteBuffer buffer=fileChannel1.map(MapMode.READ_ONLY, 0, fileChannel1.size());
		fileChannel2.write(buffer);
		//3关闭
		fileChannel1.close();
		fileChannel2.close();
		System.out.println("复制完毕");
		
	}
}
