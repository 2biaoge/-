package com.qf.task;

import java.util.Arrays;

/*
 * 3.给定一个整型数组，数组成员10个,求该数组中第二大的数的下标
 */
public class Task3 {
	public static void main(String[] args) {
		int[] a={100,50,55,3,8,9,99};
		//1查找第二大的数
		//1.1copy数组
		int[] b=Arrays.copyOf(a, a.length);
		//1.2排序
		Arrays.sort(b);
		int num=b[b.length-2];
		//2查找
		int index=getIndex(a, num);
		System.out.println(num+"的下标是:"+index);
	}
	
	public static int getIndex(int[] arr,int key){
		for(int i=0;i<arr.length;i++){
			if(key==arr[i]){
				return i;
			}
		}
		return -1;
	}
}
