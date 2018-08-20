package com.qf.day15_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Collection使用
 */
public class Demo3 {
	public static void main(String[] args) {
		//1创建Collection对象
		Collection collection=new ArrayList();
		//2添加
		Student stu1=new Student("张三",20);
		Student stu2=new Student("凤姐",22);
		Student stu3=new Student("芙蓉",25);
		
		collection.add(stu1);
		collection.add(stu2);
		collection.add(stu3);
		System.out.println("元素个数:"+collection.size());
		System.out.println(collection);
		//3删除
		collection.remove(stu1);
		System.out.println("删除之后元素个数:"+collection.size());
		System.out.println(collection);
		//4遍历
		//4.1foreach
		System.out.println("增强for........");
		for (Object object : collection) {
			System.out.println(object.toString());
		}
		//4.2迭代器
		System.out.println("迭代器........");
		Iterator it=collection.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj.toString());
		}
	}
}
