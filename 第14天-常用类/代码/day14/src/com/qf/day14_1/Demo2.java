package com.qf.day14_1;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar
 * 
 * "2016-10-10"
 * "2016-10-10 10:10:10"
 */
public class Demo2 {
	public static void main(String[] args) {
		//1创建日历对象
		Calendar calendar=Calendar.getInstance();
		//System.out.println(calendar);
		
		//2获取当前是哪一年
		int year=calendar.get(Calendar.YEAR);
		System.out.println(year);
		//3获取月(0-11 )
		int month=calendar.get(Calendar.MONTH);
		System.out.println(month+1);
		//4获取日
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		//小时 分钟 秒
		int hour=calendar.get(Calendar.HOUR);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);
		System.out.println(hour+":"+minute+":"+second);
		
		//表示2016-10-1 10:10:10;
		
		Calendar calendar2=Calendar.getInstance();
		calendar2.set(2016, 9, 1, 10, 10, 10);
		Date date=calendar2.getTime();
		System.out.println(date.toLocaleString());
		
		
	}
}
