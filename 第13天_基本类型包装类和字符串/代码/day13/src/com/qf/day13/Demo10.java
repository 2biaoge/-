package com.qf.day13;
/*
 * StringBuilder
 *
 * StringBuilder和StringBuffer的区别
 * 1 功能上一样
 * 2 StringBuffer是线程安全的，StringBuilder是线程不安全的
 * 3 StringBuilder效率高
 */
public class Demo10 {
	public static void main(String[] args) {
		//1创建StringBuilder对象
		StringBuilder  sb=new StringBuilder();
		//2追加
		sb.append("hello world");
		sb.append("我爱编程");
		sb.append("我是程序猿");
		System.out.println(sb.toString());
		//3插入
		sb.insert(15, "我爱java");
		System.out.println(sb.toString());
		//4替换
		sb.replace(13, 15, "学习");
		System.out.println(sb.toString());
	}
}
