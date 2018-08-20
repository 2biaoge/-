package com.qf.task2;

import java.util.HashSet;

public class Task2 {
	public static void main(String[] args) {
		HashSet<Student> students=new HashSet<Student>();
		students.add(new Student("姜长亮", "110110"));
		students.add(new Student("李嘉宾", "120120"));
		students.add(new Student("李嘉宾", "120120"));
		//遍历
		for (Student student : students) {
			System.out.println(student);
		}
		
		
	}
}
