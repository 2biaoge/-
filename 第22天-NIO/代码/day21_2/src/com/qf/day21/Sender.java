package com.qf.day21;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 发送方
 * 
 */
public class Sender {
	public static void main(String[] args) throws Exception{
		//1创建DatagramSocket
		DatagramSocket ds=new DatagramSocket();
		//2创建DatagramPacket(发送)
		String con="送给你个生日礼物:鲜花"; // 最大是64kb
		DatagramPacket dp=new DatagramPacket(con.getBytes(), con.getBytes().length, InetAddress.getByName("10.9.156.255"), 1314);
		//3发送
		ds.send(dp);
		//4关闭
		ds.close();
		System.out.println("发送完毕");
	}
}
