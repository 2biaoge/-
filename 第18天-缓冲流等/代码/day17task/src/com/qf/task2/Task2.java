package com.qf.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.naming.InitialContext;



/*
 * 在控制台输入一句英语， 获得每个字母出现的次数，注：每个字符作为key，出现的次数作为value
 */
public class Task2 {
	public static void main(String[] args) {
		HashMap<Character, Integer> hashMap=new HashMap<Character,Integer>();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一句英语");
		String yingyu=input.nextLine();// I am a student, I love java!
		//1处理空格
		String s1=yingyu.replaceAll(" ", "");
		System.out.println(s1);
		//2处理
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
		
			//每个字符出现的次数
			int index=s1.indexOf(c);
			int count=0;
			while(index>-1){
				count++;
				index=s1.indexOf(c, index+1);
				
			}
			hashMap.put(c, count);
			
		}
		
		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+"----->"+entry.getValue());
		}
		
		
		
	}
}
