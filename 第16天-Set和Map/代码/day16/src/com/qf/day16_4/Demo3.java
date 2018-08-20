package com.qf.day16_4;

import java.util.TreeSet;

public class Demo3 {
	public static void main(String[] args) {
		//1创建集合
		TreeSet<Animal> treeSet=new TreeSet<Animal>();
		Animal animal1=new Animal("阿福", 2);
		Animal animal3=new Animal("小强", 4);
		Animal animal2=new Animal("阿毛", 3);
		Animal animal4=new Animal("阿毛2", 3);
		
		treeSet.add(animal1);
		treeSet.add(animal3);
		treeSet.add(animal2);
		treeSet.add(animal4);
		
		System.out.println("个数:"+treeSet.size());
		System.out.println(treeSet);
		
		
		
		
		
		
	}
}
