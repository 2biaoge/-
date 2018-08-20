package com.qf.day12_1;



/*
 * 定义一个类
 */
public class Outer {

	int num=10;
	String name="阿福";
	
	public void show(){
		System.out.println("外部类的num:"+num);
	}
	//添加一个类,成员内部类，
	//1 前面访问修饰符public protected [default] private
	//2 在成员内部类中可以直接调用外部类的成员变量和方法
	//3 当成员内部类中属性和外部类中属性名称相同，内部类优先级高,如果想调用外部类的属性，外部类名称.this.属性名
	//4 成员内部类中不能添加静态成员
	class Inner{
		//内部类中成员变量
	    int num2=20;
		String name="阿毛";
		public void print(){
			System.out.println("成员内部类:num2:"+num2);
			show();
			System.out.println("成员内部类中调用外部类的num:"+num);
			System.out.println(this.name);//
			System.out.println(Outer.this.name); //
		}
		
	}
}
