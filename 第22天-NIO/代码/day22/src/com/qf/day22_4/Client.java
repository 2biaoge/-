package com.qf.day22_4;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception{
		//1创建SocketChannel
		SocketChannel client=SocketChannel.open(new InetSocketAddress("10.9.156.87", 9999));
		//2设置非阻塞模式
		client.configureBlocking(false);
		//3写
		ByteBuffer buf=ByteBuffer.allocate(1024);
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){//如果有数据则返回true,没有数据等待输入
			String s=input.nextLine();
			buf.put(s.getBytes());
			buf.flip();
			client.write(buf);
			buf.clear();
			if(s.equals("886")){
				break;
			}
		}
		//4关闭
		client.close();
	}
}
