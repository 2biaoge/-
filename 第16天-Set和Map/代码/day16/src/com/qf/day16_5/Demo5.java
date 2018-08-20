package com.qf.day16_5;

import java.util.Enumeration;
import java.util.Hashtable;

/*
 * Hashtable：哈希表
 * 
 * HashMap和hashtable的区别
 * 1 HashMap线程不安全的，Hashtable是线程安全的
 * 2 HashMap可以存储null键和null值，而Hashtable不可以
 * 3 Hashtable jdk1.0，HashMap jdk1.2
 * 
 */
public class Demo5 {
	public static void main(String[] args) {
		Hashtable<String, String> hashtable=new Hashtable<String,String>();
		//1添加
		hashtable.put("xxx", "北京");
		hashtable.put("yyy", "南京");
		hashtable.put("ccc", "深圳");
		hashtable.put("ddd", "广州");
		//hashtable.put(null, null);
		System.out.println(hashtable.size());
		System.out.println(hashtable);
		//2删除
		hashtable.remove("ddd");
		System.out.println(hashtable);
		//3遍历
		//3.1使用entrySet
		//3.2使用keySet
		//3.3使用枚举器(value)
		Enumeration<String> elements = hashtable.elements();
		while(elements.hasMoreElements()){
			String key=elements.nextElement();
			System.out.println(key);
		}
		//3.4使用枚举器(key)
		Enumeration<String> keys = hashtable.keys();
		while(keys.hasMoreElements()){
			String key=keys.nextElement();
			System.out.println(key);
		}
		
	}
}
