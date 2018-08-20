package com.qf.task;

import java.util.Arrays;

/*
 * 3.有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中
 */
public class Task12 {
	public static void main(String[] args) {
		int[] a={10,2,30,5,100,89,50};
		//排序
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		//添加
		int[] b=insertArray(a, 8);
		System.out.println(Arrays.toString(b));
	}
	public static int[] insertArray(int[] arr,int key){
		int[] newarr=Arrays.copyOf(arr, arr.length+1);
		
		for(int i=newarr.length-2;i>=0;i--){
			if(newarr[i]>key){
				newarr[i+1]=newarr[i];
			}else{
				newarr[i+1]=key;
				break;//跳出循环
			}
		}
		
		return newarr;
	}
}
