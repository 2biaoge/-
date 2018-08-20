// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Week.java

package com.qf.day14_2;


public final class Week extends Enum
{

	public static final Week MONDAY;
	public static final Week TUESDAY;
	public static final Week WEDNESDAY;
	public static final Week THURSDAY;
	public static final Week FRIDAY;
	public static final Week SATERDAY;
	public static final Week SUNDAY;
	private static final Week ENUM$VALUES[];

	private Week(String s, int i)
	{
		super(s, i);
	}

	public static Week[] values()
	{
		Week aweek[];
		int i;
		Week aweek1[];
		System.arraycopy(aweek = ENUM$VALUES, 0, aweek1 = new Week[i = aweek.length], 0, i);
		return aweek1;
	}

	public static Week valueOf(String s)
	{
		return (Week)Enum.valueOf(com/qf/day14_2/Week, s);
	}

	static 
	{
		MONDAY = new Week("MONDAY", 0);
		TUESDAY = new Week("TUESDAY", 1);
		WEDNESDAY = new Week("WEDNESDAY", 2);
		THURSDAY = new Week("THURSDAY", 3);
		FRIDAY = new Week("FRIDAY", 4);
		SATERDAY = new Week("SATERDAY", 5);
		SUNDAY = new Week("SUNDAY", 6);
		ENUM$VALUES = (new Week[] {
			MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATERDAY, SUNDAY
		});
	}
}
