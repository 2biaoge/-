/*
猫类
*/
package com.qf.day08;
public class Cat extends Pet{
	private String hobby;
	public void setHobby(String hobby){
		this.hobby=hobby;
	}
	public String getHobby(){
		return hobby;
	}

	public void print(){
		int id=getId();
		String name=getName();
		int health=getHealth();
		int love=getLove();
		System.out.println("猫咪id:"+id+" 昵称:"+name+" 健康值:"+health+" 亲密度:"+love+" 爱好:"+hobby);
	}

	public void eat(){
		String name=getName();
		System.out.println(name+"大口吃小鱼....");
		//增加健康值
		int health=getHealth();
		setHealth(health+5);
	}

	public void hideAndSeek(){
		String name=getName();
		System.out.println(name+"玩捉迷藏...");
		int health=getHealth();
		setHealth(health-5);
	}
}