package com.qf.day20_5;
/*
 * 皇帝
 */
public class King {	
	//1私有化构造方法
	private King(){}
	//2创建对象
	private static King king;
	//3创建方法
	public static King getKing(){
		if(king==null){//提高性能
			synchronized (King.class) {//耗性能
				if (king == null) {
					king = new King();
				}
			}
		}
		return king;
	}
}
