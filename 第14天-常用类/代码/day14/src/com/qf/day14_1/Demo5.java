package com.qf.day14_1;

import java.util.Random;

/*
 * Random()随机数类
 * 伪随机数
 */
public class Demo5 {
	public static void main(String[] args) {
		//1伪随机数对象(48位种子，根据时间生成)
		Random random=new Random();
		//2nextDouble(); 0-1之间随机数 含0不含1
		System.out.println(random.nextDouble());
		//3返回一个整数
		System.out.println(random.nextInt());
		//4返回0-99之间的整数
		System.out.println(random.nextInt(100));
		
		//5创建伪随机数对象(种子多少1234)
		Random random2=new Random(1234);
		Random random3=new Random(1234);
		
		System.out.println("----------------------");
		System.out.println(random2.nextDouble());
		System.out.println(random3.nextDouble());
		System.out.println(random2.nextDouble());
		System.out.println(random3.nextDouble());
		
	}
}
