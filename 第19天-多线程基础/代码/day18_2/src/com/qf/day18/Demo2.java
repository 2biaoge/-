package com.qf.day18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/*
 * 反序列化
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		//1创建对象输入流
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:\\cars.bin"));
		//2读取
//		Car c1=(Car)ois.readObject();
//		Car c2=(Car)ois.readObject();
//		Car c3=(Car)ois.readObject();
		List<Car> cars=(List<Car>) ois.readObject();
		
//		System.out.println(c1.toString());
//		System.out.println(c2.toString());
//		System.out.println(c3.toString());
		for (Car car : cars) {
			System.out.println(car.toString());
		}
		//3关闭
		ois.close();
	}
}
