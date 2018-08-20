package com.qf.day16_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 1数组转换成集合
 * 2集合转换成数组
 */
public class Demo2 {
	public static void main(String[] args) {
		
		//arrayToList();
		//listToArray();
		arrayToList2();
	}
	//1数组转换成集合
	public static void arrayToList(){
		String[] arr={"aaaa","bbbb","cccc"};
		//是一个受限制的集合，不能添加元素，不能删除
		//可以使用集合的方法来遍历，使用Collections
		List<String> list=Arrays.asList(arr);
		System.out.println(list);
		//list.add("dddd");
		//list.remove("aaaa");
		Collections.reverse(list);
		System.out.println(list);
		
	}
	
	//2集合转换成数组
	public static void listToArray(){
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
//		Object[] obj=list.toArray();
//		for (Object object : obj) {
//			System.out.println(object);
//		}
		Integer[] arr=list.toArray(new Integer[0]);
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}
	
	//3数组转换成集合
	public static void arrayToList2(){
		Integer[] arr={10,20,30};
		List<Integer> list= Arrays.asList(arr);
		System.out.println(list);
		
	}
}
