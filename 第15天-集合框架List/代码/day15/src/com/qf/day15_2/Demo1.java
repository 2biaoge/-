package com.qf.day15_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Collection接口的使用
 * 泛型好处:提高的程序安全性
 */
public class Demo1 {
	public static void main(String[] args) {
		//1创建对象
		Collection<String> collection=new ArrayList<String>();
		//Collection<Integer> collection2=new ArrayList<Integer>();
		collection.add("xxx");
		collection.add("yyy");
		System.out.println(collection);
		//2删除
		//collection.remove("xxx");
		System.out.println(collection);
		//3遍历
		for (String string : collection) {
			System.out.println(string);
		}
		
	}
}
