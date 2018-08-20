package com.qf.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo3 {
	public static void main(String[] args) {
		
			Set<Student> set=new HashSet<Student>();
			//添加
			Student stu1=new Student("liangliang",20);
			Student stu2=new Student("honghong",22);
			Student stu3=new Student("mingming",23);
			set.add(stu1);
			set.add(stu2);
			set.add(stu3);
			System.out.println(set);
			//删除
			//set.remove(new Student("liangliang",20));
			System.out.println(set);
			//遍历
			Iterator<Student> iterator = set.iterator();
			while(iterator.hasNext()){
				Student s=iterator.next();
				System.out.println(s.toString());
			}
		
	}
}
