package com.qf.day10;
/*
 * demo
 */
public class Demo1 {
	public static void main(String[] args) {
		int n=10;
		String s="beijing";
		//1声明数组
		int[] nums;//声明数组，推荐写法 ，声明int类型数组，表示数组的元素是int
		int nums2[];//声明数组
		String[] strs;//声明数组， 声明String类型数组，表示数组的每个元素是String类型
		Student[] stus;//声明数组，声明Student类型数组，表示数组的每个元素是Student类型
		
		//2数组初始化
		//2.1静态初始化：声明数组的同时，赋值每个元素数据，长度不需要指定，由系统自动计算
		int[] aaa=new int[]{10,20,30};//长度3 //每个元素必须是相同的类型int
		int[] bbb={100,200,300,400,500};//长度5 每个元素必须是相同的类型int
		
		String[] country={"中国","美国","泰国","新加坡"};//长度4 ，每个元素都是String 
		//注意：在使用简写静态初始化数组时，必须一条语句完成，不能分割成两条语句
		
		//2.2动态初始化，初始值(byte short int 默认值 0 long 默认值0L char 默认值0  boolean 默认值false float 0.0f  double 0.0  )
		// 引用类型默认值 null
		int[] arr=new int[5];//初始化数组，指定长度为5，并给每个元素赋值为默认值  0
		String[] stuNames=new String[3]; //初始化数组，指定长度是3，并给每个元素赋值为默认值  null
		//2.3动态初始化后赋值,使用下标(下标最大值是长度-1)
		arr[0]=100;//给数组的第一个元素赋值为100
		arr[1]=200;//给数组的第二个元素赋值为200
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		
		stuNames[0]="zhangsan";
		stuNames[1]="lisi";
		stuNames[2]="wangwu";
		
		System.out.println(stuNames[1]);
		//2.4打印数组的个数 length属性
		System.out.println(stuNames.length);
		System.out.println(arr.length);
		
		//2.5修改元素的值
		int num=arr[4]; //把数组中第5个元素，赋值给num
		System.out.println(num);
		num=3;
		System.out.println(num);
		System.out.println(arr[4]);

		arr[4]=8; //修改arr[4]的值为8；
		System.out.println(arr[4]);
		
	}
}
