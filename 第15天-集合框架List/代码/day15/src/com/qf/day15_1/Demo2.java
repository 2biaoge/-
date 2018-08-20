package com.qf.day15_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2 {
	public static void main(String[] args) {
		Collection collection=new ArrayList();
		//1添加
		collection.add(111);//111自动装箱 new Integer(111)
		collection.add(222);
		collection.add("111");
		collection.add("222");
		//2删除
		System.out.println("元素的个数:"+collection.size());
		System.out.println("删除之前:"+collection);
		collection.remove("111");
		System.out.println("删除之后:"+collection.size());
		System.out.println("删除之后:"+collection);
		//3遍历
		//3.1增强for循环
		System.out.println("增强for.....");
		for (Object object : collection) {
			System.out.println(object);
		}
		//3.2使用迭代器
		System.out.println("迭代器.....");
		Iterator it=collection.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
	}
}
