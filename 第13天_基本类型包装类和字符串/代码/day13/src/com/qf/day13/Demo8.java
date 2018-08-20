package com.qf.day13;
/*
 * 已知String str = "this is a text";
		1.将str中的单词单独获取出来
		2.将str中的text替换为practice
		3.在text前面插入一个easy
		4.将每个单词的首字母改为大写
 */
public class Demo8 {
	public static void main(String[] args) {
		String str="this is a text";
		//1拆分str，返回数组
		String[] strs=str.split(" ");
		for(int i=0;i<strs.length;i++){
			//替换
			if(strs[i].equals("text")){
				strs[i]="practice";
			}
			
			char c=strs[i].charAt(0); //a  -32 A
			String n=strs[i].replaceFirst(String.valueOf(c), String.valueOf((char)(c-32)));
			System.out.println(n);
			
			System.out.println(strs[i]);
		}
		
		//2将str中的text替换为practice
		String result=str.replace("text", "practice");
		System.out.println(result);
		
		//3.在text前面插入一个easy
		String result2=str.replace("text", "easy text");
		System.out.println(result2);
		
	}
}
