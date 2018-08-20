// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Teacher.java

import java.io.PrintStream;

public class Teacher
{

	String name;
	int age;
	int workYear;

	public Teacher()
	{
	}

	public void work()
	{
		System.out.println((new StringBuilder()).append(name).append("开始上课.....").toString());
	}

	public void remember()
	{
		System.out.println((new StringBuilder()).append(name).append("开始认识学生").toString());
		Student student = new Student();
		student.name = "范伟";
		student.age = 20;
		student.hobby = "讲段子";
		student.introduce();
		student.dance();
		student.sing();
		student.lie();
	}
}
