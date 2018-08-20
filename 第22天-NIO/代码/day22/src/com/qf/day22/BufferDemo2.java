package com.qf.day22;

import java.nio.ByteBuffer;
/*
 * 0=<mark<=position<=limit<=capacity
 */
public class BufferDemo2 {
	public static void main(String[] args) {
		//1创建缓冲区
		ByteBuffer buf=ByteBuffer.allocate(10);
		//2放入数据
		buf.put("hello".getBytes());
		//3切换读模式
		buf.flip();
		byte[] b=new byte[2];
		buf.get(b);
		for (byte c : b) {
			System.out.println((char)c);
		}
		System.out.println("position:"+buf.position());
		//4做一个标记
		buf.mark();
		//5读取两个字节
		buf.get(b);
		for (byte c : b) {
			System.out.println((char)c);
		}
		System.out.println("position:"+buf.position());
		//6重置
		buf.reset();
		System.out.println("重置之后........");
		System.out.println("position:"+buf.position());
	}
}
