package com.qf.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set
 */
public class Demo2 {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		//添加
		set.add(100);
		set.add(200);
		set.add(50);
		set.add(30);
		set.add(300);
		set.add(50);
		System.out.println(set);
		//删除
		set.remove(50);
		System.out.println(set);
		//遍历
		System.out.println(".....增强for....");
		for (Integer integer : set) {
			System.out.println(integer);
		}
		System.out.println(".....迭代器....");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
