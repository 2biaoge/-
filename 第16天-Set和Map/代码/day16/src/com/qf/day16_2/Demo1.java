package com.qf.day16_2;

import java.util.HashSet;
import java.util.Iterator;

/*
 * HashSet
 * 存储结构: 哈希表（数组加链表）
 *  
 */
public class Demo1 {
	public static void main(String[] args) {
		//1创建集合对象
		HashSet<String> hashSet=new HashSet<String>();
		//2添加
		hashSet.add("中国");
		hashSet.add("韩国");
		hashSet.add("泰国");
		hashSet.add("朝鲜");
		hashSet.add("俄罗斯");
		//
		System.out.println("元素个数:"+hashSet.size());
		System.out.println(hashSet);
		//3删除
		hashSet.remove("朝鲜");
		System.out.println("删除之后:"+hashSet);
		//4遍历
		System.out.println("-----------使用迭代器------------");
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//5判断
		System.out.println(hashSet.contains("俄罗斯"));
		
	}
}
