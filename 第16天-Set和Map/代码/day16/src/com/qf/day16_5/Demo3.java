package com.qf.day16_5;

import java.util.HashMap;

/*
 * HashMap集合的使用
 * 1 使用学生对象作为key,使用地址作为value
 * 2 如果学生姓名和地址一样，则认为是同一个学生。
 */
public class Demo3 {
	public static void main(String[] args) {
		HashMap<Student, String> hashMap=new HashMap<Student,String>();
		Student s1=new Student("aaa", "北京昌平沙河");
		Student s2=new Student("bbb", "北京海淀");
		Student s3=new Student("ccc", "北京朝阳");
		Student s4=new Student("ddd", "北京大兴");
		Student s5=new Student("ddd", "北京大兴");
		
		hashMap.put(s1, s1.getAddress());
		hashMap.put(s2, s2.getAddress());
		hashMap.put(s3, s3.getAddress());
		hashMap.put(s4, s4.getAddress());
		hashMap.put(s5, s5.getAddress());
		hashMap.put(null, null);
		System.out.println("长度:"+hashMap.size());
		System.out.println(hashMap);
		
	}
}
