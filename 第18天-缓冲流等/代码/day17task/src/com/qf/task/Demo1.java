package com.qf.task;

import java.util.TreeMap;

public class Demo1 {
	public static void main(String[] args) {
		TreeMap<Student, String> students=new TreeMap<Student,String>();
		students.put(new Student(20, "编码", 90), "编码");
		students.put(new Student(20, "看书", 80), "看书");
		students.put(new Student(22, "游戏", 90), "游戏");
		students.put(new Student(23, "睡觉", 90), "睡觉");
		
		System.out.println(students);
	}
}
