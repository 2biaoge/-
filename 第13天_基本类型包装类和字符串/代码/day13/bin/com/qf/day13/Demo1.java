// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Demo1.java

package com.qf.day13;

import java.io.PrintStream;

public class Demo1
{

	public Demo1()
	{
	}

	public static void main(String args[])
	{
		int num = 20;
		Integer num2 = new Integer(150);
		Integer num3 = new Integer(150);
		Integer num4 = new Integer(20);
		System.out.println(num2 == num3);
		System.out.println(num == num4.intValue());
		Integer num5 = new Integer(127);
		Integer num6 = new Integer(127);
		System.out.println(num5 == num6);
		Integer num7 = Integer.valueOf(128);
		Integer num8 = Integer.valueOf(128);
		System.out.println(num7 == num8);
		Integer num9 = Integer.valueOf(127);
		Integer num10 = Integer.valueOf(127);
		System.out.println(num9 == num10);
	}
}
