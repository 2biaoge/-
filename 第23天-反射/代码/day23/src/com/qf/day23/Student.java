package com.qf.day23;

public class Student {
	private String name;
	private int age;
	private String sex;
	private static String country;
	
	static{
		country="中国";
	}
	
	public Student() {
		System.out.println("默认构造方法执行了....");
	}
	public Student(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		System.out.println("带参构造方法执行了....");	
	}
	/*
	 * show方法
	 */
	public void show(){
		System.out.println("姓名:"+name+" 年龄:"+age+" 性别："+sex);
	}
	/*
	 * show方法
	 */
	public void show(String say){
		System.out.println(name+"说："+say);
	}
	/*
	 * 带返回值方法
	 */
	public String getInfo(){
		return "学生信息:"+name+" 年龄："+age+" 性别："+sex;
	}
	
	
	public static void print(){
		System.out.println("这是一个静态方法.............");
	}
	
	/*
	 * 私有方法
	 */
	private void sayHi(){
		System.out.println("这是一个私有方法");
	}
	
}
