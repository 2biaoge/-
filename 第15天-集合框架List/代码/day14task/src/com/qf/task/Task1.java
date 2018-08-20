package com.qf.task;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 使用Calendar完成一个万年历

要求：键盘输入一个年份和月份，控制台输出当月的日历

 */
public class Task1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个年份");
		int year=input.nextInt();
		System.out.println("请输入一个月份");
		int month=input.nextInt();
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, month-1, 1);
		int maxday=calendar.getActualMaximum(Calendar.DATE);
		//获取星期几
		int w=calendar.get(Calendar.DAY_OF_WEEK);
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<w;i++){
			sb.append("\t");
		}
		int count=w-1;
		for(int i=1;i<=maxday;i++){
			sb.append(i+"\t");
			count++;
			if(count==7){
				sb.append("\n");
				count=0;
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
