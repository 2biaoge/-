package com.qf.day10;
/*
 * 内存分配
 */
public class Demo5 {
	public static void main(String[] args) {
		//1创建数组
		Student s1=new Student("zhangsan",20);
		Student s2=new Student("lisi",22);
		Student s3=new Student("wangwu",24);
		
		Student[] stus={s1,s2,s3};
		
		Student s4=stus[0];
		s4.setAge(30);
		
		//System.out.println(s1.getName()+"..."+s1.getAge());
		
		//1for遍历数组
		for(int i=0;i<stus.length;i++){
			Student s=stus[i];
			System.out.println(s.getName()+"..."+s.getAge());
		}
		//2增强for遍历数组
		for(Student s:stus){
			System.out.println(s.getName()+"..."+s.getAge());
		}
	}
}
