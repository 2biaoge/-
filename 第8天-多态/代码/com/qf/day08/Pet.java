/*
宠物类
*/
package com.qf.day08;
public class Pet{
	private int id; //id 宠物编号
	private String name;// 宠物昵称
	private int health;// 健康值
	private int love;// 亲密度

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setHealth(int health){
		this.health=health;
	}
	public int getHealth(){
		return health;
	}
	public void setLove(int love){
		this.love=love;
	}	
	public int getLove(){
		return love;
	}

	//方法
	public void print(){
		System.out.println("宠物id:"+this.id+",宠物昵称:"+this.name+",健康值:"+health+",亲密度:"+love);
	}

	public void eat(){
		System.out.println(name+"宠物吃食物.....");
	}

	
}