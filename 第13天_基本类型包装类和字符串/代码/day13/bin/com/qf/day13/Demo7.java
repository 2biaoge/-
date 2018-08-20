// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Demo7.java

package com.qf.day13;

import java.io.PrintStream;

public class Demo7
{

	public Demo7()
	{
	}

	public static void main(String args[])
	{
		String str = "hello";
		System.out.println(str.equals("hello"));
		String str2 = new String("hello");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		String str3 = "Hello";
		System.out.println(str3.equalsIgnoreCase(str));
		String con = "我爱北京天安门,天安门上太阳升,太阳啊,太阳啊";
		String con1 = con.replace("太阳", "月亮");
		System.out.println(con1);
		String sub = con.substring(0, 4);
		System.out.println(sub);
		String sub2 = con.substring(4, 7);
		System.out.println(sub2);
		String filename = "file.txt";
		String ext = filename.substring(filename.lastIndexOf(".") + 1);
		System.out.println(ext);
		String address = "    北京市昌平区           沙河老牛湾       ";
		String address2 = address.trim();
		String address3 = address2.replace(" ", "");
		System.out.println(address3);
		System.out.printf("%s", new Object[] {
			"ajfiwef"
		});
		String format = String.format("%.2f-----%b-----%s", new Object[] {
			Float.valueOf(3.1416F), Boolean.valueOf(true), "hello"
		});
		System.out.println(format);
		String a = "h";
		String b = "W";
		int r = a.compareTo(b);
		System.out.println(r);
		String pin1 = "hello";
		String pin2 = "你好";
		String pin3 = pin1.concat(pin2);
		String pin4 = (new StringBuilder(String.valueOf(pin1))).append(pin2).toString();
		System.out.println(pin3);
	}
}
