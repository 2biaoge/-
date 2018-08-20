package com.qf.day18_6;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * 使用ObjectInputStream
 * 
 */
public class Demo2 {
	public static void main(String[] args) throws Exception{
		//1创建ObjectInputStream
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:\\stu.bin"));
		//2读取
		Student stu=(Student)ois.readObject();
		System.out.println(stu.toString());
		System.out.println(Student.country);
		//3关闭
		ois.close();
		System.out.println("反序列化");
	}
}
