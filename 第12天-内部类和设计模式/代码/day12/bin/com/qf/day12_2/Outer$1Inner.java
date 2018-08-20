// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Outer.java

package com.qf.day12_2;

import java.io.PrintStream;

// Referenced classes of package com.qf.day12_2:
//			Outer

class Outer$1Inner
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
		System.out.println(val$address);
		System.out.println(val$age);
	}

	Outer$1Inner()
	{
		this$0 = final_outer;
		val$address = s;
		val$age = I.this;
		super();
		num2 = 20;
		name = "°¢Ã«";
	}
}
