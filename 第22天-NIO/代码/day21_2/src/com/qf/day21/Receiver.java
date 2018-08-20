package com.qf.day21;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 负责接收
 * 接收方
 */
public class Receiver {
	public static void main(String[] args) throws Exception {
		//1创建datagramSocket
		DatagramSocket ds=null;
		try {
			ds = new DatagramSocket(1314);
			//2创建接收数据报包
			byte[] buf = new byte[1024 * 4];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			//3接收
			System.out.println("准备接收....");
			while (true) {
				ds.receive(dp);
				//4处理数据
				String con = new String(dp.getData(), 0, dp.getLength());
				System.out.println("发送说:" + con);
			} 
		} finally {
			//5关闭
			ds.close();
		}
		
	}
}
