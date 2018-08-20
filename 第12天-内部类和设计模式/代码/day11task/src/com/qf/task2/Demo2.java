package com.qf.task2;
/*
 * 3.求一个3*3矩阵对角线元素之和
 */
public class Demo2 {
	public static void main(String[] args) {
		int[][] matrix={{10,20,30},{5,6,8},{15,30,55}};
		int sum=0;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(i+j==matrix.length-1){
					sum+=matrix[i][j];
				}
				
//				if(i==j){
//					sum+=matrix[i][j];
//				}
			}
		}
		System.out.println(sum);
	}
}
