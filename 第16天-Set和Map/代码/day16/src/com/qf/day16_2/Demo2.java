package com.qf.day16_2;

import java.util.HashSet;
import java.util.Set;

/*
 * HashSet
 */
public class Demo2 {
	public static void main(String[] args) {
		//1创建集合
		HashSet<Person> hashSet=new HashSet<>();
		//2添加数据
		Person p1=new Person("xxx", "北京");
		Person p2=new Person("yyy","南京");
		Person p3=new Person("zzz", "东京");
		Person p4=new Person("xxx", "北京");
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		hashSet.add(p4);
		System.out.println("个数:"+hashSet.size());
		System.out.println(hashSet);
		
	}
}
