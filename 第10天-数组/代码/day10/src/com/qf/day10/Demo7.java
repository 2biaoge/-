package com.qf.day10;
/*
 * 排序算法
 */
public class Demo7 {
	public static void main(String[] args) {
		//bubbleSort();
		selectSort2();
	}
	//冒泡排序 （n个数字来排列，两两比较小靠前，外层循环n-1,内层循环n-1-i）
	public static void bubbleSort(){
		int[] arr={23,8,15,30,6};
		System.out.println("排序之前....");
		for(int n:arr){
			System.out.print(n+" ");
		}
		//排序    
		for(int i=0;i<arr.length-1;i++){ 
			System.out.println("第"+(i+1)+"轮");
			for(int j=0;j<arr.length-1-i;j++){
				System.out.println("第"+(j+1)+"次比较");
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\n排序之后....");
		for(int n:arr){
			System.out.print(n+" ");
		}
		
	}
	/*
	 * 选择排序(低效)
	 */
	public static void selectSort(){
		int[] arr={23,8,15,30,6};
		System.out.println("排序之前....");
		for(int n:arr){
			System.out.print(n+" ");
		}
		
		for(int i=0;i<arr.length-1;i++){//i=0 ,  i=1 
			for(int j=i+1;j<arr.length;j++){ //j=1 j<5 ,  j=1 2 3 4   j=2  j<5   j 2 3 4
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		System.out.println("\n排序之后....");
		for(int n:arr){
			System.out.print(n+" ");
		}
	}
	/*
	 * 选择排序(高效)
	 */
	public static void selectSort2(){
		int[] arr={23,8,15,30,6};
		System.out.println("排序之前....");
		for(int n:arr){
			System.out.print(n+" ");
		}
		
		for(int i=0;i<arr.length-1;i++){
			int k=i;//假如k是最小的
			for(int j=i+1;j<arr.length;j++){ //j=1 j<5 ,  j=1 2 3 4   j=2  j<5   j 2 3 4
				if(arr[k]>arr[j]){
					k=j;//k指向的最小的
				}
			}
			if(k!=i){
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
		}
		System.out.println("\n排序之后....");
		for(int n:arr){
			System.out.print(n+" ");
		}
	}
	
}
