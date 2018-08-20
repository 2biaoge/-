package com.qf.day15_5;

import java.util.Stack;

/*
 * Stack栈集合
 */
public class Demo2 {
	public static void main(String[] args) {
		//1创建对象
		Stack<String> stack=new Stack<String>();
		//2入栈
		stack.push("啤酒");
		stack.push("花生米");
		stack.push("羊肉串");
		stack.push("金针菇");
		stack.push("猪腰子");
		//3出栈
		System.out.println("出栈之前："+stack.size());
		for(int i=0;i<5;i++){
			System.out.println(stack.pop());
		}
		System.out.println("出栈之后:"+stack.size());
	}
}
