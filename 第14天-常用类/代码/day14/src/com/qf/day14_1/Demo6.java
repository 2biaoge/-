package com.qf.day14_1;

import java.util.Arrays;
import java.util.Date;

/*
 * System类
 */
public class Demo6 {
	public static void main(String[] args) {
		//1 System.err
		//System.err.println("错误信息");
		//2 arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		//src 复制的源数组   srcPos 从源数组的哪个位置, dest 目标数组， destPos 目标数组的位置， length复制的长度
		int[] src={10,5,8,100,200,80,90};
		int[] dest=new int[src.length];
		System.arraycopy(src, 2, dest, 2, 2);
		System.out.println(Arrays.toString(dest));
		//3 currentTimeMillis()  获取过去了多少毫秒 ，从1970开始
		System.out.println(new Date(System.currentTimeMillis()).toLocaleString());
		
	}
}
