package com.qf.day15_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.SynchronousQueue;

import org.omg.CosNaming.IstringHelper;

/*
 * List集合
 * 特点：有序的，可以重复的
 */
public class Demo1 {
	public static void main(String[] args) {
		//1创建List集合对象
		List<String> list=new ArrayList<String>();
		//2添加
		list.add("苹果");
		list.add("菠萝");
		list.add("香蕉");
		list.add("榴莲");
		list.add("小米");
		System.out.println("元素个数:"+list.size());
		System.out.println(list);
		//3删除
		//list.remove(0);
		//list.remove("小米");//依据equals();
		//System.out.println("删除之后:"+list);
		//list.clear();
		//4遍历
		//4.1 foreach
		System.out.println("------------增强for-------------");
		for (String string : list) {
			System.out.println(string);
		}
		//4.2 迭代器(只能向前迭代)
		System.out.println("------------迭代器-------------");
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		//4.3使用for
		System.out.println("------------for-------------");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		//4.4使用listIterator
		System.out.println("------------listIterator 顺序输出------------");
		ListIterator<String> lit=list.listIterator(3);
		
		while(lit.hasNext()){
			String s=lit.next();
			System.out.println(s);
		}
		System.out.println("------------listIterator 逆序输出------------");
	
		while(lit.hasPrevious()){
			String s=lit.previous();
			System.out.println(s);
		}
		
		//5判断
		//5.1判断是否存在
		System.out.println(list.contains("小米"));
		//5.2判断是否为空
		System.out.println(list.isEmpty());
		//6查找（查找位置）
		int index=list.indexOf("香蕉");
		System.out.println(index);
		
		//7其他方法
		//截取集合subList(int fromIndex, int toIndex) 
		List<String> newlist=list.subList(2, 4);
		System.out.println(newlist);
		
		
	}
}
