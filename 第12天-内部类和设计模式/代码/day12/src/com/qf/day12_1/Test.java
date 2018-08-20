package com.qf.day12_1;

public class Test {
	public static void main(String[] args) {
		//1创建外部类Outer对象
//		Outer outer=new Outer();
//		outer.show();
		//2创建内部类对象
		//2.1创建外部类对象
		Outer outer2=new Outer();
		//2.2创建内部类对象
		Outer.Inner inner=outer2.new Inner();
		//3一步完成内部类的创建
		Outer.Inner inner2=new Outer().new Inner();
		inner2.print();
	}
}
