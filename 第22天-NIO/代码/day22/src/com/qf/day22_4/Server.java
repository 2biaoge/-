package com.qf.day22_4;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/*
 * 使用NIO实现Tcp服务端
 */
public class Server {
	public static void main(String[] args){
		//1创建ServerSocketChannel
		ServerSocketChannel listener=null;
		try {
			listener = ServerSocketChannel.open();
			//2绑定地址
			listener.bind(new InetSocketAddress("10.9.156.87", 9999));
			//3设置为非阻塞式
			listener.configureBlocking(false);
			//4创建选择器
			Selector selector=Selector.open();
			//5把listener通道注册到selector
			listener.register(selector,SelectionKey.OP_ACCEPT);
			//6轮询选择器
			System.out.println("服务器已启动....");
			while(selector.select()>0){//判断选择器是否有事件发生，如果没有则阻塞
				Iterator<SelectionKey> it = selector.selectedKeys().iterator();
				while(it.hasNext()){
					SelectionKey selectionKey=it.next();
					if(selectionKey.isAcceptable()){//表示有客户已经连接上
						//7客户端通道
						 SocketChannel channel = listener.accept();
						 //8设置为非阻塞式
						 channel.configureBlocking(false);
						 //9客户端channel注册到选择器
						 channel.register(selector, SelectionKey.OP_READ);
					}else if(selectionKey.isReadable()){//通道是不是有数据
						//10获取channel
						SocketChannel channel =(SocketChannel) selectionKey.channel();
						//11读取
						ByteBuffer buf=ByteBuffer.allocate(1024);
						ByteBuffer buffer = ByteBuffer.allocate(1024);
						int len = 0;
						try {
							while((len = channel.read(buffer)) > 0 ){
								buffer.flip();
								System.out.println(channel.socket().getInetAddress().getHostAddress()+"说:"+new String(buffer.array(), 0, len));
								buffer.clear();
							}
						} catch (Exception e) {
							System.out.println(channel.socket().getInetAddress().getHostAddress()+"退出了...");
							channel.close();
							
						}
					}
					//12移除事件
					it.remove();
				}
			}
		} catch (Exception e) {
			
		}finally {
			
			try {
				if(listener!=null){
					listener.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
