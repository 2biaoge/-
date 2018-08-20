package com.qf.day16_4;

import java.util.TreeSet;

/*
 * 使用TreeSet存储数据
 * 存储结构：自平衡红黑二叉树
 * 无序，存储后把数据排序。
 * 数字按照从小到大
 */
public class Demo1 {
	public static void main(String[] args) {
		//0创建集合对象
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(20);
		treeSet.add(15);
		treeSet.add(3);
		treeSet.add(50);
		treeSet.add(2);
		treeSet.add(6);
		System.out.println("元素个数:"+treeSet.size());
		System.out.println(treeSet);
	}
}
