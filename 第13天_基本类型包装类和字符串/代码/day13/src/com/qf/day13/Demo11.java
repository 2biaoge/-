package com.qf.day13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 正则表达式
 * RegEx
 * Regular Expression 
 */
public class Demo11 {
	public static void main(String[] args) {
		//1手机号 ^1[3578]\d$
		String phone="15838383838";
		boolean b=phone.matches("^1[3578]\\d{9}$");
		System.out.println(b);
		//2判断qq邮箱  [1-9]\d{5,10}@[qQ]{2}\.com
		String qq="1312412@qQQ.com";
		boolean b2=qq.matches("[1-9]\\d{5,10}@[qQ]{2}\\.com");
		System.out.println(b2);
		
		//3拆分
		//String con="我      爱    编          程 ";
		String con2="我.爱.编 .程 ";
		
		//String[] strs=con.split(" +");
		String[] strs=con2.split("\\.");
		System.out.println(strs.length);
		for (String string : strs) {
			System.out.println(string);
		}
		
		
		
		//Pattern类
		//1创建Patter对象
		Pattern p=Pattern.compile("1[3578]\\d{9}");
		//2创建匹配器
		Matcher matcher=p.matcher("178412424222");
		//p.matcher("18924123213");
		//3匹配
		boolean r=matcher.matches();
		System.out.println(r);
		//一步到位
		boolean r2=Pattern.matches("1[3578]\\d{9}", "17841242422");
		System.out.println(r2);
	}
}
