package com.qf.day16_4;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo4 {
	public static void main(String[] args) {
		//1创建比较器
		//Comparator<Student> comparator=new MyComparator();
		Comparator<Student> comparator=new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int num1=o1.getAge()-o2.getAge();
				int num2=o1.getName().compareTo(o2.getName());
				return num1==0?num2:num1;
			}
		};
		//2创建集合对象,指定比较器
		TreeSet<Student> treeSet=new TreeSet<Student>(comparator);
		
		//3添加
		Student stu1=new Student("小明", 22);
		Student stu2=new Student("校花", 24);
		Student stu3=new Student("小明2", 22);
		Student stu4=new Student("校花2", 18);
		Student stu5=new Student("小明3", 19);
		Student stu6=new Student("校花3", 18);
		treeSet.add(stu1);
		treeSet.add(stu2);
		treeSet.add(stu3);
		treeSet.add(stu4);
		treeSet.add(stu5);
		treeSet.add(stu6);
		System.out.println(treeSet);
		
	}
}
