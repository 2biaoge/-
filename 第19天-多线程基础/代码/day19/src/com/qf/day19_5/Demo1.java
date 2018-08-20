package com.qf.day19_5;

import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Demo1 {
	public static void main(String[] args) throws Exception{
		//1创建Mycallable对象(可调用的)
		MyCallable callable=new MyCallable();
		//2创建一个任务（就是一个线程）实现Runable接口
		FutureTask<Integer> task=new FutureTask<Integer>(callable);
		//3创建线程对象
		Thread thread=new Thread(task);
		//4启动
		thread.start();
		//5获取返回值
		Integer sum=task.get();//会等待子线程执行完毕，返回结果
		System.out.println(sum);
		
	}
}
