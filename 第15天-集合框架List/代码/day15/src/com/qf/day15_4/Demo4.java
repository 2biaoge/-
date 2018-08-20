package com.qf.day15_4;
/*
 * LinkedList
 * 存储结构：链表
 * 
 * 和 ArrayList区别：
 * 1 ArrayList存储结构数组，LinkedList链表
 * 2 ArrayList 查找遍历比较快,添加、删除相对较慢， LinkedList 查找遍历慢，添加、删除比较快。
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Demo4 {
	public static void main(String[] args) {
		//1创建对象
		LinkedList<String> linkedList=new LinkedList<>();
		//2添加
		linkedList.add("菠菜");
		linkedList.add("黄瓜");
		linkedList.add("西红柿");
		linkedList.add("茄子");
		linkedList.add("萝卜");
		linkedList.addFirst("韭菜");
		System.out.println("元素个数:"+linkedList.size());
		System.out.println(linkedList);
		//3删除
		linkedList.remove(0);
		System.out.println(linkedList);
		//4遍历
		//4.1迭代器
		System.out.println("---------迭代器-------");
		Iterator<String> it=linkedList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("------listIterator迭代器------");
		ListIterator<String> lit=linkedList.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		//5判断
		System.out.println(linkedList.contains("黄瓜"));
		//6查找位置
		System.out.println(linkedList.indexOf("萝卜"));
		
	}
}
