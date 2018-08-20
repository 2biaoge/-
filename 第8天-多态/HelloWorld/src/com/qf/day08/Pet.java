package com.qf.day08;
/*
 * alt+shift+s  选择生成get和set
 */
public class Pet {
	private String name;
	private int love;
	private int health;
	//alt+/
	public Pet() {
		// TODO Auto-generated constructor stub
	}
	
	
	//alt + shift +s  生成构造方法
	public Pet(String name, int love, int health) {
		super();
		this.name = name;
		this.love = love;
		this.health = health;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	
	
}
