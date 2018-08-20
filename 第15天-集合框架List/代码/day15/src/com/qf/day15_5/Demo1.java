package com.qf.day15_5;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector向量集合
 * 
 * 和ArrayList区别：
 * 1 Vector是线程安全的，ArrayList线程不安全
 * 2 ArrayList效率高于Vector
 * 3 Vector从jdk1.0, ArrayList jdk1.2
 */
public class Demo1 {
	public static void main(String[] args) {
		//1创建集合
		Vector<String> vector=new Vector<>();
		//2添加元素
		vector.addElement("可乐");
		vector.addElement("雪碧");
		vector.addElement("红茶");
		vector.addElement("果汁");
		System.out.println("数据元素个数:"+vector.size());
		System.out.println(vector);
		//3删除
		vector.remove(0);
		System.out.println("删除之后:"+vector);
		//4遍历
		//4.1foreach
		System.out.println("---------增强for-----------");
		for (String string : vector) {
			System.out.println(string);
		}
		System.out.println("---------for-----------");
		for (int i=0;i<vector.size();i++) {
			System.out.println(vector.get(i));
		}
		//4.3使用枚举器
		System.out.println("---------枚举器-----------");
		Enumeration<String> en=vector.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
	}
}
