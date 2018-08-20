package com.qf.task2;

import java.util.Arrays;

/*
 * 2.班上有3个学生，每个学生都参加了三门功课的考试，其中第二个学生是特长生，上级要求给他每门功课都+5.
 * 【要求：使用二维数组做，并且分别使用for循环和增强for循环遍历二维数组】
 */
public class Demo1 {
	public static void main(String[] args) {
		double[][] scores={{90,80,88},{70,55,60},{99,98,97}};
		
		System.out.println("加分之前:");
		for(int i=0;i<scores.length;i++){
			System.out.println(Arrays.toString(scores[i]));
		}
		
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				if(i==1){
					scores[i][j]+=5;
				}
			}
		}
		System.out.println("加分之后:");
	/*	for(int i=0;i<scores.length;i++){
			System.out.println(Arrays.toString(scores[i]));
		}*/
		for(double[] n :scores){
			System.out.println(Arrays.toString(n));
		}
	}
}
