package com.qf.day16_3;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet
 * 存储结构哈希表 
 *  保证存储和读取的顺序一致
 *  在原有的哈希表的基础上有多一个链表，链表保存者存储的顺序
 */
public class Demo2 {
	public static void main(String[] args) {
		//创建对象
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		//1添加数据
		linkedHashSet.add("中国");
		linkedHashSet.add("韩国");
		linkedHashSet.add("泰国");
		linkedHashSet.add("朝鲜");
		linkedHashSet.add("俄罗斯");
		
		System.out.println(linkedHashSet);
		
		
		
	}
}
