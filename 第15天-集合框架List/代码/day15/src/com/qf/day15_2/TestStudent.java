package com.qf.day15_2;

public class TestStudent {
	public static void main(String[] args) {
		Student stu=new Student();
		//调用泛型方法的时候才知道类型
		stu.show("hello world");
		stu.show(20);
		stu.show(3.5);
		stu.show('a');
	}
}
