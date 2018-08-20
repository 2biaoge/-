package com.qf.day10;
/*
 * 查找
 */
public class Demo8 {
	public static void main(String[] args) {
		int r=sequenceSearch(87);
		if(r>-1){
			System.out.println("找到了:"+r);
		}else{
			System.out.println("没有找到");
		}
		
		//定义数组
		int[] a={10,8,5,100,200,80,90,1000,2,6};
		System.out.println("排序之前....");
		for (int i : a) {
			System.out.print(i+" ");
		}
		bubbleSort(a);
		System.out.println("\n排序之后....");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		int r2=binarySearch(a, 90);
		if(r2>-1){
			System.out.println("找到了..."+r2);
		}else{
			System.out.println("没找到了...");
		}
		
	}
	/*
	 * 返回找到元素下标，如果返回-1没有找到
	 */
	public static int sequenceSearch(int num){
		int[] arr={23,54,65,3,5,2,87};
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				return i;
			}
		}
		return -1;
	}
	/*
	 * 排序
	 */
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	//使用二分查找
	public static int binarySearch(int[] arr,int search){
		int low=0;
		int upper=arr.length-1;
		while(low<=upper){
			int mid=(low+upper)/2;
			if(search>arr[mid]){
				low=mid+1;
			}else if(search<arr[mid]){
				upper=mid-1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	
}
