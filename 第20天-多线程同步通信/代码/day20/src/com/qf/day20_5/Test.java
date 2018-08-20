package com.qf.day20_5;

public class Test {
	public static void main(String[] args) {
//		King qianlong1=King.getKing();
//		King qianlong2=King.getKing();
//		King qianlong3=King.getKing();
//		System.out.println(qianlong1.hashCode());
//		System.out.println(qianlong2.hashCode());
//		System.out.println(qianlong3.hashCode());
		//创建线程对象
		KingThread k1=new KingThread();
		KingThread k2=new KingThread();
		KingThread k3=new KingThread();
		//启动线程
		k1.start();
		k2.start();
		k3.start();
	}
}
