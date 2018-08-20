package com.qf.day16_6;

import java.util.TreeMap;

/*
 * TreeMap
 * 存储结构：自平衡红黑二叉树
 */
public class Demo1 {
	public static void main(String[] args) {
		TreeMap<String, String> treeMap=new TreeMap<String,String>();
		treeMap.put("1", "苹果");
		treeMap.put("2", "三星");
		treeMap.put("3", "小米");
		treeMap.put("4", "华为");
		treeMap.put("4", "锤子");
		System.out.println(treeMap.size());
		System.out.println(treeMap);
		
		
		TreeMap<Dog, String> treeMap2=new TreeMap<Dog,String>();
		
		treeMap2.put(new Dog(), "阿福");
		
	}
}
