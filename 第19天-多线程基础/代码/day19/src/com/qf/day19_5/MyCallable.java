package com.qf.day19_5;

import java.util.concurrent.Callable;


/*
 * 定义一个类实现Callable接口
 */
public class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=1;i<=100;i++){
			Thread.sleep(100);
			sum+=i;
		}
		System.out.println("子线程执行了........."+Thread.currentThread().getName());
		//System.out.println("子线程执行了........."+Thread.currentThread().getName());
		return sum;
	}

}
