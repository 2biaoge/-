package com.qf.day14_1;
/*
 * Runtime类
 * 运行时
 */
public class Demo8 {
	public static void main(String[] args) throws Exception{
		//1获取当前应用程序的运行时
		Runtime runtime=Runtime.getRuntime();
		//2availableProcessors() 
		System.out.println(runtime.availableProcessors());
		//3执行一个cmd命令
//		Process process=runtime.exec("notepad");
//		System.out.println("五秒钟后关闭记事本");
//		Thread.sleep(3000);
//		process.destroy();//销毁
		
		//4退出jvm虚拟机
		//runtime.exit(0);
		//5获取空闲内存量 
		System.out.println(runtime.freeMemory()/1024/1024);
		//6返回内存总量totalMemory()
		System.out.println(runtime.totalMemory()/1024/1024);
		//7返回jvm可以使用的最大内存数
		System.out.println(runtime.maxMemory()/1024/1024);
	}
}
