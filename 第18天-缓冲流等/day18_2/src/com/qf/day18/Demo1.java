package com.qf.day18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/*
 * 序列化
 */
public class Demo1 {
	public static void main(String[] args) throws Exception{
		//1创建对象流
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:\\cars.bin",true));
		//2对象
		Car car1=new Car("宝马", "红色", 30);
		Car car2=new Car("保时捷", "蓝色", 150);
		Car car3=new Car("法拉利","红色",300);
		
		List<Car> cars=new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
//		
//		oos.writeObject(car1);
//		oos.writeObject(car2);
//		oos.writeObject(car3);
		oos.writeObject(cars);
		//3关闭
		oos.close();
		System.out.println("序列化成功");
	}
}
