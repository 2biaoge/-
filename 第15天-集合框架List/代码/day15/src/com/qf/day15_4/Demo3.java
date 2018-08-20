package com.qf.day15_4;

import java.util.ArrayList;

public class Demo3 {
	public static void main(String[] args) {
		//1ArrayList对象
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		//2删除
		System.out.println("删除之前："+arrayList);
		//arrayList.remove(0);//索引
		arrayList.remove(new Integer(5));
		System.out.println("删除之后："+arrayList);
	}
}
