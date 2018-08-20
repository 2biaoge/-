package com.qf.day22;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/*
 * 缓冲区的使用
 * buffer中属性
 *  position :位置
 *  limit：限制
 *  capacity:容量
 *  
 *  position<=limit<=capacity
 */
public class BufferDemo {
	public static void main(String[] args) {
		//1创建缓冲区
		//1.1 创建缓冲区(jvm的堆中 间接缓冲区（空间有限，速度慢）)
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		//1.2创建缓冲区(直接缓冲区，没有堆中，(空间比较大，速度快，缺点：不受jvm控制，创建和销毁耗性能))
		//ByteBuffer buffer2=ByteBuffer.allocateDirect(1024);
		//2写入数据
		System.out.println("写入数据之前");
		System.out.println("position:"+buffer.position()+" limit:"+buffer.limit()+" capacity:"+buffer.capacity());
		buffer.put("helloworld".getBytes());
		System.out.println("写入数据之后");
		System.out.println("position:"+buffer.position()+" limit:"+buffer.limit()+" capacity:"+buffer.capacity());
		//3取数据
		buffer.flip();//把写入模式变成读取模式
		System.out.println("设置读取模式后");
		System.out.println("position:"+buffer.position()+" limit:"+buffer.limit()+" capacity:"+buffer.capacity());
		
		for(int i=0;i<buffer.limit();i++){
			byte b=buffer.get();
			System.out.println((char)b);
		}
		//4
		System.out.println("读取完毕");
		System.out.println("position:"+buffer.position()+" limit:"+buffer.limit()+" capacity:"+buffer.capacity());
		//再读取一次
		buffer.rewind();//倒回
		for(int i=0;i<buffer.limit();i++){
			byte b=buffer.get();
			System.out.println((char)b);
		}
		System.out.println("2读取完毕");
		System.out.println("position:"+buffer.position()+" limit:"+buffer.limit()+" capacity:"+buffer.capacity());
		//5清空缓冲区
		buffer.clear();
		System.out.println("清空之后");
		System.out.println("position:"+buffer.position()+" limit:"+buffer.limit()+" capacity:"+buffer.capacity());
		
	}
}
