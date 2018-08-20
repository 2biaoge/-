package com.qf.day16_4;

import java.util.TreeSet;

/*
 * TreeSet的使用
 * 字符串是按照编码表的顺序
 */
public class Demo2 {
	
	public static void main(String[] args) {
		//0创建集合对象
		TreeSet<String> treeSet=new TreeSet<String>();
		treeSet.add("hello");
		treeSet.add("abc");
		treeSet.add("zzz");
		treeSet.add("bcd");
		treeSet.add("eee");
		treeSet.add("yyy");
		System.out.println("元素个数:"+treeSet.size());
		System.out.println(treeSet);
	}
}
