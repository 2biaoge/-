package com.qf.day16_5;

import java.nio.channels.NonWritableChannelException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * HashMap
 * 存储结构:哈希表
 */
public class Demo2 {
	public static void main(String[] args) {
		//1创建对象
		HashMap<Integer, String> hashMap=new HashMap<Integer,String>();
		hashMap.put(110, "报警");
		hashMap.put(120, "急救");
		hashMap.put(119, "火警");
		hashMap.put(114, "查电话");
		hashMap.put(114, "查电话afawef");
	
		System.out.println("元素个数:"+hashMap.size());
		System.out.println(hashMap);
		//2删除
		hashMap.remove(114);
		System.out.println("删除："+hashMap);
		//3遍历
		//3.1使用entrySet
		System.out.println("--------使用entrySet遍历---------");
		for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		//3.2使用keySet
		System.out.println("--------使用keySet遍历---------");
		for (Integer key: hashMap.keySet()) {
			System.out.println(key+"---->"+hashMap.get(key));
		}
	}
}
