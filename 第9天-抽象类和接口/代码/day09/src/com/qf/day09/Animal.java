package com.qf.day09;
//abstract 抽象
//1 如果一个类中有一个方法是抽象的，那么这个类必须是抽象的
//2 抽象类中可以包含抽象方法，也可以不包含
//3 抽象方法必须被子类重写，除非子类也是抽象类
//4 抽象类中可以包含构造方法 ，不能直接调用，可以被子类调用
public abstract class Animal {
	private int id;
	private String name;
	private int health;
	private int love;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	//变成抽象方法
	public abstract void print();
}
