package com.qf.day16_4;

import java.util.Comparator;

public class MyComparator extends Object implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int num1=o1.getAge()-o2.getAge();
		int num2=o1.getName().compareTo(o2.getName());
		return num1==0?num2:num1;
	}

}
