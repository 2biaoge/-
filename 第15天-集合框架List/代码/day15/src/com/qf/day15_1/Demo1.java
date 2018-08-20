package com.qf.day15_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Collection接口的使用
 */
public class Demo1 {
	public static void main(String[] args) {
		//1创建Collection对象
		Collection collection=new ArrayList();
		//2操作
		//2.1添加
		collection.add("张三");
		collection.add("李四");
		collection.add("他二大爷");
		collection.add("他老爷");
		collection.add("七大妈");
		collection.add("张三");
		System.out.println("集合的元素个数:"+collection.size());
		//2.2删除
		//2.2.1删除一个
//		collection.remove("张三");
//		System.out.println("删除之后的数据个数:"+collection.size());
		//2.2.2清空
//		collection.clear();
//		System.out.println("清空之后:"+collection.size());
		
		//3遍历
		//3.1 使用增强for
		System.out.println("--------使用增强for遍历----------");
		for(Object obj:collection){
			System.out.println(obj);
		}
		//3.2使用迭代器
		System.out.println("-------使用迭代器---------");
		Iterator it=collection.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
		//4判断
		//4.1判断是否存在
		boolean b=collection.contains("王五");
		boolean b2=collection.contains("他老爷");
		System.out.println(b);
		System.out.println(b2);
		//4.2判断是否为空
		System.out.println(collection.isEmpty());
	
		//5查找
		
		//6其他方法
		Collection c1=new ArrayList();
		c1.add("中国");
		c1.add("朝鲜");
		Collection c2=new ArrayList();
		c2.add("中国");
		c2.add("朝鲜");
		System.out.println("c1.equals(c2):"+c1.equals(c2));
		System.out.println("c1==c2:"+(c1==c2));
 		
		
	}
}
