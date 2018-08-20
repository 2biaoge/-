package com.qf.day15_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * ArrayList集合
 * 存储结构： 数组
 */
public class Demo2 {
	public static void main(String[] args) {
		//1创建对象
		ArrayList<String> arrayList=new ArrayList<String>();
		//2添加元素
		arrayList.add("红烧肉");
		arrayList.add("回锅肉");
		arrayList.add("锅包肉");
		arrayList.add("糖醋鲤鱼");
		arrayList.add("酸菜鱼");
		arrayList.add(null);
		System.out.println("元素个数:"+arrayList.size());
		System.out.println(arrayList);
		//3删除
		//arrayList.remove(1);
		System.out.println("删除之后");
		System.out.println(arrayList);
		//4遍历
		//4.1迭代器
		System.out.println("........使用迭代器遍历........");
		Iterator<String> it=arrayList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//4.1迭代器ListIterator
		System.out.println("........使用列表迭代器遍历........");
		ListIterator<String> lit=arrayList.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		//5判断
		System.out.println(arrayList.contains("红烧肉"));
		System.out.println(arrayList.isEmpty());
		//6查找
		System.out.println(arrayList.indexOf("酸菜鱼"));
		
	}
}
