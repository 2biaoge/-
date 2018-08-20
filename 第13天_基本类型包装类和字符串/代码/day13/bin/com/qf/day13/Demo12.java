// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Demo12.java

package com.qf.day13;


public class Demo12
{

	public Demo12()
	{
	}

	public static void main(String args[])
	{
		String s3 = "a";
		String s4 = "bc";
		String s5 = (new StringBuilder(String.valueOf(s3))).append(s4).toString();
	}
}
