package com.qf.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set
 * 特点:
 * 1 不能包含重复元素
 * 2 无序的
 */
public class Demo1 {
	public static void main(String[] args) {
		//1创建集合对象
		Set<String> set=new HashSet<String>();
		
		//2添加
		set.add("hello");
		set.add("world");
		set.add("nihao");
		set.add("hi");
		set.add("apple");
		set.add("hello");
		set.add("baomawxs");
		
		
		System.out.println("元素个数:"+set.size());
		System.out.println(set);
		//3删除
		//set.remove("nihao");
		System.out.println("删除之后:"+set);
		//set.clear();
		//4遍历
		//4.1使用foreach
		System.out.println(".............使用增强for.............");
		for (String string : set) {
			System.out.println(string);
		}
		//4.2使用迭代器
		System.out.println(".............使用迭代器.............");
		Iterator<String> it = set.iterator();//ctrl+1
		while(it.hasNext()){
			String string = it.next();
			System.out.println(string);
		}
		
		//5判断
		System.out.println(set.contains("apple"));
		System.out.println(set.isEmpty());
	}
}
