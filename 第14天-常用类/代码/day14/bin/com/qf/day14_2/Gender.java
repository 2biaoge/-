// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Gender.java

package com.qf.day14_2;


public final class Gender extends Enum
{

	public static final Gender MALE;
	public static final Gender FEMALE;
	private String value;
	private static final Gender ENUM$VALUES[];

	private Gender(String s1, int i, String s)
	{
		super(s1, i);
		value = s;
	}

	public String getValue()
	{
		return value;
	}

	public static Gender[] values()
	{
		Gender agender[];
		int i;
		Gender agender1[];
		System.arraycopy(agender = ENUM$VALUES, 0, agender1 = new Gender[i = agender.length], 0, i);
		return agender1;
	}

	public static Gender valueOf(String s)
	{
		return (Gender)Enum.valueOf(com/qf/day14_2/Gender, s);
	}

	static 
	{
		MALE = new Gender("MALE", 0, "ÄÐ");
		FEMALE = new Gender("FEMALE", 1, "Å®");
		ENUM$VALUES = (new Gender[] {
			MALE, FEMALE
		});
	}
}
