package com.qf.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 1>创建一个List，在List中增加三个工人，基本信息如下： 
	姓名 年龄 工资 
	zhang3 18 3000 
	li4 25 3500 
	wang5 22 3200 
 */
public class Task1 {
	public static void main(String[] args) {
		//1创建一个List，在List中增加三个工人，基本信息如下： 
//		姓名 年龄 工资 
//		zhang3 18 3000 
//		li4 25 3500 
//		wang5 22 3200 
		List<Worker> workers=new ArrayList<Worker>();
		workers.add(new Worker("工人1", 20,30000));
		workers.add(new Worker("工人2", 25,50000));
		workers.add(new Worker("工人3", 22,80000));
		
		System.out.println("---------foreach-------");
		//遍历  foreach
		for (Worker worker : workers) {
			System.out.println(worker.toString());
		}
		
		//迭代器
		System.out.println("---------迭代器-------");
		Iterator<Worker> it=workers.iterator();
		while(it.hasNext()){
			Worker worker = it.next();
			System.out.println(worker.toString());
		}
		
		//2在li4之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300 
		
		Worker worker=new Worker("赵六", 24, 33000);
		workers.add(1, worker);
		System.out.println("---------添加赵六之后-------");
		for (Worker w : workers) {
			System.out.println(w.toString());
		}
		
		//3删除工人3
		workers.remove(3);
		System.out.println("---------删除工人3之后-------");
		for (Worker w : workers) {
			System.out.println(w.toString());
		}
		
		//4判断是否存在
		boolean b=workers.contains(new Worker("赵六", 24, 33000));
		System.out.println(b);
	}
}
