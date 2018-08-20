/*
dog类继承Pet类
*/
package com.qf.day08;
public class Dog extends Pet{
	private String strain;
	public void setStrain(String strain){
		this.strain=strain;
	}
	public String getStrain(){
		return strain;
	}

	public void print(){
		int id=getId();
		String name=getName();
		int health=getHealth();
		int love=getLove();
		System.out.println("狗狗id:"+id+" 昵称:"+name+" 健康值:"+health+" 亲密度:"+love+" 品种:"+strain);
	}

	public void eat(){
		String name=getName();
		System.out.println(name+"大口吃狗粮....");
		//增加健康值
		int health=getHealth();
		setHealth(health+3);
	}
	//接球
	public void catchBall(){
		String name=getName();
		System.out.print(name+"玩接球游戏....");
		int health=getHealth();
		setHealth(health-3);
	}


}