package com.qf.day11;
/*
 * 二维数组的使用
 */
public class Demo1 {
	public static void main(String[] args) {
		//1声明二维数组
		//1.1第一中方式
		int[][] nums;
		//1.2第二种方式
		int nums2[][];
		
		//2初始化 
		//2.1静态初始化
		int[][] nums3=new int[][]{{2,4},{8,10,12},{1,3,5,7,9}};
		//简写(必须一条语句完成，不能分割s)
		int[][] nums4={{1,2},{3,4,5},{6,7,8,9}};
		
		//2.2动态初始化
		//2.2.1只指定外面的元素个数
		int[][] nums5=new int[3][];
		nums5[0]=new int[]{2,3};
		nums5[1]=new int[]{10,20,30};
		nums5[2]=new int[]{100};
		
		//2.2.2二维的长度都指定
		int[][] nums6=new int[2][3];
		
		//3访问数组
		
		//3.1打印二维数组的长度
		//3.1.1一维数组的长度
		System.out.println(nums6.length);
		//3.1.2二维数组的长度
		System.out.println(nums6[0].length);
		System.out.println(nums6[1].length);
		//3.2 赋值
		//3.2.1使用下标赋值
		nums6[0][0]=10;
		nums6[0][1]=20;
		nums6[0][2]=30;
		
		nums6[1][0]=100;
		nums6[1][1]=200;
		nums6[1][2]=300;
		//3.2.2使用循环赋值
		for(int i=0;i<nums6.length;i++){
			for(int j=0;j<nums6[i].length;j++){
				nums6[i][j]=(int)(Math.random()*100)+1;
			}
		}
		
		//3.3遍历
		for(int i=0;i<nums6.length;i++){
			for(int j=0;j<nums6[i].length;j++){
				System.out.print(nums6[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		//3.4使用增强for
		for(int[] n:nums6){
			for(int i:n){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}
