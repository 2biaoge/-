package com.qf.day14_1;

import java.util.Date;

import javax.xml.crypto.Data;

/*
 * Date时间类
 */
public class Demo1 {
	public static void main(String[] args) {
		//1创建时间对象
		//1.1表示当前时间
		Date date=new Date();
		System.out.println(date.toString());
		System.out.println(date.toLocaleString());
		//1.2表示2016-10-1 10:10:10;
		Date date2=new Date(123412312333L);
		System.out.println(date2.toLocaleString());
		//2比较两个时间的前后
		System.out.println(date.after(date2));
		System.out.println(date.before(date2));
		//3比较两个时间，返回1 或者-1 相同返回0
		System.out.println(date.compareTo(date2));
		System.out.println(date2.compareTo(date));
		//4返回某个时间的毫秒数
		System.out.println(date.getTime());
		
	}
}
