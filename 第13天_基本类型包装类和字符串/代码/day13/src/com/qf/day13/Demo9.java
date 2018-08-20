package com.qf.day13;


/*
 * StringBuffer
 * 执行效率比String高很多，追加和插入、替换、删除
 */
public class Demo9 {
	public static void main(String[] args) {
		//创建一个空的StringBuffer对象 16
		StringBuffer  sb=new StringBuffer();
		//1追加
		sb.append("hello world");
		sb.append("我爱编程");
		sb.append("我是程序猿");
		System.out.println(sb.toString());
		//2插入
//		sb.insert(0, "我在最前面");
//		System.out.println(sb.toString());
		sb.insert(15, "我爱java");
		System.out.println(sb.toString());
		
		//3替换
		sb.replace(13, 15, "学习");
		System.out.println(sb.toString());
		
		//4其他方法
		System.out.println(sb.length());
		//清空
		//sb.delete(0, sb.length());
		//反转
		sb.reverse();
		System.out.println(sb.toString());
		
	}
}
