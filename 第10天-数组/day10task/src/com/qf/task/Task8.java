package com.qf.task;

import java.util.Arrays;

/*
 * 8.提取一个方法，将指定数组中的数组元素进行反转
 */
public class Task8 {
	public static void main(String[] args) {
		int[] a={10,8,6,20,30,40};
//		int[] b=reverse(a);
//		System.out.println(Arrays.toString(b));
		reverse2(a);
		System.out.println(Arrays.toString(a));
	}
	//反转数组
	public static int[] reverse(int[] arr){
		int[] b=new int[arr.length];
		for(int i=0,j=b.length-1;i<arr.length;i++,j--){
			b[j]=arr[i];
		}
		return b;
	}
	
	public static void reverse2(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
}
