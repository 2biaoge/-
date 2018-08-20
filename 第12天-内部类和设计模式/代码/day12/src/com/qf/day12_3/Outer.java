package com.qf.day12_3;
/*
 * 外部类
 */
public class Outer {
	int num=10;
	String name="阿福";
	static String country="中国";
	
	public  void show(){
		System.out.println(this.num);
		System.out.println(this.name);
		System.out.println(Outer.country);
	}
	public static  void show2(){
		Outer o=new Outer();
		System.out.println(o.num);
		System.out.println(o.name);
		System.out.println(Outer.country);
	}

	/*
	 * 静态内部类
	 * 1 只有内部类才能是静态的，这个类就叫静态内部类，和静态属性和静态方法同级
	 * 
	 */
	public static class Inner{
		int num2=20;
		String name="阿毛";
		static String address="东莞";
		
		public void  print(){
			System.out.println("num2:"+this.num2);
			System.out.println("name:"+this.name);
			System.out.println("address:"+Inner.address);
			//创建对象
			Outer o=new Outer();
			System.out.println(o.name);
			System.out.println(o.num);
			
		}
	}
}
