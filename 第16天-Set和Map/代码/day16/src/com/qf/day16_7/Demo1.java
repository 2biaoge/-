package com.qf.day16_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/*
 * Collections工具类
 */
public class Demo1 {
	public static void main(String[] args) {
		//copy();
		//binarySearch();
//		reverse();
//		shuffle();
//		replace();
		frequency();
	}
	/*
	 * 复制
	 */
	public static void copy(){
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("abc");
		arrayList.add("bcd");
		arrayList.add("xyz");
		arrayList.add("opq");
		ArrayList<String> dest=new ArrayList<String>();
		//先向目标方法中添加空数据保证长度和源一样
		for(int i=0;i<arrayList.size();i++){
			dest.add(null);
		}
		System.out.println(arrayList.size());
		System.out.println(dest.size());
		Collections.copy(dest, arrayList);
		
		System.out.println(dest);
	}
	/*
	 * 二分查找
	 */
	public static void binarySearch(){
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("abc");
		arrayList.add("xyz");
		arrayList.add("efg");
		arrayList.add("bcd");
		//排序
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		int result=Collections.binarySearch(arrayList,"bcd");
		System.out.println(result);
	}
	/*
	 * 反转
	 */
	public static void reverse(){
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("abc");
		arrayList.add("xyz");
		arrayList.add("efg");
		arrayList.add("bcd");
		System.out.println(arrayList);
		Collections.reverse(arrayList);
		System.out.println("反转之后:"+arrayList);
		
	}
	
	/*
	 * 打乱
	 */
	public static void shuffle(){
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("10");
		arrayList.add("12");
		arrayList.add("20");
		arrayList.add("30");
		arrayList.add("8");
		arrayList.add("5");
		System.out.println(arrayList);
		Collections.shuffle(arrayList);
		System.out.println("打乱:"+arrayList);
	}
	/*
	 * 替换
	 */
	public static void replace(){
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("10");
		arrayList.add("12");
		arrayList.add("20");
		arrayList.add("30");
		arrayList.add("8");
		arrayList.add("5");
		System.out.println(arrayList);
		Collections.replaceAll(arrayList, "5", "100");
		System.out.println("替换后:"+arrayList);
	}
	/*
	 * 查找指定元素出现的次数
	 */
	public static void frequency(){
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("10");
		arrayList.add("12");
		arrayList.add("20");
		arrayList.add("30");
		arrayList.add("10");
		arrayList.add("5");
		int count=Collections.frequency(arrayList, "10");
		System.out.println(count);
	}
}

