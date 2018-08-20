package com.qf.day16_3;

import java.util.HashSet;

/*
 * 1 使用HashSet存储Person对象，
 * 2 如果名字和地址一样，认为是重复的元素
 */
public class Demo1 {
	public static void main(String[] args) {
		//1 创建对象
		HashSet<Person> hashSet=new HashSet<Person>();
		Person p1=new Person("特朗普", "白宫");
		Person p2=new Person("希拉里", "西雅图");
		Person p3=new Person("金正恩", "平壤");
		Person p4=new Person("特朗普", "白宫");
		
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		hashSet.add(p4);
		
		System.out.println("元素个数:"+hashSet.size());
		System.out.println(hashSet);
	}
}
