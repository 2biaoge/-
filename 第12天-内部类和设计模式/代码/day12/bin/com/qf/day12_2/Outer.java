// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Outer.java

package com.qf.day12_2;

import java.io.PrintStream;

public class Outer
{

	int num;
	String name;

	public Outer()
	{
		num = 10;
		name = "°¢¸£";
	}

	public void show()
	{
		final String address = "beijing";
		final int age = 30;
		class 1Inner
		{

			int num2;
			String name;
			final Outer this$0;
			private final String val$address;
			private final int val$age;

			public void print()
			{
				System.out.println((new StringBuilder("num2:")).append(num2).toString());
				System.out.println((new StringBuilder("num:")).append(num).toString());
				System.out.println(name);
				System.out.println(Outer.this.name);
				System.out.println(address);
				System.out.println(age);
			}

			1Inner()
			{
				this$0 = Outer.this;
				address = s;
				age = i;
				super();
				num2 = 20;
				name = "°¢Ã«";
			}
		}

		1Inner inner = new 1Inner();
		inner.print();
	}
}
