package com.qf.task;
/*
 * 1.定义一个函数，获取某个数组中的最小值
 */
public class Task1 {
	public static void main(String[] args) {
		int[] a={100,200,3,1,8,90,55};
		int min=getMin(a);
		System.out.println(min);
	}
	public static int getMin(int[] arr){
		//1排序
		//2比较
		int m=arr[0];//假如第一个是最小的
		
		for(int i=1;i<arr.length;i++){
			if(m>arr[i]){
				m=arr[i];
			}
		}
		return m;
	}
}
