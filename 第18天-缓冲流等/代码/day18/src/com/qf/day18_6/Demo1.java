package com.qf.day18_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * 使用对象流
 * Serializable
 */
public class Demo1 {
	public static void main(String[] args) throws Exception {
		//1创建对象输出流 bin  binary二进制
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:\\stu.bin"));
		//2创建学生对象
		Student zhangsan=new Student("李四", 30);
		Student.country="韩国";
		//3保存对象
		oos.writeObject(zhangsan);
		//4关闭
		oos.close();
		System.out.println("序列化成功");
		
	}
}
