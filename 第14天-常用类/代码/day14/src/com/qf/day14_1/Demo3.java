package com.qf.day14_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/*
 * SimpleDateFormat
 * 用于格式化时间，实现时间和字符串之间的转换
 */
public class Demo3 {
	public static void main(String[] args) throws Exception{
		//1把字符转换成时间  "2016-10-10"
		String str="2016-10-10 12:10:5"; // yyyy-MM-dd HH:mm:ss
		//2pattern  时间模式
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//3转换
		Date date=df.parse(str);
		System.out.println(date.toLocaleString());
		
		//2时间转成字符  ,符合一定模式   xxxx年xx月xx日  xx时xx分xx秒
		
		DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
		System.out.println(df2.format(date));
		//3xxxx/xx/xx
		DateFormat df3=new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(df3.format(date));
		
		//4SimpleDateFormat其他方法
		Calendar calendar=df3.getCalendar();
		System.out.println(calendar.getTime());
		
		
	}
}
