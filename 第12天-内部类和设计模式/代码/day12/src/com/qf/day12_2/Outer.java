package com.qf.day12_2;

public class Outer {
	int num=10;
	String name="阿福";
	
	public void show(){
		 String address="beijing";
		 int age=30;
		//1 局部内部类 和局部变量同级，不能使用任何访问修饰符
		//2 如果局部内部类中访问局部变量，必须是常量，jdk1.8之后，不需要手工添加final
	    class Inner{
			int num2=20;
			String name="阿毛";
			//String address="nanjing";
			public void print(){
				System.out.println("num2:"+num2);
				System.out.println("num:"+num);
				System.out.println(name);
				System.out.println(Outer.this.name);
				System.out.println(address);
				System.out.println(age);
			}
		}
		
	    //2创建局部内部类对象
	    Inner inner=new Inner();
	    inner.print();
	    
	    
	    
	}
	
	
}
